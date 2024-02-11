package v1.domain.realtApiDTO;

import java.util.List;

public class ObjectViewConfig {
    private String showcases;
    private Banner banners;
    private String editPathname;
    private ObjectParams objectParams;
    private String subCategory;
    private Analytics analytics;
    private List<Breadcrumb> breadcrumbs;
    private SeoData seoData;
    private Title title;

    public ObjectViewConfig() {
    }

    public ObjectViewConfig(String showcases, Banner banners, String editPathname, ObjectParams objectParams, String subCategory, Analytics analytics, List<Breadcrumb> breadcrumbs, SeoData seoData, Title title) {
        this.showcases = showcases;
        this.banners = banners;
        this.editPathname = editPathname;
        this.objectParams = objectParams;
        this.subCategory = subCategory;
        this.analytics = analytics;
        this.breadcrumbs = breadcrumbs;
        this.seoData = seoData;
        this.title = title;
    }

    public String getShowcases() {
        return showcases;
    }

    public void setShowcases(String showcases) {
        this.showcases = showcases;
    }

    public Banner getBanners() {
        return banners;
    }

    public void setBanners(Banner banners) {
        this.banners = banners;
    }

    public String getEditPathname() {
        return editPathname;
    }

    public void setEditPathname(String editPathname) {
        this.editPathname = editPathname;
    }

    public ObjectParams getObjectParams() {
        return objectParams;
    }

    public void setObjectParams(ObjectParams objectParams) {
        this.objectParams = objectParams;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Analytics getAnalytics() {
        return analytics;
    }

    public void setAnalytics(Analytics analytics) {
        this.analytics = analytics;
    }

    public List<Breadcrumb> getBreadcrumbs() {
        return breadcrumbs;
    }

    public void setBreadcrumbs(List<Breadcrumb> breadcrumbs) {
        this.breadcrumbs = breadcrumbs;
    }

    public SeoData getSeoData() {
        return seoData;
    }

    public void setSeoData(SeoData seoData) {
        this.seoData = seoData;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
}
