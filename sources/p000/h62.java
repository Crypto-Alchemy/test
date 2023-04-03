package p000;

import kotlin.Metadata;
import p000.i62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u0004BI\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f\u0012\u0014\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u0018¢\u0006\u0004\b$\u0010%J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\fR%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R(\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, mo44877d2 = {"Lh62;", "Li62;", "T", "Lvw3;", "Lax3;", "Lbx3;", "scope", "Lr37;", "i", "event", "", "s", "(Li62;)Z", "t", "r", "Lkotlin/Function1;", "a", "Lrc2;", "getOnEvent", "()Lrc2;", "onEvent", "d", "getOnPreEvent", "onPreEvent", "Liy4;", "e", "Liy4;", "getKey", "()Liy4;", "key", "g", "Lh62;", "focusAwareEventParent", "q", "()Lh62;", "value", "<init>", "(Lrc2;Lrc2;Liy4;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: h62 */
/* compiled from: FocusAwareInputModifier.kt */
public class h62<T extends i62> implements vw3, ax3<h62<T>> {

    /* renamed from: a */
    public final rc2<i62, Boolean> f12753a;

    /* renamed from: d */
    public final rc2<i62, Boolean> f12754d;

    /* renamed from: e */
    public final iy4<h62<T>> f12755e;

    /* renamed from: g */
    public h62<T> f12756g;

    public h62(rc2<? super i62, Boolean> rc2, rc2<? super i62, Boolean> rc22, iy4<h62<T>> iy4) {
        vx2.m53591g(iy4, "key");
        this.f12753a = rc2;
        this.f12754d = rc22;
        this.f12755e = iy4;
    }

    public iy4<h62<T>> getKey() {
        return this.f12755e;
    }

    /* renamed from: i */
    public void mo3222i(bx3 bx3) {
        vx2.m53591g(bx3, "scope");
        this.f12756g = (h62) bx3.mo3371k(getKey());
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
    public h62<T> getValue() {
        return this;
    }

    /* renamed from: r */
    public final boolean mo20964r(T t) {
        boolean z;
        rc2<i62, Boolean> rc2 = this.f12753a;
        if (rc2 == null || !rc2.invoke(t).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        h62<T> h62 = this.f12756g;
        if (h62 != null) {
            return h62.mo20964r(t);
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo20965s(T t) {
        vx2.m53591g(t, "event");
        if (mo20966t(t) || mo20964r(t)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo20966t(T t) {
        boolean z;
        h62<T> h62 = this.f12756g;
        if (h62 == null || !h62.mo20966t(t)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        rc2<i62, Boolean> rc2 = this.f12754d;
        if (rc2 != null) {
            return rc2.invoke(t).booleanValue();
        }
        return false;
    }
}
