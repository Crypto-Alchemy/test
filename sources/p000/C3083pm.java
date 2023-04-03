package p000;

import android.annotation.SuppressLint;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pm */
/* compiled from: AppBarConfiguration */
public final class C3083pm {

    /* renamed from: a */
    public final Set<Integer> f16540a;

    /* renamed from: b */
    public final li4 f16541b;

    /* renamed from: c */
    public final C3086c f16542c;

    /* renamed from: pm$b */
    /* compiled from: AppBarConfiguration */
    public static final class C3085b {

        /* renamed from: a */
        public final Set<Integer> f16543a = new HashSet();

        /* renamed from: b */
        public li4 f16544b;

        /* renamed from: c */
        public C3086c f16545c;

        public C3085b(int... iArr) {
            for (int valueOf : iArr) {
                this.f16543a.add(Integer.valueOf(valueOf));
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public C3083pm mo24644a() {
            return new C3083pm(this.f16543a, this.f16544b, this.f16545c);
        }
    }

    /* renamed from: pm$c */
    /* compiled from: AppBarConfiguration */
    public interface C3086c {
    }

    /* renamed from: a */
    public li4 mo24642a() {
        return this.f16541b;
    }

    /* renamed from: b */
    public Set<Integer> mo24643b() {
        return this.f16540a;
    }

    public C3083pm(Set<Integer> set, li4 li4, C3086c cVar) {
        this.f16540a = set;
        this.f16541b = li4;
        this.f16542c = cVar;
    }
}
