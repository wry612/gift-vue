package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.Advertisement;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by H.CAAHN on 2017/5/10.
 */
public interface FileService {
    /**
     * 文件下载（写入到response中）
     * @param filePath
     * @param response
     */
    void downloadFile(String dicPath, String filePath, HttpServletResponse response);

    /**
     * 查询所有的广告列表
     * @return
     */
    List<Advertisement> queryAdvertisement();
}
