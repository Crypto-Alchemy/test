package p000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p000.nu0;
import p000.ys3;

/* renamed from: fm3 */
/* compiled from: LruCountingMemoryCache */
public class fm3<K, V> implements nu0<K, V>, ys3<K, V> {

    /* renamed from: a */
    public final nu0.C2921b<K> f11924a;

    /* renamed from: b */
    public final mu0<K, nu0.C2920a<K, V>> f11925b;

    /* renamed from: c */
    public final mu0<K, nu0.C2920a<K, V>> f11926c;

    /* renamed from: d */
    public final Map<Bitmap, Object> f11927d = new WeakHashMap();

    /* renamed from: e */
    public final g87<V> f11928e;

    /* renamed from: f */
    public final ys3.C3691a f11929f;

    /* renamed from: g */
    public final td6<zs3> f11930g;

    /* renamed from: h */
    public zs3 f11931h;

    /* renamed from: i */
    public long f11932i;

    /* renamed from: j */
    public final boolean f11933j;

    /* renamed from: k */
    public final boolean f11934k;

    /* renamed from: fm3$a */
    /* compiled from: LruCountingMemoryCache */
    public class C2305a implements g87<nu0.C2920a<K, V>> {

        /* renamed from: a */
        public final /* synthetic */ g87 f11935a;

        public C2305a(g87 g87) {
            this.f11935a = g87;
        }

        /* renamed from: b */
        public int mo19448a(nu0.C2920a<K, V> aVar) {
            if (fm3.this.f11933j) {
                return aVar.f15686g;
            }
            return this.f11935a.mo19448a(aVar.f15681b.mo23684j());
        }
    }

    /* renamed from: fm3$b */
    /* compiled from: LruCountingMemoryCache */
    public class C2306b implements rf5<V> {

        /* renamed from: a */
        public final /* synthetic */ nu0.C2920a f11937a;

        public C2306b(nu0.C2920a aVar) {
            this.f11937a = aVar;
        }

        /* renamed from: a */
        public void mo360a(V v) {
            fm3.this.mo19993x(this.f11937a);
        }
    }

    public fm3(g87<V> g87, ys3.C3691a aVar, td6<zs3> td6, nu0.C2921b<K> bVar, boolean z, boolean z2) {
        this.f11928e = g87;
        this.f11925b = new mu0<>(mo19995z(g87));
        this.f11926c = new mu0<>(mo19995z(g87));
        this.f11929f = aVar;
        this.f11930g = td6;
        this.f11931h = (zs3) au4.m10793h(td6.get(), "mMemoryCacheParamsSupplier returned null");
        this.f11932i = SystemClock.uptimeMillis();
        this.f11924a = bVar;
        this.f11933j = z;
        this.f11934k = z2;
    }

    /* renamed from: r */
    public static <K, V> void m17084r(nu0.C2920a<K, V> aVar) {
        nu0.C2921b<K> bVar;
        if (aVar != null && (bVar = aVar.f15684e) != null) {
            bVar.mo21947a(aVar.f15680a, true);
        }
    }

    /* renamed from: s */
    public static <K, V> void m17085s(nu0.C2920a<K, V> aVar) {
        nu0.C2921b<K> bVar;
        if (aVar != null && (bVar = aVar.f15684e) != null) {
            bVar.mo21947a(aVar.f15680a, false);
        }
    }

    /* renamed from: b */
    public nh0<V> mo19973b(K k, nh0<V> nh0) {
        return mo19976d(k, nh0, this.f11924a);
    }

    /* renamed from: c */
    public void mo19974c(K k) {
        au4.m10792g(k);
        synchronized (this) {
            nu0.C2920a h = this.f11925b.mo23392h(k);
            if (h != null) {
                this.f11925b.mo23391g(k, h);
            }
        }
    }

    public synchronized boolean contains(K k) {
        return this.f11926c.mo23385a(k);
    }

    /* renamed from: d */
    public nh0<V> mo19976d(K k, nh0<V> nh0, nu0.C2921b<K> bVar) {
        nu0.C2920a h;
        nh0<V> nh02;
        nh0 nh03;
        nu0.C2920a<K, V> aVar;
        au4.m10792g(k);
        au4.m10792g(nh0);
        mo19990u();
        synchronized (this) {
            h = this.f11925b.mo23392h(k);
            nu0.C2920a h2 = this.f11926c.mo23392h(k);
            nh02 = null;
            if (h2 != null) {
                mo19984m(h2);
                nh03 = mo19992w(h2);
            } else {
                nh03 = null;
            }
            int a = this.f11928e.mo19448a(nh0.mo23684j());
            if (mo19979h(a)) {
                if (this.f11933j) {
                    aVar = nu0.C2920a.m23466a(k, nh0, a, bVar);
                } else {
                    aVar = nu0.C2920a.m23467b(k, nh0, bVar);
                }
                this.f11926c.mo23391g(k, aVar);
                nh02 = mo19991v(aVar);
            }
        }
        nh0.m23178h(nh03);
        m17085s(h);
        mo19988q();
        return nh02;
    }

