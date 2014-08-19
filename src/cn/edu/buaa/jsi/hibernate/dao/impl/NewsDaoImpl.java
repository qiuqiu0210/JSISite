package cn.edu.buaa.jsi.hibernate.dao.impl;

import cn.edu.buaa.jsi.entities.News;
import cn.edu.buaa.jsi.hibernate.dao.BaseDao;
import cn.edu.buaa.jsi.hibernate.dao.NewsDao;

import java.util.List;

/**
 * Created by Home on 2014/8/19.
 */
public class NewsDaoImpl extends BaseDaoImpl implements NewsDao {

    @Override
    public boolean saveNews(News news) {
        return false;
    }

    @Override
    public List<News> findAllNews() {
        return this.findAll(News.class);
    }
}
