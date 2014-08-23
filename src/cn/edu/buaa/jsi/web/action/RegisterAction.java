package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.entities.Account;
import cn.edu.buaa.jsi.service.AccountService;
import cn.edu.buaa.jsi.utils.CipherUtil;
import cn.edu.buaa.jsi.utils.CommonUtils;

/**
 * 注册Action
 * @author songliu
 * @since 2014/08/19
 */
public class RegisterAction extends BaseAction {
    private String username;
    private String password;
    private String repassword;
    private AccountService accountService;
    private Account account = new Account();

    /**
     * 处理注册请求
     */
    @Override
    public String execute() throws Exception {
        if (username == null || password == null || repassword == null){
            return SUCCESS;
        }
        account.setAccountName(username);
        account.setAccountPassword(CipherUtil.generatePassword(password));
        if (accountService.saveAccount(account)) {
            return "login";
        }
        else {
            this.addFieldError("error", "faild to register");
            return "input";
        }
    }

    /**
     * 页面表单提交时，自动调用validate方法进行初步验证
     */
    @Override
    public void validate() {
        if (username == null || password == null || repassword == null){
            return;
        }
        if ("".equals(username)) {
            this.addFieldError("error", "username required");
        }
        if ("".equals(password)) {
            this.addFieldError("error", "password required");
        }
        if ("".equals(repassword)) {
            this.addFieldError("error", "retype your password");
        }
        else if (!"".equals(password) && !repassword.equals(password)) {
            this.addFieldError("error", "retype wrong");
        }
        if (accountService.hasAccount(username)){
            this.addFieldError("error", "username is already exist");
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

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
}
