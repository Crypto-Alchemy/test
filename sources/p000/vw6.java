package p000;

/* renamed from: vw6 */
/* compiled from: TransientReceiver */
public class vw6 extends C9588x6 {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public vw6(xc3 xc3) {
        this(xc3, (j85) null);
        if (xc3 == null) {
            m73384b(0);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m73384b(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vw6(xc3 xc3, j85 j85) {
        super(xc3, j85);
        if (xc3 == null) {
            m73384b(1);
        }
    }
}
