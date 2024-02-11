package v1.domain.realtApiDTO;

public class Query {
    private String id;

    public Query() {
    }

    public Query(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
