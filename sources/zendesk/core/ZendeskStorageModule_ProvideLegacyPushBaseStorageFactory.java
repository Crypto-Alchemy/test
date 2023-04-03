package zendesk.core;

import android.content.Context;

public final class ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory implements ry1<SharedPreferencesStorage> {
    private final ky4<Context> contextProvider;
    private final ky4<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory(ky4<Context> ky4, ky4<Serializer> ky42) {
        this.contextProvider = ky4;
        this.serializerProvider = ky42;
    }

    public static ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory create(ky4<Context> ky4, ky4<Serializer> ky42) {
        return new ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory(ky4, ky42);
    }

    public static SharedPreferencesStorage provideLegacyPushBaseStorage(Context context, Object obj) {
        return (SharedPreferencesStorage) fu4.m44415f(ZendeskStorageModule.provideLegacyPushBaseStorage(context, (Serializer) obj));
    }

    public SharedPreferencesStorage get() {
        return provideLegacyPushBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
