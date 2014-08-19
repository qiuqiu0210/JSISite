package cn.edu.buaa.jsi.hibernate.dao.impl;

import cn.edu.buaa.jsi.entities.Group;
import cn.edu.buaa.jsi.hibernate.dao.GroupDao;

import java.util.List;

/**
 * Created by Administrator on 14-8-18.
 */
public class GroupDaoImpl extends BaseDaoImpl implements GroupDao {
    @Override
    public boolean saveGroup(Group group) {
        if (isExist(group.getGroupDisc())){
            System.out.println("Group is already exist");
            return false;
        }
        return this.save(group);
    }

    @Override
    public boolean saveAllGroup(List<Group> groupList) {
        for (Group group: groupList) {
            if (isExist(group.getGroupDisc())) {
                System.out.println("Group is already exist");
                return false;
            }
        }
        return this.saveBatch(groupList);
    }

    @Override
    public boolean isExist(String groupDisc) {
        List list = this.findByProperty("groupDisc", groupDisc, Group.class);
        if (!list.isEmpty()){
            return true;
        }
        return false;
    }
}
