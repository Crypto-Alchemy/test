package p000;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C0792h;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p000.C2420gs;
import p000.xs5;
import p000.zs6;

/* renamed from: sb2 */
/* compiled from: FragmentedMp4Extractor */
public class sb2 implements hy1 {

    /* renamed from: I */
    public static final ny1 f17556I = new qb2();

    /* renamed from: J */
    public static final byte[] f17557J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K */
    public static final C0792h f17558K = new C0792h.C0794b().mo6670e0("application/x-emsg").mo6644E();

    /* renamed from: A */
    public int f17559A;

    /* renamed from: B */
    public int f17560B;

    /* renamed from: C */
    public int f17561C;

    /* renamed from: D */
    public boolean f17562D;

    /* renamed from: E */
    public jy1 f17563E;

    /* renamed from: F */
    public zs6[] f17564F;

    /* renamed from: G */
    public zs6[] f17565G;

    /* renamed from: H */
    public boolean f17566H;

    /* renamed from: a */
    public final int f17567a;

    /* renamed from: b */
    public final qs6 f17568b;

    /* renamed from: c */
    public final List<C0792h> f17569c;

    /* renamed from: d */
    public final SparseArray<C3261b> f17570d;

    /* renamed from: e */
    public final gm4 f17571e;

    /* renamed from: f */
    public final gm4 f17572f;

    /* renamed from: g */
    public final gm4 f17573g;

    /* renamed from: h */
    public final byte[] f17574h;

    /* renamed from: i */
    public final gm4 f17575i;

    /* renamed from: j */
    public final sq6 f17576j;

    /* renamed from: k */
    public final au1 f17577k;

    /* renamed from: l */
    public final gm4 f17578l;

    /* renamed from: m */
    public final ArrayDeque<C2420gs.C2421a> f17579m;

    /* renamed from: n */
    public final ArrayDeque<C3260a> f17580n;

    /* renamed from: o */
    public final zs6 f17581o;

    /* renamed from: p */
    public int f17582p;

    /* renamed from: q */
    public int f17583q;

    /* renamed from: r */
    public long f17584r;

    /* renamed from: s */
    public int f17585s;

    /* renamed from: t */
    public gm4 f17586t;

    /* renamed from: u */
    public long f17587u;

    /* renamed from: v */
    public int f17588v;

    /* renamed from: w */
    public long f17589w;

    /* renamed from: x */
    public long f17590x;

    /* renamed from: y */
    public long f17591y;

    /* renamed from: z */
    public C3261b f17592z;

    /* renamed from: sb2$a */
    /* compiled from: FragmentedMp4Extractor */
    public static final class C3260a {

        /* renamed from: a */
        public final long f17593a;

        /* renamed from: b */
        public final boolean f17594b;

        /* renamed from: c */
        public final int f17595c;

        public C3260a(long j, boolean z, int i) {
            this.f17593a = j;
            this.f17594b = z;
            this.f17595c = i;
        }
    }

    /* renamed from: sb2$b */
    /* compiled from: FragmentedMp4Extractor */
    public static final class C3261b {

        /* renamed from: a */
        public final zs6 f17596a;

        /* renamed from: b */
        public final ts6 f17597b = new ts6();

        /* renamed from: c */
        public final gm4 f17598c = new gm4();

        /* renamed from: d */
        public at6 f17599d;

        /* renamed from: e */
        public n91 f17600e;

        /* renamed from: f */
        public int f17601f;

        /* renamed from: g */
        public int f17602g;

        /* renamed from: h */
        public int f17603h;

        /* renamed from: i */
        public int f17604i;

        /* renamed from: j */
        public final gm4 f17605j = new gm4(1);

        /* renamed from: k */
        public final gm4 f17606k = new gm4();

        /* renamed from: l */
        public boolean f17607l;

        public C3261b(zs6 zs6, at6 at6, n91 n91) {
            this.f17596a = zs6;
            this.f17599d = at6;
            this.f17600e = n91;
            mo25733j(at6, n91);
        }

        /* renamed from: c */
        public int mo25726c() {
            int i;
            if (!this.f17607l) {
                i = this.f17599d.f7759g[this.f17601f];
            } else if (this.f17597b.f18235k[this.f17601f]) {
                i = 1;
            } else {
                i = 0;
            }
            if (mo25730g() != null) {
                return i | 1073741824;
            }
            return i;
        }

        /* renamed from: d */
        public long mo25727d() {
            if (!this.f17607l) {
                return this.f17599d.f7755c[this.f17601f];
            }
            return this.f17597b.f18231g[this.f17603h];
        }

        /* renamed from: e */
        public long mo25728e() {
            if (!this.f17607l) {
                return this.f17599d.f7758f[this.f17601f];
            }
            return this.f17597b.mo26538c(this.f17601f);
        }

        /* renamed from: f */
        public int mo25729f() {
            if (!this.f17607l) {
                return this.f17599d.f7756d[this.f17601f];
            }
            return this.f17597b.f18233i[this.f17601f];
        }

        /* renamed from: g */
        public rs6 mo25730g() {
            if (!this.f17607l) {
                return null;
            }
            int i = ((n91) w67.m29360j(this.f17597b.f18225a)).f15377a;
            rs6 rs6 = this.f17597b.f18238n;
            if (rs6 == null) {
                rs6 = this.f17599d.f7753a.mo25270a(i);
            }
            if (rs6 == null || !rs6.f17361a) {
                return null;
            }
            return rs6;
        }

        /* renamed from: h */
        public boolean mo25731h() {
            this.f17601f++;
            if (!this.f17607l) {
                return false;
            }
            int i = this.f17602g + 1;
            this.f17602g = i;
            int[] iArr = this.f17597b.f18232h;
            int i2 = this.f17603h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f17603h = i2 + 1;
            this.f17602g = 0;
            return false;
        }

