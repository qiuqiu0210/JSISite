package cn.edu.buaa.jsi.hibernate.dao;

import cn.edu.buaa.jsi.entities.Article;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Home on 2014/8/17.
 */
public interface ArticleDao {
    public List<Article> findAllArticle();
    public Article findArticleById(Serializable id);
    public List<Article> findArticleByProperties(String[] propertyNames, Object[] values);
    public List<Article> findArticleByQuery(String query);

    public boolean saveArticle(Article article);
    public boolean updateArticle(Article article);

    public boolean removeArticle(Article article);
    public boolean removeArticleByProperty(String propertyNames, Object value);

    boolean isExist(String title);
    boolean isExist(String title, Serializable id);
}
