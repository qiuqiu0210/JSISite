package cn.edu.buaa.jsi.service;

/**
 * @ClassName: UserService
 * @Description: 用户业务接口类
 * @author songliu
 * @date 2014-08-14
 *
 */
public interface UserService {

    /**
     *
     * @Title: validateUser
     * @Description: 验证系统登录用户是否存在
     * @param username
     * @param password
     * @return boolean
     * @throws
     */
    public boolean validateUser(String username,String password);
}