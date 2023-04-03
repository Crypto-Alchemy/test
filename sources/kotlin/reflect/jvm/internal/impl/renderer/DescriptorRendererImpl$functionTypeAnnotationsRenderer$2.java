package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;

/* compiled from: DescriptorRendererImpl.kt */
public final class DescriptorRendererImpl$functionTypeAnnotationsRenderer$2 extends Lambda implements pc2<DescriptorRendererImpl> {
    public final /* synthetic */ DescriptorRendererImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(DescriptorRendererImpl descriptorRendererImpl) {
        super(0);
        this.this$0 = descriptorRendererImpl;
    }

    public final DescriptorRendererImpl invoke() {
        DescriptorRenderer y = this.this$0.mo54817y(C76461.INSTANCE);
        vx2.m53589e(y, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (DescriptorRendererImpl) y;
    }
}
