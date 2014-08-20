package cn.edu.buaa.jsi.web.action;

import cn.edu.buaa.jsi.entities.News;
import cn.edu.buaa.jsi.service.NewsService;
import cn.edu.buaa.jsi.utils.JsonUtils;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;
import org.hibernate.Session;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Home on 2014/8/19.
 */
public class NewsAction extends BaseAction {
    private NewsService newsService;
    private int id;
    private String jsonList;
    private News news;
    private File upload;//类型为File的xxx属性封装了该文件域对应的文件内容。（文中的 File upload属性中的upload就是下面两个string的属性的前缀）
    private String uploadFileName;//类型为String的xxxFileName属性封装了该文件域对应的文件的文件名。
    private String uploadContentType;//类型为String的xxxContentType属性封装了该文件域对应的文件的文件名。

    public String download() {
        return null;
    }
    public String addNews() throws Exception{
        if (news == null){
            return INPUT;
        }
        String path = ServletActionContext.getServletContext().getRealPath("/WEB-INF/upload");
        String[] fname = uploadFileName.split("\\.");
        String suffix = fname[fname.length-1];
        //news还未写入，故此处id只能为0
        String filename = path + File.separator + "pic_" + news.getNewsId() + "." + suffix;//新文件名
        if (upload != null) {
            File saveFile = new File(filename);
            if (!saveFile.getParentFile().exists()) {
                saveFile.getParentFile().mkdirs();
            }
            FileUtils.copyFile(upload, saveFile);
            ActionContext.getContext().put("message", "文件上传成功");
        }
        //有空写个TimeUtils
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String date = dateFormat.format(new Date());
//        Timestamp time = Timestamp.valueOf(date);
//        Timestamp time = new Timestamp(System.currentTimeMillis());
//        news.setNewsTime(time);
//        if (this.newsService.addNews(news)){
//            return SUCCESS;
//        }
        return INPUT;
    }

    public String delNews() {
        if (this.newsService.delNewsById(id)){
            return SUCCESS;
        }
        return INPUT;
    }

    public String modifyNews() {
        if (id != 0 && news == null){
            news = this.newsService.findNewsById(id);
            if (news != null){
                ActionContext.getContext().getSession().put("news", news);
                return SUCCESS;
            }
        }
        else if (news != null){
            if (this.newsService.modifyNews(news)){
                return SUCCESS;
            }
        }
        return INPUT;
    }

    @Override
    public String execute() {
        List<News> newsList = this.newsService.findAllNews();
        news = newsList.get(0);
        jsonList = JsonUtils.listToJson(newsList);
        System.out.println(jsonList);
        //test2
//        newsList = newsList.subList(0,3);//主页只显示三条新闻
        if (!newsList.isEmpty()) {
            Map session = ActionContext.getContext().getSession();
            session.remove("newsList");
            session.put("newsList", newsList);
            return SUCCESS;
        }
        return SUCCESS;
    }

    public void setNewsService(NewsService newsService) {
        this.newsService = newsService;
    }

//    @JSON(name = "News")
    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

//    @JSON(name = "JsonList")
    public String getJsonList() {
        return jsonList;
    }

    public void setJsonList(String jsonList) {
        this.jsonList = jsonList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }
}
