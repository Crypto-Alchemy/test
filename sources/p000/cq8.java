package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: cq8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class cq8 {

    /* renamed from: a */
    public final ConcurrentHashMap<zp8, List<Throwable>> f27890a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue<Throwable> f27891b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> mo41634a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f27891b.poll();
        while (poll != null) {
            this.f27890a.remove(poll);
            poll = this.f27891b.poll();
        }
        List<Throwable> list = this.f27890a.get(new zp8(th, (ReferenceQueue<Throwable>) null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f27890a.putIfAbsent(new zp8(th, this.f27891b), vector);
        if (putIfAbsent == null) {
            return vector;
        }
        return putIfAbsent;
    }
}
