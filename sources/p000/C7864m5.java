package p000;

/* renamed from: m5 */
/* compiled from: SpecialTypes.kt */
public final class C7864m5 extends ub1 {

    /* renamed from: d */
    public final d36 f40765d;

    /* renamed from: e */
    public final d36 f40766e;

    public C7864m5(d36 d36, d36 d362) {
        vx2.m53591g(d36, "delegate");
        vx2.m53591g(d362, "abbreviation");
        this.f40765d = d36;
        this.f40766e = d362;
    }

    /* renamed from: C */
    public final d36 mo56125C() {
        return mo51431Q0();
    }

    /* renamed from: P0 */
    public d36 mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        return new C7864m5(mo51431Q0().mo51122P0(rz6), this.f40766e);
    }

    /* renamed from: Q0 */
    public d36 mo51431Q0() {
        return this.f40765d;
    }

    /* renamed from: T0 */
    public final d36 mo56126T0() {
        return this.f40766e;
    }

    /* renamed from: U0 */
    public C7864m5 mo51121O0(boolean z) {
        return new C7864m5(mo51431Q0().mo51121O0(z), this.f40766e.mo51121O0(z));
    }

    /* renamed from: V0 */
    public C7864m5 mo52116R0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        xc3 h = bd3.mo50562h(mo51431Q0());
        vx2.m53589e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        xc3 h2 = bd3.mo50562h(this.f40766e);
        vx2.m53589e(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C7864m5((d36) h, (d36) h2);
    }

    /* renamed from: W0 */
    public C7864m5 mo51432S0(d36 d36) {
        vx2.m53591g(d36, "delegate");
        return new C7864m5(d36, this.f40766e);
    }
}
