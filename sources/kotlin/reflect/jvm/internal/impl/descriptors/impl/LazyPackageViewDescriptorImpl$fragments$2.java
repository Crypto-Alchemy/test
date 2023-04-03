package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
public final class LazyPackageViewDescriptorImpl$fragments$2 extends Lambda implements pc2<List<? extends fk4>> {
    public final /* synthetic */ LazyPackageViewDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$fragments$2(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.this$0 = lazyPackageViewDescriptorImpl;
    }

    public final List<fk4> invoke() {
        return ik4.m58997c(this.this$0.getModule().mo53292K0(), this.this$0.mo53283e());
    }
}
