package p000;

import androidx.compose.p004ui.focus.FocusEventModifierKt;
import androidx.compose.p004ui.focus.FocusModifier;
import androidx.compose.p004ui.focus.FocusStateImpl;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, mo44877d2 = {"Lk62;", "Lax3;", "Lvw3;", "Lbx3;", "scope", "Lr37;", "i", "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", "q", "u", "t", "Lv04;", "modifiers", "r", "v", "Lkotlin/Function1;", "", "a", "Lrc2;", "getOnFocusEvent", "()Lrc2;", "onFocusEvent", "d", "Lk62;", "parent", "e", "Lv04;", "children", "g", "focusModifiers", "Liy4;", "getKey", "()Liy4;", "key", "s", "()Lk62;", "value", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: k62 */
/* compiled from: FocusEventModifier.kt */
public final class k62 implements ax3<k62>, vw3 {

    /* renamed from: a */
    public final rc2<Object, r37> f13980a;

    /* renamed from: d */
    public k62 f13981d;

    /* renamed from: e */
    public final v04<k62> f13982e;

    /* renamed from: g */
    public final v04<FocusModifier> f13983g;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: k62$a */
    /* compiled from: FocusEventModifier.kt */
    public /* synthetic */ class C2644a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13984a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f13984a = iArr;
        }
    }

    public iy4<k62> getKey() {
        return FocusEventModifierKt.m2304a();
    }

    /* renamed from: i */
    public void mo3222i(bx3 bx3) {
        vx2.m53591g(bx3, "scope");
        k62 k62 = (k62) bx3.mo3371k(FocusEventModifierKt.m2304a());
        if (!vx2.m53586b(k62, this.f13981d)) {
            k62 k622 = this.f13981d;
            if (k622 != null) {
                k622.f13982e.mo26968t(this);
                k622.mo22195v(this.f13983g);
            }
            this.f13981d = k62;
            if (k62 != null) {
                k62.f13982e.mo26953c(this);
                k62.mo22191r(this.f13983g);
            }
        }
        this.f13981d = (k62) bx3.mo3371k(FocusEventModifierKt.m2304a());
    }

    /* renamed from: k */
    public /* synthetic */ sw3 mo3193k(sw3 sw3) {
        return rw3.m26445a(this, sw3);
    }

    /* renamed from: l */
    public /* synthetic */ boolean mo3194l(rc2 rc2) {
        return tw3.m27950a(this, rc2);
    }

    /* renamed from: n */
    public /* synthetic */ Object mo3195n(Object obj, fd2 fd2) {
        return tw3.m27951b(this, obj, fd2);
    }

    /* renamed from: q */
    public final void mo22190q(FocusModifier focusModifier) {
        vx2.m53591g(focusModifier, "focusModifier");
        this.f13983g.mo26953c(focusModifier);
        k62 k62 = this.f13981d;
        if (k62 != null) {
            k62.mo22190q(focusModifier);
        }
    }

    /* renamed from: r */
    public final void mo22191r(v04<FocusModifier> v04) {
        v04<FocusModifier> v042 = this.f13983g;
        v042.mo26954e(v042.mo26963n(), v04);
        k62 k62 = this.f13981d;
        if (k62 != null) {
            k62.mo22191r(v04);
        }
    }

    /* renamed from: s */
    public k62 getValue() {
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r3 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r3 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r4 = r5;
        r3 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22193t() {
        /*
            r8 = this;
            v04<androidx.compose.ui.focus.FocusModifier> r0 = r8.f13983g
            int r0 = r0.mo26963n()
            if (r0 == 0) goto L_0x006b
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x005c
            v04<androidx.compose.ui.focus.FocusModifier> r0 = r8.f13983g
            int r2 = r0.mo26963n()
            r3 = 0
            if (r2 <= 0) goto L_0x0045
            java.lang.Object[] r0 = r0.mo26962m()
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            p000.vx2.m53589e(r0, r4)
            r4 = r3
        L_0x001f:
            r5 = r0[r1]
            androidx.compose.ui.focus.FocusModifier r5 = (androidx.compose.p004ui.focus.FocusModifier) r5
            androidx.compose.ui.focus.FocusStateImpl r6 = r5.mo3230x()
            int[] r7 = p000.k62.C2644a.f13984a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            switch(r6) {
                case 1: goto L_0x003b;
                case 2: goto L_0x003b;
                case 3: goto L_0x003b;
                case 4: goto L_0x003b;
                case 5: goto L_0x0036;
                case 6: goto L_0x0033;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x003e
        L_0x0033:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L_0x003e
        L_0x0036:
            if (r3 != 0) goto L_0x003e
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L_0x003e
        L_0x003b:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = r5
        L_0x003e:
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x001f
            r0 = r3
            r3 = r4
            goto L_0x0046
        L_0x0045:
            r0 = r3
        L_0x0046:
            if (r3 == 0) goto L_0x004e
            androidx.compose.ui.focus.FocusStateImpl r1 = r3.mo3230x()
            if (r1 != 0) goto L_0x006d
        L_0x004e:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.vx2.m53586b(r0, r1)
            if (r0 == 0) goto L_0x0059
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Deactivated
            goto L_0x006d
        L_0x0059:
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Inactive
            goto L_0x006d
        L_0x005c:
            v04<androidx.compose.ui.focus.FocusModifier> r0 = r8.f13983g
            java.lang.Object[] r0 = r0.mo26962m()
            r0 = r0[r1]
            androidx.compose.ui.focus.FocusModifier r0 = (androidx.compose.p004ui.focus.FocusModifier) r0
            androidx.compose.ui.focus.FocusStateImpl r1 = r0.mo3230x()
            goto L_0x006d
        L_0x006b:
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p004ui.focus.FocusStateImpl.Inactive
        L_0x006d:
            rc2<java.lang.Object, r37> r0 = r8.f13980a
            r0.invoke(r1)
            k62 r0 = r8.f13981d
            if (r0 == 0) goto L_0x0079
            r0.mo22193t()
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k62.mo22193t():void");
    }

    /* renamed from: u */
    public final void mo22194u(FocusModifier focusModifier) {
        vx2.m53591g(focusModifier, "focusModifier");
        this.f13983g.mo26968t(focusModifier);
        k62 k62 = this.f13981d;
        if (k62 != null) {
            k62.mo22194u(focusModifier);
        }
    }

    /* renamed from: v */
    public final void mo22195v(v04<FocusModifier> v04) {
        this.f13983g.mo26969u(v04);
        k62 k62 = this.f13981d;
        if (k62 != null) {
            k62.mo22195v(v04);
        }
    }
}
