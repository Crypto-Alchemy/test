package zendesk.core;

import android.content.Context;

public final class ZendeskStorageModule_ProvideSdkBaseStorageFactory implements ry1<BaseStorage> {
    private final ky4<Context> contextProvider;
    private final ky4<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideSdkBaseStorageFactory(ky4<Context> ky4, ky4<Serializer> ky42) {
        this.contextProvider = ky4;
        this.serializerProvider = ky42;
    }

    public static ZendeskStorageModule_ProvideSdkBaseStorageFactory create(ky4<Context> ky4, ky4<Serializer> ky42) {
        return new ZendeskStorageModule_ProvideSdkBaseStorageFactory(ky4, ky42);
    }

    public static BaseStorage provideSdkBaseStorage(Context context, Object obj) {
        return (BaseStorage) fu4.m44415f(ZendeskStorageModule.provideSdkBaseStorage(context, (Serializer) obj));
    }

    public BaseStorage get() {
        return provideSdkBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
