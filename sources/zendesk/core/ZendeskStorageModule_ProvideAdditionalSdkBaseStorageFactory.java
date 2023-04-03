package zendesk.core;

import android.content.Context;

public final class ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory implements ry1<BaseStorage> {
    private final ky4<Context> contextProvider;
    private final ky4<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory(ky4<Context> ky4, ky4<Serializer> ky42) {
        this.contextProvider = ky4;
        this.serializerProvider = ky42;
    }

    public static ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory create(ky4<Context> ky4, ky4<Serializer> ky42) {
        return new ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory(ky4, ky42);
    }

    public static BaseStorage provideAdditionalSdkBaseStorage(Context context, Object obj) {
        return (BaseStorage) fu4.m44415f(ZendeskStorageModule.provideAdditionalSdkBaseStorage(context, (Serializer) obj));
    }

    public BaseStorage get() {
        return provideAdditionalSdkBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
