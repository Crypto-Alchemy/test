package p000;

/* renamed from: a66 */
/* compiled from: SourceElement */
public interface a66 {

    /* renamed from: a */
    public static final a66 f36360a = new C6795a();

    /* renamed from: a66$a */
    /* compiled from: SourceElement */
    public static class C6795a implements a66 {
        /* renamed from: d */
        public static /* synthetic */ void m55379d(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"}));
        }

        /* renamed from: b */
        public b66 mo50072b() {
            b66 b66 = b66.f36690a;
            if (b66 == null) {
                m55379d(0);
            }
            return b66;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    /* renamed from: b */
    b66 mo50072b();
}
