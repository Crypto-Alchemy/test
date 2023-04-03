package zendesk.core;

/* renamed from: zendesk.core.ZendeskProvidersModule_ProvidePushRegistrationProviderInternalFactory */
public final class C9865xb2419e95 implements ry1<PushRegistrationProviderInternal> {
    private final ky4<PushRegistrationProvider> pushRegistrationProvider;

    public C9865xb2419e95(ky4<PushRegistrationProvider> ky4) {
        this.pushRegistrationProvider = ky4;
    }

    public static C9865xb2419e95 create(ky4<PushRegistrationProvider> ky4) {
        return new C9865xb2419e95(ky4);
    }

    public static PushRegistrationProviderInternal providePushRegistrationProviderInternal(PushRegistrationProvider pushRegistrationProvider2) {
        return (PushRegistrationProviderInternal) fu4.m44415f(ZendeskProvidersModule.providePushRegistrationProviderInternal(pushRegistrationProvider2));
    }

    public PushRegistrationProviderInternal get() {
        return providePushRegistrationProviderInternal(this.pushRegistrationProvider.get());
    }
}
