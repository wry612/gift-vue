package cn.datai.gift.web.plugin.annotation;


import java.lang.annotation.*;

/**
 * 权限校验
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Auth {

    /**
     * 是否需要登录，包含无正式用户，仅仅通过第三方授权的临时登录
     * @return
     */
    boolean needLogin() default true;


    /**
     * 微信js授权， 默认不授权
     * @return
     */
    boolean weixinJsAuth() default false;

    /**
     * 需要绑定
     * @return
     */
    boolean needBind() default false;

    /**
     * 需要输入密码
     * @return
     */
    boolean needPassword() default false;

}
