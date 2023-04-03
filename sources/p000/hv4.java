package p000;

import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: hv4 */
/* compiled from: PriorityTaskManager */
public final class hv4 {

    /* renamed from: a */
    public final Object f13076a = new Object();

    /* renamed from: b */
    public final PriorityQueue<Integer> f13077b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c */
    public int f13078c = Integer.MIN_VALUE;

    /* renamed from: a */
    public void mo21406a(int i) {
        synchronized (this.f13076a) {
            this.f13077b.add(Integer.valueOf(i));
            this.f13078c = Math.max(this.f13078c, i);
        }
    }

    /* renamed from: b */
    public void mo21407b(int i) {
        int i2;
        synchronized (this.f13076a) {
            this.f13077b.remove(Integer.valueOf(i));
            if (this.f13077b.isEmpty()) {
                i2 = Integer.MIN_VALUE;
            } else {
                i2 = ((Integer) w67.m29360j(this.f13077b.peek())).intValue();
            }
            this.f13078c = i2;
            this.f13076a.notifyAll();
        }
    }
}
