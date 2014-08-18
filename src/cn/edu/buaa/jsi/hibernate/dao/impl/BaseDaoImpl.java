package cn.edu.buaa.jsi.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import cn.edu.buaa.jsi.hibernate.dao.BaseDao;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * @ClassName: BaseDaoImpl
 * @Description: dao层通用接口实现类
 * @author songliu
 * @date 2014-08-14
 *
 */
public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao {

    private static Logger log = LogManager.getLogger(BaseDaoImpl.class.getName());

    /**
     * @Title: findById
     * @Description: 根据Id查询数据
     * @param clazz
     * @param id
     * @return object
     */
    @Override
    public Object findById(Class clazz, Serializable id) {
        log.debug("getting instance with id: " + id);
        try {
            Object instance = this.getHibernateTemplate().get(clazz, id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    /**
     * @Title: findByProperty
     * @Description: 根据条件属性查询
     * @param propertyName
     * @param value
     * @param clazz
     * @return List
     */
    @Override
    public List findByProperty(String propertyName, Object value, Class clazz) {
        try {
            String queryString = "from " + clazz.getSimpleName() +" as model where model." + propertyName + "= ?";
            return this.getHibernateTemplate().find(queryString, value);
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    /**
     * @Title: findByProperties
     * @Description: 根据多个条件属性查询
     * @param propertyNames
     * @param values
     * @param clazz
     * @return List
     */
    @Override
    public List findByProperties(String[] propertyNames, Object[] values,
                                Class clazz) {
        try {
            String queryString = "from " + clazz.getSimpleName() +" as model ";
            for(int i=0;i<propertyNames.length;i++){
                if(i==0){
                    queryString += "where model." + propertyNames[i] + "= ? ";
                }else{
                    queryString += "and model." + propertyNames[i] + "= ? ";
                }
            }
            return this.getHibernateTemplate().find(queryString, values);
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    /**
     * @Title: findAll
     * @Description: 根据具体的类查询数据
     * @param clazz
     * @return List
     */
    @Override
    public List findAll(Class clazz) {
        log.debug("finding instance by Class");
        try {
            List results = getHibernateTemplate().find("from " + clazz.getSimpleName());
            log.debug("find by Class successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by Class failed", re);
            throw re;
        }
    }

    /**
     * @Title: findByExample
     * @Description: 根据对象查询
     * @param instance
     * @return List
     */
    @Override
    public List findByExample(Object instance) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @Title: saveBatch
     * @Description: 批量保存
     * @param instances
     * @return boolean
     */
    @Override
    public boolean saveBatch(final List instances) {
        log.debug("saving batch instances");
        try {
            if(instances!=null&&instances.size()>0){
                getHibernateTemplate().execute(new HibernateCallback(){
                    public Object doInHibernate(Session session)throws HibernateException {
                        for(Object instance:instances){
                            session.save(instance);
                        }
                        return null;
                    }
                });
            }
        } catch (RuntimeException re) {
            log.error("save batch instances failed", re);
            //throw re;
            return false;
        }
        return true;
    }

    /**
     * @Title: updateBatch
     * @Description: 批量更新
     * @param instances
     * @return boolean
     */
    @Override
    public boolean updateBatch(final List instances) {
        log.debug("updating batch instances");
        try {
            if(instances!=null&&instances.size()>0){
                getHibernateTemplate().execute(new HibernateCallback(){
                    public Object doInHibernate(Session session)throws HibernateException {
                        for(Object instance:instances){
                            session.update(instance);
                        }
                        return null;
                    }
                });
            }
        } catch (RuntimeException re) {
            log.error("update batch instances failed", re);
            //throw re;
            return false;
        }
        return true;
    }

    /**
     * @Title: deleteBatch
     * @Description: 批量删除
     * @param instances
     * @return boolean
     */
    @Override
    public boolean deleteBatch(final List instances) {
        log.debug("deleting batch instances");
        try {
            if(instances!=null&&instances.size()>0){
                getHibernateTemplate().execute(new HibernateCallback() {
                    public Object doInHibernate(Session session)throws HibernateException {
                        for(Object instance:instances){
                            session.delete(instance);
                        }
                        return null;
                    }
                });
            }
        } catch (RuntimeException re) {
            log.error("delete batch instances failed", re);
            //throw re;
            return false;
        }
        return true;
    }

    /**
     * @Title: delete
     * @Description: 删除数据
     * @param instance
     * @return boolean
     */
    @Override
    public boolean delete(Object instance) {
        log.debug("deleting instance");
        try {
            getHibernateTemplate().delete(instance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            //throw re;
            return false;
        }
        return true;
    }

    /**
     * @Title: save
     * @Description: 保存数据
     * @param instance
     */
    @Override
    public boolean save(Object instance) {
        log.debug("save instance");
        try{
            getHibernateTemplate().save(instance);
            log.debug("save successful");
        }catch (RuntimeException e){
            log.error("save failed", e);
            //throw e;
            return false;
        }
        return true;
    }

    /**
     * @Title: update
     * @Description: 更新数据
     * @param instance
     */
    @Override
    public boolean update(Object instance) {
        log.debug("update instance");
        try{
            getHibernateTemplate().update(instance);
            log.debug("update successful");
        }catch (RuntimeException e){
            log.error("update failed", e);
            //throw e;
            return false;
        }
        return true;
    }
    /**
     * @Title: saveOrUpdate
     * @Description: 更新数据
     * @param instance
     */
    @Override
    public boolean saveOrUpdate(Object instance) {
        log.debug("saveOrUpdate instance");
        try{
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("saveOrUpdate successful");
        }catch (RuntimeException e){
            log.error("saveOrUpdate failed", e);
            //throw e;
            return false;
        }
        return true;
    }

    /**
     * @Title: getCountByCriteria
     * @Description: 统计条数
     * @param detachedCriteria
     * @return int
     */
    @Override
    public int getCountByCriteria(final DetachedCriteria detachedCriteria) {
        String sCount = (String)getHibernateTemplate().execute(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException {
                Criteria criteria = detachedCriteria.getExecutableCriteria(session);
                return criteria.setProjection(Projections.rowCount()).uniqueResult().toString();
            }
        });
        return Integer.parseInt(sCount);
    }

    /**
     * @Title: findByCriteria
     * @Description: 分页查询
     * @param detachedCriteria
     * @param firstResult
     * @param maxResults
     * @return List
     */
    @Override
    public List findByCriteria(final DetachedCriteria detachedCriteria,
                               final int firstResult, final int maxResults) {
        return (List) getHibernateTemplate().execute(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException {
                Criteria criteria = detachedCriteria.getExecutableCriteria(session);
                if(firstResult>0)
                    criteria.setFirstResult(firstResult);
                if(maxResults>0)
                    criteria.setMaxResults(maxResults);
                return criteria.list();
            }
        });
    }

    /**
     * @Title: getCountByHql
     * @Description: 根据HQL 查询记录数
     * @param hql
     * @return int
     */
    @Override
    public int getCountByHql(String hql) {
        String count = getHibernateTemplate().find(hql).listIterator().next().toString();
        return Integer.parseInt(count);
    }

    /**
     * @Title: findByHql
     * @Description: 根据HQL 分页
     * @param hql
     * @param firstResult
     * @param maxResults
     * @return List
     */
    @Override
    public List findByHql(final String hql, final int firstResult, final int maxResults) {
        return (List) getHibernateTemplate().execute(new HibernateCallback() {
            public Object doInHibernate(Session session)
                    throws HibernateException {
                Query query = (Query) session.createQuery(hql);
                if(firstResult>0)
                    query.setFirstResult(firstResult);

                if(maxResults>0)
                    query.setMaxResults(maxResults);
                List list = query.list();
                return list;
            }
        });
    }

    /**
     * @Title: deleteByProperty
     * @Description: 根据属性删除
     * @param propertyName
     * @param value
     * @param clazz
     * @return boolean
     */
    @Override
    public boolean deleteByProperty(final String propertyName,final Object value,final Class clazz) {
        try {
            getHibernateTemplate().execute(new HibernateCallback() {
                public Object doInHibernate(Session session)throws HibernateException {
                    String hqlDelete = "delete " + clazz.getSimpleName() + " model where model." + propertyName + "= :" + propertyName;
                    session.createQuery( hqlDelete )
                            .setParameter(propertyName, value).executeUpdate();
                    return null;
                }
            });
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            //throw re;
            return false;
        }
        return true;
    }

    /**
     * @Title: deleteByHql
     * @Description: 根据HQL 删除对应数据
     * @param hql
     * @param clazz
     * @return boolean
     */
    @Override
    public boolean deleteByHql(final String hql, final Class clazz) {
        try {
            getHibernateTemplate().execute(new HibernateCallback() {
                public Object doInHibernate(Session session)throws HibernateException {
                    String hqlDelete = "delete " + clazz.getSimpleName() + " where " + hql;
                    session.createQuery( hqlDelete ).executeUpdate();
                    return null;
                }
            });
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            //throw re;
            return false;
        }
        return true;
    }

    /**
     * @Title: deleteByPropertys
     * @Description: 根据多个条件属性删除数据
     * @param propertyNames
     * @param values
     * @param clazz
     * @return boolean
     */
    @Override
    public boolean deleteByPropertys(final String[] propertyNames, final Object[] values,
                                     final Class clazz) {
        try {
            getHibernateTemplate().execute(new HibernateCallback() {
                public Object doInHibernate(Session session)throws HibernateException {
                    String hqlDelete = "delete " + clazz.getSimpleName() +" model ";
                    for(int i=0;i<propertyNames.length;i++){
                        String propertyName = propertyNames[i];
                        if(i==0){
                            hqlDelete += "where model." + propertyName + "= :" + propertyName + " ";
                        }else{
                            hqlDelete += "and model." + propertyName + "= :" + propertyName + " ";
                        }
                    }
                    Query query = session.createQuery(hqlDelete);
                    for(int i=0;i<propertyNames.length;i++){
                        String propertyName = propertyNames[i];
                        if(values.length>=i){
                            query.setParameter(propertyName, values[i]);
                        }

                    }
                    query.executeUpdate();
                    return null;
                }
            });
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            //throw re;
            return false;
        }
        return true;
    }
}
