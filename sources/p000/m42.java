package p000;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* renamed from: m42 */
/* compiled from: TypeWithEnhancement.kt */
public final class m42 extends i42 implements b27 {

    /* renamed from: g */
    public final i42 f40763g;

    /* renamed from: k */
    public final xc3 f40764k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m42(i42 i42, xc3 xc3) {
        super(i42.mo52399P0(), i42.mo52400Q0());
        vx2.m53591g(i42, "origin");
        vx2.m53591g(xc3, "enhancement");
        this.f40763g = i42;
        this.f40764k = xc3;
    }

    /* renamed from: L0 */
    public w47 mo51137L0(boolean z) {
        return c27.m56296d(mo50462A0().mo51137L0(z), mo50463b0().mo64506K0().mo51137L0(z));
    }

    /* renamed from: N0 */
    public w47 mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        return c27.m56296d(mo50462A0().mo51139N0(rz6), mo50463b0());
    }

    /* renamed from: O0 */
    public d36 mo52398O0() {
        return mo50462A0().mo52398O0();
    }

    /* renamed from: R0 */
    public String mo52401R0(DescriptorRenderer descriptorRenderer, zc1 zc1) {
        vx2.m53591g(descriptorRenderer, "renderer");
        vx2.m53591g(zc1, "options");
        if (zc1.mo54908d()) {
            return descriptorRenderer.mo54815w(mo50463b0());
        }
        return mo50462A0().mo52401R0(descriptorRenderer, zc1);
    }

    /* renamed from: S0 */
    public i42 mo50462A0() {
        return this.f40763g;
    }

    /* renamed from: T0 */
    public m42 mo51138M0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        xc3 h = bd3.mo50562h(mo50462A0());
        vx2.m53589e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new m42((i42) h, bd3.mo50562h(mo50463b0()));
    }

    /* renamed from: b0 */
    public xc3 mo50463b0() {
        return this.f40764k;
    }

    public String toString() {
        return "[@EnhancedForWarnings(" + mo50463b0() + ")] " + mo50462A0();
    }
}
