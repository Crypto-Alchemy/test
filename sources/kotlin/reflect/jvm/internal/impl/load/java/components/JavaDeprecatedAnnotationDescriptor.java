package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaDeprecatedAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* renamed from: h */
    public static final /* synthetic */ i93<Object>[] f39438h = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(JavaDeprecatedAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    public final q84 f39439g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaDeprecatedAnnotationDescriptor(h03 h03, pf3 pf3) {
        super(pf3, h03, C7395c.C7396a.f39204y);
        vx2.m53591g(pf3, "c");
        this.f39439g = pf3.mo65300e().mo51164i(JavaDeprecatedAnnotationDescriptor$allValueArguments$2.INSTANCE);
    }

    /* renamed from: f */
    public Map<r24, fq0<?>> mo53264f() {
        return (Map) ca6.m56364a(this.f39439g, this, f39438h[0]);
    }
}
