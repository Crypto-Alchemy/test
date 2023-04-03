package zendesk.support.request;

import java.util.concurrent.ExecutorService;
import zendesk.support.request.ComponentPersistence;

public final class RequestModule_ProvidesDiskQueueFactory implements ry1<ComponentPersistence.PersistenceQueue> {
    private final ky4<ExecutorService> executorServiceProvider;

    public RequestModule_ProvidesDiskQueueFactory(ky4<ExecutorService> ky4) {
        this.executorServiceProvider = ky4;
    }

    public static RequestModule_ProvidesDiskQueueFactory create(ky4<ExecutorService> ky4) {
        return new RequestModule_ProvidesDiskQueueFactory(ky4);
    }

    public static ComponentPersistence.PersistenceQueue providesDiskQueue(ExecutorService executorService) {
        return (ComponentPersistence.PersistenceQueue) fu4.m44415f(RequestModule.providesDiskQueue(executorService));
    }

    public ComponentPersistence.PersistenceQueue get() {
        return providesDiskQueue(this.executorServiceProvider.get());
    }
}
