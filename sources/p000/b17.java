package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.nd6;

/* renamed from: b17 */
/* compiled from: TypeParameterDescriptorImpl */
public class b17 extends C7248j7 {

    /* renamed from: B */
    public final rc2<xc3, Void> f36630B;

    /* renamed from: C */
    public final List<xc3> f36631C;

    /* renamed from: H */
    public boolean f36632H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b17(d31 d31, C6983dm dmVar, boolean z, Variance variance, r24 r24, int i, a66 a66, rc2<xc3, Void> rc2, nd6 nd6, da6 da6) {
        super(da6, d31, dmVar, r24, variance, z, i, a66, nd6);
        if (d31 == null) {
            m55709Q(19);
        }
        if (dmVar == null) {
            m55709Q(20);
        }
        if (variance == null) {
            m55709Q(21);
        }
        if (r24 == null) {
            m55709Q(22);
        }
        if (a66 == null) {
            m55709Q(23);
        }
        if (nd6 == null) {
            m55709Q(24);
        }
        if (da6 == null) {
            m55709Q(25);
        }
        this.f36631C = new ArrayList(1);
        this.f36632H = false;
        this.f36630B = rc2;
    }

    /* renamed from: J0 */
    public static b17 m55706J0(d31 d31, C6983dm dmVar, boolean z, Variance variance, r24 r24, int i, a66 a66, rc2<xc3, Void> rc2, nd6 nd6, da6 da6) {
        if (d31 == null) {
            m55709Q(12);
        }
        if (dmVar == null) {
            m55709Q(13);
        }
        if (variance == null) {
            m55709Q(14);
        }
        if (r24 == null) {
            m55709Q(15);
        }
        if (a66 == null) {
            m55709Q(16);
        }
        if (nd6 == null) {
            m55709Q(17);
        }
        if (da6 == null) {
            m55709Q(18);
        }
        return new b17(d31, dmVar, z, variance, r24, i, a66, rc2, nd6, da6);
    }

    /* renamed from: K0 */
    public static b17 m55707K0(d31 d31, C6983dm dmVar, boolean z, Variance variance, r24 r24, int i, a66 a66, da6 da6) {
        if (d31 == null) {
            m55709Q(6);
        }
        if (dmVar == null) {
            m55709Q(7);
        }
        if (variance == null) {
            m55709Q(8);
        }
        if (r24 == null) {
            m55709Q(9);
        }
        if (a66 == null) {
            m55709Q(10);
        }
        if (da6 == null) {
            m55709Q(11);
        }
        return m55706J0(d31, dmVar, z, variance, r24, i, a66, (rc2<xc3, Void>) null, nd6.C7936a.f41155a, da6);
    }

    /* renamed from: L0 */
    public static a17 m55708L0(d31 d31, C6983dm dmVar, boolean z, Variance variance, r24 r24, int i, da6 da6) {
        if (d31 == null) {
            m55709Q(0);
        }
        if (dmVar == null) {
            m55709Q(1);
        }
        if (variance == null) {
            m55709Q(2);
        }
        if (r24 == null) {
            m55709Q(3);
        }
        if (da6 == null) {
            m55709Q(4);
        }
        b17 K0 = m55707K0(d31, dmVar, z, variance, r24, i, a66.f36360a, da6);
        K0.mo50452G0(DescriptorUtilsKt.m62445f(d31).mo53185y());
        K0.mo50458P0();
        return K0;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m55709Q(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 28) ? 2 : 3)];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 28) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: E0 */
    public void mo50450E0(xc3 xc3) {
        if (xc3 == null) {
            m55709Q(27);
        }
        rc2<xc3, Void> rc2 = this.f36630B;
        if (rc2 != null) {
            rc2.invoke(xc3);
        }
    }

    /* renamed from: F0 */
    public List<xc3> mo50451F0() {
        mo50453H0();
        List<xc3> list = this.f36631C;
        if (list == null) {
            m55709Q(28);
        }
        return list;
    }

    /* renamed from: G0 */
    public void mo50452G0(xc3 xc3) {
        if (xc3 == null) {
            m55709Q(26);
        }
        mo50454I0();
        mo50455M0(xc3);
    }

    /* renamed from: H0 */
    public final void mo50453H0() {
        if (!this.f36632H) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + mo50457O0());
        }
    }

    /* renamed from: I0 */
    public final void mo50454I0() {
        if (this.f36632H) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + mo50457O0());
        }
    }

    /* renamed from: M0 */
    public final void mo50455M0(xc3 xc3) {
        if (!zc3.m74855a(xc3)) {
            this.f36631C.add(xc3);
        }
    }

    /* renamed from: N0 */
    public boolean mo50456N0() {
        return this.f36632H;
    }

    /* renamed from: O0 */
    public final String mo50457O0() {
        return getName() + " declared in " + dd1.m56821m(mo51119b());
    }

    /* renamed from: P0 */
    public void mo50458P0() {
        mo50454I0();
        this.f36632H = true;
    }
}
