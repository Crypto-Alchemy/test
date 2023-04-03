package p000;

import android.graphics.Bitmap;
import android.util.SparseArray;

/* renamed from: jc2 */
/* compiled from: FrescoFrameCache */
public class jc2 implements f20 {

    /* renamed from: e */
    public static final Class<?> f13573e = jc2.class;

    /* renamed from: a */
    public final C2610jk f13574a;

    /* renamed from: b */
    public final boolean f13575b;

    /* renamed from: c */
    public final SparseArray<nh0<kh0>> f13576c = new SparseArray<>();

    /* renamed from: d */
    public nh0<kh0> f13577d;

    public jc2(C2610jk jkVar, boolean z) {
        this.f13574a = jkVar;
        this.f13575b = z;
    }

    /* renamed from: g */
    public static nh0<Bitmap> m20072g(nh0<kh0> nh0) {
        qh0 qh0;
        try {
            if (nh0.m23180p(nh0) && (nh0.mo23684j() instanceof qh0) && (qh0 = (qh0) nh0.mo23684j()) != null) {
                return qh0.mo25108g();
            }
            nh0.m23178h(nh0);
            return null;
        } finally {
            nh0.m23178h(nh0);
        }
    }

    /* renamed from: h */
    public static nh0<kh0> m20073h(nh0<Bitmap> nh0) {
        return nh0.m23181v(new qh0(nh0, ns2.f15676d, 0));
    }

    /* renamed from: a */
    public synchronized void mo19585a(int i, nh0<Bitmap> nh0, int i2) {
        au4.m10792g(nh0);
        nh0<kh0> nh02 = null;
        try {
            nh02 = m20073h(nh0);
            if (nh02 != null) {
                nh0<kh0> a = this.f13574a.mo21940a(i, nh02);
                if (nh0.m23180p(a)) {
                    nh0.m23178h(this.f13576c.get(i));
                    this.f13576c.put(i, a);
                    oy1.m24429p(f13573e, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i), this.f13576c);
                }
                nh0.m23178h(nh02);
            }
        } finally {
            nh0.m23178h(nh02);
        }
    }

    /* renamed from: b */
    public synchronized nh0<Bitmap> mo19586b(int i) {
        return m20072g(nh0.m23176f(this.f13577d));
    }

    /* renamed from: c */
    public synchronized nh0<Bitmap> mo19587c(int i, int i2, int i3) {
        if (!this.f13575b) {
            return null;
        }
        return m20072g(this.f13574a.mo21943d());
    }

    public synchronized void clear() {
        nh0.m23178h(this.f13577d);
        this.f13577d = null;
        for (int i = 0; i < this.f13576c.size(); i++) {
            nh0.m23178h(this.f13576c.valueAt(i));
        }
        this.f13576c.clear();
    }

    /* renamed from: d */
    public synchronized void mo19589d(int i, nh0<Bitmap> nh0, int i2) {
        au4.m10792g(nh0);
        mo21806i(i);
        nh0 nh02 = null;
        try {
            nh02 = m20073h(nh0);
            if (nh02 != null) {
                nh0.m23178h(this.f13577d);
                this.f13577d = this.f13574a.mo21940a(i, nh02);
            }
        } finally {
            nh0.m23178h(nh02);
        }
    }

    /* renamed from: e */
    public synchronized boolean mo19590e(int i) {
        return this.f13574a.mo21941b(i);
    }

    /* renamed from: f */
    public synchronized nh0<Bitmap> mo19591f(int i) {
        return m20072g(this.f13574a.mo21942c(i));
    }

    /* renamed from: i */
    public final synchronized void mo21806i(int i) {
        nh0 nh0 = this.f13576c.get(i);
        if (nh0 != null) {
            this.f13576c.delete(i);
            nh0.m23178h(nh0);
            oy1.m24429p(f13573e, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), this.f13576c);
        }
    }
}
