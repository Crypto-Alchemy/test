package p000;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: he5 */
/* compiled from: RequestFutureTarget */
public class he5<R> implements he2<R>, le5<R> {

    /* renamed from: B */
    public static final C2465a f12823B = new C2465a();

    /* renamed from: A */
    public GlideException f12824A;

    /* renamed from: a */
    public final int f12825a;

    /* renamed from: d */
    public final int f12826d;

    /* renamed from: e */
    public final boolean f12827e;

    /* renamed from: g */
    public final C2465a f12828g;

    /* renamed from: k */
    public R f12829k;

    /* renamed from: r */
    public ae5 f12830r;

    /* renamed from: s */
    public boolean f12831s;

    /* renamed from: x */
    public boolean f12832x;

    /* renamed from: y */
    public boolean f12833y;

    /* renamed from: he5$a */
    /* compiled from: RequestFutureTarget */
    public static class C2465a {
        /* renamed from: a */
        public void mo21103a(Object obj) {
            obj.notifyAll();
        }

        /* renamed from: b */
        public void mo21104b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public he5(int i, int i2) {
        this(i, i2, true, f12823B);
    }

    /* renamed from: a */
    public void mo21090a(x36 x36) {
        x36.mo12666e(this.f12825a, this.f12826d);
    }

    /* renamed from: b */
    public void mo19468b() {
    }

    /* renamed from: c */
    public void mo20968c() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            return r3
        L_0x000a:
            r0 = 1
            r2.f12831s = r0     // Catch:{ all -> 0x0021 }
            he5$a r1 = r2.f12828g     // Catch:{ all -> 0x0021 }
            r1.mo21103a(r2)     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r3 == 0) goto L_0x001a
            ae5 r3 = r2.f12830r     // Catch:{ all -> 0x0021 }
            r2.f12830r = r1     // Catch:{ all -> 0x0021 }
            r1 = r3
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0020
            r1.clear()
        L_0x0020:
            return r0
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.he5.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public synchronized boolean mo21092d(GlideException glideException, Object obj, pl6<R> pl6, boolean z) {
        this.f12833y = true;
        this.f12824A = glideException;
        this.f12828g.mo21103a(this);
        return false;
    }

    /* renamed from: e */
    public synchronized void mo19469e(R r, ww6<? super R> ww6) {
    }

    /* renamed from: f */
    public void mo19470f(Drawable drawable) {
    }

    /* renamed from: g */
    public synchronized ae5 mo21093g() {
        return this.f12830r;
    }

    public R get() throws InterruptedException, ExecutionException {
        try {
            return mo21101o((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: h */
    public void mo19471h(Drawable drawable) {
    }

    /* renamed from: i */
    public synchronized boolean mo21096i(R r, Object obj, pl6<R> pl6, DataSource dataSource, boolean z) {
        this.f12832x = true;
        this.f12829k = r;
        this.f12828g.mo21103a(this);
        return false;
    }

    public synchronized boolean isCancelled() {
        return this.f12831s;
    }

    public synchronized boolean isDone() {
        boolean z;
        if (this.f12831s || this.f12832x || this.f12833y) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    public synchronized void mo21099j(ae5 ae5) {
        this.f12830r = ae5;
    }

    /* renamed from: k */
    public void mo21100k(x36 x36) {
    }

    /* renamed from: m */
    public synchronized void mo19472m(Drawable drawable) {
    }

    /* renamed from: n */
    public void mo19473n() {
    }

    /* renamed from: o */
    public final synchronized R mo21101o(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f12827e && !isDone()) {
            p67.m24673a();
        }
        if (this.f12831s) {
            throw new CancellationException();
        } else if (this.f12833y) {
            throw new ExecutionException(this.f12824A);
        } else if (this.f12832x) {
            return this.f12829k;
        } else {
            if (l == null) {
                this.f12828g.mo21104b(this, 0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f12828g.mo21104b(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f12833y) {
                throw new ExecutionException(this.f12824A);
            } else if (this.f12831s) {
                throw new CancellationException();
            } else if (this.f12832x) {
                return this.f12829k;
            } else {
                throw new TimeoutException();
            }
        }
    }

    public String toString() {
        ae5 ae5;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            ae5 = null;
            if (this.f12831s) {
                str = "CANCELLED";
            } else if (this.f12833y) {
                str = "FAILURE";
            } else if (this.f12832x) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                ae5 = this.f12830r;
            }
        }
        if (ae5 != null) {
            return str2 + str + ", request=[" + ae5 + "]]";
        }
        return str2 + str + "]";
    }

    public he5(int i, int i2, boolean z, C2465a aVar) {
        this.f12825a = i;
        this.f12826d = i2;
        this.f12827e = z;
        this.f12828g = aVar;
    }

    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo21101o(Long.valueOf(timeUnit.toMillis(j)));
    }
}
