package p000;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;

/* renamed from: t61 */
/* compiled from: DefaultBitmapFramePreparer */
public class t61 implements h20 {

    /* renamed from: f */
    public static final Class<?> f17957f = t61.class;

    /* renamed from: a */
    public final xo4 f17958a;

    /* renamed from: b */
    public final i20 f17959b;

    /* renamed from: c */
    public final Bitmap.Config f17960c;

    /* renamed from: d */
    public final ExecutorService f17961d;

    /* renamed from: e */
    public final SparseArray<Runnable> f17962e = new SparseArray<>();

    /* renamed from: t61$a */
    /* compiled from: DefaultBitmapFramePreparer */
    public class C3333a implements Runnable {

        /* renamed from: a */
        public final f20 f17963a;

        /* renamed from: d */
        public final C3418uk f17964d;

        /* renamed from: e */
        public final int f17965e;

        /* renamed from: g */
        public final int f17966g;

        public C3333a(C3418uk ukVar, f20 f20, int i, int i2) {
            this.f17964d = ukVar;
            this.f17963a = f20;
            this.f17965e = i;
            this.f17966g = i2;
        }

        /* renamed from: a */
        public final boolean mo26167a(int i, int i2) {
            nh0<Bitmap> nh0;
            int i3 = 2;
            if (i2 == 1) {
                nh0 = this.f17963a.mo19587c(i, this.f17964d.mo26813e(), this.f17964d.mo26810c());
            } else if (i2 != 2) {
                nh0.m23178h((nh0<?>) null);
                return false;
            } else {
                try {
                    nh0 = t61.this.f17958a.mo27852a(this.f17964d.mo26813e(), this.f17964d.mo26810c(), t61.this.f17960c);
                    i3 = -1;
                } catch (RuntimeException e) {
                    oy1.m24434u(t61.f17957f, "Failed to create frame bitmap", e);
                    nh0.m23178h((nh0<?>) null);
                    return false;
                } catch (Throwable th) {
                    nh0.m23178h((nh0<?>) null);
                    throw th;
                }
            }
            boolean b = mo26168b(i, nh0, i2);
            nh0.m23178h(nh0);
            if (b || i3 == -1) {
                return b;
            }
            return mo26167a(i, i3);
        }

        /* renamed from: b */
        public final boolean mo26168b(int i, nh0<Bitmap> nh0, int i2) {
            if (!nh0.m23180p(nh0) || !t61.this.f17959b.mo18794a(i, nh0.mo23684j())) {
                return false;
            }
            oy1.m24428o(t61.f17957f, "Frame %d ready.", Integer.valueOf(this.f17965e));
            synchronized (t61.this.f17962e) {
                this.f17963a.mo19585a(this.f17965e, nh0, i2);
            }
            return true;
        }

        public void run() {
            try {
                if (this.f17963a.mo19590e(this.f17965e)) {
                    oy1.m24428o(t61.f17957f, "Frame %d is cached already.", Integer.valueOf(this.f17965e));
                    synchronized (t61.this.f17962e) {
                        t61.this.f17962e.remove(this.f17966g);
                    }
                    return;
                }
                if (mo26167a(this.f17965e, 1)) {
                    oy1.m24428o(t61.f17957f, "Prepared frame frame %d.", Integer.valueOf(this.f17965e));
                } else {
                    oy1.m24419f(t61.f17957f, "Could not prepare frame %d.", Integer.valueOf(this.f17965e));
                }
                synchronized (t61.this.f17962e) {
                    t61.this.f17962e.remove(this.f17966g);
                }
            } catch (Throwable th) {
                synchronized (t61.this.f17962e) {
                    t61.this.f17962e.remove(this.f17966g);
                    throw th;
                }
            }
        }
    }

    public t61(xo4 xo4, i20 i20, Bitmap.Config config, ExecutorService executorService) {
        this.f17958a = xo4;
        this.f17959b = i20;
        this.f17960c = config;
        this.f17961d = executorService;
    }

    /* renamed from: g */
    public static int m27462g(C3418uk ukVar, int i) {
        return (ukVar.hashCode() * 31) + i;
    }

    /* renamed from: a */
    public boolean mo20926a(f20 f20, C3418uk ukVar, int i) {
        int g = m27462g(ukVar, i);
        synchronized (this.f17962e) {
            if (this.f17962e.get(g) != null) {
                oy1.m24428o(f17957f, "Already scheduled decode job for frame %d", Integer.valueOf(i));
                return true;
            } else if (f20.mo19590e(i)) {
                oy1.m24428o(f17957f, "Frame %d is cached already.", Integer.valueOf(i));
                return true;
            } else {
                C3333a aVar = new C3333a(ukVar, f20, i, g);
                this.f17962e.put(g, aVar);
                this.f17961d.execute(aVar);
                return true;
            }
        }
    }
}
