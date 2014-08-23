package cn.edu.buaa.jsi.hibernate.dao.impl;

import cn.edu.buaa.jsi.entities.Group;
import cn.edu.buaa.jsi.hibernate.dao.GroupDao;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * 分组dao接口
 * @author songliu
 * @since 2014/08/18
 */
public class GroupDaoImpl extends BaseDaoImpl implements GroupDao {
    private static Logger log = LogManager.getLogger(GroupDaoImpl.class.getName());

    @Override
    public boolean saveGroup(Group group) {
        if (isExist(group.getGroupDisc())){
            System.out.println("Group is already exist");
            return false;
        }
        return this.save(group);
    }

    @Override
    public boolean saveAllGroups(List<Group> groupList) {
        for (Group group: groupList) {
            if (isExist(group.getGroupDisc())) {
                log.debug("Group is already exist");
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
