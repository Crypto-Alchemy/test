package zendesk.support.requestlist;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import zendesk.support.RequestProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.requestlist.RequestInfoDataSource;

public final class RequestListModule_RepositoryFactory implements ry1<RequestInfoDataSource.Repository> {
    private final ky4<ExecutorService> backgroundThreadExecutorProvider;
    private final ky4<RequestInfoDataSource.LocalDataSource> localDataSourceProvider;
    private final ky4<Executor> mainThreadExecutorProvider;
    private final ky4<RequestProvider> requestProvider;
    private final ky4<SupportUiStorage> supportUiStorageProvider;

    public RequestListModule_RepositoryFactory(ky4<RequestInfoDataSource.LocalDataSource> ky4, ky4<SupportUiStorage> ky42, ky4<RequestProvider> ky43, ky4<Executor> ky44, ky4<ExecutorService> ky45) {
        this.localDataSourceProvider = ky4;
        this.supportUiStorageProvider = ky42;
        this.requestProvider = ky43;
        this.mainThreadExecutorProvider = ky44;
        this.backgroundThreadExecutorProvider = ky45;
    }

    public static RequestListModule_RepositoryFactory create(ky4<RequestInfoDataSource.LocalDataSource> ky4, ky4<SupportUiStorage> ky42, ky4<RequestProvider> ky43, ky4<Executor> ky44, ky4<ExecutorService> ky45) {
        return new RequestListModule_RepositoryFactory(ky4, ky42, ky43, ky44, ky45);
    }

    public static RequestInfoDataSource.Repository repository(RequestInfoDataSource.LocalDataSource localDataSource, SupportUiStorage supportUiStorage, RequestProvider requestProvider2, Executor executor, ExecutorService executorService) {
        return (RequestInfoDataSource.Repository) fu4.m44415f(RequestListModule.repository(localDataSource, supportUiStorage, requestProvider2, executor, executorService));
    }

    public RequestInfoDataSource.Repository get() {
        return repository(this.localDataSourceProvider.get(), this.supportUiStorageProvider.get(), this.requestProvider.get(), this.mainThreadExecutorProvider.get(), this.backgroundThreadExecutorProvider.get());
    }
}
