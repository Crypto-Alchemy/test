package p000;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.Map;
import kotlin.collections.C6177b;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;

/* renamed from: k03 */
/* compiled from: JavaAnnotationMapper.kt */
public final class k03 {

    /* renamed from: a */
    public static final k03 f38828a = new k03();

    /* renamed from: b */
    public static final r24 f38829b;

    /* renamed from: c */
    public static final r24 f38830c;

    /* renamed from: d */
    public static final r24 f38831d;

    /* renamed from: e */
    public static final Map<u82, u82> f38832e = C6177b.m47364l(wy6.m54142a(C7395c.C7396a.f39134H, t73.f44656d), wy6.m54142a(C7395c.C7396a.f39141L, t73.f44658f), wy6.m54142a(C7395c.C7396a.f39145P, t73.f44661i));

    static {
        r24 h = r24.m71445h(ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53590f(h, "identifier(\"message\")");
        f38829b = h;
        r24 h2 = r24.m71445h("allowedTargets");
        vx2.m53590f(h2, "identifier(\"allowedTargets\")");
        f38830c = h2;
        r24 h3 = r24.m71445h("value");
        vx2.m53590f(h3, "identifier(\"value\")");
        f38831d = h3;
    }

    /* renamed from: f */
    public static /* synthetic */ C9460vl m59644f(k03 k03, h03 h03, pf3 pf3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return k03.mo52840e(h03, pf3, z);
    }

    /* renamed from: a */
    public final C9460vl mo52836a(u82 u82, l03 l03, pf3 pf3) {
        h03 x;
        vx2.m53591g(u82, "kotlinName");
        vx2.m53591g(l03, "annotationOwner");
        vx2.m53591g(pf3, "c");
        if (vx2.m53586b(u82, C7395c.C7396a.f39204y)) {
            u82 u822 = t73.f44660h;
            vx2.m53590f(u822, "DEPRECATED_ANNOTATION");
            h03 x2 = l03.mo51429x(u822);
            if (x2 != null || l03.mo51412D()) {
                return new JavaDeprecatedAnnotationDescriptor(x2, pf3);
            }
        }
        u82 u823 = f38832e.get(u82);
        if (u823 == null || (x = l03.mo51429x(u823)) == null) {
            return null;
        }
        return m59644f(f38828a, x, pf3, false, 4, (Object) null);
    }

    /* renamed from: b */
    public final r24 mo52837b() {
        return f38829b;
    }

    /* renamed from: c */
    public final r24 mo52838c() {
        return f38831d;
    }

    /* renamed from: d */
    public final r24 mo52839d() {
        return f38830c;
    }

    /* renamed from: e */
    public final C9460vl mo52840e(h03 h03, pf3 pf3, boolean z) {
        vx2.m53591g(h03, "annotation");
        vx2.m53591g(pf3, "c");
        nf0 i = h03.mo52089i();
        if (vx2.m53586b(i, nf0.m69751m(t73.f44656d))) {
            return new JavaTargetAnnotationDescriptor(h03, pf3);
        }
        if (vx2.m53586b(i, nf0.m69751m(t73.f44658f))) {
            return new JavaRetentionAnnotationDescriptor(h03, pf3);
        }
        if (vx2.m53586b(i, nf0.m69751m(t73.f44661i))) {
            return new JavaAnnotationDescriptor(pf3, h03, C7395c.C7396a.f39145P);
        }
        if (vx2.m53586b(i, nf0.m69751m(t73.f44660h))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(pf3, h03, z);
    }
}
