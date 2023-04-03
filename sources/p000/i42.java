package p000;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: i42 */
/* compiled from: KotlinType.kt */
public abstract class i42 extends w47 implements l42 {

    /* renamed from: d */
    public final d36 f38331d;

    /* renamed from: e */
    public final d36 f38332e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i42(d36 d36, d36 d362) {
        super((DefaultConstructorMarker) null);
        vx2.m53591g(d36, "lowerBound");
        vx2.m53591g(d362, "upperBound");
        this.f38331d = d36;
        this.f38332e = d362;
    }

    /* renamed from: F0 */
    public List<f17> mo51132F0() {
        return mo52398O0().mo51132F0();
    }

    /* renamed from: G0 */
    public rz6 mo51133G0() {
        return mo52398O0().mo51133G0();
    }

    /* renamed from: H0 */
    public yz6 mo51134H0() {
        return mo52398O0().mo51134H0();
    }

    /* renamed from: I0 */
    public boolean mo51135I0() {
        return mo52398O0().mo51135I0();
    }

    /* renamed from: O0 */
    public abstract d36 mo52398O0();

    /* renamed from: P0 */
    public final d36 mo52399P0() {
        return this.f38331d;
    }

    /* renamed from: Q0 */
    public final d36 mo52400Q0() {
        return this.f38332e;
    }

    /* renamed from: R0 */
    public abstract String mo52401R0(DescriptorRenderer descriptorRenderer, zc1 zc1);

    /* renamed from: m */
    public MemberScope mo51146m() {
        return mo52398O0().mo51146m();
    }

    public String toString() {
        return DescriptorRenderer.f39995j.mo54815w(this);
    }
}
