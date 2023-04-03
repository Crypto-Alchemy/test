package zendesk.core;

import java.io.File;

public final class ZendeskStorageModule_ProvidesDiskLruStorageFactory implements ry1<BaseStorage> {
    private final ky4<File> fileProvider;
    private final ky4<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvidesDiskLruStorageFactory(ky4<File> ky4, ky4<Serializer> ky42) {
        this.fileProvider = ky4;
        this.serializerProvider = ky42;
    }

    public static ZendeskStorageModule_ProvidesDiskLruStorageFactory create(ky4<File> ky4, ky4<Serializer> ky42) {
        return new ZendeskStorageModule_ProvidesDiskLruStorageFactory(ky4, ky42);
    }

    public static BaseStorage providesDiskLruStorage(File file, Object obj) {
        return (BaseStorage) fu4.m44415f(ZendeskStorageModule.providesDiskLruStorage(file, (Serializer) obj));
    }

    public BaseStorage get() {
        return providesDiskLruStorage(this.fileProvider.get(), this.serializerProvider.get());
    }
}
