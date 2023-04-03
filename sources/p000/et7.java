package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: et7 */
public final class et7 {

    /* renamed from: a */
    public final ConcurrentHashMap<ct7, List<Throwable>> f28668a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue<Throwable> f28669b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> mo42412a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f28669b.poll();
            if (poll == null) {
                break;
            }
            this.f28668a.remove(poll);
        }
        List<Throwable> list = this.f28668a.get(new ct7(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f28668a.putIfAbsent(new ct7(th, this.f28669b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
