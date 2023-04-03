package zendesk.core;

import java.util.concurrent.ScheduledExecutorService;

public final class ZendeskApplicationModule_ProvideExecutorFactory implements ry1<ScheduledExecutorService> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ZendeskApplicationModule_ProvideExecutorFactory INSTANCE = new ZendeskApplicationModule_ProvideExecutorFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskApplicationModule_ProvideExecutorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ScheduledExecutorService provideExecutor() {
        return (ScheduledExecutorService) fu4.m44415f(ZendeskApplicationModule.provideExecutor());
    }

    public ScheduledExecutorService get() {
        return provideExecutor();
    }
}
