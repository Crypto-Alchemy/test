package p000;

import android.util.SparseArray;
import androidx.media3.common.C0792h;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.iy6;
import p000.q24;
import p000.zs6;

/* renamed from: fk2 */
/* compiled from: H264Reader */
public final class fk2 implements yn1 {

    /* renamed from: a */
    public final gt5 f11843a;

    /* renamed from: b */
    public final boolean f11844b;

    /* renamed from: c */
    public final boolean f11845c;

    /* renamed from: d */
    public final p24 f11846d = new p24(7, 128);

    /* renamed from: e */
    public final p24 f11847e = new p24(8, 128);

    /* renamed from: f */
    public final p24 f11848f = new p24(6, 128);

    /* renamed from: g */
    public long f11849g;

    /* renamed from: h */
    public final boolean[] f11850h = new boolean[3];

    /* renamed from: i */
    public String f11851i;

    /* renamed from: j */
    public zs6 f11852j;

    /* renamed from: k */
    public C2299b f11853k;

    /* renamed from: l */
    public boolean f11854l;

    /* renamed from: m */
    public long f11855m = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: n */
    public boolean f11856n;

    /* renamed from: o */
    public final gm4 f11857o = new gm4();

    /* renamed from: fk2$b */
    /* compiled from: H264Reader */
    public static final class C2299b {

        /* renamed from: a */
        public final zs6 f11858a;

        /* renamed from: b */
        public final boolean f11859b;

        /* renamed from: c */
        public final boolean f11860c;

        /* renamed from: d */
        public final SparseArray<q24.C3108c> f11861d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<q24.C3107b> f11862e = new SparseArray<>();

        /* renamed from: f */
        public final hm4 f11863f;

        /* renamed from: g */
        public byte[] f11864g;

        /* renamed from: h */
        public int f11865h;

        /* renamed from: i */
        public int f11866i;

        /* renamed from: j */
        public long f11867j;

        /* renamed from: k */
        public boolean f11868k;

        /* renamed from: l */
        public long f11869l;

        /* renamed from: m */
        public C2300a f11870m = new C2300a();

        /* renamed from: n */
        public C2300a f11871n = new C2300a();

        /* renamed from: o */
        public boolean f11872o;

        /* renamed from: p */
        public long f11873p;

        /* renamed from: q */
        public long f11874q;

        /* renamed from: r */
        public boolean f11875r;

        /* renamed from: fk2$b$a */
        /* compiled from: H264Reader */
        public static final class C2300a {

            /* renamed from: a */
            public boolean f11876a;

            /* renamed from: b */
            public boolean f11877b;

            /* renamed from: c */
            public q24.C3108c f11878c;

            /* renamed from: d */
            public int f11879d;

            /* renamed from: e */
            public int f11880e;

            /* renamed from: f */
            public int f11881f;

            /* renamed from: g */
            public int f11882g;

            /* renamed from: h */
            public boolean f11883h;

            /* renamed from: i */
            public boolean f11884i;

            /* renamed from: j */
            public boolean f11885j;

            /* renamed from: k */
            public boolean f11886k;

            /* renamed from: l */
            public int f11887l;

            /* renamed from: m */
            public int f11888m;

            /* renamed from: n */
            public int f11889n;

            /* renamed from: o */
            public int f11890o;

            /* renamed from: p */
            public int f11891p;

            public C2300a() {
            }

            /* renamed from: b */
            public void mo19943b() {
                this.f11877b = false;
                this.f11876a = false;
            }

            /* renamed from: c */
            public final boolean mo19944c(C2300a aVar) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.f11876a) {
                    return false;
                }
                if (!aVar.f11876a) {
                    return true;
                }
                q24.C3108c cVar = (q24.C3108c) C2725kr.m20989i(this.f11878c);
                q24.C3108c cVar2 = (q24.C3108c) C2725kr.m20989i(aVar.f11878c);
                if (this.f11881f == aVar.f11881f && this.f11882g == aVar.f11882g && this.f11883h == aVar.f11883h && ((!this.f11884i || !aVar.f11884i || this.f11885j == aVar.f11885j) && (((i = this.f11879d) == (i2 = aVar.f11879d) || (i != 0 && i2 != 0)) && (((i3 = cVar.f16747l) != 0 || cVar2.f16747l != 0 || (this.f11888m == aVar.f11888m && this.f11889n == aVar.f11889n)) && ((i3 != 1 || cVar2.f16747l != 1 || (this.f11890o == aVar.f11890o && this.f11891p == aVar.f11891p)) && (z = this.f11886k) == aVar.f11886k && (!z || this.f11887l == aVar.f11887l)))))) {
                    return false;
                }
                return true;
            }

