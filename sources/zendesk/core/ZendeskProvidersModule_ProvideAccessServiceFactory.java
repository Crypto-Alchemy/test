package zendesk.core;

public final class ZendeskProvidersModule_ProvideAccessServiceFactory implements ry1<AccessService> {
    private final ky4<og5> retrofitProvider;

    public ZendeskProvidersModule_ProvideAccessServiceFactory(ky4<og5> ky4) {
        this.retrofitProvider = ky4;
    }

    public static ZendeskProvidersModule_ProvideAccessServiceFactory create(ky4<og5> ky4) {
        return new ZendeskProvidersModule_ProvideAccessServiceFactory(ky4);
    }

    public static AccessService provideAccessService(og5 og5) {
        return (AccessService) fu4.m44415f(ZendeskProvidersModule.provideAccessService(og5));
    }

    public AccessService get() {
        return provideAccessService(this.retrofitProvider.get());
    }
}
