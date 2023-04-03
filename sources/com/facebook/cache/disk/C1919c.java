package com.facebook.cache.disk;

import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.disk.C1916b;
import com.facebook.common.statfs.StatFsHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.cache.disk.c */
/* compiled from: DiskStorageCache */
public class C1919c implements n02, hh1 {

    /* renamed from: r */
    public static final Class<?> f9440r = C1919c.class;

    /* renamed from: s */
    public static final long f9441s = TimeUnit.HOURS.toMillis(2);

    /* renamed from: t */
    public static final long f9442t = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final long f9443a;

    /* renamed from: b */
    public final long f9444b;

    /* renamed from: c */
    public final CountDownLatch f9445c;

    /* renamed from: d */
    public long f9446d;

    /* renamed from: e */
    public final CacheEventListener f9447e;

    /* renamed from: f */
    public final Set<String> f9448f;

    /* renamed from: g */
    public long f9449g;

    /* renamed from: h */
    public final long f9450h;

    /* renamed from: i */
    public final StatFsHelper f9451i;

    /* renamed from: j */
    public final C1916b f9452j;

    /* renamed from: k */
    public final wq1 f9453k;

    /* renamed from: l */
    public final CacheErrorLogger f9454l;

    /* renamed from: m */
    public final boolean f9455m;

    /* renamed from: n */
    public final C1921b f9456n;

    /* renamed from: o */
    public final zg0 f9457o;

    /* renamed from: p */
    public final Object f9458p = new Object();

    /* renamed from: q */
    public boolean f9459q;

    /* renamed from: com.facebook.cache.disk.c$a */
    /* compiled from: DiskStorageCache */
    public class C1920a implements Runnable {
        public C1920a() {
        }

        public void run() {
            synchronized (C1919c.this.f9458p) {
                boolean unused = C1919c.this.mo13139m();
            }
            boolean unused2 = C1919c.this.f9459q = true;
            C1919c.this.f9445c.countDown();
        }
    }

    /* renamed from: com.facebook.cache.disk.c$b */
    /* compiled from: DiskStorageCache */
    public static class C1921b {

        /* renamed from: a */
        public boolean f9461a = false;

        /* renamed from: b */
        public long f9462b = -1;

        /* renamed from: c */
        public long f9463c = -1;

        /* renamed from: a */
        public synchronized long mo13144a() {
            return this.f9463c;
        }

        /* renamed from: b */
        public synchronized long mo13145b() {
            return this.f9462b;
        }

        /* renamed from: c */
        public synchronized void mo13146c(long j, long j2) {
            if (this.f9461a) {
                this.f9462b += j;
                this.f9463c += j2;
            }
        }

        /* renamed from: d */
        public synchronized boolean mo13147d() {
            return this.f9461a;
        }

        /* renamed from: e */
        public synchronized void mo13148e() {
            this.f9461a = false;
            this.f9463c = -1;
            this.f9462b = -1;
        }

        /* renamed from: f */
        public synchronized void mo13149f(long j, long j2) {
            this.f9463c = j2;
            this.f9462b = j;
            this.f9461a = true;
        }
    }

    /* renamed from: com.facebook.cache.disk.c$c */
    /* compiled from: DiskStorageCache */
    public static class C1922c {

        /* renamed from: a */
        public final long f9464a;

        /* renamed from: b */
        public final long f9465b;

        /* renamed from: c */
        public final long f9466c;

        public C1922c(long j, long j2, long j3) {
            this.f9464a = j;
            this.f9465b = j2;
            this.f9466c = j3;
        }
    }

    public C1919c(C1916b bVar, wq1 wq1, C1922c cVar, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, ih1 ih1, Executor executor, boolean z) {
        this.f9443a = cVar.f9465b;
        long j = cVar.f9466c;
        this.f9444b = j;
        this.f9446d = j;
        this.f9451i = StatFsHelper.m13322d();
        this.f9452j = bVar;
        this.f9453k = wq1;
        this.f9449g = -1;
        this.f9447e = cacheEventListener;
        this.f9450h = cVar.f9464a;
        this.f9454l = cacheErrorLogger;
        this.f9456n = new C1921b();
        this.f9457o = fk6.m17050a();
        this.f9455m = z;
        this.f9448f = new HashSet();
        if (ih1 != null) {
            ih1.mo21539a(this);
        }
        if (z) {
            this.f9445c = new CountDownLatch(1);
            executor.execute(new C1920a());
            return;
        }
        this.f9445c = new CountDownLatch(0);
    }

