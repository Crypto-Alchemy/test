package zendesk.core;

public final class ZendeskStorageModule_ProvideCoreSettingsStorageFactory implements ry1<CoreSettingsStorage> {
    private final ky4<SettingsStorage> settingsStorageProvider;

    public ZendeskStorageModule_ProvideCoreSettingsStorageFactory(ky4<SettingsStorage> ky4) {
        this.settingsStorageProvider = ky4;
    }

    public static ZendeskStorageModule_ProvideCoreSettingsStorageFactory create(ky4<SettingsStorage> ky4) {
        return new ZendeskStorageModule_ProvideCoreSettingsStorageFactory(ky4);
    }

    public static CoreSettingsStorage provideCoreSettingsStorage(Object obj) {
        return (CoreSettingsStorage) fu4.m44415f(ZendeskStorageModule.provideCoreSettingsStorage((SettingsStorage) obj));
    }

    public CoreSettingsStorage get() {
        return provideCoreSettingsStorage(this.settingsStorageProvider.get());
    }
}
