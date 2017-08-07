/*
 * 文件名：ImageUtils.java
 * 版权：Copyright 2015 江苏大泰信息技术有限公司. All Rights Reserved. 
 * 描述： 绘图工具集
 * 创建人：H.CAAHN
 * 创建时间：2012-08-06
 */
package cn.datai.gift.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;

/**
 * 绘图工具集.
 * @author H.CAAHN
 */
public final class ImageUtils {

    /** 日志. */
    private static final Logger logger = LoggerFactory.getLogger(ImageUtils.class);

    /** 数字字符. */
    private static char[] CHARS  = {'2', '3', '4', '5', '6', '7', '8', '9', '1', '0'};
    
    // 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
    // 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'y', 'A', 'B',
    // 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
    // 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
    
    /**
	 * 图片的后缀
	 */
	public static final String[] IMAGE_EXT = new String[] { "jpg", "jpeg",
			"gif", "png", "bmp" };

	/**
	 * 是否是图片
	 * 
	 * @param ext
	 * @return "jpg", "jpeg", "gif", "png", "bmp" 为文件后缀名者为图片
	 */
	public static boolean isValidImageExt(String ext) {
		ext = ext.toLowerCase(Locale.ENGLISH);
		for (String s : IMAGE_EXT) {
			if (s.equalsIgnoreCase(ext)) {
				return true;
			}
		}
		return false;
	}

    
    /**
     * 生成验证码字符串.
     * @param length 生成验证码字符串长度
     * @return 验证码字符串
     */
    public static String generateVCode(int length) {
        StringBuffer buf = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            buf.append(random.nextInt(CHARS.length));
        }
        return buf.toString();
    }

    /**
     * 生成验证码图片，图片码流使用Base64编码.
     * @param vcode 验证码字符串
     * @return 验证码图片流Base64编码
     */
    public static String generateImage2Base64(String vcode) {
        return generateImage2Base64(vcode, 60, 30);
    }

    /**
     * 生成验证码图片，图片码流使用Base64编码.
     * @param vcode 验证码字符串
     * @param width 图片宽度
     * @param height 图片高度
     * @return 验证码图片流Base64编码
     */
    public static String generateImage2Base64(String vcode, int width, int height) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setColor(getRandColor(200, 250));
        g.fillRect(0, 0, width, height);
        g.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        g.setColor(getRandColor(160, 200));
        // 绘制随机线条，为图像添加噪音
        Random random = new Random();
        for (int i = 0; i < 155; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            g.drawLine(x, y, x + xl, y + yl);
        }
        // 绘制验证码数字
        char[] chs = vcode.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
            g.drawString(String.valueOf(chs[i]), 13 * i + 6, 23);
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "JPEG", out);
        }
        catch (IOException ex) {
            if (logger.isErrorEnabled()) {
                logger.error("图片写出到输出流失败.", ex);
            }
            return null;
        }
        byte[] bytes = out.toByteArray();
        return SecurityUtils.byteArrToBase64(bytes);
    }

    /**
     * 随机获得颜色，RGB格式.
     * @param fc 前景色
     * @param bc 背景色
     * @return 颜色
     */
    private static Color getRandColor(int fc, int bc) {
        Random random = new Random();
        if (fc > 255) {
            fc = 255;
        }
        if (bc > 255) {
            bc = 255;
        }
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }
}
