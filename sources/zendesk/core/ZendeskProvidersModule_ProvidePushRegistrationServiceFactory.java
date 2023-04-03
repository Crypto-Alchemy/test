package zendesk.core;

public final class ZendeskProvidersModule_ProvidePushRegistrationServiceFactory implements ry1<PushRegistrationService> {
    private final ky4<og5> retrofitProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(ky4<og5> ky4) {
        this.retrofitProvider = ky4;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationServiceFactory create(ky4<og5> ky4) {
        return new ZendeskProvidersModule_ProvidePushRegistrationServiceFactory(ky4);
    }

    public static PushRegistrationService providePushRegistrationService(og5 og5) {
        return (PushRegistrationService) fu4.m44415f(ZendeskProvidersModule.providePushRegistrationService(og5));
    }

    public PushRegistrationService get() {
        return providePushRegistrationService(this.retrofitProvider.get());
    }
}
