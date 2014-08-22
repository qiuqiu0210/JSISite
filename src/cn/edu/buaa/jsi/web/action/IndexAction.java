package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.entities.News;
import cn.edu.buaa.jsi.service.NewsService;
import cn.edu.buaa.jsi.utils.StringUtils;
import com.opensymphony.xwork2.ActionContext;

import java.util.List;
import java.util.Map;

/**
 * Created by Home on 2014/8/18.
 */
public class IndexAction extends BaseAction {
    private NewsService newsService;

    public String execute() throws Exception {
        List<News> newsList = this.newsService.findAllNews();

        if (!newsList.isEmpty()) {
            for (News news: newsList) {
                news.setNewsContent(StringUtils.splitChinese("UTF-8", StringUtils.stringNoBlank(news.getNewsContent()), 250) + "...");
            }
            Map session = ActionContext.getContext().getSession();
            session.remove("newsList");
            session.put("newsList", newsList);
            return SUCCESS;
        }
        return SUCCESS;
    }

    public NewsService getNewsService() {
        return newsService;
    }

    public void setNewsService(NewsService newsService) {
        this.newsService = newsService;
    }
}
