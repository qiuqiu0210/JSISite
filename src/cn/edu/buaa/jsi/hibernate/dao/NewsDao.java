package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.News;

import java.util.List;

/**
 * Created by Home on 2014/8/19.
 */
public interface NewsDao {
    public News findNewsById(int id);
    public List<News> findAllNews();
    public boolean saveNews(News news);
    public boolean updateNews(News news);
    public boolean delNewsById(int id);
}
