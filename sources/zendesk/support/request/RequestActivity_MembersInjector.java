package zendesk.support.request;

import com.squareup.picasso.Picasso;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.suas.Store;

public final class RequestActivity_MembersInjector implements ts3<RequestActivity> {
    private final ky4<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final ky4<ActionFactory> afProvider;
    private final ky4<HeadlessComponentListener> headlessComponentListenerProvider;
    private final ky4<Picasso> picassoProvider;
    private final ky4<Store> storeProvider;

    public RequestActivity_MembersInjector(ky4<Store> ky4, ky4<ActionFactory> ky42, ky4<HeadlessComponentListener> ky43, ky4<Picasso> ky44, ky4<ActionHandlerRegistry> ky45) {
        this.storeProvider = ky4;
        this.afProvider = ky42;
        this.headlessComponentListenerProvider = ky43;
        this.picassoProvider = ky44;
        this.actionHandlerRegistryProvider = ky45;
    }

    public static ts3<RequestActivity> create(ky4<Store> ky4, ky4<ActionFactory> ky42, ky4<HeadlessComponentListener> ky43, ky4<Picasso> ky44, ky4<ActionHandlerRegistry> ky45) {
        return new RequestActivity_MembersInjector(ky4, ky42, ky43, ky44, ky45);
    }

    public static void injectActionHandlerRegistry(RequestActivity requestActivity, ActionHandlerRegistry actionHandlerRegistry) {
        requestActivity.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectAf(RequestActivity requestActivity, Object obj) {
        requestActivity.f46876af = (ActionFactory) obj;
    }

    public static void injectHeadlessComponentListener(RequestActivity requestActivity, Object obj) {
        requestActivity.headlessComponentListener = (HeadlessComponentListener) obj;
    }

    public static void injectPicasso(RequestActivity requestActivity, Picasso picasso) {
        requestActivity.picasso = picasso;
    }

    public static void injectStore(RequestActivity requestActivity, Store store) {
        requestActivity.store = store;
    }

    public void injectMembers(RequestActivity requestActivity) {
        injectStore(requestActivity, this.storeProvider.get());
        injectAf(requestActivity, this.afProvider.get());
        injectHeadlessComponentListener(requestActivity, this.headlessComponentListenerProvider.get());
        injectPicasso(requestActivity, this.picassoProvider.get());
        injectActionHandlerRegistry(requestActivity, this.actionHandlerRegistryProvider.get());
    }
}
