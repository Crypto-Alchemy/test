package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.slf4j.Marker;

/* compiled from: DescriptorRendererImpl.kt */
public final class DescriptorRendererImpl$appendTypeProjections$1 extends Lambda implements rc2<f17, CharSequence> {
    public final /* synthetic */ DescriptorRendererImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$appendTypeProjections$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.this$0 = descriptorRendererImpl;
    }

    public final CharSequence invoke(f17 f17) {
        vx2.m53591g(f17, "it");
        if (f17.mo51408b()) {
            return Marker.ANY_MARKER;
        }
        DescriptorRendererImpl descriptorRendererImpl = this.this$0;
        xc3 type = f17.getType();
        vx2.m53590f(type, "it.type");
        String w = descriptorRendererImpl.mo54815w(type);
        if (f17.mo51409c() == Variance.INVARIANT) {
            return w;
        }
        return f17.mo51409c() + ' ' + w;
    }
}
