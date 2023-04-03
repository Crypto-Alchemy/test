package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0016\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u0014\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0002\u001a\f\u0010\u000b\u001a\u00020\u0005*\u00020\u0000H\u0002\u001a\u0014\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0002\u001a\f\u0010\r\u001a\u00020\u0005*\u00020\u0000H\u0002\u001a\f\u0010\u000e\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u000f"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Lr37;", "h", "a", "e", "", "forcedClear", "c", "f", "childNode", "g", "b", "i", "j", "k", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.focus.FocusTransactionsKt */
/* compiled from: FocusTransactions.kt */
public final class FocusTransactionsKt {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusTransactionsKt$a */
    /* compiled from: FocusTransactions.kt */
    public /* synthetic */ class C0361a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1660a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 4;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f1660a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m2388a(FocusModifier focusModifier) {
        vx2.m53591g(focusModifier, "<this>");
        int i = C0361a.f1660a[focusModifier.mo3230x().ordinal()];
        if (i == 4) {
            focusModifier.mo3216F(FocusStateImpl.Inactive);
        } else if (i == 5) {
            focusModifier.mo3216F(FocusStateImpl.ActiveParent);
        }
    }

    /* renamed from: b */
    public static final boolean m2389b(FocusModifier focusModifier) {
        FocusModifier y = focusModifier.mo3231y();
        if (y == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (!m2391d(y, false, 1, (Object) null)) {
            return false;
        } else {
            focusModifier.mo3217G((FocusModifier) null);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m2390c(androidx.compose.p004ui.focus.FocusModifier r3, boolean r4) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r3, r0)
            androidx.compose.ui.focus.FocusStateImpl r0 = r3.mo3230x()
            int[] r1 = androidx.compose.p004ui.focus.FocusTransactionsKt.C0361a.f1660a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L_0x003e;
                case 2: goto L_0x0036;
                case 3: goto L_0x0028;
                case 4: goto L_0x0043;
                case 5: goto L_0x001c;
                case 6: goto L_0x0043;
                default: goto L_0x0016;
            }
        L_0x0016:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L_0x001c:
            boolean r4 = m2389b(r3)
            if (r4 == 0) goto L_0x0034
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.p004ui.focus.FocusStateImpl.Deactivated
            r3.mo3216F(r4)
            goto L_0x0043
        L_0x0028:
            boolean r4 = m2389b(r3)
            if (r4 == 0) goto L_0x0034
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.p004ui.focus.FocusStateImpl.Inactive
            r3.mo3216F(r4)
            goto L_0x0043
        L_0x0034:
            r4 = r1
            goto L_0x0044
        L_0x0036:
            if (r4 == 0) goto L_0x0044
            androidx.compose.ui.focus.FocusStateImpl r0 = androidx.compose.p004ui.focus.FocusStateImpl.Inactive
            r3.mo3216F(r0)
            goto L_0x0044
        L_0x003e:
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.p004ui.focus.FocusStateImpl.Inactive
            r3.mo3216F(r4)
        L_0x0043:
            r4 = r2
        L_0x0044:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.focus.FocusTransactionsKt.m2390c(androidx.compose.ui.focus.FocusModifier, boolean):boolean");
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m2391d(FocusModifier focusModifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m2390c(focusModifier, z);
    }

    /* renamed from: e */
    public static final void m2392e(FocusModifier focusModifier) {
        LayoutNode X;
        nj4 U;
        m62 focusManager;
        vx2.m53591g(focusModifier, "<this>");
        int i = C0361a.f1660a[focusModifier.mo3230x().ordinal()];
        if (i == 1 || i == 2) {
            NodeCoordinator t = focusModifier.mo3226t();
            if (!(t == null || (X = t.mo3596X()) == null || (U = X.mo3428U()) == null || (focusManager = U.getFocusManager()) == null)) {
                focusManager.mo3201b(true);
            }
            focusModifier.mo3216F(FocusStateImpl.Deactivated);
        } else if (i == 3) {
            focusModifier.mo3216F(FocusStateImpl.DeactivatedParent);
        } else if (i == 6) {
            focusModifier.mo3216F(FocusStateImpl.Deactivated);
        }
    }

    /* renamed from: f */
    public static final void m2393f(FocusModifier focusModifier) {
        FocusStateImpl focusStateImpl;
        switch (C0361a.f1660a[focusModifier.mo3230x().ordinal()]) {
            case 1:
            case 3:
            case 6:
                focusStateImpl = FocusStateImpl.Active;
                break;
            case 2:
                focusStateImpl = FocusStateImpl.Captured;
                break;
            case 4:
            case 5:
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        focusModifier.mo3216F(focusStateImpl);
    }

    /* renamed from: g */
    public static final boolean m2394g(FocusModifier focusModifier, FocusModifier focusModifier2) {
        focusModifier.mo3217G(focusModifier2);
        m2393f(focusModifier2);
        return true;
    }

    /* renamed from: h */
    public static final void m2395h(FocusModifier focusModifier) {
        nj4 nj4;
        LayoutNode X;
        vx2.m53591g(focusModifier, "<this>");
        NodeCoordinator t = focusModifier.mo3226t();
        if (t == null || (X = t.mo3596X()) == null) {
            nj4 = null;
        } else {
            nj4 = X.mo3428U();
        }
        if (nj4 == null) {
            focusModifier.mo3215E(true);
            return;
        }
        switch (C0361a.f1660a[focusModifier.mo3230x().ordinal()]) {
            case 1:
            case 2:
                m2398k(focusModifier);
                return;
            case 3:
                if (m2389b(focusModifier)) {
                    m2393f(focusModifier);
                    return;
                }
                return;
            case 4:
            case 5:
                TwoDimensionalFocusSearchKt.m2417j(focusModifier, j62.f13517b.mo21742b(), FocusTransactionsKt$requestFocus$1.INSTANCE);
                return;
            case 6:
                FocusModifier B = focusModifier.mo3212B();
                if (B != null) {
                    m2396i(B, focusModifier);
                    return;
                } else if (m2397j(focusModifier)) {
                    m2393f(focusModifier);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: i */
    public static final boolean m2396i(FocusModifier focusModifier, FocusModifier focusModifier2) {
        if (focusModifier.mo3225s().mo26959j(focusModifier2)) {
            switch (C0361a.f1660a[focusModifier.mo3230x().ordinal()]) {
                case 1:
                    focusModifier.mo3216F(FocusStateImpl.ActiveParent);
                    return m2394g(focusModifier, focusModifier2);
                case 2:
                    return false;
                case 3:
                    if (m2389b(focusModifier)) {
                        return m2394g(focusModifier, focusModifier2);
                    }
                    return false;
                case 4:
                    m2388a(focusModifier);
                    boolean i = m2396i(focusModifier, focusModifier2);
                    m2392e(focusModifier);
                    return i;
                case 5:
                    if (focusModifier.mo3231y() == null) {
                        return m2394g(focusModifier, focusModifier2);
                    }
                    if (m2389b(focusModifier)) {
                        return m2394g(focusModifier, focusModifier2);
                    }
                    return false;
                case 6:
                    FocusModifier B = focusModifier.mo3212B();
                    if (B == null && m2397j(focusModifier)) {
                        focusModifier.mo3216F(FocusStateImpl.Active);
                        return m2396i(focusModifier, focusModifier2);
                    } else if (B == null || !m2396i(B, focusModifier)) {
                        return false;
                    } else {
                        return m2396i(focusModifier, focusModifier2);
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
    }

    /* renamed from: j */
    public static final boolean m2397j(FocusModifier focusModifier) {
        LayoutNode X;
        nj4 U;
        NodeCoordinator t = focusModifier.mo3226t();
        if (t != null && (X = t.mo3596X()) != null && (U = X.mo3428U()) != null) {
            return U.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }

    /* renamed from: k */
    public static final void m2398k(FocusModifier focusModifier) {
        vx2.m53591g(focusModifier, "<this>");
        k62 u = focusModifier.mo3227u();
        if (u != null) {
            u.mo22193t();
        }
    }
}
