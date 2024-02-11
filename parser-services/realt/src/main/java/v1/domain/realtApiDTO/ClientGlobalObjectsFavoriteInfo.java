package v1.domain.realtApiDTO;

public class ClientGlobalObjectsFavoriteInfo {
    private ObjectsFavorite objectsFavorite;

    public ClientGlobalObjectsFavoriteInfo() {
    }

    public ClientGlobalObjectsFavoriteInfo(ObjectsFavorite objectsFavorite) {
        this.objectsFavorite = objectsFavorite;
    }

    public ObjectsFavorite getObjectsFavorite() {
        return objectsFavorite;
    }

    public void setObjectsFavorite(ObjectsFavorite objectsFavorite) {
        this.objectsFavorite = objectsFavorite;
    }
}
