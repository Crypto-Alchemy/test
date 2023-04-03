package p000;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hg0 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class hg0 {

    /* renamed from: a */
    public final ReferenceQueue f29570a = new ReferenceQueue();

    /* renamed from: b */
    public final Set f29571b = Collections.synchronizedSet(new HashSet());

    /* renamed from: hg0$a */
    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public interface C5897a {
        /* renamed from: a */
        void mo43182a();
    }

    /* renamed from: a */
    public static hg0 m45193a() {
        hg0 hg0 = new hg0();
        hg0.mo43181b(hg0, qa8.f33038a);
        Thread thread = new Thread(new v48(hg0.f29570a, hg0.f29571b), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return hg0;
    }

    /* renamed from: b */
    public C5897a mo43181b(Object obj, Runnable runnable) {
        th8 th8 = new th8(obj, this.f29570a, this.f29571b, runnable, (me8) null);
        this.f29571b.add(th8);
        return th8;
    }
}
