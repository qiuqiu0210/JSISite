package cn.edu.buaa.jsi.service.impl;

import cn.edu.buaa.jsi.hibernate.dao.AccountDao;
import cn.edu.buaa.jsi.entities.Account;
import cn.edu.buaa.jsi.service.AccountService;
import cn.edu.buaa.jsi.utils.CommonUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * 账号业务实现类
 * @author songliu
 * @since 2014/08/17
 */
public class AccountServiceImpl implements AccountService {
    private static Logger log = LogManager.getLogger(AccountServiceImpl.class.getName());

    private AccountDao accountDao;

    @Override
    public List<Account> findAllAccounts() {
        return this.accountDao.findAllAccounts();
    }

    @Override
    public boolean saveAccount(Account account) {
        return this.accountDao.saveAccount(account);
    }

    @Override
    public boolean updateAccount(Account account) {
        return false;
    }

    @Override
    public boolean deleteAccount(Account account) {
        return false;
    }

    @Override
    public Account validateAccount(String username, String password) {
        if (CommonUtils.isBlank(username) || CommonUtils.isBlank(password)) {
            return null;
        }
        String[] propertyNames = {"accountName", "accountPassword"};
        String[] values = {username, password};
        List<Account> accountList = this.accountDao.findAccountByProperties(propertyNames, values);
        if (accountList.size() == 1) {
            log.info("account success!!!!");
            return accountList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public boolean hasAccount(String username) {
        return this.accountDao.isExist(username);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
