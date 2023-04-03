package zendesk.support;

import java.util.List;
import zendesk.core.ActionHandler;

public final class SupportSdkModule_ProvidesActionHandlersFactory implements ry1<List<ActionHandler>> {
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesActionHandlersFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static SupportSdkModule_ProvidesActionHandlersFactory create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ProvidesActionHandlersFactory(supportSdkModule);
    }

    public static List<ActionHandler> providesActionHandlers(SupportSdkModule supportSdkModule) {
        return (List) fu4.m44415f(supportSdkModule.providesActionHandlers());
    }

    public List<ActionHandler> get() {
        return providesActionHandlers(this.module);
    }
}
