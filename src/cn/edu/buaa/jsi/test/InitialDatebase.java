package cn.edu.buaa.jsi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Home on 2014-08-15.
 */
public class InitialDatebase {
    public static void main (String []args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
