package p000;

/* renamed from: vb1 */
/* compiled from: KotlinTypeFactory.kt */
public abstract class vb1 extends ub1 {

    /* renamed from: d */
    public final d36 f45254d;

    public vb1(d36 d36) {
        vx2.m53591g(d36, "delegate");
        this.f45254d = d36;
    }

    /* renamed from: O0 */
    public d36 mo51137L0(boolean z) {
        if (z == mo51135I0()) {
            return this;
        }
        return mo51431Q0().mo51121O0(z).mo51122P0(mo51133G0());
    }

    /* renamed from: P0 */
    public d36 mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        if (rz6 != mo51133G0()) {
            return new g36(this, rz6);
        }
        return this;
    }

    /* renamed from: Q0 */
    public d36 mo51431Q0() {
        return this.f45254d;
    }
}
