package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.Group;

import java.util.List;

/**
 * 分组dao接口
 * @author songliu
 * @since 2014/08/17
 */
public interface GroupDao {
    /**
     * 保存分组
     * @param group
     * @return boolean
     */
    public boolean saveGroup(Group group);

    /**
     * 保存所有分组
     * @param groupList
     * @return boolean
     */
    public boolean saveAllGroups(List<Group> groupList);

    /**
     * 根据组名判断分组是否存在
     * @param groupDisc
     * @return boolean
     */
    public boolean isExist(String groupDisc);
}
