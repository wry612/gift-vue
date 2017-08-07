package cn.datai.gift.wxpay.util;

import cn.datai.gift.utils.converter.Converter;
import cn.datai.gift.utils.converter.ConverterUtils;
import cn.datai.gift.wxpay.bean.common.WxPayNotifyReceiver;
import cn.datai.gift.wxpay.bean.response.WxPayOrderQueryResponse;
import cn.datai.gift.wxpay.bean.response.WxPayRefundOrderResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import cn.datai.gift.wxpay.bean.response.WxPayRefundQueryResponse;
import org.simpleframework.xml.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by H.CAAHN on 2017/4/21.
 */
public class WxPayResponseUtils {
    private static final Logger logger = LoggerFactory.getLogger(WxPayResponseUtils.class);

    public static <T> T getDefaultResponse(Map<String, Object> params, Class<T> clazz) throws Exception {
        T t = clazz.newInstance();
        WxPayResponseUtils.settingProperties(params, clazz, t);
        return t;
    }

    public static <T> T getDefaultResponseByXStream(Map<String, Object> params, Class<T> clazz) throws Exception {
        T t = clazz.newInstance();
        WxPayResponseUtils.settingPropertiesByXStream(params, clazz, t);
        return t;
    }


    public static void settingProperties(Map<String, Object> params, Class clazz, Object obj) throws Exception {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Element element = field.getAnnotation(Element.class);
            if (element != null) {
                String name = element.name();
                Object value = params.get(name);
                field.setAccessible(true);
                settingValue(field, obj, value);
            }
        }

