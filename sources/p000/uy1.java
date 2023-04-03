package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uy1 */
/* compiled from: FactoryPools */
public final class uy1 {

    /* renamed from: a */
    public static final C3447g<Object> f18606a = new C3441a();

    /* renamed from: uy1$a */
    /* compiled from: FactoryPools */
    public class C3441a implements C3447g<Object> {
        /* renamed from: a */
        public void mo26941a(Object obj) {
        }
    }

    /* renamed from: uy1$b */
    /* compiled from: FactoryPools */
    public class C3442b implements C3444d<List<T>> {
        /* renamed from: b */
        public List<T> mo12529a() {
            return new ArrayList();
        }
    }

    /* renamed from: uy1$c */
    /* compiled from: FactoryPools */
    public class C3443c implements C3447g<List<T>> {
        /* renamed from: b */
        public void mo26941a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: uy1$d */
    /* compiled from: FactoryPools */
    public interface C3444d<T> {
        /* renamed from: a */
        T mo12529a();
    }

    /* renamed from: uy1$e */
    /* compiled from: FactoryPools */
    public static final class C3445e<T> implements ys4<T> {

        /* renamed from: a */
        public final C3444d<T> f18607a;

        /* renamed from: b */
        public final C3447g<T> f18608b;

        /* renamed from: c */
        public final ys4<T> f18609c;

        public C3445e(ys4<T> ys4, C3444d<T> dVar, C3447g<T> gVar) {
            this.f18609c = ys4;
            this.f18607a = dVar;
            this.f18608b = gVar;
        }

        /* renamed from: a */
        public boolean mo11138a(T t) {
            if (t instanceof C3446f) {
                ((C3446f) t).mo12421d().mo18593b(true);
            }
            this.f18608b.mo26941a(t);
            return this.f18609c.mo11138a(t);
        }

        /* renamed from: b */
        public T mo11139b() {
            T b = this.f18609c.mo11139b();
            if (b == null) {
                b = this.f18607a.mo12529a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(b.getClass());
                }
            }
            if (b instanceof C3446f) {
                ((C3446f) b).mo12421d().mo18593b(false);
            }
            return b;
        }
    }

    /* renamed from: uy1$f */
    /* compiled from: FactoryPools */
    public interface C3446f {
        /* renamed from: d */
        d96 mo12421d();
    }

    /* renamed from: uy1$g */
    /* compiled from: FactoryPools */
    public interface C3447g<T> {
        /* renamed from: a */
        void mo26941a(T t);
    }

    /* renamed from: a */
    public static <T extends C3446f> ys4<T> m28523a(ys4<T> ys4, C3444d<T> dVar) {
        return m28524b(ys4, dVar, m28525c());
    }

    /* renamed from: b */
    public static <T> ys4<T> m28524b(ys4<T> ys4, C3444d<T> dVar, C3447g<T> gVar) {
        return new C3445e(ys4, dVar, gVar);
    }

    /* renamed from: c */
    public static <T> C3447g<T> m28525c() {
        return f18606a;
    }

    /* renamed from: d */
    public static <T extends C3446f> ys4<T> m28526d(int i, C3444d<T> dVar) {
        return m28523a(new ct4(i), dVar);
    }

    /* renamed from: e */
    public static <T> ys4<List<T>> m28527e() {
        return m28528f(20);
    }

    /* renamed from: f */
    public static <T> ys4<List<T>> m28528f(int i) {
        return m28524b(new ct4(i), new C3442b(), new C3443c());
    }
}
