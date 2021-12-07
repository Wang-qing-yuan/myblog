package top.wqy.myblog.util;


import org.apache.shiro.SecurityUtils;
import top.wqy.myblog.shiro.AccountProfile;

/**
 * @description: ShiroUtil工具类
 * @author: wqy
 * @date: 2021-12-07
 **/
public class ShiroUtil {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
