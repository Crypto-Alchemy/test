package zendesk.core;

import android.content.Context;

public final class ZendeskStorageModule_ProvideSettingsBaseStorageFactory implements ry1<BaseStorage> {
    private final ky4<Context> contextProvider;
    private final ky4<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideSettingsBaseStorageFactory(ky4<Context> ky4, ky4<Serializer> ky42) {
        this.contextProvider = ky4;
        this.serializerProvider = ky42;
    }

    public static ZendeskStorageModule_ProvideSettingsBaseStorageFactory create(ky4<Context> ky4, ky4<Serializer> ky42) {
        return new ZendeskStorageModule_ProvideSettingsBaseStorageFactory(ky4, ky42);
    }

    public static BaseStorage provideSettingsBaseStorage(Context context, Object obj) {
        return (BaseStorage) fu4.m44415f(ZendeskStorageModule.provideSettingsBaseStorage(context, (Serializer) obj));
    }

    public BaseStorage get() {
        return provideSettingsBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
