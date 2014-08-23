package cn.edu.buaa.jsi.service.impl;

import cn.edu.buaa.jsi.entities.News;
import cn.edu.buaa.jsi.hibernate.dao.NewsDao;
import cn.edu.buaa.jsi.service.NewsService;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 新闻业务实现类
 * @author songliu
 * @since 2014/08/19
 */
public class NewsServiceImpl implements NewsService {
    private static Logger log = LogManager.getLogger(NewsServiceImpl.class.getName());

    private NewsDao newsDao;

    @Override
    public List<News> findAllNews() {
        return this.newsDao.findAllNews();
    }

    @Override
    public News findNewsById(int id) {
        return this.newsDao.findNewsById(id);
    }

    @Override
    public boolean saveNews(News news) {
        return this.newsDao.saveNews(news);
    }

    @Override
    public boolean saveNewsAndPhoto(News news, File oldFile, File newFile) {
        if (!newFile.getParentFile().exists()) {
            log.debug("文件路径不存在，创建路径");
            newFile.getParentFile().mkdirs();
        }
        try {
            FileUtils.copyFile(oldFile, newFile);
            return this.newsDao.saveNews(news);
        } catch (IOException e) {
            log.error("get failed " + e);
            return false;
        }
    }

    @Override
    public boolean updateNews(News news) {
        return this.newsDao.updateNews(news);
    }

    @Override
    public boolean deleteNewsById(int id) {
        News news = this.newsDao.findNewsById(id);
        String filePath = ServletActionContext.getServletContext().getRealPath("/")
                + File.separator +  news.getNewsPhoto();
        File file=new File(filePath);
        if(file.exists()){
            file.delete();
            log.debug("picture deleted success");
        }
        return this.newsDao.deleteNewsById(id);
    }

    public void setNewsDao(NewsDao newsDao) {
        this.newsDao = newsDao;
    }
}
