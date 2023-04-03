package p000;

import com.facebook.cache.common.C1906a;
import com.facebook.cache.common.CacheEventListener;
import java.io.IOException;

/* renamed from: py5 */
/* compiled from: SettableCacheEvent */
public class py5 implements C1906a {

    /* renamed from: i */
    public static final Object f16677i = new Object();

    /* renamed from: j */
    public static py5 f16678j;

    /* renamed from: k */
    public static int f16679k;

    /* renamed from: a */
    public f80 f16680a;

    /* renamed from: b */
    public String f16681b;

    /* renamed from: c */
    public long f16682c;

    /* renamed from: d */
    public long f16683d;

    /* renamed from: e */
    public long f16684e;

    /* renamed from: f */
    public IOException f16685f;

    /* renamed from: g */
    public CacheEventListener.EvictionReason f16686g;

    /* renamed from: h */
    public py5 f16687h;

    /* renamed from: a */
    public static py5 m25238a() {
        synchronized (f16677i) {
            py5 py5 = f16678j;
            if (py5 == null) {
                return new py5();
            }
            f16678j = py5.f16687h;
            py5.f16687h = null;
            f16679k--;
            return py5;
        }
    }

    /* renamed from: b */
    public void mo24820b() {
        synchronized (f16677i) {
            if (f16679k < 5) {
                mo24821c();
                f16679k++;
                py5 py5 = f16678j;
                if (py5 != null) {
                    this.f16687h = py5;
                }
                f16678j = this;
            }
        }
    }

    /* renamed from: c */
    public final void mo24821c() {
        this.f16680a = null;
        this.f16681b = null;
        this.f16682c = 0;
        this.f16683d = 0;
        this.f16684e = 0;
        this.f16685f = null;
        this.f16686g = null;
    }

    /* renamed from: d */
    public py5 mo24822d(f80 f80) {
        this.f16680a = f80;
        return this;
    }

    /* renamed from: e */
    public py5 mo24823e(long j) {
        this.f16683d = j;
        return this;
    }

    /* renamed from: f */
    public py5 mo24824f(long j) {
        this.f16684e = j;
        return this;
    }

    /* renamed from: g */
    public py5 mo24825g(CacheEventListener.EvictionReason evictionReason) {
        this.f16686g = evictionReason;
        return this;
    }

    /* renamed from: h */
    public py5 mo24826h(IOException iOException) {
        this.f16685f = iOException;
        return this;
    }

    /* renamed from: i */
    public py5 mo24827i(long j) {
        this.f16682c = j;
        return this;
    }

    /* renamed from: j */
    public py5 mo24828j(String str) {
        this.f16681b = str;
        return this;
    }
}
