package zendesk.support;

import java.util.concurrent.Executor;

public final class SupportSdkModule_MainThreadExecutorFactory implements ry1<Executor> {
    private final SupportSdkModule module;

    public SupportSdkModule_MainThreadExecutorFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static SupportSdkModule_MainThreadExecutorFactory create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_MainThreadExecutorFactory(supportSdkModule);
    }

    public static Executor mainThreadExecutor(SupportSdkModule supportSdkModule) {
        return (Executor) fu4.m44415f(supportSdkModule.mainThreadExecutor());
    }

    public Executor get() {
        return mainThreadExecutor(this.module);
    }
}
