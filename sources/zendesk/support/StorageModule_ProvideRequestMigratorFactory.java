package zendesk.support;

import android.content.Context;

public final class StorageModule_ProvideRequestMigratorFactory implements ry1<RequestMigrator> {
    private final ky4<Context> contextProvider;
    private final StorageModule module;

    public StorageModule_ProvideRequestMigratorFactory(StorageModule storageModule, ky4<Context> ky4) {
        this.module = storageModule;
        this.contextProvider = ky4;
    }

    public static StorageModule_ProvideRequestMigratorFactory create(StorageModule storageModule, ky4<Context> ky4) {
        return new StorageModule_ProvideRequestMigratorFactory(storageModule, ky4);
    }

    public static RequestMigrator provideRequestMigrator(StorageModule storageModule, Context context) {
        return (RequestMigrator) fu4.m44415f(storageModule.provideRequestMigrator(context));
    }

    public RequestMigrator get() {
        return provideRequestMigrator(this.module, this.contextProvider.get());
    }
}
