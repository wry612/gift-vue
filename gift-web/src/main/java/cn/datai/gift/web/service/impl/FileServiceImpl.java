package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.AdvertisementMapperExt;
import cn.datai.gift.persist.po.Advertisement;
import cn.datai.gift.persist.po.AdvertisementExample;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;
import java.util.List;

/**
 * Created by H.CAAHN on 2017/5/10.
 */
@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private AdvertisementMapperExt advertisementMapperExt;

    @Override
    public void downloadFile(String dicPath, String filePath, HttpServletResponse response) {
        if (!dicPath.endsWith("/") && !dicPath.endsWith("\\")) {
            dicPath += File.separator;
        }
        filePath = dicPath + filePath;
        InputStream input = null;
        try {
            File file = new File(filePath);
            response.setHeader("Last-Modified", new Date(file.lastModified()).toString());
            response.setHeader("Cache-Control", "31556926");
            response.setHeader("Content-Length", String.valueOf(file.length()));
            input = new FileInputStream(file);
            OutputStream out = response.getOutputStream();
            int readLength = -1;
            byte[] bytes = new byte[4096];
            while ((readLength = input.read(bytes)) > 0) {
                out.write(bytes, 0, readLength);
            }
            out.flush();
        }
        catch (IOException ex) {
            throw new BizException(ex);
        }
        finally {
            try {
                if (input != null) {
                    input.close();
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * 查询所有的广告列表
     *
     * @return
     */
    @Override
    public List<Advertisement> queryAdvertisement() {
        AdvertisementExample advertisementExample = new AdvertisementExample();
        advertisementExample.setOrderByClause("BANNER_SEQ");
        return advertisementMapperExt.selectByExample(advertisementExample);
    }
}
