package cn.edu.buaa.jsi.hibernate.dao.impl;

import cn.edu.buaa.jsi.entities.News;
import cn.edu.buaa.jsi.hibernate.dao.BaseDao;
import cn.edu.buaa.jsi.hibernate.dao.NewsDao;

import java.util.List;

/**
 * 新闻dao接口实现类
 * @author songliu
 * @since 2014/08/19
 */
public class NewsDaoImpl extends BaseDaoImpl implements NewsDao {
    @Override
    public List<News> findAllNews() {
        return this.findAll(News.class);
    }

    @Override
    public News findNewsById(int id) {
        return (News)this.findByProperty("newsId", id, News.class).get(0);
    }

    @Override
    public boolean saveNews(News news) {
        return this.save(news);
    }

    @Override
    public boolean updateNews(News news) {
        return this.update(news);
    }

    @Override
    public boolean deleteNewsById(int id) {
        return this.deleteByProperty("newsId", id, News.class);
    }
}
