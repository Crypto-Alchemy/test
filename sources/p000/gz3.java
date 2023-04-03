package p000;

import android.util.Pair;
import androidx.media3.common.C0792h;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p000.C2420gs;
import p000.xs5;
import p000.zs6;

/* renamed from: gz3 */
/* compiled from: Mp4Extractor */
public final class gz3 implements hy1, xs5 {

    /* renamed from: y */
    public static final ny1 f12661y = new ez3();

    /* renamed from: a */
    public final int f12662a;

    /* renamed from: b */
    public final gm4 f12663b;

    /* renamed from: c */
    public final gm4 f12664c;

    /* renamed from: d */
    public final gm4 f12665d;

    /* renamed from: e */
    public final gm4 f12666e;

    /* renamed from: f */
    public final ArrayDeque<C2420gs.C2421a> f12667f;

    /* renamed from: g */
    public final bt5 f12668g;

    /* renamed from: h */
    public final List<Metadata.Entry> f12669h;

    /* renamed from: i */
    public int f12670i;

    /* renamed from: j */
    public int f12671j;

    /* renamed from: k */
    public long f12672k;

    /* renamed from: l */
    public int f12673l;

    /* renamed from: m */
    public gm4 f12674m;

    /* renamed from: n */
    public int f12675n;

    /* renamed from: o */
    public int f12676o;

    /* renamed from: p */
    public int f12677p;

    /* renamed from: q */
    public int f12678q;

    /* renamed from: r */
    public jy1 f12679r;

    /* renamed from: s */
    public C2440a[] f12680s;

    /* renamed from: t */
    public long[][] f12681t;

    /* renamed from: u */
    public int f12682u;

    /* renamed from: v */
    public long f12683v;

    /* renamed from: w */
    public int f12684w;

    /* renamed from: x */
    public MotionPhotoMetadata f12685x;

    /* renamed from: gz3$a */
    /* compiled from: Mp4Extractor */
    public static final class C2440a {

        /* renamed from: a */
        public final qs6 f12686a;

        /* renamed from: b */
        public final at6 f12687b;

        /* renamed from: c */
        public final zs6 f12688c;

        /* renamed from: d */
        public final cy6 f12689d;

        /* renamed from: e */
        public int f12690e;

        public C2440a(qs6 qs6, at6 at6, zs6 zs6) {
            cy6 cy6;
            this.f12686a = qs6;
            this.f12687b = at6;
            this.f12688c = zs6;
            if ("audio/true-hd".equals(qs6.f17058f.f4175C)) {
                cy6 = new cy6();
            } else {
                cy6 = null;
            }
            this.f12689d = cy6;
        }
    }

    public gz3() {
        this(0);
    }

