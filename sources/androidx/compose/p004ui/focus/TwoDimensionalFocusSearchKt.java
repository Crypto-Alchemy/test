package androidx.compose.p004ui.focus;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p000.j62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a5\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0007\u001a=\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u000b\u001a1\u0010\u0010\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0016\u001a\f\u0010\u001b\u001a\u00020\u000e*\u00020\u000eH\u0002\u001a\f\u0010\u001c\u001a\u00020\u000e*\u00020\u000eH\u0002\u001a\f\u0010\u001d\u001a\u00020\u0000*\u00020\u0000H\u0002\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Lj62;", "direction", "Lkotlin/Function1;", "", "onFound", "s", "(Landroidx/compose/ui/focus/FocusModifier;ILrc2;)Z", "j", "focusedItem", "k", "(Landroidx/compose/ui/focus/FocusModifier;Landroidx/compose/ui/focus/FocusModifier;ILrc2;)Z", "q", "Lv04;", "La95;", "focusRect", "i", "(Lv04;La95;I)Landroidx/compose/ui/focus/FocusModifier;", "proposedCandidate", "currentCandidate", "focusedRect", "l", "(La95;La95;La95;I)Z", "source", "rect1", "rect2", "c", "r", "h", "b", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt */
/* compiled from: TwoDimensionalFocusSearch.kt */
public final class TwoDimensionalFocusSearchKt {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$a */
    /* compiled from: TwoDimensionalFocusSearch.kt */
    public /* synthetic */ class C0363a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1662a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f1662a = iArr;
        }
    }

    /* renamed from: b */
    public static final FocusModifier m2409b(FocusModifier focusModifier) {
        boolean z;
        if (focusModifier.mo3230x() == FocusStateImpl.ActiveParent || focusModifier.mo3230x() == FocusStateImpl.DeactivatedParent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FocusModifier b = w62.m29287b(focusModifier);
            if (b != null) {
                return b;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public static final boolean m2410c(a95 a95, a95 a952, a95 a953, int i) {
        if (m2411d(a953, i, a95) || !m2411d(a952, i, a95)) {
            return false;
        }
        if (m2412e(a953, i, a95)) {
            j62.C2583a aVar = j62.f13517b;
            if (!j62.m19989l(i, aVar.mo21744d()) && !j62.m19989l(i, aVar.mo21747g()) && m2413f(a952, i, a95) >= m2414g(a953, i, a95)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m2411d(a95 a95, int i, a95 a952) {
        boolean z;
        boolean z2;
        j62.C2583a aVar = j62.f13517b;
        if (j62.m19989l(i, aVar.mo21744d())) {
            z = true;
        } else {
            z = j62.m19989l(i, aVar.mo21747g());
        }
        if (!z) {
            if (j62.m19989l(i, aVar.mo21748h())) {
                z2 = true;
            } else {
                z2 = j62.m19989l(i, aVar.mo21741a());
            }
            if (!z2) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else if (a95.mo119g() > a952.mo118f() && a95.mo118f() < a952.mo119g()) {
                return true;
            }
        } else if (a95.mo114c() > a952.mo122i() && a95.mo122i() < a952.mo114c()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m2412e(a95 a95, int i, a95 a952) {
        j62.C2583a aVar = j62.f13517b;
        if (j62.m19989l(i, aVar.mo21744d())) {
            if (a952.mo118f() >= a95.mo119g()) {
                return true;
            }
        } else if (j62.m19989l(i, aVar.mo21747g())) {
            if (a952.mo119g() <= a95.mo118f()) {
                return true;
            }
        } else if (j62.m19989l(i, aVar.mo21748h())) {
            if (a952.mo122i() >= a95.mo114c()) {
                return true;
            }
        } else if (!j62.m19989l(i, aVar.mo21741a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else if (a952.mo114c() <= a95.mo122i()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final float m2413f(a95 a95, int i, a95 a952) {
        float f;
        float i2;
        float c;
        float i3;
        float c2;
        j62.C2583a aVar = j62.f13517b;
        if (j62.m19989l(i, aVar.mo21744d())) {
            i3 = a952.mo118f();
            c2 = a95.mo119g();
        } else {
            if (j62.m19989l(i, aVar.mo21747g())) {
                i2 = a95.mo118f();
                c = a952.mo119g();
            } else if (j62.m19989l(i, aVar.mo21748h())) {
                i3 = a952.mo122i();
                c2 = a95.mo114c();
            } else if (j62.m19989l(i, aVar.mo21741a())) {
                i2 = a95.mo122i();
                c = a952.mo114c();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = i2 - c;
            return Math.max(Utils.FLOAT_EPSILON, f);
        }
        f = i3 - c2;
        return Math.max(Utils.FLOAT_EPSILON, f);
    }

    /* renamed from: g */
    public static final float m2414g(a95 a95, int i, a95 a952) {
        float f;
        float c;
        float c2;
        float i2;
        float i3;
        j62.C2583a aVar = j62.f13517b;
        if (j62.m19989l(i, aVar.mo21744d())) {
            i2 = a952.mo118f();
            i3 = a95.mo118f();
        } else {
            if (j62.m19989l(i, aVar.mo21747g())) {
                c = a95.mo119g();
                c2 = a952.mo119g();
            } else if (j62.m19989l(i, aVar.mo21748h())) {
                i2 = a952.mo122i();
                i3 = a95.mo122i();
            } else if (j62.m19989l(i, aVar.mo21741a())) {
                c = a95.mo114c();
                c2 = a952.mo114c();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = c - c2;
            return Math.max(1.0f, f);
        }
        f = i2 - i3;
        return Math.max(1.0f, f);
    }

    /* renamed from: h */
    public static final a95 m2415h(a95 a95) {
        return new a95(a95.mo119g(), a95.mo114c(), a95.mo119g(), a95.mo114c());
    }

    /* renamed from: i */
    public static final FocusModifier m2416i(v04<FocusModifier> v04, a95 a95, int i) {
        a95 a952;
        j62.C2583a aVar = j62.f13517b;
        if (j62.m19989l(i, aVar.mo21744d())) {
            a952 = a95.mo124k(a95.mo123j() + ((float) 1), Utils.FLOAT_EPSILON);
        } else if (j62.m19989l(i, aVar.mo21747g())) {
            a952 = a95.mo124k(-(a95.mo123j() + ((float) 1)), Utils.FLOAT_EPSILON);
        } else if (j62.m19989l(i, aVar.mo21748h())) {
            a952 = a95.mo124k(Utils.FLOAT_EPSILON, a95.mo116e() + ((float) 1));
        } else if (j62.m19989l(i, aVar.mo21741a())) {
            a952 = a95.mo124k(Utils.FLOAT_EPSILON, -(a95.mo116e() + ((float) 1)));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        }
        FocusModifier focusModifier = null;
        int n = v04.mo26963n();
        if (n > 0) {
            int i2 = 0;
            Object[] m = v04.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                FocusModifier focusModifier2 = (FocusModifier) m[i2];
                if (w62.m29292g(focusModifier2)) {
                    a95 e = w62.m29290e(focusModifier2);
                    if (m2419l(e, a952, a95, i)) {
                        focusModifier = focusModifier2;
                        a952 = e;
                    }
                }
                i2++;
            } while (i2 < n);
        }
        return focusModifier;
    }

    /* renamed from: j */
    public static final boolean m2417j(FocusModifier focusModifier, int i, rc2<? super FocusModifier, Boolean> rc2) {
        boolean z;
        a95 a95;
        Object obj;
        vx2.m53591g(focusModifier, "$this$findChildCorrespondingToFocusEnter");
        vx2.m53591g(rc2, "onFound");
        Boolean d = focusModifier.mo3228v().mo3248k().invoke(j62.m19986i(i)).mo3265d(rc2);
        if (d != null) {
            return d.booleanValue();
        }
        v04<FocusModifier> a = w62.m29286a(focusModifier);
        boolean z2 = true;
        if (a.mo26963n() <= 1) {
            if (a.mo26965q()) {
                obj = null;
            } else {
                obj = a.mo26962m()[0];
            }
            FocusModifier focusModifier2 = (FocusModifier) obj;
            if (focusModifier2 != null) {
                return rc2.invoke(focusModifier2).booleanValue();
            }
            return false;
        }
        j62.C2583a aVar = j62.f13517b;
        if (j62.m19989l(i, aVar.mo21742b())) {
            i = aVar.mo21744d();
        }
        if (j62.m19989l(i, aVar.mo21747g())) {
            z = true;
        } else {
            z = j62.m19989l(i, aVar.mo21741a());
        }
        if (z) {
            a95 = m2425r(w62.m29290e(focusModifier));
        } else {
            if (!j62.m19989l(i, aVar.mo21744d())) {
                z2 = j62.m19989l(i, aVar.mo21748h());
            }
            if (z2) {
                a95 = m2415h(w62.m29290e(focusModifier));
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        FocusModifier i2 = m2416i(a, a95, i);
        if (i2 != null) {
            return rc2.invoke(i2).booleanValue();
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m2418k(FocusModifier focusModifier, FocusModifier focusModifier2, int i, rc2<? super FocusModifier, Boolean> rc2) {
        if (m2424q(focusModifier, focusModifier2, i, rc2)) {
            return true;
        }
        Boolean bool = (Boolean) a10.m7a(focusModifier, i, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(focusModifier, focusModifier2, i, rc2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: l */
    public static final boolean m2419l(a95 a95, a95 a952, a95 a953, int i) {
        if (m2420m(a95, i, a953)) {
            if (!m2420m(a952, i, a953) || m2410c(a953, a95, a952, i)) {
                return true;
            }
            if (!m2410c(a953, a952, a95, i) && m2423p(i, a953, a95) < m2423p(i, a953, a952)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m2420m(a95 a95, int i, a95 a952) {
        j62.C2583a aVar = j62.f13517b;
        if (j62.m19989l(i, aVar.mo21744d())) {
            if ((a952.mo119g() > a95.mo119g() || a952.mo118f() >= a95.mo119g()) && a952.mo118f() > a95.mo118f()) {
                return true;
            }
        } else if (j62.m19989l(i, aVar.mo21747g())) {
            if ((a952.mo118f() < a95.mo118f() || a952.mo119g() <= a95.mo118f()) && a952.mo119g() < a95.mo119g()) {
                return true;
            }
        } else if (j62.m19989l(i, aVar.mo21748h())) {
            if ((a952.mo114c() > a95.mo114c() || a952.mo122i() >= a95.mo114c()) && a952.mo122i() > a95.mo122i()) {
                return true;
            }
        } else if (!j62.m19989l(i, aVar.mo21741a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else if ((a952.mo122i() < a95.mo122i() || a952.mo114c() <= a95.mo122i()) && a952.mo114c() < a95.mo114c()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final float m2421n(a95 a95, int i, a95 a952) {
        float f;
        float i2;
        float c;
        float i3;
        float c2;
        j62.C2583a aVar = j62.f13517b;
        if (j62.m19989l(i, aVar.mo21744d())) {
            i3 = a952.mo118f();
            c2 = a95.mo119g();
        } else {
            if (j62.m19989l(i, aVar.mo21747g())) {
                i2 = a95.mo118f();
                c = a952.mo119g();
            } else if (j62.m19989l(i, aVar.mo21748h())) {
                i3 = a952.mo122i();
                c2 = a95.mo114c();
            } else if (j62.m19989l(i, aVar.mo21741a())) {
                i2 = a95.mo122i();
                c = a952.mo114c();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = i2 - c;
            return Math.max(Utils.FLOAT_EPSILON, f);
        }
        f = i3 - c2;
        return Math.max(Utils.FLOAT_EPSILON, f);
    }

    /* renamed from: o */
    public static final float m2422o(a95 a95, int i, a95 a952) {
        boolean z;
        float f;
        float f2;
        float f3;
        float j;
        j62.C2583a aVar = j62.f13517b;
        boolean z2 = true;
        if (j62.m19989l(i, aVar.mo21744d())) {
            z = true;
        } else {
            z = j62.m19989l(i, aVar.mo21747g());
        }
        if (z) {
            f = (float) 2;
            f2 = a952.mo122i() + (a952.mo116e() / f);
            f3 = a95.mo122i();
            j = a95.mo116e();
        } else {
            if (!j62.m19989l(i, aVar.mo21748h())) {
                z2 = j62.m19989l(i, aVar.mo21741a());
            }
            if (z2) {
                f = (float) 2;
                f2 = a952.mo118f() + (a952.mo123j() / f);
                f3 = a95.mo118f();
                j = a95.mo123j();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
        }
        return f2 - (f3 + (j / f));
    }

    /* renamed from: p */
    public static final long m2423p(int i, a95 a95, a95 a952) {
        long abs = (long) Math.abs(m2421n(a952, i, a95));
        long abs2 = (long) Math.abs(m2422o(a952, i, a95));
        return (((long) 13) * abs * abs) + (abs2 * abs2);
    }

    /* renamed from: q */
    public static final boolean m2424q(FocusModifier focusModifier, FocusModifier focusModifier2, int i, rc2<? super FocusModifier, Boolean> rc2) {
        FocusModifier i2;
        v04 v04 = new v04(new FocusModifier[focusModifier.mo3225s().mo26963n()], 0);
        v04.mo26954e(v04.mo26963n(), focusModifier.mo3225s());
        while (v04.mo26966r() && (i2 = m2416i(v04, w62.m29290e(focusModifier2), i)) != null) {
            if (!i2.mo3230x().isDeactivated()) {
                return rc2.invoke(i2).booleanValue();
            }
            Boolean d = i2.mo3228v().mo3248k().invoke(j62.m19986i(i)).mo3265d(rc2);
            if (d != null) {
                return d.booleanValue();
            }
            if (m2418k(i2, focusModifier2, i, rc2)) {
                return true;
            }
            v04.mo26968t(i2);
        }
        return false;
    }

    /* renamed from: r */
    public static final a95 m2425r(a95 a95) {
        return new a95(a95.mo118f(), a95.mo122i(), a95.mo118f(), a95.mo122i());
    }

    /* renamed from: s */
    public static final boolean m2426s(FocusModifier focusModifier, int i, rc2<? super FocusModifier, Boolean> rc2) {
        vx2.m53591g(focusModifier, "$this$twoDimensionalFocusSearch");
        vx2.m53591g(rc2, "onFound");
        FocusStateImpl x = focusModifier.mo3230x();
        int[] iArr = C0363a.f1662a;
        switch (iArr[x.ordinal()]) {
            case 1:
            case 2:
                FocusModifier y = focusModifier.mo3231y();
                if (y != null) {
                    switch (iArr[y.mo3230x().ordinal()]) {
                        case 1:
                        case 2:
                            if (m2426s(y, i, rc2)) {
                                return true;
                            }
                            Boolean d = y.mo3228v().mo3243f().invoke(j62.m19986i(i)).mo3265d(rc2);
                            if (d != null) {
                                return d.booleanValue();
                            }
                            return m2418k(focusModifier, m2409b(y), i, rc2);
                        case 3:
                        case 4:
                            return m2418k(focusModifier, y, i, rc2);
                        case 5:
                        case 6:
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
            case 3:
            case 4:
                return m2417j(focusModifier, i, rc2);
            case 5:
                return false;
            case 6:
                return rc2.invoke(focusModifier).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
