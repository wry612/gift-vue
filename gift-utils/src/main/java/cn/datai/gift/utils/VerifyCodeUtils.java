/*
 * 文件名：VerifyCodeUtils.java
 * 版权：Copyright 2016 江苏大泰信息技术有限公司. All Rights Reserved. 
 * 描述： 图片验证码工具类
 * 创建人：汪涛
 * 创建时间：2016-06-20
 */
package cn.datai.gift.utils;

import cn.datai.gift.utils.exception.BizException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * 图片验证码工具类.
 * @author wangtao
 *
 */
public class VerifyCodeUtils {
    /** 字体只显示大写，去掉了1,0,i,o几个容易混淆的字符. */  
    public static final String VERIFY_CODES = "23456789ABCDEFGHJKLMNPQRSTUVWXYZ";
    /** 随机类. */
    private static Random rd = new Random();

    /**
     * 使用系统默认字符源生成验证码 .
     * @param verifySize 验证码长度
     * @return 验证码
     */
    public static String generateVerifyCode(int verifySize) {
        return generateVerifyCode(verifySize, VERIFY_CODES);
    }

    /**
     * 使用指定源生成验证码.
     * @param verifySize 验证码长度
     * @param sources 验证码字符源
     * @return 验证码
     */
    public static String generateVerifyCode(int verifySize, String sources) {
        if (null == sources || 0 == sources.length()) {
            sources = VERIFY_CODES;
        }
        int codesLen = sources.length();
        Random rand = new Random(System.currentTimeMillis());
        StringBuilder verifyCode = new StringBuilder(verifySize);
        for (int i = 0; i < verifySize; i++) {
            verifyCode.append(sources.charAt(rand.nextInt(codesLen - 1)));
        }
        return verifyCode.toString();
    }

