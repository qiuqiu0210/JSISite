package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.entities.Account;
import cn.edu.buaa.jsi.service.AccountService;
import cn.edu.buaa.jsi.utils.CipherUtil;
import cn.edu.buaa.jsi.utils.Constants;
import cn.edu.buaa.jsi.utils.CommonUtils;
import cn.edu.buaa.jsi.utils.CookieUtils;

import javax.servlet.http.*;
import java.util.Map;

/**
 * 登录Actionon
 * <p>用户身份校验<br>
 * @author songliu
 * @since 2014/08/13
 */
public class LoginAction extends BaseAction {
    private String username;
    private String password;
    private String remember;
    private String goingToURL;
    private AccountService accountService;
    private Account account;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private Map session;

    /**
     * 处理登录请求
     */
    public String login(){
        //只要有一个参数为null就跳转
        if (username==null || password == null){
            return INPUT;
        }
        if (loginSuccess()) {
            if ("on".equals(getRemember())) {
                String str = username + "==" + password;
                int maxAge = 60 * 60 * 24 * 14;
                CookieUtils.setLoginCookie(response, maxAge, str);
            }
            session.put(Constants.SESSION_KEY_USER_NAME, username);
            String url = (String) session.get(Constants.GOING_TO_URL_KEY);
            if (!CommonUtils.isBlank(url)){
                setGoingToURL(url);
                session.remove(Constants.GOING_TO_URL_KEY);
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

    /**
     * 处理登出请求
     */
    public String logout(){
        if (session != null){
            session.remove("SESSION_KEY_USER_NAME");
        }
        CookieUtils.removeLoginCookie(request, response);
        return LOGIN;
    }

    /**
     * 判断用户是否登录成功
     */
    public boolean loginSuccess(){
        if(username != null && password != null && !"".equals(username) && !"".equals(password)) {
            //对密码进行MD5加密
            password = CipherUtil.generatePassword(password);
            account = accountService.validateAccount(username, password);
            if(account != null) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * 页面表单提交时，自动调用validate方法进行初步验证
     */
    @Override
    public void validate() {
        if ("".equals(username)) {
            this.addFieldError("username", "username required");
        }
        if ("".equals(password)) {
            this.addFieldError("password", "password required");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
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
}
