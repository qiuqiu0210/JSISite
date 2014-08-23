package cn.edu.buaa.jsi.service;

import cn.edu.buaa.jsi.entities.Account;
import com.opensymphony.xwork2.ActionContext;

import java.io.Serializable;
import java.util.List;

/**
 * 账号业务接口
 * @author songliu
 * @since 2014/08/17
 */
public interface AccountService {
    /**
     * 查询所有用户
     * @return
     */
    public List<Account> findAllAccounts();

    /**
     * 保存用户
     * @param account
     * @return
     */
    public boolean saveAccount (Account account);

    /**
     * 更新用户
     * @param account
     * @return
     */
    public boolean updateAccount (Account account);

    /**
     * 删除用户
     * @param account
     * @return
     */
    public boolean deleteAccount (Account account);

//    public boolean validateAccount (String username, String password);

    /**
     * 验证系统登录用户是否存在
     * @param username
     * @param password
     * @return boolean
     */
    public Account validateAccount (String username, String password);

    /**
     * 判断用户名是否存在
     * @param username
     * @return
     */
    public boolean hasAccount (String username);
}
