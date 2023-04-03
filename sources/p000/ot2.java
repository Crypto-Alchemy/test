package p000;

import com.facebook.datasource.AbstractDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ot2 */
/* compiled from: IncreasingQualityDataSourceSupplier */
public class ot2<T> implements td6<z11<T>> {

    /* renamed from: a */
    public final List<td6<z11<T>>> f16066a;

    /* renamed from: b */
    public final boolean f16067b;

    /* renamed from: ot2$a */
    /* compiled from: IncreasingQualityDataSourceSupplier */
    public class C2993a extends AbstractDataSource<T> {

        /* renamed from: i */
        public ArrayList<z11<T>> f16068i;

        /* renamed from: j */
        public int f16069j;

        /* renamed from: k */
        public int f16070k;

        /* renamed from: l */
        public AtomicInteger f16071l;

        /* renamed from: m */
        public Throwable f16072m;

        /* renamed from: n */
        public Map<String, Object> f16073n;

        /* renamed from: ot2$a$a */
        /* compiled from: IncreasingQualityDataSourceSupplier */
        public class C2994a implements e21<T> {

            /* renamed from: a */
            public int f16075a;

            public C2994a(int i) {
                this.f16075a = i;
            }

            /* renamed from: a */
            public void mo11417a(z11<T> z11) {
                if (this.f16075a == 0) {
                    C2993a.this.mo13208r(z11.mo13193d());
                }
            }

            /* renamed from: b */
            public void mo18427b(z11<T> z11) {
                C2993a.this.mo24111F(this.f16075a, z11);
            }

            /* renamed from: c */
            public void mo18428c(z11<T> z11) {
            }

            /* renamed from: d */
            public void mo18429d(z11<T> z11) {
                if (z11.mo13189a()) {
                    C2993a.this.mo24112G(this.f16075a, z11);
                } else if (z11.mo13190b()) {
                    C2993a.this.mo24111F(this.f16075a, z11);
                }
            }
        }

        public C2993a() {
            if (!ot2.this.f16067b) {
                mo24115z();
            }
        }

        /* renamed from: A */
        public final synchronized z11<T> mo24106A(int i) {
            z11<T> z11;
            ArrayList<z11<T>> arrayList = this.f16068i;
            z11 = null;
            if (arrayList != null && i < arrayList.size()) {
                z11 = this.f16068i.set(i, (Object) null);
            }
            return z11;
        }

        /* renamed from: B */
        public final synchronized z11<T> mo24107B(int i) {
            z11<T> z11;
            ArrayList<z11<T>> arrayList = this.f16068i;
            if (arrayList == null || i >= arrayList.size()) {
                z11 = null;
            } else {
                z11 = this.f16068i.get(i);
            }
            return z11;
        }

        /* renamed from: C */
        public final synchronized z11<T> mo24108C() {
            return mo24107B(this.f16069j);
        }

