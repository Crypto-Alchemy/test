package zendesk.support.request;

import com.squareup.picasso.Picasso;
import zendesk.support.suas.Store;

public final class RequestViewConversationsDisabled_MembersInjector implements ts3<RequestViewConversationsDisabled> {
    private final ky4<ActionFactory> afProvider;
    private final ky4<Picasso> picassoProvider;
    private final ky4<Store> storeProvider;

    public RequestViewConversationsDisabled_MembersInjector(ky4<Store> ky4, ky4<ActionFactory> ky42, ky4<Picasso> ky43) {
        this.storeProvider = ky4;
        this.afProvider = ky42;
        this.picassoProvider = ky43;
    }

    public static ts3<RequestViewConversationsDisabled> create(ky4<Store> ky4, ky4<ActionFactory> ky42, ky4<Picasso> ky43) {
        return new RequestViewConversationsDisabled_MembersInjector(ky4, ky42, ky43);
    }

    public static void injectAf(RequestViewConversationsDisabled requestViewConversationsDisabled, Object obj) {
        requestViewConversationsDisabled.f46877af = (ActionFactory) obj;
    }

    public static void injectPicasso(RequestViewConversationsDisabled requestViewConversationsDisabled, Picasso picasso) {
        requestViewConversationsDisabled.picasso = picasso;
    }

    public static void injectStore(RequestViewConversationsDisabled requestViewConversationsDisabled, Store store) {
        requestViewConversationsDisabled.store = store;
    }

    public void injectMembers(RequestViewConversationsDisabled requestViewConversationsDisabled) {
        injectStore(requestViewConversationsDisabled, this.storeProvider.get());
        injectAf(requestViewConversationsDisabled, this.afProvider.get());
        injectPicasso(requestViewConversationsDisabled, this.picassoProvider.get());
    }
}
