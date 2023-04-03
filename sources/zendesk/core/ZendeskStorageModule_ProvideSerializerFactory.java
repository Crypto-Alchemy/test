package zendesk.core;

import com.google.gson.Gson;

public final class ZendeskStorageModule_ProvideSerializerFactory implements ry1<Serializer> {
    private final ky4<Gson> gsonProvider;

    public ZendeskStorageModule_ProvideSerializerFactory(ky4<Gson> ky4) {
        this.gsonProvider = ky4;
    }

    public static ZendeskStorageModule_ProvideSerializerFactory create(ky4<Gson> ky4) {
        return new ZendeskStorageModule_ProvideSerializerFactory(ky4);
    }

    public static Serializer provideSerializer(Gson gson) {
        return (Serializer) fu4.m44415f(ZendeskStorageModule.provideSerializer(gson));
    }

    public Serializer get() {
        return provideSerializer(this.gsonProvider.get());
    }
}