        Class pc = clazz.getSuperclass();
        if (pc != Object.class) {
            settingProperties(params, pc, obj);
        }
    }

    public static void settingPropertiesByXStream(Map<String, Object> params, Class clazz, Object obj) throws Exception {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            XStreamAlias element = field.getAnnotation(XStreamAlias.class);
            if (element != null) {
                String name = element.value();
                Type type = field.getGenericType();
                if (type instanceof Class) {
                    Object value = params.get(name);
                    field.setAccessible(true);
                    field.set(obj, ConverterUtils.convert(value, (Class)type));
                }
            }
        }

        Class pc = clazz.getSuperclass();
        if (pc != Object.class) {
            settingProperties(params, pc, obj);
        }
    }

    public static WxPayOrderQueryResponse getWxPayOrderQueryResponse(Map params) throws Exception {
        WxPayOrderQueryResponse response = getDefaultResponse(params, WxPayOrderQueryResponse.class);
        Integer couponCount = response.getCouponCount();
        if (couponCount != null && couponCount > 0) {
            List<WxPayOrderQueryResponse.CouponDetail> dList = new ArrayList<WxPayOrderQueryResponse.CouponDetail>(couponCount);
            for (int i = 0; i < couponCount; i++) {
                WxPayOrderQueryResponse.CouponDetail detail = new WxPayOrderQueryResponse.CouponDetail();
                detail.setCouponId(ConverterUtils.convert(params.get("coupon_id_" + i), ""));
                detail.setCouponType(ConverterUtils.convert(params.get("coupon_type_" + i), ""));
                detail.setCouponFee(ConverterUtils.convert(params.get("coupon_fee_" + i), Integer.class));
                dList.add(detail);
            }
            response.setCouponDetails(dList);
        }

        return response;
    }

    /**
     * map转换
     * @param params
     * @return
     * @throws Exception
     */
    public static WxPayNotifyReceiver getWxPayNotifyReceiver(Map params) throws Exception {
        WxPayNotifyReceiver wxPayNotifyReceiver = getDefaultResponseByXStream(params, WxPayNotifyReceiver.class);
        Integer couponCount = wxPayNotifyReceiver.getCouponCount();
        if (couponCount != null && couponCount > 0) {
            List<WxPayNotifyReceiver.CouponDetail> dList = new ArrayList<>(couponCount);
            for (int i = 0; i < couponCount; i++) {
                WxPayNotifyReceiver.CouponDetail detail = new WxPayNotifyReceiver.CouponDetail();
                detail.setCouponId(ConverterUtils.convert(params.get("coupon_id_" + i), ""));
                detail.setCouponType(ConverterUtils.convert(params.get("coupon_type_" + i), ""));
                detail.setCouponFee(ConverterUtils.convert(params.get("coupon_fee_" + i), Integer.class));
                dList.add(detail);
            }
            wxPayNotifyReceiver.setCouponDetails(dList);
        }
        return wxPayNotifyReceiver;
    }

    public static WxPayRefundQueryResponse getWxPayRefundQueryResponse(Map params) throws Exception {
        WxPayRefundQueryResponse response = getDefaultResponse(params, WxPayRefundQueryResponse.class);
        Integer refundCount = response.getRefundCount();
        if (refundCount != null && refundCount > 0) {
            String[] outRefundNo = new String[refundCount];
            String[] refundId = new String[refundCount];
            String[] refundChannel = new String[refundCount];
            Integer[] refundFee = new Integer[refundCount];
            Integer[] settlementRefundFee = new Integer[refundCount];
            String[] couponType = new String[refundCount];
            Integer[] couponRefundFees = new Integer[refundCount];
            Integer[] couponRefundCount = new Integer[refundCount];
            String[] refundStatus = new String[refundCount];
            String[] refundAccount = new String[refundCount];
            String[] refundRecvAccout = new String[refundCount];
            String[] refundSuccessTime = new String[refundCount];
            List<WxPayRefundQueryResponse.CouponRefundDetail[]> couponRefundDetails = new ArrayList<>(refundCount);
            for (int i = 0; i < refundCount; i++) {
                outRefundNo[i] = ConverterUtils.convert(params.get("out_refund_no_" + i), "");
                refundId[i] = ConverterUtils.convert(params.get("refund_id_" + i), "");
                refundChannel[i] = ConverterUtils.convert(params.get("refund_channel_" + i), "");
                refundFee[i] = ConverterUtils.convert(params.get("refund_fee_" + i), Integer.class);
                settlementRefundFee[i] = ConverterUtils.convert(params.get("settlement_refund_fee_" + i), Integer.class);
                couponType[i] = ConverterUtils.convert(params.get("coupon_type_" + i), "");
                couponRefundFees[i] = ConverterUtils.convert(params.get("coupon_refund_fee_" + i), Integer.class);
                couponRefundCount[i] = ConverterUtils.convert(params.get("coupon_refund_count_" + i), Integer.class);
                refundStatus[i] = ConverterUtils.convert(params.get("refund_status_" + i), "");
                refundAccount[i] = ConverterUtils.convert(params.get("refund_account_" + i), "");
                refundRecvAccout[i] = ConverterUtils.convert(params.get("refund_recv_accout_" + i), "");
                refundSuccessTime[i] = ConverterUtils.convert(params.get("refund_success_time_" + i), "");

                if (couponRefundCount[i] == null || couponRefundCount[i] < 1) {
                    continue;
                }

                WxPayRefundQueryResponse.CouponRefundDetail[] details = new WxPayRefundQueryResponse.CouponRefundDetail[couponRefundCount[i]];
                for (int j = 0; j < couponRefundCount[i]; j++) {
                    String criKey = "refund_recv_accout_" + i + "_" + j;
                    String crfKey = "coupon_refund_fee_" + i + "_" + j;
                    details[j] = new WxPayRefundQueryResponse.CouponRefundDetail();
                    details[j].setCouponRefundFee(ConverterUtils.convert(params.get(crfKey), Integer.class));
                    details[j].setCouponRefundId(ConverterUtils.convert(params.get(criKey), ""));
                }

                couponRefundDetails.add(details);
            }
            response.setOutRefundNo(outRefundNo);
            response.setRefundId(refundId);
            response.setRefundChannel(refundChannel);
            response.setRefundFee(refundFee);
            response.setSettlementRefundFee(settlementRefundFee);
            response.setCouponType(couponType);
            response.setCouponRefundFees(couponRefundFees);
            response.setRefundStatus(refundStatus);
            response.setRefundAccount(refundAccount);
            response.setRefundRecvAccout(refundRecvAccout);
            response.setRefundSuccessTime(refundSuccessTime);
            response.setCouponRefundDetails(couponRefundDetails);
        }
        return response;
    }

    public static WxPayRefundOrderResponse getWxPayRefundOrderResponse(Map params) throws Exception {
        WxPayRefundOrderResponse response = getDefaultResponse(params, WxPayRefundOrderResponse.class);
        Integer coupon_refund_count = response.getCouponRefundCount();
        if (coupon_refund_count != null && coupon_refund_count > 0) {
            List<WxPayRefundOrderResponse.CouponRefundDetail> detailList = new ArrayList<>(coupon_refund_count);
            for (int i = 0; i < coupon_refund_count; i++) {
                WxPayRefundOrderResponse.CouponRefundDetail detail = new WxPayRefundOrderResponse.CouponRefundDetail();
                detail.setCouponType(ConverterUtils.convert(params.get("coupon_type_" + i), ""));
                detail.setCouponRefundId(ConverterUtils.convert(params.get("coupon_refund_id_" + i), ""));
                detail.setCouponRefundFee(ConverterUtils.convert(params.get("coupon_refund_fee_" + i), Integer.class));
                detailList.add(detail);
            }
            response.setDetailList(detailList);
        }

        return response;
    }

    public static void settingValue(Field field, Object object, Object value) {
        try {
            field.setAccessible(true);
            if (field.getType() == String.class && value instanceof String) {
                field.set(object, value);
            }
            else {
                field.set(object, ConverterUtils.convert(value, field.getType()));
            }
        }
        catch (Exception ex) {
            logger.warn("Can not setting value " + value + " to field " + field.getName() + ", type is " + field.getType(), ex);
        }
    }

}