    /**
     * 生成图片验证码Base64字符串.
     * @param w 宽
     * @param h 高
     * @param code 验证码
     * @return 图片验证码Base64字符串
     * @throws Exception 异常
     */
    public static String outputVerifyImageWithBase64(int w, int h, String code) throws BizException {
        Random tmpRandom = new Random();
        BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Color[] colors = new Color[5];
        Color[] colorSpaces = new Color[] { Color.WHITE, Color.CYAN, Color.GRAY, Color.LIGHT_GRAY, Color.MAGENTA,
                Color.ORANGE, Color.PINK, Color.YELLOW };
        float[] fractions = new float[colors.length];
        Random rand = new Random();
        for (int i = 0; i < colors.length; i++) {
            colors[i] = colorSpaces[rand.nextInt(colorSpaces.length)];
            fractions[i] = rand.nextFloat();
        }
        Arrays.sort(fractions);
        // 设置边框色
        g2.setColor(Color.GRAY);
        g2.fillRect(0, 0, w, h);
        // 获得随机颜色并设置背景色
        Color c = getRandColor(200, 250);
        g2.setColor(c);
        g2.fillRect(0, 2, w, h - 4);
        // 设置线条的颜色并绘制干扰线
        g2.setColor(getRandColor(160, 200));
        for (int i = 0; i < 20; i++) {
            int x = tmpRandom.nextInt(w - 1);
            int y = tmpRandom.nextInt(h - 1);
            int xl = tmpRandom.nextInt(6) + 1;
            int yl = tmpRandom.nextInt(12) + 1;
            g2.drawLine(x, y, x + xl + 40, y + yl + 20);
        }
        // 添加噪点
        // 噪声率
        float yawpRate = 0.05f;
        int area = (int) (yawpRate * w * h);
        for (int i = 0; i < area; i++) {
            int x = tmpRandom.nextInt(w);
            int y = tmpRandom.nextInt(h);
            int rgb = getRandomIntColor();
            image.setRGB(x, y, rgb);
        }
        // 使图片扭曲
        shear(g2, w, h, c);

        // 绘制验证码
        g2.setColor(getRandColor(100, 160));
        int fontSize = h - 4;
        Font font = new Font("Arial", Font.ITALIC, fontSize);
        g2.setFont(font);
        char[] chars = code.toCharArray();
        int verifySize = code.length();
        for (int i = 0; i < verifySize; i++) {
            AffineTransform affine = new AffineTransform();
            affine.setToRotation(Math.PI / 4 * rand.nextDouble() * (rand.nextBoolean() ? 1 : -1),
                    (w / verifySize) * i + fontSize / 2, h / 2);
            g2.setTransform(affine);
            g2.drawChars(chars, i, 1, ((w - 10) / verifySize) * i + 5, h / 2 + fontSize / 2 - 10);
        }
        g2.dispose();
        // 转换成Base64编码字符串并返回
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "jpg", baos);
        } catch (IOException e) {
            throw new BizException("生成图片验证码失败", e);
        }
        byte[] bytes = baos.toByteArray();
        return SecurityUtils.byteArrToBase64(bytes);
    }

    /**
     * 获得随机颜色
     * @param fc 前景色
     * @param bc 背景色
     * @return 颜色
     */
    private static Color getRandColor(int fc, int bc) {
        if (fc > 255) {
            fc = 255;
        }
        if (bc > 255) {
            bc = 255;
        }
        int r = fc + rd.nextInt(bc - fc);
        int g = fc + rd.nextInt(bc - fc);
        int b = fc + rd.nextInt(bc - fc);
        return new Color(r, g, b);
    }

    /**
     * 获得随机颜色值.
     * @return 颜色值
     */
    private static int getRandomIntColor() {
        int[] rgb = getRandomRgb();
        int color = 0;
        for (int c : rgb) {
            color = color << 8;
            color = color | c;
        }
        return color;
    }

    /**
     * 获得随机RGB颜色.
     * @return RGB颜色值
     */
    private static int[] getRandomRgb() {
        int[] rgb = new int[3];
        for (int i = 0; i < 3; i++) {
            rgb[i] = rd.nextInt(255);
        }
        return rgb;
    }

    /**
     * 扭曲图片.
     * @param g 画布
     * @param w1 宽
     * @param h1 高
     * @param color 颜色
     */
    private static void shear(Graphics g, int w1, int h1, Color color) {
        shearX(g, w1, h1, color);
        shearY(g, w1, h1, color);
    }

    /**
     * 横向扭曲.
     * @param g 画布
     * @param w1 宽
     * @param h1 高
     * @param color 颜色
     */
    private static void shearX(Graphics g, int w1, int h1, Color color) {
        int period = rd.nextInt(2);
        boolean borderGap = true;
        int frames = 1;
        int phase = rd.nextInt(2);
        for (int i = 0; i < h1; i++) {
            double d = (double) (period >> 1)
                    * Math.sin((double) i / (double) period + (6.2831853071795862D * (double) phase) / (double) frames);
            g.copyArea(0, i, w1, 1, (int) d, 0);
            if (borderGap) {
                g.setColor(color);
                g.drawLine((int) d, i, 0, i);
                g.drawLine((int) d + w1, i, w1, i);
            }
        }
    }

    /**
     * 纵向扭曲.
     * @param g 画布
     * @param w1 宽
     * @param h1 高
     * @param color 颜色
     */
    private static void shearY(Graphics g, int w1, int h1, Color color) {
        int period = rd.nextInt(40) + 10; // 50;
        boolean borderGap = true;
        int frames = 20;
        int phase = 7;
        for (int i = 0; i < w1; i++) {
            double d = (double) (period >> 1)
                    * Math.sin((double) i / (double) period + (6.2831853071795862D * (double) phase) / (double) frames);
            g.copyArea(i, 0, 1, h1, 0, (int) d);
            if (borderGap) {
                g.setColor(color);
                g.drawLine(i, (int) d, i, 0);
                g.drawLine(i, (int) d + h1, i, h1);
            }
        }
    }
}
