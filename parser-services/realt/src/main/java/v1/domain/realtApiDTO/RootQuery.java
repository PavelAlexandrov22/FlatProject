package v1.domain.realtApiDTO;

import v1.domain.realtApiDTO.ClientGlobalDeviceInfo;
import v1.domain.realtApiDTO.ClientGlobalObjectsFavoriteInfo;

public class RootQuery {
    private String __typename;
    private ClientGlobalDeviceInfo clientGlobalDeviceInfo;

    private ClientGlobalObjectsFavoriteInfo clientGlobalObjectsFavoriteInfo;

    public RootQuery() {
    }

    public RootQuery(String __typename, ClientGlobalDeviceInfo clientGlobalDeviceInfo, ClientGlobalObjectsFavoriteInfo clientGlobalObjectsFavoriteInfo) {
        this.__typename = __typename;
        this.clientGlobalDeviceInfo = clientGlobalDeviceInfo;
        this.clientGlobalObjectsFavoriteInfo = clientGlobalObjectsFavoriteInfo;
    }

    public String get__typename() {
        return __typename;
    }

    public void set__typename(String __typename) {
        this.__typename = __typename;
    }

    public ClientGlobalDeviceInfo getClientGlobalDeviceInfo() {
        return clientGlobalDeviceInfo;
    }

    public void setClientGlobalDeviceInfo(ClientGlobalDeviceInfo clientGlobalDeviceInfo) {
        this.clientGlobalDeviceInfo = clientGlobalDeviceInfo;
    }

    public ClientGlobalObjectsFavoriteInfo getClientGlobalObjectsFavoriteInfo() {
        return clientGlobalObjectsFavoriteInfo;
    }

    public void setClientGlobalObjectsFavoriteInfo(ClientGlobalObjectsFavoriteInfo clientGlobalObjectsFavoriteInfo) {
        this.clientGlobalObjectsFavoriteInfo = clientGlobalObjectsFavoriteInfo;
    }
}