        /* renamed from: D */
        public final void mo24109D() {
            Throwable th;
            if (this.f16071l.incrementAndGet() == this.f16070k && (th = this.f16072m) != null) {
                mo13206p(th, this.f16073n);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
            if (r0 <= r3) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
            mo24114y(mo24106A(r0));
            r0 = r0 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
            return;
         */
        /* renamed from: E */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo24110E(int r3, p000.z11<T> r4, boolean r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f16069j     // Catch:{ all -> 0x002f }
                z11 r1 = r2.mo24107B(r3)     // Catch:{ all -> 0x002f }
                if (r4 != r1) goto L_0x002d
                int r4 = r2.f16069j     // Catch:{ all -> 0x002f }
                if (r3 != r4) goto L_0x000e
                goto L_0x002d
            L_0x000e:
                z11 r4 = r2.mo24108C()     // Catch:{ all -> 0x002f }
                if (r4 == 0) goto L_0x001d
                if (r5 == 0) goto L_0x001b
                int r4 = r2.f16069j     // Catch:{ all -> 0x002f }
                if (r3 >= r4) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r3 = r0
                goto L_0x001f
            L_0x001d:
                r2.f16069j = r3     // Catch:{ all -> 0x002f }
            L_0x001f:
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
            L_0x0020:
                if (r0 <= r3) goto L_0x002c
                z11 r4 = r2.mo24106A(r0)
                r2.mo24114y(r4)
                int r0 = r0 + -1
                goto L_0x0020
            L_0x002c:
                return
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                return
            L_0x002f:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ot2.C2993a.mo24110E(int, z11, boolean):void");
        }

        /* renamed from: F */
        public final void mo24111F(int i, z11<T> z11) {
            mo24114y(mo24113H(i, z11));
            if (i == 0) {
                this.f16072m = z11.mo13191c();
                this.f16073n = z11.getExtras();
            }
            mo24109D();
        }

        /* renamed from: G */
        public final void mo24112G(int i, z11<T> z11) {
            boolean z;
            mo24110E(i, z11, z11.mo13190b());
            if (z11 == mo24108C()) {
                if (i != 0 || !z11.mo13190b()) {
                    z = false;
                } else {
                    z = true;
                }
                mo13210t(null, z, z11.getExtras());
            }
            mo24109D();
        }

        /* renamed from: H */
        public final synchronized z11<T> mo24113H(int i, z11<T> z11) {
            if (z11 == mo24108C()) {
                return null;
            }
            if (z11 != mo24107B(i)) {
                return z11;
            }
            return mo24106A(i);
        }

        /* renamed from: a */
        public synchronized boolean mo13189a() {
            boolean z;
            if (ot2.this.f16067b) {
                mo24115z();
            }
            z11 C = mo24108C();
            if (C == null || !C.mo13189a()) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r1 >= r0.size()) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            mo24114y(r0.get(r1));
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean close() {
            /*
                r3 = this;
                ot2 r0 = p000.ot2.this
                boolean r0 = r0.f16067b
                if (r0 == 0) goto L_0x000b
                r3.mo24115z()
            L_0x000b:
                monitor-enter(r3)
                boolean r0 = super.close()     // Catch:{ all -> 0x0031 }
                r1 = 0
                if (r0 != 0) goto L_0x0015
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                return r1
            L_0x0015:
                java.util.ArrayList<z11<T>> r0 = r3.f16068i     // Catch:{ all -> 0x0031 }
                r2 = 0
                r3.f16068i = r2     // Catch:{ all -> 0x0031 }
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                if (r0 == 0) goto L_0x002f
            L_0x001d:
                int r2 = r0.size()
                if (r1 >= r2) goto L_0x002f
                java.lang.Object r2 = r0.get(r1)
                z11 r2 = (p000.z11) r2
                r3.mo24114y(r2)
                int r1 = r1 + 1
                goto L_0x001d
            L_0x002f:
                r0 = 1
                return r0
            L_0x0031:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ot2.C2993a.close():boolean");
        }

        public synchronized T getResult() {
            T t;
            if (ot2.this.f16067b) {
                mo24115z();
            }
            z11 C = mo24108C();
            if (C != null) {
                t = C.getResult();
            } else {
                t = null;
            }
            return t;
        }

        /* renamed from: y */
        public final void mo24114y(z11<T> z11) {
            if (z11 != null) {
                z11.close();
            }
        }

        /* renamed from: z */
        public final void mo24115z() {
            if (this.f16071l == null) {
                synchronized (this) {
                    if (this.f16071l == null) {
                        int i = 0;
                        this.f16071l = new AtomicInteger(0);
                        int size = ot2.this.f16066a.size();
                        this.f16070k = size;
                        this.f16069j = size;
                        this.f16068i = new ArrayList<>(size);
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            z11 z11 = (z11) ((td6) ot2.this.f16066a.get(i)).get();
                            this.f16068i.add(z11);
                            z11.mo13194e(new C2994a(i), y90.m30486a());
                            if (z11.mo13189a()) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    public ot2(List<td6<z11<T>>> list, boolean z) {
        au4.m10788c(!list.isEmpty(), "List of suppliers is empty!");
        this.f16066a = list;
        this.f16067b = z;
    }

    /* renamed from: c */
    public static <T> ot2<T> m24042c(List<td6<z11<T>>> list, boolean z) {
        return new ot2<>(list, z);
    }

    /* renamed from: d */
    public z11<T> get() {
        return new C2993a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ot2)) {
            return false;
        }
        return hf4.m18860a(this.f16066a, ((ot2) obj).f16066a);
    }

    public int hashCode() {
        return this.f16066a.hashCode();
    }

    public String toString() {
        return hf4.m18862c(this).mo21158b("list", this.f16066a).toString();
    }
}
