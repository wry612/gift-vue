package cn.datai.gift.web.utils;

import cn.datai.gift.utils.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/6/9.
 */
public class BaseUtil {


    /**
     * 验证手机号
     * @param mobiles
     * @return
     */
    public static boolean isMobileNO(String mobiles){
        if(StringUtils.isEmpty(mobiles)){
            return false;
        }
        Pattern p = Pattern.compile("^(1)\\d{10}$");
        Matcher m = p.matcher(mobiles);
        return m.matches();
    }

    /**
     * 判断字符串是否为数字
     * @param str
     * @return
     */
    public static boolean isNumeric(String str){
        if(MyStringUtil.isBlank(str)){
            return false;
        }
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }


    /**
     * 红包唯一code加密
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String encodeGiftCode(String pwd) throws NoSuchAlgorithmException {
        SecureRandom sha1PRNG = SecureRandom.getInstance("SHA1PRNG");
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(5,sha1PRNG);
        String code = bCryptPasswordEncoder.encode(pwd);
        return org.apache.commons.codec.binary.Base64.encodeBase64String(code.getBytes());
    }

    /**
     * 红包唯一code加密
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String encodeGiftCode() throws NoSuchAlgorithmException {
        String uuid = UUID.randomUUID().toString();
        SecureRandom sha1PRNG = SecureRandom.getInstance("SHA1PRNG");
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(5,sha1PRNG);
        String code = bCryptPasswordEncoder.encode(uuid);
        return org.apache.commons.codec.binary.Base64.encodeBase64String(code.getBytes());
    }


    /**
     * 判断是否是ajax请求
     * @param request
     * @return
     */
    public static boolean isAjaxRequest(HttpServletRequest request) {
        if (request.getHeader("X-Requested-With") != null && "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString())) {
            return true;
        }else
            return false;
    }

    public static String getPath(HttpServletRequest request){
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName();
        if (request.getServerPort() != 80 && request.getServerPort() != 443) {
            basePath = basePath + ":" + request.getServerPort();
        }
        basePath = basePath + path + "/";
        return basePath;
    }

    /**
     * //验证祝福语只能含有中文数字字母
     * @param greeting 祝福语
     * @return
     */
    public static boolean checkSpecialCode(String greeting){
        if(StringUtils.isEmpty(greeting)){
            return true;
        }
        String regex="^[a-zA-Z0-9\u4E00-\u9FA5|[,，.。]]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match=pattern.matcher(greeting);
        return match.matches();
    }

    /**
     * 校验密码的正确性
     * @param pwd  原有密码
     * @param encodePwd 加密密码
     * @return
     */
    public static boolean matchPwd(String pwd,String encodePwd){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.matches(pwd,encodePwd);
    }

    /**
     * 密码加密
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String encodePwd(String pwd) throws NoSuchAlgorithmException {
        SecureRandom sha1PRNG = SecureRandom.getInstance("SHA1PRNG");
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(5,sha1PRNG);
        return bCryptPasswordEncoder.encode(pwd);
    }

    /**
     * 获取6位随机数字字符串
     * @return
     */
    public static String getRandomCode(){
        String str="0123456789";
        StringBuilder sb=new StringBuilder(6);
        for(int i=0;i<6;i++)
        {
            char ch=str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        return sb.toString();
    }

}