        /* renamed from: i */
        public int mo25732i(int i, int i2) {
            gm4 gm4;
            boolean z;
            int i3;
            rs6 g = mo25730g();
            if (g == null) {
                return 0;
            }
            int i4 = g.f17364d;
            if (i4 != 0) {
                gm4 = this.f17597b.f18239o;
            } else {
                byte[] bArr = (byte[]) w67.m29360j(g.f17365e);
                this.f17606k.mo20672N(bArr, bArr.length);
                gm4 gm42 = this.f17606k;
                i4 = bArr.length;
                gm4 = gm42;
            }
            boolean g2 = this.f17597b.mo26542g(this.f17601f);
            if (g2 || i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            byte[] d = this.f17605j.mo20679d();
            if (z) {
                i3 = 128;
            } else {
                i3 = 0;
            }
            d[0] = (byte) (i3 | i4);
            this.f17605j.mo20674P(0);
            this.f17596a.mo7302c(this.f17605j, 1, 1);
            this.f17596a.mo7302c(gm4, i4, 1);
            if (!z) {
                return i4 + 1;
            }
            if (!g2) {
                this.f17598c.mo20670L(8);
                byte[] d2 = this.f17598c.mo20679d();
                d2[0] = 0;
                d2[1] = 1;
                d2[2] = (byte) ((i2 >> 8) & 255);
                d2[3] = (byte) (i2 & 255);
                d2[4] = (byte) ((i >> 24) & 255);
                d2[5] = (byte) ((i >> 16) & 255);
                d2[6] = (byte) ((i >> 8) & 255);
                d2[7] = (byte) (i & 255);
                this.f17596a.mo7302c(this.f17598c, 8, 1);
                return i4 + 1 + 8;
            }
            gm4 gm43 = this.f17597b.f18239o;
            int J = gm43.mo20668J();
            gm43.mo20675Q(-2);
            int i5 = (J * 6) + 2;
            if (i2 != 0) {
                this.f17598c.mo20670L(i5);
                byte[] d3 = this.f17598c.mo20679d();
                gm43.mo20685j(d3, 0, i5);
                int i6 = (((d3[2] & 255) << 8) | (d3[3] & 255)) + i2;
                d3[2] = (byte) ((i6 >> 8) & 255);
                d3[3] = (byte) (i6 & 255);
                gm43 = this.f17598c;
            }
            this.f17596a.mo7302c(gm43, i5, 1);
            return i4 + 1 + i5;
        }

        /* renamed from: j */
        public void mo25733j(at6 at6, n91 n91) {
            this.f17599d = at6;
            this.f17600e = n91;
            this.f17596a.mo7303d(at6.f7753a.f17058f);
            mo25734k();
        }

        /* renamed from: k */
        public void mo25734k() {
            this.f17597b.mo26541f();
            this.f17601f = 0;
            this.f17603h = 0;
            this.f17602g = 0;
            this.f17604i = 0;
            this.f17607l = false;
        }

        /* renamed from: l */
        public void mo25735l(long j) {
            int i = this.f17601f;
            while (true) {
                ts6 ts6 = this.f17597b;
                if (i < ts6.f18230f && ts6.mo26538c(i) < j) {
                    if (this.f17597b.f18235k[i]) {
                        this.f17604i = i;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: m */
        public void mo25736m() {
            rs6 g = mo25730g();
            if (g != null) {
                gm4 gm4 = this.f17597b.f18239o;
                int i = g.f17364d;
                if (i != 0) {
                    gm4.mo20675Q(i);
                }
                if (this.f17597b.mo26542g(this.f17601f)) {
                    gm4.mo20675Q(gm4.mo20668J() * 6);
                }
            }
        }

        /* renamed from: n */
        public void mo25737n(DrmInitData drmInitData) {
            String str;
            rs6 a = this.f17599d.f7753a.mo25270a(((n91) w67.m29360j(this.f17597b.f18225a)).f15377a);
            if (a != null) {
                str = a.f17362b;
            } else {
                str = null;
            }
            this.f17596a.mo7303d(this.f17599d.f7753a.f17058f.mo6636b().mo6652M(drmInitData.mo6519c(str)).mo6644E());
        }
    }

    public sb2() {
        this(0);
    }

    /* renamed from: A */
    public static void m26784A(gm4 gm4, ts6 ts6) throws ParserException {
        m26805z(gm4, 0, ts6);
    }

    /* renamed from: B */
    public static Pair<Long, se0> m26785B(gm4 gm4, long j) throws ParserException {
        long j2;
        long j3;
        gm4 gm42 = gm4;
        gm42.mo20674P(8);
        int c = C2420gs.m18384c(gm4.mo20689n());
        gm42.mo20675Q(4);
        long F = gm4.mo20664F();
        if (c == 0) {
            j3 = gm4.mo20664F();
            j2 = gm4.mo20664F();
        } else {
            j3 = gm4.mo20667I();
            j2 = gm4.mo20667I();
        }
        long j4 = j3;
        long j5 = j + j2;
        long J0 = w67.m29313J0(j4, 1000000, F);
        gm42.mo20675Q(2);
        int J = gm4.mo20668J();
        int[] iArr = new int[J];
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        long[] jArr3 = new long[J];
        long j6 = J0;
        long j7 = j4;
        int i = 0;
        long j8 = j7;
        while (i < J) {
            int n = gm4.mo20689n();
            if ((n & Integer.MIN_VALUE) == 0) {
                long F2 = gm4.mo20664F();
                iArr[i] = n & Integer.MAX_VALUE;
                jArr[i] = j5;
                jArr3[i] = j6;
                long j9 = j8 + F2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i2 = J;
                int[] iArr2 = iArr;
                long J02 = w67.m29313J0(j9, 1000000, F);
                jArr4[i] = J02 - jArr5[i];
                gm42.mo20675Q(4);
                j5 += (long) iArr2[i];
                i++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                J = i2;
                long j10 = J02;
                j8 = j9;
                j6 = j10;
            } else {
                throw ParserException.createForMalformedContainer("Unhandled indirect reference", (Throwable) null);
            }
        }
        return Pair.create(Long.valueOf(J0), new se0(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: C */
    public static long m26786C(gm4 gm4) {
        gm4.mo20674P(8);
        if (C2420gs.m18384c(gm4.mo20689n()) == 1) {
            return gm4.mo20667I();
        }
        return gm4.mo20664F();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.util.SparseArray, android.util.SparseArray<sb2$b>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.sb2.C3261b m26787D(p000.gm4 r4, android.util.SparseArray<p000.sb2.C3261b> r5, boolean r6) {
        /*
            r0 = 8
            r4.mo20674P(r0)
            int r0 = r4.mo20689n()
            int r0 = p000.C2420gs.m18383b(r0)
            int r1 = r4.mo20689n()
            if (r6 == 0) goto L_0x0019
            r6 = 0
            java.lang.Object r5 = r5.valueAt(r6)
            goto L_0x001d
        L_0x0019:
            java.lang.Object r5 = r5.get(r1)
        L_0x001d:
            sb2$b r5 = (p000.sb2.C3261b) r5
            if (r5 != 0) goto L_0x0023
            r4 = 0
            return r4
        L_0x0023:
            r6 = r0 & 1
            if (r6 == 0) goto L_0x0031
            long r1 = r4.mo20667I()
            ts6 r6 = r5.f17597b
            r6.f18227c = r1
            r6.f18228d = r1
        L_0x0031:
            n91 r6 = r5.f17600e
            r1 = r0 & 2
            if (r1 == 0) goto L_0x003e
            int r1 = r4.mo20689n()
            int r1 = r1 + -1
            goto L_0x0040
        L_0x003e:
            int r1 = r6.f15377a
        L_0x0040:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0049
            int r2 = r4.mo20689n()
            goto L_0x004b
        L_0x0049:
            int r2 = r6.f15378b
        L_0x004b:
            r3 = r0 & 16
            if (r3 == 0) goto L_0x0054
            int r3 = r4.mo20689n()
            goto L_0x0056
        L_0x0054:
            int r3 = r6.f15379c
        L_0x0056:
            r0 = r0 & 32
            if (r0 == 0) goto L_0x005f
            int r4 = r4.mo20689n()
            goto L_0x0061
        L_0x005f:
            int r4 = r6.f15380d
        L_0x0061:
            ts6 r6 = r5.f17597b
            n91 r0 = new n91
            r0.<init>(r1, r2, r3, r4)
            r6.f18225a = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sb2.m26787D(gm4, android.util.SparseArray, boolean):sb2$b");
    }

    /* renamed from: E */
    public static void m26788E(C2420gs.C2421a aVar, SparseArray<C3261b> sparseArray, boolean z, int i, byte[] bArr) throws ParserException {
        String str;
        C3261b D = m26787D(((C2420gs.C2422b) C2725kr.m20985e(aVar.mo20826g(1952868452))).f12588b, sparseArray, z);
        if (D != null) {
            ts6 ts6 = D.f17597b;
            long j = ts6.f18241q;
            boolean z2 = ts6.f18242r;
            D.mo25734k();
            boolean unused = D.f17607l = true;
            C2420gs.C2422b g = aVar.mo20826g(1952867444);
            if (g == null || (i & 2) != 0) {
                ts6.f18241q = j;
                ts6.f18242r = z2;
            } else {
                ts6.f18241q = m26786C(g.f12588b);
                ts6.f18242r = true;
            }
            m26791H(aVar, D, i);
            rs6 a = D.f17599d.f7753a.mo25270a(((n91) C2725kr.m20985e(ts6.f18225a)).f15377a);
            C2420gs.C2422b g2 = aVar.mo20826g(1935763834);
            if (g2 != null) {
                m26803x((rs6) C2725kr.m20985e(a), g2.f12588b, ts6);
            }
            C2420gs.C2422b g3 = aVar.mo20826g(1935763823);
            if (g3 != null) {
                m26802w(g3.f12588b, ts6);
            }
            C2420gs.C2422b g4 = aVar.mo20826g(1936027235);
            if (g4 != null) {
                m26784A(g4.f12588b, ts6);
            }
            if (a != null) {
                str = a.f17362b;
            } else {
                str = null;
            }
            m26804y(aVar, str, ts6);
            int size = aVar.f12586c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2420gs.C2422b bVar = aVar.f12586c.get(i2);
                if (bVar.f12584a == 1970628964) {
                    m26792I(bVar.f12588b, ts6, bArr);
                }
            }
        }
    }

    /* renamed from: F */
    public static Pair<Integer, n91> m26789F(gm4 gm4) {
        gm4.mo20674P(12);
        return Pair.create(Integer.valueOf(gm4.mo20689n()), new n91(gm4.mo20689n() - 1, gm4.mo20689n(), gm4.mo20689n(), gm4.mo20689n()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m26790G(p000.sb2.C3261b r34, int r35, int r36, p000.gm4 r37, int r38) throws androidx.media3.common.ParserException {
        /*
            r0 = r34
            r1 = 8
            r2 = r37
            r2.mo20674P(r1)
            int r1 = r37.mo20689n()
            int r1 = p000.C2420gs.m18383b(r1)
            at6 r3 = r0.f17599d
            qs6 r3 = r3.f7753a
            ts6 r4 = r0.f17597b
            n91 r5 = r4.f18225a
            java.lang.Object r5 = p000.w67.m29360j(r5)
            n91 r5 = (p000.n91) r5
            int[] r6 = r4.f18232h
            int r7 = r37.mo20666H()
            r6[r35] = r7
            long[] r6 = r4.f18231g
            long r7 = r4.f18227c
            r6[r35] = r7
            r9 = r1 & 1
            if (r9 == 0) goto L_0x0039
            int r9 = r37.mo20689n()
            long r9 = (long) r9
            long r7 = r7 + r9
            r6[r35] = r7
        L_0x0039:
            r6 = r1 & 4
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0041
            r6 = r8
            goto L_0x0042
        L_0x0041:
            r6 = r7
        L_0x0042:
            int r9 = r5.f15380d
            if (r6 == 0) goto L_0x004a
            int r9 = r37.mo20689n()
        L_0x004a:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0050
            r10 = r8
            goto L_0x0051
        L_0x0050:
            r10 = r7
        L_0x0051:
            r11 = r1 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0057
            r11 = r8
            goto L_0x0058
        L_0x0057:
            r11 = r7
        L_0x0058:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005e
            r12 = r8
            goto L_0x005f
        L_0x005e:
            r12 = r7
        L_0x005f:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0065
            r1 = r8
            goto L_0x0066
        L_0x0065:
            r1 = r7
        L_0x0066:
            long[] r13 = r3.f17060h
            if (r13 == 0) goto L_0x0080
            int r14 = r13.length
            if (r14 != r8) goto L_0x0080
            r14 = r13[r7]
            r16 = 0
            int r13 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x0082
            long[] r13 = r3.f17061i
            java.lang.Object r13 = p000.w67.m29360j(r13)
            long[] r13 = (long[]) r13
            r14 = r13[r7]
            goto L_0x0084
        L_0x0080:
            r16 = 0
        L_0x0082:
            r14 = r16
        L_0x0084:
            int[] r13 = r4.f18233i
            long[] r7 = r4.f18234j
            boolean[] r8 = r4.f18235k
            int r2 = r3.f17054b
            r18 = r9
            r9 = 2
            if (r2 != r9) goto L_0x0098
            r2 = 1
            r9 = r36 & 1
            if (r9 == 0) goto L_0x0098
            r2 = 1
            goto L_0x0099
        L_0x0098:
            r2 = 0
        L_0x0099:
            int[] r9 = r4.f18232h
            r9 = r9[r35]
            int r9 = r38 + r9
            r36 = r2
            long r2 = r3.f17055c
            r25 = r7
            r26 = r8
            long r7 = r4.f18241q
            r27 = r2
            r2 = r7
            r7 = r38
        L_0x00ae:
            if (r7 >= r9) goto L_0x013b
            if (r10 == 0) goto L_0x00b7
            int r8 = r37.mo20689n()
            goto L_0x00b9
        L_0x00b7:
            int r8 = r5.f15378b
        L_0x00b9:
            int r8 = m26796f(r8)
            if (r11 == 0) goto L_0x00c6
            int r19 = r37.mo20689n()
            r29 = r10
            goto L_0x00cc
        L_0x00c6:
            r29 = r10
            int r10 = r5.f15379c
            r19 = r10
        L_0x00cc:
            int r10 = m26796f(r19)
            if (r12 == 0) goto L_0x00db
            int r19 = r37.mo20689n()
            r30 = r6
            r6 = r19
            goto L_0x00e8
        L_0x00db:
            if (r7 != 0) goto L_0x00e4
            if (r6 == 0) goto L_0x00e4
            r30 = r6
            r6 = r18
            goto L_0x00e8
        L_0x00e4:
            r30 = r6
            int r6 = r5.f15380d
        L_0x00e8:
            if (r1 == 0) goto L_0x00f7
            int r19 = r37.mo20689n()
            r31 = r1
            r32 = r11
            r33 = r12
            r1 = r19
            goto L_0x00fe
        L_0x00f7:
            r31 = r1
            r32 = r11
            r33 = r12
            r1 = 0
        L_0x00fe:
            long r11 = (long) r1
            long r11 = r11 + r2
            long r19 = r11 - r14
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r23 = r27
            long r11 = p000.w67.m29313J0(r19, r21, r23)
            r25[r7] = r11
            boolean r1 = r4.f18242r
            if (r1 != 0) goto L_0x0118
            at6 r1 = r0.f17599d
            long r0 = r1.f7760h
            long r11 = r11 + r0
            r25[r7] = r11
        L_0x0118:
            r13[r7] = r10
            int r0 = r6 >> 16
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0126
            if (r36 == 0) goto L_0x0124
            if (r7 != 0) goto L_0x0126
        L_0x0124:
            r0 = r1
            goto L_0x0127
        L_0x0126:
            r0 = 0
        L_0x0127:
            r26[r7] = r0
            long r10 = (long) r8
            long r2 = r2 + r10
            int r7 = r7 + 1
            r0 = r34
            r10 = r29
            r6 = r30
            r1 = r31
            r11 = r32
            r12 = r33
            goto L_0x00ae
        L_0x013b:
            r4.f18241q = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sb2.m26790G(sb2$b, int, int, gm4, int):int");
    }

    /* renamed from: H */
    public static void m26791H(C2420gs.C2421a aVar, C3261b bVar, int i) throws ParserException {
        List<C2420gs.C2422b> list = aVar.f12586c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C2420gs.C2422b bVar2 = list.get(i4);
            if (bVar2.f12584a == 1953658222) {
                gm4 gm4 = bVar2.f12588b;
                gm4.mo20674P(12);
                int H = gm4.mo20666H();
                if (H > 0) {
                    i3 += H;
                    i2++;
                }
            }
        }
        bVar.f17603h = 0;
        bVar.f17602g = 0;
        bVar.f17601f = 0;
        bVar.f17597b.mo26540e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C2420gs.C2422b bVar3 = list.get(i7);
            if (bVar3.f12584a == 1953658222) {
                i6 = m26790G(bVar, i5, i, bVar3.f12588b, i6);
                i5++;
            }
        }
    }

    /* renamed from: I */
    public static void m26792I(gm4 gm4, ts6 ts6, byte[] bArr) throws ParserException {
        gm4.mo20674P(8);
        gm4.mo20685j(bArr, 0, 16);
        if (Arrays.equals(bArr, f17557J)) {
            m26805z(gm4, 16, ts6);
        }
    }

    /* renamed from: O */
    public static boolean m26793O(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* renamed from: P */
    public static boolean m26794P(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    /* renamed from: f */
    public static int m26796f(int i) throws ParserException {
        if (i >= 0) {
            return i;
        }
        throw ParserException.createForMalformedContainer("Unexpected negative value: " + i, (Throwable) null);
    }

    /* renamed from: i */
    public static DrmInitData m26797i(List<C2420gs.C2422b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C2420gs.C2422b bVar = list.get(i);
            if (bVar.f12584a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d = bVar.f12588b.mo20679d();
                UUID f = sy4.m27191f(d);
                if (f == null) {
                    gk3.m18132i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(f, "video/mp4", d));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData((List<DrmInitData.SchemeData>) arrayList);
    }

    /* renamed from: k */
    public static C3261b m26798k(SparseArray<C3261b> sparseArray) {
        int size = sparseArray.size();
        C3261b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C3261b valueAt = sparseArray.valueAt(i);
            if ((valueAt.f17607l || valueAt.f17601f != valueAt.f17599d.f7754b) && (!valueAt.f17607l || valueAt.f17603h != valueAt.f17597b.f18229e)) {
                long d = valueAt.mo25727d();
                if (d < j) {
                    bVar = valueAt;
                    j = d;
                }
            }
        }
        return bVar;
    }

    /* renamed from: m */
    public static /* synthetic */ hy1[] m26799m() {
        return new hy1[]{new sb2()};
    }

    /* renamed from: u */
    public static long m26800u(gm4 gm4) {
        gm4.mo20674P(8);
        if (C2420gs.m18384c(gm4.mo20689n()) == 0) {
            return gm4.mo20664F();
        }
        return gm4.mo20667I();
    }

    /* renamed from: v */
    public static void m26801v(C2420gs.C2421a aVar, SparseArray<C3261b> sparseArray, boolean z, int i, byte[] bArr) throws ParserException {
        int size = aVar.f12587d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2420gs.C2421a aVar2 = aVar.f12587d.get(i2);
            if (aVar2.f12584a == 1953653094) {
                m26788E(aVar2, sparseArray, z, i, bArr);
            }
        }
    }

    /* renamed from: w */
    public static void m26802w(gm4 gm4, ts6 ts6) throws ParserException {
        long j;
        gm4.mo20674P(8);
        int n = gm4.mo20689n();
        if ((C2420gs.m18383b(n) & 1) == 1) {
            gm4.mo20675Q(8);
        }
        int H = gm4.mo20666H();
        if (H == 1) {
            int c = C2420gs.m18384c(n);
            long j2 = ts6.f18228d;
            if (c == 0) {
                j = gm4.mo20664F();
            } else {
                j = gm4.mo20667I();
            }
            ts6.f18228d = j2 + j;
            return;
        }
        throw ParserException.createForMalformedContainer("Unexpected saio entry count: " + H, (Throwable) null);
    }

    /* renamed from: x */
    public static void m26803x(rs6 rs6, gm4 gm4, ts6 ts6) throws ParserException {
        int i;
        boolean z;
        int i2 = rs6.f17364d;
        gm4.mo20674P(8);
        boolean z2 = true;
        if ((C2420gs.m18383b(gm4.mo20689n()) & 1) == 1) {
            gm4.mo20675Q(8);
        }
        int D = gm4.mo20662D();
        int H = gm4.mo20666H();
        if (H <= ts6.f18230f) {
            if (D == 0) {
                boolean[] zArr = ts6.f18237m;
                i = 0;
                for (int i3 = 0; i3 < H; i3++) {
                    int D2 = gm4.mo20662D();
                    i += D2;
                    if (D2 > i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zArr[i3] = z;
                }
            } else {
                if (D <= i2) {
                    z2 = false;
                }
                i = (D * H) + 0;
                Arrays.fill(ts6.f18237m, 0, H, z2);
            }
            Arrays.fill(ts6.f18237m, H, ts6.f18230f, false);
            if (i > 0) {
                ts6.mo26539d(i);
                return;
            }
            return;
        }
        throw ParserException.createForMalformedContainer("Saiz sample count " + H + " is greater than fragment sample count" + ts6.f18230f, (Throwable) null);
    }

    /* renamed from: y */
    public static void m26804y(C2420gs.C2421a aVar, String str, ts6 ts6) throws ParserException {
        boolean z;
        C2420gs.C2421a aVar2 = aVar;
        ts6 ts62 = ts6;
        byte[] bArr = null;
        gm4 gm4 = null;
        gm4 gm42 = null;
        for (int i = 0; i < aVar2.f12586c.size(); i++) {
            C2420gs.C2422b bVar = aVar2.f12586c.get(i);
            gm4 gm43 = bVar.f12588b;
            int i2 = bVar.f12584a;
            if (i2 == 1935828848) {
                gm43.mo20674P(12);
                if (gm43.mo20689n() == 1936025959) {
                    gm4 = gm43;
                }
            } else if (i2 == 1936158820) {
                gm43.mo20674P(12);
                if (gm43.mo20689n() == 1936025959) {
                    gm42 = gm43;
                }
            }
        }
        if (gm4 != null && gm42 != null) {
            gm4.mo20674P(8);
            int c = C2420gs.m18384c(gm4.mo20689n());
            gm4.mo20675Q(4);
            if (c == 1) {
                gm4.mo20675Q(4);
            }
            if (gm4.mo20689n() == 1) {
                gm42.mo20674P(8);
                int c2 = C2420gs.m18384c(gm42.mo20689n());
                gm42.mo20675Q(4);
                if (c2 == 1) {
                    if (gm42.mo20664F() == 0) {
                        throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c2 >= 2) {
                    gm42.mo20675Q(4);
                }
                if (gm42.mo20664F() == 1) {
                    gm42.mo20675Q(1);
                    int D = gm42.mo20662D();
                    int i3 = (D & 240) >> 4;
                    int i4 = D & 15;
                    if (gm42.mo20662D() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int D2 = gm42.mo20662D();
                        byte[] bArr2 = new byte[16];
                        gm42.mo20685j(bArr2, 0, 16);
                        if (D2 == 0) {
                            int D3 = gm42.mo20662D();
                            bArr = new byte[D3];
                            gm42.mo20685j(bArr, 0, D3);
                        }
                        ts62.f18236l = true;
                        ts62.f18238n = new rs6(z, str, D2, bArr2, i3, i4, bArr);
                        return;
                    }
                    return;
                }
                throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
            }
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
    }

    /* renamed from: z */
    public static void m26805z(gm4 gm4, int i, ts6 ts6) throws ParserException {
        boolean z;
        gm4.mo20674P(i + 8);
        int b = C2420gs.m18383b(gm4.mo20689n());
        if ((b & 1) == 0) {
            if ((b & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int H = gm4.mo20666H();
            if (H == 0) {
                Arrays.fill(ts6.f18237m, 0, ts6.f18230f, false);
            } else if (H == ts6.f18230f) {
                Arrays.fill(ts6.f18237m, 0, H, z);
                ts6.mo26539d(gm4.mo20676a());
                ts6.mo26537b(gm4);
            } else {
                throw ParserException.createForMalformedContainer("Senc sample count " + H + " is different from fragment sample count" + ts6.f18230f, (Throwable) null);
            }
        } else {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    /* renamed from: J */
    public final void mo25711J(long j) throws ParserException {
        while (!this.f17579m.isEmpty() && this.f17579m.peek().f12585b == j) {
            mo25720o(this.f17579m.pop());
        }
        mo25716g();
    }

    /* renamed from: K */
    public final boolean mo25712K(iy1 iy1) throws IOException {
        if (this.f17585s == 0) {
            if (!iy1.mo86f(this.f17578l.mo20679d(), 0, 8, true)) {
                return false;
            }
            this.f17585s = 8;
            this.f17578l.mo20674P(0);
            this.f17584r = this.f17578l.mo20664F();
            this.f17583q = this.f17578l.mo20689n();
        }
        long j = this.f17584r;
        if (j == 1) {
            iy1.readFully(this.f17578l.mo20679d(), 8, 8);
            this.f17585s += 8;
            this.f17584r = this.f17578l.mo20667I();
        } else if (j == 0) {
            long length = iy1.getLength();
            if (length == -1 && !this.f17579m.isEmpty()) {
                length = this.f17579m.peek().f12585b;
            }
            if (length != -1) {
                this.f17584r = (length - iy1.getPosition()) + ((long) this.f17585s);
            }
        }
        if (this.f17584r >= ((long) this.f17585s)) {
            long position = iy1.getPosition() - ((long) this.f17585s);
            int i = this.f17583q;
            if ((i == 1836019558 || i == 1835295092) && !this.f17566H) {
                this.f17563E.mo7715g(new xs5.C3642b(this.f17590x, position));
                this.f17566H = true;
            }
            if (this.f17583q == 1836019558) {
                int size = this.f17570d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ts6 ts6 = this.f17570d.valueAt(i2).f17597b;
                    ts6.f18226b = position;
                    ts6.f18228d = position;
                    ts6.f18227c = position;
                }
            }
            int i3 = this.f17583q;
            if (i3 == 1835295092) {
                this.f17592z = null;
                this.f17587u = position + this.f17584r;
                this.f17582p = 2;
                return true;
            }
            if (m26793O(i3)) {
                long position2 = (iy1.getPosition() + this.f17584r) - 8;
                this.f17579m.push(new C2420gs.C2421a(this.f17583q, position2));
                if (this.f17584r == ((long) this.f17585s)) {
                    mo25711J(position2);
                } else {
                    mo25716g();
                }
            } else if (m26794P(this.f17583q)) {
                if (this.f17585s == 8) {
                    long j2 = this.f17584r;
                    if (j2 <= 2147483647L) {
                        gm4 gm4 = new gm4((int) j2);
                        System.arraycopy(this.f17578l.mo20679d(), 0, gm4.mo20679d(), 0, 8);
                        this.f17586t = gm4;
                        this.f17582p = 1;
                    } else {
                        throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f17584r <= 2147483647L) {
                this.f17586t = null;
                this.f17582p = 1;
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
    }

    /* renamed from: L */
    public final void mo25713L(iy1 iy1) throws IOException {
        int i = ((int) this.f17584r) - this.f17585s;
        gm4 gm4 = this.f17586t;
        if (gm4 != null) {
            iy1.readFully(gm4.mo20679d(), 8, i);
            mo25722q(new C2420gs.C2422b(this.f17583q, gm4), iy1.getPosition());
        } else {
            iy1.mo92k(i);
        }
        mo25711J(iy1.getPosition());
    }

    /* renamed from: M */
    public final void mo25714M(iy1 iy1) throws IOException {
        int size = this.f17570d.size();
        long j = Long.MAX_VALUE;
        C3261b bVar = null;
        for (int i = 0; i < size; i++) {
            ts6 ts6 = this.f17570d.valueAt(i).f17597b;
            if (ts6.f18240p) {
                long j2 = ts6.f18228d;
                if (j2 < j) {
                    bVar = this.f17570d.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.f17582p = 3;
            return;
        }
        int position = (int) (j - iy1.getPosition());
        if (position >= 0) {
            iy1.mo92k(position);
            bVar.f17597b.mo26536a(iy1);
            return;
        }
        throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25715N(p000.iy1 r17) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sb2$b r2 = r0.f17592z
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L_0x0043
            android.util.SparseArray<sb2$b> r2 = r0.f17570d
            sb2$b r2 = m26798k(r2)
            if (r2 != 0) goto L_0x002a
            long r5 = r0.f17587u
            long r7 = r17.getPosition()
            long r5 = r5 - r7
            int r2 = (int) r5
            if (r2 < 0) goto L_0x0023
            r1.mo92k(r2)
            r16.mo25716g()
            return r4
        L_0x0023:
            java.lang.String r1 = "Offset to end of mdat was negative."
            androidx.media3.common.ParserException r1 = androidx.media3.common.ParserException.createForMalformedContainer(r1, r3)
            throw r1
        L_0x002a:
            long r5 = r2.mo25727d()
            long r7 = r17.getPosition()
            long r5 = r5 - r7
            int r5 = (int) r5
            if (r5 >= 0) goto L_0x003e
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Ignoring negative offset to sample data."
            p000.gk3.m18132i(r5, r6)
            r5 = r4
        L_0x003e:
            r1.mo92k(r5)
            r0.f17592z = r2
        L_0x0043:
            int r5 = r0.f17582p
            r6 = 3
            r7 = 4
            r8 = 1
            if (r5 != r6) goto L_0x00b7
            int r5 = r2.mo25729f()
            r0.f17559A = r5
            int r9 = r2.f17601f
            int r10 = r2.f17604i
            if (r9 >= r10) goto L_0x0067
            r1.mo92k(r5)
            r2.mo25736m()
            boolean r1 = r2.mo25731h()
            if (r1 != 0) goto L_0x0064
            r0.f17592z = r3
        L_0x0064:
            r0.f17582p = r6
            return r8
        L_0x0067:
            at6 r9 = r2.f17599d
            qs6 r9 = r9.f7753a
            int r9 = r9.f17059g
            if (r9 != r8) goto L_0x0077
            r9 = 8
            int r5 = r5 - r9
            r0.f17559A = r5
            r1.mo92k(r9)
        L_0x0077:
            at6 r5 = r2.f17599d
            qs6 r5 = r5.f7753a
            androidx.media3.common.h r5 = r5.f17058f
            java.lang.String r5 = r5.f4175C
            java.lang.String r9 = "audio/ac4"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x00a4
            int r5 = r0.f17559A
            r9 = 7
            int r5 = r2.mo25732i(r5, r9)
            r0.f17560B = r5
            int r5 = r0.f17559A
            gm4 r10 = r0.f17575i
            p000.C3467v7.m28675a(r5, r10)
            zs6 r5 = r2.f17596a
            gm4 r10 = r0.f17575i
            r5.mo7300a(r10, r9)
            int r5 = r0.f17560B
            int r5 = r5 + r9
            r0.f17560B = r5
            goto L_0x00ac
        L_0x00a4:
            int r5 = r0.f17559A
            int r5 = r2.mo25732i(r5, r4)
            r0.f17560B = r5
        L_0x00ac:
            int r5 = r0.f17559A
            int r9 = r0.f17560B
            int r5 = r5 + r9
            r0.f17559A = r5
            r0.f17582p = r7
            r0.f17561C = r4
        L_0x00b7:
            at6 r5 = r2.f17599d
            qs6 r5 = r5.f7753a
            zs6 r9 = r2.f17596a
            long r10 = r2.mo25728e()
            sq6 r12 = r0.f17576j
            if (r12 == 0) goto L_0x00c9
            long r10 = r12.mo25932a(r10)
        L_0x00c9:
            r14 = r10
            int r10 = r5.f17062j
            if (r10 == 0) goto L_0x0195
            gm4 r10 = r0.f17572f
            byte[] r10 = r10.mo20679d()
            r10[r4] = r4
            r10[r8] = r4
            r11 = 2
            r10[r11] = r4
            int r11 = r5.f17062j
            int r12 = r11 + 1
            int r11 = 4 - r11
        L_0x00e1:
            int r13 = r0.f17560B
            int r6 = r0.f17559A
            if (r13 >= r6) goto L_0x01a6
            int r6 = r0.f17561C
            if (r6 != 0) goto L_0x0138
            r1.readFully(r10, r11, r12)
            gm4 r6 = r0.f17572f
            r6.mo20674P(r4)
            gm4 r6 = r0.f17572f
            int r6 = r6.mo20689n()
            if (r6 < r8) goto L_0x0131
            int r6 = r6 + -1
            r0.f17561C = r6
            gm4 r6 = r0.f17571e
            r6.mo20674P(r4)
            gm4 r6 = r0.f17571e
            r9.mo7300a(r6, r7)
            gm4 r6 = r0.f17572f
            r9.mo7300a(r6, r8)
            zs6[] r6 = r0.f17565G
            int r6 = r6.length
            if (r6 <= 0) goto L_0x0121
            androidx.media3.common.h r6 = r5.f17058f
            java.lang.String r6 = r6.f4175C
            byte r13 = r10[r7]
            boolean r6 = p000.q24.m25338g(r6, r13)
            if (r6 == 0) goto L_0x0121
            r6 = r8
            goto L_0x0122
        L_0x0121:
            r6 = r4
        L_0x0122:
            r0.f17562D = r6
            int r6 = r0.f17560B
            int r6 = r6 + 5
            r0.f17560B = r6
            int r6 = r0.f17559A
            int r6 = r6 + r11
            r0.f17559A = r6
            r6 = 3
            goto L_0x00e1
        L_0x0131:
            java.lang.String r1 = "Invalid NAL length"
            androidx.media3.common.ParserException r1 = androidx.media3.common.ParserException.createForMalformedContainer(r1, r3)
            throw r1
        L_0x0138:
            boolean r13 = r0.f17562D
            if (r13 == 0) goto L_0x0181
            gm4 r13 = r0.f17573g
            r13.mo20670L(r6)
            gm4 r6 = r0.f17573g
            byte[] r6 = r6.mo20679d()
            int r13 = r0.f17561C
            r1.readFully(r6, r4, r13)
            gm4 r6 = r0.f17573g
            int r13 = r0.f17561C
            r9.mo7300a(r6, r13)
            int r6 = r0.f17561C
            gm4 r13 = r0.f17573g
            byte[] r13 = r13.mo20679d()
            gm4 r7 = r0.f17573g
            int r7 = r7.mo20681f()
            int r7 = p000.q24.m25348q(r13, r7)
            gm4 r13 = r0.f17573g
            androidx.media3.common.h r8 = r5.f17058f
            java.lang.String r8 = r8.f4175C
            java.lang.String r3 = "video/hevc"
            boolean r3 = r3.equals(r8)
            r13.mo20674P(r3)
            gm4 r3 = r0.f17573g
            r3.mo20673O(r7)
            gm4 r3 = r0.f17573g
            zs6[] r7 = r0.f17565G
            p000.jc0.m20068a(r14, r3, r7)
            goto L_0x0185
        L_0x0181:
            int r6 = r9.mo7304e(r1, r6, r4)
        L_0x0185:
            int r3 = r0.f17560B
            int r3 = r3 + r6
            r0.f17560B = r3
            int r3 = r0.f17561C
            int r3 = r3 - r6
            r0.f17561C = r3
            r3 = 0
            r6 = 3
            r7 = 4
            r8 = 1
            goto L_0x00e1
        L_0x0195:
            int r3 = r0.f17560B
            int r5 = r0.f17559A
            if (r3 >= r5) goto L_0x01a6
            int r5 = r5 - r3
            int r3 = r9.mo7304e(r1, r5, r4)
            int r5 = r0.f17560B
            int r5 = r5 + r3
            r0.f17560B = r5
            goto L_0x0195
        L_0x01a6:
            int r12 = r2.mo25726c()
            rs6 r1 = r2.mo25730g()
            if (r1 == 0) goto L_0x01b3
            zs6$a r1 = r1.f17363c
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            int r13 = r0.f17559A
            r3 = 0
            r10 = r14
            r4 = r14
            r14 = r3
            r15 = r1
            r9.mo7301b(r10, r12, r13, r14, r15)
            r0.mo25725t(r4)
            boolean r1 = r2.mo25731h()
            if (r1 != 0) goto L_0x01ca
            r1 = 0
            r0.f17592z = r1
        L_0x01ca:
            r1 = 3
            r0.f17582p = r1
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sb2.mo25715N(iy1):boolean");
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        int size = this.f17570d.size();
        for (int i = 0; i < size; i++) {
            this.f17570d.valueAt(i).mo25734k();
        }
        this.f17580n.clear();
        this.f17588v = 0;
        this.f17589w = j2;
        this.f17579m.clear();
        mo25716g();
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        while (true) {
            int i = this.f17582p;
            if (i != 0) {
                if (i == 1) {
                    mo25713L(iy1);
                } else if (i == 2) {
                    mo25714M(iy1);
                } else if (mo25715N(iy1)) {
                    return 0;
                }
            } else if (!mo25712K(iy1)) {
                return -1;
            }
        }
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        return o56.m23680b(iy1);
    }

    /* renamed from: g */
    public final void mo25716g() {
        this.f17582p = 0;
        this.f17585s = 0;
    }

    /* renamed from: h */
    public final n91 mo25717h(SparseArray<n91> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (n91) C2725kr.m20985e(sparseArray.get(i));
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f17563E = jy1;
        mo25716g();
        mo25718l();
        qs6 qs6 = this.f17568b;
        if (qs6 != null) {
            this.f17570d.put(0, new C3261b(jy1.mo7713f(0, qs6.f17054b), new at6(this.f17568b, new long[0], new int[0], 0, new long[0], new int[0], 0), new n91(0, 0, 0, 0)));
            this.f17563E.mo7722p();
        }
    }

    /* renamed from: l */
    public final void mo25718l() {
        int i;
        zs6[] zs6Arr = new zs6[2];
        this.f17564F = zs6Arr;
        zs6 zs6 = this.f17581o;
        int i2 = 0;
        if (zs6 != null) {
            zs6Arr[0] = zs6;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f17567a & 4) != 0) {
            zs6Arr[i] = this.f17563E.mo7713f(100, 5);
            i++;
            i3 = 101;
        }
        zs6[] zs6Arr2 = (zs6[]) w67.m29299C0(this.f17564F, i);
        this.f17564F = zs6Arr2;
        for (zs6 d : zs6Arr2) {
            d.mo7303d(f17558K);
        }
        this.f17565G = new zs6[this.f17569c.size()];
        while (i2 < this.f17565G.length) {
            zs6 f = this.f17563E.mo7713f(i3, 3);
            f.mo7303d(this.f17569c.get(i2));
            this.f17565G[i2] = f;
            i2++;
            i3++;
        }
    }

    /* renamed from: n */
    public qs6 mo25719n(qs6 qs6) {
        return qs6;
    }

    /* renamed from: o */
    public final void mo25720o(C2420gs.C2421a aVar) throws ParserException {
        int i = aVar.f12584a;
        if (i == 1836019574) {
            mo25724s(aVar);
        } else if (i == 1836019558) {
            mo25723r(aVar);
        } else if (!this.f17579m.isEmpty()) {
            this.f17579m.peek().mo20823d(aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25721p(p000.gm4 r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            zs6[] r2 = r0.f17564F
            int r2 = r2.length
            if (r2 != 0) goto L_0x000a
            return
        L_0x000a:
            r2 = 8
            r1.mo20674P(r2)
            int r2 = r28.mo20689n()
            int r2 = p000.C2420gs.m18384c(r2)
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0074
            if (r2 == r3) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentedMp4Extractor"
            p000.gk3.m18132i(r2, r1)
            return
        L_0x0038:
            long r12 = r28.mo20664F()
            long r6 = r28.mo20667I()
            r8 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r12
            long r14 = p000.w67.m29313J0(r6, r8, r10)
            long r6 = r28.mo20664F()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = p000.w67.m29313J0(r6, r8, r10)
            long r8 = r28.mo20664F()
            java.lang.String r2 = r28.mo20699x()
            java.lang.Object r2 = p000.C2725kr.m20985e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r10 = r28.mo20699x()
            java.lang.Object r10 = p000.C2725kr.m20985e(r10)
            java.lang.String r10 = (java.lang.String) r10
            r20 = r2
            r22 = r6
            r24 = r8
            r21 = r10
            r8 = r4
            goto L_0x00be
        L_0x0074:
            java.lang.String r2 = r28.mo20699x()
            java.lang.Object r2 = p000.C2725kr.m20985e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r28.mo20699x()
            java.lang.Object r6 = p000.C2725kr.m20985e(r6)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            long r6 = r28.mo20664F()
            long r11 = r28.mo20664F()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r6
            long r8 = p000.w67.m29313J0(r11, r13, r15)
            long r11 = r0.f17591y
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00a3
            long r11 = r11 + r8
            r17 = r11
            goto L_0x00a5
        L_0x00a3:
            r17 = r4
        L_0x00a5:
            long r11 = r28.mo20664F()
            r13 = 1000(0x3e8, double:4.94E-321)
            r15 = r6
            long r6 = p000.w67.m29313J0(r11, r13, r15)
            long r11 = r28.mo20664F()
            r20 = r2
            r22 = r6
            r21 = r10
            r24 = r11
            r14 = r17
        L_0x00be:
            int r2 = r28.mo20676a()
            byte[] r2 = new byte[r2]
            int r6 = r28.mo20676a()
            r7 = 0
            r1.mo20685j(r2, r7, r6)
            androidx.media3.extractor.metadata.emsg.EventMessage r1 = new androidx.media3.extractor.metadata.emsg.EventMessage
            r19 = r1
            r26 = r2
            r19.<init>(r20, r21, r22, r24, r26)
            gm4 r2 = new gm4
            au1 r6 = r0.f17577k
            byte[] r1 = r6.mo11145a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.mo20676a()
            zs6[] r6 = r0.f17564F
            int r10 = r6.length
            r11 = r7
        L_0x00e8:
            if (r11 >= r10) goto L_0x00f5
            r12 = r6[r11]
            r2.mo20674P(r7)
            r12.mo7300a(r2, r1)
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x00f5:
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0109
            java.util.ArrayDeque<sb2$a> r2 = r0.f17580n
            sb2$a r4 = new sb2$a
            r4.<init>(r8, r3, r1)
            r2.addLast(r4)
            int r2 = r0.f17588v
            int r2 = r2 + r1
            r0.f17588v = r2
            goto L_0x0140
        L_0x0109:
            java.util.ArrayDeque<sb2$a> r2 = r0.f17580n
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0121
            java.util.ArrayDeque<sb2$a> r2 = r0.f17580n
            sb2$a r3 = new sb2$a
            r3.<init>(r14, r7, r1)
            r2.addLast(r3)
            int r2 = r0.f17588v
            int r2 = r2 + r1
            r0.f17588v = r2
            goto L_0x0140
        L_0x0121:
            sq6 r2 = r0.f17576j
            if (r2 == 0) goto L_0x0129
            long r14 = r2.mo25932a(r14)
        L_0x0129:
            zs6[] r2 = r0.f17564F
            int r3 = r2.length
        L_0x012c:
            if (r7 >= r3) goto L_0x0140
            r16 = r2[r7]
            r19 = 1
            r21 = 0
            r22 = 0
            r17 = r14
            r20 = r1
            r16.mo7301b(r17, r19, r20, r21, r22)
            int r7 = r7 + 1
            goto L_0x012c
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sb2.mo25721p(gm4):void");
    }

    /* renamed from: q */
    public final void mo25722q(C2420gs.C2422b bVar, long j) throws ParserException {
        if (!this.f17579m.isEmpty()) {
            this.f17579m.peek().mo20824e(bVar);
            return;
        }
        int i = bVar.f12584a;
        if (i == 1936286840) {
            Pair<Long, se0> B = m26785B(bVar.f12588b, j);
            this.f17591y = ((Long) B.first).longValue();
            this.f17563E.mo7715g((xs5) B.second);
            this.f17566H = true;
        } else if (i == 1701671783) {
            mo25721p(bVar.f12588b);
        }
    }

    /* renamed from: r */
    public final void mo25723r(C2420gs.C2421a aVar) throws ParserException {
        boolean z;
        SparseArray<C3261b> sparseArray = this.f17570d;
        if (this.f17568b != null) {
            z = true;
        } else {
            z = false;
        }
        m26801v(aVar, sparseArray, z, this.f17567a, this.f17574h);
        DrmInitData i = m26797i(aVar.f12586c);
        if (i != null) {
            int size = this.f17570d.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f17570d.valueAt(i2).mo25737n(i);
            }
        }
        if (this.f17589w != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            int size2 = this.f17570d.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f17570d.valueAt(i3).mo25735l(this.f17589w);
            }
            this.f17589w = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
    }

    /* renamed from: s */
    public final void mo25724s(C2420gs.C2421a aVar) throws ParserException {
        boolean z;
        boolean z2;
        boolean z3 = true;
        int i = 0;
        if (this.f17568b == null) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20988h(z, "Unexpected moov box.");
        DrmInitData i2 = m26797i(aVar.f12586c);
        C2420gs.C2421a aVar2 = (C2420gs.C2421a) C2725kr.m20985e(aVar.mo20825f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f12586c.size();
        long j = -9223372036854775807L;
        for (int i3 = 0; i3 < size; i3++) {
            C2420gs.C2422b bVar = aVar2.f12586c.get(i3);
            int i4 = bVar.f12584a;
            if (i4 == 1953654136) {
                Pair<Integer, n91> F = m26789F(bVar.f12588b);
                sparseArray.put(((Integer) F.first).intValue(), (n91) F.second);
            } else if (i4 == 1835362404) {
                j = m26800u(bVar.f12588b);
            }
        }
        we2 we2 = new we2();
        if ((this.f17567a & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<at6> A = C2503hs.m19196A(aVar, we2, j, i2, z2, false, new rb2(this));
        int size2 = A.size();
        if (this.f17570d.size() == 0) {
            while (i < size2) {
                at6 at6 = A.get(i);
                qs6 qs6 = at6.f7753a;
                this.f17570d.put(qs6.f17053a, new C3261b(this.f17563E.mo7713f(i, qs6.f17054b), at6, mo25717h(sparseArray, qs6.f17053a)));
                this.f17590x = Math.max(this.f17590x, qs6.f17057e);
                i++;
            }
            this.f17563E.mo7722p();
            return;
        }
        if (this.f17570d.size() != size2) {
            z3 = false;
        }
        C2725kr.m20987g(z3);
        while (i < size2) {
            at6 at62 = A.get(i);
            qs6 qs62 = at62.f7753a;
            this.f17570d.get(qs62.f17053a).mo25733j(at62, mo25717h(sparseArray, qs62.f17053a));
            i++;
        }
    }

    /* renamed from: t */
    public final void mo25725t(long j) {
        while (!this.f17580n.isEmpty()) {
            C3260a removeFirst = this.f17580n.removeFirst();
            this.f17588v -= removeFirst.f17595c;
            long j2 = removeFirst.f17593a;
            if (removeFirst.f17594b) {
                j2 += j;
            }
            sq6 sq6 = this.f17576j;
            if (sq6 != null) {
                j2 = sq6.mo25932a(j2);
            }
            for (zs6 b : this.f17564F) {
                b.mo7301b(j2, 1, removeFirst.f17595c, this.f17588v, (zs6.C3758a) null);
            }
        }
    }

    public sb2(int i) {
        this(i, (sq6) null);
    }

    public sb2(int i, sq6 sq6) {
        this(i, sq6, (qs6) null, Collections.emptyList());
    }

    public sb2(int i, sq6 sq6, qs6 qs6, List<C0792h> list) {
        this(i, sq6, qs6, list, (zs6) null);
    }

    public sb2(int i, sq6 sq6, qs6 qs6, List<C0792h> list, zs6 zs6) {
        this.f17567a = i;
        this.f17576j = sq6;
        this.f17568b = qs6;
        this.f17569c = Collections.unmodifiableList(list);
        this.f17581o = zs6;
        this.f17577k = new au1();
        this.f17578l = new gm4(16);
        this.f17571e = new gm4(q24.f16719a);
        this.f17572f = new gm4(5);
        this.f17573g = new gm4();
        byte[] bArr = new byte[16];
        this.f17574h = bArr;
        this.f17575i = new gm4(bArr);
        this.f17579m = new ArrayDeque<>();
        this.f17580n = new ArrayDeque<>();
        this.f17570d = new SparseArray<>();
        this.f17590x = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f17589w = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f17591y = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f17563E = jy1.f13901j;
        this.f17564F = new zs6[0];
        this.f17565G = new zs6[0];
    }
}
