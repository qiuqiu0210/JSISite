package cn.edu.buaa.jsi.service.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import cn.edu.buaa.jsi.hibernate.dao.UserDao;
import cn.edu.buaa.jsi.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: 用户业务实现类
 * @author songliu
 * @date 2014-08-14
 *
 */
public class UserServiceImpl implements UserService {

    private static Logger log = LogManager.getLogger(UserServiceImpl.class.getName());

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * @Title: validateUser
     * @Description: 验证系统登录用户是否存在
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean validateUser(String username, String password) {
//        String[] propertyNames = {"userName","userPsw"};
//        String[] values = {username,password};
//        List<User> userList = this.userDao.getUserByProperties(propertyNames, values);
//        if(userList.size() == 1) {
//            log.info("success");
//            return true;
//        } else {
            return false;
//        }
    }
}