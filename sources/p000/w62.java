package p000;

import androidx.compose.p004ui.focus.FocusModifier;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.focus.FocusStateImpl;
import androidx.compose.p004ui.focus.OneDimensionalFocusSearchKt;
import androidx.compose.p004ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p000.j62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a=\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000e\u0010\n\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a\f\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000\u001a\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\u0000H\u0000\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0000H\u0000\u001a\u001a\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002\"\u0018\u0010\u0017\u001a\u00020\u0006*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Lj62;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lkotlin/Function1;", "", "onFound", "f", "(Landroidx/compose/ui/focus/FocusModifier;ILandroidx/compose/ui/unit/LayoutDirection;Lrc2;)Z", "b", "c", "La95;", "e", "Lv04;", "a", "Lqa3;", "d", "one", "two", "h", "g", "(Landroidx/compose/ui/focus/FocusModifier;)Z", "isEligibleForFocusSearch", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: w62 */
/* compiled from: FocusTraversal.kt */
public final class w62 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: w62$a */
    /* compiled from: FocusTraversal.kt */
    public /* synthetic */ class C3521a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19019a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f19020b;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
            iArr[LayoutDirection.Ltr.ordinal()] = 2;
            f19019a = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
            iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr2[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr2[FocusStateImpl.Inactive.ordinal()] = 5;
            iArr2[FocusStateImpl.Deactivated.ordinal()] = 6;
            f19020b = iArr2;
        }
    }

    /* renamed from: a */
    public static final v04<FocusModifier> m29286a(FocusModifier focusModifier) {
        boolean z;
        vx2.m53591g(focusModifier, "<this>");
        v04<FocusModifier> s = focusModifier.mo3225s();
        int n = s.mo26963n();
        if (n > 0) {
            Object[] m = s.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i = 0;
            while (true) {
                if (!((FocusModifier) m[i]).mo3230x().isDeactivated()) {
                    i++;
                    if (i >= n) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (!z) {
            return focusModifier.mo3225s();
        }
        v04<FocusModifier> v04 = new v04<>(new FocusModifier[16], 0);
        v04<FocusModifier> s2 = focusModifier.mo3225s();
        int n2 = s2.mo26963n();
        if (n2 > 0) {
            Object[] m2 = s2.mo26962m();
            vx2.m53589e(m2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                FocusModifier focusModifier2 = (FocusModifier) m2[i2];
                if (!focusModifier2.mo3230x().isDeactivated()) {
                    v04.mo26953c(focusModifier2);
                } else {
                    FocusRequester invoke = focusModifier2.mo3228v().mo3248k().invoke(j62.m19986i(j62.f13517b.mo21742b()));
                    FocusRequester.C0359a aVar = FocusRequester.f1652b;
                    if (vx2.m53586b(invoke, aVar.mo3267a())) {
                        return new v04<>(new FocusModifier[16], 0);
                    }
                    if (vx2.m53586b(invoke, aVar.mo3268b())) {
                        v04.mo26954e(v04.mo26963n(), m29286a(focusModifier2));
                    } else {
                        v04<u62> c = invoke.mo3264c();
                        int n3 = c.mo26963n();
                        if (n3 > 0) {
                            Object[] m3 = c.mo26962m();
                            vx2.m53589e(m3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            int i3 = 0;
                            do {
                                FocusModifier s3 = ((u62) m3[i3]).mo26660s();
                                if (s3 != null) {
                                    v04.mo26953c(s3);
                                }
                                i3++;
                            } while (i3 < n3);
                        }
                    }
                }
                i2++;
            } while (i2 < n2);
        }
        return v04;
    }

    /* renamed from: b */
    public static final FocusModifier m29287b(FocusModifier focusModifier) {
        vx2.m53591g(focusModifier, "<this>");
        switch (C3521a.f19020b[focusModifier.mo3230x().ordinal()]) {
            case 1:
            case 2:
                return focusModifier;
            case 3:
            case 4:
                FocusModifier y = focusModifier.mo3231y();
                if (y != null) {
                    return m29287b(y);
                }
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    /* renamed from: c */
    public static final FocusModifier m29288c(FocusModifier focusModifier) {
        vx2.m53591g(focusModifier, "<this>");
        FocusModifier B = focusModifier.mo3212B();
        if (B == null) {
            return null;
        }
        switch (C3521a.f19020b[focusModifier.mo3230x().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return m29288c(B);
            case 3:
                return focusModifier;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    public static final qa3 m29289d(FocusModifier focusModifier) {
        LayoutNode X;
        vx2.m53591g(focusModifier, "<this>");
        NodeCoordinator t = focusModifier.mo3226t();
        qa3 qa3 = null;
        if (t == null || (X = t.mo3596X()) == null) {
            return null;
        }
        v04<qa3> z = focusModifier.mo3232z();
        int n = z.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = z.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                qa3 qa32 = (qa3) m[i];
                if (vx2.m53586b(qa32.mo25043q(), X)) {
                    qa3 = m29293h(qa32, qa3);
                }
                i++;
            } while (i < n);
        }
        if (qa3 != null) {
            return qa3;
        }
        return focusModifier.mo3211A();
    }

    /* renamed from: e */
    public static final a95 m29290e(FocusModifier focusModifier) {
        a95 o;
        vx2.m53591g(focusModifier, "<this>");
        NodeCoordinator t = focusModifier.mo3226t();
        if (t == null || (o = ne3.m23130c(t).mo3622o(t, false)) == null) {
            return a95.f70e.mo127a();
        }
        return o;
    }

    /* renamed from: f */
    public static final boolean m29291f(FocusModifier focusModifier, int i, LayoutDirection layoutDirection, rc2<? super FocusModifier, Boolean> rc2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        FocusModifier focusModifier2;
        int i2;
        vx2.m53591g(focusModifier, "$this$focusSearch");
        vx2.m53591g(layoutDirection, "layoutDirection");
        vx2.m53591g(rc2, "onFound");
        j62.C2583a aVar = j62.f13517b;
        if (j62.m19989l(i, aVar.mo21745e())) {
            z = true;
        } else {
            z = j62.m19989l(i, aVar.mo21746f());
        }
        if (z) {
            return OneDimensionalFocusSearchKt.m2404f(focusModifier, i, rc2);
        }
        if (j62.m19989l(i, aVar.mo21744d())) {
            z2 = true;
        } else {
            z2 = j62.m19989l(i, aVar.mo21747g());
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = j62.m19989l(i, aVar.mo21748h());
        }
        if (z3) {
            z4 = true;
        } else {
            z4 = j62.m19989l(i, aVar.mo21741a());
        }
        if (z4) {
            return TwoDimensionalFocusSearchKt.m2426s(focusModifier, i, rc2);
        }
        if (j62.m19989l(i, aVar.mo21742b())) {
            int i3 = C3521a.f19019a[layoutDirection.ordinal()];
            if (i3 == 1) {
                i2 = aVar.mo21744d();
            } else if (i3 == 2) {
                i2 = aVar.mo21747g();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            FocusModifier b = m29287b(focusModifier);
            if (b != null) {
                return TwoDimensionalFocusSearchKt.m2426s(b, i2, rc2);
            }
            return false;
        } else if (j62.m19989l(i, aVar.mo21743c())) {
            FocusModifier b2 = m29287b(focusModifier);
            if (b2 != null) {
                focusModifier2 = m29288c(b2);
            } else {
                focusModifier2 = null;
            }
            if (vx2.m53586b(focusModifier2, focusModifier) || focusModifier2 == null) {
                return false;
            }
            return rc2.invoke(focusModifier2).booleanValue();
        } else {
            throw new IllegalStateException("Invalid FocusDirection".toString());
        }
    }

    /* renamed from: g */
    public static final boolean m29292g(FocusModifier focusModifier) {
        boolean z;
        boolean z2;
        LayoutNode X;
        LayoutNode X2;
        vx2.m53591g(focusModifier, "<this>");
        NodeCoordinator t = focusModifier.mo3226t();
        if (t == null || (X2 = t.mo3596X()) == null || !X2.mo3440a()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            NodeCoordinator t2 = focusModifier.mo3226t();
            if (t2 == null || (X = t2.mo3596X()) == null || !X.mo3459l0()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p000.qa3 m29293h(p000.qa3 r3, p000.qa3 r4) {
        /*
            if (r4 != 0) goto L_0x0003
            return r3
        L_0x0003:
            androidx.compose.ui.node.LayoutNode r0 = r3.mo25043q()
            r1 = r4
        L_0x0008:
            boolean r2 = p000.vx2.m53586b(r1, r3)
            if (r2 != 0) goto L_0x001f
            qa3 r1 = r1.mo25044r()
            if (r1 == 0) goto L_0x001e
            androidx.compose.ui.node.LayoutNode r2 = r1.mo25043q()
            boolean r2 = p000.vx2.m53586b(r2, r0)
            if (r2 != 0) goto L_0x0008
        L_0x001e:
            return r3
        L_0x001f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w62.m29293h(qa3, qa3):qa3");
    }
}
