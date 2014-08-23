package cn.edu.buaa.jsi.entities;

/**
 *
 * @author songliu
 * @since 2014/08/17
 */
public class Group {
    private int groupId;
    private String groupDisc;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupDisc() {
        return groupDisc;
    }

    public void setGroupDisc(String groupDisc) {
        this.groupDisc = groupDisc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (groupId != group.groupId) return false;
        if (groupDisc != null ? !groupDisc.equals(group.groupDisc) : group.groupDisc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupId;
        result = 31 * result + (groupDisc != null ? groupDisc.hashCode() : 0);
        return result;
    }
}
