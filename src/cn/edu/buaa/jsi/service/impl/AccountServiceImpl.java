package cn.edu.buaa.jsi.service.impl;

import cn.edu.buaa.jsi.hibernate.dao.AccountDao;
import cn.edu.buaa.jsi.entities.Account;
import cn.edu.buaa.jsi.service.AccountService;
import cn.edu.buaa.jsi.utils.CipherUtil;
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
        return false;
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
    public boolean validateAccount(String username, String password) {
        String[] propertyNames = {"accountName", "accountPassword"};
        password = CipherUtil.generatePassword(password);
        String[] values = {username, password};
        List<Account> accountList = this.accountDao.findAccountByProperties(propertyNames, values);
        if (accountList.size() == 1) {
            log.info("account success!!!!");
            return true;
        } else {
            return false;
        }
    }
}
