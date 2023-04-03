package p000;

/* renamed from: ud6 */
/* compiled from: Suppliers */
public class ud6 {

    /* renamed from: a */
    public static final td6<Boolean> f18434a = new C3402b();

    /* renamed from: b */
    public static final td6<Boolean> f18435b = new C3403c();

    /* renamed from: ud6$a */
    /* compiled from: Suppliers */
    public static class C3401a implements td6<T> {

        /* renamed from: a */
        public final /* synthetic */ Object f18436a;

        public C3401a(Object obj) {
            this.f18436a = obj;
        }

        public T get() {
            return this.f18436a;
        }
    }

    /* renamed from: ud6$b */
    /* compiled from: Suppliers */
    public static class C3402b implements td6<Boolean> {
        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: ud6$c */
    /* compiled from: Suppliers */
    public static class C3403c implements td6<Boolean> {
        /* renamed from: a */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public static <T> td6<T> m28154a(T t) {
        return new C3401a(t);
    }
}
