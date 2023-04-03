package p000;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import p000.hg0;

/* renamed from: th8 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class th8 extends PhantomReference implements hg0.C5897a {

    /* renamed from: a */
    public final Set f34267a;

    /* renamed from: b */
    public final Runnable f34268b;

    public /* synthetic */ th8(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, me8 me8) {
        super(obj, referenceQueue);
        this.f34267a = set;
        this.f34268b = runnable;
    }

    /* renamed from: a */
    public final void mo43182a() {
        if (this.f34267a.remove(this)) {
            clear();
            this.f34268b.run();
        }
    }
}
