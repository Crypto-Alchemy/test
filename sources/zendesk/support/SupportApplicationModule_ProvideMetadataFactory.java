package zendesk.support;

import android.content.Context;

public final class SupportApplicationModule_ProvideMetadataFactory implements ry1<SupportSdkMetadata> {
    private final ky4<Context> contextProvider;
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideMetadataFactory(SupportApplicationModule supportApplicationModule, ky4<Context> ky4) {
        this.module = supportApplicationModule;
        this.contextProvider = ky4;
    }

    public static SupportApplicationModule_ProvideMetadataFactory create(SupportApplicationModule supportApplicationModule, ky4<Context> ky4) {
        return new SupportApplicationModule_ProvideMetadataFactory(supportApplicationModule, ky4);
    }

    public static SupportSdkMetadata provideMetadata(SupportApplicationModule supportApplicationModule, Context context) {
        return (SupportSdkMetadata) fu4.m44415f(supportApplicationModule.provideMetadata(context));
    }

    public SupportSdkMetadata get() {
        return provideMetadata(this.module, this.contextProvider.get());
    }
}
