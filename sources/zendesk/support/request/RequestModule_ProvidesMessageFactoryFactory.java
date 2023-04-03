package zendesk.support.request;

import android.content.Context;
import com.squareup.picasso.Picasso;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.suas.Dispatcher;

public final class RequestModule_ProvidesMessageFactoryFactory implements ry1<CellFactory> {
    private final ky4<ActionFactory> actionFactoryProvider;
    private final ky4<ro0> configHelperProvider;
    private final ky4<Context> contextProvider;
    private final ky4<Dispatcher> dispatcherProvider;
    private final RequestModule module;
    private final ky4<Picasso> picassoProvider;
    private final ky4<ActionHandlerRegistry> registryProvider;

    public RequestModule_ProvidesMessageFactoryFactory(RequestModule requestModule, ky4<Context> ky4, ky4<Picasso> ky42, ky4<ActionFactory> ky43, ky4<Dispatcher> ky44, ky4<ActionHandlerRegistry> ky45, ky4<ro0> ky46) {
        this.module = requestModule;
        this.contextProvider = ky4;
        this.picassoProvider = ky42;
        this.actionFactoryProvider = ky43;
        this.dispatcherProvider = ky44;
        this.registryProvider = ky45;
        this.configHelperProvider = ky46;
    }

    public static RequestModule_ProvidesMessageFactoryFactory create(RequestModule requestModule, ky4<Context> ky4, ky4<Picasso> ky42, ky4<ActionFactory> ky43, ky4<Dispatcher> ky44, ky4<ActionHandlerRegistry> ky45, ky4<ro0> ky46) {
        return new RequestModule_ProvidesMessageFactoryFactory(requestModule, ky4, ky42, ky43, ky44, ky45, ky46);
    }

    public static CellFactory providesMessageFactory(RequestModule requestModule, Context context, Picasso picasso, Object obj, Dispatcher dispatcher, ActionHandlerRegistry actionHandlerRegistry, ro0 ro0) {
        return (CellFactory) fu4.m44415f(requestModule.providesMessageFactory(context, picasso, (ActionFactory) obj, dispatcher, actionHandlerRegistry, ro0));
    }

    public CellFactory get() {
        return providesMessageFactory(this.module, this.contextProvider.get(), this.picassoProvider.get(), this.actionFactoryProvider.get(), this.dispatcherProvider.get(), this.registryProvider.get(), this.configHelperProvider.get());
    }
}
