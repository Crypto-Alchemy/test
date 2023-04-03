package p000;

import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u0017\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0006J1\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\b\u0010\u0012\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0015\u0010\u0006J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR0\u0010\"\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001` 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00028\u00000#j\b\u0012\u0004\u0012\u00028\u0000`$8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R$\u0010+\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n8G@BX\u000e¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010(R\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0016\u0010-\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010/\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010(¨\u00063"}, mo44877d2 = {"Lcm3;", "K", "V", "", "key", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "maxSize", "Lr37;", "j", "f", "", "evicted", "oldValue", "newValue", "c", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "b", "i", "(Ljava/lang/Object;Ljava/lang/Object;)I", "", "toString", "g", "Lck6;", "a", "Lck6;", "monitor", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "keySet", "<set-?>", "I", "h", "()I", "size", "putCount", "createCount", "evictionCount", "hitCount", "missCount", "<init>", "(I)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: cm3 */
/* compiled from: LruCache.kt */
public class cm3<K, V> {

    /* renamed from: a */
    public final ck6 f8470a = bk6.m11432a();

    /* renamed from: b */
    public final HashMap<K, V> f8471b;

    /* renamed from: c */
    public final LinkedHashSet<K> f8472c;

    /* renamed from: d */
    public int f8473d;

    /* renamed from: e */
    public int f8474e;

    /* renamed from: f */
    public int f8475f;

    /* renamed from: g */
    public int f8476g;

    /* renamed from: h */
    public int f8477h;

    /* renamed from: i */
    public int f8478i;

    /* renamed from: j */
    public int f8479j;

    public cm3(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f8474e = i;
            this.f8471b = new HashMap<>(0, 0.75f);
            this.f8472c = new LinkedHashSet<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* renamed from: b */
    public V mo12113b(K k) {
        return null;
    }

    /* renamed from: c */
    public void mo12114c(boolean z, K k, V v, V v2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = mo12113b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r2 = r5.f8470a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5.f8476g++;
        r3 = r5.f8471b.put(r6, r0);
        r5.f8472c.remove(r6);
        r5.f8472c.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r3 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r5.f8471b.put(r6, r3);
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r5.f8473d = mo12119h() + mo12118g(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r3 = p000.r37.f33317a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        mo12114c(false, r6, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        mo12121j(r5.f8474e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        return r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo12115d(K r6) {
        /*
            r5 = this;
            ck6 r0 = r5.f8470a
            monitor-enter(r0)
            java.util.HashMap<K, V> r1 = r5.f8471b     // Catch:{ all -> 0x006c }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x001d
            java.util.LinkedHashSet<K> r2 = r5.f8472c     // Catch:{ all -> 0x006c }
            r2.remove(r6)     // Catch:{ all -> 0x006c }
            java.util.LinkedHashSet<K> r2 = r5.f8472c     // Catch:{ all -> 0x006c }
            r2.add(r6)     // Catch:{ all -> 0x006c }
            int r6 = r5.f8478i     // Catch:{ all -> 0x006c }
            int r6 = r6 + 1
            r5.f8478i = r6     // Catch:{ all -> 0x006c }
            monitor-exit(r0)
            return r1
        L_0x001d:
            int r2 = r5.f8479j     // Catch:{ all -> 0x006c }
            int r2 = r2 + 1
            r5.f8479j = r2     // Catch:{ all -> 0x006c }
            monitor-exit(r0)
            java.lang.Object r0 = r5.mo12113b(r6)
            if (r0 != 0) goto L_0x002c
            r6 = 0
            return r6
        L_0x002c:
            ck6 r2 = r5.f8470a
            monitor-enter(r2)
            int r3 = r5.f8476g     // Catch:{ all -> 0x0069 }
            int r3 = r3 + 1
            r5.f8476g = r3     // Catch:{ all -> 0x0069 }
            java.util.HashMap<K, V> r3 = r5.f8471b     // Catch:{ all -> 0x0069 }
            java.lang.Object r3 = r3.put(r6, r0)     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashSet<K> r4 = r5.f8472c     // Catch:{ all -> 0x0069 }
            r4.remove(r6)     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashSet<K> r4 = r5.f8472c     // Catch:{ all -> 0x0069 }
            r4.add(r6)     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x004e
            java.util.HashMap<K, V> r1 = r5.f8471b     // Catch:{ all -> 0x0069 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0069 }
            r1 = r3
            goto L_0x0059
        L_0x004e:
            int r3 = r5.mo12119h()     // Catch:{ all -> 0x0069 }
            int r4 = r5.mo12118g(r6, r0)     // Catch:{ all -> 0x0069 }
            int r3 = r3 + r4
            r5.f8473d = r3     // Catch:{ all -> 0x0069 }
        L_0x0059:
            r37 r3 = p000.r37.f33317a     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)
            if (r1 == 0) goto L_0x0063
            r2 = 0
            r5.mo12114c(r2, r6, r0, r1)
            return r1
        L_0x0063:
            int r6 = r5.f8474e
            r5.mo12121j(r6)
            return r0
        L_0x0069:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        L_0x006c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cm3.mo12115d(java.lang.Object):java.lang.Object");
    }

    /* renamed from: e */
    public final V mo12116e(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw null;
        }
        synchronized (this.f8470a) {
            this.f8475f++;
            this.f8473d = mo12119h() + mo12118g(k, v);
            put = this.f8471b.put(k, v);
            if (put != null) {
                this.f8473d = mo12119h() - mo12118g(k, put);
            }
            if (this.f8472c.contains(k)) {
                this.f8472c.remove(k);
            }
            this.f8472c.add(k);
        }
        if (put != null) {
            mo12114c(false, k, put, v);
        }
        mo12121j(this.f8474e);
        return put;
    }

    /* renamed from: f */
    public final V mo12117f(K k) {
        V remove;
        k.getClass();
        synchronized (this.f8470a) {
            remove = this.f8471b.remove(k);
            this.f8472c.remove(k);
            if (remove != null) {
                this.f8473d = mo12119h() - mo12118g(k, remove);
            }
            r37 r37 = r37.f33317a;
        }
        if (remove != null) {
            mo12114c(false, k, remove, (V) null);
        }
        return remove;
    }

    /* renamed from: g */
    public final int mo12118g(K k, V v) {
        boolean z;
        int i = mo12120i(k, v);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return i;
        }
        throw new IllegalStateException(("Negative size: " + k + '=' + v).toString());
    }

    /* renamed from: h */
    public final int mo12119h() {
        int i;
        synchronized (this.f8470a) {
            i = this.f8473d;
        }
        return i;
    }

    /* renamed from: i */
    public int mo12120i(K k, V v) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12121j(int r8) {
        /*
            r7 = this;
        L_0x0000:
            ck6 r0 = r7.f8470a
            monitor-enter(r0)
            int r1 = r7.mo12119h()     // Catch:{ all -> 0x0091 }
            if (r1 < 0) goto L_0x0089
            java.util.HashMap<K, V> r1 = r7.f8471b     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x0017
            int r1 = r7.mo12119h()     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x0089
        L_0x0017:
            java.util.HashMap<K, V> r1 = r7.f8471b     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            java.util.LinkedHashSet<K> r2 = r7.f8472c     // Catch:{ all -> 0x0091 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r1 != r2) goto L_0x0089
            int r1 = r7.mo12119h()     // Catch:{ all -> 0x0091 }
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L_0x0074
            java.util.HashMap<K, V> r1 = r7.f8471b     // Catch:{ all -> 0x0091 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x0074
            java.util.LinkedHashSet<K> r1 = r7.f8472c     // Catch:{ all -> 0x0091 }
            java.lang.Object r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47328Y(r1)     // Catch:{ all -> 0x0091 }
            java.util.HashMap<K, V> r4 = r7.f8471b     // Catch:{ all -> 0x0091 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x006c
            java.util.HashMap<K, V> r5 = r7.f8471b     // Catch:{ all -> 0x0091 }
            java.util.Map r5 = p000.t07.m52025d(r5)     // Catch:{ all -> 0x0091 }
            r5.remove(r1)     // Catch:{ all -> 0x0091 }
            java.util.LinkedHashSet<K> r5 = r7.f8472c     // Catch:{ all -> 0x0091 }
            java.util.Collection r5 = p000.t07.m52022a(r5)     // Catch:{ all -> 0x0091 }
            r5.remove(r1)     // Catch:{ all -> 0x0091 }
            int r5 = r7.mo12119h()     // Catch:{ all -> 0x0091 }
            p000.vx2.m53588d(r1)     // Catch:{ all -> 0x0091 }
            p000.vx2.m53588d(r4)     // Catch:{ all -> 0x0091 }
            int r6 = r7.mo12118g(r1, r4)     // Catch:{ all -> 0x0091 }
            int r5 = r5 - r6
            r7.f8473d = r5     // Catch:{ all -> 0x0091 }
            int r5 = r7.f8477h     // Catch:{ all -> 0x0091 }
            int r5 = r5 + r2
            r7.f8477h = r5     // Catch:{ all -> 0x0091 }
            goto L_0x0076
        L_0x006c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch:{ all -> 0x0091 }
            throw r8     // Catch:{ all -> 0x0091 }
        L_0x0074:
            r1 = r3
            r4 = r1
        L_0x0076:
            r37 r5 = p000.r37.f33317a     // Catch:{ all -> 0x0091 }
            monitor-exit(r0)
            if (r1 != 0) goto L_0x007e
            if (r4 != 0) goto L_0x007e
            return
        L_0x007e:
            p000.vx2.m53588d(r1)
            p000.vx2.m53588d(r4)
            r7.mo12114c(r2, r1, r4, r3)
            goto L_0x0000
        L_0x0089:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch:{ all -> 0x0091 }
            throw r8     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cm3.mo12121j(int):void");
    }

    public String toString() {
        int i;
        String str;
        synchronized (this.f8470a) {
            int i2 = this.f8478i;
            int i3 = this.f8479j + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
            str = "LruCache[maxSize=" + this.f8474e + ",hits=" + this.f8478i + ",misses=" + this.f8479j + ",hitRate=" + i + "%]";
        }
        return str;
    }
}
