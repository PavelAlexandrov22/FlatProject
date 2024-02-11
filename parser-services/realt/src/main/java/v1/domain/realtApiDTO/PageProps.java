package v1.domain.realtApiDTO;

public class PageProps {
    private InitialState initialState;
    private I18nDict i18nDict;
    private ApolloState apolloState;

    public PageProps() {
    }

    public PageProps(InitialState initialState, I18nDict i18nDict, ApolloState apolloState) {
        this.initialState = initialState;
        this.i18nDict = i18nDict;
        this.apolloState = apolloState;
    }

    public InitialState getInitialState() {
        return initialState;
    }

    public void setInitialState(InitialState initialState) {
        this.initialState = initialState;
    }

    public I18nDict getI18nDict() {
        return i18nDict;
    }

    public void setI18nDict(I18nDict i18nDict) {
        this.i18nDict = i18nDict;
    }

    public ApolloState getApolloState() {
        return apolloState;
    }

    public void setApolloState(ApolloState apolloState) {
        this.apolloState = apolloState;
    }
}
