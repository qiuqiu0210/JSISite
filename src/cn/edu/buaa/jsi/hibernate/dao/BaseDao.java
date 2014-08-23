package cn.edu.buaa.jsi.hibernate.dao;

import org.hibernate.criterion.DetachedCriteria;

import java.io.Serializable;
import java.util.List;

/**
 * dao层通用接口
 * @author songliu
 * @since 2014/08/14
 */
public interface BaseDao {
    /**
     * 根据Id查询数据
     * @param clazz
     * @param id
     * @return Object
     */
    public Object findById(Class clazz,Serializable id);

    /**
     * 根据条件属性查询
     * @param propertyName
     * @param value
     * @param clazz
     * @return List
     */
    public List findByProperty(String propertyName, Object value, Class clazz);

    /**
     * 根据多个条件属性查询
     * @param propertyNames
     * @param values
     * @param clazz
     * @return List
     */
    public List findByProperties(String[] propertyNames, Object[] values, Class clazz);

    /**
     * 根据具体的类查询数据
     * @param clazz
     * @return List
     */
    public List findAll(Class clazz);

    /**
     * 根据对象查询
     * @param instance
     * @return List
     */
    public List findByExample(Object instance);

    /**
     * 批量保存
     * @param instances
     * @return boolean
     */
    public boolean saveBatch(final List instances);

    /**
     * 批量更新
     * @param instances
     * @return boolean
     */
    public boolean updateBatch(final List instances);

    /**
     * 批量删除
     * @param instances
     * @return boolean
     */
    public boolean deleteBatch(final List instances);

    /**
     * 删除数据
     * @param instance
     * @return boolean
     */
    public boolean delete(Object instance);

    /**
     * 保存数据
     * @param instance
     * @return void
     */
    public boolean save(Object instance);

    /**
     * 更新数据
     * @param instance
     * @return void
     */
    public boolean update(Object instance);

    /**
     * 更新数据
     * @param instance
     * @return void
     */
    public boolean saveOrUpdate(Object instance);

    /**
     * 统计条数
     * @param detachedCriteria
     * @return int
     */
    public int getCountByCriteria(final DetachedCriteria detachedCriteria);

    /**
     * 分页查询
     * @param detachedCriteria
     * @param firstResult
     * @param maxResults
     * @return List
     */
    public List findByCriteria(final DetachedCriteria detachedCriteria,final int firstResult,final int maxResults);

    /**
     * 根据HQL 查询记录数
     * @param hql
     * @return int
     */
    public int getCountByHql(String hql);

    /**
     * 根据HQL 分页
     * @param hql
     * @param firstResult
     * @param maxResults
     * @return List
     */
    public List findByHql(final String hql,final int firstResult,final int maxResults);

    /**
     * 根据属性删除
     * @param propertyName
     * @param value
     * @param clazz
     * @return boolean
     */
    public boolean deleteByProperty(final String propertyName,final Object value,final Class clazz);

    /**
     * 根据HQL 删除对应数据
     * @param hql
     * @param clazz
     * @return boolean
     */
    public boolean deleteByHql(final String hql,final Class clazz);

    /**
     * 根据多个条件属性删除数据
     * @param propertyNames
     * @param values
     * @param clazz
     * @return boolean
     */
    public boolean deleteByPropertys(final String[] propertyNames, final Object[] values, final Class clazz);
}  
