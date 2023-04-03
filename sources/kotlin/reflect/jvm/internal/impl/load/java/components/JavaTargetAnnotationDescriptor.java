package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* renamed from: h */
    public static final /* synthetic */ i93<Object>[] f39442h = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(JavaTargetAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    public final q84 f39443g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(h03 h03, pf3 pf3) {
        super(pf3, h03, C7395c.C7396a.f39134H);
        vx2.m53591g(h03, "annotation");
        vx2.m53591g(pf3, "c");
        this.f39443g = pf3.mo65300e().mo51164i(new JavaTargetAnnotationDescriptor$allValueArguments$2(this));
    }

    /* renamed from: f */
    public Map<r24, fq0<Object>> mo53264f() {
        return (Map) ca6.m56364a(this.f39443g, this, f39442h[0]);
    }
}
