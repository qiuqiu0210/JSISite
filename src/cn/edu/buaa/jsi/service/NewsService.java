package cn.edu.buaa.jsi.service;

import cn.edu.buaa.jsi.entities.News;

import java.util.List;

/**
 * Created by Home on 2014/8/19.
 */
public interface NewsService {
    public List<News> findAllNews();
}
