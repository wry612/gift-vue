package cn.datai.gift.web.utils;

import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.Jedis;

/**
 * Created by zhangyutao on 2016/7/19.
 */
@SuppressWarnings("rawtypes")
public class RedisLock {

    RedisTemplate redisTemplate;
    Jedis jedis;
    String lockKey;
    long timeoutMsecs = 10* 1000;
    long expireMsecs = 10* 1000;
    boolean locked;

    public RedisLock(RedisTemplate redisTemplate, String lockKey) {
        this.locked = false;
        this.redisTemplate = redisTemplate;
        this.lockKey = lockKey;
    }

    public RedisLock(RedisTemplate redisTemplate, String lockKey, int timeoutMsecs, int expireMsecs) {
        this(redisTemplate, lockKey);
        this.timeoutMsecs = timeoutMsecs;
        this.expireMsecs = expireMsecs;
    }

    public RedisLock(Jedis jedis, String lockKey) {
        this.jedis = jedis;
        this.lockKey = lockKey;
        this.locked = false;
    }

    public RedisLock(Jedis jedis, String lockKey, int timeoutMsecs, int expireMsecs) {
        this(jedis, lockKey);
        this.timeoutMsecs = timeoutMsecs;
        this.expireMsecs = expireMsecs;
    }

    public String getLockKey() {
        return this.lockKey;
    }

    public boolean acquire() throws InterruptedException {
        long timeout = this.timeoutMsecs;
        while (timeout >= 0) {
            if(setNX()){
                return true;
            }
            timeout -= 100;
            Thread.sleep(100L);
        }
        return false;
    }

    private boolean setNX(){
        if(jedis != null) {
            if ("OK".equals(jedis.set(lockKey, "L", "NX", "PX", expireMsecs))) {
                this.locked = true;
                return true;
            } else {
                return false;
            }
        } else {
            return (boolean)redisTemplate.execute((RedisCallback<Boolean>) connection -> {
                if ("OK".equals(((Jedis) connection.getNativeConnection()).set(lockKey, "L", "NX", "PX", expireMsecs))) {
                    this.locked = true;
                    return true;
                }else{
                    return false;
                }
            });
        }
    }

    public void release() {
        if(locked) {
            if(jedis != null) {
                jedis.del(lockKey);
            } else {
                redisTemplate.delete(lockKey);
            }
            locked = false;
        }
    }
}
