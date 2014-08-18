package cn.edu.buaa.jsi.hibernate.dao.impl;

import cn.edu.buaa.jsi.hibernate.dao.AccountDao;
import cn.edu.buaa.jsi.entities.Account;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Home on 2014/8/17.
 */
public class AccountDaoImpl extends BaseDaoImpl implements AccountDao {
    @Override
    public List<Account> findAllAccount() {
        return this.findAll(Account.class);
    }

    @Override
    public Account findAccountById(Serializable id) {
        return (Account)this.findById(Account.class,id);
    }

    @Override
    public List<Account> findAccountByProperties(String[] propertyNames, Object[] values) {
        return this.findByProperties(propertyNames, values, Account.class);
    }

    @Override
    public List<Account> findAccountByQuery(String query) {
        return null;
    }

    @Override
    public boolean saveORupdateAccount(Account account) {
        return this.saveOrUpdate(account);
    }

    @Override
    public boolean removeAccount(Account account) {
        return this.delete(account);
    }

    @Override
    public boolean removeAccountByProperty(String propertyNames, Object value) {
        return this.deleteByProperty(propertyNames, value, Account.class);
    }

    @Override
    public boolean isExist(String name) {
        Account account = null;
        account = (Account)this.findByProperty("accountName", name, Account.class);
        if (account != null){
            return true;
        }
        return false;
    }

    @Override
    public boolean isExist(String name, Serializable id) {
        return false;
    }
}