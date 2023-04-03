package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.b */
/* compiled from: VariableDescriptorImpl */
public abstract class C7437b extends g31 implements o87 {

    /* renamed from: k */
    public xc3 f39376k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7437b(d31 d31, C6983dm dmVar, r24 r24, xc3 xc3, a66 a66) {
        super(d31, dmVar, r24, a66);
        if (d31 == null) {
            m60582Q(0);
        }
        if (dmVar == null) {
            m60582Q(1);
        }
        if (r24 == null) {
            m60582Q(2);
        }
        if (a66 == null) {
            m60582Q(3);
        }
        this.f39376k = xc3;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m60582Q(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: A0 */
    public void mo53363A0(xc3 xc3) {
        this.f39376k = xc3;
    }

    /* renamed from: G */
    public h85 mo51311G() {
        return null;
    }

    /* renamed from: J */
    public h85 mo51315J() {
        return null;
    }

    /* renamed from: a0 */
    public boolean mo51318a0() {
        return false;
    }

    /* renamed from: f */
    public List<n87> mo51763f() {
        List<n87> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m60582Q(6);
        }
        return emptyList;
    }

    public xc3 getReturnType() {
        xc3 type = getType();
        if (type == null) {
            m60582Q(10);
        }
        return type;
    }

    public xc3 getType() {
        xc3 xc3 = this.f39376k;
        if (xc3 == null) {
            m60582Q(4);
        }
        return xc3;
    }

    public List<a17> getTypeParameters() {
        List<a17> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m60582Q(8);
        }
        return emptyList;
    }
}
