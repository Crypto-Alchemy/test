package p000;

import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* renamed from: t84 */
/* compiled from: typeEnhancement.kt */
public final class t84 extends ub1 implements s84 {

    /* renamed from: d */
    public final d36 f44689d;

    public t84(d36 d36) {
        vx2.m53591g(d36, "delegate");
        this.f44689d = d36;
    }

    /* renamed from: I0 */
    public boolean mo51135I0() {
        return false;
    }

    /* renamed from: O0 */
    public d36 mo51137L0(boolean z) {
        if (z) {
            return mo51431Q0().mo51121O0(true);
        }
        return this;
    }

    /* renamed from: Q */
    public xc3 mo51430Q(xc3 xc3) {
        vx2.m53591g(xc3, "replacement");
        w47 K0 = xc3.mo64506K0();
        if (!TypeUtilsKt.m62961q(K0) && !x17.m73828l(K0)) {
            return K0;
        }
        if (K0 instanceof d36) {
            return mo66002T0((d36) K0);
        }
        if (K0 instanceof i42) {
            i42 i42 = (i42) K0;
            return c27.m56296d(KotlinTypeFactory.m62849d(mo66002T0(i42.mo52399P0()), mo66002T0(i42.mo52400Q0())), c27.m56293a(K0));
        }
        throw new IllegalStateException(("Incorrect type: " + K0).toString());
    }

    /* renamed from: Q0 */
    public d36 mo51431Q0() {
        return this.f44689d;
    }

    /* renamed from: T0 */
    public final d36 mo66002T0(d36 d36) {
        d36 O0 = d36.mo51121O0(false);
        if (!TypeUtilsKt.m62961q(d36)) {
            return O0;
        }
        return new t84(O0);
    }

    /* renamed from: U0 */
    public t84 mo51122P0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        return new t84(mo51431Q0().mo51122P0(rz6));
    }

    /* renamed from: V0 */
    public t84 mo51432S0(d36 d36) {
        vx2.m53591g(d36, "delegate");
        return new t84(d36);
    }

    /* renamed from: y0 */
    public boolean mo51435y0() {
        return true;
    }
}
