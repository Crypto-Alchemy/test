package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: rt0 */
/* compiled from: CopyOnWriteMultiset */
public final class rt0<E> implements Iterable<E> {

    /* renamed from: a */
    public final Object f17367a = new Object();

    /* renamed from: d */
    public final Map<E, Integer> f17368d = new HashMap();

    /* renamed from: e */
    public Set<E> f17369e = Collections.emptySet();

    /* renamed from: g */
    public List<E> f17370g = Collections.emptyList();

    public int count(E e) {
        int i;
        synchronized (this.f17367a) {
            if (this.f17368d.containsKey(e)) {
                i = this.f17368d.get(e).intValue();
            } else {
                i = 0;
            }
        }
        return i;
    }

    /* renamed from: e */
    public void mo25535e(E e) {
        synchronized (this.f17367a) {
            ArrayList arrayList = new ArrayList(this.f17370g);
            arrayList.add(e);
            this.f17370g = Collections.unmodifiableList(arrayList);
            Integer num = this.f17368d.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f17369e);
                hashSet.add(e);
                this.f17369e = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f17368d;
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            map.put(e, Integer.valueOf(i));
        }
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.f17367a) {
            set = this.f17369e;
        }
        return set;
    }

    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f17367a) {
            it = this.f17370g.iterator();
        }
        return it;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25538j(E r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f17367a
            monitor-enter(r0)
            java.util.Map<E, java.lang.Integer> r1 = r4.f17368d     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x000f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x004c }
            java.util.List<E> r3 = r4.f17370g     // Catch:{ all -> 0x004c }
            r2.<init>(r3)     // Catch:{ all -> 0x004c }
            r2.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x004c }
            r4.f17370g = r2     // Catch:{ all -> 0x004c }
            int r2 = r1.intValue()     // Catch:{ all -> 0x004c }
            r3 = 1
            if (r2 != r3) goto L_0x003c
            java.util.Map<E, java.lang.Integer> r1 = r4.f17368d     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x004c }
            java.util.Set<E> r2 = r4.f17369e     // Catch:{ all -> 0x004c }
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ all -> 0x004c }
            r4.f17369e = r5     // Catch:{ all -> 0x004c }
            goto L_0x004a
        L_0x003c:
            java.util.Map<E, java.lang.Integer> r2 = r4.f17368d     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x004c }
            r2.put(r5, r1)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x004c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rt0.mo25538j(java.lang.Object):void");
    }
}
