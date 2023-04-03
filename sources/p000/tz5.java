package p000;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p000.fj4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000\u001a \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u001a4\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\f\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0002\u001a=\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a4\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, mo44877d2 = {"Lfj4;", "outline", "", "x", "y", "Ltm4;", "tmpTouchPointPath", "tmpOpPath", "", "b", "La95;", "rect", "d", "Lfj4$c;", "touchPointPath", "opPath", "e", "Lyh5;", "a", "Lbu0;", "cornerRadius", "centerX", "centerY", "f", "(FFJFF)Z", "path", "c", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: tz5 */
/* compiled from: ShapeContainingUtil.kt */
public final class tz5 {
    /* renamed from: a */
    public static final boolean m28008a(yh5 yh5) {
        if (bu0.m11576d(yh5.mo28073h()) + bu0.m11576d(yh5.mo28075i()) > yh5.mo28076j() || bu0.m11576d(yh5.mo28066b()) + bu0.m11576d(yh5.mo28067c()) > yh5.mo28076j() || bu0.m11577e(yh5.mo28073h()) + bu0.m11577e(yh5.mo28066b()) > yh5.mo28068d() || bu0.m11577e(yh5.mo28075i()) + bu0.m11577e(yh5.mo28067c()) > yh5.mo28068d()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m28009b(fj4 fj4, float f, float f2, tm4 tm4, tm4 tm42) {
        vx2.m53591g(fj4, "outline");
        if (fj4 instanceof fj4.C2295b) {
            return m28011d(((fj4.C2295b) fj4).mo19925a(), f, f2);
        }
        if (fj4 instanceof fj4.C2296c) {
            return m28012e((fj4.C2296c) fj4, f, f2, tm4, tm42);
        }
        if (fj4 instanceof fj4.C2294a) {
            return m28010c(((fj4.C2294a) fj4).mo19922a(), f, f2, tm4, tm42);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public static final boolean m28010c(tm4 tm4, float f, float f2, tm4 tm42, tm4 tm43) {
        a95 a95 = new a95(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (tm42 == null) {
            tm42 = C1636bj.m11414a();
        }
        tm42.mo314c(a95);
        if (tm43 == null) {
            tm43 = C1636bj.m11414a();
        }
        tm43.mo315d(tm4, tm42, wm4.f19177a.mo27557b());
        boolean isEmpty = tm43.isEmpty();
        tm43.reset();
        tm42.reset();
        return !isEmpty;
    }

    /* renamed from: d */
    public static final boolean m28011d(a95 a95, float f, float f2) {
        if (a95.mo118f() > f || f >= a95.mo119g() || a95.mo122i() > f2 || f2 >= a95.mo114c()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m28012e(fj4.C2296c cVar, float f, float f2, tm4 tm4, tm4 tm42) {
        tm4 tm43;
        float f3 = f;
        float f4 = f2;
        tm4 tm44 = tm42;
        yh5 a = cVar.mo19928a();
        if (f3 < a.mo28069e() || f3 >= a.mo28071f() || f4 < a.mo28072g() || f4 >= a.mo28065a()) {
            return false;
        }
        if (!m28008a(a)) {
            if (tm44 == null) {
                tm43 = C1636bj.m11414a();
            } else {
                tm43 = tm44;
            }
            tm43.mo313b(a);
            return m28010c(tm43, f, f2, tm4, tm44);
        }
        float d = bu0.m11576d(a.mo28073h()) + a.mo28069e();
        float e = bu0.m11577e(a.mo28073h()) + a.mo28072g();
        float f5 = a.mo28071f() - bu0.m11576d(a.mo28075i());
        float e2 = bu0.m11577e(a.mo28075i()) + a.mo28072g();
        float f6 = a.mo28071f() - bu0.m11576d(a.mo28067c());
        float a2 = a.mo28065a() - bu0.m11577e(a.mo28067c());
        float a3 = a.mo28065a() - bu0.m11577e(a.mo28066b());
        float d2 = bu0.m11576d(a.mo28066b()) + a.mo28069e();
        if (f3 < d && f4 < e) {
            return m28013f(f, f2, a.mo28073h(), d, e);
        } else if (f3 < d2 && f4 > a3) {
            return m28013f(f, f2, a.mo28066b(), d2, a3);
        } else if (f3 > f5 && f4 < e2) {
            return m28013f(f, f2, a.mo28075i(), f5, e2);
        } else if (f3 <= f6 || f4 <= a2) {
            return true;
        } else {
            return m28013f(f, f2, a.mo28067c(), f6, a2);
        }
    }

    /* renamed from: f */
    public static final boolean m28013f(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float d = bu0.m11576d(j);
        float e = bu0.m11577e(j);
        if (((f5 * f5) / (d * d)) + ((f6 * f6) / (e * e)) <= 1.0f) {
            return true;
        }
        return false;
    }
}
