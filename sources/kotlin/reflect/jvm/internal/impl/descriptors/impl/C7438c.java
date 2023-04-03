package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.c */
/* compiled from: VariableDescriptorWithInitializerImpl */
public abstract class C7438c extends C7437b {

    /* renamed from: r */
    public final boolean f39377r;

    /* renamed from: s */
    public gc4<fq0<?>> f39378s;

    /* renamed from: x */
    public pc2<gc4<fq0<?>>> f39379x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7438c(d31 d31, C6983dm dmVar, r24 r24, xc3 xc3, boolean z, a66 a66) {
        super(d31, dmVar, r24, xc3, a66);
        if (d31 == null) {
            m60588Q(0);
        }
        if (dmVar == null) {
            m60588Q(1);
        }
        if (r24 == null) {
            m60588Q(2);
        }
        if (a66 == null) {
            m60588Q(3);
        }
        this.f39377r = z;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m60588Q(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = PublicResolver.FUNC_NAME;
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: E0 */
    public void mo53364E0(gc4<fq0<?>> gc4, pc2<gc4<fq0<?>>> pc2) {
        if (pc2 == null) {
            m60588Q(5);
        }
        this.f39379x = pc2;
        if (gc4 == null) {
            gc4 = pc2.invoke();
        }
        this.f39378s = gc4;
    }

    /* renamed from: F0 */
    public void mo53365F0(pc2<gc4<fq0<?>>> pc2) {
        if (pc2 == null) {
            m60588Q(4);
        }
        mo53364E0((gc4<fq0<?>>) null, pc2);
    }

    /* renamed from: I */
    public boolean mo51761I() {
        return this.f39377r;
    }

    /* renamed from: i0 */
    public fq0<?> mo51768i0() {
        gc4<fq0<?>> gc4 = this.f39378s;
        if (gc4 != null) {
            return (fq0) gc4.invoke();
        }
        return null;
    }
}
