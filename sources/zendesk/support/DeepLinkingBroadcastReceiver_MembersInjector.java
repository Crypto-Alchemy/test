package zendesk.support;

import zendesk.core.ActionHandlerRegistry;

public final class DeepLinkingBroadcastReceiver_MembersInjector implements ts3<DeepLinkingBroadcastReceiver> {
    private final ky4<ActionHandlerRegistry> registryProvider;

    public DeepLinkingBroadcastReceiver_MembersInjector(ky4<ActionHandlerRegistry> ky4) {
        this.registryProvider = ky4;
    }

    public static ts3<DeepLinkingBroadcastReceiver> create(ky4<ActionHandlerRegistry> ky4) {
        return new DeepLinkingBroadcastReceiver_MembersInjector(ky4);
    }

    public static void injectRegistry(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver, ActionHandlerRegistry actionHandlerRegistry) {
        deepLinkingBroadcastReceiver.registry = actionHandlerRegistry;
    }

    public void injectMembers(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
        injectRegistry(deepLinkingBroadcastReceiver, this.registryProvider.get());
    }
}
