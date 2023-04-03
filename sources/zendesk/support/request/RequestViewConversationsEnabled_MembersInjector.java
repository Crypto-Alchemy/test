package zendesk.support.request;

import com.squareup.picasso.Picasso;
import zendesk.support.suas.Store;

public final class RequestViewConversationsEnabled_MembersInjector implements ts3<RequestViewConversationsEnabled> {
    private final ky4<ActionFactory> afProvider;
    private final ky4<CellFactory> cellFactoryProvider;
    private final ky4<Picasso> picassoProvider;
    private final ky4<Store> storeProvider;

    public RequestViewConversationsEnabled_MembersInjector(ky4<Store> ky4, ky4<ActionFactory> ky42, ky4<CellFactory> ky43, ky4<Picasso> ky44) {
        this.storeProvider = ky4;
        this.afProvider = ky42;
        this.cellFactoryProvider = ky43;
        this.picassoProvider = ky44;
    }

    public static ts3<RequestViewConversationsEnabled> create(ky4<Store> ky4, ky4<ActionFactory> ky42, ky4<CellFactory> ky43, ky4<Picasso> ky44) {
        return new RequestViewConversationsEnabled_MembersInjector(ky4, ky42, ky43, ky44);
    }

    public static void injectAf(RequestViewConversationsEnabled requestViewConversationsEnabled, Object obj) {
        requestViewConversationsEnabled.f46878af = (ActionFactory) obj;
    }

    public static void injectCellFactory(RequestViewConversationsEnabled requestViewConversationsEnabled, Object obj) {
        requestViewConversationsEnabled.cellFactory = (CellFactory) obj;
    }

    public static void injectPicasso(RequestViewConversationsEnabled requestViewConversationsEnabled, Picasso picasso) {
        requestViewConversationsEnabled.picasso = picasso;
    }

    public static void injectStore(RequestViewConversationsEnabled requestViewConversationsEnabled, Store store) {
        requestViewConversationsEnabled.store = store;
    }

    public void injectMembers(RequestViewConversationsEnabled requestViewConversationsEnabled) {
        injectStore(requestViewConversationsEnabled, this.storeProvider.get());
        injectAf(requestViewConversationsEnabled, this.afProvider.get());
        injectCellFactory(requestViewConversationsEnabled, this.cellFactoryProvider.get());
        injectPicasso(requestViewConversationsEnabled, this.picassoProvider.get());
    }
}
