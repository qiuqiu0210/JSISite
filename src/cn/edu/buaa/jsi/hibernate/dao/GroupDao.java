package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.Group;

import java.util.List;

/**
 * Created by Administrator on 14-8-18.
 */
public interface GroupDao {
    public boolean saveGroup(Group group);
    public boolean saveAllGroup(List<Group> groupList);
    public boolean isExist(String groupDisc);
}
