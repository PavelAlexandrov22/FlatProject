package v1.domain.realtApiDTO;

public class ApolloState {
    private RootQuery ROOT_QUERY;

    public ApolloState() {
    }

    public ApolloState(RootQuery ROOT_QUERY) {
        this.ROOT_QUERY = ROOT_QUERY;
    }

    public RootQuery getROOT_QUERY() {
        return ROOT_QUERY;
    }

    public void setROOT_QUERY(RootQuery ROOT_QUERY) {
        this.ROOT_QUERY = ROOT_QUERY;
    }
}
