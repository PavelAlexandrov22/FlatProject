package v1.domain.realtApiDTO;

public class Properties {
    private PageProps pageProps;
    private Boolean __N_SSP;

    public Properties() {
    }

    public Properties(PageProps pageProps, Boolean __N_SSP) {
        this.pageProps = pageProps;
        this.__N_SSP = __N_SSP;
    }

    public PageProps getPageProps() {
        return pageProps;
    }

    public void setPageProps(PageProps pageProps) {
        this.pageProps = pageProps;
    }

    public Boolean get__N_SSP() {
        return __N_SSP;
    }

    public void set__N_SSP(Boolean __N_SSP) {
        this.__N_SSP = __N_SSP;
    }
}
