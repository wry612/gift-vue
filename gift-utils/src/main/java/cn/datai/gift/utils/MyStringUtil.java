package cn.datai.gift.utils;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyStringUtil extends StringUtils {

    /**
     * 将对象转成string
     * @param obj
     * @return
     */
    public static String obj2Str(Object obj){
        if(null == obj){
            return "";
        }
        return obj.toString();
    }
    
    /**
     * 将字符串转成long
     */
    public static Long str2Long(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     * 将Long转字符串类型
     */
    public static String Long2str(Long longer) {
        if (null == longer) {
            return "";
        }
        return longer.toString();
    }

    /**
     * 将字符串转换Integer类型
     */
    public static Integer str2Integer(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     * 将Integer转字符串类型
     */
    public static String Integer2str(Integer interger) {
        if (null == interger) {
            return "";
        }
        return interger.toString();
    }

    /**
     * 将字符串转出double类型
     */
    public static Double str2Double(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Double.valueOf(str);
        } catch (Exception e) {
            return null;
        }
    }

    
    /**
     * 将字符串转成float类型
     */
    public static Float toFloat(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Float.valueOf(str);
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     * 将Interge转成short类型
     */
    public static Short interger2Short(Integer i){
        if(null == i){
            return null;
        }
        return Short.valueOf(i.toString());
    }
    
    /**
     * 将String转成short类型
     */
    public static Short str2Short(String str){
        if(StringUtils.isEmpty(str)){
            return null;
        }
        try {
            return Short.valueOf(str);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *将string转成 BigDecimal类型
     * @return
     */
    public static BigDecimal str2BigDecimal(String str){
        if(StringUtils.isEmpty(str)){
            return null;
        }
        try {
            return new BigDecimal(str);
        } catch (Exception e) {
            return null;
        }
    }
    
    /**
     *将BigDecimal转成 string类型
     * @return
     */
    public static String bigDecimal2Str(BigDecimal bigD){
        if(null == bigD){
            return "";
        }
        return bigD.toString();
    }
    
    /**
     *将double转成 BigDecimal类型
     * @return
     */
    public static BigDecimal double2BigDecimal(Double double1){
        if(null == double1){
            return null;
        }
        return BigDecimal.valueOf(double1);
    }
    
    /**
     *将BigDecimal转成 Integer类型
     * @return
     */
    public static Integer bigDecimal2Integer(BigDecimal bigDecimal){
        if(null == bigDecimal){
            return null;
        }
        return bigDecimal.intValue();
    }

    /**
     * 截取字符串最后几位
     */
    public static String getStrLast(String str,int num){
        int strLen = str.length();
        if(isEmpty(str) || strLen <num){
            return "";
        }
        if(num > 0){
            return str.substring(strLen-num, strLen);
        }
        return "";
    }
    
    /**
     * 数字string不满m位的前面补0
     * @return string
     */
    public static String getNumStrByLen(String strnum,int m){
        int numStrLen = strnum.length();
        StringBuffer sb = new StringBuffer();
        if(m > numStrLen){
            for(int i=0;i<(m-numStrLen);i++){
                sb.append("0");
            }
            sb.append(strnum);
            return sb.toString();
        }
        return strnum;
    }
    
    /**
     * 会员卡 16位最后一位数字的验证
     * */
    public static String createLuhnBit(String cardNo){
        int[] CI = new int[]{2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1};
        int i,d,result;
        int chk_dig=0;
        int length = cardNo.length();
        for ( i=0; i<length; i++ )
        {
            d = Integer.parseInt(cardNo.substring(length - i - 1, length - i));
            result = d * CI[i];
            chk_dig += result/10 + result%10;
        }
        chk_dig = 10 - chk_dig%10;
        chk_dig = (chk_dig==10) ? 0 : chk_dig;
        return cardNo+chk_dig;
    }
    
    /**
     * String类型补0  右边和左边补0
     * @param str
     * @param strLength
     * @return
     */
     public static String addZeroForNum(String str, int strLength) {
         int strLen = str.length();
         StringBuffer sb = null;
         while (strLen < strLength) {
               sb = new StringBuffer();
             //sb.append("0").append(str);// 左(前)补0
            sb.append(str).append("0");//右(后)补0
               str = sb.toString();
               strLen = str.length();
         }
         return str;
     }
        /**
         * String类型补*  右边和左边补0
         * @param str
         * @param strLength
         * @return
         */
         public static String addEndName(String str, int strLength) {
             int strLen = str.length();
             StringBuffer sb = null;
             while (strLen < strLength) {
                   sb = new StringBuffer();
                 //sb.append("0").append(str);// 左(前)补0
                sb.append(str).append("*");//右(后)补0
                   str = sb.toString();
                   strLen = str.length();
             }
             return str;
         }
        
     /**
      * String类型补0  右边和左边补0
      * @param str
      * @param strLength
      * @return
      */
     public static String addEndForNum(String str, int strLength) {
         int strLen = str.length();
         StringBuffer sb = null;
         while (strLen < strLength) {
               sb = new StringBuffer();
             sb.append("0").append(str);// 左(前)补0
               str = sb.toString();
               strLen = str.length();
         }
         return str;
     }

     /**
      * 去空格
      */
     public static String trimStr(String str){
         if(StringUtils.isEmpty(str)){
             return "";
         }
         return StringUtils.trim(str);
     }
     /**
         * 当遇到空字符串返回默认字符串.
         * @param s 元字符串
         * @param def 默认字符串
         * @return 元字符串为空时，返回默认字符串，否则返回元字符串。trim()
         */
        public static String nvl(String s, String def) {
            if (isEmpty(s)) {
                return def;
            }
            return s.trim();
        }

        /**
         * 字符串追加后缀.
         * @param from 原字符串
         * @param suffix 后缀字符串
         * @return 如果原字符串以后缀字符串结尾则直接返回原字符串，否则将后缀字符串添加在源字符串后边并返回
         */
        public static String addSuffix(String from, String suffix) {
            if (isBlank(from)) {
                return "";
            }
            String fr = from.trim();
            String suf = isBlank(suffix) ? "" : suffix.trim();
            if (fr.endsWith(suf)) {
                return fr.trim();
            } else {
                return fr + suf;
            }
        }

        /**
         * 判断字符串是否是整数（非数字字符串或超出Integer范围均为失败）.
         * @param num 整数字符串
         * @return true:整数字符串;false:正整数字符串
         */
        public static boolean isInt(String num) {
            if (isBlank(num)) {
                return false;
            }
            try {
                Integer.parseInt(num);
            } catch (Exception e) {
                return false;
            }
            return true;
//            String numPatten = "^(-)?(\\d)+$";
//            if (num.matches(numPatten)) {
//                return true;
//            }
//            return false;
        }

        /**
         * 判断字符串是否是正整数.
         * @param num 正整数字符串
         * @return true:正整数字符串;false:非正整数字符串
         */
        public static boolean isPInt(String num) {
            if (isBlank(num)) {
                return false;
            }
            String numPatten = "^\\d+$";
            if (num.matches(numPatten)) {
                return true;
            }
            return false;
        }

        /**
         * 将数字字符串转换成整数，转换失败返回null.
         * @param num 整数字符串
         * @return 整数对象
         */
        public static Integer parseInt(String num) {
            try {
                return new Integer(num);
            } catch (Exception e) {
                return null;
            }
        }

        /**
         * 将数字字符串转换成BigDecimal，转换失败返回null.
         * @param num BigDecimal字符串
         * @return BigDecimal对象
         */
        public static BigDecimal parseBigDecimal(String num) {
            try {
                return new BigDecimal(num);
            } catch (Exception e) {
                return null;
            }
        }

        /**
         * 判断字符串是否是Boolean值.
         * @param bool Boolean字符串
         * @return true:是Boolean字符串;false:非Boolean字符串
         */
        public static boolean isBoolean(String bool) {
            if (isBlank(bool)) {
                return false;
            }
            if ("true".equalsIgnoreCase(bool)
                    || "false".equalsIgnoreCase(bool)) {
                return true;
            }
            return false;
        }

    /**
     * 判断是否是手机号码格式
     * @param mbl 手机号码字符串
     * @return true是；false否
     */
    public static boolean isMobile(String mbl) {
        if (isBlank(mbl)) {
            return false;
        }
        // 判断手机号码格式
        String regExp = "^1([0-9]{10})";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(mbl);
        return m.matches();
    }

    /**
     * 判断交易密码格式
     * @param pd 交易密码字符串
     * @return true是；false否
     */
    public static boolean isTradePwd(String pd) {
        if (isBlank(pd)) {
            return false;
        }
        if (6 > pd.length() || 8 < pd.length()) {
            return false;
        }
        String regExp = "[0-9a-zA-Z]{6,8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(pd);
        return m.matches();
    }

    /**
     * 判断身份证号码格式
     * @param ids 身份证号码字符串
     * @return true是；false否
     */
    public static boolean isIdCard(String ids) {
        if (isBlank(ids)) {
            return false;
        }
        if (18 != ids.length()) {
            return false;
        }
        String regExp = "^([1-9])([0-9]{16})([0-9]|x|X)$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(ids);
        return m.matches();
    }

    /**
     * 判断银行卡号码格式
     * @param bc 银行卡号码字符串
     * @return true是；false否
     */
    public static boolean isBankCard(String bc) {
        if (isBlank(bc)) {
            return false;
        }
        if (0 > bc.length()) {
            return false;
        }
        String regExp = "[0-9]+";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(bc);
        return m.matches();
    }

        /*
         * 各类型与16进制字符串的相互转换
         */
        /** char数组. */
        public final static char[] digits = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C',
                'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z', '_', '-', '~', '!', '#', '$', '%', '^', '&', '*', '(', ')', '=', '+',
                '/', '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\"', '<', '>', ',', '.', '?'};

        /**
         * 将普通的文本字符串转换成16进制字符串.
         * @param str 文本字符串
         * @param splitStr 分割字符串
         * @return 16进制字符串
         */
        public static String parse16(String str, String splitStr) {
            return parse16(str.getBytes(), null, splitStr, 0);
        }

        /**
         * 将byte数组转换成16进制字符串.
         * @param data byte数组
         * @return 16进制字符串
         */
        public static String parse16(byte[] data) {
            return parse16(data, null, null, -1);
        }

        /**
         * 将byte数组转换成16进制字符串.
         * @param data byte数组
         * @param prefix 前缀
         * @return 16进制字符串
         */
        public static String parse16(byte[] data, String prefix) {
            return parse16(data, prefix, null, -1);
        }

        /**
         * 将byte数组转换成16进制字符串.
         * @param data byte数组
         * @param prefix 前缀
         * @param splitStr 分隔符
         * @return 16进制字符串
         */
        public static String parse16(byte[] data, String prefix, String splitStr) {
            return parse16(data, prefix, splitStr, -1);
        }

        /**
         * 将byte数组转换成16进制字符串，如数组{0x78, 0x2A, 0x5C}将转换成字符串"78 2A 5C"。
         * @param data byte数组
         * @param prefix 前缀
         * @param splitStr 分隔符
         * @param lineNum 一行显示条数
         * @return 16进制字符串
         */
        public static String parse16(byte[] data, String prefix, String splitStr, int lineNum) {
            if (data == null || data.length == 0) {
                return null;
            }
            StringBuffer buf = new StringBuffer();
            for (int i = 0, n = data.length; i < n;) {
                byte b = data[i];
                if (splitStr != null && i > 0) {
                    buf.append(splitStr);
                }
                if (prefix != null) {
                    buf.append(prefix);
                }
                buf.append(digits[(b >>> 4) & 0x0f]);
                buf.append(digits[b & 0x0f]);
                i++;
                if (lineNum > 0 && i % lineNum == 0) {
                    buf.append("\r\n");
                }
            }
            return buf.toString();
        }

        /**
         * 将16进制文本字符串转换成普通字符串.
         * @param hex 16进制字符串
         * @return 原字符串
         */
        public static String hex2String(String hex) {
            Pattern pattern = Pattern.compile("^0(x|X)");
            boolean find = pattern.matcher(hex).find();
            if (find) {
                hex = hex.substring(2);
            }
            hex = hex.replaceAll("\\s", "");

            char[] chs = hex.toCharArray();
            byte[] bytes = new byte[hex.length() / 2];
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (char2byte(chs[i * 2]) << 4 | char2byte(chs[i * 2 + 1]));
            }
            return new String(bytes);
        }

        /**
         * 将long型转换成16进制表现形式.
         * @param num 数字
         * @param pix 是否带0x前缀
         * @return 16进制字符串
         */
        public static String parse16(long num, boolean pix) {
            return parse16(num, 16, pix);
        }

        /**
         * 将int型转换成16进制表现形式.
         * @param num 数字
         * @param pix 是否带0x前缀
         * @return 16进制字符串
         */
        public static String parse16(int num, boolean pix) {
            return parse16(num, 8, pix);
        }

        /**
         * 将short型转换成16进制表现形式.
         * @param num 数字
         * @param pix 是否带0x前缀
         * @return 16进制字符串
         */
        public static String parse16(short num, boolean pix) {
            return parse16(num, 4, pix);
        }

        /**
         * 将byte型转换成16进制表现形式.
         * @param num 数字
         * @param pix 是否带0x前缀
         * @return 16进制字符串
         */
        public static String parse16(byte num, boolean pix) {
            return parse16(num, 2, pix);
        }

        /**
         * 将数值转换成指定长度的16进制表现形式.
         * @param num 数字
         * @param index 开始位置
         * @param pix 是否带0x前缀
         * @return 16进制字符串
         */
        public static String parse16(long num, int index, boolean pix) {
            char[] chs;
            if (pix) {
                chs = new char[index + 2];
                chs[0] = '0';
                chs[1] = 'x';
                for (int i = index - 1; i >= 0; i--) {
                    int _t = (int) (num >>> (i * 4) & 0x0f);
                    chs[index + 1 - i] = digits[_t];
                }
            } else {
                chs = new char[index];
                for (int i = index - 1; i >= 0; i--) {
                    int _t = (int) (num >>> (i * 4) & 0x0f);
                    chs[index - 1 - i] = digits[_t];
                }
            }
            return new String(chs);
        }

        /**
         * 将16进制的char字符转换成byte.
         * @param ch 字符
         * @return byte
         */
        private static byte char2byte(char ch) {
            int result = "0123456789ABCDEF".indexOf(Character.toUpperCase(ch));
            if (result == -1) {
                throw new RuntimeException("不能将字符:  \"" + ch + "\"转换成16进制数");
            }
            return (byte) result;
        }
        
    /**
     * 将emoji表情替换成空串
     * 
     * @param source
     * @return 过滤后的字符串
     */
    public static String filterEmoji(String source) {
        if (source != null && source.length() > 0) {
            return source.replaceAll("[\ud800\udc00-\udbff\udfff\ud800-\udfff]", "");
        } else {
            return source;
        }
    }
}
