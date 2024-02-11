package v1.domain.realtApiDTO;

public class Banner {
    private DesktopBanner desktop;
    private MobileBanner mobile;

    public Banner() {
    }

    public Banner(DesktopBanner desktop, MobileBanner mobile) {
        this.desktop = desktop;
        this.mobile = mobile;
    }

    public DesktopBanner getDesktop() {
        return desktop;
    }

    public void setDesktop(DesktopBanner desktop) {
        this.desktop = desktop;
    }

    public MobileBanner getMobile() {
        return mobile;
    }

    public void setMobile(MobileBanner mobile) {
        this.mobile = mobile;
    }
}
