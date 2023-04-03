package p000;

/* renamed from: ct4 */
/* compiled from: Pools */
public class ct4<T> extends at4<T> {

    /* renamed from: c */
    public final Object f10286c = new Object();

    public ct4(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo11138a(T t) {
        boolean a;
        synchronized (this.f10286c) {
            a = super.mo11138a(t);
        }
        return a;
    }

    /* renamed from: b */
    public T mo11139b() {
        T b;
        synchronized (this.f10286c) {
            b = super.mo11139b();
        }
        return b;
    }
}
