package androidx.compose.p004ui.focus;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p000.j62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001a5\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a \u0010\t\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a=\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\f\u001a \u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a \u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a\f\u0010\u0010\u001a\u00020\u0004*\u00020\u0000H\u0002\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Lj62;", "direction", "Lkotlin/Function1;", "", "onFound", "f", "(Landroidx/compose/ui/focus/FocusModifier;ILrc2;)Z", "c", "b", "focusedItem", "d", "(Landroidx/compose/ui/focus/FocusModifier;Landroidx/compose/ui/focus/FocusModifier;ILrc2;)Z", "i", "h", "g", "e", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.focus.OneDimensionalFocusSearchKt */
/* compiled from: OneDimensionalFocusSearch.kt */
public final class OneDimensionalFocusSearchKt {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$a */
    /* compiled from: OneDimensionalFocusSearch.kt */
    public /* synthetic */ class C0362a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1661a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f1661a = iArr;
        }
    }

    /* renamed from: b */
    public static final boolean m2400b(FocusModifier focusModifier, rc2<? super FocusModifier, Boolean> rc2) {
        FocusStateImpl x = focusModifier.mo3230x();
        int[] iArr = C0362a.f1661a;
        switch (iArr[x.ordinal()]) {
            case 1:
            case 2:
                FocusModifier y = focusModifier.mo3231y();
                if (y != null) {
                    switch (iArr[y.mo3230x().ordinal()]) {
                        case 1:
                            if (!m2400b(y, rc2) && !rc2.invoke(y).booleanValue()) {
                                return false;
                            }
                        case 2:
                            if (!m2400b(y, rc2) && !m2402d(focusModifier, y, j62.f13517b.mo21746f(), rc2)) {
                                return false;
                            }
                        case 3:
                        case 4:
                            return m2402d(focusModifier, y, j62.f13517b.mo21746f(), rc2);
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
            case 5:
                return m2405g(focusModifier, rc2);
            case 6:
                if (!m2405g(focusModifier, rc2) && !rc2.invoke(focusModifier).booleanValue()) {
                    return false;
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m2401c(FocusModifier focusModifier, rc2<? super FocusModifier, Boolean> rc2) {
        switch (C0362a.f1661a[focusModifier.mo3230x().ordinal()]) {
            case 1:
            case 2:
                FocusModifier y = focusModifier.mo3231y();
                if (y == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                } else if (m2401c(y, rc2) || m2402d(focusModifier, y, j62.f13517b.mo21745e(), rc2)) {
                    return true;
                } else {
                    return false;
                }
            case 3:
            case 4:
            case 5:
                return m2406h(focusModifier, rc2);
            case 6:
                return rc2.invoke(focusModifier).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    public static final boolean m2402d(FocusModifier focusModifier, FocusModifier focusModifier2, int i, rc2<? super FocusModifier, Boolean> rc2) {
        if (m2407i(focusModifier, focusModifier2, i, rc2)) {
            return true;
        }
        Boolean bool = (Boolean) a10.m7a(focusModifier, i, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(focusModifier, focusModifier2, i, rc2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m2403e(FocusModifier focusModifier) {
        if (focusModifier.mo3212B() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m2404f(FocusModifier focusModifier, int i, rc2<? super FocusModifier, Boolean> rc2) {
        vx2.m53591g(focusModifier, "$this$oneDimensionalFocusSearch");
        vx2.m53591g(rc2, "onFound");
        j62.C2583a aVar = j62.f13517b;
        if (j62.m19989l(i, aVar.mo21745e())) {
            return m2401c(focusModifier, rc2);
        }
        if (j62.m19989l(i, aVar.mo21746f())) {
            return m2400b(focusModifier, rc2);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }

    /* renamed from: g */
    public static final boolean m2405g(FocusModifier focusModifier, rc2<? super FocusModifier, Boolean> rc2) {
        focusModifier.mo3225s().mo26951E(x62.f19327a);
        v04<FocusModifier> s = focusModifier.mo3225s();
        int n = s.mo26963n();
        if (n <= 0) {
            return false;
        }
        int i = n - 1;
        Object[] m = s.mo26962m();
        vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        do {
            FocusModifier focusModifier2 = (FocusModifier) m[i];
            if (w62.m29292g(focusModifier2) && m2400b(focusModifier2, rc2)) {
                return true;
            }
            i--;
        } while (i >= 0);
        return false;
    }

    /* renamed from: h */
    public static final boolean m2406h(FocusModifier focusModifier, rc2<? super FocusModifier, Boolean> rc2) {
        boolean z;
        focusModifier.mo3225s().mo26951E(x62.f19327a);
        v04<FocusModifier> s = focusModifier.mo3225s();
        int n = s.mo26963n();
        if (n > 0) {
            Object[] m = s.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i = 0;
            do {
                FocusModifier focusModifier2 = (FocusModifier) m[i];
                if (!w62.m29292g(focusModifier2) || !m2401c(focusModifier2, rc2)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
                i++;
            } while (i < n);
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m2407i(FocusModifier focusModifier, FocusModifier focusModifier2, int i, rc2<? super FocusModifier, Boolean> rc2) {
        boolean z;
        if (focusModifier.mo3230x() == FocusStateImpl.ActiveParent || focusModifier.mo3230x() == FocusStateImpl.DeactivatedParent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            focusModifier.mo3225s().mo26951E(x62.f19327a);
            j62.C2583a aVar = j62.f13517b;
            if (j62.m19989l(i, aVar.mo21745e())) {
                v04<FocusModifier> s = focusModifier.mo3225s();
                rw2 rw2 = new rw2(0, s.mo26963n() - 1);
                int n = rw2.mo46910n();
                int q = rw2.mo46911q();
                if (n <= q) {
                    boolean z2 = false;
                    while (true) {
                        if (z2) {
                            FocusModifier focusModifier3 = (FocusModifier) s.mo26962m()[n];
                            if (w62.m29292g(focusModifier3) && m2401c(focusModifier3, rc2)) {
                                return true;
                            }
                        }
                        if (vx2.m53586b(s.mo26962m()[n], focusModifier2)) {
                            z2 = true;
                        }
                        if (n == q) {
                            break;
                        }
                        n++;
                    }
                }
            } else if (j62.m19989l(i, aVar.mo21746f())) {
                v04<FocusModifier> s2 = focusModifier.mo3225s();
                rw2 rw22 = new rw2(0, s2.mo26963n() - 1);
                int n2 = rw22.mo46910n();
                int q2 = rw22.mo46911q();
                if (n2 <= q2) {
                    boolean z3 = false;
                    while (true) {
                        if (z3) {
                            FocusModifier focusModifier4 = (FocusModifier) s2.mo26962m()[q2];
                            if (w62.m29292g(focusModifier4) && m2400b(focusModifier4, rc2)) {
                                return true;
                            }
                        }
                        if (vx2.m53586b(s2.mo26962m()[q2], focusModifier2)) {
                            z3 = true;
                        }
                        if (q2 == n2) {
                            break;
                        }
                        q2--;
                    }
                }
            } else {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            if (j62.m19989l(i, j62.f13517b.mo21745e()) || focusModifier.mo3230x() == FocusStateImpl.DeactivatedParent || m2403e(focusModifier)) {
                return false;
            }
            return rc2.invoke(focusModifier).booleanValue();
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
