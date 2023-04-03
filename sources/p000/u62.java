package p000;

import androidx.compose.p004ui.focus.FocusModifier;
import androidx.compose.p004ui.focus.FocusRequesterModifierKt;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, mo44877d2 = {"Lu62;", "Lvw3;", "Lax3;", "Lbx3;", "scope", "Lr37;", "i", "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", "q", "Lv04;", "newModifiers", "r", "u", "removedModifiers", "v", "s", "a", "Lu62;", "parent", "d", "Lv04;", "focusModifiers", "Liy4;", "getKey", "()Liy4;", "key", "t", "()Lu62;", "value", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: u62 */
/* compiled from: FocusRequesterModifier.kt */
public final class u62 implements vw3, ax3<u62> {

    /* renamed from: a */
    public u62 f18389a;

    /* renamed from: d */
    public final v04<FocusModifier> f18390d;

    public iy4<u62> getKey() {
        return FocusRequesterModifierKt.m2386a();
    }

    /* renamed from: i */
    public void mo3222i(bx3 bx3) {
        vx2.m53591g(bx3, "scope");
        u62 u62 = (u62) bx3.mo3371k(FocusRequesterModifierKt.m2386a());
        if (!vx2.m53586b(u62, this.f18389a)) {
            u62 u622 = this.f18389a;
            if (u622 != null) {
                u622.mo26663v(this.f18390d);
            }
            if (u62 != null) {
                u62.mo26659r(this.f18390d);
            }
            this.f18389a = u62;
        }
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
    public final void mo26658q(FocusModifier focusModifier) {
        vx2.m53591g(focusModifier, "focusModifier");
        this.f18390d.mo26953c(focusModifier);
        u62 u62 = this.f18389a;
        if (u62 != null) {
            u62.mo26658q(focusModifier);
        }
    }

    /* renamed from: r */
    public final void mo26659r(v04<FocusModifier> v04) {
        vx2.m53591g(v04, "newModifiers");
        v04<FocusModifier> v042 = this.f18390d;
        v042.mo26954e(v042.mo26963n(), v04);
        u62 u62 = this.f18389a;
        if (u62 != null) {
            u62.mo26659r(v04);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r7.indexOf(r5) < r7.indexOf(r6)) goto L_0x008b;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.focus.FocusModifier mo26660s() {
        /*
            r9 = this;
            v04<androidx.compose.ui.focus.FocusModifier> r0 = r9.f18390d
            int r1 = r0.mo26963n()
            r2 = 0
            if (r1 <= 0) goto L_0x008f
            r3 = 0
            java.lang.Object[] r0 = r0.mo26962m()
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            p000.vx2.m53589e(r0, r4)
        L_0x0013:
            r4 = r0[r3]
            androidx.compose.ui.focus.FocusModifier r4 = (androidx.compose.p004ui.focus.FocusModifier) r4
            if (r2 == 0) goto L_0x008a
            androidx.compose.ui.node.NodeCoordinator r5 = r2.mo3226t()
            if (r5 == 0) goto L_0x008a
            androidx.compose.ui.node.LayoutNode r5 = r5.mo3596X()
            if (r5 != 0) goto L_0x0026
            goto L_0x008a
        L_0x0026:
            androidx.compose.ui.node.NodeCoordinator r6 = r4.mo3226t()
            if (r6 == 0) goto L_0x008b
            androidx.compose.ui.node.LayoutNode r6 = r6.mo3596X()
            if (r6 != 0) goto L_0x0033
            goto L_0x008b
        L_0x0033:
            int r7 = r5.mo3483y()
            int r8 = r6.mo3483y()
            if (r7 <= r8) goto L_0x0045
            androidx.compose.ui.node.LayoutNode r5 = r5.mo3430V()
            p000.vx2.m53588d(r5)
            goto L_0x0033
        L_0x0045:
            int r7 = r6.mo3483y()
            int r8 = r5.mo3483y()
            if (r7 <= r8) goto L_0x0057
            androidx.compose.ui.node.LayoutNode r6 = r6.mo3430V()
            p000.vx2.m53588d(r6)
            goto L_0x0045
        L_0x0057:
            androidx.compose.ui.node.LayoutNode r7 = r5.mo3430V()
            androidx.compose.ui.node.LayoutNode r8 = r6.mo3430V()
            boolean r7 = p000.vx2.m53586b(r7, r8)
            if (r7 != 0) goto L_0x0074
            androidx.compose.ui.node.LayoutNode r5 = r5.mo3430V()
            p000.vx2.m53588d(r5)
            androidx.compose.ui.node.LayoutNode r6 = r6.mo3430V()
            p000.vx2.m53588d(r6)
            goto L_0x0057
        L_0x0074:
            androidx.compose.ui.node.LayoutNode r7 = r5.mo3430V()
            p000.vx2.m53588d(r7)
            java.util.List r7 = r7.mo3479w()
            int r5 = r7.indexOf(r5)
            int r6 = r7.indexOf(r6)
            if (r5 >= r6) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r2 = r4
        L_0x008b:
            int r3 = r3 + 1
            if (r3 < r1) goto L_0x0013
        L_0x008f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u62.mo26660s():androidx.compose.ui.focus.FocusModifier");
    }

    /* renamed from: t */
    public u62 getValue() {
        return this;
    }

    /* renamed from: u */
    public final void mo26662u(FocusModifier focusModifier) {
        vx2.m53591g(focusModifier, "focusModifier");
        this.f18390d.mo26968t(focusModifier);
        u62 u62 = this.f18389a;
        if (u62 != null) {
            u62.mo26662u(focusModifier);
        }
    }

    /* renamed from: v */
    public final void mo26663v(v04<FocusModifier> v04) {
        vx2.m53591g(v04, "removedModifiers");
        this.f18390d.mo26969u(v04);
        u62 u62 = this.f18389a;
        if (u62 != null) {
            u62.mo26663v(v04);
        }
    }
}
