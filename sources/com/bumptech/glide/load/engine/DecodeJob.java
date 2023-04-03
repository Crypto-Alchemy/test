package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C1718c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C1735a;
import com.bumptech.glide.load.engine.C1756c;
import com.bumptech.glide.load.engine.C1759e;
import com.bumptech.glide.load.resource.bitmap.C1797a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.uy1;

public class DecodeJob<R> implements C1756c.C1757a, Runnable, Comparable<DecodeJob<?>>, uy1.C3446f {

    /* renamed from: A */
    public Priority f8734A;

    /* renamed from: B */
    public eq1 f8735B;

    /* renamed from: C */
    public int f8736C;

    /* renamed from: H */
    public int f8737H;

    /* renamed from: I */
    public xg1 f8738I;

    /* renamed from: L */
    public xi4 f8739L;

    /* renamed from: M */
    public C1743b<R> f8740M;

    /* renamed from: P */
    public int f8741P;

    /* renamed from: Q */
    public Stage f8742Q;

    /* renamed from: U */
    public RunReason f8743U;

    /* renamed from: X */
    public long f8744X;

    /* renamed from: Y */
    public boolean f8745Y;

    /* renamed from: Z */
    public Object f8746Z;

    /* renamed from: a */
    public final C1758d<R> f8747a = new C1758d<>();

    /* renamed from: b1 */
    public Object f8748b1;

    /* renamed from: d */
    public final List<Throwable> f8749d = new ArrayList();

    /* renamed from: e */
    public final d96 f8750e = d96.m14869a();

    /* renamed from: e0 */
    public Thread f8751e0;

    /* renamed from: e1 */
    public DataSource f8752e1;

    /* renamed from: g */
    public final C1746e f8753g;

    /* renamed from: k */
    public final ys4<DecodeJob<?>> f8754k;

    /* renamed from: k0 */
    public z93 f8755k0;

    /* renamed from: o1 */
    public r11<?> f8756o1;

    /* renamed from: p1 */
    public volatile C1756c f8757p1;

    /* renamed from: q1 */
    public volatile boolean f8758q1;

    /* renamed from: r */
    public final C1745d<?> f8759r = new C1745d<>();

    /* renamed from: r1 */
    public volatile boolean f8760r1;

    /* renamed from: s */
    public final C1747f f8761s = new C1747f();

    /* renamed from: s1 */
    public boolean f8762s1;

    /* renamed from: v0 */
    public z93 f8763v0;

    /* renamed from: x */
    public C1718c f8764x;

