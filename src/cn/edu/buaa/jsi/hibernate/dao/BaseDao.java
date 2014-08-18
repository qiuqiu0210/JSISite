package cn.edu.buaa.jsi.hibernate.dao;

import org.hibernate.criterion.DetachedCriteria;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: BaseDao
 * @Description: dao层通用接口
 * @author songliu
 * @date 2014-08-14
 *
 */
public interface BaseDao {

    /**
     *
     * @Title: findById
     * @Description: 根据Id查询数据
     * @param @param clazz
     * @param @param id
     * @return Object
     * @throws
     */
    public Object findById(Class clazz,Serializable id);

    /**
     *
     * @Title: findByProperty
     * @Description: 根据条件属性查询
     * @param @param propertyName
     * @param @param value
     * @param @param clazz
     * @return List
     * @throws
     */
    public List findByProperty(String propertyName, Object value, Class clazz);

    /**
     *
     * @Title: findByProperties
     * @Description: 根据多个条件属性查询
     * @param propertyNames
     * @param values
     * @param clazz
     * @return List
     * @throws
     */
    public List findByProperties(String[] propertyNames, Object[] values, Class clazz);

    /**
     *
     * @Title: findAll
     * @Description: 根据具体的类查询数据
     * @param clazz
     * @return List
     * @throws
     */
    public List findAll(Class clazz);

    /**
     *
     * @Title: findByExample
     * @Description: 根据对象查询
     * @param instance
     * @return List
     * @throws
     */
    public List findByExample(Object instance);

    /**
     *
     * @Title: saveBatch
     * @Description: 批量保存
     * @param instances
     * @return boolean
     * @throws
     */
    public boolean saveBatch(final List instances);

    /**
     *
     * @Title: updateBatch
     * @Description: 批量更新
     * @param instances
     * @return boolean
     * @throws
     */
    public boolean updateBatch(final List instances);

    /**
     *
     * @Title: deleteBatch
     * @Description: 批量删除
     * @param instances
     * @return boolean
     * @throws
     */
    public boolean deleteBatch(final List instances);

    /**
     *
     * @Title: delete
     * @Description: 删除数据
     * @param instance
     * @return boolean
     * @throws
     */
    public boolean delete(Object instance);

    /**
     *
     * @Title: save
     * @Description: 保存数据
     * @param instance
     * @return void
     * @throws
     */
    public boolean save(Object instance);

    /**
     *
     * @Title: update
     * @Description: 更新数据
     * @param instance
     * @return void
     * @throws
     */
    public boolean update(Object instance);

    /**
     *
     * @Title: saveOrUpdate
     * @Description: 更新数据
     * @param instance
     * @return void
     * @throws
     */
    public boolean saveOrUpdate(Object instance);

    /**
     *
     * @Title: getCountByCriteria
     * @Description: 统计条数
     * @param detachedCriteria
     * @return int
     * @throws
     */
    public int getCountByCriteria(final DetachedCriteria detachedCriteria);

    /**
     *
     * @Title: findByCriteria
     * @Description: 分页查询
     * @param detachedCriteria
     * @param firstResult
     * @param maxResults
     * @return List
     * @throws
     */
    public List findByCriteria(final DetachedCriteria detachedCriteria,final int firstResult,final int maxResults);

    /**
     *
     * @Title: getCountByHql
     * @Description: 根据HQL 查询记录数
     * @param hql
     * @return int
     * @throws
     */
    public int getCountByHql(String hql);

    /**
     *
     * @Title: findByHql
     * @Description: 根据HQL 分页
     * @param hql
     * @param firstResult
     * @param maxResults
     * @return List
     * @throws
     */
    public List findByHql(final String hql,final int firstResult,final int maxResults);

    /**
     *
     * @Title: deleteByProperty
     * @Description: 根据属性删除
     * @param propertyName
     * @param value
     * @param clazz
     * @return boolean
     * @throws
     */
    public boolean deleteByProperty(final String propertyName,final Object value,final Class clazz);

    /**
     *
     * @Title: deleteByHql
     * @Description: 根据HQL 删除对应数据
     * @param hql
     * @param clazz
     * @return boolean
     * @throws
     */
    public boolean deleteByHql(final String hql,final Class clazz);

    /**
     *
     * @Title: deleteByPropertys
     * @Description: 根据多个条件属性删除数据
     * @param propertyNames
     * @param values
     * @param clazz
     * @return boolean
     * @throws
     */
    public boolean deleteByPropertys(final String[] propertyNames, final Object[] values, final Class clazz);
}  
