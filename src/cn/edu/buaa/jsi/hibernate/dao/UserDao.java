package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.User;

import java.io.Serializable;
import java.util.List;

/**
 * 用户dao接口
 * @author songliu
 * @since 2014/08/14
 */
public interface UserDao {
    /**
     * 查询所有用户
     * @return List<User>
     */
    public List<User> findAllUser();

    /**
     * 通过id查询用户
     * @param id
     * @return User
     */
    public User findUserById(Serializable id);

    /**
     * 根据多个属性查询用户
     * @param propertyNames
     * @param values
     * @return List<User>
     */
    public List<User> findUserByProperties(String[] propertyNames, Object[] values);

    /**
     * 保存或者更新一个用户
     * @param user
     * @return boolean
     */
    public boolean saveOrUpdateUser(User user);

    /**
     * 删除一个用户
     * @param user
     * @return boolean
     */
    public boolean deleteUser(User user);
}