package p000;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* renamed from: d23 */
/* compiled from: JavaToKotlinClassMapper.kt */
public final class d23 {

    /* renamed from: a */
    public static final d23 f37229a = new d23();

    /* renamed from: f */
    public static /* synthetic */ if0 m56622f(d23 d23, u82 u82, C7389b bVar, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return d23.mo51032e(u82, bVar, num);
    }

    /* renamed from: a */
    public final if0 mo51028a(if0 if0) {
        vx2.m53591g(if0, "mutable");
        u82 o = c23.f37039a.mo50794o(dd1.m56821m(if0));
        if (o != null) {
            if0 o2 = DescriptorUtilsKt.m62445f(if0).mo53175o(o);
            vx2.m53590f(o2, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return o2;
        }
        throw new IllegalArgumentException("Given class " + if0 + " is not a " + "mutable" + " collection");
    }

    /* renamed from: b */
    public final if0 mo51029b(if0 if0) {
        vx2.m53591g(if0, "readOnly");
        u82 p = c23.f37039a.mo50795p(dd1.m56821m(if0));
        if (p != null) {
            if0 o = DescriptorUtilsKt.m62445f(if0).mo53175o(p);
            vx2.m53590f(o, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return o;
        }
        throw new IllegalArgumentException("Given class " + if0 + " is not a " + "read-only" + " collection");
    }

    /* renamed from: c */
    public final boolean mo51030c(if0 if0) {
        vx2.m53591g(if0, "mutable");
        return c23.f37039a.mo50790k(dd1.m56821m(if0));
    }

    /* renamed from: d */
    public final boolean mo51031d(if0 if0) {
        vx2.m53591g(if0, "readOnly");
        return c23.f37039a.mo50791l(dd1.m56821m(if0));
    }

    /* renamed from: e */
    public final if0 mo51032e(u82 u82, C7389b bVar, Integer num) {
        nf0 nf0;
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(bVar, "builtIns");
        if (num == null || !vx2.m53586b(u82, c23.f37039a.mo50787h())) {
            nf0 = c23.f37039a.mo50792m(u82);
        } else {
            nf0 = C7395c.m60200a(num.intValue());
        }
        if (nf0 != null) {
            return bVar.mo53175o(nf0.mo62673b());
        }
        return null;
    }

    /* renamed from: g */
    public final Collection<if0> mo51033g(u82 u82, C7389b bVar) {
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(bVar, "builtIns");
        if0 f = m56622f(this, u82, bVar, (Integer) null, 4, (Object) null);
        if (f == null) {
            return ny5.m49095e();
        }
        u82 p = c23.f37039a.mo50795p(DescriptorUtilsKt.m62448i(f));
        if (p == null) {
            return my5.m48548d(f);
        }
        if0 o = bVar.mo53175o(p);
        vx2.m53590f(o, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        return ck0.m33065m(f, o);
    }
}
