package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.entities.News;
import cn.edu.buaa.jsi.service.NewsService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home on 2014/8/19.
 */
public class NewsAction extends BaseAction {
    private NewsService newsService;

    @Override
    public String execute() {
        List<News> newsList = new ArrayList<News>();
        newsList = this.newsService.findAllNews();

        return null;
    }

    public void setNewsService(NewsService newsService) {
        this.newsService = newsService;
    }
}
