package cn.edu.buaa.jsi.action;

import cn.edu.buaa.jsi.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.*;

/**
 * @ClassName: LoginAction
 * @Description: 登录Action
 * @author songliu
 * @date 2014-08-13
 *
 */
public class LoginAction extends ActionSupport implements ServletRequestAware {
    private String username;
    private String password;
    private UserService userService;
    private HttpServletRequest request;

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

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String execute() throws Exception{
        String state =  login();
        request.setAttribute("result",state);
        return "submit";
    }

    public String cancel() throws Exception{
        request.setAttribute("result","取消");
        return "cancel";
    }

    /**
     * @Title: login
     * @Description: 用户登录
     * @param
     * @return
     */
    public String login(){
        if(username != null && password != null && !"".equals(username) && !"".equals(password)) {
            if(userService.validateUser(username, password)) {
                return "success";
            } else {
                return "failure";
            }
        } else {
            return "failure";
        }
    }


}
