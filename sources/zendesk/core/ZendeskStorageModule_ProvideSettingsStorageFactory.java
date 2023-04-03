package zendesk.core;

public final class ZendeskStorageModule_ProvideSettingsStorageFactory implements ry1<SettingsStorage> {
    private final ky4<BaseStorage> baseStorageProvider;

    public ZendeskStorageModule_ProvideSettingsStorageFactory(ky4<BaseStorage> ky4) {
        this.baseStorageProvider = ky4;
    }

    public static ZendeskStorageModule_ProvideSettingsStorageFactory create(ky4<BaseStorage> ky4) {
        return new ZendeskStorageModule_ProvideSettingsStorageFactory(ky4);
    }

    public static SettingsStorage provideSettingsStorage(BaseStorage baseStorage) {
        return (SettingsStorage) fu4.m44415f(ZendeskStorageModule.provideSettingsStorage(baseStorage));
    }

    public SettingsStorage get() {
        return provideSettingsStorage(this.baseStorageProvider.get());
    }
}
