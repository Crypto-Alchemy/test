package p000;

/* renamed from: x6 */
/* compiled from: AbstractReceiverValue */
public abstract class C9588x6 implements j85 {

    /* renamed from: a */
    public final xc3 f45847a;

    /* renamed from: b */
    public final j85 f45848b;

    public C9588x6(xc3 xc3, j85 j85) {
        if (xc3 == null) {
            m73874b(0);
        }
        this.f45847a = xc3;
        this.f45848b = j85 == null ? this : j85;
    }

    /* renamed from: b */
    public static /* synthetic */ void m73874b(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 1 || i == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public xc3 getType() {
        xc3 xc3 = this.f45847a;
        if (xc3 == null) {
            m73874b(1);
        }
        return xc3;
    }
}
