package cn.edu.buaa.jsi.service;

import cn.edu.buaa.jsi.entities.Account;

/**
 * Created by Home on 2014/8/17.
 */
public interface AccountService {
    public boolean addAccount (Account account);
    public boolean updateAccount (Account account);
    public boolean removeAccount (Account account);
//    public boolean validateAccount (String username, String password);
    public Account validateAccount (String username, String password);
    public boolean hasAccount (String username);
}
