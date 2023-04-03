package zendesk.support;

import com.google.gson.Gson;

public final class SupportSdkModule_SupportUiStorageFactory implements ry1<SupportUiStorage> {
    private final ky4<ch1> diskLruCacheProvider;
    private final ky4<Gson> gsonProvider;
    private final SupportSdkModule module;

    public SupportSdkModule_SupportUiStorageFactory(SupportSdkModule supportSdkModule, ky4<ch1> ky4, ky4<Gson> ky42) {
        this.module = supportSdkModule;
        this.diskLruCacheProvider = ky4;
        this.gsonProvider = ky42;
    }

    public static SupportSdkModule_SupportUiStorageFactory create(SupportSdkModule supportSdkModule, ky4<ch1> ky4, ky4<Gson> ky42) {
        return new SupportSdkModule_SupportUiStorageFactory(supportSdkModule, ky4, ky42);
    }

    public static SupportUiStorage supportUiStorage(SupportSdkModule supportSdkModule, ch1 ch1, Gson gson) {
        return (SupportUiStorage) fu4.m44415f(supportSdkModule.supportUiStorage(ch1, gson));
    }

    public SupportUiStorage get() {
        return supportUiStorage(this.module, this.diskLruCacheProvider.get(), this.gsonProvider.get());
    }
}
