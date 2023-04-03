package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Lambda;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
public final class LazyPackageViewDescriptorImpl$empty$2 extends Lambda implements pc2<Boolean> {
    public final /* synthetic */ LazyPackageViewDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl$empty$2(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.this$0 = lazyPackageViewDescriptorImpl;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(ik4.m58996b(this.this$0.getModule().mo53292K0(), this.this$0.mo53283e()));
    }
}
