package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.Account;

import java.io.Serializable;
import java.util.List;

/**
 * 账号dao接口
 * @author songliu
 * @since 2014/08/17
 */
public interface AccountDao {
    /**
     * 查询所有用户
     * @return List<Account>
     */
    public List<Account> findAllAccounts();

    /**
     * 通过id查询用户
     * @param id
     * @return Account
     */
    public Account findAccountById(Serializable id);

    /**
     * 根据多个属性查询用户
     * @param propertyNames
     * @param values
     * @return List<Account>
     */
    public List<Account> findAccountByProperties(String[] propertyNames, Object[] values);

    /**
     * 根据hql 查询用户
     * @param query
     * @return List<Account>
     */
    public List<Account> findAccountByQuery(String query);

    /**
     * 保存或者更新一个用户
     * @param account
     * @return boolean
     */
    public boolean saveOrUpdateAccount(Account account);

    /**
     * 保存用户
     * @param account
     * @return boolean
     */
    public boolean saveAccount(Account account);

    /**
     * 更新用户
     * @param account
     * @return boolean
     */
    public boolean updateAccount(Account account);

    /**
     * 删除用户
     * @param account
     * @return boolean
     */
    public boolean deleteAccount(Account account);

    /**
     * 根据属性删除用户
     * @param propertyNames
     * @param value
     * @return boolean
     */
    public boolean deleteAccountByProperty(String propertyNames, Object value);

    /**
     * 根据用户名判断用户是否存在
     * @param name
     * @return boolean
     */
    boolean isExist(String name);

    /**
     * 根据用户名和id判断用户是否存在
     * @param name
     * @param id
     * @return boolean
     */
    boolean isExist(String name, Serializable id);
}
