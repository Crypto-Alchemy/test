package zendesk.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class ZendeskApplicationModule_ProvideExecutorServiceFactory implements ry1<ExecutorService> {
    private final ky4<ScheduledExecutorService> scheduledExecutorServiceProvider;

    public ZendeskApplicationModule_ProvideExecutorServiceFactory(ky4<ScheduledExecutorService> ky4) {
        this.scheduledExecutorServiceProvider = ky4;
    }

    public static ZendeskApplicationModule_ProvideExecutorServiceFactory create(ky4<ScheduledExecutorService> ky4) {
        return new ZendeskApplicationModule_ProvideExecutorServiceFactory(ky4);
    }

    public static ExecutorService provideExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return (ExecutorService) fu4.m44415f(ZendeskApplicationModule.provideExecutorService(scheduledExecutorService));
    }

    public ExecutorService get() {
        return provideExecutorService(this.scheduledExecutorServiceProvider.get());
    }
}
