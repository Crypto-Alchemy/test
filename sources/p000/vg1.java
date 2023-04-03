package p000;

import android.content.Context;
import com.facebook.cache.common.C1907b;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.disk.C1914a;
import java.io.File;

/* renamed from: vg1 */
/* compiled from: DiskCacheConfig */
public class vg1 {

    /* renamed from: a */
    public final int f18748a;

    /* renamed from: b */
    public final String f18749b;

    /* renamed from: c */
    public final td6<File> f18750c;

    /* renamed from: d */
    public final long f18751d;

    /* renamed from: e */
    public final long f18752e;

    /* renamed from: f */
    public final long f18753f;

    /* renamed from: g */
    public final wq1 f18754g;

    /* renamed from: h */
    public final CacheErrorLogger f18755h;

    /* renamed from: i */
    public final CacheEventListener f18756i;

    /* renamed from: j */
    public final ih1 f18757j;

    /* renamed from: k */
    public final Context f18758k;

    /* renamed from: l */
    public final boolean f18759l;

    /* renamed from: vg1$a */
    /* compiled from: DiskCacheConfig */
    public class C3482a implements td6<File> {
        public C3482a() {
        }

        /* renamed from: a */
        public File get() {
            au4.m10792g(vg1.this.f18758k);
            return vg1.this.f18758k.getApplicationContext().getCacheDir();
        }
    }

    /* renamed from: vg1$b */
    /* compiled from: DiskCacheConfig */
    public static class C3483b {

        /* renamed from: a */
        public int f18761a;

        /* renamed from: b */
        public String f18762b;

        /* renamed from: c */
        public td6<File> f18763c;

        /* renamed from: d */
        public long f18764d;

        /* renamed from: e */
        public long f18765e;

        /* renamed from: f */
        public long f18766f;

        /* renamed from: g */
        public wq1 f18767g;

        /* renamed from: h */
        public CacheErrorLogger f18768h;

        /* renamed from: i */
        public CacheEventListener f18769i;

        /* renamed from: j */
        public ih1 f18770j;

        /* renamed from: k */
        public boolean f18771k;

        /* renamed from: l */
        public final Context f18772l;

        public /* synthetic */ C3483b(Context context, C3482a aVar) {
            this(context);
        }

        /* renamed from: n */
        public vg1 mo27144n() {
            return new vg1(this);
        }

        public C3483b(Context context) {
            this.f18761a = 1;
            this.f18762b = "image_cache";
            this.f18764d = 41943040;
            this.f18765e = 10485760;
            this.f18766f = 2097152;
            this.f18767g = new C1914a();
            this.f18772l = context;
        }
    }

    public vg1(C3483b bVar) {
        boolean z;
        CacheErrorLogger cacheErrorLogger;
        CacheEventListener cacheEventListener;
        ih1 ih1;
        Context a = bVar.f18772l;
        this.f18758k = a;
        if (bVar.f18763c == null && a == null) {
            z = false;
        } else {
            z = true;
        }
        au4.m10795j(z, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f18763c == null && a != null) {
            td6 unused = bVar.f18763c = new C3482a();
        }
        this.f18748a = bVar.f18761a;
        this.f18749b = (String) au4.m10792g(bVar.f18762b);
        this.f18750c = (td6) au4.m10792g(bVar.f18763c);
        this.f18751d = bVar.f18764d;
        this.f18752e = bVar.f18765e;
        this.f18753f = bVar.f18766f;
        this.f18754g = (wq1) au4.m10792g(bVar.f18767g);
        if (bVar.f18768h == null) {
            cacheErrorLogger = C1907b.m13207b();
        } else {
            cacheErrorLogger = bVar.f18768h;
        }
        this.f18755h = cacheErrorLogger;
        if (bVar.f18769i == null) {
            cacheEventListener = p74.m24722h();
        } else {
            cacheEventListener = bVar.f18769i;
        }
        this.f18756i = cacheEventListener;
        if (bVar.f18770j == null) {
            ih1 = t74.m27482b();
        } else {
            ih1 = bVar.f18770j;
        }
        this.f18757j = ih1;
        this.f18759l = bVar.f18771k;
    }

    /* renamed from: m */
    public static C3483b m28765m(Context context) {
        return new C3483b(context, (C3482a) null);
    }

    /* renamed from: b */
    public String mo27132b() {
        return this.f18749b;
    }

    /* renamed from: c */
    public td6<File> mo27133c() {
        return this.f18750c;
    }

    /* renamed from: d */
    public CacheErrorLogger mo27134d() {
        return this.f18755h;
    }

    /* renamed from: e */
    public CacheEventListener mo27135e() {
        return this.f18756i;
    }

    /* renamed from: f */
    public long mo27136f() {
        return this.f18751d;
    }

    /* renamed from: g */
    public ih1 mo27137g() {
        return this.f18757j;
    }

    /* renamed from: h */
    public wq1 mo27138h() {
        return this.f18754g;
    }

    /* renamed from: i */
    public boolean mo27139i() {
        return this.f18759l;
    }

    /* renamed from: j */
    public long mo27140j() {
        return this.f18752e;
    }

    /* renamed from: k */
    public long mo27141k() {
        return this.f18753f;
    }

    /* renamed from: l */
    public int mo27142l() {
        return this.f18748a;
    }
}
