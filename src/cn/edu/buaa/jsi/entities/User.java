package cn.edu.buaa.jsi.entities;

import java.sql.Timestamp;

/**
 * Created by Home on 2014/8/17.
 */
public class User {
    private int id;
    private int userId;
    private String userName;
    private String userSex;
    private String userEmail;
    private String userQq;
    private String userPhone;
    private String userQuestion;
    private String userAnswer;
    private Timestamp userCreatedate;
    private Timestamp userLastdate;
    private Account account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserQuestion() {
        return userQuestion;
    }

    public void setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public Timestamp getUserCreatedate() {
        return userCreatedate;
    }

    public void setUserCreatedate(Timestamp userCreatedate) {
        this.userCreatedate = userCreatedate;
    }

    public Timestamp getUserLastdate() {
        return userLastdate;
    }

    public void setUserLastdate(Timestamp userLastdate) {
        this.userLastdate = userLastdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (userAnswer != null ? !userAnswer.equals(user.userAnswer) : user.userAnswer != null) return false;
        if (userCreatedate != null ? !userCreatedate.equals(user.userCreatedate) : user.userCreatedate != null)
            return false;
        if (userEmail != null ? !userEmail.equals(user.userEmail) : user.userEmail != null) return false;
        if (userLastdate != null ? !userLastdate.equals(user.userLastdate) : user.userLastdate != null) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (userPhone != null ? !userPhone.equals(user.userPhone) : user.userPhone != null) return false;
        if (userQq != null ? !userQq.equals(user.userQq) : user.userQq != null) return false;
        if (userQuestion != null ? !userQuestion.equals(user.userQuestion) : user.userQuestion != null) return false;
        if (userSex != null ? !userSex.equals(user.userSex) : user.userSex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userSex != null ? userSex.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userQq != null ? userQq.hashCode() : 0);
        result = 31 * result + (userPhone != null ? userPhone.hashCode() : 0);
        result = 31 * result + (userQuestion != null ? userQuestion.hashCode() : 0);
        result = 31 * result + (userAnswer != null ? userAnswer.hashCode() : 0);
        result = 31 * result + (userCreatedate != null ? userCreatedate.hashCode() : 0);
        result = 31 * result + (userLastdate != null ? userLastdate.hashCode() : 0);
        return result;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
