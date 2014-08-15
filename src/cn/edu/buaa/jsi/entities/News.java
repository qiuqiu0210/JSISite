package cn.edu.buaa.jsi.entities;

import java.sql.Timestamp;

/**
 * @ClassName: News
 * @Description: News实体
 * @author songliu
 * @date 2014-08-15
 *
 */
public class News {
    private int newsId;
    private Timestamp newsTime;
    private String newsAuthor;
    private String newsTitle;
    private String newsPhoto;
    private String newsContent;

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public Timestamp getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Timestamp newsTime) {
        this.newsTime = newsTime;
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsPhoto() {
        return newsPhoto;
    }

    public void setNewsPhoto(String newsPhoto) {
        this.newsPhoto = newsPhoto;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (newsId != news.newsId) return false;
        if (newsAuthor != null ? !newsAuthor.equals(news.newsAuthor) : news.newsAuthor != null) return false;
        if (newsContent != null ? !newsContent.equals(news.newsContent) : news.newsContent != null) return false;
        if (newsPhoto != null ? !newsPhoto.equals(news.newsPhoto) : news.newsPhoto != null) return false;
        if (newsTime != null ? !newsTime.equals(news.newsTime) : news.newsTime != null) return false;
        if (newsTitle != null ? !newsTitle.equals(news.newsTitle) : news.newsTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = newsId;
        result = 31 * result + (newsTime != null ? newsTime.hashCode() : 0);
        result = 31 * result + (newsAuthor != null ? newsAuthor.hashCode() : 0);
        result = 31 * result + (newsTitle != null ? newsTitle.hashCode() : 0);
        result = 31 * result + (newsPhoto != null ? newsPhoto.hashCode() : 0);
        result = 31 * result + (newsContent != null ? newsContent.hashCode() : 0);
        return result;
    }
}
