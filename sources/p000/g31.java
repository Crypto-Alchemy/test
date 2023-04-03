package p000;

import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: g31 */
/* compiled from: DeclarationDescriptorNonRootImpl */
public abstract class g31 extends e31 implements f31 {

    /* renamed from: e */
    public final d31 f37968e;

    /* renamed from: g */
    public final a66 f37969g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g31(d31 d31, C6983dm dmVar, r24 r24, a66 a66) {
        super(dmVar, r24);
        if (d31 == null) {
            m58000Q(0);
        }
        if (dmVar == null) {
            m58000Q(1);
        }
        if (r24 == null) {
            m58000Q(2);
        }
        if (a66 == null) {
            m58000Q(3);
        }
        this.f37968e = d31;
        this.f37969g = a66;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m58000Q(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5 || i == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public d31 mo51119b() {
        d31 d31 = this.f37968e;
        if (d31 == null) {
            m58000Q(5);
        }
        return d31;
    }

    public a66 getSource() {
        a66 a66 = this.f37969g;
        if (a66 == null) {
            m58000Q(6);
        }
        return a66;
    }

    /* renamed from: y0 */
    public j31 mo50045a() {
        j31 j31 = (j31) super.mo50045a();
        if (j31 == null) {
            m58000Q(4);
        }
        return j31;
    }
}
