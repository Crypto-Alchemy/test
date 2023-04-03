package p000;

import com.facebook.datasource.AbstractDataSource;
import java.util.List;

/* renamed from: d32 */
/* compiled from: FirstAvailableDataSourceSupplier */
public class d32<T> implements td6<z11<T>> {

    /* renamed from: a */
    public final List<td6<z11<T>>> f10460a;

    /* renamed from: d32$b */
    /* compiled from: FirstAvailableDataSourceSupplier */
    public class C2131b extends AbstractDataSource<T> {

        /* renamed from: i */
        public int f10461i = 0;

        /* renamed from: j */
        public z11<T> f10462j = null;

        /* renamed from: k */
        public z11<T> f10463k = null;

        /* renamed from: d32$b$a */
        /* compiled from: FirstAvailableDataSourceSupplier */
        public class C2132a implements e21<T> {
            public C2132a() {
            }

            /* renamed from: a */
            public void mo11417a(z11<T> z11) {
                C2131b.this.mo13208r(Math.max(C2131b.this.mo13193d(), z11.mo13193d()));
            }

            /* renamed from: b */
            public void mo18427b(z11<T> z11) {
                C2131b.this.mo18421D(z11);
            }

            /* renamed from: c */
            public void mo18428c(z11<T> z11) {
            }

            /* renamed from: d */
            public void mo18429d(z11<T> z11) {
                if (z11.mo13189a()) {
                    C2131b.this.mo18422E(z11);
                } else if (z11.mo13190b()) {
                    C2131b.this.mo18421D(z11);
                }
            }
        }

        public C2131b() {
            if (!mo18424G()) {
                mo13205o(new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        /* renamed from: A */
        public final synchronized z11<T> mo18418A() {
            return this.f10463k;
        }

        /* renamed from: B */
        public final synchronized td6<z11<T>> mo18419B() {
            if (mo13200j() || this.f10461i >= d32.this.f10460a.size()) {
                return null;
            }
            List a = d32.this.f10460a;
            int i = this.f10461i;
            this.f10461i = i + 1;
            return (td6) a.get(i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
            mo18426z(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0017, code lost:
            return;
         */
        /* renamed from: C */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo18420C(p000.z11<T> r2, boolean r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                z11<T> r0 = r1.f10462j     // Catch:{ all -> 0x001a }
                if (r2 != r0) goto L_0x0018
                z11<T> r0 = r1.f10463k     // Catch:{ all -> 0x001a }
                if (r2 != r0) goto L_0x000a
                goto L_0x0018
            L_0x000a:
                if (r0 == 0) goto L_0x0011
                if (r3 == 0) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r0 = 0
                goto L_0x0013
            L_0x0011:
                r1.f10463k = r2     // Catch:{ all -> 0x001a }
            L_0x0013:
                monitor-exit(r1)     // Catch:{ all -> 0x001a }
                r1.mo18426z(r0)
                return
            L_0x0018:
                monitor-exit(r1)     // Catch:{ all -> 0x001a }
                return
            L_0x001a:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x001a }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.d32.C2131b.mo18420C(z11, boolean):void");
        }

        /* renamed from: D */
        public final void mo18421D(z11<T> z11) {
            if (mo18425y(z11)) {
                if (z11 != mo18418A()) {
                    mo18426z(z11);
                }
                if (!mo18424G()) {
                    mo13206p(z11.mo13191c(), z11.getExtras());
                }
            }
        }

        /* renamed from: E */
        public final void mo18422E(z11<T> z11) {
            mo18420C(z11, z11.mo13190b());
            if (z11 == mo18418A()) {
                mo13210t(null, z11.mo13190b(), z11.getExtras());
            }
        }

        /* renamed from: F */
        public final synchronized boolean mo18423F(z11<T> z11) {
            if (mo13200j()) {
                return false;
            }
            this.f10462j = z11;
            return true;
        }

        /* renamed from: G */
        public final boolean mo18424G() {
            z11 z11;
            td6 B = mo18419B();
            if (B != null) {
                z11 = (z11) B.get();
            } else {
                z11 = null;
            }
            if (!mo18423F(z11) || z11 == null) {
                mo18426z(z11);
                return false;
            }
            z11.mo13194e(new C2132a(), y90.m30486a());
            return true;
        }

        /* renamed from: a */
        public synchronized boolean mo13189a() {
            boolean z;
            z11 A = mo18418A();
            if (A == null || !A.mo13189a()) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }

        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                z11<T> z11 = this.f10462j;
                this.f10462j = null;
                z11<T> z112 = this.f10463k;
                this.f10463k = null;
                mo18426z(z112);
                mo18426z(z11);
                return true;
            }
        }

        public synchronized T getResult() {
            T t;
            z11 A = mo18418A();
            if (A != null) {
                t = A.getResult();
            } else {
                t = null;
            }
            return t;
        }

        /* renamed from: y */
        public final synchronized boolean mo18425y(z11<T> z11) {
            if (!mo13200j()) {
                if (z11 == this.f10462j) {
                    this.f10462j = null;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: z */
        public final void mo18426z(z11<T> z11) {
            if (z11 != null) {
                z11.close();
            }
        }
    }

    public d32(List<td6<z11<T>>> list) {
        au4.m10788c(!list.isEmpty(), "List of suppliers is empty!");
        this.f10460a = list;
    }

    /* renamed from: b */
    public static <T> d32<T> m14681b(List<td6<z11<T>>> list) {
        return new d32<>(list);
    }

    /* renamed from: c */
    public z11<T> get() {
        return new C2131b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d32)) {
            return false;
        }
        return hf4.m18860a(this.f10460a, ((d32) obj).f10460a);
    }

    public int hashCode() {
        return this.f10460a.hashCode();
    }

    public String toString() {
        return hf4.m18862c(this).mo21158b("list", this.f10460a).toString();
    }
}
