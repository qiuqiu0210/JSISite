package cn.edu.buaa.jsi.hibernate.dao.impl;

import cn.edu.buaa.jsi.hibernate.dao.UserDao;
import cn.edu.buaa.jsi.entities.User;

import java.io.Serializable;
import java.util.List;

/**
 * 用户dao接口实现类
 * @author songliu
 * @since 2014/08/14
 */
public class UserDaoImpl extends BaseDaoImpl implements UserDao {
    /**
     * 查询所有用户
     * @return List<User>
     */
    @Override
    public List<User> findAllUser() {
        return this.findAll(User.class);
    }

    /**
     * 通过id查询用户
     * @param id
     * @return User
     */
    @Override
    public User findUserById(Serializable id) {
        return (User)this.findById(User.class, id);
    }

    /**
     * 根据多个属性查询用户
     * @param propertyNames
     * @param values
     * @return List<User>
     */
    @Override
    public List<User> findUserByProperties(String[] propertyNames, Object[] values) {
        return this.findByProperties(propertyNames, values, User.class);
    }

    /**
     * 保存或者更新一个用户
     * @param user
     * @return boolean
     */
    @Override
    public boolean saveOrUpdateUser(User user) {
        return this.saveOrUpdate(user);
    }

    /**
     * 删除一个用户
     * @param user
     * @return boolean
     */
    @Override
    public boolean deleteUser(User user) {
        return this.delete(user);
    }
}