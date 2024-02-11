package v1.domain.realtApiDTO;

public class MobileBanner {

    private Place popup;
    private Place topLine;
    private Place afterBreadcrumbs;
    private Place fixedBottom;
    private Place afterMap;
    private Place  lastSection;
    private Place params;

    public MobileBanner() {
    }

    public MobileBanner(Place popup, Place topLine, Place afterBreadcrumbs, Place fixedBottom, Place afterMap, Place lastSection, Place params) {
        this.popup = popup;
        this.topLine = topLine;
        this.afterBreadcrumbs = afterBreadcrumbs;
        this.fixedBottom = fixedBottom;
        this.afterMap = afterMap;
        this.lastSection = lastSection;
        this.params = params;
    }

    public Place getPopup() {
        return popup;
    }

    public void setPopup(Place popup) {
        this.popup = popup;
    }

    public Place getTopLine() {
        return topLine;
    }

    public void setTopLine(Place topLine) {
        this.topLine = topLine;
    }

    public Place getAfterBreadcrumbs() {
        return afterBreadcrumbs;
    }

    public void setAfterBreadcrumbs(Place afterBreadcrumbs) {
        this.afterBreadcrumbs = afterBreadcrumbs;
    }

    public Place getFixedBottom() {
        return fixedBottom;
    }

    public void setFixedBottom(Place fixedBottom) {
        this.fixedBottom = fixedBottom;
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
