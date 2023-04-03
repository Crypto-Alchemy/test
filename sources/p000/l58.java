package p000;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l58 */
public final class l58 {

    /* renamed from: h */
    public static final ConcurrentHashMap<Uri, l58> f31180h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public static final String[] f31181i = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f31182a;

    /* renamed from: b */
    public final Uri f31183b;

    /* renamed from: c */
    public final ContentObserver f31184c;

    /* renamed from: d */
    public final Object f31185d = new Object();

    /* renamed from: e */
    public volatile Map<String, String> f31186e;

    /* renamed from: f */
    public final Object f31187f = new Object();

    /* renamed from: g */
    public final List<b68> f31188g = new ArrayList();

    public l58(ContentResolver contentResolver, Uri uri) {
        this.f31182a = contentResolver;
        this.f31183b = uri;
        this.f31184c = new s58(this, (Handler) null);
    }

    /* renamed from: a */
    public static l58 m47627a(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap<Uri, l58> concurrentHashMap = f31180h;
        l58 l58 = concurrentHashMap.get(uri);
        if (l58 != null) {
            return l58;
        }
        l58 l582 = new l58(contentResolver, uri);
        l58 putIfAbsent = concurrentHashMap.putIfAbsent(uri, l582);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        l582.f31182a.registerContentObserver(l582.f31183b, false, l582.f31184c);
        return l582;
    }

    /* renamed from: c */
    public final Map<String, String> mo45347c() {
        Map<String, String> e = i68.m45489h("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? mo45349e() : this.f31186e;
        if (e == null) {
            synchronized (this.f31185d) {
                Map<String, String> map = this.f31186e;
                if (map == null) {
                    map = mo45349e();
                    this.f31186e = map;
                }
            }
        }
        return e != null ? e : Collections.emptyMap();
    }

    /* renamed from: d */
    public final void mo45348d() {
        synchronized (this.f31185d) {
            this.f31186e = null;
        }
    }

    /* renamed from: e */
    public final Map<String, String> mo45349e() {
        Cursor query;
        try {
            HashMap hashMap = new HashMap();
            query = this.f31182a.query(this.f31183b, f31181i, (String) null, (String[]) null, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* renamed from: f */
    public final void mo45350f() {
        synchronized (this.f31187f) {
            for (b68 a : this.f31188g) {
                a.mo29465a();
            }
        }
    }
}