    /* renamed from: a */
    public l10 mo13131a(f80 f80) {
        l10 l10;
        py5 d = py5.m25238a().mo24822d(f80);
        try {
            synchronized (this.f9458p) {
                List<String> b = h80.m18650b(f80);
                int i = 0;
                String str = null;
                l10 = null;
                while (true) {
                    if (i >= b.size()) {
                        break;
                    }
                    str = b.get(i);
                    d.mo24828j(str);
                    l10 = this.f9452j.mo13100e(str, f80);
                    if (l10 != null) {
                        break;
                    }
                    i++;
                }
                if (l10 == null) {
                    this.f9447e.mo13089a(d);
                    this.f9448f.remove(str);
                } else {
                    au4.m10792g(str);
                    this.f9447e.mo13095g(d);
                    this.f9448f.add(str);
                }
            }
            d.mo24820b();
            return l10;
        } catch (IOException e) {
            try {
                this.f9454l.mo13088a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, f9440r, "getResource", e);
                d.mo24826h(e);
                this.f9447e.mo13091c(d);
                return null;
            } finally {
                d.mo24820b();
            }
        }
    }

    /* renamed from: b */
    public void mo13132b(f80 f80) {
        synchronized (this.f9458p) {
            try {
                List<String> b = h80.m18650b(f80);
                for (int i = 0; i < b.size(); i++) {
                    String str = b.get(i);
                    this.f9452j.remove(str);
                    this.f9448f.remove(str);
                }
            } catch (IOException e) {
                CacheErrorLogger cacheErrorLogger = this.f9454l;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.DELETE_FILE;
                Class<?> cls = f9440r;
                cacheErrorLogger.mo13088a(cacheErrorCategory, cls, "delete: " + e.getMessage(), e);
            }
        }
    }

    /* renamed from: c */
    public boolean mo13133c(f80 f80) {
        String str;
        IOException e;
        String str2 = null;
        try {
            synchronized (this.f9458p) {
                try {
                    List<String> b = h80.m18650b(f80);
                    int i = 0;
                    while (i < b.size()) {
                        String str3 = b.get(i);
                        try {
                            if (this.f9452j.mo13097b(str3, f80)) {
                                this.f9448f.add(str3);
                                return true;
                            }
                            i++;
                            str2 = str3;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                throw th;
                            } catch (IOException e2) {
                                e = e2;
                            }
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    str = str2;
                    th = th2;
                    throw th;
                }
            }
        } catch (IOException e3) {
            str = null;
            e = e3;
            py5 h = py5.m25238a().mo24822d(f80).mo24828j(str).mo24826h(e);
            this.f9447e.mo13091c(h);
            h.mo24820b();
            return false;
        }
    }

    /* renamed from: d */
    public l10 mo13134d(f80 f80, wn7 wn7) throws IOException {
        String a;
        C1916b.C1918b o;
        py5 d = py5.m25238a().mo24822d(f80);
        this.f9447e.mo13092d(d);
        synchronized (this.f9458p) {
            a = h80.m18649a(f80);
        }
        d.mo24828j(a);
        try {
            o = mo13141o(a, f80);
            o.mo13123b(wn7, f80);
            l10 i = mo13135i(o, f80, a);
            d.mo24827i(i.size()).mo24824f(this.f9456n.mo13145b());
            this.f9447e.mo13090b(d);
            if (!o.mo13125o()) {
                oy1.m24417d(f9440r, "Failed to delete temp file");
            }
            d.mo24820b();
            return i;
        } catch (IOException e) {
            try {
                d.mo24826h(e);
                this.f9447e.mo13094f(d);
                oy1.m24418e(f9440r, "Failed inserting a file into the cache", e);
                throw e;
            } catch (Throwable th) {
                d.mo24820b();
                throw th;
            }
        } catch (Throwable th2) {
            if (!o.mo13125o()) {
                oy1.m24417d(f9440r, "Failed to delete temp file");
            }
            throw th2;
        }
    }

    /* renamed from: i */
    public final l10 mo13135i(C1916b.C1918b bVar, f80 f80, String str) throws IOException {
        l10 a;
        synchronized (this.f9458p) {
            a = bVar.mo13122a(f80);
            this.f9448f.add(str);
            this.f9456n.mo13146c(a.size(), 1);
        }
        return a;
    }

    /* renamed from: j */
    public final void mo13136j(long j, CacheEventListener.EvictionReason evictionReason) throws IOException {
        long j2 = j;
        try {
            Collection<C1916b.C1917a> k = mo13137k(this.f9452j.mo13101f());
            long b = this.f9456n.mo13145b();
            long j3 = b - j2;
            int i = 0;
            long j4 = 0;
            for (C1916b.C1917a next : k) {
                if (j4 > j3) {
                    break;
                }
                long c = this.f9452j.mo13098c(next);
                this.f9448f.remove(next.getId());
                if (c > 0) {
                    i++;
                    j4 += c;
                    py5 e = py5.m25238a().mo24828j(next.getId()).mo24825g(evictionReason).mo24827i(c).mo24824f(b - j4).mo24823e(j2);
                    this.f9447e.mo13093e(e);
                    e.mo24820b();
                } else {
                    CacheEventListener.EvictionReason evictionReason2 = evictionReason;
                }
            }
            this.f9456n.mo13146c(-j4, (long) (-i));
            this.f9452j.mo13096a();
        } catch (IOException e2) {
            CacheErrorLogger cacheErrorLogger = this.f9454l;
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
            Class<?> cls = f9440r;
            cacheErrorLogger.mo13088a(cacheErrorCategory, cls, "evictAboveSize: " + e2.getMessage(), e2);
            throw e2;
        }
    }

    /* renamed from: k */
    public final Collection<C1916b.C1917a> mo13137k(Collection<C1916b.C1917a> collection) {
        long now = this.f9457o.now() + f9441s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (C1916b.C1917a next : collection) {
            if (next.getTimestamp() > now) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Collections.sort(arrayList2, this.f9453k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: l */
    public final void mo13138l() throws IOException {
        synchronized (this.f9458p) {
            boolean m = mo13139m();
            mo13142p();
            long b = this.f9456n.mo13145b();
            if (b > this.f9446d && !m) {
                this.f9456n.mo13148e();
                mo13139m();
            }
            long j = this.f9446d;
            if (b > j) {
                mo13136j((j * 9) / 10, CacheEventListener.EvictionReason.CACHE_FULL);
            }
        }
    }

    /* renamed from: m */
    public final boolean mo13139m() {
        long now = this.f9457o.now();
        if (this.f9456n.mo13147d()) {
            long j = this.f9449g;
            if (j != -1 && now - j <= f9442t) {
                return false;
            }
        }
        return mo13140n();
    }

    /* renamed from: n */
    public final boolean mo13140n() {
        Set<String> set;
        long j;
        long now = this.f9457o.now();
        long j2 = f9441s + now;
        if (this.f9455m && this.f9448f.isEmpty()) {
            set = this.f9448f;
        } else if (this.f9455m) {
            set = new HashSet<>();
        } else {
            set = null;
        }
        try {
            long j3 = 0;
            long j4 = -1;
            int i = 0;
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            for (C1916b.C1917a next : this.f9452j.mo13101f()) {
                i2++;
                j3 += next.getSize();
                if (next.getTimestamp() > j2) {
                    i3++;
                    i = (int) (((long) i) + next.getSize());
                    j = j2;
                    j4 = Math.max(next.getTimestamp() - now, j4);
                    z = true;
                } else {
                    j = j2;
                    if (this.f9455m) {
                        au4.m10792g(set);
                        set.add(next.getId());
                    }
                }
                j2 = j;
            }
            if (z) {
                this.f9454l.mo13088a(CacheErrorLogger.CacheErrorCategory.READ_INVALID_ENTRY, f9440r, "Future timestamp found in " + i3 + " files , with a total size of " + i + " bytes, and a maximum time delta of " + j4 + "ms", (Throwable) null);
            }
            long j5 = (long) i2;
            if (!(this.f9456n.mo13144a() == j5 && this.f9456n.mo13145b() == j3)) {
                if (this.f9455m && this.f9448f != set) {
                    au4.m10792g(set);
                    this.f9448f.clear();
                    this.f9448f.addAll(set);
                }
                this.f9456n.mo13149f(j3, j5);
            }
            this.f9449g = now;
            return true;
        } catch (IOException e) {
            this.f9454l.mo13088a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, f9440r, "calcFileCacheSize: " + e.getMessage(), e);
            return false;
        }
    }

    /* renamed from: o */
    public final C1916b.C1918b mo13141o(String str, f80 f80) throws IOException {
        mo13138l();
        return this.f9452j.mo13099d(str, f80);
    }

    /* renamed from: p */
    public final void mo13142p() {
        StatFsHelper.StorageType storageType;
        if (this.f9452j.isExternal()) {
            storageType = StatFsHelper.StorageType.EXTERNAL;
        } else {
            storageType = StatFsHelper.StorageType.INTERNAL;
        }
        if (this.f9451i.mo13179f(storageType, this.f9444b - this.f9456n.mo13145b())) {
            this.f9446d = this.f9443a;
        } else {
            this.f9446d = this.f9444b;
        }
    }
}
