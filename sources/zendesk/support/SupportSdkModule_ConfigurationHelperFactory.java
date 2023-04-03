package zendesk.support;

public final class SupportSdkModule_ConfigurationHelperFactory implements ry1<ro0> {
    private final SupportSdkModule module;

    public SupportSdkModule_ConfigurationHelperFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static ro0 configurationHelper(SupportSdkModule supportSdkModule) {
        return (ro0) fu4.m44415f(supportSdkModule.configurationHelper());
    }

    public static SupportSdkModule_ConfigurationHelperFactory create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ConfigurationHelperFactory(supportSdkModule);
    }

    public ro0 get() {
        return configurationHelper(this.module);
    }
}
