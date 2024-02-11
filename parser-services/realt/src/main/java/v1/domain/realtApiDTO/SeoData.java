package v1.domain.realtApiDTO;

public class SeoData {
    private String seoTitle;
    private String categoryPart;
    private String categoryDescriptionPrefix;

    public SeoData() {
    }

    public SeoData(String seoTitle, String categoryPart, String categoryDescriptionPrefix) {
        this.seoTitle = seoTitle;
        this.categoryPart = categoryPart;
        this.categoryDescriptionPrefix = categoryDescriptionPrefix;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getCategoryPart() {
        return categoryPart;
    }

    public void setCategoryPart(String categoryPart) {
        this.categoryPart = categoryPart;
    }

    public String getCategoryDescriptionPrefix() {
        return categoryDescriptionPrefix;
    }

    public void setCategoryDescriptionPrefix(String categoryDescriptionPrefix) {
        this.categoryDescriptionPrefix = categoryDescriptionPrefix;
    }
}
