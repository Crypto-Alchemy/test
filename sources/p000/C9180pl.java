package p000;

/* renamed from: pl */
/* compiled from: AnnotatedImpl */
public class C9180pl implements C7903ml {

    /* renamed from: a */
    public final C6983dm f44064a;

    public C9180pl(C6983dm dmVar) {
        if (dmVar == null) {
            m71014Q(0);
        }
        this.f44064a = dmVar;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m71014Q(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 1 ? 3 : 2)];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public C6983dm getAnnotations() {
        C6983dm dmVar = this.f44064a;
        if (dmVar == null) {
            m71014Q(1);
        }
        return dmVar;
    }
}
