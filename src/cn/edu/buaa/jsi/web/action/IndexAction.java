package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.entities.News;
import cn.edu.buaa.jsi.service.NewsService;
import cn.edu.buaa.jsi.utils.StringUtils;
import com.opensymphony.xwork2.ActionContext;

import java.util.List;
import java.util.Map;

/**
 * index页面对应Action
 * <p>准备index页面显示内容<br>
 * @author songliu
 * @since 2014/08/19
 */
public class IndexAction extends BaseAction {
    private NewsService newsService;

    /**
     * 重写ActionSupport中的execute()方法，接受前端请求的默认方法
     * <p>准备首页显示所需的新闻等信息<br>
     * @return SUCCESS
     */
    @Override
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
