package cn.edu.buaa.jsi.entities;

/**
 *
 * @author songliu
 * @since 2014/08/17
 */
public class Account {
    private int accountId;
    private String accountName;
    private String accountPassword;
    private Group group;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (accountId != account.accountId) return false;
        if (accountName != null ? !accountName.equals(account.accountName) : account.accountName != null) return false;
        if (accountPassword != null ? !accountPassword.equals(account.accountPassword) : account.accountPassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accountId;
        result = 31 * result + (accountName != null ? accountName.hashCode() : 0);
        result = 31 * result + (accountPassword != null ? accountPassword.hashCode() : 0);
        return result;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
