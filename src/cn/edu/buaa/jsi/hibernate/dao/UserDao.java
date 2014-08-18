package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.User;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: UserDao
 * @Description: 用户dao接口
 * @author songliu
 * @date 2014-08-14
 *
 */
public interface UserDao {

    /**
     *
     * @Title: getAllUser
     * @Description: 查询所有用户
     * @return List<User>
     * @throws
     */
    public List<User> getAllUser();

    /**
     *
     * @Title: getUserById
     * @Description: 通过id查询用户
     * @param id
     * @return Systemuser
     * @throws
     */
    public User getUserById(Serializable id);

    /**
     *
     * @Title: saveORupdateUser
     * @Description: 保存或者更新一个用户
     * @param user
     * @return boolean
     * @throws
     */
    public boolean saveORupdateUser(User user);

    /**
     *
     * @Title: removeUser
     * @Description: 删除一个用户
     * @param user
     * @return boolean
     * @throws
     */
    public boolean removeUser(User user);

    /**
     *
     * @Title: getUserByProperties
     * @Description: 根据多个属性查询用户
     * @param propertyNames
     * @param values
     * @return List<User>
     * @throws
     */
    public List<User> getUserByProperties(String[] propertyNames, Object[] values);
}