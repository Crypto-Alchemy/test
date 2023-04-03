package p000;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: em3 */
/* compiled from: LruCache */
public class em3<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f11264a;

    /* renamed from: b */
    public int f11265b;

    /* renamed from: c */
    public int f11266c;

    /* renamed from: d */
    public int f11267d;

    /* renamed from: e */
    public int f11268e;

    /* renamed from: f */
    public int f11269f;

    /* renamed from: g */
    public int f11270g;

    /* renamed from: h */
    public int f11271h;

    public em3(int i) {
        if (i > 0) {
            this.f11266c = i;
            this.f11264a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public V mo19370a(K k) {
        return null;
    }

    /* renamed from: b */
    public void mo19371b(boolean z, K k, V v, V v2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = mo19370a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f11268e++;
        r1 = r4.f11264a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r4.f11264a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r4.f11265b += mo19375f(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        mo19371b(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        mo19378i(r4.f11266c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo19372c(K r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0054
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f11264a     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0013
            int r5 = r4.f11270g     // Catch:{ all -> 0x0051 }
            int r5 = r5 + 1
            r4.f11270g = r5     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            return r0
        L_0x0013:
            int r0 = r4.f11271h     // Catch:{ all -> 0x0051 }
            int r0 = r0 + 1
            r4.f11271h = r0     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r4.mo19370a(r5)
            if (r0 != 0) goto L_0x0022
            r5 = 0
            return r5
        L_0x0022:
            monitor-enter(r4)
            int r1 = r4.f11268e     // Catch:{ all -> 0x004e }
            int r1 = r1 + 1
            r4.f11268e = r1     // Catch:{ all -> 0x004e }
            java.util.LinkedHashMap<K, V> r1 = r4.f11264a     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0037
            java.util.LinkedHashMap<K, V> r2 = r4.f11264a     // Catch:{ all -> 0x004e }
            r2.put(r5, r1)     // Catch:{ all -> 0x004e }
            goto L_0x0040
        L_0x0037:
            int r2 = r4.f11265b     // Catch:{ all -> 0x004e }
            int r3 = r4.mo19375f(r5, r0)     // Catch:{ all -> 0x004e }
            int r2 = r2 + r3
            r4.f11265b = r2     // Catch:{ all -> 0x004e }
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0048
            r2 = 0
            r4.mo19371b(r2, r5, r0, r1)
            return r1
        L_0x0048:
            int r5 = r4.f11266c
            r4.mo19378i(r5)
            return r0
        L_0x004e:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            throw r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            throw r5
        L_0x0054:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.em3.mo19372c(java.lang.Object):java.lang.Object");
    }

    /* renamed from: d */
    public final V mo19373d(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f11267d++;
            this.f11265b += mo19375f(k, v);
            put = this.f11264a.put(k, v);
            if (put != null) {
                this.f11265b -= mo19375f(k, put);
            }
        }
        if (put != null) {
            mo19371b(false, k, put, v);
        }
        mo19378i(this.f11266c);
        return put;
    }

    /* renamed from: e */
    public final V mo19374e(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.f11264a.remove(k);
                if (remove != null) {
                    this.f11265b -= mo19375f(k, remove);
                }
            }
            if (remove != null) {
                mo19371b(false, k, remove, (V) null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: f */
    public final int mo19375f(K k, V v) {
        int g = mo19376g(k, v);
        if (g >= 0) {
            return g;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: g */
    public int mo19376g(K k, V v) {
        return 1;
    }

    /* renamed from: h */
    public final synchronized Map<K, V> mo19377h() {
        return new LinkedHashMap(this.f11264a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19378i(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f11265b     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.f11264a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f11265b     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.f11265b     // Catch:{ all -> 0x0071 }
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.f11264a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f11264a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<K, V> r2 = r4.f11264a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r2 = r4.f11265b     // Catch:{ all -> 0x0071 }
            int r3 = r4.mo19375f(r1, r0)     // Catch:{ all -> 0x0071 }
            int r2 = r2 - r3
            r4.f11265b = r2     // Catch:{ all -> 0x0071 }
            int r2 = r4.f11269f     // Catch:{ all -> 0x0071 }
            r3 = 1
            int r2 = r2 + r3
            r4.f11269f = r2     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            r2 = 0
            r4.mo19371b(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r5.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.em3.mo19378i(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f11270g;
        int i3 = this.f11271h + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f11266c), Integer.valueOf(this.f11270g), Integer.valueOf(this.f11271h), Integer.valueOf(i)});
    }
}
