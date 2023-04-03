package p000;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: ub1 */
/* compiled from: SpecialTypes.kt */
public abstract class ub1 extends d36 {
    /* renamed from: F0 */
    public List<f17> mo51132F0() {
        return mo51431Q0().mo51132F0();
    }

    /* renamed from: G0 */
    public rz6 mo51133G0() {
        return mo51431Q0().mo51133G0();
    }

    /* renamed from: H0 */
    public yz6 mo51134H0() {
        return mo51431Q0().mo51134H0();
    }

    /* renamed from: I0 */
    public boolean mo51135I0() {
        return mo51431Q0().mo51135I0();
    }

    /* renamed from: Q0 */
    public abstract d36 mo51431Q0();

    /* renamed from: R0 */
    public d36 mo51138M0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        xc3 h = bd3.mo50562h(mo51431Q0());
        vx2.m53589e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return mo51432S0((d36) h);
    }

    /* renamed from: S0 */
    public abstract ub1 mo51432S0(d36 d36);

    /* renamed from: m */
    public MemberScope mo51146m() {
        return mo51431Q0().mo51146m();
    }
}
