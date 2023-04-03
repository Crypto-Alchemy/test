package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: we9 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class we9 {

    /* renamed from: a */
    public final ConcurrentHashMap<xc9, List<Throwable>> f35315a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue<Throwable> f35316b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> mo49189a(Throwable th, boolean z) {
        ReferenceQueue<Throwable> referenceQueue = this.f35316b;
        while (true) {
            Reference<? extends Throwable> poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.f35315a.remove(poll);
            referenceQueue = this.f35316b;
        }
        List<Throwable> list = this.f35315a.get(new xc9(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f35315a.putIfAbsent(new xc9(th, this.f35316b), vector);
        if (putIfAbsent == null) {
            return vector;
        }
        return putIfAbsent;
    }
}
