package p000;

import androidx.compose.p004ui.focus.FocusPropertiesKt;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B/\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0011\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eR#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R/\u0010\u001e\u001a\u0004\u0018\u00010\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u00008B@BX\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001f8\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001b¨\u0006+"}, mo44877d2 = {"Lt62;", "Lvw3;", "Lax3;", "Ltv2;", "Lbx3;", "scope", "Lr37;", "i", "", "other", "", "equals", "", "hashCode", "Ls62;", "focusProperties", "q", "Lkotlin/Function1;", "d", "Lrc2;", "getFocusPropertiesScope", "()Lrc2;", "focusPropertiesScope", "<set-?>", "e", "Lt04;", "r", "()Lt62;", "t", "(Lt62;)V", "parent", "Liy4;", "g", "Liy4;", "getKey", "()Liy4;", "key", "s", "value", "Lsv2;", "inspectorInfo", "<init>", "(Lrc2;Lrc2;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: t62 */
/* compiled from: FocusProperties.kt */
public final class t62 extends tv2 implements vw3, ax3<t62> {

    /* renamed from: d */
    public final rc2<s62, r37> f17968d;

    /* renamed from: e */
    public final t04 f17969e = l56.m21292b((Object) null, (h56) null, 2, (Object) null);

    /* renamed from: g */
    public final iy4<t62> f17970g = FocusPropertiesKt.m2376b();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t62(rc2<? super s62, r37> rc2, rc2<? super sv2, r37> rc22) {
        super(rc22);
        vx2.m53591g(rc2, "focusPropertiesScope");
        vx2.m53591g(rc22, "inspectorInfo");
        this.f17968d = rc2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t62) || !vx2.m53586b(this.f17968d, ((t62) obj).f17968d)) {
            return false;
        }
        return true;
    }

    public iy4<t62> getKey() {
        return this.f17970g;
    }

    public int hashCode() {
        return this.f17968d.hashCode();
    }

    /* renamed from: i */
    public void mo3222i(bx3 bx3) {
        vx2.m53591g(bx3, "scope");
        mo26175t((t62) bx3.mo3371k(FocusPropertiesKt.m2376b()));
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
    public final void mo26172q(s62 s62) {
        vx2.m53591g(s62, "focusProperties");
        this.f17968d.invoke(s62);
        t62 r = mo26173r();
        if (r != null) {
            r.mo26172q(s62);
        }
    }

    /* renamed from: r */
    public final t62 mo26173r() {
        return (t62) this.f17969e.getValue();
    }

    /* renamed from: s */
    public t62 getValue() {
        return this;
    }

    /* renamed from: t */
    public final void mo26175t(t62 t62) {
        this.f17969e.setValue(t62);
    }
}
