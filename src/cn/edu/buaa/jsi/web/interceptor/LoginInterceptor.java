package cn.edu.buaa.jsi.web.interceptor;

import cn.edu.buaa.jsi.entities.Account;
import cn.edu.buaa.jsi.service.AccountService;
import cn.edu.buaa.jsi.utils.CommonConstants;
import cn.edu.buaa.jsi.utils.CommonUtils;
import cn.edu.buaa.jsi.utils.CookieUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.struts2.StrutsStatics;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class LoginInterceptor extends AbstractInterceptor{
    private AccountService accountService;

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        ActionContext actionContext = invocation.getInvocationContext();
        HttpServletRequest request = (HttpServletRequest) actionContext.get(StrutsStatics.HTTP_REQUEST);

        String actionName = invocation.getProxy().getActionName();
//        if ("Main".equals(actionName)){
//            return "login";
//        }
        Map session = actionContext.getSession();
        if (session != null && session.get(CommonConstants.SESSION_KEY_USER_NAME) != null) {
            return invocation.invoke();
        }
        String value = CookieUtils.getLoginCookie(request);
        if (value != null){
            String[] split = value.split("==");
            String username = split[0];
            String password = split[1];
            Account account = accountService.validateAccount(username,password);
            if (account != null){
                session.put(CommonConstants.SESSION_KEY_USER_NAME,username);
                return invocation.invoke();
            }
        }
        setGoingToURL(session, invocation);
        if ("Login".equals(actionName)){
            return invocation.invoke();
        }
        return "login";
    }
    public void setGoingToURL(Map session, ActionInvocation invocation) {
        String url = "";
        String namespace = invocation.getProxy().getNamespace();
        if (!CommonUtils.isBlank(namespace) && !"/".equals(namespace)) {
            url = url + namespace;
        }
        String actionName = invocation.getProxy().getActionName();
        if (!CommonUtils.isBlank(actionName)) {
            url = url + "/" + actionName + ".action";
        }
        session.put(CommonConstants.GOING_TO_URL_KEY, url);
    }
}