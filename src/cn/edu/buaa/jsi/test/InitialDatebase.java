package cn.edu.buaa.jsi.test;

import cn.edu.buaa.jsi.entities.Account;
import cn.edu.buaa.jsi.entities.Group;
import cn.edu.buaa.jsi.entities.User;
import cn.edu.buaa.jsi.hibernate.dao.AccountDao;
import cn.edu.buaa.jsi.hibernate.dao.GroupDao;
import cn.edu.buaa.jsi.hibernate.dao.impl.AccountDaoImpl;
import cn.edu.buaa.jsi.hibernate.dao.impl.GroupDaoImpl;
import cn.edu.buaa.jsi.utils.CipherUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Home on 2014-08-15.
 */
public class InitialDatebase {
    public static void main (String []args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Group group = new Group();
        group.setGroupDisc("ADMIN");
        GroupDao groupDao = context.getBean(GroupDao.class);
        if (groupDao.saveGroup(group)){
            Account account = new Account();
            account.setAccountName("admin");
            account.setAccountPassword(CipherUtil.generatePassword("123"));
            account.setGroup(group);
            AccountDao accountDao =context.getBean(AccountDao.class);
            if (accountDao.saveORupdateAccount(account)){
                System.out.println("yeah!");
            }
        }
        System.out.println("e...");
    }
}