    /* renamed from: F */
    public static boolean m18502F(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    /* renamed from: G */
    public static boolean m18503G(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    /* renamed from: m */
    public static int m18506m(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: n */
    public static long[][] m18507n(C2440a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].f12687b.f7754b];
            jArr2[i] = aVarArr[i].f12687b.f7758f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            at6 at6 = aVarArr[i3].f12687b;
            j += (long) at6.f7756d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = at6.f7758f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: q */
    public static int m18508q(at6 at6, long j) {
        int a = at6.mo11143a(j);
        if (a == -1) {
            return at6.mo11144b(j);
        }
        return a;
    }

    /* renamed from: s */
    public static /* synthetic */ qs6 m18509s(qs6 qs6) {
        return qs6;
    }

    /* renamed from: t */
    public static /* synthetic */ hy1[] m18510t() {
        return new hy1[]{new gz3()};
    }

    /* renamed from: u */
    public static long m18511u(at6 at6, long j, long j2) {
        int q = m18508q(at6, j);
        if (q == -1) {
            return j2;
        }
        return Math.min(at6.f7755c[q], j2);
    }

    /* renamed from: y */
    public static int m18512y(gm4 gm4) {
        gm4.mo20674P(8);
        int m = m18506m(gm4.mo20689n());
        if (m != 0) {
            return m;
        }
        gm4.mo20675Q(4);
        while (gm4.mo20676a() > 0) {
            int m2 = m18506m(gm4.mo20689n());
            if (m2 != 0) {
                return m2;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public final void mo20901A(long j) {
        if (this.f12671j == 1836086884) {
            int i = this.f12673l;
            this.f12685x = new MotionPhotoMetadata(0, j, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, j + ((long) i), this.f12672k - ((long) i));
        }
    }

    /* renamed from: B */
    public final boolean mo20902B(iy1 iy1) throws IOException {
        boolean z;
        boolean z2;
        C2420gs.C2421a peek;
        if (this.f12673l == 0) {
            if (!iy1.mo86f(this.f12666e.mo20679d(), 0, 8, true)) {
                mo20912x();
                return false;
            }
            this.f12673l = 8;
            this.f12666e.mo20674P(0);
            this.f12672k = this.f12666e.mo20664F();
            this.f12671j = this.f12666e.mo20689n();
        }
        long j = this.f12672k;
        if (j == 1) {
            iy1.readFully(this.f12666e.mo20679d(), 8, 8);
            this.f12673l += 8;
            this.f12672k = this.f12666e.mo20667I();
        } else if (j == 0) {
            long length = iy1.getLength();
            if (length == -1 && (peek = this.f12667f.peek()) != null) {
                length = peek.f12585b;
            }
            if (length != -1) {
                this.f12672k = (length - iy1.getPosition()) + ((long) this.f12673l);
            }
        }
        if (this.f12672k >= ((long) this.f12673l)) {
            if (m18502F(this.f12671j)) {
                long position = iy1.getPosition();
                long j2 = this.f12672k;
                int i = this.f12673l;
                long j3 = (position + j2) - ((long) i);
                if (j2 != ((long) i) && this.f12671j == 1835365473) {
                    mo20910v(iy1);
                }
                this.f12667f.push(new C2420gs.C2421a(this.f12671j, j3));
                if (this.f12672k == ((long) this.f12673l)) {
                    mo20911w(j3);
                } else {
                    mo20907o();
                }
            } else if (m18503G(this.f12671j)) {
                if (this.f12673l == 8) {
                    z = true;
                } else {
                    z = false;
                }
                C2725kr.m20987g(z);
                if (this.f12672k <= 2147483647L) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C2725kr.m20987g(z2);
                gm4 gm4 = new gm4((int) this.f12672k);
                System.arraycopy(this.f12666e.mo20679d(), 0, gm4.mo20679d(), 0, 8);
                this.f12674m = gm4;
                this.f12670i = 1;
            } else {
                mo20901A(iy1.getPosition() - ((long) this.f12673l));
                this.f12674m = null;
                this.f12670i = 1;
            }
            return true;
        }
        throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20903C(p000.iy1 r10, p000.mt4 r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.f12672k
            int r2 = r9.f12673l
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            gm4 r4 = r9.f12674m
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0044
            byte[] r11 = r4.mo20679d()
            int r7 = r9.f12673l
            int r0 = (int) r0
            r10.readFully(r11, r7, r0)
            int r10 = r9.f12671j
            r11 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r11) goto L_0x0029
            int r10 = m18512y(r4)
            r9.f12684w = r10
            goto L_0x004f
        L_0x0029:
            java.util.ArrayDeque<gs$a> r10 = r9.f12667f
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x004f
            java.util.ArrayDeque<gs$a> r10 = r9.f12667f
            java.lang.Object r10 = r10.peek()
            gs$a r10 = (p000.C2420gs.C2421a) r10
            gs$b r11 = new gs$b
            int r0 = r9.f12671j
            r11.<init>(r0, r4)
            r10.mo20824e(r11)
            goto L_0x004f
        L_0x0044:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0051
            int r11 = (int) r0
            r10.mo92k(r11)
        L_0x004f:
            r10 = r6
            goto L_0x0059
        L_0x0051:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f15249a = r7
            r10 = r5
        L_0x0059:
            r9.mo20911w(r2)
            if (r10 == 0) goto L_0x0064
            int r10 = r9.f12670i
            r11 = 2
            if (r10 == r11) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r5 = r6
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gz3.mo20903C(iy1, mt4):boolean");
    }

    /* renamed from: D */
    public final int mo20904D(iy1 iy1, mt4 mt4) throws IOException {
        int i;
        mt4 mt42;
        iy1 iy12 = iy1;
        long position = iy1.getPosition();
        if (this.f12675n == -1) {
            int r = mo20909r(position);
            this.f12675n = r;
            if (r == -1) {
                return -1;
            }
        }
        C2440a aVar = this.f12680s[this.f12675n];
        zs6 zs6 = aVar.f12688c;
        int i2 = aVar.f12690e;
        at6 at6 = aVar.f12687b;
        long j = at6.f7755c[i2];
        int i3 = at6.f7756d[i2];
        cy6 cy6 = aVar.f12689d;
        long j2 = (j - position) + ((long) this.f12676o);
        if (j2 < 0) {
            i = 1;
            mt42 = mt4;
        } else if (j2 >= 262144) {
            mt42 = mt4;
            i = 1;
        } else {
            if (aVar.f12686a.f17059g == 1) {
                j2 += 8;
                i3 -= 8;
            }
            iy12.mo92k((int) j2);
            qs6 qs6 = aVar.f12686a;
            if (qs6.f17062j == 0) {
                if ("audio/ac4".equals(qs6.f17058f.f4175C)) {
                    if (this.f12677p == 0) {
                        C3467v7.m28675a(i3, this.f12665d);
                        zs6.mo7300a(this.f12665d, 7);
                        this.f12677p += 7;
                    }
                    i3 += 7;
                } else if (cy6 != null) {
                    cy6.mo18382d(iy12);
                }
                while (true) {
                    int i4 = this.f12677p;
                    if (i4 >= i3) {
                        break;
                    }
                    int e = zs6.mo7304e(iy12, i3 - i4, false);
                    this.f12676o += e;
                    this.f12677p += e;
                    this.f12678q -= e;
                }
            } else {
                byte[] d = this.f12664c.mo20679d();
                d[0] = 0;
                d[1] = 0;
                d[2] = 0;
                int i5 = aVar.f12686a.f17062j;
                int i6 = 4 - i5;
                while (this.f12677p < i3) {
                    int i7 = this.f12678q;
                    if (i7 == 0) {
                        iy12.readFully(d, i6, i5);
                        this.f12676o += i5;
                        this.f12664c.mo20674P(0);
                        int n = this.f12664c.mo20689n();
                        if (n >= 0) {
                            this.f12678q = n;
                            this.f12663b.mo20674P(0);
                            zs6.mo7300a(this.f12663b, 4);
                            this.f12677p += 4;
                            i3 += i6;
                        } else {
                            throw ParserException.createForMalformedContainer("Invalid NAL length", (Throwable) null);
                        }
                    } else {
                        int e2 = zs6.mo7304e(iy12, i7, false);
                        this.f12676o += e2;
                        this.f12677p += e2;
                        this.f12678q -= e2;
                    }
                }
            }
            int i8 = i3;
            at6 at62 = aVar.f12687b;
            long j3 = at62.f7758f[i2];
            int i9 = at62.f7759g[i2];
            if (cy6 != null) {
                int i10 = i8;
                cy6 cy62 = cy6;
                cy6.mo18381c(zs6, j3, i9, i10, 0, (zs6.C3758a) null);
                if (i2 + 1 == aVar.f12687b.f7754b) {
                    cy62.mo18379a(zs6, (zs6.C3758a) null);
                }
            } else {
                zs6.mo7301b(j3, i9, i8, 0, (zs6.C3758a) null);
            }
            aVar.f12690e++;
            this.f12675n = -1;
            this.f12676o = 0;
            this.f12677p = 0;
            this.f12678q = 0;
            return 0;
        }
        mt42.f15249a = j;
        return i;
    }

    /* renamed from: E */
    public final int mo20905E(iy1 iy1, mt4 mt4) throws IOException {
        int c = this.f12668g.mo11812c(iy1, mt4, this.f12669h);
        if (c == 1 && mt4.f15249a == 0) {
            mo20907o();
        }
        return c;
    }

    /* renamed from: H */
    public final void mo20906H(C2440a aVar, long j) {
        at6 at6 = aVar.f12687b;
        int a = at6.mo11143a(j);
        if (a == -1) {
            a = at6.mo11144b(j);
        }
        aVar.f12690e = a;
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        this.f12667f.clear();
        this.f12673l = 0;
        this.f12675n = -1;
        this.f12676o = 0;
        this.f12677p = 0;
        this.f12678q = 0;
        if (j != 0) {
            for (C2440a aVar : this.f12680s) {
                mo20906H(aVar, j2);
                cy6 cy6 = aVar.f12689d;
                if (cy6 != null) {
                    cy6.mo18380b();
                }
            }
        } else if (this.f12670i != 3) {
            mo20907o();
        } else {
            this.f12668g.mo11815g();
            this.f12669h.clear();
        }
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        while (true) {
            int i = this.f12670i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return mo20904D(iy1, mt4);
                    }
                    if (i == 3) {
                        return mo20905E(iy1, mt4);
                    }
                    throw new IllegalStateException();
                } else if (mo20903C(iy1, mt4)) {
                    return 1;
                }
            } else if (!mo20902B(iy1)) {
                return -1;
            }
        }
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        boolean z;
        if ((this.f12662a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return o56.m23682d(iy1, z);
    }

    /* renamed from: f */
    public xs5.C3641a mo11155f(long j) {
        return mo20908p(j, -1);
    }

    /* renamed from: h */
    public boolean mo11156h() {
        return true;
    }

    /* renamed from: i */
    public long mo11157i() {
        return this.f12683v;
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f12679r = jy1;
    }

    /* renamed from: o */
    public final void mo20907o() {
        this.f12670i = 0;
        this.f12673l = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.xs5.C3641a mo20908p(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            gz3$a[] r4 = r0.f12680s
            int r5 = r4.length
            if (r5 != 0) goto L_0x0013
            xs5$a r1 = new xs5$a
            zs5 r2 = p000.zs5.f20674c
            r1.<init>(r2)
            return r1
        L_0x0013:
            r5 = -1
            r7 = -1
            if (r3 == r7) goto L_0x001a
            r8 = r3
            goto L_0x001c
        L_0x001a:
            int r8 = r0.f12682u
        L_0x001c:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == r7) goto L_0x0058
            r4 = r4[r8]
            at6 r4 = r4.f12687b
            int r8 = m18508q(r4, r1)
            if (r8 != r7) goto L_0x0035
            xs5$a r1 = new xs5$a
            zs5 r2 = p000.zs5.f20674c
            r1.<init>(r2)
            return r1
        L_0x0035:
            long[] r11 = r4.f7758f
            r12 = r11[r8]
            long[] r11 = r4.f7755c
            r14 = r11[r8]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L_0x005e
            int r11 = r4.f7754b
            int r11 = r11 + -1
            if (r8 >= r11) goto L_0x005e
            int r1 = r4.mo11144b(r1)
            if (r1 == r7) goto L_0x005e
            if (r1 == r8) goto L_0x005e
            long[] r2 = r4.f7758f
            r5 = r2[r1]
            long[] r2 = r4.f7755c
            r1 = r2[r1]
            goto L_0x0060
        L_0x0058:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L_0x005e:
            r1 = r5
            r5 = r9
        L_0x0060:
            if (r3 != r7) goto L_0x007f
            r3 = 0
        L_0x0063:
            gz3$a[] r4 = r0.f12680s
            int r7 = r4.length
            if (r3 >= r7) goto L_0x007f
            int r7 = r0.f12682u
            if (r3 == r7) goto L_0x007c
            r4 = r4[r3]
            at6 r4 = r4.f12687b
            long r14 = m18511u(r4, r12, r14)
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
            long r1 = m18511u(r4, r5, r1)
        L_0x007c:
            int r3 = r3 + 1
            goto L_0x0063
        L_0x007f:
            zs5 r3 = new zs5
            r3.<init>(r12, r14)
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x008e
            xs5$a r1 = new xs5$a
            r1.<init>(r3)
            return r1
        L_0x008e:
            zs5 r4 = new zs5
            r4.<init>(r5, r1)
            xs5$a r1 = new xs5$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gz3.mo20908p(long, int):xs5$a");
    }

    /* renamed from: r */
    public final int mo20909r(long j) {
        boolean z;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z2 = true;
        long j3 = Long.MAX_VALUE;
        boolean z3 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            C2440a[] aVarArr = this.f12680s;
            if (i3 >= aVarArr.length) {
                break;
            }
            C2440a aVar = aVarArr[i3];
            int i4 = aVar.f12690e;
            at6 at6 = aVar.f12687b;
            if (i4 != at6.f7754b) {
                long j5 = at6.f7755c[i4];
                long j6 = ((long[][]) w67.m29360j(this.f12681t))[i3][i4];
                long j7 = j5 - j;
                if (j7 < 0 || j7 >= 262144) {
                    z = true;
                } else {
                    z = false;
                }
                if ((!z && z3) || (z == z3 && j7 < j4)) {
                    z3 = z;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z2 = z;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        if (j2 == Long.MAX_VALUE || !z2 || j3 < j2 + 10485760) {
            return i2;
        }
        return i;
    }

    /* renamed from: v */
    public final void mo20910v(iy1 iy1) throws IOException {
        this.f12665d.mo20670L(8);
        iy1.mo94n(this.f12665d.mo20679d(), 0, 8);
        C2503hs.m19204e(this.f12665d);
        iy1.mo92k(this.f12665d.mo20680e());
        iy1.mo85e();
    }

    /* renamed from: w */
    public final void mo20911w(long j) throws ParserException {
        while (!this.f12667f.isEmpty() && this.f12667f.peek().f12585b == j) {
            C2420gs.C2421a pop = this.f12667f.pop();
            if (pop.f12584a == 1836019574) {
                mo20913z(pop);
                this.f12667f.clear();
                this.f12670i = 2;
            } else if (!this.f12667f.isEmpty()) {
                this.f12667f.peek().mo20823d(pop);
            }
        }
        if (this.f12670i != 2) {
            mo20907o();
        }
    }

    /* renamed from: x */
    public final void mo20912x() {
        Metadata metadata;
        if (this.f12684w == 2 && (this.f12662a & 2) != 0) {
            zs6 f = this.f12679r.mo7713f(0, 4);
            if (this.f12685x == null) {
                metadata = null;
            } else {
                metadata = new Metadata(this.f12685x);
            }
            f.mo7303d(new C0792h.C0794b().mo6663X(metadata).mo6644E());
            this.f12679r.mo7722p();
            this.f12679r.mo7715g(new xs5.C3642b(CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED));
        }
    }

    /* renamed from: z */
    public final void mo20913z(C2420gs.C2421a aVar) throws ParserException {
        boolean z;
        Metadata metadata;
        Metadata metadata2;
        Metadata metadata3;
        boolean z2;
        int i;
        List<at6> list;
        int i2;
        Metadata metadata4;
        int i3;
        C2420gs.C2421a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        if (this.f12684w == 1) {
            z = true;
        } else {
            z = false;
        }
        we2 we2 = new we2();
        C2420gs.C2422b g = aVar2.mo20826g(1969517665);
        if (g != null) {
            Pair<Metadata, Metadata> B = C2503hs.m19197B(g);
            Metadata metadata5 = (Metadata) B.first;
            Metadata metadata6 = (Metadata) B.second;
            if (metadata5 != null) {
                we2.mo27487c(metadata5);
            }
            metadata2 = metadata6;
            metadata = metadata5;
        } else {
            metadata2 = null;
            metadata = null;
        }
        C2420gs.C2421a f = aVar2.mo20825f(1835365473);
        if (f != null) {
            metadata3 = C2503hs.m19213n(f);
        } else {
            metadata3 = null;
        }
        if ((this.f12662a & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        Metadata metadata7 = metadata3;
        List<at6> A = C2503hs.m19196A(aVar, we2, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, (DrmInitData) null, z2, z, new fz3());
        int size = A.size();
        long j2 = -9223372036854775807L;
        int i4 = 0;
        int i5 = -1;
        while (i4 < size) {
            at6 at6 = A.get(i4);
            if (at6.f7754b == 0) {
                list = A;
                i = size;
            } else {
                qs6 qs6 = at6.f7753a;
                list = A;
                i = size;
                long j3 = qs6.f17057e;
                if (j3 == j) {
                    j3 = at6.f7760h;
                }
                long max = Math.max(j2, j3);
                C2440a aVar3 = new C2440a(qs6, at6, this.f12679r.mo7713f(i4, qs6.f17054b));
                if ("audio/true-hd".equals(qs6.f17058f.f4175C)) {
                    i2 = at6.f7757e * 16;
                } else {
                    i2 = at6.f7757e + 30;
                }
                C0792h.C0794b b = qs6.f17058f.mo6636b();
                b.mo6662W(i2);
                if (qs6.f17054b == 2 && j3 > 0 && (i3 = at6.f7754b) > 1) {
                    b.mo6655P(((float) i3) / (((float) j3) / 1000000.0f));
                }
                lv3.m21884k(qs6.f17054b, we2, b);
                int i6 = qs6.f17054b;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata2;
                if (this.f12669h.isEmpty()) {
                    metadata4 = null;
                } else {
                    metadata4 = new Metadata((List<? extends Metadata.Entry>) this.f12669h);
                }
                metadataArr[1] = metadata4;
                lv3.m21885l(i6, metadata, metadata7, b, metadataArr);
                aVar3.f12688c.mo7303d(b.mo6644E());
                if (qs6.f17054b == 2) {
                    if (i5 == -1) {
                        i5 = arrayList.size();
                    }
                }
                arrayList.add(aVar3);
                j2 = max;
            }
            i4++;
            A = list;
            size = i;
            j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        this.f12682u = i5;
        this.f12683v = j2;
        C2440a[] aVarArr = (C2440a[]) arrayList.toArray(new C2440a[0]);
        this.f12680s = aVarArr;
        this.f12681t = m18507n(aVarArr);
        this.f12679r.mo7722p();
        this.f12679r.mo7715g(this);
    }

    public gz3(int i) {
        this.f12662a = i;
        this.f12670i = (i & 4) != 0 ? 3 : 0;
        this.f12668g = new bt5();
        this.f12669h = new ArrayList();
        this.f12666e = new gm4(16);
        this.f12667f = new ArrayDeque<>();
        this.f12663b = new gm4(q24.f16719a);
        this.f12664c = new gm4(4);
        this.f12665d = new gm4();
        this.f12675n = -1;
        this.f12679r = jy1.f13901j;
        this.f12680s = new C2440a[0];
    }
}
