package p000;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: e31 */
/* compiled from: DeclarationDescriptorImpl */
public abstract class e31 extends C9180pl implements d31 {

    /* renamed from: d */
    public final r24 f37446d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e31(C6983dm dmVar, r24 r24) {
        super(dmVar);
        if (dmVar == null) {
            m57136Q(0);
        }
        if (r24 == null) {
            m57136Q(1);
        }
        this.f37446d = r24;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m57136Q(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b0 */
    public static String m57137b0(d31 d31) {
        if (d31 == null) {
            m57136Q(4);
        }
        try {
            String str = DescriptorRenderer.f39995j.mo54810q(d31) + "[" + d31.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(d31)) + "]";
            if (str == null) {
                m57136Q(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = d31.getClass().getSimpleName() + " " + d31.getName();
            if (str2 == null) {
                m57136Q(6);
            }
            return str2;
        }
    }

    /* renamed from: a */
    public d31 mo50045a() {
        return this;
    }

    public r24 getName() {
        r24 r24 = this.f37446d;
        if (r24 == null) {
            m57136Q(2);
        }
        return r24;
    }

    public String toString() {
        return m57137b0(this);
    }
}
