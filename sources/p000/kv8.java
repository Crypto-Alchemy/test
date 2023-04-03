package p000;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kv8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class kv8 implements yv8 {

    /* renamed from: g */
    public static final Map<Uri, kv8> f31105g = new C2781lq();

    /* renamed from: h */
    public static final String[] f31106h = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f31107a;

    /* renamed from: b */
    public final Uri f31108b;

    /* renamed from: c */
    public final ContentObserver f31109c;

    /* renamed from: d */
    public final Object f31110d = new Object();

    /* renamed from: e */
    public volatile Map<String, String> f31111e;

    /* renamed from: f */
    public final List<nv8> f31112f = new ArrayList();

    public kv8(ContentResolver contentResolver, Uri uri) {
        tu8 tu8 = new tu8(this, (Handler) null);
        this.f31109c = tu8;
        contentResolver.getClass();
        uri.getClass();
        this.f31107a = contentResolver;
        this.f31108b = uri;
        contentResolver.registerContentObserver(uri, false, tu8);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.kv8 m47557b(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            java.lang.Class<kv8> r0 = p000.kv8.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, kv8> r1 = f31105g     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            kv8 r2 = (p000.kv8) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            kv8 r3 = new kv8     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kv8.m47557b(android.content.ContentResolver, android.net.Uri):kv8");
    }

    /* renamed from: e */
    public static synchronized void m47558e() {
        synchronized (kv8.class) {
            for (kv8 next : f31105g.values()) {
                next.f31107a.unregisterContentObserver(next.f31109c);
            }
            f31105g.clear();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo43014a(String str) {
        return mo45303c().get(str);
    }

    /* renamed from: c */
    public final Map<String, String> mo45303c() {
        Map<String, String> map;
        Map<String, String> map2 = this.f31111e;
        if (map2 == null) {
            synchronized (this.f31110d) {
                map2 = this.f31111e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) tv8.m52529a(new pu8(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                    this.f31111e = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    /* renamed from: d */
    public final void mo45304d() {
        synchronized (this.f31110d) {
            this.f31111e = null;
            lx8.m47974c();
        }
        synchronized (this) {
            for (nv8 zza : this.f31112f) {
                zza.zza();
            }
        }
    }

    /* renamed from: f */
    public final /* synthetic */ Map mo45305f() {
        Map map;
        Cursor query = this.f31107a.query(this.f31108b, f31106h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new C2781lq(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }
}
