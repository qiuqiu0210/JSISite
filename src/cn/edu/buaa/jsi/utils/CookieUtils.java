package cn.edu.buaa.jsi.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Cookie相关工具
 * @author songliu
 * @since 2014/08/19
 */
public class CookieUtils {
    /**
     * 将登录信息存放在Cookie里
     * @param response
     * @param maxAge
     * @param str
     */
    public static void setLoginCookie(HttpServletResponse response, int maxAge, String str) {
        Cookie cookie = new Cookie(Constants.COOKIE_KEY_REMEMBER_LOGIN, str);
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

    /**
     * 从Cookie中获取登录信息
     * @param request
     * @return
     */
    public static String getLoginCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie: cookies) {
                if (Constants.COOKIE_KEY_REMEMBER_LOGIN.equals(cookie.getName())){
                    String value = cookie.getValue();
                    if (!CommonUtils.isBlank(value)){
                        return value;
                    }
                }
            }
        }
        return null;
    }

    /**
     * 从Cookie中删除Cookie信息
     * @param request
     * @param response
     * @return
     */
    public static boolean removeLoginCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie: cookies){
            if(Constants.COOKIE_KEY_REMEMBER_LOGIN.equals(cookie.getName())){
                cookie.setValue("");
                cookie.setMaxAge(1);
                response.addCookie(cookie);
                return true;
            }
        }
        return false;
    }
}
