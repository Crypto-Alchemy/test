package p000;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* renamed from: v48 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class v48 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReferenceQueue f34831a;

    /* renamed from: d */
    public final /* synthetic */ Set f34832d;

    public /* synthetic */ v48(ReferenceQueue referenceQueue, Set set) {
        this.f34831a = referenceQueue;
        this.f34832d = set;
    }

    public final void run() {
        ReferenceQueue referenceQueue = this.f34831a;
        Set set = this.f34832d;
        while (!set.isEmpty()) {
            try {
                ((th8) referenceQueue.remove()).mo43182a();
            } catch (InterruptedException unused) {
            }
        }
    }
}
