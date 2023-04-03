package p000;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: h6 */
/* compiled from: AbstractLazyTypeParameterDescriptor */
public abstract class C7162h6 extends C7248j7 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7162h6(da6 da6, d31 d31, C6983dm dmVar, r24 r24, Variance variance, boolean z, int i, a66 a66, nd6 nd6) {
        super(da6, d31, dmVar, r24, variance, z, i, a66, nd6);
        if (da6 == null) {
            m58476Q(0);
        }
        if (d31 == null) {
            m58476Q(1);
        }
        if (dmVar == null) {
            m58476Q(2);
        }
        if (r24 == null) {
            m58476Q(3);
        }
        if (variance == null) {
            m58476Q(4);
        }
        if (a66 == null) {
            m58476Q(5);
        }
        if (nd6 == null) {
            m58476Q(6);
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ void m58476Q(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        String str;
        Object[] objArr = new Object[3];
        String str2 = "";
        if (mo50050u()) {
            str = "reified ";
        } else {
            str = str2;
        }
        objArr[0] = str;
        if (mo50049j() != Variance.INVARIANT) {
            str2 = mo50049j() + " ";
        }
        objArr[1] = str2;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
