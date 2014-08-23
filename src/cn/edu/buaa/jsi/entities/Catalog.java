package cn.edu.buaa.jsi.entities;

/**
 *
 * @author songliu
 * @since 2014/08/17
 */
public class Catalog {
    private int catId;
    private String catTitle;

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatTitle() {
        return catTitle;
    }

    public void setCatTitle(String catTitle) {
        this.catTitle = catTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Catalog catalog = (Catalog) o;

        if (catId != catalog.catId) return false;
        if (catTitle != null ? !catTitle.equals(catalog.catTitle) : catalog.catTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = catId;
        result = 31 * result + (catTitle != null ? catTitle.hashCode() : 0);
        return result;
    }
}
