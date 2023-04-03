package zendesk.support.guide;

import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;

public final class GuideSdkDependencyProvider_MembersInjector implements ts3<GuideSdkDependencyProvider> {
    private final ky4<ActionHandler> actionHandlerProvider;
    private final ky4<ActionHandlerRegistry> registryProvider;

    public GuideSdkDependencyProvider_MembersInjector(ky4<ActionHandlerRegistry> ky4, ky4<ActionHandler> ky42) {
        this.registryProvider = ky4;
        this.actionHandlerProvider = ky42;
    }

    public static ts3<GuideSdkDependencyProvider> create(ky4<ActionHandlerRegistry> ky4, ky4<ActionHandler> ky42) {
        return new GuideSdkDependencyProvider_MembersInjector(ky4, ky42);
    }

    public static void injectActionHandler(Object obj, ActionHandler actionHandler) {
        ((GuideSdkDependencyProvider) obj).actionHandler = actionHandler;
    }

    public static void injectRegistry(Object obj, ActionHandlerRegistry actionHandlerRegistry) {
        ((GuideSdkDependencyProvider) obj).registry = actionHandlerRegistry;
    }

    public void injectMembers(GuideSdkDependencyProvider guideSdkDependencyProvider) {
        injectRegistry(guideSdkDependencyProvider, this.registryProvider.get());
        injectActionHandler(guideSdkDependencyProvider, this.actionHandlerProvider.get());
    }
}
