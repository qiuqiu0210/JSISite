package cn.edu.buaa.jsi.utils;

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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home on 2014-08-15.
 */
public class InitialDatebase {
    public static void main (String []args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        List<Group> groupList = new ArrayList<Group>();
        Group group = new Group();
        group.setGroupDisc("ADMIN");
        groupList.add(group);
        group = new Group();
        group.setGroupDisc("GUEST");
        groupList.add(group);
        GroupDao groupDao = context.getBean(GroupDao.class);
        if (groupDao.saveAllGroup(groupList)){
            Account account = new Account();
            account.setAccountName("admin");
            account.setAccountPassword(CipherUtil.generatePassword("123"));
            account.setGroup(groupList.get(0));
            AccountDao accountDao =context.getBean(AccountDao.class);
            if (accountDao.saveAccount(account)){
                System.out.println("yeah!");
            }
        }
        System.out.println("e...");
    }
}
