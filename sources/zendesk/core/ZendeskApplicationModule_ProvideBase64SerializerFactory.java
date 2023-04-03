package zendesk.core;

public final class ZendeskApplicationModule_ProvideBase64SerializerFactory implements ry1<Serializer> {
    private final ky4<Serializer> gsonSerializerProvider;
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideBase64SerializerFactory(ZendeskApplicationModule zendeskApplicationModule, ky4<Serializer> ky4) {
        this.module = zendeskApplicationModule;
        this.gsonSerializerProvider = ky4;
    }

    public static ZendeskApplicationModule_ProvideBase64SerializerFactory create(ZendeskApplicationModule zendeskApplicationModule, ky4<Serializer> ky4) {
        return new ZendeskApplicationModule_ProvideBase64SerializerFactory(zendeskApplicationModule, ky4);
    }

    public static Serializer provideBase64Serializer(ZendeskApplicationModule zendeskApplicationModule, Object obj) {
        return (Serializer) fu4.m44415f(zendeskApplicationModule.provideBase64Serializer((Serializer) obj));
    }

    public Serializer get() {
        return provideBase64Serializer(this.module, this.gsonSerializerProvider.get());
    }
}
