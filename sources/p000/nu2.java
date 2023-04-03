package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* renamed from: nu2 */
/* compiled from: inlineClassesUtils.kt */
public final class nu2 {

    /* renamed from: a */
    public static final u82 f43563a;

    /* renamed from: b */
    public static final nf0 f43564b;

    static {
        u82 u82 = new u82("kotlin.jvm.JvmInline");
        f43563a = u82;
        nf0 m = nf0.m69751m(u82);
        vx2.m53590f(m, "topLevel(JVM_INLINE_ANNOTATION_FQ_NAME)");
        f43564b = m;
    }

    /* renamed from: a */
    public static final boolean m70089a(C7420a aVar) {
        vx2.m53591g(aVar, "<this>");
        if (aVar instanceof ix4) {
            fx4 R = ((ix4) aVar).mo51316R();
            vx2.m53590f(R, "correspondingProperty");
            if (m70092d(R)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m70090b(d31 d31) {
        vx2.m53591g(d31, "<this>");
        if (!(d31 instanceof if0) || !(((if0) d31).mo52344P() instanceof mu2)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m70091c(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d != null) {
            return m70090b(d);
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m70092d(o87 o87) {
        if0 if0;
        mu2<d36> j;
        vx2.m53591g(o87, "<this>");
        if (o87.mo51315J() == null) {
            d31 b = o87.mo51119b();
            r24 r24 = null;
            if (b instanceof if0) {
                if0 = (if0) b;
            } else {
                if0 = null;
            }
            if (!(if0 == null || (j = DescriptorUtilsKt.m62449j(if0)) == null)) {
                r24 = j.mo56329c();
            }
            if (vx2.m53586b(r24, o87.getName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final xc3 m70093e(xc3 xc3) {
        mu2<d36> j;
        vx2.m53591g(xc3, "<this>");
        eg0 d = xc3.mo51134H0().mo51180d();
        if (!(d instanceof if0)) {
            d = null;
        }
        if0 if0 = (if0) d;
        if (if0 == null || (j = DescriptorUtilsKt.m62449j(if0)) == null) {
            return null;
        }
        return j.mo56330d();
    }
}
