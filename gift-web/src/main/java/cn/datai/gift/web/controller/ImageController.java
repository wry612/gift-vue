package cn.datai.gift.web.controller;

import cn.datai.gift.persist.po.Advertisement;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.plugin.annotation.Auth;
import cn.datai.gift.web.service.FileService;
import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpStatusCodeException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;

/**
 * Created by H.CAAHN on 2017/5/10.
 */
@Controller
@RequestMapping("/static/images")
public class ImageController extends BaseController      {
    private static final Logger logger = LoggerFactory.getLogger(ImageController.class);

    @Resource
    private FileService fileService;

    @Value("${file.path}")
    private String filePath;

    @Value("${file.advert.path}")
    private String advertFilePath;

    @RequestMapping(value = "view/{day}/{id:.+}", method = RequestMethod.GET)
    public void view(@PathVariable("day") String day, @PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            String path = day + File.separator + id;
            this.fileService.downloadFile(filePath, path, response);
        }
        catch (BizException ex) {
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("{\"flag\":false,\"message\":\"文件未找到\"}");
            response.setStatus(HttpStatus.SC_NOT_FOUND);
            logger.error("文件读取未找到(IOException): {}, {}", day, id);
        }
        catch (Exception ex) {
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("{\"flag\":false,\"message\":\"文件读取失败，请联系管理员或稍后再试\"}");
            response.setStatus(500);
            logger.error("文件读取失败: " + day +", " + id, ex);
        }
    }

    /**
     * 获取广告图片
     * @param day
     * @param id
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "advert/{day}/{id:.+}", method = RequestMethod.GET)
    public void advert(@PathVariable("day") String day, @PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            String path = day + File.separator + id;
            this.fileService.downloadFile(advertFilePath, path, response);
        }
        catch (BizException ex) {
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("{\"flag\":false,\"message\":\"文件未找到\"}");
            response.setStatus(HttpStatus.SC_NOT_FOUND);
            logger.error("广告文件读取未找到(IOException): {}, {}", day, id);
        }
        catch (Exception ex) {
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("{\"flag\":false,\"message\":\"广告文件读取失败，请联系管理员或稍后再试\"}");
            response.setStatus(500);
            logger.error("广告文件读取失败: " + day +", " + id, ex);
        }
    }

    /**
     * 查询广告列表
     */
    @Auth(needLogin = true,weixinJsAuth = true)
    @RequestMapping(value = "/queryAdvertisement" ,method = RequestMethod.GET)
    @ResponseBody
    public RespResult queryAdvertisement(){
        try {
            List<Advertisement> advertisementList = fileService.queryAdvertisement();
            return new RespResult(RespCode.SUCCESS,advertisementList);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询广告列表发生异常，错误信息：{}",e);
            return new RespResult(RespCode.FAIL,"查询广告列表失败");
        }

    }
}
