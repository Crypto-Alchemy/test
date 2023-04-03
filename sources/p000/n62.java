package p000;

import androidx.compose.p004ui.focus.FocusModifier;
import androidx.compose.p004ui.focus.FocusPropertiesKt;
import androidx.compose.p004ui.focus.FocusStateImpl;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¨\u0006\u0004"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Lr37;", "d", "c", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: n62 */
/* compiled from: FocusManager.kt */
public final class n62 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: n62$a */
    /* compiled from: FocusManager.kt */
    public /* synthetic */ class C2868a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15364a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f15364a = iArr;
        }
    }

    /* renamed from: c */
    public static final FocusModifier m22827c(FocusModifier focusModifier) {
        FocusModifier c;
        switch (C2868a.f15364a[focusModifier.mo3230x().ordinal()]) {
            case 1:
            case 2:
                return focusModifier;
            case 3:
            case 4:
                FocusModifier y = focusModifier.mo3231y();
                if (y != null && (c = m22827c(y)) != null) {
                    return c;
                }
                throw new IllegalStateException("no child".toString());
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    public static final void m22828d(FocusModifier focusModifier) {
        FocusPropertiesKt.m2377c(focusModifier);
        v04<FocusModifier> s = focusModifier.mo3225s();
        int n = s.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = s.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                m22828d((FocusModifier) m[i]);
                i++;
            } while (i < n);
        }
    }
}
