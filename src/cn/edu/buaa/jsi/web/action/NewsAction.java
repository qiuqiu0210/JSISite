package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.entities.News;
import cn.edu.buaa.jsi.service.NewsService;
import cn.edu.buaa.jsi.utils.JsonUtils;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.json.annotations.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home on 2014/8/19.
 */
public class NewsAction extends BaseAction {
    private NewsService newsService;

    private String jsonList;
    private News news;

    @Override
    public String execute() {
        List<News> newsList = this.newsService.findAllNews();
        news = newsList.get(0);
        jsonList = JsonUtils.listToJson(newsList);
        System.out.println(jsonList);
        //test2
        ActionContext.getContext().getSession().put("newsList",newsList);
        return SUCCESS;
    }

    public void setNewsService(NewsService newsService) {
        this.newsService = newsService;
    }

    @JSON(name = "News")
    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    @JSON(name = "JsonList")
    public String getJsonList() {
        return jsonList;
    }

    public void setJsonList(String jsonList) {
        this.jsonList = jsonList;
    }
}
