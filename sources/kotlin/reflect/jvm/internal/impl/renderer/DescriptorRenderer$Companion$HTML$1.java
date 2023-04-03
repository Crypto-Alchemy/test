package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;

/* compiled from: DescriptorRenderer.kt */
public final class DescriptorRenderer$Companion$HTML$1 extends Lambda implements rc2<zc1, r37> {
    public static final DescriptorRenderer$Companion$HTML$1 INSTANCE = new DescriptorRenderer$Companion$HTML$1();

    public DescriptorRenderer$Companion$HTML$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((zc1) obj);
        return r37.f33317a;
    }

    public final void invoke(zc1 zc1) {
        vx2.m53591g(zc1, "$this$withOptions");
        zc1.mo54920h(RenderingFormat.HTML);
        zc1.mo54935m(DescriptorRendererModifier.ALL);
    }
}
