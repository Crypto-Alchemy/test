package zendesk.support.request;

import java.util.concurrent.ExecutorService;
import zendesk.support.SupportUiStorage;
import zendesk.support.request.ComponentPersistence;

public final class RequestModule_ProvidesPersistenceComponentFactory implements ry1<ComponentPersistence> {
    private final ky4<ExecutorService> executorServiceProvider;
    private final ky4<ComponentPersistence.PersistenceQueue> queueProvider;
    private final ky4<SupportUiStorage> supportUiStorageProvider;

    public RequestModule_ProvidesPersistenceComponentFactory(ky4<SupportUiStorage> ky4, ky4<ComponentPersistence.PersistenceQueue> ky42, ky4<ExecutorService> ky43) {
        this.supportUiStorageProvider = ky4;
        this.queueProvider = ky42;
        this.executorServiceProvider = ky43;
    }

    public static RequestModule_ProvidesPersistenceComponentFactory create(ky4<SupportUiStorage> ky4, ky4<ComponentPersistence.PersistenceQueue> ky42, ky4<ExecutorService> ky43) {
        return new RequestModule_ProvidesPersistenceComponentFactory(ky4, ky42, ky43);
    }

    public static ComponentPersistence providesPersistenceComponent(SupportUiStorage supportUiStorage, Object obj, ExecutorService executorService) {
        return (ComponentPersistence) fu4.m44415f(RequestModule.providesPersistenceComponent(supportUiStorage, (ComponentPersistence.PersistenceQueue) obj, executorService));
    }

    public ComponentPersistence get() {
        return providesPersistenceComponent(this.supportUiStorageProvider.get(), this.queueProvider.get(), this.executorServiceProvider.get());
    }
}
