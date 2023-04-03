package zendesk.support;

import com.google.gson.Gson;

public final class SupportSdkModule_ProvidesFactory implements ry1<Gson> {
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static SupportSdkModule_ProvidesFactory create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ProvidesFactory(supportSdkModule);
    }

    public static Gson provides(SupportSdkModule supportSdkModule) {
        return (Gson) fu4.m44415f(supportSdkModule.provides());
    }

    public Gson get() {
        return provides(this.module);
    }
}
