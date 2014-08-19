package cn.edu.buaa.jsi.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 14-8-19.
 */
public class CookieUtils {
    public static void setLoginCookie(HttpServletResponse response, int maxAge, String str) {
        Cookie cookie = new Cookie(CommonConstants.COOKIE_KEY_REMEMBER_LOGIN, str);
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

    public static String getLoginCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie: cookies) {
                if (CommonConstants.COOKIE_KEY_REMEMBER_LOGIN.equals(cookie.getName())){
                    String value = cookie.getValue();
                    if (!CommonUtils.isBlank(value)){
                        return value;
                    }
                }
            }
        }
        return null;
    }

    public static boolean removeLoginCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie: cookies){
            if(CommonConstants.COOKIE_KEY_REMEMBER_LOGIN.equals(cookie.getName())){
                cookie.setValue("");
                cookie.setMaxAge(1);
                response.addCookie(cookie);
                return true;
            }
        }
        return false;
    }
}
