package v1.domain.realtApiDTO;

public class InitialState {
    private ObjectView objectView;

    public InitialState() {
    }

    public InitialState(ObjectView objectView) {
        this.objectView = objectView;
    }

    public ObjectView getObjectView() {
        return objectView;
    }

    public void setObjectView(ObjectView objectView) {
        this.objectView = objectView;
    }
}
