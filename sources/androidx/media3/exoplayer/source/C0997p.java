package androidx.media3.exoplayer.source;

import androidx.media3.common.C0792h;
import androidx.media3.common.DrmInitData;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.drm.C0912c;
import androidx.media3.exoplayer.drm.DrmSession;
import java.io.IOException;
import p000.zs6;

/* renamed from: androidx.media3.exoplayer.source.p */
/* compiled from: SampleQueue */
public class C0997p implements zs6 {

    /* renamed from: A */
    public C0792h f5374A;

    /* renamed from: B */
    public C0792h f5375B;

    /* renamed from: C */
    public int f5376C;

    /* renamed from: D */
    public boolean f5377D;

    /* renamed from: E */
    public boolean f5378E;

    /* renamed from: F */
    public long f5379F;

    /* renamed from: G */
    public boolean f5380G;

    /* renamed from: a */
    public final C0995o f5381a;

    /* renamed from: b */
    public final C0999b f5382b = new C0999b();

    /* renamed from: c */
    public final g66<C1000c> f5383c = new g66<>(new xk5());

    /* renamed from: d */
    public final C0912c f5384d;

    /* renamed from: e */
    public final C0909b.C0910a f5385e;

    /* renamed from: f */
    public C1001d f5386f;

    /* renamed from: g */
    public C0792h f5387g;

    /* renamed from: h */
    public DrmSession f5388h;

    /* renamed from: i */
    public int f5389i = 1000;

    /* renamed from: j */
    public int[] f5390j = new int[1000];

    /* renamed from: k */
    public long[] f5391k = new long[1000];

    /* renamed from: l */
    public int[] f5392l = new int[1000];

    /* renamed from: m */
    public int[] f5393m = new int[1000];

    /* renamed from: n */
    public long[] f5394n = new long[1000];

    /* renamed from: o */
    public zs6.C3758a[] f5395o = new zs6.C3758a[1000];

    /* renamed from: p */
    public int f5396p;

    /* renamed from: q */
    public int f5397q;

    /* renamed from: r */
    public int f5398r;

    /* renamed from: s */
    public int f5399s;

    /* renamed from: t */
    public long f5400t = Long.MIN_VALUE;

    /* renamed from: u */
    public long f5401u = Long.MIN_VALUE;

    /* renamed from: v */
    public long f5402v = Long.MIN_VALUE;

    /* renamed from: w */
    public boolean f5403w;

    /* renamed from: x */
    public boolean f5404x = true;

    /* renamed from: y */
    public boolean f5405y = true;

    /* renamed from: z */
    public boolean f5406z;

    /* renamed from: androidx.media3.exoplayer.source.p$b */
    /* compiled from: SampleQueue */
    public static final class C0999b {

        /* renamed from: a */
        public int f5407a;

        /* renamed from: b */
        public long f5408b;

        /* renamed from: c */
        public zs6.C3758a f5409c;
    }

    /* renamed from: androidx.media3.exoplayer.source.p$c */
    /* compiled from: SampleQueue */
    public static final class C1000c {

        /* renamed from: a */
        public final C0792h f5410a;

        /* renamed from: b */
        public final C0912c.C0914b f5411b;

        public C1000c(C0792h hVar, C0912c.C0914b bVar) {
            this.f5410a = hVar;
            this.f5411b = bVar;
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.p$d */
    /* compiled from: SampleQueue */
    public interface C1001d {
        /* renamed from: b */
        void mo7708b(C0792h hVar);
    }

    public C0997p(C2891nf nfVar, C0912c cVar, C0909b.C0910a aVar) {
        this.f5384d = cVar;
        this.f5385e = aVar;
        this.f5381a = new C0995o(nfVar);
    }

    /* renamed from: k */
    public static C0997p m7426k(C2891nf nfVar, C0912c cVar, C0909b.C0910a aVar) {
        return new C0997p(nfVar, (C0912c) C2725kr.m20985e(cVar), (C0909b.C0910a) C2725kr.m20985e(aVar));
    }

    /* renamed from: l */
    public static C0997p m7427l(C2891nf nfVar) {
        return new C0997p(nfVar, (C0912c) null, (C0909b.C0910a) null);
    }

    /* renamed from: A */
    public final synchronized long mo7752A() {
        return Math.max(this.f5401u, mo7753B(this.f5399s));
    }

    /* renamed from: B */
    public final long mo7753B(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int D = mo7755D(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f5394n[D]);
            if ((this.f5393m[D] & 1) != 0) {
                break;
            }
            D--;
            if (D == -1) {
                D = this.f5389i - 1;
            }
        }
        return j;
    }