    /* renamed from: e */
    public nh0<V> mo19977e(K k) {
        nu0.C2920a h;
        boolean z;
        nh0<V> nh0;
        au4.m10792g(k);
        synchronized (this) {
            h = this.f11925b.mo23392h(k);
            z = true;
            boolean z2 = false;
            if (h != null) {
                nu0.C2920a h2 = this.f11926c.mo23392h(k);
                au4.m10792g(h2);
                if (h2.f15682c == 0) {
                    z2 = true;
                }
                au4.m10794i(z2);
                nh0 = h2.f15681b;
            } else {
                nh0 = null;
                z = false;
            }
        }
        if (z) {
            m17085s(h);
        }
        return nh0;
    }

    public nh0<V> get(K k) {
        nu0.C2920a h;
        nh0<V> nh0;
        au4.m10792g(k);
        synchronized (this) {
            h = this.f11925b.mo23392h(k);
            nu0.C2920a b = this.f11926c.mo23386b(k);
            if (b != null) {
                nh0 = mo19991v(b);
            } else {
                nh0 = null;
            }
        }
        m17085s(h);
        mo19990u();
        mo19988q();
        return nh0;
    }

    /* renamed from: h */
    public final synchronized boolean mo19979h(int i) {
        boolean z;
        z = true;
        if (i > this.f11931h.f20672e || mo19981j() > this.f11931h.f20669b - 1 || mo19982k() > this.f11931h.f20668a - i) {
            z = false;
        }
        return z;
    }

