package p000;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: t40 */
/* compiled from: BufferedDiskCache */
public class t40 {

    /* renamed from: h */
    public static final Class<?> f17889h = t40.class;

    /* renamed from: a */
    public final n02 f17890a;

    /* renamed from: b */
    public final qs4 f17891b;

    /* renamed from: c */
    public final ts4 f17892c;

    /* renamed from: d */
    public final Executor f17893d;

    /* renamed from: e */
    public final Executor f17894e;

    /* renamed from: f */
    public final x76 f17895f = x76.m29921b();

    /* renamed from: g */
    public final kq2 f17896g;

    /* renamed from: t40$a */
    /* compiled from: BufferedDiskCache */
    public class C3325a implements Callable<gp1> {

        /* renamed from: a */
        public final /* synthetic */ Object f17897a;

        /* renamed from: d */
        public final /* synthetic */ AtomicBoolean f17898d;

        /* renamed from: e */
        public final /* synthetic */ f80 f17899e;

        public C3325a(Object obj, AtomicBoolean atomicBoolean, f80 f80) {
            this.f17897a = obj;
            this.f17898d = atomicBoolean;
            this.f17899e = f80;
        }

        /* renamed from: a */
        public gp1 call() throws Exception {
            nh0 v;
            Object e = kc2.m20630e(this.f17897a, (String) null);
            try {
                if (!this.f17898d.get()) {
                    gp1 a = t40.this.f17895f.mo27689a(this.f17899e);
                    if (a != null) {
                        oy1.m24428o(t40.f17889h, "Found image for %s in staging area", this.f17899e.mo11960a());
                        t40.this.f17896g.mo22473a(this.f17899e);
                    } else {
                        oy1.m24428o(t40.f17889h, "Did not find image for %s in staging area", this.f17899e.mo11960a());
                        t40.this.f17896g.mo22475c(this.f17899e);
                        try {
                            PooledByteBuffer e2 = t40.this.mo26039m(this.f17899e);
                            if (e2 == null) {
                                kc2.m20631f(e);
                                return null;
                            }
                            v = nh0.m23181v(e2);
                            gp1 gp1 = new gp1((nh0<PooledByteBuffer>) v);
                            nh0.m23178h(v);
                            a = gp1;
                        } catch (Exception unused) {
                            kc2.m20631f(e);
                            return null;
                        } catch (Throwable th) {
                            nh0.m23178h(v);
                            throw th;
                        }
                    }
                    if (!Thread.interrupted()) {
                        kc2.m20631f(e);
                        return a;
                    }
                    oy1.m24427n(t40.f17889h, "Host thread was interrupted, decreasing reference count");
                    a.close();
                    throw new InterruptedException();
                }
                throw new CancellationException();
            } catch (Throwable th2) {
                kc2.m20631f(e);
                throw th2;
            }
        }
    }

    /* renamed from: t40$b */
    /* compiled from: BufferedDiskCache */
    public class C3326b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f17901a;

        /* renamed from: d */
        public final /* synthetic */ f80 f17902d;

        /* renamed from: e */
        public final /* synthetic */ gp1 f17903e;

        public C3326b(Object obj, f80 f80, gp1 gp1) {
            this.f17901a = obj;
            this.f17902d = f80;
            this.f17903e = gp1;
        }

