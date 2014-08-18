package cn.edu.buaa.jsi.hibernate.dao.impl;

import cn.edu.buaa.jsi.hibernate.dao.UserDao;
import cn.edu.buaa.jsi.entities.User;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: UserDaoImpl
 * @Description: 用户dao接口实现类
 * @author songliu
 * @date 2014-08-14
 *
 */
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

    /**
     * @Title: getAllUser
     * @Description: 查询所有用户
     * @return
     */
    @Override
    public List<User> getAllUser() {
        return this.findAll(User.class);
    }

    /**
     * @Title: getUserById
     * @Description: 通过id查询用户
     * @param id
     * @return
     */
    @Override
    public User getUserById(Serializable id) {
        return (User)this.findById(User.class, id);
    }

    /**
     * @Title: saveORupdateUser
     * @Description: 保存或者更新一个用户
     * @param user
     * @return
     */
    @Override
    public boolean saveORupdateUser(User user) {
        return this.saveOrUpdate(user);
    }

    /**
     * @Title: removeUser
     * @Description: 删除一个用户
     * @param user
     * @return
     */
    @Override
    public boolean removeUser(User user) {
        return this.delete(user);
    }

    /**
     * @Title: getUserByProperties
     * @Description: 根据多个属性查询用户
     * @param propertyNames
     * @param values
     * @return
     */
    @Override
    public List<User> getUserByProperties(String[] propertyNames, Object[] values) {
        return this.findByProperties(propertyNames, values, User.class);
    }

}