package cn.edu.buaa.jsi.service.impl;

import cn.edu.buaa.jsi.hibernate.dao.AccountDao;
import cn.edu.buaa.jsi.entities.Account;
import cn.edu.buaa.jsi.service.AccountService;
import cn.edu.buaa.jsi.utils.CipherUtil;
import cn.edu.buaa.jsi.utils.CommonUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Home on 2014/8/17.
 */
public class AccountServiceImpl implements AccountService {

    private static Logger log = LogManager.getLogger(UserServiceImpl.class.getName());

    private AccountDao accountDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public boolean addAccount(Account account) {
        return this.accountDao.saveAccount(account);
    }

    @Override
    public boolean updateAccount(Account account) {
        return false;
    }

    @Override
    public boolean removeAccount(Account account) {
        return false;
    }

    @Override
    public Account validateAccount(String username, String password) {
        if (CommonUtils.isBlank(username) || CommonUtils.isBlank(password)) {
            return null;
        }
        String[] propertyNames = {"accountName", "accountPassword"};
        password = CipherUtil.generatePassword(password);
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
}
