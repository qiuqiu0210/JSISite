package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.News;

import java.util.List;

/**
 * 新闻dao接口
 * @author songliu
 * @since 2014/08/19
 */
public interface NewsDao {
    /**
     * 查询所有新闻
     * @return List<News>
     */
    public List<News> findAllNews();

    /**
     * 通过id查询新闻
     * @param id
     * @return List<News>
     */
    public News findNewsById(int id);

    /**
     * 保存新闻
     * @param news
     * @return List<News>
     */
    public boolean saveNews(News news);

    /**
     * 更新新闻
     * @param news
     * @return boolean
     */
    public boolean updateNews(News news);

    /**
     * 通过id删除新闻
     * @param id
     * @return boolean
     */
    public boolean deleteNewsById(int id);
}
