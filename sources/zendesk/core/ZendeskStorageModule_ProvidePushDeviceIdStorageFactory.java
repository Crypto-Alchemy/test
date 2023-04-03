package zendesk.core;

public final class ZendeskStorageModule_ProvidePushDeviceIdStorageFactory implements ry1<PushDeviceIdStorage> {
    private final ky4<BaseStorage> additionalSdkStorageProvider;

    public ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(ky4<BaseStorage> ky4) {
        this.additionalSdkStorageProvider = ky4;
    }

    public static ZendeskStorageModule_ProvidePushDeviceIdStorageFactory create(ky4<BaseStorage> ky4) {
        return new ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(ky4);
    }

    public static PushDeviceIdStorage providePushDeviceIdStorage(BaseStorage baseStorage) {
        return (PushDeviceIdStorage) fu4.m44415f(ZendeskStorageModule.providePushDeviceIdStorage(baseStorage));
    }

    public PushDeviceIdStorage get() {
        return providePushDeviceIdStorage(this.additionalSdkStorageProvider.get());
    }
}
