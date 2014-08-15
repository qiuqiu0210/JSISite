package cn.edu.buaa.jsi.entities;

/**
 * @ClassName: User
 * @Description: User实体
 * @author songliu
 * @date 2014-08-15
 *
 */
public class User {
    private int userId;
    private String userName;
    private String userPsw;
    private String userAuth;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (userAuth != null ? !userAuth.equals(user.userAuth) : user.userAuth != null) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (userPsw != null ? !userPsw.equals(user.userPsw) : user.userPsw != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPsw != null ? userPsw.hashCode() : 0);
        result = 31 * result + (userAuth != null ? userAuth.hashCode() : 0);
        return result;
    }
}
