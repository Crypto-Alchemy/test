package zendesk.core;

import java.io.File;
import okhttp3.Cache;

public final class ZendeskStorageModule_ProvideSessionStorageFactory implements ry1<SessionStorage> {
    private final ky4<BaseStorage> additionalSdkStorageProvider;
    private final ky4<File> belvedereDirProvider;
    private final ky4<File> cacheDirProvider;
    private final ky4<Cache> cacheProvider;
    private final ky4<File> dataDirProvider;
    private final ky4<IdentityStorage> identityStorageProvider;
    private final ky4<BaseStorage> mediaCacheProvider;

    public ZendeskStorageModule_ProvideSessionStorageFactory(ky4<IdentityStorage> ky4, ky4<BaseStorage> ky42, ky4<BaseStorage> ky43, ky4<Cache> ky44, ky4<File> ky45, ky4<File> ky46, ky4<File> ky47) {
        this.identityStorageProvider = ky4;
        this.additionalSdkStorageProvider = ky42;
        this.mediaCacheProvider = ky43;
        this.cacheProvider = ky44;
        this.cacheDirProvider = ky45;
        this.dataDirProvider = ky46;
        this.belvedereDirProvider = ky47;
    }

    public static ZendeskStorageModule_ProvideSessionStorageFactory create(ky4<IdentityStorage> ky4, ky4<BaseStorage> ky42, ky4<BaseStorage> ky43, ky4<Cache> ky44, ky4<File> ky45, ky4<File> ky46, ky4<File> ky47) {
        return new ZendeskStorageModule_ProvideSessionStorageFactory(ky4, ky42, ky43, ky44, ky45, ky46, ky47);
    }

    public static SessionStorage provideSessionStorage(Object obj, BaseStorage baseStorage, BaseStorage baseStorage2, Cache cache, File file, File file2, File file3) {
        return (SessionStorage) fu4.m44415f(ZendeskStorageModule.provideSessionStorage((IdentityStorage) obj, baseStorage, baseStorage2, cache, file, file2, file3));
    }

    public SessionStorage get() {
        return provideSessionStorage(this.identityStorageProvider.get(), this.additionalSdkStorageProvider.get(), this.mediaCacheProvider.get(), this.cacheProvider.get(), this.cacheDirProvider.get(), this.dataDirProvider.get(), this.belvedereDirProvider.get());
    }
}
