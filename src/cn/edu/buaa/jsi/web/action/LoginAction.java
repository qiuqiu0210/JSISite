package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.service.AccountService;
import cn.edu.buaa.jsi.utils.CommonConstants;
import cn.edu.buaa.jsi.utils.CommonUtils;

import javax.servlet.http.*;
import java.util.Map;

/**
 * @ClassName: LoginAction
 * @Description: 登录Action
 * @author songliu
 * @date 2014-08-13
 *
 */
public class LoginAction extends BaseAction {
    private String username;
    private String password;
    private boolean remember = false;
    private String goingToURL;
    private AccountService accountService;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private Map session;

//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }

    public String getGoingToURL() {
        return goingToURL;
    }

    public void setGoingToURL(String goingToURL) {
        this.goingToURL = goingToURL;
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    /**
     * @Title: login
     * @Description: 用户登录
     * @param
     * @return
     */
    public String login(){
        username = request.getParameter("username");
        password = request.getParameter("password");
        if (CommonUtils.isBlank(username) && CommonUtils.isBlank(password)){
            return INPUT;
        }
        if (loginSuccess()) {
            if (isRemember()) {
                String str = username + "==" + password;
                Cookie cookie = new Cookie(CommonConstants.COOKIE_KEY_REMEMBER_LOGIN, str);
                cookie.setMaxAge(60 * 60 * 24 * 14);
                response.addCookie(cookie);
            }
            session.put(CommonConstants.SESSION_KEY_USER_NAME, username);
            String url = (String) session.get(CommonConstants.GOING_TO_URL_KEY);
            if (!CommonUtils.isBlank(url)){
                setGoingToURL(url);
                session.remove(CommonConstants.GOING_TO_URL_KEY);
            }
            else {
                setGoingToURL("login.jsp");
            }
            return LOGIN;
        }
        else {
            addActionMessage("username or password is not correct");
            return INPUT;
        }
    }

    public String logout(){
        if (session != null){
            session.remove("SESSION_KEY_USER_NAME");
        }
//        if (!session.containsKey("SESSION_KEY_USER_NAME")){
//            return SUCCESS;
//        }
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie: cookies){
            if(CommonConstants.COOKIE_KEY_REMEMBER_LOGIN.equals(cookie.getName())){
                cookie.setValue("");
                cookie.setMaxAge(1);
                response.addCookie(cookie);
                return LOGIN;
            }
        }
        return LOGIN;
    }

    public boolean loginSuccess(){
        if(username != null && password != null && !"".equals(username) && !"".equals(password)) {
            if(accountService.validateAccount(username, password)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
