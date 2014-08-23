package cn.edu.buaa.jsi.service;

/**
 * 用户业务接口
 * @author songliu
 * @since 2014-08-14
 */
public interface UserService {
    /**
     * 验证系统登录用户是否存在
     * @param username
     * @param password
     * @return boolean
     */
    public boolean validateUser(String username,String password);
}