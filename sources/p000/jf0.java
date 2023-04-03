package p000;

import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: jf0 */
/* compiled from: ClassDescriptorBase */
public abstract class jf0 extends C9387u5 {

    /* renamed from: r */
    public final d31 f38654r;

    /* renamed from: s */
    public final a66 f38655s;

    /* renamed from: x */
    public final boolean f38656x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jf0(da6 da6, d31 d31, r24 r24, a66 a66, boolean z) {
        super(da6, r24);
        if (da6 == null) {
            m59353y0(0);
        }
        if (d31 == null) {
            m59353y0(1);
        }
        if (r24 == null) {
            m59353y0(2);
        }
        if (a66 == null) {
            m59353y0(3);
        }
        this.f38654r = d31;
        this.f38655s = a66;
        this.f38656x = z;
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m59353y0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = PublicResolver.FUNC_NAME;
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public d31 mo51119b() {
        d31 d31 = this.f38654r;
        if (d31 == null) {
            m59353y0(4);
        }
        return d31;
    }

    public a66 getSource() {
        a66 a66 = this.f38655s;
        if (a66 == null) {
            m59353y0(5);
        }
        return a66;
    }

    public boolean isExternal() {
        return this.f38656x;
    }
}
