package p000;

/* renamed from: i85 */
/* compiled from: ReceiverParameterDescriptorImpl */
public class i85 extends C9486w6 {

    /* renamed from: e */
    public final d31 f38340e;

    /* renamed from: g */
    public j85 f38341g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i85(d31 d31, j85 j85, C6983dm dmVar) {
        super(dmVar);
        if (d31 == null) {
            m58882Q(0);
        }
        if (j85 == null) {
            m58882Q(1);
        }
        if (dmVar == null) {
            m58882Q(2);
        }
        this.f38340e = d31;
        this.f38341g = j85;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m58882Q(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 3 || i == 4)) {
            if (i == 5) {
                objArr[2] = "copy";
            } else if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public d31 mo51119b() {
        d31 d31 = this.f38340e;
        if (d31 == null) {
            m58882Q(4);
        }
        return d31;
    }

    public j85 getValue() {
        j85 j85 = this.f38341g;
        if (j85 == null) {
            m58882Q(3);
        }
        return j85;
    }
}
