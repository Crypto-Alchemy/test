package p000;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* renamed from: k42 */
/* compiled from: flexibleTypes.kt */
public final class k42 extends i42 implements zy0 {

    /* renamed from: k */
    public static final C7335a f38861k = new C7335a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static boolean f38862r;

    /* renamed from: g */
    public boolean f38863g;

    /* renamed from: k42$a */
    /* compiled from: flexibleTypes.kt */
    public static final class C7335a {
        public C7335a() {
        }

        public /* synthetic */ C7335a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k42(d36 d36, d36 d362) {
        super(d36, d362);
        vx2.m53591g(d36, "lowerBound");
        vx2.m53591g(d362, "upperBound");
    }

    /* renamed from: L0 */
    public w47 mo51137L0(boolean z) {
        return KotlinTypeFactory.m62849d(mo52399P0().mo51121O0(z), mo52400Q0().mo51121O0(z));
    }

    /* renamed from: N0 */
    public w47 mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        return KotlinTypeFactory.m62849d(mo52399P0().mo51122P0(rz6), mo52400Q0().mo51122P0(rz6));
    }

    /* renamed from: O0 */
    public d36 mo52398O0() {
        mo52864T0();
        return mo52399P0();
    }

    /* renamed from: Q */
    public xc3 mo51430Q(xc3 xc3) {
        w47 w47;
        vx2.m53591g(xc3, "replacement");
        w47 K0 = xc3.mo64506K0();
        if (K0 instanceof i42) {
            w47 = K0;
        } else if (K0 instanceof d36) {
            d36 d36 = (d36) K0;
            w47 = KotlinTypeFactory.m62849d(d36, d36.mo51121O0(true));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return c27.m56294b(w47, K0);
    }

    /* renamed from: R0 */
    public String mo52401R0(DescriptorRenderer descriptorRenderer, zc1 zc1) {
        vx2.m53591g(descriptorRenderer, "renderer");
        vx2.m53591g(zc1, "options");
        if (!zc1.mo54926j()) {
            return descriptorRenderer.mo54812t(descriptorRenderer.mo54815w(mo52399P0()), descriptorRenderer.mo54815w(mo52400Q0()), TypeUtilsKt.m62952h(this));
        }
        return '(' + descriptorRenderer.mo54815w(mo52399P0()) + ".." + descriptorRenderer.mo54815w(mo52400Q0()) + ')';
    }

    /* renamed from: S0 */
    public i42 mo51138M0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        xc3 h = bd3.mo50562h(mo52399P0());
        vx2.m53589e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        xc3 h2 = bd3.mo50562h(mo52400Q0());
        vx2.m53589e(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new k42((d36) h, (d36) h2);
    }

    /* renamed from: T0 */
    public final void mo52864T0() {
        if (f38862r && !this.f38863g) {
            this.f38863g = true;
            n42.m64516b(mo52399P0());
            n42.m64516b(mo52400Q0());
            vx2.m53586b(mo52399P0(), mo52400Q0());
            yc3.f46193a.mo55823c(mo52399P0(), mo52400Q0());
        }
    }

    public String toString() {
        return '(' + mo52399P0() + ".." + mo52400Q0() + ')';
    }

    /* renamed from: y0 */
    public boolean mo51435y0() {
        if (!(mo52399P0().mo51134H0().mo51180d() instanceof a17) || !vx2.m53586b(mo52399P0().mo51134H0(), mo52400Q0().mo51134H0())) {
            return false;
        }
        return true;
    }
}
