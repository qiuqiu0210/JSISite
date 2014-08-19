package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.Account;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Home on 2014/8/17.
 */
public interface AccountDao {
    public List<Account> findAllAccount();
    public Account findAccountById(Serializable id);
    public List<Account> findAccountByProperties(String[] propertyNames, Object[] values);
    public List<Account> findAccountByQuery(String query);

    public boolean saveOrUpdateAccount(Account account);
    public boolean saveAccount(Account account);
    public boolean updateAccount(Account account);

    public boolean removeAccount(Account account);
    public boolean removeAccountByProperty(String propertyNames, Object value);

    boolean isExist(String name);
    boolean isExist(String name, Serializable id);
}
