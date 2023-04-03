package p000;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: it1 */
/* compiled from: EventBus */
public class it1 implements oc6, wy4 {

    /* renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<lt1<Object>, Executor>> f30117a = new HashMap();

    /* renamed from: b */
    public Queue<dt1<?>> f30118b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f30119c;

    public it1(Executor executor) {
        this.f30119c = executor;
    }

    /* renamed from: a */
    public synchronized <T> void mo43918a(Class<T> cls, Executor executor, lt1<? super T> lt1) {
        eu4.m44086b(cls);
        eu4.m44086b(lt1);
        eu4.m44086b(executor);
        if (!this.f30117a.containsKey(cls)) {
            this.f30117a.put(cls, new ConcurrentHashMap());
        }
        this.f30117a.get(cls).put(lt1, executor);
    }

    /* renamed from: b */
    public <T> void mo43919b(Class<T> cls, lt1<? super T> lt1) {
        mo43918a(cls, this.f30119c, lt1);
    }

    /* renamed from: d */
    public void mo43920d() {
        Queue<dt1<?>> queue;
        synchronized (this) {
            queue = this.f30118b;
            if (queue != null) {
                this.f30118b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (dt1<?> g : queue) {
                mo43922g(g);
            }
        }
    }

    /* renamed from: e */
    public final synchronized Set<Map.Entry<lt1<Object>, Executor>> mo43921e(dt1<?> dt1) {
        Set<Map.Entry<lt1<Object>, Executor>> set;
        Map map = this.f30117a.get(dt1.mo42046b());
        if (map == null) {
            set = Collections.emptySet();
        } else {
            set = map.entrySet();
        }
        return set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new p000.ht1(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = mo43921e(r5).iterator();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43922g(p000.dt1<?> r5) {
        /*
            r4 = this;
            p000.eu4.m44086b(r5)
            monitor-enter(r4)
            java.util.Queue<dt1<?>> r0 = r4.f30118b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.mo43921e(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            ht1 r3 = new ht1
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.it1.mo43922g(dt1):void");
    }
}
