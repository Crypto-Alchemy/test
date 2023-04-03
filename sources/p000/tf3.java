package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: tf3 */
/* compiled from: LazySet */
public class tf3<T> implements ly4<Set<T>> {

    /* renamed from: a */
    public volatile Set<ly4<T>> f34254a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    public volatile Set<T> f34255b = null;

    public tf3(Collection<ly4<T>> collection) {
        this.f34254a.addAll(collection);
    }

    /* renamed from: b */
    public static tf3<?> m52277b(Collection<ly4<?>> collection) {
        return new tf3<>((Set) collection);
    }

    /* renamed from: a */
    public synchronized void mo48100a(ly4<T> ly4) {
        if (this.f34255b == null) {
            this.f34254a.add(ly4);
        } else {
            this.f34255b.add(ly4.get());
        }
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f34255b == null) {
            synchronized (this) {
                if (this.f34255b == null) {
                    this.f34255b = Collections.newSetFromMap(new ConcurrentHashMap());
                    mo48102d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f34255b);
    }

    /* renamed from: d */
    public final synchronized void mo48102d() {
        for (ly4<T> ly4 : this.f34254a) {
            this.f34255b.add(ly4.get());
        }
        this.f34254a = null;
    }
}
