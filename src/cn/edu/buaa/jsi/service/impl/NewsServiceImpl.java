package cn.edu.buaa.jsi.service.impl;

import cn.edu.buaa.jsi.entities.News;
import cn.edu.buaa.jsi.hibernate.dao.NewsDao;
import cn.edu.buaa.jsi.service.NewsService;

import java.util.List;

/**
 * Created by Home on 2014/8/19.
 */
public class NewsServiceImpl implements NewsService {
    private NewsDao newsDao;
    @Override
    public List<News> findAllNews() {
        return this.newsDao.findAllNews();
    }

    public void setNewsDao(NewsDao newsDao) {
        this.newsDao = newsDao;
    }
}
