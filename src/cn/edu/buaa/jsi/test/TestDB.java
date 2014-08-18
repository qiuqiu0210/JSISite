package cn.edu.buaa.jsi.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import cn.edu.buaa.jsi.hibernate.dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 14-8-14.
 */
public class TestDB {
    private static Logger log = LogManager.getLogger(TestDB.class.getName());
    private static UserDaoImpl db;
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        db = context.getBean(LoginAction.class);
//        db.setUsername("admin");
//        db.setPassword("123");
//        String ret = db.login();
        db = context.getBean(UserDaoImpl.class);
        List list = db.getHibernateTemplate().findByNamedQuery("findUserById",1);
        System.out.println(list);
        log.info("log4j test output is :" + list);
    }

//    public void setDb(LoginAction db) {
//        this.db = db;
//    }
}
