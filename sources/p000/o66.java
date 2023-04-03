package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;

/* renamed from: o66 */
/* compiled from: SpecialTypes.kt */
public final class o66 {
    /* renamed from: a */
    public static final C7864m5 m70161a(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        w47 K0 = xc3.mo64506K0();
        if (K0 instanceof C7864m5) {
            return (C7864m5) K0;
        }
        return null;
    }

    /* renamed from: b */
    public static final d36 m70162b(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        C7864m5 a = m70161a(xc3);
        if (a != null) {
            return a.mo56126T0();
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m70163c(xc3 xc3) {
        vx2.m53591g(xc3, "<this>");
        return xc3.mo64506K0() instanceof eb1;
    }

    /* renamed from: d */
    public static final w47 m70164d(w47 w47, boolean z) {
        vx2.m53591g(w47, "<this>");
        eb1 b = eb1.f37495g.mo51437b(w47, z);
        if (b != null) {
            return b;
        }
        d36 g = m70167g(w47);
        if (g != null) {
            return g;
        }
        return w47.mo51137L0(false);
    }

    /* renamed from: e */
    public static final IntersectionTypeConstructor m70165e(IntersectionTypeConstructor intersectionTypeConstructor) {
        xc3 xc3;
        Collection<xc3> g = intersectionTypeConstructor.mo51811g();
        ArrayList arrayList = new ArrayList(dk0.m43495u(g, 10));
        Iterator<T> it = g.iterator();
        boolean z = false;
        while (true) {
            xc3 = null;
            if (!it.hasNext()) {
                break;
            }
            xc3 next = it.next();
            if (x17.m73828l(next)) {
                next = m70166f(next.mo64506K0(), false, 1, (Object) null);
                z = true;
            }
            arrayList.add(next);
        }
        if (!z) {
            return null;
        }
        xc3 i = intersectionTypeConstructor.mo55299i();
        if (i != null) {
            if (x17.m73828l(i)) {
                i = m70166f(i.mo64506K0(), false, 1, (Object) null);
            }
            xc3 = i;
        }
        return new IntersectionTypeConstructor(arrayList).mo55302n(xc3);
    }

    /* renamed from: f */
    public static /* synthetic */ w47 m70166f(w47 w47, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m70164d(w47, z);
    }

    /* renamed from: g */
    public static final d36 m70167g(xc3 xc3) {
        IntersectionTypeConstructor intersectionTypeConstructor;
        IntersectionTypeConstructor e;
        yz6 H0 = xc3.mo51134H0();
        if (H0 instanceof IntersectionTypeConstructor) {
            intersectionTypeConstructor = (IntersectionTypeConstructor) H0;
        } else {
            intersectionTypeConstructor = null;
        }
        if (intersectionTypeConstructor == null || (e = m70165e(intersectionTypeConstructor)) == null) {
            return null;
        }
        return e.mo55297h();
    }

    /* renamed from: h */
    public static final d36 m70168h(d36 d36, boolean z) {
        vx2.m53591g(d36, "<this>");
        eb1 b = eb1.f37495g.mo51437b(d36, z);
        if (b != null) {
            return b;
        }
        d36 g = m70167g(d36);
        if (g == null) {
            return d36.mo51121O0(false);
        }
        return g;
    }

    /* renamed from: i */
    public static /* synthetic */ d36 m70169i(d36 d36, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m70168h(d36, z);
    }

    /* renamed from: j */
    public static final d36 m70170j(d36 d36, d36 d362) {
        vx2.m53591g(d36, "<this>");
        vx2.m53591g(d362, "abbreviatedType");
        if (zc3.m74855a(d36)) {
            return d36;
        }
        return new C7864m5(d36, d362);
    }

    /* renamed from: k */
    public static final d64 m70171k(d64 d64) {
        vx2.m53591g(d64, "<this>");
        return new d64(d64.mo51140Q0(), d64.mo51134H0(), d64.mo51142S0(), d64.mo51133G0(), d64.mo51135I0(), true);
    }
}
