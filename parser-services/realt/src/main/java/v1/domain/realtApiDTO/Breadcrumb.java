package v1.domain.realtApiDTO;

public class Breadcrumb {
    private  String url;
    private String title;

    public Breadcrumb() {
    }

    public Breadcrumb(String url, String title) {
        this.url = url;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
