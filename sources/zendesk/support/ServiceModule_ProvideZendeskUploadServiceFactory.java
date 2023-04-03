package zendesk.support;

public final class ServiceModule_ProvideZendeskUploadServiceFactory implements ry1<ZendeskUploadService> {
    private final ky4<UploadService> uploadServiceProvider;

    public ServiceModule_ProvideZendeskUploadServiceFactory(ky4<UploadService> ky4) {
        this.uploadServiceProvider = ky4;
    }

    public static ServiceModule_ProvideZendeskUploadServiceFactory create(ky4<UploadService> ky4) {
        return new ServiceModule_ProvideZendeskUploadServiceFactory(ky4);
    }

    public static ZendeskUploadService provideZendeskUploadService(Object obj) {
        return (ZendeskUploadService) fu4.m44415f(ServiceModule.provideZendeskUploadService((UploadService) obj));
    }

    public ZendeskUploadService get() {
        return provideZendeskUploadService(this.uploadServiceProvider.get());
    }
}
