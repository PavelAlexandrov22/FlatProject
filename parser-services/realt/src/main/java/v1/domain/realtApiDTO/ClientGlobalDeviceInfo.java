package v1.domain.realtApiDTO;

public class ClientGlobalDeviceInfo {
    private String ip;
    private Boolean isMobile;
    private Boolean isIOS;
    private String platform;
    private String browser;
    private Boolean isWebView;
    private Boolean isHuawei;

    public ClientGlobalDeviceInfo() {
    }

    public ClientGlobalDeviceInfo(String ip, Boolean isMobile, Boolean isIOS, String platform, String browser, Boolean isWebView, Boolean isHuawei) {
        this.ip = ip;
        this.isMobile = isMobile;
        this.isIOS = isIOS;
        this.platform = platform;
        this.browser = browser;
        this.isWebView = isWebView;
        this.isHuawei = isHuawei;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Boolean getMobile() {
        return isMobile;
    }

    public void setMobile(Boolean mobile) {
        isMobile = mobile;
    }

    public Boolean getIOS() {
        return isIOS;
    }

    public void setIOS(Boolean IOS) {
        isIOS = IOS;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public Boolean getWebView() {
        return isWebView;
    }

    public void setWebView(Boolean webView) {
        isWebView = webView;
    }

    public Boolean getHuawei() {
        return isHuawei;
    }

    public void setHuawei(Boolean huawei) {
        isHuawei = huawei;
    }
}

