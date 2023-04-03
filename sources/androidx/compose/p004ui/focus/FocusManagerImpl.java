package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.focus.FocusRequester;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.j62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0002J\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, mo44877d2 = {"Landroidx/compose/ui/focus/FocusManagerImpl;", "Lm62;", "Lr37;", "i", "g", "", "force", "b", "Lj62;", "focusDirection", "a", "(I)Z", "c", "Landroidx/compose/ui/focus/FocusModifier;", "d", "()Landroidx/compose/ui/focus/FocusModifier;", "j", "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", "Lsw3;", "Lsw3;", "f", "()Lsw3;", "modifier", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/LayoutDirection;", "e", "()Landroidx/compose/ui/unit/LayoutDirection;", "h", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "<init>", "(Landroidx/compose/ui/focus/FocusModifier;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.focus.FocusManagerImpl */
/* compiled from: FocusManager.kt */
public final class FocusManagerImpl implements m62 {

    /* renamed from: a */
    public final FocusModifier f1616a;

    /* renamed from: b */
    public final sw3 f1617b;

    /* renamed from: c */
    public LayoutDirection f1618c;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusManagerImpl$a */
    /* compiled from: FocusManager.kt */
    public /* synthetic */ class C0353a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1619a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 4;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f1619a = iArr;
        }
    }

    public FocusManagerImpl(FocusModifier focusModifier) {
        vx2.m53591g(focusModifier, "focusModifier");
        this.f1616a = focusModifier;
        this.f1617b = FocusModifierKt.m2339a(sw3.f17820m, focusModifier);
    }

    /* renamed from: a */
    public boolean mo3200a(int i) {
        FocusModifier b = w62.m29287b(this.f1616a);
        if (b == null) {
            return false;
        }
        FocusRequester a = q62.m25455a(b, i, mo3204e());
        FocusRequester.C0359a aVar = FocusRequester.f1652b;
        if (vx2.m53586b(a, aVar.mo3267a())) {
            return false;
        }
        if (!vx2.m53586b(a, aVar.mo3268b())) {
            a.mo3266e();
        } else if (!w62.m29291f(this.f1616a, i, mo3204e(), new FocusManagerImpl$moveFocus$foundNextItem$1(b)) && !mo3209j(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo3201b(boolean z) {
        FocusStateImpl focusStateImpl;
        FocusStateImpl x = this.f1616a.mo3230x();
        if (FocusTransactionsKt.m2390c(this.f1616a, z)) {
            FocusModifier focusModifier = this.f1616a;
            switch (C0353a.f1619a[x.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    focusStateImpl = FocusStateImpl.Active;
                    break;
                case 4:
                case 5:
                    focusStateImpl = FocusStateImpl.Deactivated;
                    break;
                case 6:
                    focusStateImpl = FocusStateImpl.Inactive;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            focusModifier.mo3216F(focusStateImpl);
        }
    }

    /* renamed from: c */
    public final void mo3202c() {
        n62.m22828d(this.f1616a);
    }

    /* renamed from: d */
    public final FocusModifier mo3203d() {
        return n62.m22827c(this.f1616a);
    }

    /* renamed from: e */
    public final LayoutDirection mo3204e() {
        LayoutDirection layoutDirection = this.f1618c;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        vx2.m53605u("layoutDirection");
        return null;
    }

    /* renamed from: f */
    public final sw3 mo3205f() {
        return this.f1617b;
    }

    /* renamed from: g */
    public final void mo3206g() {
        FocusTransactionsKt.m2390c(this.f1616a, true);
    }

    /* renamed from: h */
    public final void mo3207h(LayoutDirection layoutDirection) {
        vx2.m53591g(layoutDirection, "<set-?>");
        this.f1618c = layoutDirection;
    }

    /* renamed from: i */
    public final void mo3208i() {
        if (this.f1616a.mo3230x() == FocusStateImpl.Inactive) {
            this.f1616a.mo3216F(FocusStateImpl.Active);
        }
    }

    /* renamed from: j */
    public final boolean mo3209j(int i) {
        boolean z;
        if (this.f1616a.mo3230x().getHasFocus() && !this.f1616a.mo3230x().isFocused()) {
            j62.C2583a aVar = j62.f13517b;
            if (j62.m19989l(i, aVar.mo21745e())) {
                z = true;
            } else {
                z = j62.m19989l(i, aVar.mo21746f());
            }
            if (z) {
                mo3201b(false);
                if (!this.f1616a.mo3230x().isFocused()) {
                    return false;
                }
                return mo3200a(i);
            }
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FocusManagerImpl(FocusModifier focusModifier, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new FocusModifier(FocusStateImpl.Inactive, (rc2) null, 2, (DefaultConstructorMarker) null) : focusModifier);
    }
}
