package p000;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: on7 */
/* compiled from: KotlinType.kt */
public abstract class on7 extends xc3 {
    public on7() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: F0 */
    public List<f17> mo51132F0() {
        return mo55315L0().mo51132F0();
    }

    /* renamed from: G0 */
    public rz6 mo51133G0() {
        return mo55315L0().mo51133G0();
    }

    /* renamed from: H0 */
    public yz6 mo51134H0() {
        return mo55315L0().mo51134H0();
    }

    /* renamed from: I0 */
    public boolean mo51135I0() {
        return mo55315L0().mo51135I0();
    }

    /* renamed from: K0 */
    public final w47 mo64506K0() {
        xc3 L0 = mo55315L0();
        while (L0 instanceof on7) {
            L0 = ((on7) L0).mo55315L0();
        }
        vx2.m53589e(L0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (w47) L0;
    }

    /* renamed from: L0 */
    public abstract xc3 mo55315L0();

    /* renamed from: M0 */
    public boolean mo55316M0() {
        return true;
    }

    /* renamed from: m */
    public MemberScope mo51146m() {
        return mo55315L0().mo51146m();
    }

    public String toString() {
        if (mo55316M0()) {
            return mo55315L0().toString();
        }
        return "<Not computed yet>";
    }
}
