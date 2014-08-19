package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.News;

import java.util.List;

/**
 * Created by Home on 2014/8/19.
 */
public interface NewsDao {
    public boolean saveNews(News news);
    public List<News> findAllNews();
}
