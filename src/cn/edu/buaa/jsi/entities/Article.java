package cn.edu.buaa.jsi.entities;

import java.sql.Timestamp;

/**
 *
 * @author songliu
 * @since 2014/08/17
 */
public class Article {
    private int artId;
    private String artTitle;
    private String artContent;
    private String artDist;
    private String artHot;
    private String artUrl;
    private String artImage;
    private String artImagesrc;
    private int artCount;
    private String artStatus;
    private Timestamp artCreatedate;
    private Timestamp artLastdate;
    private String artAuthor;
    private Catalog catalog;
    private Account account;

    public void setArtCount(Integer artCount) {
        this.artCount = artCount;
    }

    public int getArtId() {
        return artId;
    }

    public void setArtId(int artId) {
        this.artId = artId;
    }

    public String getArtTitle() {
        return artTitle;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle;
    }

    public String getArtContent() {
        return artContent;
    }

    public void setArtContent(String artContent) {
        this.artContent = artContent;
    }

    public String getArtDist() {
        return artDist;
    }

    public void setArtDist(String artDist) {
        this.artDist = artDist;
    }

    public String getArtHot() {
        return artHot;
    }

    public void setArtHot(String artHot) {
        this.artHot = artHot;
    }

    public String getArtUrl() {
        return artUrl;
    }

    public void setArtUrl(String artUrl) {
        this.artUrl = artUrl;
    }

    public String getArtImage() {
        return artImage;
    }

    public void setArtImage(String artImage) {
        this.artImage = artImage;
    }

    public String getArtImagesrc() {
        return artImagesrc;
    }

    public void setArtImagesrc(String artImagesrc) {
        this.artImagesrc = artImagesrc;
    }

    public int getArtCount() {
        return artCount;
    }

    public void setArtCount(int artCount) {
        this.artCount = artCount;
    }

    public String getArtStatus() {
        return artStatus;
    }

    public void setArtStatus(String artStatus) {
        this.artStatus = artStatus;
    }

    public Timestamp getArtCreatedate() {
        return artCreatedate;
    }

    public void setArtCreatedate(Timestamp artCreatedate) {
        this.artCreatedate = artCreatedate;
    }

    public Timestamp getArtLastdate() {
        return artLastdate;
    }

    public void setArtLastdate(Timestamp artLastdate) {
        this.artLastdate = artLastdate;
    }

    public String getArtAuthor() {
        return artAuthor;
    }

    public void setArtAuthor(String artAuthor) {
        this.artAuthor = artAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (artCount != article.artCount) return false;
        if (artId != article.artId) return false;
        if (artAuthor != null ? !artAuthor.equals(article.artAuthor) : article.artAuthor != null) return false;
        if (artContent != null ? !artContent.equals(article.artContent) : article.artContent != null) return false;
        if (artCreatedate != null ? !artCreatedate.equals(article.artCreatedate) : article.artCreatedate != null)
            return false;
        if (artDist != null ? !artDist.equals(article.artDist) : article.artDist != null) return false;
        if (artHot != null ? !artHot.equals(article.artHot) : article.artHot != null) return false;
        if (artImage != null ? !artImage.equals(article.artImage) : article.artImage != null) return false;
        if (artImagesrc != null ? !artImagesrc.equals(article.artImagesrc) : article.artImagesrc != null) return false;
        if (artLastdate != null ? !artLastdate.equals(article.artLastdate) : article.artLastdate != null) return false;
        if (artStatus != null ? !artStatus.equals(article.artStatus) : article.artStatus != null) return false;
        if (artTitle != null ? !artTitle.equals(article.artTitle) : article.artTitle != null) return false;
        if (artUrl != null ? !artUrl.equals(article.artUrl) : article.artUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artId;
        result = 31 * result + (artTitle != null ? artTitle.hashCode() : 0);
        result = 31 * result + (artContent != null ? artContent.hashCode() : 0);
        result = 31 * result + (artDist != null ? artDist.hashCode() : 0);
        result = 31 * result + (artHot != null ? artHot.hashCode() : 0);
        result = 31 * result + (artUrl != null ? artUrl.hashCode() : 0);
        result = 31 * result + (artImage != null ? artImage.hashCode() : 0);
        result = 31 * result + (artImagesrc != null ? artImagesrc.hashCode() : 0);
        result = 31 * result + artCount;
        result = 31 * result + (artStatus != null ? artStatus.hashCode() : 0);
        result = 31 * result + (artCreatedate != null ? artCreatedate.hashCode() : 0);
        result = 31 * result + (artLastdate != null ? artLastdate.hashCode() : 0);
        result = 31 * result + (artAuthor != null ? artAuthor.hashCode() : 0);
        return result;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
