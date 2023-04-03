package p000;

/* renamed from: h36 */
/* compiled from: TypeWithEnhancement.kt */
public final class h36 extends ub1 implements b27 {

    /* renamed from: d */
    public final d36 f38156d;

    /* renamed from: e */
    public final xc3 f38157e;

    public h36(d36 d36, xc3 xc3) {
        vx2.m53591g(d36, "delegate");
        vx2.m53591g(xc3, "enhancement");
        this.f38156d = d36;
        this.f38157e = xc3;
    }

    /* renamed from: O0 */
    public d36 mo51137L0(boolean z) {
        w47 d = c27.m56296d(mo50462A0().mo51121O0(z), mo50463b0().mo64506K0().mo51137L0(z));
        vx2.m53589e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (d36) d;
    }

    /* renamed from: P0 */
    public d36 mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        w47 d = c27.m56296d(mo50462A0().mo51122P0(rz6), mo50463b0());
        vx2.m53589e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (d36) d;
    }

    /* renamed from: Q0 */
    public d36 mo51431Q0() {
        return this.f38156d;
    }

    /* renamed from: T0 */
    public d36 mo50462A0() {
        return mo51431Q0();
    }

    /* renamed from: U0 */
    public h36 mo52116R0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        xc3 h = bd3.mo50562h(mo51431Q0());
        vx2.m53589e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new h36((d36) h, bd3.mo50562h(mo50463b0()));
    }

    /* renamed from: V0 */
    public h36 mo51432S0(d36 d36) {
        vx2.m53591g(d36, "delegate");
        return new h36(d36, mo50463b0());
    }

    /* renamed from: b0 */
    public xc3 mo50463b0() {
        return this.f38157e;
    }

    public String toString() {
        return "[@EnhancedForWarnings(" + mo50463b0() + ")] " + mo50462A0();
    }
}
