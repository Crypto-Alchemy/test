package zendesk.support;

public final class ServiceModule_ProvideZendeskRequestServiceFactory implements ry1<ZendeskRequestService> {
    private final ky4<RequestService> requestServiceProvider;

    public ServiceModule_ProvideZendeskRequestServiceFactory(ky4<RequestService> ky4) {
        this.requestServiceProvider = ky4;
    }

    public static ServiceModule_ProvideZendeskRequestServiceFactory create(ky4<RequestService> ky4) {
        return new ServiceModule_ProvideZendeskRequestServiceFactory(ky4);
    }

    public static ZendeskRequestService provideZendeskRequestService(Object obj) {
        return (ZendeskRequestService) fu4.m44415f(ServiceModule.provideZendeskRequestService((RequestService) obj));
    }

    public ZendeskRequestService get() {
        return provideZendeskRequestService(this.requestServiceProvider.get());
    }
}
