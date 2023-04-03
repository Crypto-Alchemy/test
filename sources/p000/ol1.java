package p000;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* renamed from: ol1 */
/* compiled from: dynamicTypes.kt */
public final class ol1 extends i42 implements pl1 {

    /* renamed from: g */
    public final rz6 f43734g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ol1(kotlin.reflect.jvm.internal.impl.builtins.C7389b r3, p000.rz6 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "builtIns"
            p000.vx2.m53591g(r3, r0)
            java.lang.String r0 = "attributes"
            p000.vx2.m53591g(r4, r0)
            d36 r0 = r3.mo53150H()
            java.lang.String r1 = "builtIns.nothingType"
            p000.vx2.m53590f(r0, r1)
            d36 r3 = r3.mo53151I()
            java.lang.String r1 = "builtIns.nullableAnyType"
            p000.vx2.m53590f(r3, r1)
            r2.<init>(r0, r3)
            r2.f43734g = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ol1.<init>(kotlin.reflect.jvm.internal.impl.builtins.b, rz6):void");
    }

    /* renamed from: G0 */
    public rz6 mo51133G0() {
        return this.f43734g;
    }

    /* renamed from: I0 */
    public boolean mo51135I0() {
        return false;
    }

    /* renamed from: O0 */
    public d36 mo52398O0() {
        return mo52400Q0();
    }

    /* renamed from: R0 */
    public String mo52401R0(DescriptorRenderer descriptorRenderer, zc1 zc1) {
        vx2.m53591g(descriptorRenderer, "renderer");
        vx2.m53591g(zc1, "options");
        return "dynamic";
    }

    /* renamed from: S0 */
    public ol1 mo51137L0(boolean z) {
        return this;
    }

    /* renamed from: T0 */
    public ol1 mo51138M0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: U0 */
    public ol1 mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        return new ol1(TypeUtilsKt.m62952h(mo52398O0()), rz6);
    }
}