    /* renamed from: C */
    public final int mo7754C() {
        return this.f5397q + this.f5399s;
    }

    /* renamed from: D */
    public final int mo7755D(int i) {
        int i2 = this.f5398r + i;
        int i3 = this.f5389i;
        if (i2 < i3) {
            return i2;
        }
        return i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return 0;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo7756E(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f5399s     // Catch:{ all -> 0x003c }
            int r2 = r8.mo7755D(r0)     // Catch:{ all -> 0x003c }
            boolean r0 = r8.mo7759H()     // Catch:{ all -> 0x003c }
            r7 = 0
            if (r0 == 0) goto L_0x003a
            long[] r0 = r8.f5394n     // Catch:{ all -> 0x003c }
            r3 = r0[r2]     // Catch:{ all -> 0x003c }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            long r0 = r8.f5402v     // Catch:{ all -> 0x003c }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0026
            if (r11 == 0) goto L_0x0026
            int r9 = r8.f5396p     // Catch:{ all -> 0x003c }
            int r10 = r8.f5399s     // Catch:{ all -> 0x003c }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            int r11 = r8.f5396p     // Catch:{ all -> 0x003c }
            int r0 = r8.f5399s     // Catch:{ all -> 0x003c }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.mo7793v(r2, r3, r4, r6)     // Catch:{ all -> 0x003c }
            r10 = -1
            if (r9 != r10) goto L_0x0038
            monitor-exit(r8)
            return r7
        L_0x0038:
            monitor-exit(r8)
            return r9
        L_0x003a:
            monitor-exit(r8)
            return r7
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C0997p.mo7756E(long, boolean):int");
    }

    /* renamed from: F */
    public final synchronized C0792h mo7757F() {
        C0792h hVar;
        if (this.f5405y) {
            hVar = null;
        } else {
            hVar = this.f5375B;
        }
        return hVar;
    }

    /* renamed from: G */
    public final int mo7758G() {
        return this.f5397q + this.f5396p;
    }

    /* renamed from: H */
    public final boolean mo7759H() {
        if (this.f5399s != this.f5396p) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final void mo7760I() {
        this.f5406z = true;
    }

    /* renamed from: J */
    public final synchronized boolean mo7761J() {
        return this.f5403w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return r1;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo7762K(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mo7759H()     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r0 != 0) goto L_0x001a
            if (r3 != 0) goto L_0x0018
            boolean r3 = r2.f5403w     // Catch:{ all -> 0x003a }
            if (r3 != 0) goto L_0x0018
            androidx.media3.common.h r3 = r2.f5375B     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x0017
            androidx.media3.common.h r0 = r2.f5387g     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            monitor-exit(r2)
            return r1
        L_0x001a:
            g66<androidx.media3.exoplayer.source.p$c> r3 = r2.f5383c     // Catch:{ all -> 0x003a }
            int r0 = r2.mo7754C()     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.mo20408e(r0)     // Catch:{ all -> 0x003a }
            androidx.media3.exoplayer.source.p$c r3 = (androidx.media3.exoplayer.source.C0997p.C1000c) r3     // Catch:{ all -> 0x003a }
            androidx.media3.common.h r3 = r3.f5410a     // Catch:{ all -> 0x003a }
            androidx.media3.common.h r0 = r2.f5387g     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x002e
            monitor-exit(r2)
            return r1
        L_0x002e:
            int r3 = r2.f5399s     // Catch:{ all -> 0x003a }
            int r3 = r2.mo7755D(r3)     // Catch:{ all -> 0x003a }
            boolean r3 = r2.mo7763M(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return r3
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C0997p.mo7762K(boolean):boolean");
    }

    /* renamed from: M */
    public final boolean mo7763M(int i) {
        DrmSession drmSession = this.f5388h;
        if (drmSession == null || drmSession.getState() == 4 || ((this.f5393m[i] & 1073741824) == 0 && this.f5388h.mo7320b())) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public void mo7764N() throws IOException {
        DrmSession drmSession = this.f5388h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) C2725kr.m20985e(this.f5388h.getError()));
        }
    }

    /* renamed from: O */
    public final void mo7765O(C0792h hVar, c82 c82) {
        boolean z;
        DrmInitData drmInitData;
        C0792h hVar2;
        C0792h hVar3 = this.f5387g;
        if (hVar3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            drmInitData = null;
        } else {
            drmInitData = hVar3.f4178L;
        }
        this.f5387g = hVar;
        DrmInitData drmInitData2 = hVar.f4178L;
        C0912c cVar = this.f5384d;
        if (cVar != null) {
            hVar2 = hVar.mo6637c(cVar.mo7361d(hVar));
        } else {
            hVar2 = hVar;
        }
        c82.f8368b = hVar2;
        c82.f8367a = this.f5388h;
        if (this.f5384d != null) {
            if (z || !w67.m29346c(drmInitData, drmInitData2)) {
                DrmSession drmSession = this.f5388h;
                DrmSession c = this.f5384d.mo7360c(this.f5385e, hVar);
                this.f5388h = c;
                c82.f8367a = c;
                if (drmSession != null) {
                    drmSession.mo7324f(this.f5385e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        return -3;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo7766P(p000.c82 r5, androidx.media3.decoder.DecoderInputBuffer r6, boolean r7, boolean r8, androidx.media3.exoplayer.source.C0997p.C0999b r9) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r6.f4593g = r0     // Catch:{ all -> 0x0088 }
            boolean r0 = r4.mo7759H()     // Catch:{ all -> 0x0088 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0031
            if (r8 != 0) goto L_0x002b
            boolean r8 = r4.f5403w     // Catch:{ all -> 0x0088 }
            if (r8 == 0) goto L_0x0014
            goto L_0x002b
        L_0x0014:
            androidx.media3.common.h r6 = r4.f5375B     // Catch:{ all -> 0x0088 }
            if (r6 == 0) goto L_0x0029
            if (r7 != 0) goto L_0x001e
            androidx.media3.common.h r7 = r4.f5387g     // Catch:{ all -> 0x0088 }
            if (r6 == r7) goto L_0x0029
        L_0x001e:
            java.lang.Object r6 = p000.C2725kr.m20985e(r6)     // Catch:{ all -> 0x0088 }
            androidx.media3.common.h r6 = (androidx.media3.common.C0792h) r6     // Catch:{ all -> 0x0088 }
            r4.mo7765O(r6, r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r1
        L_0x0029:
            monitor-exit(r4)
            return r2
        L_0x002b:
            r5 = 4
            r6.mo23896u(r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r3
        L_0x0031:
            g66<androidx.media3.exoplayer.source.p$c> r8 = r4.f5383c     // Catch:{ all -> 0x0088 }
            int r0 = r4.mo7754C()     // Catch:{ all -> 0x0088 }
            java.lang.Object r8 = r8.mo20408e(r0)     // Catch:{ all -> 0x0088 }
            androidx.media3.exoplayer.source.p$c r8 = (androidx.media3.exoplayer.source.C0997p.C1000c) r8     // Catch:{ all -> 0x0088 }
            androidx.media3.common.h r8 = r8.f5410a     // Catch:{ all -> 0x0088 }
            if (r7 != 0) goto L_0x0083
            androidx.media3.common.h r7 = r4.f5387g     // Catch:{ all -> 0x0088 }
            if (r8 == r7) goto L_0x0046
            goto L_0x0083
        L_0x0046:
            int r5 = r4.f5399s     // Catch:{ all -> 0x0088 }
            int r5 = r4.mo7755D(r5)     // Catch:{ all -> 0x0088 }
            boolean r7 = r4.mo7763M(r5)     // Catch:{ all -> 0x0088 }
            if (r7 != 0) goto L_0x0057
            r5 = 1
            r6.f4593g = r5     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r2
        L_0x0057:
            int[] r7 = r4.f5393m     // Catch:{ all -> 0x0088 }
            r7 = r7[r5]     // Catch:{ all -> 0x0088 }
            r6.mo23896u(r7)     // Catch:{ all -> 0x0088 }
            long[] r7 = r4.f5394n     // Catch:{ all -> 0x0088 }
            r0 = r7[r5]     // Catch:{ all -> 0x0088 }
            r6.f4594k = r0     // Catch:{ all -> 0x0088 }
            long r7 = r4.f5400t     // Catch:{ all -> 0x0088 }
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x006f
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.mo23888g(r7)     // Catch:{ all -> 0x0088 }
        L_0x006f:
            int[] r6 = r4.f5392l     // Catch:{ all -> 0x0088 }
            r6 = r6[r5]     // Catch:{ all -> 0x0088 }
            r9.f5407a = r6     // Catch:{ all -> 0x0088 }
            long[] r6 = r4.f5391k     // Catch:{ all -> 0x0088 }
            r7 = r6[r5]     // Catch:{ all -> 0x0088 }
            r9.f5408b = r7     // Catch:{ all -> 0x0088 }
            zs6$a[] r6 = r4.f5395o     // Catch:{ all -> 0x0088 }
            r5 = r6[r5]     // Catch:{ all -> 0x0088 }
            r9.f5409c = r5     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r3
        L_0x0083:
            r4.mo7765O(r8, r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r4)
            return r1
        L_0x0088:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C0997p.mo7766P(c82, androidx.media3.decoder.DecoderInputBuffer, boolean, boolean, androidx.media3.exoplayer.source.p$b):int");
    }

    /* renamed from: Q */
    public void mo7767Q() {
        mo7789r();
        mo7770T();
    }

    /* renamed from: R */
    public int mo7768R(c82 c82, DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
        boolean z2;
        boolean z3 = false;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int P = mo7766P(c82, decoderInputBuffer, z2, z, this.f5382b);
        if (P == -4 && !decoderInputBuffer.mo23893p()) {
            if ((i & 1) != 0) {
                z3 = true;
            }
            if ((i & 4) == 0) {
                if (z3) {
                    this.f5381a.mo7738f(decoderInputBuffer, this.f5382b);
                } else {
                    this.f5381a.mo7741m(decoderInputBuffer, this.f5382b);
                }
            }
            if (!z3) {
                this.f5399s++;
            }
        }
        return P;
    }

    /* renamed from: S */
    public void mo7769S() {
        mo7772V(true);
        mo7770T();
    }

    /* renamed from: T */
    public final void mo7770T() {
        DrmSession drmSession = this.f5388h;
        if (drmSession != null) {
            drmSession.mo7324f(this.f5385e);
            this.f5388h = null;
            this.f5387g = null;
        }
    }

    /* renamed from: U */
    public final void mo7771U() {
        mo7772V(false);
    }

    /* renamed from: V */
    public void mo7772V(boolean z) {
        this.f5381a.mo7742n();
        this.f5396p = 0;
        this.f5397q = 0;
        this.f5398r = 0;
        this.f5399s = 0;
        this.f5404x = true;
        this.f5400t = Long.MIN_VALUE;
        this.f5401u = Long.MIN_VALUE;
        this.f5402v = Long.MIN_VALUE;
        this.f5403w = false;
        this.f5383c.mo20405b();
        if (z) {
            this.f5374A = null;
            this.f5375B = null;
            this.f5405y = true;
        }
    }

    /* renamed from: W */
    public final synchronized void mo7773W() {
        this.f5399s = 0;
        this.f5381a.mo7743o();
    }

    /* renamed from: X */
    public final synchronized boolean mo7774X(int i) {
        mo7773W();
        int i2 = this.f5397q;
        if (i >= i2) {
            if (i <= this.f5396p + i2) {
                this.f5400t = Long.MIN_VALUE;
                this.f5399s = i - i2;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return false;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo7775Y(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.mo7773W()     // Catch:{ all -> 0x0040 }
            int r0 = r8.f5399s     // Catch:{ all -> 0x0040 }
            int r2 = r8.mo7755D(r0)     // Catch:{ all -> 0x0040 }
            boolean r0 = r8.mo7759H()     // Catch:{ all -> 0x0040 }
            r7 = 0
            if (r0 == 0) goto L_0x003e
            long[] r0 = r8.f5394n     // Catch:{ all -> 0x0040 }
            r3 = r0[r2]     // Catch:{ all -> 0x0040 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            long r0 = r8.f5402v     // Catch:{ all -> 0x0040 }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            int r11 = r8.f5396p     // Catch:{ all -> 0x0040 }
            int r0 = r8.f5399s     // Catch:{ all -> 0x0040 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.mo7793v(r2, r3, r4, r6)     // Catch:{ all -> 0x0040 }
            r0 = -1
            if (r11 != r0) goto L_0x0034
            monitor-exit(r8)
            return r7
        L_0x0034:
            r8.f5400t = r9     // Catch:{ all -> 0x0040 }
            int r9 = r8.f5399s     // Catch:{ all -> 0x0040 }
            int r9 = r9 + r11
            r8.f5399s = r9     // Catch:{ all -> 0x0040 }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003e:
            monitor-exit(r8)
            return r7
        L_0x0040:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C0997p.mo7775Y(long, boolean):boolean");
    }

    /* renamed from: Z */
    public final void mo7776Z(long j) {
        if (this.f5379F != j) {
            this.f5379F = j;
            mo7760I();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo7300a(gm4 gm4, int i) {
        ys6.m30779b(this, gm4, i);
    }

    /* renamed from: a0 */
    public final void mo7777a0(long j) {
        this.f5400t = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7301b(long r12, int r14, int r15, int r16, p000.zs6.C3758a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f5406z
            if (r0 == 0) goto L_0x0010
            androidx.media3.common.h r0 = r8.f5374A
            java.lang.Object r0 = p000.C2725kr.m20989i(r0)
            androidx.media3.common.h r0 = (androidx.media3.common.C0792h) r0
            r11.mo7303d(r0)
        L_0x0010:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            r3 = r2
            goto L_0x0019
        L_0x0018:
            r3 = r1
        L_0x0019:
            boolean r4 = r8.f5404x
            if (r4 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            r8.f5404x = r1
        L_0x0022:
            long r4 = r8.f5379F
            long r4 = r4 + r12
            boolean r6 = r8.f5377D
            if (r6 == 0) goto L_0x0054
            long r6 = r8.f5400t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0030
            return
        L_0x0030:
            if (r0 != 0) goto L_0x0054
            boolean r0 = r8.f5378E
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            androidx.media3.common.h r6 = r8.f5375B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            p000.gk3.m18132i(r6, r0)
            r8.f5378E = r2
        L_0x0050:
            r0 = r14 | 1
            r6 = r0
            goto L_0x0055
        L_0x0054:
            r6 = r14
        L_0x0055:
            boolean r0 = r8.f5380G
            if (r0 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0065
            boolean r0 = r11.mo7781h(r4)
            if (r0 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r8.f5380G = r1
            goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            androidx.media3.exoplayer.source.o r0 = r8.f5381a
            long r0 = r0.mo7737e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.mo7782i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C0997p.mo7301b(long, int, int, int, zs6$a):void");
    }

    /* renamed from: b0 */
    public final synchronized boolean mo7778b0(C0792h hVar) {
        this.f5405y = false;
        if (w67.m29346c(hVar, this.f5375B)) {
            return false;
        }
        if (this.f5383c.mo20410g() || !this.f5383c.mo20409f().f5410a.equals(hVar)) {
            this.f5375B = hVar;
        } else {
            this.f5375B = this.f5383c.mo20409f().f5410a;
        }
        C0792h hVar2 = this.f5375B;
        this.f5377D = vv3.m29127a(hVar2.f4175C, hVar2.f4204y);
        this.f5378E = false;
        return true;
    }

    /* renamed from: c */
    public final void mo7302c(gm4 gm4, int i, int i2) {
        this.f5381a.mo7745q(gm4, i);
    }

    /* renamed from: c0 */
    public final void mo7779c0(C1001d dVar) {
        this.f5386f = dVar;
    }

    /* renamed from: d */
    public final void mo7303d(C0792h hVar) {
        C0792h w = mo7794w(hVar);
        this.f5406z = false;
        this.f5374A = hVar;
        boolean b0 = mo7778b0(w);
        C1001d dVar = this.f5386f;
        if (dVar != null && b0) {
            dVar.mo7708b(w);
        }
    }

    /* renamed from: d0 */
    public final synchronized void mo7780d0(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f5399s + i <= this.f5396p) {
                    z = true;
                    C2725kr.m20981a(z);
                    this.f5399s += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        C2725kr.m20981a(z);
        this.f5399s += i;
    }

    /* renamed from: e */
    public /* synthetic */ int mo7304e(u11 u11, int i, boolean z) {
        return ys6.m30778a(this, u11, i, z);
    }

    /* renamed from: f */
    public final int mo7305f(u11 u11, int i, boolean z, int i2) throws IOException {
        return this.f5381a.mo7744p(u11, i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        return r1;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo7781h(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f5396p     // Catch:{ all -> 0x0027 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            long r3 = r5.f5401u     // Catch:{ all -> 0x0027 }
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = r2
        L_0x000f:
            monitor-exit(r5)
            return r1
        L_0x0011:
            long r3 = r5.mo7752A()     // Catch:{ all -> 0x0027 }
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            monitor-exit(r5)
            return r2
        L_0x001b:
            int r6 = r5.mo7783j(r6)     // Catch:{ all -> 0x0027 }
            int r7 = r5.f5397q     // Catch:{ all -> 0x0027 }
            int r7 = r7 + r6
            r5.mo7791t(r7)     // Catch:{ all -> 0x0027 }
            monitor-exit(r5)
            return r1
        L_0x0027:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C0997p.mo7781h(long):boolean");
    }

    /* renamed from: i */
    public final synchronized void mo7782i(long j, int i, long j2, int i2, zs6.C3758a aVar) {
        boolean z;
        C0912c.C0914b bVar;
        boolean z2;
        int i3 = this.f5396p;
        if (i3 > 0) {
            int D = mo7755D(i3 - 1);
            if (this.f5391k[D] + ((long) this.f5392l[D]) <= j2) {
                z2 = true;
            } else {
                z2 = false;
            }
            C2725kr.m20981a(z2);
        }
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f5403w = z;
        this.f5402v = Math.max(this.f5402v, j);
        int D2 = mo7755D(this.f5396p);
        this.f5394n[D2] = j;
        this.f5391k[D2] = j2;
        this.f5392l[D2] = i2;
        this.f5393m[D2] = i;
        this.f5395o[D2] = aVar;
        this.f5390j[D2] = this.f5376C;
        if (this.f5383c.mo20410g() || !this.f5383c.mo20409f().f5410a.equals(this.f5375B)) {
            C0912c cVar = this.f5384d;
            if (cVar != null) {
                bVar = cVar.mo7363f(this.f5385e, this.f5375B);
            } else {
                bVar = C0912c.C0914b.f5013a;
            }
            this.f5383c.mo20404a(mo7758G(), new C1000c((C0792h) C2725kr.m20985e(this.f5375B), bVar));
        }
        int i4 = this.f5396p + 1;
        this.f5396p = i4;
        int i5 = this.f5389i;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            int[] iArr = new int[i6];
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            zs6.C3758a[] aVarArr = new zs6.C3758a[i6];
            int i7 = this.f5398r;
            int i8 = i5 - i7;
            System.arraycopy(this.f5391k, i7, jArr, 0, i8);
            System.arraycopy(this.f5394n, this.f5398r, jArr2, 0, i8);
            System.arraycopy(this.f5393m, this.f5398r, iArr2, 0, i8);
            System.arraycopy(this.f5392l, this.f5398r, iArr3, 0, i8);
            System.arraycopy(this.f5395o, this.f5398r, aVarArr, 0, i8);
            System.arraycopy(this.f5390j, this.f5398r, iArr, 0, i8);
            int i9 = this.f5398r;
            System.arraycopy(this.f5391k, 0, jArr, i8, i9);
            System.arraycopy(this.f5394n, 0, jArr2, i8, i9);
            System.arraycopy(this.f5393m, 0, iArr2, i8, i9);
            System.arraycopy(this.f5392l, 0, iArr3, i8, i9);
            System.arraycopy(this.f5395o, 0, aVarArr, i8, i9);
            System.arraycopy(this.f5390j, 0, iArr, i8, i9);
            this.f5391k = jArr;
            this.f5394n = jArr2;
            this.f5393m = iArr2;
            this.f5392l = iArr3;
            this.f5395o = aVarArr;
            this.f5390j = iArr;
            this.f5398r = 0;
            this.f5389i = i6;
        }
    }

    /* renamed from: j */
    public final int mo7783j(long j) {
        int i = this.f5396p;
        int D = mo7755D(i - 1);
        while (i > this.f5399s && this.f5394n[D] >= j) {
            i--;
            D--;
            if (D == -1) {
                D = this.f5389i - 1;
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo7784m(long r11, boolean r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f5396p     // Catch:{ all -> 0x002f }
            r1 = -1
            if (r0 == 0) goto L_0x002d
            long[] r3 = r10.f5394n     // Catch:{ all -> 0x002f }
            int r5 = r10.f5398r     // Catch:{ all -> 0x002f }
            r6 = r3[r5]     // Catch:{ all -> 0x002f }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r14 == 0) goto L_0x001a
            int r14 = r10.f5399s     // Catch:{ all -> 0x002f }
            if (r14 == r0) goto L_0x001a
            int r0 = r14 + 1
        L_0x001a:
            r6 = r0
            r4 = r10
            r7 = r11
            r9 = r13
            int r11 = r4.mo7793v(r5, r6, r7, r9)     // Catch:{ all -> 0x002f }
            r12 = -1
            if (r11 != r12) goto L_0x0027
            monitor-exit(r10)
            return r1
        L_0x0027:
            long r11 = r10.mo7787p(r11)     // Catch:{ all -> 0x002f }
            monitor-exit(r10)
            return r11
        L_0x002d:
            monitor-exit(r10)
            return r1
        L_0x002f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C0997p.mo7784m(long, boolean, boolean):long");
    }

    /* renamed from: n */
    public final synchronized long mo7785n() {
        int i = this.f5396p;
        if (i == 0) {
            return -1;
        }
        return mo7787p(i);
    }

    /* renamed from: o */
    public synchronized long mo7786o() {
        int i = this.f5399s;
        if (i == 0) {
            return -1;
        }
        return mo7787p(i);
    }

    /* renamed from: p */
    public final long mo7787p(int i) {
        this.f5401u = Math.max(this.f5401u, mo7753B(i));
        this.f5396p -= i;
        int i2 = this.f5397q + i;
        this.f5397q = i2;
        int i3 = this.f5398r + i;
        this.f5398r = i3;
        int i4 = this.f5389i;
        if (i3 >= i4) {
            this.f5398r = i3 - i4;
        }
        int i5 = this.f5399s - i;
        this.f5399s = i5;
        if (i5 < 0) {
            this.f5399s = 0;
        }
        this.f5383c.mo20407d(i2);
        if (this.f5396p != 0) {
            return this.f5391k[this.f5398r];
        }
        int i6 = this.f5398r;
        if (i6 == 0) {
            i6 = this.f5389i;
        }
        int i7 = i6 - 1;
        return this.f5391k[i7] + ((long) this.f5392l[i7]);
    }

    /* renamed from: q */
    public final void mo7788q(long j, boolean z, boolean z2) {
        this.f5381a.mo7735b(mo7784m(j, z, z2));
    }

    /* renamed from: r */
    public final void mo7789r() {
        this.f5381a.mo7735b(mo7785n());
    }

    /* renamed from: s */
    public final void mo7790s() {
        this.f5381a.mo7735b(mo7786o());
    }

    /* renamed from: t */
    public final long mo7791t(int i) {
        boolean z;
        int G = mo7758G() - i;
        boolean z2 = false;
        if (G < 0 || G > this.f5396p - this.f5399s) {
            z = false;
        } else {
            z = true;
        }
        C2725kr.m20981a(z);
        int i2 = this.f5396p - G;
        this.f5396p = i2;
        this.f5402v = Math.max(this.f5401u, mo7753B(i2));
        if (G == 0 && this.f5403w) {
            z2 = true;
        }
        this.f5403w = z2;
        this.f5383c.mo20406c(i);
        int i3 = this.f5396p;
        if (i3 == 0) {
            return 0;
        }
        int D = mo7755D(i3 - 1);
        return this.f5391k[D] + ((long) this.f5392l[D]);
    }

    /* renamed from: u */
    public final void mo7792u(int i) {
        this.f5381a.mo7736c(mo7791t(i));
    }

    /* renamed from: v */
    public final int mo7793v(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f5394n[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f5393m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f5389i) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: w */
    public C0792h mo7794w(C0792h hVar) {
        if (this.f5379F == 0 || hVar.f4179M == Long.MAX_VALUE) {
            return hVar;
        }
        return hVar.mo6636b().mo6674i0(hVar.f4179M + this.f5379F).mo6644E();
    }

    /* renamed from: x */
    public final int mo7795x() {
        return this.f5397q;
    }

    /* renamed from: y */
    public final synchronized long mo7796y() {
        long j;
        if (this.f5396p == 0) {
            j = Long.MIN_VALUE;
        } else {
            j = this.f5394n[this.f5398r];
        }
        return j;
    }

    /* renamed from: z */
    public final synchronized long mo7797z() {
        return this.f5402v;
    }
}
