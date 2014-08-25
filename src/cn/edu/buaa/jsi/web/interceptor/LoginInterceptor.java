package cn.edu.buaa.jsi.web.interceptor;

import cn.edu.buaa.jsi.entities.Account;
import cn.edu.buaa.jsi.service.AccountService;
import cn.edu.buaa.jsi.utils.Constants;
import cn.edu.buaa.jsi.utils.CommonUtils;
import cn.edu.buaa.jsi.utils.CookieUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.struts2.StrutsStatics;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 登录及权限拦截器
 * @author songliu
 * @since 2014/08/19
 */
public class LoginInterceptor extends AbstractInterceptor{
    private AccountService accountService;

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * 判断用户是否登录，以及是否存在登录Cookie
     * @param invocation
     * @return
     * @throws Exception
     */
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        ActionContext actionContext = invocation.getInvocationContext();
        HttpServletRequest request = (HttpServletRequest) actionContext.get(StrutsStatics.HTTP_REQUEST);

        String actionName = invocation.getProxy().getActionName();
        Map session = actionContext.getSession();
        if (session != null && session.get(Constants.SESSION_KEY_USER_NAME) != null) {
            return invocation.invoke();
        }
        String value = CookieUtils.getLoginCookie(request);
        if (value != null){
            String[] split = value.split("==");
            String username = split[0];
            String password = split[1];
            Account account = accountService.validateAccount(username,password);
            if (account != null){
                session.put(Constants.SESSION_KEY_USER_NAME,username);
                return invocation.invoke();
            }
        }
        setGoingToURL(session, invocation);
//        if ("Login".equals(actionName)){
//            return invocation.invoke();
//        }
        // 需要将有权限限制的action放入一个表中，然后每次判断登录用户是否拥有权限访问
        // 登录用户没有权限访问，返回无权限提示界面 return noAuth
        // 没有登录但访问页面需要权限，则返回Login界面 return noLogin
        // 没有登录访问没有权限限制的页面，直接执行action
        return invocation.invoke();
    }

    /**
     * 保存跳转前路径，便于登录后返回
     * @param session
     * @param invocation
     */
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
        session.put(Constants.GOING_TO_URL_KEY, url);
    }
}