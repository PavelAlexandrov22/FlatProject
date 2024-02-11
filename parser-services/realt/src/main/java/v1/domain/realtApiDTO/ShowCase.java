package v1.domain.realtApiDTO;

public class ShowCase {
    private String description;
    private String url;
    private String phone_international;
    private String redirect_url;
    private String title_only;
    private String signature_only;
    private String thumb_url;

    public ShowCase() {
    }

    public ShowCase(String description, String url, String phone_international, String redirect_url, String title_only, String signature_only, String thumb_url) {
        this.description = description;
        this.url = url;
        this.phone_international = phone_international;
        this.redirect_url = redirect_url;
        this.title_only = title_only;
        this.signature_only = signature_only;
        this.thumb_url = thumb_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhone_international() {
        return phone_international;
    }

    public void setPhone_international(String phone_international) {
        this.phone_international = phone_international;
    }

    public String getRedirect_url() {
        return redirect_url;
    }

    public void setRedirect_url(String redirect_url) {
        this.redirect_url = redirect_url;
    }

    public String getTitle_only() {
        return title_only;
    }

    public void setTitle_only(String title_only) {
        this.title_only = title_only;
    }

    public String getSignature_only() {
        return signature_only;
    }

    public void setSignature_only(String signature_only) {
        this.signature_only = signature_only;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
    }
}
