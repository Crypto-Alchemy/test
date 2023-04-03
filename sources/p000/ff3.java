package p000;

/* renamed from: ff3 */
/* compiled from: Lazy */
public class ff3<T> implements ly4<T> {

    /* renamed from: c */
    public static final Object f28853c = new Object();

    /* renamed from: a */
    public volatile Object f28854a = f28853c;

    /* renamed from: b */
    public volatile ly4<T> f28855b;

    public ff3(ly4<T> ly4) {
        this.f28855b = ly4;
    }

    public T get() {
        T t = this.f28854a;
        T t2 = f28853c;
        if (t == t2) {
            synchronized (this) {
                t = this.f28854a;
                if (t == t2) {
                    t = this.f28855b.get();
                    this.f28854a = t;
                    this.f28855b = null;
                }
            }
        }
        return t;
    }
}
