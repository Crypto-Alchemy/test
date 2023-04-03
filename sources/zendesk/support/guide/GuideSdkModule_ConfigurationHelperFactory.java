package zendesk.support.guide;

public final class GuideSdkModule_ConfigurationHelperFactory implements ry1<ro0> {
    private final GuideSdkModule module;

    public GuideSdkModule_ConfigurationHelperFactory(GuideSdkModule guideSdkModule) {
        this.module = guideSdkModule;
    }

    public static ro0 configurationHelper(GuideSdkModule guideSdkModule) {
        return (ro0) fu4.m44415f(guideSdkModule.configurationHelper());
    }

    public static GuideSdkModule_ConfigurationHelperFactory create(GuideSdkModule guideSdkModule) {
        return new GuideSdkModule_ConfigurationHelperFactory(guideSdkModule);
    }

    public ro0 get() {
        return configurationHelper(this.module);
    }
}
