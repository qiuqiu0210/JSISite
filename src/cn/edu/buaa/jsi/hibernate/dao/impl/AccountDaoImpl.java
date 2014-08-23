package cn.edu.buaa.jsi.hibernate.dao.impl;

import cn.edu.buaa.jsi.hibernate.dao.AccountDao;
import cn.edu.buaa.jsi.entities.Account;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.List;

/**
 * 账号dao接口实现类
 * @author songliu
 * @since 2014/08/17
 */
public class AccountDaoImpl extends BaseDaoImpl implements AccountDao {
    private static Logger log = LogManager.getLogger(AccountDaoImpl.class.getName());

    @Override
    public List<Account> findAllAccounts() {
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
    public boolean saveOrUpdateAccount(Account account) {
        return this.saveOrUpdate(account);
    }

    @Override
    public boolean saveAccount(Account account) {
        if (isExist(account.getAccountName())){
            log.debug("Account is already exist");
            return false;
        }
        return this.save(account);
    }

    @Override
    public boolean updateAccount(Account account) {
        return this.update(account);
    }

    @Override
    public boolean deleteAccount(Account account) {
        return this.delete(account);
    }

    @Override
    public boolean deleteAccountByProperty(String propertyNames, Object value) {
        return this.deleteByProperty(propertyNames, value, Account.class);
    }

    @Override
    public boolean isExist(String name) {
        List list = this.findByProperty("accountName", name, Account.class);
        if (!list.isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public boolean isExist(String name, Serializable id) {
        return false;
    }
}
