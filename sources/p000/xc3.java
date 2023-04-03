package p000;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: xc3 */
/* compiled from: KotlinType.kt */
public abstract class xc3 implements C7903ml, ad3 {

    /* renamed from: a */
    public int f45870a;

    public xc3() {
    }

    public /* synthetic */ xc3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: E0 */
    public final int mo66849E0() {
        if (zc3.m74855a(this)) {
            return super.hashCode();
        }
        return (((mo51134H0().hashCode() * 31) + mo51132F0().hashCode()) * 31) + (mo51135I0() ? 1 : 0);
    }

    /* renamed from: F0 */
    public abstract List<f17> mo51132F0();

    /* renamed from: G0 */
    public abstract rz6 mo51133G0();

    /* renamed from: H0 */
    public abstract yz6 mo51134H0();

    /* renamed from: I0 */
    public abstract boolean mo51135I0();

    /* renamed from: J0 */
    public abstract xc3 mo51136J0(bd3 bd3);

    /* renamed from: K0 */
    public abstract w47 mo64506K0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc3)) {
            return false;
        }
        xc3 xc3 = (xc3) obj;
        if (mo51135I0() != xc3.mo51135I0() || !za6.f46347a.mo67242a(mo64506K0(), xc3.mo64506K0())) {
            return false;
        }
        return true;
    }

    public C6983dm getAnnotations() {
        return C7216im.m59001a(mo51133G0());
    }

    public final int hashCode() {
        int i = this.f45870a;
        if (i != 0) {
            return i;
        }
        int E0 = mo66849E0();
        this.f45870a = E0;
        return E0;
    }

    /* renamed from: m */
    public abstract MemberScope mo51146m();
}
