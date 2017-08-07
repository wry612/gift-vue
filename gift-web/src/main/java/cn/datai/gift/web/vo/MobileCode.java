package cn.datai.gift.web.vo;

/**
 * Created by Administrator on 2017/6/13.
 */
public class MobileCode {

    private String code;

    private Long codeTime;

    private Long currentTime;

    private int countDown;

    public MobileCode(String code, Long codeTime, Long currentTime, int countDown) {
        this.code = code;
        this.codeTime = codeTime;
        this.currentTime = currentTime;
        this.countDown = countDown;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getCodeTime() {
        return codeTime;
    }

    public void setCodeTime(Long codeTime) {
        this.codeTime = codeTime;
    }

    public Long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
    }

    public int getCountDown() {
        return countDown;
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
    }
}
