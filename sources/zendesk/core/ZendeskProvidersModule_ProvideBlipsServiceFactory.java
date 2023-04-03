package zendesk.core;

public final class ZendeskProvidersModule_ProvideBlipsServiceFactory implements ry1<BlipsService> {
    private final ky4<og5> retrofitProvider;

    public ZendeskProvidersModule_ProvideBlipsServiceFactory(ky4<og5> ky4) {
        this.retrofitProvider = ky4;
    }

    public static ZendeskProvidersModule_ProvideBlipsServiceFactory create(ky4<og5> ky4) {
        return new ZendeskProvidersModule_ProvideBlipsServiceFactory(ky4);
    }

    public static BlipsService provideBlipsService(og5 og5) {
        return (BlipsService) fu4.m44415f(ZendeskProvidersModule.provideBlipsService(og5));
    }

    public BlipsService get() {
        return provideBlipsService(this.retrofitProvider.get());
    }
}
