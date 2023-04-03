package p000;

/* renamed from: bh2 */
/* compiled from: GlideSuppliers */
public final class bh2 {

    /* renamed from: bh2$a */
    /* compiled from: GlideSuppliers */
    public class C1634a implements C1635b<T> {

        /* renamed from: a */
        public volatile T f8166a;

        /* renamed from: b */
        public final /* synthetic */ C1635b f8167b;

        public C1634a(C1635b bVar) {
            this.f8167b = bVar;
        }

        public T get() {
            if (this.f8166a == null) {
                synchronized (this) {
                    if (this.f8166a == null) {
                        this.f8166a = zt4.m31500d(this.f8167b.get());
                    }
                }
            }
            return this.f8166a;
        }
    }

    /* renamed from: bh2$b */
    /* compiled from: GlideSuppliers */
    public interface C1635b<T> {
        T get();
    }

    /* renamed from: a */
    public static <T> C1635b<T> m11409a(C1635b<T> bVar) {
        return new C1634a(bVar);
    }
}
