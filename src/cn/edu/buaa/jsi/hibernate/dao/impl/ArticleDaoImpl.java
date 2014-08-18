package cn.edu.buaa.jsi.hibernate.dao.impl;

import cn.edu.buaa.jsi.hibernate.dao.ArticleDao;
import cn.edu.buaa.jsi.entities.Article;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Home on 2014/8/17.
 */
public class ArticleDaoImpl extends BaseDaoImpl implements ArticleDao {
    @Override
    public List<Article> findAllArticle() {
        return null;
    }

    @Override
    public Article findArticleById(Serializable id) {
        return null;
    }

    @Override
    public List<Article> findArticleByProperties(String[] propertyNames, Object[] values) {
        return null;
    }

    @Override
    public List<Article> findArticleByQuery(String query) {
        return null;
    }

    @Override
    public boolean saveArticle(Article article) {
        return this.save(article);
    }

    @Override
    public boolean updateArticle(Article article) {
        return this.update(article);
    }

    @Override
    public boolean removeArticle(Article article) {
        return false;
    }

    @Override
    public boolean removeArticleByProperty(String propertyNames, Object value) {
        return false;
    }

    @Override
    public boolean isExist(String title) {
        return false;
    }

    @Override
    public boolean isExist(String title, Serializable id) {
        return false;
    }
}