    /* renamed from: i */
    public final synchronized void mo19980i(nu0.C2920a<K, V> aVar) {
        boolean z;
        au4.m10792g(aVar);
        if (aVar.f15682c > 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10794i(z);
        aVar.f15682c--;
    }

    /* renamed from: j */
    public synchronized int mo19981j() {
        return this.f11926c.mo23387c() - this.f11925b.mo23387c();
    }

    /* renamed from: k */
    public synchronized int mo19982k() {
        return this.f11926c.mo23389e() - this.f11925b.mo23389e();
    }

    /* renamed from: l */
    public final synchronized void mo19983l(nu0.C2920a<K, V> aVar) {
        boolean z;
        au4.m10792g(aVar);
        if (!aVar.f15683d) {
            z = true;
        } else {
            z = false;
        }
        au4.m10794i(z);
        aVar.f15682c++;
    }

    /* renamed from: m */
    public final synchronized void mo19984m(nu0.C2920a<K, V> aVar) {
        boolean z;
        au4.m10792g(aVar);
        if (!aVar.f15683d) {
            z = true;
        } else {
            z = false;
        }
        au4.m10794i(z);
        aVar.f15683d = true;
    }

    /* renamed from: n */
    public final synchronized void mo19985n(ArrayList<nu0.C2920a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<nu0.C2920a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                mo19984m(it.next());
            }
        }
    }

    /* renamed from: o */
    public final synchronized boolean mo19986o(nu0.C2920a<K, V> aVar) {
        if (aVar.f15683d || aVar.f15682c != 0) {
            return false;
        }
        this.f11925b.mo23391g(aVar.f15680a, aVar);
        return true;
    }

    /* renamed from: p */
    public final void mo19987p(ArrayList<nu0.C2920a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<nu0.C2920a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                nh0.m23178h(mo19992w(it.next()));
            }
        }
    }

    /* renamed from: q */
    public void mo19988q() {
        ArrayList y;
        synchronized (this) {
            zs3 zs3 = this.f11931h;
            int min = Math.min(zs3.f20671d, zs3.f20669b - mo19981j());
            zs3 zs32 = this.f11931h;
            y = mo19994y(min, Math.min(zs32.f20670c, zs32.f20668a - mo19982k()));
            mo19985n(y);
        }
        mo19987p(y);
        mo19989t(y);
    }

    /* renamed from: t */
    public final void mo19989t(ArrayList<nu0.C2920a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<nu0.C2920a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m17085s(it.next());
            }
        }
    }

    /* renamed from: u */
    public final synchronized void mo19990u() {
        if (this.f11932i + this.f11931h.f20673f <= SystemClock.uptimeMillis()) {
            this.f11932i = SystemClock.uptimeMillis();
            this.f11931h = (zs3) au4.m10793h(this.f11930g.get(), "mMemoryCacheParamsSupplier returned null");
        }
    }

    /* renamed from: v */
    public final synchronized nh0<V> mo19991v(nu0.C2920a<K, V> aVar) {
        mo19983l(aVar);
        return nh0.m23183y(aVar.f15681b.mo23684j(), new C2306b(aVar));
    }

    /* renamed from: w */
    public final synchronized nh0<V> mo19992w(nu0.C2920a<K, V> aVar) {
        nh0<V> nh0;
        au4.m10792g(aVar);
        if (!aVar.f15683d || aVar.f15682c != 0) {
            nh0 = null;
        } else {
            nh0 = aVar.f15681b;
        }
        return nh0;
    }

    /* renamed from: x */
    public final void mo19993x(nu0.C2920a<K, V> aVar) {
        boolean o;
        nh0<V> w;
        au4.m10792g(aVar);
        synchronized (this) {
            mo19980i(aVar);
            o = mo19986o(aVar);
            w = mo19992w(aVar);
        }
        nh0.m23178h(w);
        if (!o) {
            aVar = null;
        }
        m17084r(aVar);
        mo19990u();
        mo19988q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r4.f11934k == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r4.f11925b.mo23393i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        throw new java.lang.IllegalStateException(java.lang.String.format("key is null, but exclusiveEntries count: %d, size: %d", new java.lang.Object[]{java.lang.Integer.valueOf(r4.f11925b.mo23387c()), java.lang.Integer.valueOf(r4.f11925b.mo23389e())}));
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.ArrayList<p000.nu0.C2920a<K, V>> mo19994y(int r5, int r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            int r5 = java.lang.Math.max(r5, r0)     // Catch:{ all -> 0x007c }
            int r6 = java.lang.Math.max(r6, r0)     // Catch:{ all -> 0x007c }
            mu0<K, nu0$a<K, V>> r1 = r4.f11925b     // Catch:{ all -> 0x007c }
            int r1 = r1.mo23387c()     // Catch:{ all -> 0x007c }
            if (r1 > r5) goto L_0x001d
            mu0<K, nu0$a<K, V>> r1 = r4.f11925b     // Catch:{ all -> 0x007c }
            int r1 = r1.mo23389e()     // Catch:{ all -> 0x007c }
            if (r1 > r6) goto L_0x001d
            r5 = 0
            monitor-exit(r4)
            return r5
        L_0x001d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x007c }
            r1.<init>()     // Catch:{ all -> 0x007c }
        L_0x0022:
            mu0<K, nu0$a<K, V>> r2 = r4.f11925b     // Catch:{ all -> 0x007c }
            int r2 = r2.mo23387c()     // Catch:{ all -> 0x007c }
            if (r2 > r5) goto L_0x0032
            mu0<K, nu0$a<K, V>> r2 = r4.f11925b     // Catch:{ all -> 0x007c }
            int r2 = r2.mo23389e()     // Catch:{ all -> 0x007c }
            if (r2 <= r6) goto L_0x0043
        L_0x0032:
            mu0<K, nu0$a<K, V>> r2 = r4.f11925b     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r2.mo23388d()     // Catch:{ all -> 0x007c }
            if (r2 != 0) goto L_0x006d
            boolean r5 = r4.f11934k     // Catch:{ all -> 0x007c }
            if (r5 == 0) goto L_0x0045
            mu0<K, nu0$a<K, V>> r5 = r4.f11925b     // Catch:{ all -> 0x007c }
            r5.mo23393i()     // Catch:{ all -> 0x007c }
        L_0x0043:
            monitor-exit(r4)
            return r1
        L_0x0045:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r6 = "key is null, but exclusiveEntries count: %d, size: %d"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x007c }
            mu0<K, nu0$a<K, V>> r2 = r4.f11925b     // Catch:{ all -> 0x007c }
            int r2 = r2.mo23387c()     // Catch:{ all -> 0x007c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x007c }
            r1[r0] = r2     // Catch:{ all -> 0x007c }
            r0 = 1
            mu0<K, nu0$a<K, V>> r2 = r4.f11925b     // Catch:{ all -> 0x007c }
            int r2 = r2.mo23389e()     // Catch:{ all -> 0x007c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x007c }
            r1[r0] = r2     // Catch:{ all -> 0x007c }
            java.lang.String r6 = java.lang.String.format(r6, r1)     // Catch:{ all -> 0x007c }
            r5.<init>(r6)     // Catch:{ all -> 0x007c }
            throw r5     // Catch:{ all -> 0x007c }
        L_0x006d:
            mu0<K, nu0$a<K, V>> r3 = r4.f11925b     // Catch:{ all -> 0x007c }
            r3.mo23392h(r2)     // Catch:{ all -> 0x007c }
            mu0<K, nu0$a<K, V>> r3 = r4.f11926c     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r3.mo23392h(r2)     // Catch:{ all -> 0x007c }
            r1.add(r2)     // Catch:{ all -> 0x007c }
            goto L_0x0022
        L_0x007c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fm3.mo19994y(int, int):java.util.ArrayList");
    }

    /* renamed from: z */
    public final g87<nu0.C2920a<K, V>> mo19995z(g87<V> g87) {
        return new C2305a(g87);
    }
}