    /* renamed from: y */
    public z93 f8765y;

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$a */
    public static /* synthetic */ class C1742a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8768a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f8769b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f8770c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.EncodeStrategy[] r0 = com.bumptech.glide.load.EncodeStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8770c = r0
                r1 = 1
                com.bumptech.glide.load.EncodeStrategy r2 = com.bumptech.glide.load.EncodeStrategy.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8770c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.EncodeStrategy r3 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.engine.DecodeJob$Stage[] r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f8769b = r2
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f8769b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f8769b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f8769b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f8769b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.engine.DecodeJob$RunReason[] r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f8768a = r3
                com.bumptech.glide.load.engine.DecodeJob$RunReason r4 = com.bumptech.glide.load.engine.DecodeJob.RunReason.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f8768a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.engine.DecodeJob$RunReason r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f8768a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = com.bumptech.glide.load.engine.DecodeJob.RunReason.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.C1742a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface C1743b<R> {
        /* renamed from: a */
        void mo12440a(bf5<R> bf5, DataSource dataSource, boolean z);

        /* renamed from: b */
        void mo12441b(GlideException glideException);

        /* renamed from: c */
        void mo12442c(DecodeJob<?> decodeJob);
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C1744c<Z> implements C1759e.C1760a<Z> {

        /* renamed from: a */
        public final DataSource f8771a;

        public C1744c(DataSource dataSource) {
            this.f8771a = dataSource;
        }

        /* renamed from: a */
        public bf5<Z> mo12443a(bf5<Z> bf5) {
            return DecodeJob.this.mo12411D(this.f8771a, bf5);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C1745d<Z> {

        /* renamed from: a */
        public z93 f8773a;

        /* renamed from: b */
        public jf5<Z> f8774b;

        /* renamed from: c */
        public fk3<Z> f8775c;

        /* renamed from: a */
        public void mo12444a() {
            this.f8773a = null;
            this.f8774b = null;
            this.f8775c = null;
        }

        /* renamed from: b */
        public void mo12445b(C1746e eVar, xi4 xi4) {
            ch2.m11868a("DecodeJob.encode");
            try {
                eVar.mo12448a().mo19244b(this.f8773a, new l11(this.f8774b, this.f8775c, xi4));
            } finally {
                this.f8775c.mo19950g();
                ch2.m11872e();
            }
        }

        /* renamed from: c */
        public boolean mo12446c() {
            if (this.f8775c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public <X> void mo12447d(z93 z93, jf5<X> jf5, fk3<X> fk3) {
            this.f8773a = z93;
            this.f8774b = jf5;
            this.f8775c = fk3;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface C1746e {
        /* renamed from: a */
        tg1 mo12448a();
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C1747f {

        /* renamed from: a */
        public boolean f8776a;

        /* renamed from: b */
        public boolean f8777b;

        /* renamed from: c */
        public boolean f8778c;

        /* renamed from: a */
        public final boolean mo12449a(boolean z) {
            if ((this.f8778c || z || this.f8777b) && this.f8776a) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public synchronized boolean mo12450b() {
            this.f8777b = true;
            return mo12449a(false);
        }

        /* renamed from: c */
        public synchronized boolean mo12451c() {
            this.f8778c = true;
            return mo12449a(false);
        }

        /* renamed from: d */
        public synchronized boolean mo12452d(boolean z) {
            this.f8776a = true;
            return mo12449a(z);
        }

        /* renamed from: e */
        public synchronized void mo12453e() {
            this.f8777b = false;
            this.f8776a = false;
            this.f8778c = false;
        }
    }

    public DecodeJob(C1746e eVar, ys4<DecodeJob<?>> ys4) {
        this.f8753g = eVar;
        this.f8754k = ys4;
    }

    /* renamed from: B */
    public final void mo12409B() {
        if (this.f8761s.mo12450b()) {
            mo12413F();
        }
    }

    /* renamed from: C */
    public final void mo12410C() {
        if (this.f8761s.mo12451c()) {
            mo12413F();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: df5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: k11} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: df5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: df5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> p000.bf5<Z> mo12411D(com.bumptech.glide.load.DataSource r12, p000.bf5<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.DataSource r0 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.engine.d<R> r0 = r11.f8747a
            mw6 r0 = r0.mo12506s(r8)
            com.bumptech.glide.c r2 = r11.f8764x
            int r3 = r11.f8736C
            int r4 = r11.f8737H
            bf5 r2 = r0.mo33a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.mo11634a()
        L_0x002b:
            com.bumptech.glide.load.engine.d<R> r13 = r11.f8747a
            boolean r13 = r13.mo12510w(r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.engine.d<R> r13 = r11.f8747a
            jf5 r1 = r13.mo12501n(r0)
            xi4 r13 = r11.f8739L
            com.bumptech.glide.load.EncodeStrategy r13 = r1.mo11956b(r13)
            goto L_0x0042
        L_0x0040:
            com.bumptech.glide.load.EncodeStrategy r13 = com.bumptech.glide.load.EncodeStrategy.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.engine.d<R> r1 = r11.f8747a
            z93 r2 = r11.f8755k0
            boolean r1 = r1.mo12512y(r2)
            r2 = 1
            r1 = r1 ^ r2
            xg1 r3 = r11.f8738I
            boolean r12 = r3.mo27732d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.engine.DecodeJob.C1742a.f8770c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            df5 r12 = new df5
            com.bumptech.glide.load.engine.d<R> r13 = r11.f8747a
            oq r2 = r13.mo12489b()
            z93 r3 = r11.f8755k0
            z93 r4 = r11.f8765y
            int r5 = r11.f8736C
            int r6 = r11.f8737H
            xi4 r9 = r11.f8739L
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            k11 r12 = new k11
            z93 r13 = r11.f8755k0
            z93 r1 = r11.f8765y
            r12.<init>(r13, r1)
        L_0x009b:
            fk3 r0 = p000.fk3.m17041e(r0)
            com.bumptech.glide.load.engine.DecodeJob$d<?> r13 = r11.f8759r
            r13.mo12447d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.mo12411D(com.bumptech.glide.load.DataSource, bf5):bf5");
    }

    /* renamed from: E */
    public void mo12412E(boolean z) {
        if (this.f8761s.mo12452d(z)) {
            mo12413F();
        }
    }

    /* renamed from: F */
    public final void mo12413F() {
        this.f8761s.mo12453e();
        this.f8759r.mo12444a();
        this.f8747a.mo12488a();
        this.f8758q1 = false;
        this.f8764x = null;
        this.f8765y = null;
        this.f8739L = null;
        this.f8734A = null;
        this.f8735B = null;
        this.f8740M = null;
        this.f8742Q = null;
        this.f8757p1 = null;
        this.f8751e0 = null;
        this.f8755k0 = null;
        this.f8748b1 = null;
        this.f8752e1 = null;
        this.f8756o1 = null;
        this.f8744X = 0;
        this.f8760r1 = false;
        this.f8746Z = null;
        this.f8749d.clear();
        this.f8754k.mo11138a(this);
    }

    /* renamed from: G */
    public final void mo12414G() {
        this.f8751e0 = Thread.currentThread();
        this.f8744X = ok3.m23850b();
        boolean z = false;
        while (!this.f8760r1 && this.f8757p1 != null && !(z = this.f8757p1.mo12483a())) {
            this.f8742Q = mo12430p(this.f8742Q);
            this.f8757p1 = mo12429o();
            if (this.f8742Q == Stage.SOURCE) {
                mo12423f();
                return;
            }
        }
        if ((this.f8742Q == Stage.FINISHED || this.f8760r1) && !z) {
            mo12439z();
        }
    }

    /* renamed from: H */
    public final <Data, ResourceType> bf5<R> mo12415H(Data data, DataSource dataSource, C1776i<Data, ResourceType, R> iVar) throws GlideException {
        xi4 r = mo12431r(dataSource);
        C1735a l = this.f8764x.mo12383i().mo12349l(data);
        try {
            return iVar.mo12567a(l, r, this.f8736C, this.f8737H, new C1744c(dataSource));
        } finally {
            l.mo12398b();
        }
    }

    /* renamed from: I */
    public final void mo12416I() {
        int i = C1742a.f8768a[this.f8743U.ordinal()];
        if (i == 1) {
            this.f8742Q = mo12430p(Stage.INITIALIZE);
            this.f8757p1 = mo12429o();
            mo12414G();
        } else if (i == 2) {
            mo12414G();
        } else if (i == 3) {
            mo12428m();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f8743U);
        }
    }

    /* renamed from: J */
    public final void mo12417J() {
        Throwable th;
        this.f8750e.mo18594c();
        if (this.f8758q1) {
            if (this.f8749d.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f8749d;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f8758q1 = true;
    }

    /* renamed from: K */
    public boolean mo12418K() {
        Stage p = mo12430p(Stage.INITIALIZE);
        if (p == Stage.RESOURCE_CACHE || p == Stage.DATA_CACHE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo12419a() {
        this.f8760r1 = true;
        C1756c cVar = this.f8757p1;
        if (cVar != null) {
            cVar.cancel();
        }
    }

    /* renamed from: d */
    public d96 mo12421d() {
        return this.f8750e;
    }

    /* renamed from: e */
    public void mo12422e(z93 z93, Object obj, r11<?> r11, DataSource dataSource, z93 z932) {
        this.f8755k0 = z93;
        this.f8748b1 = obj;
        this.f8756o1 = r11;
        this.f8752e1 = dataSource;
        this.f8763v0 = z932;
        boolean z = false;
        if (z93 != this.f8747a.mo12490c().get(0)) {
            z = true;
        }
        this.f8762s1 = z;
        if (Thread.currentThread() != this.f8751e0) {
            this.f8743U = RunReason.DECODE_DATA;
            this.f8740M.mo12442c(this);
            return;
        }
        ch2.m11868a("DecodeJob.decodeFromRetrievedData");
        try {
            mo12428m();
        } finally {
            ch2.m11872e();
        }
    }

    /* renamed from: f */
    public void mo12423f() {
        this.f8743U = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.f8740M.mo12442c(this);
    }

    /* renamed from: g */
    public void mo12424g(z93 z93, Exception exc, r11<?> r11, DataSource dataSource) {
        r11.mo11940b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.setLoggingDetails(z93, dataSource, r11.mo11939a());
        this.f8749d.add(glideException);
        if (Thread.currentThread() != this.f8751e0) {
            this.f8743U = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.f8740M.mo12442c(this);
            return;
        }
        mo12414G();
    }

    /* renamed from: h */
    public int compareTo(DecodeJob<?> decodeJob) {
        int t = mo12433t() - decodeJob.mo12433t();
        if (t == 0) {
            return this.f8741P - decodeJob.f8741P;
        }
        return t;
    }

    /* renamed from: i */
    public final <Data> bf5<R> mo12426i(r11<?> r11, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            r11.mo11940b();
            return null;
        }
        try {
            long b = ok3.m23850b();
            bf5<R> l = mo12427l(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                mo12435v("Decoded result " + l, b);
            }
            return l;
        } finally {
            r11.mo11940b();
        }
    }

    /* renamed from: l */
    public final <Data> bf5<R> mo12427l(Data data, DataSource dataSource) throws GlideException {
        return mo12415H(data, dataSource, this.f8747a.mo12495h(data.getClass()));
    }

    /* renamed from: m */
    public final void mo12428m() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f8744X;
            mo12436w("Retrieved data", j, "data: " + this.f8748b1 + ", cache key: " + this.f8755k0 + ", fetcher: " + this.f8756o1);
        }
        bf5<R> bf5 = null;
        try {
            bf5 = mo12426i(this.f8756o1, this.f8748b1, this.f8752e1);
        } catch (GlideException e) {
            e.setLoggingDetails(this.f8763v0, this.f8752e1);
            this.f8749d.add(e);
        }
        if (bf5 != null) {
            mo12438y(bf5, this.f8752e1, this.f8762s1);
        } else {
            mo12414G();
        }
    }

    /* renamed from: o */
    public final C1756c mo12429o() {
        int i = C1742a.f8769b[this.f8742Q.ordinal()];
        if (i == 1) {
            return new C1777j(this.f8747a, this);
        }
        if (i == 2) {
            return new C1755b(this.f8747a, this);
        }
        if (i == 3) {
            return new C1778k(this.f8747a, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f8742Q);
    }

    /* renamed from: p */
    public final Stage mo12430p(Stage stage) {
        int i = C1742a.f8769b[stage.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return Stage.FINISHED;
                }
                if (i != 5) {
                    throw new IllegalArgumentException("Unrecognized stage: " + stage);
                } else if (this.f8738I.mo27730b()) {
                    return Stage.RESOURCE_CACHE;
                } else {
                    return mo12430p(Stage.RESOURCE_CACHE);
                }
            } else if (this.f8745Y) {
                return Stage.FINISHED;
            } else {
                return Stage.SOURCE;
            }
        } else if (this.f8738I.mo27729a()) {
            return Stage.DATA_CACHE;
        } else {
            return mo12430p(Stage.DATA_CACHE);
        }
    }

    /* renamed from: r */
    public final xi4 mo12431r(DataSource dataSource) {
        boolean z;
        xi4 xi4 = this.f8739L;
        if (Build.VERSION.SDK_INT < 26) {
            return xi4;
        }
        if (dataSource == DataSource.RESOURCE_DISK_CACHE || this.f8747a.mo12511x()) {
            z = true;
        } else {
            z = false;
        }
        pi4 pi4 = C1797a.f8951j;
        Boolean bool = (Boolean) xi4.mo27760c(pi4);
        if (bool != null && (!bool.booleanValue() || z)) {
            return xi4;
        }
        xi4 xi42 = new xi4();
        xi42.mo27761d(this.f8739L);
        xi42.mo27762e(pi4, Boolean.valueOf(z));
        return xi42;
    }

    public void run() {
        ch2.m11870c("DecodeJob#run(reason=%s, model=%s)", this.f8743U, this.f8746Z);
        r11<?> r11 = this.f8756o1;
        try {
            if (this.f8760r1) {
                mo12439z();
                if (r11 != null) {
                    r11.mo11940b();
                }
                ch2.m11872e();
                return;
            }
            mo12416I();
            if (r11 != null) {
                r11.mo11940b();
            }
            ch2.m11872e();
        } catch (CallbackException e) {
            throw e;
        } catch (Throwable th) {
            if (r11 != null) {
                r11.mo11940b();
            }
            ch2.m11872e();
            throw th;
        }
    }

    /* renamed from: t */
    public final int mo12433t() {
        return this.f8734A.ordinal();
    }

    /* renamed from: u */
    public DecodeJob<R> mo12434u(C1718c cVar, Object obj, eq1 eq1, z93 z93, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, xg1 xg1, Map<Class<?>, mw6<?>> map, boolean z, boolean z2, boolean z3, xi4 xi4, C1743b<R> bVar, int i3) {
        this.f8747a.mo12509v(cVar, obj, z93, i, i2, xg1, cls, cls2, priority, xi4, map, z, z2, this.f8753g);
        this.f8764x = cVar;
        this.f8765y = z93;
        this.f8734A = priority;
        this.f8735B = eq1;
        this.f8736C = i;
        this.f8737H = i2;
        this.f8738I = xg1;
        this.f8745Y = z3;
        this.f8739L = xi4;
        this.f8740M = bVar;
        this.f8741P = i3;
        this.f8743U = RunReason.INITIALIZE;
        this.f8746Z = obj;
        return this;
    }

    /* renamed from: v */
    public final void mo12435v(String str, long j) {
        mo12436w(str, j, (String) null);
    }

    /* renamed from: w */
    public final void mo12436w(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(ok3.m23849a(j));
        sb.append(", load key: ");
        sb.append(this.f8735B);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
    }

    /* renamed from: x */
    public final void mo12437x(bf5<R> bf5, DataSource dataSource, boolean z) {
        mo12417J();
        this.f8740M.mo12440a(bf5, dataSource, z);
    }

    /* renamed from: y */
    public final void mo12438y(bf5<R> bf5, DataSource dataSource, boolean z) {
        fk3<R> fk3;
        ch2.m11868a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (bf5 instanceof cu2) {
                ((cu2) bf5).mo18287b();
            }
            fk3 = null;
            fk3<R> fk32 = bf5;
            if (this.f8759r.mo12446c()) {
                fk3<R> e = fk3.m17041e(bf5);
                fk3 = e;
                fk32 = e;
            }
            mo12437x(fk32, dataSource, z);
            this.f8742Q = Stage.ENCODE;
            if (this.f8759r.mo12446c()) {
                this.f8759r.mo12445b(this.f8753g, this.f8739L);
            }
            if (fk3 != null) {
                fk3.mo19950g();
            }
            mo12409B();
            ch2.m11872e();
        } catch (Throwable th) {
            ch2.m11872e();
            throw th;
        }
    }

    /* renamed from: z */
    public final void mo12439z() {
        mo12417J();
        this.f8740M.mo12441b(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.f8749d)));
        mo12410C();
    }
}
