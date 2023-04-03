package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* renamed from: ba5 */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class ba5 extends p95 implements e13 {

    /* renamed from: c */
    public final Enum<?> f36793c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ba5(r24 r24, Enum<?> enumR) {
        super(r24, (DefaultConstructorMarker) null);
        vx2.m53591g(enumR, "value");
        this.f36793c = enumR;
    }

    /* renamed from: d */
    public nf0 mo50548d() {
        Class<?> cls = this.f36793c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        vx2.m53590f(cls, "enumClass");
        return ReflectClassUtilKt.m60593a(cls);
    }

    /* renamed from: e */
    public r24 mo50549e() {
        return r24.m71445h(this.f36793c.name());
    }
}
