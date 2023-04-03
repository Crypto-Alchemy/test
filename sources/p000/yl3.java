package p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: yl3 */
/* compiled from: LruBitmapPool */
public class yl3 implements t20 {

    /* renamed from: k */
    public static final Bitmap.Config f20277k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final gm3 f20278a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f20279b;

    /* renamed from: c */
    public final long f20280c;

    /* renamed from: d */
    public final C3684a f20281d;

    /* renamed from: e */
    public long f20282e;

    /* renamed from: f */
    public long f20283f;

    /* renamed from: g */
    public int f20284g;

    /* renamed from: h */
    public int f20285h;

    /* renamed from: i */
    public int f20286i;

    /* renamed from: j */
    public int f20287j;

    /* renamed from: yl3$a */
    /* compiled from: LruBitmapPool */
    public interface C3684a {
        /* renamed from: a */
        void mo28152a(Bitmap bitmap);

        /* renamed from: b */
        void mo28153b(Bitmap bitmap);
    }

    /* renamed from: yl3$b */
    /* compiled from: LruBitmapPool */
    public static final class C3685b implements C3684a {
        /* renamed from: a */
        public void mo28152a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo28153b(Bitmap bitmap) {
        }
    }

    public yl3(long j, gm3 gm3, Set<Bitmap.Config> set) {
        this.f20280c = j;
        this.f20282e = j;
        this.f20278a = gm3;
        this.f20279b = set;
        this.f20281d = new C3685b();
    }

    @TargetApi(26)
    /* renamed from: f */
    public static void m30674f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    public static Bitmap m30675g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f20277k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @TargetApi(26)
    /* renamed from: k */
    public static Set<Bitmap.Config> m30676k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    public static gm3 m30677l() {
        return new v36();
    }

    @TargetApi(19)
    /* renamed from: o */
    public static void m30678o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: p */
    public static void m30679p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m30678o(bitmap);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo26023a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
        }
        if (i >= 40 || i >= 20) {
            mo26024b();
        } else if (i >= 20 || i == 15) {
            mo28151q(mo28150n() / 2);
        }
    }

    /* renamed from: b */
    public void mo26024b() {
        mo28151q(0);
    }

    /* renamed from: c */
    public synchronized void mo25118c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f20278a.mo20657e(bitmap)) <= this.f20282e) {
                        if (this.f20279b.contains(bitmap.getConfig())) {
                            int e = this.f20278a.mo20657e(bitmap);
                            this.f20278a.mo20655c(bitmap);
                            this.f20281d.mo28153b(bitmap);
                            this.f20286i++;
                            this.f20283f += (long) e;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Put bitmap in pool=");
                                sb.append(this.f20278a.mo20653a(bitmap));
                            }
                            mo28146h();
                            mo28148j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(this.f20278a.mo20653a(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f20279b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: d */
    public Bitmap mo26025d(int i, int i2, Bitmap.Config config) {
        Bitmap m = mo28149m(i, i2, config);
        if (m == null) {
            return m30675g(i, i2, config);
        }
        m.eraseColor(0);
        return m;
    }

    /* renamed from: e */
    public Bitmap mo26026e(int i, int i2, Bitmap.Config config) {
        Bitmap m = mo28149m(i, i2, config);
        if (m == null) {
            return m30675g(i, i2, config);
        }
        return m;
    }

    /* renamed from: h */
    public final void mo28146h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            mo28147i();
        }
    }

    /* renamed from: i */
    public final void mo28147i() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f20284g);
        sb.append(", misses=");
        sb.append(this.f20285h);
        sb.append(", puts=");
        sb.append(this.f20286i);
        sb.append(", evictions=");
        sb.append(this.f20287j);
        sb.append(", currentSize=");
        sb.append(this.f20283f);
        sb.append(", maxSize=");
        sb.append(this.f20282e);
        sb.append("\nStrategy=");
        sb.append(this.f20278a);
    }

    /* renamed from: j */
    public final void mo28148j() {
        mo28151q(this.f20282e);
    }

    /* renamed from: m */
    public final synchronized Bitmap mo28149m(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap d;
        m30674f(config);
        gm3 gm3 = this.f20278a;
        if (config != null) {
            config2 = config;
        } else {
            config2 = f20277k;
        }
        d = gm3.mo20656d(i, i2, config2);
        if (d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f20278a.mo20654b(i, i2, config));
            }
            this.f20285h++;
        } else {
            this.f20284g++;
            this.f20283f -= (long) this.f20278a.mo20657e(d);
            this.f20281d.mo28152a(d);
            m30679p(d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f20278a.mo20654b(i, i2, config));
        }
        mo28146h();
        return d;
    }

    /* renamed from: n */
    public long mo28150n() {
        return this.f20282e;
    }

    /* renamed from: q */
    public final synchronized void mo28151q(long j) {
        while (this.f20283f > j) {
            Bitmap removeLast = this.f20278a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    mo28147i();
                }
                this.f20283f = 0;
                return;
            }
            this.f20281d.mo28152a(removeLast);
            this.f20283f -= (long) this.f20278a.mo20657e(removeLast);
            this.f20287j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f20278a.mo20653a(removeLast));
            }
            mo28146h();
            removeLast.recycle();
        }
    }

    public yl3(long j) {
        this(j, m30677l(), m30676k());
    }
}
