package cn.datai.gift.web.vo.Conversion;

import cn.datai.gift.persist.po.ConvertObj;
import cn.datai.gift.persist.po.ConvertObjOrder;

/**
 * Created by Administrator on 2017/7/11.
 */
public class ConvertObjOrderVo extends ConvertObjOrder {
    private String nickName;//昵称

    private String headImgPath;//头像路径

    private ConvertObj convertObj;

    public ConvertObj getConvertObj() {
        return convertObj;
    }

    public void setConvertObj(ConvertObj convertObj) {
        this.convertObj = convertObj;
    }

    public String getHeadImgPath() {
        return headImgPath;
    }

    public void setHeadImgPath(String headImgPath) {
        this.headImgPath = headImgPath;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
