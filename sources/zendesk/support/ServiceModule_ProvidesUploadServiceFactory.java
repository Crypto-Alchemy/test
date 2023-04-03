package zendesk.support;

import zendesk.core.RestServiceProvider;

public final class ServiceModule_ProvidesUploadServiceFactory implements ry1<UploadService> {
    private final ky4<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesUploadServiceFactory(ky4<RestServiceProvider> ky4) {
        this.restServiceProvider = ky4;
    }

    public static ServiceModule_ProvidesUploadServiceFactory create(ky4<RestServiceProvider> ky4) {
        return new ServiceModule_ProvidesUploadServiceFactory(ky4);
    }

    public static UploadService providesUploadService(RestServiceProvider restServiceProvider2) {
        return (UploadService) fu4.m44415f(ServiceModule.providesUploadService(restServiceProvider2));
    }

    public UploadService get() {
        return providesUploadService(this.restServiceProvider.get());
    }
}
