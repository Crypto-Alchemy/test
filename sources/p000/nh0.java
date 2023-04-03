package p000;

import android.graphics.Bitmap;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: nh0 */
/* compiled from: CloseableReference */
public abstract class nh0<T> implements Cloneable, Closeable {

    /* renamed from: k */
    public static Class<nh0> f15546k = nh0.class;

    /* renamed from: r */
    public static int f15547r = 0;

    /* renamed from: s */
    public static final rf5<Closeable> f15548s = new C2895a();

    /* renamed from: x */
    public static final C2897c f15549x = new C2896b();

    /* renamed from: a */
    public boolean f15550a = false;

    /* renamed from: d */
    public final SharedReference<T> f15551d;

    /* renamed from: e */
    public final C2897c f15552e;

    /* renamed from: g */
    public final Throwable f15553g;

    /* renamed from: nh0$a */
    /* compiled from: CloseableReference */
    public static class C2895a implements rf5<Closeable> {
        /* renamed from: b */
        public void mo360a(Closeable closeable) {
            try {
                rh0.m26190a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: nh0$b */
    /* compiled from: CloseableReference */
    public static class C2896b implements C2897c {
        /* renamed from: a */
        public void mo23688a(SharedReference<Object> sharedReference, Throwable th) {
            String str;
            Object f = sharedReference.mo13174f();
            Class a = nh0.f15546k;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(System.identityHashCode(this));
            objArr[1] = Integer.valueOf(System.identityHashCode(sharedReference));
            if (f == null) {
                str = null;
            } else {
                str = f.getClass().getName();
            }
            objArr[2] = str;
            oy1.m24435v(a, "Finalized without closing: %x %x (type = %s)", objArr);
        }

        /* renamed from: b */
        public boolean mo23689b() {
            return false;
        }
    }

    /* renamed from: nh0$c */
    /* compiled from: CloseableReference */
    public interface C2897c {
        /* renamed from: a */
        void mo23688a(SharedReference<Object> sharedReference, Throwable th);

        /* renamed from: b */
        boolean mo23689b();
    }

    public nh0(SharedReference<T> sharedReference, C2897c cVar, Throwable th) {
        this.f15551d = (SharedReference) au4.m10792g(sharedReference);
        sharedReference.mo13170b();
        this.f15552e = cVar;
        this.f15553g = th;
    }

    /* renamed from: C */
    public static <T> nh0<T> m23172C(T t, rf5<T> rf5, C2897c cVar, Throwable th) {
        if (t == null) {
            return null;
        }
        if ((t instanceof Bitmap) || (t instanceof hl2)) {
            int i = f15547r;
            if (i == 1) {
                return new v12(t, rf5, cVar, th);
            }
            if (i == 2) {
                return new j95(t, rf5, cVar, th);
            }
            if (i == 3) {
                return new q74(t, rf5, cVar, th);
            }
        }
        return new f71(t, rf5, cVar, th);
    }

    /* renamed from: G */
    public static void m23173G(int i) {
        f15547r = i;
    }

    /* renamed from: I */
    public static boolean m23174I() {
        if (f15547r == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static <T> nh0<T> m23176f(nh0<T> nh0) {
        if (nh0 != null) {
            return nh0.mo23683d();
        }
        return null;
    }

    /* renamed from: g */
    public static <T> List<nh0<T>> m23177g(Collection<nh0<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (nh0<T> f : collection) {
            arrayList.add(m23176f(f));
        }
        return arrayList;
    }

    /* renamed from: h */
    public static void m23178h(nh0<?> nh0) {
        if (nh0 != null) {
            nh0.close();
        }
    }

    /* renamed from: i */
    public static void m23179i(Iterable<? extends nh0<?>> iterable) {
        if (iterable != null) {
            for (nh0 h : iterable) {
                m23178h(h);
            }
        }
    }

    /* renamed from: p */
    public static boolean m23180p(nh0<?> nh0) {
        if (nh0 == null || !nh0.mo23686m()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static <T extends Closeable> nh0<T> m23181v(T t) {
        return m23183y(t, f15548s);
    }

    /* renamed from: x */
    public static <T extends Closeable> nh0<T> m23182x(T t, C2897c cVar) {
        Throwable th = null;
        if (t == null) {
            return null;
        }
        rf5<Closeable> rf5 = f15548s;
        if (cVar.mo23689b()) {
            th = new Throwable();
        }
        return m23172C(t, rf5, cVar, th);
    }

    /* renamed from: y */
    public static <T> nh0<T> m23183y(T t, rf5<T> rf5) {
        return m23184z(t, rf5, f15549x);
    }

    /* renamed from: z */
    public static <T> nh0<T> m23184z(T t, rf5<T> rf5, C2897c cVar) {
        Throwable th = null;
        if (t == null) {
            return null;
        }
        if (cVar.mo23689b()) {
            th = new Throwable();
        }
        return m23172C(t, rf5, cVar, th);
    }

    /* renamed from: b */
    public abstract nh0<T> clone();

    public void close() {
        synchronized (this) {
            if (!this.f15550a) {
                this.f15550a = true;
                this.f15551d.mo13172d();
            }
        }
    }

    /* renamed from: d */
    public synchronized nh0<T> mo23683d() {
        if (!mo23686m()) {
            return null;
        }
        return clone();
    }

    /* renamed from: j */
    public synchronized T mo23684j() {
        boolean z;
        if (!this.f15550a) {
            z = true;
        } else {
            z = false;
        }
        au4.m10794i(z);
        return au4.m10792g(this.f15551d.mo13174f());
    }

    /* renamed from: l */
    public int mo23685l() {
        if (mo23686m()) {
            return System.identityHashCode(this.f15551d.mo13174f());
        }
        return 0;
    }

    /* renamed from: m */
    public synchronized boolean mo23686m() {
        return !this.f15550a;
    }

    public nh0(T t, rf5<T> rf5, C2897c cVar, Throwable th) {
        this.f15551d = new SharedReference<>(t, rf5);
        this.f15552e = cVar;
        this.f15553g = th;
    }
}
