package cn.edu.buaa.jsi.service;

import cn.edu.buaa.jsi.entities.News;

import java.io.File;
import java.util.List;

/**
 * 新闻业务接口
 * @author songliu
 * @since  2014/08/19
 */
public interface NewsService {
    /**
     * 查询所有新闻
     * @return
     */
    public List<News> findAllNews();

    /**
     * 根据id查询新闻
     * @param id
     * @return
     */
    public News findNewsById(int id);

    /**
     * 保存新闻
     * @param news
     * @return
     */
    public boolean saveNews(News news);

    /**
     * 保存新闻及图片
     * @param news
     * @param oldFile
     * @param newFile
     * @return
     */
    public boolean saveNewsAndPhoto(News news, File oldFile, File newFile);

    /**
     * 更新新闻
     * @param news
     * @return
     */
    public boolean updateNews(News news);

    /**
     * 删除新闻及图片
     * @param id
     * @return
     */
    public boolean deleteNewsById(int id);
}
