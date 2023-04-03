package p000;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: e36 */
/* compiled from: KotlinTypeFactory.kt */
public final class e36 extends d36 {

    /* renamed from: d */
    public final yz6 f37448d;

    /* renamed from: e */
    public final List<f17> f37449e;

    /* renamed from: g */
    public final boolean f37450g;

    /* renamed from: k */
    public final MemberScope f37451k;

    /* renamed from: r */
    public final rc2<bd3, d36> f37452r;

    public e36(yz6 yz6, List<? extends f17> list, boolean z, MemberScope memberScope, rc2<? super bd3, ? extends d36> rc2) {
        vx2.m53591g(yz6, "constructor");
        vx2.m53591g(list, "arguments");
        vx2.m53591g(memberScope, "memberScope");
        vx2.m53591g(rc2, "refinedTypeFactory");
        this.f37448d = yz6;
        this.f37449e = list;
        this.f37450g = z;
        this.f37451k = memberScope;
        this.f37452r = rc2;
        if ((mo51146m() instanceof jr1) && !(mo51146m() instanceof sp6)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + mo51146m() + 10 + mo51134H0());
        }
    }

    /* renamed from: F0 */
    public List<f17> mo51132F0() {
        return this.f37449e;
    }

    /* renamed from: G0 */
    public rz6 mo51133G0() {
        return rz6.f44504d.mo65783h();
    }

    /* renamed from: H0 */
    public yz6 mo51134H0() {
        return this.f37448d;
    }

    /* renamed from: I0 */
    public boolean mo51135I0() {
        return this.f37450g;
    }

    /* renamed from: O0 */
    public d36 mo51137L0(boolean z) {
        if (z == mo51135I0()) {
            return this;
        }
        if (z) {
            return new hc4(this);
        }
        return new r84(this);
    }

    /* renamed from: P0 */
    public d36 mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        if (rz6.isEmpty()) {
            return this;
        }
        return new g36(this, rz6);
    }

    /* renamed from: Q0 */
    public d36 mo51138M0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        d36 invoke = this.f37452r.invoke(bd3);
        if (invoke == null) {
            return this;
        }
        return invoke;
    }

    /* renamed from: m */
    public MemberScope mo51146m() {
        return this.f37451k;
    }
}
