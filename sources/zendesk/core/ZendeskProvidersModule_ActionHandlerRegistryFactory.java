package zendesk.core;

public final class ZendeskProvidersModule_ActionHandlerRegistryFactory implements ry1<ActionHandlerRegistry> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ZendeskProvidersModule_ActionHandlerRegistryFactory INSTANCE = new ZendeskProvidersModule_ActionHandlerRegistryFactory();

        private InstanceHolder() {
        }
    }

    public static ActionHandlerRegistry actionHandlerRegistry() {
        return (ActionHandlerRegistry) fu4.m44415f(ZendeskProvidersModule.actionHandlerRegistry());
    }

    public static ZendeskProvidersModule_ActionHandlerRegistryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public ActionHandlerRegistry get() {
        return actionHandlerRegistry();
    }
}
