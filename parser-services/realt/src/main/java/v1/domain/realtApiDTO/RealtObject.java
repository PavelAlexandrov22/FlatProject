package v1.domain.realtApiDTO;

import java.util.List;

public class RealtObject {
    private Properties props;
    private String page;
    private Query query;
    private String buildId;
    private Boolean isFallback;
    private List<Integer> dynamicIds;
    private Boolean gssp;
    private Boolean customServer;
    private String locale;
    private List<String> locales;
    private String defaultLocale;
    private List<Object> scriptLoader;

    public RealtObject() {
    }

    public RealtObject(Properties props, String page, Query query, String buildId, Boolean isFallback, List<Integer> dynamicIds, Boolean gssp, Boolean customServer, String locale, List<String> locales, String defaultLocale, List<Object> scriptLoader) {
        this.props = props;
        this.page = page;
        this.query = query;
        this.buildId = buildId;
        this.isFallback = isFallback;
        this.dynamicIds = dynamicIds;
        this.gssp = gssp;
        this.customServer = customServer;
        this.locale = locale;
        this.locales = locales;
        this.defaultLocale = defaultLocale;
        this.scriptLoader = scriptLoader;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public Boolean getFallback() {
        return isFallback;
    }

    public void setFallback(Boolean fallback) {
        isFallback = fallback;
    }

    public List<Integer> getDynamicIds() {
        return dynamicIds;
    }

    public void setDynamicIds(List<Integer> dynamicIds) {
        this.dynamicIds = dynamicIds;
    }

    public Boolean getGssp() {
        return gssp;
    }

    public void setGssp(Boolean gssp) {
        this.gssp = gssp;
    }

    public Boolean getCustomServer() {
        return customServer;
    }

    public void setCustomServer(Boolean customServer) {
        this.customServer = customServer;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public List<String> getLocales() {
        return locales;
    }

    public void setLocales(List<String> locales) {
        this.locales = locales;
    }

    public String getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public List<Object> getScriptLoader() {
        return scriptLoader;
    }

    public void setScriptLoader(List<Object> scriptLoader) {
        this.scriptLoader = scriptLoader;
    }
}
