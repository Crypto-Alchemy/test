package p000;

import androidx.compose.p004ui.focus.FocusModifier;
import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p000.j62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Lj62;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/FocusRequester;", "a", "(Landroidx/compose/ui/focus/FocusModifier;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: q62 */
/* compiled from: FocusOrderModifier.kt */
public final class q62 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: q62$a */
    /* compiled from: FocusOrderModifier.kt */
    public /* synthetic */ class C3130a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16819a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f16819a = iArr;
        }
    }

    /* renamed from: a */
    public static final FocusRequester m25455a(FocusModifier focusModifier, int i, LayoutDirection layoutDirection) {
        FocusRequester focusRequester;
        FocusRequester focusRequester2;
        vx2.m53591g(focusModifier, "$this$customFocusSearch");
        vx2.m53591g(layoutDirection, "layoutDirection");
        j62.C2583a aVar = j62.f13517b;
        if (j62.m19989l(i, aVar.mo21745e())) {
            return focusModifier.mo3228v().mo3239b();
        }
        if (j62.m19989l(i, aVar.mo21746f())) {
            return focusModifier.mo3228v().mo3255r();
        }
        if (j62.m19989l(i, aVar.mo21748h())) {
            return focusModifier.mo3228v().mo3240c();
        }
        if (j62.m19989l(i, aVar.mo21741a())) {
            return focusModifier.mo3228v().mo3246i();
        }
        if (j62.m19989l(i, aVar.mo21744d())) {
            int i2 = C3130a.f16819a[layoutDirection.ordinal()];
            if (i2 == 1) {
                focusRequester2 = focusModifier.mo3228v().mo3242e();
            } else if (i2 == 2) {
                focusRequester2 = focusModifier.mo3228v().mo3244g();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (vx2.m53586b(focusRequester2, FocusRequester.f1652b.mo3268b())) {
                focusRequester2 = null;
            }
            if (focusRequester2 == null) {
                return focusModifier.mo3228v().mo3238a();
            }
        } else if (j62.m19989l(i, aVar.mo21747g())) {
            int i3 = C3130a.f16819a[layoutDirection.ordinal()];
            if (i3 == 1) {
                focusRequester = focusModifier.mo3228v().mo3244g();
            } else if (i3 == 2) {
                focusRequester = focusModifier.mo3228v().mo3242e();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (vx2.m53586b(focusRequester, FocusRequester.f1652b.mo3268b())) {
                focusRequester = null;
            }
            if (focusRequester2 == null) {
                return focusModifier.mo3228v().mo3241d();
            }
        } else if (j62.m19989l(i, aVar.mo21742b())) {
            return focusModifier.mo3228v().mo3248k().invoke(j62.m19986i(i));
        } else {
            if (j62.m19989l(i, aVar.mo21743c())) {
                return focusModifier.mo3228v().mo3243f().invoke(j62.m19986i(i));
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return focusRequester2;
    }
}