        public void run() {
            Object e = kc2.m20630e(this.f17901a, (String) null);
            try {
                t40.this.mo26041o(this.f17902d, this.f17903e);
                t40.this.f17895f.mo27693f(this.f17902d, this.f17903e);
                gp1.m18285c(this.f17903e);
                kc2.m20631f(e);
            } catch (Throwable th) {
                t40.this.f17895f.mo27693f(this.f17902d, this.f17903e);
                gp1.m18285c(this.f17903e);
                kc2.m20631f(e);
                throw th;
            }
        }
    }

    /* renamed from: t40$c */
    /* compiled from: BufferedDiskCache */
    public class C3327c implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ Object f17905a;

        /* renamed from: d */
        public final /* synthetic */ f80 f17906d;

        public C3327c(Object obj, f80 f80) {
            this.f17905a = obj;
            this.f17906d = f80;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            Object e = kc2.m20630e(this.f17905a, (String) null);
            try {
                t40.this.f17895f.mo27692e(this.f17906d);
                t40.this.f17890a.mo13132b(this.f17906d);
                kc2.m20631f(e);
                return null;
            } catch (Throwable th) {
                kc2.m20631f(e);
                throw th;
            }
        }
    }

    /* renamed from: t40$d */
    /* compiled from: BufferedDiskCache */
    public class C3328d implements wn7 {

        /* renamed from: a */
        public final /* synthetic */ gp1 f17908a;

        public C3328d(gp1 gp1) {
            this.f17908a = gp1;
        }

        /* renamed from: a */
        public void mo26047a(OutputStream outputStream) throws IOException {
            InputStream l = this.f17908a.mo20752l();
            au4.m10792g(l);
            t40.this.f17892c.mo26535a(l, outputStream);
        }
    }

    public t40(n02 n02, qs4 qs4, ts4 ts4, Executor executor, Executor executor2, kq2 kq2) {
        this.f17890a = n02;
        this.f17891b = qs4;
        this.f17892c = ts4;
        this.f17893d = executor;
        this.f17894e = executor2;
        this.f17896g = kq2;
    }

    /* renamed from: h */
    public void mo26034h(f80 f80) {
        au4.m10792g(f80);
        this.f17890a.mo13133c(f80);
    }

    /* renamed from: i */
    public final sl6<gp1> mo26035i(f80 f80, gp1 gp1) {
        oy1.m24428o(f17889h, "Found image for %s in staging area", f80.mo11960a());
        this.f17896g.mo22473a(f80);
        return sl6.m26959h(gp1);
    }

    /* renamed from: j */
    public sl6<gp1> mo26036j(f80 f80, AtomicBoolean atomicBoolean) {
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("BufferedDiskCache#get");
            }
            gp1 a = this.f17895f.mo27689a(f80);
            if (a != null) {
                return mo26035i(f80, a);
            }
            sl6<gp1> k = mo26037k(f80, atomicBoolean);
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
            return k;
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    /* renamed from: k */
    public final sl6<gp1> mo26037k(f80 f80, AtomicBoolean atomicBoolean) {
        try {
            return sl6.m26955b(new C3325a(kc2.m20629d("BufferedDiskCache_getAsync"), atomicBoolean, f80), this.f17893d);
        } catch (Exception e) {
            oy1.m24436w(f17889h, e, "Failed to schedule disk-cache read for %s", f80.mo11960a());
            return sl6.m26958g(e);
        }
    }

    /* renamed from: l */
    public void mo26038l(f80 f80, gp1 gp1) {
        gp1 b;
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("BufferedDiskCache#put");
            }
            au4.m10792g(f80);
            au4.m10787b(Boolean.valueOf(gp1.m18283C(gp1)));
            this.f17895f.mo27691d(f80, gp1);
            b = gp1.m18284b(gp1);
            this.f17894e.execute(new C3326b(kc2.m20629d("BufferedDiskCache_putAsync"), f80, b));
        } catch (Exception e) {
            oy1.m24436w(f17889h, e, "Failed to schedule disk-cache write for %s", f80.mo11960a());
            this.f17895f.mo27693f(f80, gp1);
            gp1.m18285c(b);
        } catch (Throwable th) {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
            throw th;
        }
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    /* renamed from: m */
    public final PooledByteBuffer mo26039m(f80 f80) throws IOException {
        InputStream a;
        try {
            Class<?> cls = f17889h;
            oy1.m24428o(cls, "Disk cache read for %s", f80.mo11960a());
            l10 a2 = this.f17890a.mo13131a(f80);
            if (a2 == null) {
                oy1.m24428o(cls, "Disk cache miss for %s", f80.mo11960a());
                this.f17896g.mo22486n(f80);
                return null;
            }
            oy1.m24428o(cls, "Found entry in disk cache for %s", f80.mo11960a());
            this.f17896g.mo22481i(f80);
            a = a2.mo22620a();
            PooledByteBuffer b = this.f17891b.mo19480b(a, (int) a2.size());
            a.close();
            oy1.m24428o(cls, "Successful read from disk cache for %s", f80.mo11960a());
            return b;
        } catch (IOException e) {
            oy1.m24436w(f17889h, e, "Exception reading from cache for %s", f80.mo11960a());
            this.f17896g.mo22483k(f80);
            throw e;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: n */
    public sl6<Void> mo26040n(f80 f80) {
        au4.m10792g(f80);
        this.f17895f.mo27692e(f80);
        try {
            return sl6.m26955b(new C3327c(kc2.m20629d("BufferedDiskCache_remove"), f80), this.f17894e);
        } catch (Exception e) {
            oy1.m24436w(f17889h, e, "Failed to schedule disk-cache remove for %s", f80.mo11960a());
            return sl6.m26958g(e);
        }
    }

    /* renamed from: o */
    public final void mo26041o(f80 f80, gp1 gp1) {
        Class<?> cls = f17889h;
        oy1.m24428o(cls, "About to write to disk-cache for key %s", f80.mo11960a());
        try {
            this.f17890a.mo13134d(f80, new C3328d(gp1));
            this.f17896g.mo22477e(f80);
            oy1.m24428o(cls, "Successful disk-cache write for key %s", f80.mo11960a());
        } catch (IOException e) {
            oy1.m24436w(f17889h, e, "Failed to write to disk-cache for key %s", f80.mo11960a());
        }
    }
}
