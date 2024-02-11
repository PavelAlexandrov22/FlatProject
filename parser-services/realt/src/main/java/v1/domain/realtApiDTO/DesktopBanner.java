package v1.domain.realtApiDTO;

public class DesktopBanner {
    private Place afterMap;
    private Place lastSection;
    private Place params;

    public DesktopBanner() {
    }

    public DesktopBanner(Place afterMap, Place lastSection, Place params) {
        this.afterMap = afterMap;
        this.lastSection = lastSection;
        this.params = params;
    }

    public Place getAfterMap() {
        return afterMap;
    }

    public void setAfterMap(Place afterMap) {
        this.afterMap = afterMap;
    }

    public Place getLastSection() {
        return lastSection;
    }

    public void setLastSection(Place lastSection) {
        this.lastSection = lastSection;
    }

    public Place getParams() {
        return params;
    }

    public void setParams(Place params) {
        this.params = params;
    }
}
