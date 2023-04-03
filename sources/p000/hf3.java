package p000;

/* renamed from: hf3 */
/* compiled from: LazyClassReceiverParameterDescriptor */
public class hf3 extends C9486w6 {

    /* renamed from: e */
    public final if0 f38202e;

    /* renamed from: g */
    public final ps2 f38203g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hf3(if0 if0) {
        super(C6983dm.f37317b.mo51228b());
        if (if0 == null) {
            m58542Q(0);
        }
        this.f38202e = if0;
        this.f38203g = new ps2(if0, (ps2) null);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m58542Q(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public d31 mo51119b() {
        if0 if0 = this.f38202e;
        if (if0 == null) {
            m58542Q(2);
        }
        return if0;
    }

    public j85 getValue() {
        ps2 ps2 = this.f38203g;
        if (ps2 == null) {
            m58542Q(1);
        }
        return ps2;
    }

    public String toString() {
        return "class " + this.f38202e.getName() + "::this";
    }
}
