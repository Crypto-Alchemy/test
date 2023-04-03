package zendesk.core;

import java.util.concurrent.Executor;

public final class CoreModule_GetExecutorFactory implements ry1<Executor> {
    private final CoreModule module;

    public CoreModule_GetExecutorFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetExecutorFactory create(CoreModule coreModule) {
        return new CoreModule_GetExecutorFactory(coreModule);
    }

    public static Executor getExecutor(CoreModule coreModule) {
        return (Executor) fu4.m44415f(coreModule.getExecutor());
    }

    public Executor get() {
        return getExecutor(this.module);
    }
}