            /* renamed from: d */
            public boolean mo19945d() {
                int i;
                if (!this.f11877b || ((i = this.f11880e) != 7 && i != 2)) {
                    return false;
                }
                return true;
            }

            /* renamed from: e */
            public void mo19946e(q24.C3108c cVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f11878c = cVar;
                this.f11879d = i;
                this.f11880e = i2;
                this.f11881f = i3;
                this.f11882g = i4;
                this.f11883h = z;
                this.f11884i = z2;
                this.f11885j = z3;
                this.f11886k = z4;
                this.f11887l = i5;
                this.f11888m = i6;
                this.f11889n = i7;
                this.f11890o = i8;
                this.f11891p = i9;
                this.f11876a = true;
                this.f11877b = true;
            }

            /* renamed from: f */
            public void mo19947f(int i) {
                this.f11880e = i;
                this.f11877b = true;
            }
        }

        public C2299b(zs6 zs6, boolean z, boolean z2) {
            this.f11858a = zs6;
            this.f11859b = z;
            this.f11860c = z2;
            byte[] bArr = new byte[128];
            this.f11864g = bArr;
            this.f11863f = new hm4(bArr, 0, 0);
            mo19941g();
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0152  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo19935a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.f11868k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f11864g
                int r4 = r3.length
                int r5 = r0.f11865h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001d
                int r5 = r5 + r2
                int r5 = r5 * r7
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f11864g = r3
            L_0x001d:
                byte[] r3 = r0.f11864g
                int r4 = r0.f11865h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f11865h
                int r1 = r1 + r2
                r0.f11865h = r1
                hm4 r2 = r0.f11863f
                byte[] r3 = r0.f11864g
                r4 = 0
                r2.mo21296i(r3, r4, r1)
                hm4 r1 = r0.f11863f
                r2 = 8
                boolean r1 = r1.mo21289b(r2)
                if (r1 != 0) goto L_0x003e
                return
            L_0x003e:
                hm4 r1 = r0.f11863f
                r1.mo21298k()
                hm4 r1 = r0.f11863f
                int r10 = r1.mo21292e(r7)
                hm4 r1 = r0.f11863f
                r2 = 5
                r1.mo21299l(r2)
                hm4 r1 = r0.f11863f
                boolean r1 = r1.mo21290c()
                if (r1 != 0) goto L_0x0058
                return
            L_0x0058:
                hm4 r1 = r0.f11863f
                r1.mo21295h()
                hm4 r1 = r0.f11863f
                boolean r1 = r1.mo21290c()
                if (r1 != 0) goto L_0x0066
                return
            L_0x0066:
                hm4 r1 = r0.f11863f
                int r11 = r1.mo21295h()
                boolean r1 = r0.f11860c
                if (r1 != 0) goto L_0x0078
                r0.f11868k = r4
                fk2$b$a r1 = r0.f11871n
                r1.mo19947f(r11)
                return
            L_0x0078:
                hm4 r1 = r0.f11863f
                boolean r1 = r1.mo21290c()
                if (r1 != 0) goto L_0x0081
                return
            L_0x0081:
                hm4 r1 = r0.f11863f
                int r13 = r1.mo21295h()
                android.util.SparseArray<q24$b> r1 = r0.f11862e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0092
                r0.f11868k = r4
                return
            L_0x0092:
                android.util.SparseArray<q24$b> r1 = r0.f11862e
                java.lang.Object r1 = r1.get(r13)
                q24$b r1 = (p000.q24.C3107b) r1
                android.util.SparseArray<q24$c> r3 = r0.f11861d
                int r5 = r1.f16734b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                q24$c r9 = (p000.q24.C3108c) r9
                boolean r3 = r9.f16744i
                if (r3 == 0) goto L_0x00b7
                hm4 r3 = r0.f11863f
                boolean r3 = r3.mo21289b(r7)
                if (r3 != 0) goto L_0x00b2
                return
            L_0x00b2:
                hm4 r3 = r0.f11863f
                r3.mo21299l(r7)
            L_0x00b7:
                hm4 r3 = r0.f11863f
                int r5 = r9.f16746k
                boolean r3 = r3.mo21289b(r5)
                if (r3 != 0) goto L_0x00c2
                return
            L_0x00c2:
                hm4 r3 = r0.f11863f
                int r5 = r9.f16746k
                int r12 = r3.mo21292e(r5)
                boolean r3 = r9.f16745j
                r5 = 1
                if (r3 != 0) goto L_0x00f7
                hm4 r3 = r0.f11863f
                boolean r3 = r3.mo21289b(r5)
                if (r3 != 0) goto L_0x00d8
                return
            L_0x00d8:
                hm4 r3 = r0.f11863f
                boolean r3 = r3.mo21291d()
                if (r3 == 0) goto L_0x00f4
                hm4 r6 = r0.f11863f
                boolean r6 = r6.mo21289b(r5)
                if (r6 != 0) goto L_0x00e9
                return
            L_0x00e9:
                hm4 r6 = r0.f11863f
                boolean r6 = r6.mo21291d()
                r14 = r3
                r15 = r5
                r16 = r6
                goto L_0x00fb
            L_0x00f4:
                r14 = r3
                r15 = r4
                goto L_0x00f9
            L_0x00f7:
                r14 = r4
                r15 = r14
            L_0x00f9:
                r16 = r15
            L_0x00fb:
                int r3 = r0.f11866i
                if (r3 != r2) goto L_0x0102
                r17 = r5
                goto L_0x0104
            L_0x0102:
                r17 = r4
            L_0x0104:
                if (r17 == 0) goto L_0x0118
                hm4 r2 = r0.f11863f
                boolean r2 = r2.mo21290c()
                if (r2 != 0) goto L_0x010f
                return
            L_0x010f:
                hm4 r2 = r0.f11863f
                int r2 = r2.mo21295h()
                r18 = r2
                goto L_0x011a
            L_0x0118:
                r18 = r4
            L_0x011a:
                int r2 = r9.f16747l
                if (r2 != 0) goto L_0x0152
                hm4 r2 = r0.f11863f
                int r3 = r9.f16748m
                boolean r2 = r2.mo21289b(r3)
                if (r2 != 0) goto L_0x0129
                return
            L_0x0129:
                hm4 r2 = r0.f11863f
                int r3 = r9.f16748m
                int r2 = r2.mo21292e(r3)
                boolean r1 = r1.f16735c
                if (r1 == 0) goto L_0x014d
                if (r14 != 0) goto L_0x014d
                hm4 r1 = r0.f11863f
                boolean r1 = r1.mo21290c()
                if (r1 != 0) goto L_0x0140
                return
            L_0x0140:
                hm4 r1 = r0.f11863f
                int r1 = r1.mo21294g()
                r20 = r1
                r19 = r2
                r21 = r4
                goto L_0x0194
            L_0x014d:
                r19 = r2
                r20 = r4
                goto L_0x0192
            L_0x0152:
                if (r2 != r5) goto L_0x018e
                boolean r2 = r9.f16749n
                if (r2 != 0) goto L_0x018e
                hm4 r2 = r0.f11863f
                boolean r2 = r2.mo21290c()
                if (r2 != 0) goto L_0x0161
                return
            L_0x0161:
                hm4 r2 = r0.f11863f
                int r2 = r2.mo21294g()
                boolean r1 = r1.f16735c
                if (r1 == 0) goto L_0x0185
                if (r14 != 0) goto L_0x0185
                hm4 r1 = r0.f11863f
                boolean r1 = r1.mo21290c()
                if (r1 != 0) goto L_0x0176
                return
            L_0x0176:
                hm4 r1 = r0.f11863f
                int r1 = r1.mo21294g()
                r22 = r1
                r21 = r2
                r19 = r4
                r20 = r19
                goto L_0x0196
            L_0x0185:
                r21 = r2
                r19 = r4
                r20 = r19
                r22 = r20
                goto L_0x0196
            L_0x018e:
                r19 = r4
                r20 = r19
            L_0x0192:
                r21 = r20
            L_0x0194:
                r22 = r21
            L_0x0196:
                fk2$b$a r8 = r0.f11871n
                r8.mo19946e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f11868k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fk2.C2299b.mo19935a(byte[], int, int):void");
        }

        /* renamed from: b */
        public boolean mo19936b(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f11866i == 9 || (this.f11860c && this.f11871n.mo19944c(this.f11870m))) {
                if (z && this.f11872o) {
                    mo19938d(i + ((int) (j - this.f11867j)));
                }
                this.f11873p = this.f11867j;
                this.f11874q = this.f11869l;
                this.f11875r = false;
                this.f11872o = true;
            }
            if (this.f11859b) {
                z2 = this.f11871n.mo19945d();
            }
            boolean z4 = this.f11875r;
            int i2 = this.f11866i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f11875r = z5;
            return z5;
        }

        /* renamed from: c */
        public boolean mo19937c() {
            return this.f11860c;
        }

        /* renamed from: d */
        public final void mo19938d(int i) {
            long j = this.f11874q;
            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                boolean z = this.f11875r;
                this.f11858a.mo7301b(j, z ? 1 : 0, (int) (this.f11867j - this.f11873p), i, (zs6.C3758a) null);
            }
        }

        /* renamed from: e */
        public void mo19939e(q24.C3107b bVar) {
            this.f11862e.append(bVar.f16733a, bVar);
        }

        /* renamed from: f */
        public void mo19940f(q24.C3108c cVar) {
            this.f11861d.append(cVar.f16739d, cVar);
        }

        /* renamed from: g */
        public void mo19941g() {
            this.f11868k = false;
            this.f11872o = false;
            this.f11871n.mo19943b();
        }

        /* renamed from: h */
        public void mo19942h(long j, int i, long j2) {
            this.f11866i = i;
            this.f11869l = j2;
            this.f11867j = j;
            if (!this.f11859b || i != 1) {
                if (!this.f11860c) {
                    return;
                }
                if (!(i == 5 || i == 1 || i == 2)) {
                    return;
                }
            }
            C2300a aVar = this.f11870m;
            this.f11870m = this.f11871n;
            this.f11871n = aVar;
            aVar.mo19943b();
            this.f11865h = 0;
            this.f11868k = true;
        }
    }

    public fk2(gt5 gt5, boolean z, boolean z2) {
        this.f11843a = gt5;
        this.f11844b = z;
        this.f11845c = z2;
    }

    /* renamed from: a */
    public void mo18798a(gm4 gm4) {
        int i;
        mo19931b();
        int e = gm4.mo20680e();
        int f = gm4.mo20681f();
        byte[] d = gm4.mo20679d();
        this.f11849g += (long) gm4.mo20676a();
        this.f11852j.mo7300a(gm4, gm4.mo20676a());
        while (true) {
            int c = q24.m25334c(d, e, f, this.f11850h);
            if (c == f) {
                mo19933h(d, e, f);
                return;
            }
            int f2 = q24.m25337f(d, c);
            int i2 = c - e;
            if (i2 > 0) {
                mo19933h(d, e, c);
            }
            int i3 = f - c;
            long j = this.f11849g - ((long) i3);
            if (i2 < 0) {
                i = -i2;
            } else {
                i = 0;
            }
            mo19932g(j, i3, i, this.f11855m);
            mo19934i(j, f2, this.f11855m);
            e = c + 3;
        }
    }

    @EnsuresNonNull({"output", "sampleReader"})
    /* renamed from: b */
    public final void mo19931b() {
        C2725kr.m20989i(this.f11852j);
        w67.m29360j(this.f11853k);
    }

    /* renamed from: c */
    public void mo18799c() {
        this.f11849g = 0;
        this.f11856n = false;
        this.f11855m = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        q24.m25332a(this.f11850h);
        this.f11846d.mo24324d();
        this.f11847e.mo24324d();
        this.f11848f.mo24324d();
        C2299b bVar = this.f11853k;
        if (bVar != null) {
            bVar.mo19941g();
        }
    }

    /* renamed from: d */
    public void mo18800d(jy1 jy1, iy6.C2579d dVar) {
        dVar.mo21670a();
        this.f11851i = dVar.mo21671b();
        zs6 f = jy1.mo7713f(dVar.mo21672c(), 2);
        this.f11852j = f;
        this.f11853k = new C2299b(f, this.f11844b, this.f11845c);
        this.f11843a.mo20844b(jy1, dVar);
    }

    /* renamed from: e */
    public void mo18801e() {
    }

    /* renamed from: f */
    public void mo18802f(long j, int i) {
        boolean z;
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f11855m = j;
        }
        boolean z2 = this.f11856n;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f11856n = z2 | z;
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* renamed from: g */
    public final void mo19932g(long j, int i, int i2, long j2) {
        if (!this.f11854l || this.f11853k.mo19937c()) {
            this.f11846d.mo24322b(i2);
            this.f11847e.mo24322b(i2);
            if (!this.f11854l) {
                if (this.f11846d.mo24323c() && this.f11847e.mo24323c()) {
                    ArrayList arrayList = new ArrayList();
                    p24 p24 = this.f11846d;
                    arrayList.add(Arrays.copyOf(p24.f16264d, p24.f16265e));
                    p24 p242 = this.f11847e;
                    arrayList.add(Arrays.copyOf(p242.f16264d, p242.f16265e));
                    p24 p243 = this.f11846d;
                    q24.C3108c l = q24.m25343l(p243.f16264d, 3, p243.f16265e);
                    p24 p244 = this.f11847e;
                    q24.C3107b j3 = q24.m25341j(p244.f16264d, 3, p244.f16265e);
                    this.f11852j.mo7303d(new C0792h.C0794b().mo6658S(this.f11851i).mo6670e0("video/avc").mo6648I(yh0.m30584a(l.f16736a, l.f16737b, l.f16738c)).mo6675j0(l.f16741f).mo6656Q(l.f16742g).mo6666a0(l.f16743h).mo6659T(arrayList).mo6644E());
                    this.f11854l = true;
                    this.f11853k.mo19940f(l);
                    this.f11853k.mo19939e(j3);
                    this.f11846d.mo24324d();
                    this.f11847e.mo24324d();
                }
            } else if (this.f11846d.mo24323c()) {
                p24 p245 = this.f11846d;
                this.f11853k.mo19940f(q24.m25343l(p245.f16264d, 3, p245.f16265e));
                this.f11846d.mo24324d();
            } else if (this.f11847e.mo24323c()) {
                p24 p246 = this.f11847e;
                this.f11853k.mo19939e(q24.m25341j(p246.f16264d, 3, p246.f16265e));
                this.f11847e.mo24324d();
            }
        }
        if (this.f11848f.mo24322b(i2)) {
            p24 p247 = this.f11848f;
            this.f11857o.mo20672N(this.f11848f.f16264d, q24.m25348q(p247.f16264d, p247.f16265e));
            this.f11857o.mo20674P(4);
            this.f11843a.mo20843a(j2, this.f11857o);
        }
        if (this.f11853k.mo19936b(j, i, this.f11854l, this.f11856n)) {
            this.f11856n = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: h */
    public final void mo19933h(byte[] bArr, int i, int i2) {
        if (!this.f11854l || this.f11853k.mo19937c()) {
            this.f11846d.mo24321a(bArr, i, i2);
            this.f11847e.mo24321a(bArr, i, i2);
        }
        this.f11848f.mo24321a(bArr, i, i2);
        this.f11853k.mo19935a(bArr, i, i2);
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: i */
    public final void mo19934i(long j, int i, long j2) {
        if (!this.f11854l || this.f11853k.mo19937c()) {
            this.f11846d.mo24325e(i);
            this.f11847e.mo24325e(i);
        }
        this.f11848f.mo24325e(i);
        this.f11853k.mo19942h(j, i, j2);
    }
}
