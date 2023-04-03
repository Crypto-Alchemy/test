package p000;

import androidx.paging.LoadType;
import kotlin.Metadata;
import p000.xi3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0013\u001a\u00020\u0005H\u0002J*\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002R\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0016\u0010 \u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001f¨\u0006$"}, mo44877d2 = {"Ll04;", "", "Lil0;", "h", "combinedLoadStates", "Lr37;", "e", "Lyi3;", "sourceLoadStates", "remoteLoadStates", "f", "Landroidx/paging/LoadType;", "type", "", "remote", "Lxi3;", "state", "g", "d", "i", "previousState", "sourceRefreshState", "sourceState", "remoteState", "c", "a", "Lxi3;", "refresh", "b", "prepend", "append", "Lyi3;", "source", "mediator", "<init>", "()V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: l04 */
/* compiled from: MutableLoadStateCollection.kt */
public final class l04 {

    /* renamed from: a */
    public xi3 f14394a;

    /* renamed from: b */
    public xi3 f14395b;

    /* renamed from: c */
    public xi3 f14396c;

    /* renamed from: d */
    public yi3 f14397d = yi3.f20229e.mo28088a();

    /* renamed from: e */
    public yi3 f14398e;

    public l04() {
        xi3.C3605c.C3606a aVar = xi3.C3605c.f19851d;
        this.f14394a = aVar.mo27759b();
        this.f14395b = aVar.mo27759b();
        this.f14396c = aVar.mo27759b();
    }

    /* renamed from: c */
    public final xi3 mo22613c(xi3 xi3, xi3 xi32, xi3 xi33, xi3 xi34) {
        if (xi34 == null) {
            return xi33;
        }
        if (!(xi3 instanceof xi3.C3604b) || (((xi32 instanceof xi3.C3605c) && (xi34 instanceof xi3.C3605c)) || (xi34 instanceof xi3.C3603a))) {
            return xi34;
        }
        return xi3;
    }

    /* renamed from: d */
    public final xi3 mo22614d(LoadType loadType, boolean z) {
        yi3 yi3;
        vx2.m53591g(loadType, "type");
        if (z) {
            yi3 = this.f14398e;
        } else {
            yi3 = this.f14397d;
        }
        if (yi3 != null) {
            return yi3.mo28080d(loadType);
        }
        return null;
    }

    /* renamed from: e */
    public final void mo22615e(il0 il0) {
        vx2.m53591g(il0, "combinedLoadStates");
        this.f14394a = il0.mo21563e();
        this.f14395b = il0.mo21562d();
        this.f14396c = il0.mo21560b();
        this.f14397d = il0.mo21565f();
        this.f14398e = il0.mo21561c();
    }

    /* renamed from: f */
    public final void mo22616f(yi3 yi3, yi3 yi32) {
        vx2.m53591g(yi3, "sourceLoadStates");
        this.f14397d = yi3;
        this.f14398e = yi32;
        mo22619i();
    }

    /* renamed from: g */
    public final boolean mo22617g(LoadType loadType, boolean z, xi3 xi3) {
        boolean z2;
        yi3 yi3;
        vx2.m53591g(loadType, "type");
        vx2.m53591g(xi3, "state");
        if (z) {
            yi3 yi32 = this.f14398e;
            if (yi32 != null) {
                yi3 = yi32;
            } else {
                yi3 = yi3.f20229e.mo28088a();
            }
            yi3 h = yi3.mo28085h(loadType, xi3);
            this.f14398e = h;
            z2 = vx2.m53586b(h, yi32);
        } else {
            yi3 yi33 = this.f14397d;
            yi3 h2 = yi33.mo28085h(loadType, xi3);
            this.f14397d = h2;
            z2 = vx2.m53586b(h2, yi33);
        }
        boolean z3 = !z2;
        mo22619i();
        return z3;
    }

    /* renamed from: h */
    public final il0 mo22618h() {
        return new il0(this.f14394a, this.f14395b, this.f14396c, this.f14397d, this.f14398e);
    }

    /* renamed from: i */
    public final void mo22619i() {
        xi3 xi3;
        xi3 xi32;
        xi3 xi33 = this.f14394a;
        xi3 g = this.f14397d.mo28084g();
        xi3 g2 = this.f14397d.mo28084g();
        yi3 yi3 = this.f14398e;
        xi3 xi34 = null;
        if (yi3 != null) {
            xi3 = yi3.mo28084g();
        } else {
            xi3 = null;
        }
        this.f14394a = mo22613c(xi33, g, g2, xi3);
        xi3 xi35 = this.f14395b;
        xi3 g3 = this.f14397d.mo28084g();
        xi3 f = this.f14397d.mo28083f();
        yi3 yi32 = this.f14398e;
        if (yi32 != null) {
            xi32 = yi32.mo28083f();
        } else {
            xi32 = null;
        }
        this.f14395b = mo22613c(xi35, g3, f, xi32);
        xi3 xi36 = this.f14396c;
        xi3 g4 = this.f14397d.mo28084g();
        xi3 e = this.f14397d.mo28081e();
        yi3 yi33 = this.f14398e;
        if (yi33 != null) {
            xi34 = yi33.mo28081e();
        }
        this.f14396c = mo22613c(xi36, g4, e, xi34);
    }
}
