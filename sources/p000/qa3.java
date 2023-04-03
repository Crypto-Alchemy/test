package p000;

import android.view.KeyEvent;
import androidx.compose.p004ui.focus.FocusModifier;
import androidx.compose.p004ui.focus.FocusModifierKt;
import androidx.compose.p004ui.input.key.KeyInputModifierKt;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeCoordinator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B6\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001b\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\bJ\u001b\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010#\u001a\u0004\u0018\u00010\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u00008\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010)\u001a\u0004\u0018\u00010$2\b\u0010\u001e\u001a\u0004\u0018\u00010$8\u0006@BX\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000*8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\"\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00062"}, mo44877d2 = {"Lqa3;", "Lvw3;", "Lax3;", "Lnh4;", "Lja3;", "keyEvent", "", "t", "(Landroid/view/KeyEvent;)Z", "Lbx3;", "scope", "Lr37;", "i", "v", "u", "Lme3;", "coordinates", "d", "Lkotlin/Function1;", "a", "Lrc2;", "getOnKeyEvent", "()Lrc2;", "onKeyEvent", "getOnPreviewKeyEvent", "onPreviewKeyEvent", "Landroidx/compose/ui/focus/FocusModifier;", "e", "Landroidx/compose/ui/focus/FocusModifier;", "focusModifier", "<set-?>", "g", "Lqa3;", "r", "()Lqa3;", "parent", "Landroidx/compose/ui/node/LayoutNode;", "k", "Landroidx/compose/ui/node/LayoutNode;", "q", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Liy4;", "getKey", "()Liy4;", "key", "s", "value", "<init>", "(Lrc2;Lrc2;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qa3 */
/* compiled from: KeyInputModifier.kt */
public final class qa3 implements vw3, ax3<qa3>, nh4 {

    /* renamed from: a */
    public final rc2<ja3, Boolean> f16889a;

    /* renamed from: d */
    public final rc2<ja3, Boolean> f16890d;

    /* renamed from: e */
    public FocusModifier f16891e;

    /* renamed from: g */
    public qa3 f16892g;

    /* renamed from: k */
    public LayoutNode f16893k;

    public qa3(rc2<? super ja3, Boolean> rc2, rc2<? super ja3, Boolean> rc22) {
        this.f16889a = rc2;
        this.f16890d = rc22;
    }

    /* renamed from: d */
    public void mo3219d(me3 me3) {
        vx2.m53591g(me3, "coordinates");
        this.f16893k = ((NodeCoordinator) me3).mo3596X();
    }

    public iy4<qa3> getKey() {
        return KeyInputModifierKt.m2458a();
    }

    /* renamed from: i */
    public void mo3222i(bx3 bx3) {
        v04<qa3> z;
        v04<qa3> z2;
        vx2.m53591g(bx3, "scope");
        FocusModifier focusModifier = this.f16891e;
        if (!(focusModifier == null || (z2 = focusModifier.mo3232z()) == null)) {
            z2.mo26968t(this);
        }
        FocusModifier focusModifier2 = (FocusModifier) bx3.mo3371k(FocusModifierKt.m2340b());
        this.f16891e = focusModifier2;
        if (!(focusModifier2 == null || (z = focusModifier2.mo3232z()) == null)) {
            z.mo26953c(this);
        }
        this.f16892g = (qa3) bx3.mo3371k(KeyInputModifierKt.m2458a());
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
    public final LayoutNode mo25043q() {
        return this.f16893k;
    }

    /* renamed from: r */
    public final qa3 mo25044r() {
        return this.f16892g;
    }

    /* renamed from: s */
    public qa3 getValue() {
        return this;
    }

    /* renamed from: t */
    public final boolean mo25046t(KeyEvent keyEvent) {
        FocusModifier b;
        qa3 d;
        vx2.m53591g(keyEvent, "keyEvent");
        FocusModifier focusModifier = this.f16891e;
        if (focusModifier == null || (b = w62.m29287b(focusModifier)) == null || (d = w62.m29289d(b)) == null) {
            throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
        } else if (d.mo25048v(keyEvent)) {
            return true;
        } else {
            return d.mo25047u(keyEvent);
        }
    }

    /* renamed from: u */
    public final boolean mo25047u(KeyEvent keyEvent) {
        Boolean bool;
        vx2.m53591g(keyEvent, "keyEvent");
        rc2<ja3, Boolean> rc2 = this.f16889a;
        if (rc2 != null) {
            bool = rc2.invoke(ja3.m20053a(keyEvent));
        } else {
            bool = null;
        }
        if (vx2.m53586b(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        qa3 qa3 = this.f16892g;
        if (qa3 != null) {
            return qa3.mo25047u(keyEvent);
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo25048v(KeyEvent keyEvent) {
        Boolean bool;
        vx2.m53591g(keyEvent, "keyEvent");
        qa3 qa3 = this.f16892g;
        if (qa3 != null) {
            bool = Boolean.valueOf(qa3.mo25048v(keyEvent));
        } else {
            bool = null;
        }
        if (vx2.m53586b(bool, Boolean.TRUE)) {
            return bool.booleanValue();
        }
        rc2<ja3, Boolean> rc2 = this.f16890d;
        if (rc2 != null) {
            return rc2.invoke(ja3.m20053a(keyEvent)).booleanValue();
        }
        return false;
    }
}
