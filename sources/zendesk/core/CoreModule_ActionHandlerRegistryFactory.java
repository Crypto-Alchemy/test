package zendesk.core;

public final class CoreModule_ActionHandlerRegistryFactory implements ry1<ActionHandlerRegistry> {
    private final CoreModule module;

    public CoreModule_ActionHandlerRegistryFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static ActionHandlerRegistry actionHandlerRegistry(CoreModule coreModule) {
        return (ActionHandlerRegistry) fu4.m44415f(coreModule.actionHandlerRegistry());
    }

    public static CoreModule_ActionHandlerRegistryFactory create(CoreModule coreModule) {
        return new CoreModule_ActionHandlerRegistryFactory(coreModule);
    }

    public ActionHandlerRegistry get() {
        return actionHandlerRegistry(this.module);
    }
}
