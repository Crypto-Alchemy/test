package zendesk.support;

import java.util.List;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;

public final class SdkDependencyProvider_MembersInjector implements ts3<SdkDependencyProvider> {
    private final ky4<List<ActionHandler>> actionHandlersProvider;
    private final ky4<ActionHandlerRegistry> registryProvider;

    public SdkDependencyProvider_MembersInjector(ky4<ActionHandlerRegistry> ky4, ky4<List<ActionHandler>> ky42) {
        this.registryProvider = ky4;
        this.actionHandlersProvider = ky42;
    }

    public static ts3<SdkDependencyProvider> create(ky4<ActionHandlerRegistry> ky4, ky4<List<ActionHandler>> ky42) {
        return new SdkDependencyProvider_MembersInjector(ky4, ky42);
    }

    public static void injectActionHandlers(SdkDependencyProvider sdkDependencyProvider, List<ActionHandler> list) {
        sdkDependencyProvider.actionHandlers = list;
    }

    public static void injectRegistry(SdkDependencyProvider sdkDependencyProvider, ActionHandlerRegistry actionHandlerRegistry) {
        sdkDependencyProvider.registry = actionHandlerRegistry;
    }

    public void injectMembers(SdkDependencyProvider sdkDependencyProvider) {
        injectRegistry(sdkDependencyProvider, this.registryProvider.get());
        injectActionHandlers(sdkDependencyProvider, this.actionHandlersProvider.get());
    }
}
