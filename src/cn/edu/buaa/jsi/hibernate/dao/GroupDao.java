package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.Group;

/**
 * Created by Administrator on 14-8-18.
 */
public interface GroupDao {
    public boolean saveGroup(Group group);
    public boolean isExist(String groupDisc);
}
