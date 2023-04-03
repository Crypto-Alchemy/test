package zendesk.support;

import zendesk.core.RestServiceProvider;

public final class ServiceModule_ProvidesRequestServiceFactory implements ry1<RequestService> {
    private final ky4<RestServiceProvider> restServiceProvider;

    public ServiceModule_ProvidesRequestServiceFactory(ky4<RestServiceProvider> ky4) {
        this.restServiceProvider = ky4;
    }

    public static ServiceModule_ProvidesRequestServiceFactory create(ky4<RestServiceProvider> ky4) {
        return new ServiceModule_ProvidesRequestServiceFactory(ky4);
    }

    public static RequestService providesRequestService(RestServiceProvider restServiceProvider2) {
        return (RequestService) fu4.m44415f(ServiceModule.providesRequestService(restServiceProvider2));
    }

    public RequestService get() {
        return providesRequestService(this.restServiceProvider.get());
    }
}
