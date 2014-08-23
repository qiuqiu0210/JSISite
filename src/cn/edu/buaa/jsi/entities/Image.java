package cn.edu.buaa.jsi.entities;

import java.sql.Blob;

/**
 *
 * @author songliu
 * @since 2014/08/17
 */
public class Image {
    private int imageId;
    private Blob image;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Image image1 = (Image) o;

        if (imageId != image1.imageId) return false;
        if (image != null ? !image.equals(image1.image) : image1.image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imageId;
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }
}
