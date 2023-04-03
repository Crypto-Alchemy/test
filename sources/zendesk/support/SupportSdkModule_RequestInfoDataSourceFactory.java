package zendesk.support;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import zendesk.support.requestlist.RequestInfoDataSource;

public final class SupportSdkModule_RequestInfoDataSourceFactory implements ry1<RequestInfoDataSource.LocalDataSource> {
    private final ky4<ExecutorService> backgroundThreadExecutorProvider;
    private final ky4<Executor> mainThreadExecutorProvider;
    private final SupportSdkModule module;
    private final ky4<SupportUiStorage> supportUiStorageProvider;

    public SupportSdkModule_RequestInfoDataSourceFactory(SupportSdkModule supportSdkModule, ky4<SupportUiStorage> ky4, ky4<Executor> ky42, ky4<ExecutorService> ky43) {
        this.module = supportSdkModule;
        this.supportUiStorageProvider = ky4;
        this.mainThreadExecutorProvider = ky42;
        this.backgroundThreadExecutorProvider = ky43;
    }

    public static SupportSdkModule_RequestInfoDataSourceFactory create(SupportSdkModule supportSdkModule, ky4<SupportUiStorage> ky4, ky4<Executor> ky42, ky4<ExecutorService> ky43) {
        return new SupportSdkModule_RequestInfoDataSourceFactory(supportSdkModule, ky4, ky42, ky43);
    }

    public static RequestInfoDataSource.LocalDataSource requestInfoDataSource(SupportSdkModule supportSdkModule, SupportUiStorage supportUiStorage, Executor executor, ExecutorService executorService) {
        return (RequestInfoDataSource.LocalDataSource) fu4.m44415f(supportSdkModule.requestInfoDataSource(supportUiStorage, executor, executorService));
    }

    public RequestInfoDataSource.LocalDataSource get() {
        return requestInfoDataSource(this.module, this.supportUiStorageProvider.get(), this.mainThreadExecutorProvider.get(), this.backgroundThreadExecutorProvider.get());
    }
}
