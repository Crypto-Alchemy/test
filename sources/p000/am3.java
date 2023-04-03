package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: am3 */
/* compiled from: LruBucketsPoolBackend */
public abstract class am3<T> implements js4<T> {

    /* renamed from: a */
    public final Set<T> f189a = new HashSet();

    /* renamed from: b */
    public final k40<T> f190b = new k40<>();

    /* renamed from: b */
    public final T mo410b(T t) {
        if (t != null) {
            synchronized (this) {
                this.f189a.remove(t);
            }
        }
        return t;
    }

    public T get(int i) {
        return mo410b(this.f190b.mo22178a(i));
    }

    public T pop() {
        return mo410b(this.f190b.mo22183f());
    }

    public void put(T t) {
        boolean add;
        synchronized (this) {
            add = this.f189a.add(t);
        }
        if (add) {
            this.f190b.mo22182e(mo22086a(t), t);
        }
    }
}
