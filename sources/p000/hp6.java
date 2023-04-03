package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: hp6 */
/* compiled from: ThreadLocalBufferManager */
public class hp6 {

    /* renamed from: a */
    public final Object f12991a = new Object();

    /* renamed from: b */
    public final Map<SoftReference<r40>, Boolean> f12992b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ReferenceQueue<r40> f12993c = new ReferenceQueue<>();

    /* renamed from: hp6$a */
    /* compiled from: ThreadLocalBufferManager */
    public static final class C2500a {

        /* renamed from: a */
        public static final hp6 f12994a = new hp6();
    }

    /* renamed from: a */
    public static hp6 m19144a() {
        return C2500a.f12994a;
    }

    /* renamed from: b */
    public final void mo21333b() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f12993c.poll();
            if (softReference != null) {
                this.f12992b.remove(softReference);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public SoftReference<r40> mo21334c(r40 r40) {
        SoftReference<r40> softReference = new SoftReference<>(r40, this.f12993c);
        this.f12992b.put(softReference, Boolean.TRUE);
        mo21333b();
        return softReference;
    }
}
