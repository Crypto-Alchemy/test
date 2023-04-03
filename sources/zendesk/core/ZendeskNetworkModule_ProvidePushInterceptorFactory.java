package zendesk.core;

public final class ZendeskNetworkModule_ProvidePushInterceptorFactory implements ry1<ZendeskPushInterceptor> {
    private final ky4<IdentityStorage> identityStorageProvider;
    private final ky4<PushDeviceIdStorage> pushDeviceIdStorageProvider;
    private final ky4<PushRegistrationProviderInternal> pushProvider;

    public ZendeskNetworkModule_ProvidePushInterceptorFactory(ky4<PushRegistrationProviderInternal> ky4, ky4<PushDeviceIdStorage> ky42, ky4<IdentityStorage> ky43) {
        this.pushProvider = ky4;
        this.pushDeviceIdStorageProvider = ky42;
        this.identityStorageProvider = ky43;
    }

    public static ZendeskNetworkModule_ProvidePushInterceptorFactory create(ky4<PushRegistrationProviderInternal> ky4, ky4<PushDeviceIdStorage> ky42, ky4<IdentityStorage> ky43) {
        return new ZendeskNetworkModule_ProvidePushInterceptorFactory(ky4, ky42, ky43);
    }

    public static ZendeskPushInterceptor providePushInterceptor(Object obj, Object obj2, Object obj3) {
        return (ZendeskPushInterceptor) fu4.m44415f(ZendeskNetworkModule.providePushInterceptor((PushRegistrationProviderInternal) obj, (PushDeviceIdStorage) obj2, (IdentityStorage) obj3));
    }

    public ZendeskPushInterceptor get() {
        return providePushInterceptor(this.pushProvider.get(), this.pushDeviceIdStorageProvider.get(), this.identityStorageProvider.get());
    }
}
