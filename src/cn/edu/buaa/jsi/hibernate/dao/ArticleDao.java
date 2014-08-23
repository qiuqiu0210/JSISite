package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.Article;

import java.io.Serializable;
import java.util.List;

/**
 * 文章dao接口
 * @author songliu
 * @since 2014/08/17
 */
public interface ArticleDao {
    public List<Article> findAllArticles();
    public Article findArticleById(Serializable id);
    public List<Article> findArticleByProperties(String[] propertyNames, Object[] values);
    public List<Article> findArticleByQuery(String query);

    public boolean saveArticle(Article article);
    public boolean updateArticle(Article article);

    public boolean deleteArticle(Article article);
    public boolean deleteArticleByProperty(String propertyNames, Object value);

    boolean isExist(String title);
    boolean isExist(String title, Serializable id);
}
