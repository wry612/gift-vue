package cn.datai.gift.web.utils;

import cn.datai.gift.web.contants.PhotoContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/13.
 */
public class PhotoUtil {


    private static final Logger LOGGER = LoggerFactory.getLogger(PhotoUtil.class);

    /**
     * 上传图片到本地
     * @return
     * @throws Exception
     */
    public static Map<String,Object> uploadFile(String fileName,String strUrl) throws Exception {

        Map<String,Object> result = new HashMap<>();

        String path = PhotoPropertiesUtil.getValue(PhotoContants.FILE_PATH);
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }

        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;

        try {

            URL url = new URL(strUrl);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5 * 1000);
            inputStream = conn.getInputStream();//通过输入流获取图片数据

            // 文件流写到本地
            fileOutputStream = new FileOutputStream(path + "/" +fileName);
            if (inputStream != null && fileOutputStream != null) {
                byte[] buffer = new byte[1024];
                int len = 0;
                while ((len = inputStream.read(buffer)) > 0) {
                    fileOutputStream.write(buffer, 0, len);
                }
            }
            File doneFile = new File(path + "/" +fileName);
            doneFile.setReadable(true, false);
            result.put("newFileName",fileName);
        } catch (Exception e) {
            LOGGER.error("上传文件【uploadFile】异常：{}", e);
        } finally {
            try {
                // 关闭流
                if (fileOutputStream != null)
                    fileOutputStream.close();

                if (inputStream != null)
                    inputStream.close();

            } catch (Exception e) {
                LOGGER.error("上传文件【uploadFile】异常：{}", e);
            }
            return result;
        }

    }


    /**
     * 文件下载
     *
     * @param fileName 文件名称
     * @param response 请求响应
     */
    public static void downloadFile(String fileName, HttpServletResponse response) {
        OutputStream outputStream = null;
        InputStream inputStream = null;
        try {

            //文件路径
            String path = PhotoPropertiesUtil.getValue(PhotoContants.FILE_PATH) + "/" + fileName;
            inputStream = new BufferedInputStream(new FileInputStream(new File(path)));

            // 以流的形式下载图片。
            // 清空response
            response.reset();

            // 在线打开方式
            URL url = new URL("file:///" + path);

            // 类型
            response.setContentType(url.openConnection().getContentType());
            response.setHeader("Content-Disposition", "inline; filename="
                    + new String(fileName.getBytes("UTF-8"), "ISO8859-1"));

            outputStream = new BufferedOutputStream(response.getOutputStream());
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }

            outputStream.flush();
        } catch (Exception e) {
            LOGGER.error("下载文件失败，异常信息：{}", e);
            return;
        } finally {
            try {
                // 关闭流
                if (outputStream != null) {
                    outputStream.close();
                }

                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                LOGGER.error("下载文件失败，异常信息：{}", e);
                return;
            }

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("下载文件【downloadFile】结束");
            }
        }
    }


    public static void main(String[] args) throws Exception {
            PhotoUtil.uploadFile("23434.jpg","http://wx.qlogo.cn/mmopen/ajNVdqHZLLB0mNl2ow0l1qMHialECKOqlUjSqRF1ejFSu7G0d0KibtD2xxsB8BRcdCWpzreWTh3Qvuv3a3RyFEJw/0");
    }

}
