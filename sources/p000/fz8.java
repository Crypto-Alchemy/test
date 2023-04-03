package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: fz8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class fz8 {

    /* renamed from: a */
    public final ConcurrentHashMap<dz8, List<Throwable>> f29040a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue<Throwable> f29041b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> mo42703a(Throwable th, boolean z) {
        ReferenceQueue<Throwable> referenceQueue = this.f29041b;
        while (true) {
            Reference<? extends Throwable> poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.f29040a.remove(poll);
            referenceQueue = this.f29041b;
        }
        List<Throwable> list = this.f29040a.get(new dz8(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f29040a.putIfAbsent(new dz8(th, this.f29041b), vector);
        if (putIfAbsent == null) {
            return vector;
        }
        return putIfAbsent;
    }
}
