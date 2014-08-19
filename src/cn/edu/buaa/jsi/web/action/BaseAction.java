package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.entities.Account;
import cn.edu.buaa.jsi.entities.Group;
import cn.edu.buaa.jsi.utils.DateUtils;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by Home on 2014/8/17.
 */
public class BaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware, SessionAware {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private Map session;

    //存储到Session中的数据键名
    public static final String LOGIN_USER = "cn.edu.buaa.jsi.login.user";
    public static final String LOGIN_GROUP = "cn.edu.buaa.jsi.login.group";
    public static final String USER_SET_TODAY = "cn.edu.buaa.jsi.currentDate";
    public static final String USER_SET_BEGIN_DATE = "cn.edu.buaa.jsi.beginDate";
    public static final String CURRENT_SESSION = "login.session";
    public static final String CURRENT_COOKIES = "login.cookies";
    //Ajax.login返回值类型
    public static final String AIAX_LOGIN = "ajax.login";

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    /**
     * 获取当前登录用户
     */
    public Account getLoginAccount() {
        Account account = (Account)session.get(LOGIN_USER);
        if (account == null) {
            return null;
        }
        return account;
    }
    public void setLoginAccount(Account account) {
        if (account == null) {
            session.remove(LOGIN_USER);
        }
        else {
            session.put(LOGIN_USER, account);
        }
    }
    /**
     * 获取当前登录组
     */
    public Group getLoginGroup() {
        Group group = (Group)session.get(LOGIN_USER);
        if (group == null) {
            return null;
        }
        return group;
    }
    public void setLoginGroup(Group group) {
        if (group == null) {
            session.remove(LOGIN_GROUP);
        }
        else {
            session.put(LOGIN_GROUP, group);
        }
    }

    public boolean isLogin() {
        return session.containsKey(LOGIN_USER) && session.get(LOGIN_USER) != null;
    }

    public String getSessionId() {
        if (!session.containsKey(CURRENT_SESSION)){
            return null;
        }
        return (String)session.get(CURRENT_SESSION);
    }

    public void setToday(String today) {
        session.put(USER_SET_TODAY, today);
    }
    public String getToday() {
        String today = (String)session.get(USER_SET_TODAY);
        if (today == null){
            today = DateUtils.getCurrentDate().toString();
            session.put(USER_SET_TODAY, today);
        }
        return today;
    }

    public  void cleanSession() {
        session.clear();
    }
}
