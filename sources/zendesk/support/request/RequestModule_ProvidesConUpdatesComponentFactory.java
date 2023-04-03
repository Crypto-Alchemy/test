package zendesk.support.request;

import android.content.Context;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.requestlist.RequestInfoDataSource;

public final class RequestModule_ProvidesConUpdatesComponentFactory implements ry1<ComponentUpdateActionHandlers> {
    private final ky4<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final ky4<Context> contextProvider;
    private final ky4<RequestInfoDataSource.LocalDataSource> dataSourceProvider;

    public RequestModule_ProvidesConUpdatesComponentFactory(ky4<Context> ky4, ky4<ActionHandlerRegistry> ky42, ky4<RequestInfoDataSource.LocalDataSource> ky43) {
        this.contextProvider = ky4;
        this.actionHandlerRegistryProvider = ky42;
        this.dataSourceProvider = ky43;
    }

    public static RequestModule_ProvidesConUpdatesComponentFactory create(ky4<Context> ky4, ky4<ActionHandlerRegistry> ky42, ky4<RequestInfoDataSource.LocalDataSource> ky43) {
        return new RequestModule_ProvidesConUpdatesComponentFactory(ky4, ky42, ky43);
    }

    public static ComponentUpdateActionHandlers providesConUpdatesComponent(Context context, ActionHandlerRegistry actionHandlerRegistry, RequestInfoDataSource.LocalDataSource localDataSource) {
        return (ComponentUpdateActionHandlers) fu4.m44415f(RequestModule.providesConUpdatesComponent(context, actionHandlerRegistry, localDataSource));
    }

    public ComponentUpdateActionHandlers get() {
        return providesConUpdatesComponent(this.contextProvider.get(), this.actionHandlerRegistryProvider.get(), this.dataSourceProvider.get());
    }
}
