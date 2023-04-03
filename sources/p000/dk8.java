package p000;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.internal.clearcut.C4053b;
import com.google.android.gms.internal.clearcut.C4056e;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzcb;
import com.google.android.gms.internal.clearcut.zzco;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import sun.misc.Unsafe;

/* renamed from: dk8 */
public final class dk8<T> implements hm8<T> {

    /* renamed from: s */
    public static final Unsafe f28224s = qp8.m50774z();

    /* renamed from: a */
    public final int[] f28225a;

    /* renamed from: b */
    public final Object[] f28226b;

    /* renamed from: c */
    public final int f28227c;

    /* renamed from: d */
    public final int f28228d;

    /* renamed from: e */
    public final int f28229e;

    /* renamed from: f */
    public final tj8 f28230f;

    /* renamed from: g */
    public final boolean f28231g;

    /* renamed from: h */
    public final boolean f28232h;

    /* renamed from: i */
    public final boolean f28233i;

    /* renamed from: j */
    public final boolean f28234j;

    /* renamed from: k */
    public final int[] f28235k;

    /* renamed from: l */
    public final int[] f28236l;

    /* renamed from: m */
    public final int[] f28237m;

    /* renamed from: n */
    public final nk8 f28238n;

    /* renamed from: o */
    public final gh8 f28239o;

    /* renamed from: p */
    public final go8<?, ?> f28240p;

    /* renamed from: q */
    public final id8<?> f28241q;

    /* renamed from: r */
    public final ij8 f28242r;

    public dk8(int[] iArr, Object[] objArr, int i, int i2, int i3, tj8 tj8, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, nk8 nk8, gh8 gh8, go8<?, ?> go8, id8<?> id8, ij8 ij8) {
        tj8 tj82 = tj8;
        id8<?> id82 = id8;
        this.f28225a = iArr;
        this.f28226b = objArr;
        this.f28227c = i;
        this.f28228d = i2;
        this.f28229e = i3;
        this.f28232h = tj82 instanceof C4056e;
        this.f28233i = z;
        this.f28231g = id82 != null && id82.mo30765g(tj8);
        this.f28234j = false;
        this.f28235k = iArr2;
        this.f28236l = iArr3;
        this.f28237m = iArr4;
        this.f28238n = nk8;
        this.f28239o = gh8;
        this.f28240p = go8;
        this.f28241q = id82;
        this.f28230f = tj82;
        this.f28242r = ij8;
    }

    /* renamed from: B */
    public static boolean m43510B(Object obj, int i, hm8 hm8) {
        return hm8.mo41960f(qp8.m50740M(obj, (long) (i & 1048575)));
    }

    /* renamed from: N */
    public static <E> List<E> m43511N(Object obj, long j) {
        return (List) qp8.m50740M(obj, j);
    }

    /* renamed from: O */
    public static <T> double m43512O(T t, long j) {
        return ((Double) qp8.m50740M(t, j)).doubleValue();
    }

    /* renamed from: P */
    public static <T> float m43513P(T t, long j) {
        return ((Float) qp8.m50740M(t, j)).floatValue();
    }

    /* renamed from: Q */
    public static <T> int m43514Q(T t, long j) {
        return ((Integer) qp8.m50740M(t, j)).intValue();
    }

    /* renamed from: R */
    public static <T> long m43515R(T t, long j) {
        return ((Long) qp8.m50740M(t, j)).longValue();
    }

    /* renamed from: S */
    public static <T> boolean m43516S(T t, long j) {
        return ((Boolean) qp8.m50740M(t, j)).booleanValue();
    }

    /* renamed from: T */
    public static jo8 m43517T(Object obj) {
        C4056e eVar = (C4056e) obj;
        jo8 jo8 = eVar.zzjp;
        if (jo8 != jo8.m46688h()) {
            return jo8;
        }
        jo8 i = jo8.m46689i();
        eVar.zzjp = i;
        return i;
    }

    /* renamed from: j */
    public static int m43518j(int i, byte[] bArr, int i2, int i3, Object obj, t98 t98) throws IOException {
        return q98.m50473c(i, bArr, i2, i3, m43517T(obj), t98);
    }

    /* renamed from: o */
    public static int m43519o(hm8<?> hm8, int i, byte[] bArr, int i2, int i3, hg8<?> hg8, t98 t98) throws IOException {
        int q = m43521q(hm8, bArr, i2, i3, t98);
        while (true) {
            hg8.add(t98.f34171c);
            if (q >= i3) {
                break;
            }
            int e = q98.m50475e(bArr, q, t98);
            if (i != t98.f34169a) {
                break;
            }
            q = m43521q(hm8, bArr, e, i3, t98);
        }
        return q;
    }

    /* renamed from: p */
    public static int m43520p(hm8 hm8, byte[] bArr, int i, int i2, int i3, t98 t98) throws IOException {
        dk8 dk8 = (dk8) hm8;
        Object b = dk8.mo41956b();
        int n = dk8.mo41967n(b, bArr, i, i2, i3, t98);
        dk8.mo41955a(b);
        t98.f34171c = b;
        return n;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m43521q(p000.hm8 r6, byte[] r7, int r8, int r9, p000.t98 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = p000.q98.m50474d(r8, r7, r0, r10)
            int r8 = r10.f34169a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo41956b()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo41959e(r1, r2, r3, r4, r5)
            r6.mo41955a(r9)
            r10.f34171c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.clearcut.zzco r6 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk8.m43521q(hm8, byte[], int, int, t98):int");
    }

    /* renamed from: r */
    public static <UT, UB> int m43522r(go8<UT, UB> go8, T t) {
        return go8.mo42945j(go8.mo42946k(t));
    }

    /* renamed from: t */
    public static <T> dk8<T> m43523t(Class<T> cls, pj8 pj8, nk8 nk8, gh8 gh8, go8<?, ?> go8, id8<?> id8, ij8 ij8) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        pj8 pj82 = pj8;
        if (pj82 instanceof yl8) {
            yl8 yl8 = (yl8) pj82;
            boolean z = yl8.mo46759a() == C4056e.C4061e.f22463j;
            if (yl8.mo49709d() == 0) {
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                int f = yl8.mo49711f();
                int g = yl8.mo49712g();
                i3 = yl8.mo49716k();
                i2 = f;
                i = g;
            }
            int[] iArr = new int[(i3 << 2)];
            Object[] objArr = new Object[(i3 << 1)];
            int[] iArr2 = yl8.mo49713h() > 0 ? new int[yl8.mo49713h()] : null;
            int[] iArr3 = yl8.mo49714i() > 0 ? new int[yl8.mo49714i()] : null;
            bm8 e = yl8.mo49710e();
            if (e.mo29636a()) {
                int g2 = e.mo29638g();
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (g2 >= yl8.mo49717l() || i7 >= ((g2 - i2) << 2)) {
                        if (e.mo29641k()) {
                            i6 = (int) qp8.m50750b(e.mo29642l());
                            i5 = (int) qp8.m50750b(e.mo29643m());
                            i4 = 0;
                        } else {
                            i6 = (int) qp8.m50750b(e.mo29644n());
                            if (e.mo29645o()) {
                                i5 = (int) qp8.m50750b(e.mo29646p());
                                i4 = e.mo29647q();
                            } else {
                                i5 = 0;
                                i4 = 0;
                            }
                        }
                        iArr[i7] = e.mo29638g();
                        int i10 = i7 + 1;
                        iArr[i10] = (e.mo29649s() ? 536870912 : 0) | (e.mo29648r() ? SQLiteDatabase.CREATE_IF_NECESSARY : 0) | (e.mo29639h() << 20) | i6;
                        iArr[i7 + 2] = i5 | (i4 << 20);
                        if (e.mo29652v() != null) {
                            int i11 = (i7 / 4) << 1;
                            objArr[i11] = e.mo29652v();
                            if (e.mo29650t() != null) {
                                objArr[i11 + 1] = e.mo29650t();
                            } else if (e.mo29651u() != null) {
                                objArr[i11 + 1] = e.mo29651u();
                            }
                        } else if (e.mo29650t() != null) {
                            objArr[((i7 / 4) << 1) + 1] = e.mo29650t();
                        } else if (e.mo29651u() != null) {
                            objArr[((i7 / 4) << 1) + 1] = e.mo29651u();
                        }
                        int h = e.mo29639h();
                        if (h == zzcb.MAP.ordinal()) {
                            iArr2[i8] = i7;
                            i8++;
                        } else if (h >= 18 && h <= 49) {
                            iArr3[i9] = iArr[i10] & 1048575;
                            i9++;
                        }
                        if (!e.mo29636a()) {
                            break;
                        }
                        g2 = e.mo29638g();
                    } else {
                        for (int i12 = 0; i12 < 4; i12++) {
                            iArr[i7 + i12] = -1;
                        }
                    }
                    i7 += 4;
                }
            }
            return new dk8(iArr, objArr, i2, i, yl8.mo49717l(), yl8.mo46761c(), z, false, yl8.mo49715j(), iArr2, iArr3, nk8, gh8, go8, id8, ij8);
        }
        ((tn8) pj82).mo46759a();
        throw new NoSuchMethodError();
    }

    /* renamed from: u */
    public static void m43524u(int i, Object obj, dr8 dr8) throws IOException {
        if (obj instanceof String) {
            dr8.mo42033x(i, (String) obj);
        } else {
            dr8.mo42001G(i, (zzbb) obj);
        }
    }

    /* renamed from: w */
    public static <UT, UB> void m43525w(go8<UT, UB> go8, T t, dr8 dr8) throws IOException {
        go8.mo42938c(go8.mo42946k(t), dr8);
    }

    /* renamed from: A */
    public final boolean mo41943A(T t, int i, int i2, int i3) {
        return this.f28233i ? mo41971y(t, i) : (i2 & i3) != 0;
    }

    /* renamed from: C */
    public final hm8 mo41944C(int i) {
        int i2 = (i / 4) << 1;
        hm8 hm8 = (hm8) this.f28226b[i2];
        if (hm8 != null) {
            return hm8;
        }
        hm8 b = sl8.m51829a().mo47813b((Class) this.f28226b[i2 + 1]);
        this.f28226b[i2] = b;
        return b;
    }

    /* renamed from: D */
    public final Object mo41945D(int i) {
        return this.f28226b[(i / 4) << 1];
    }

    /* renamed from: E */
    public final bg8<?> mo41946E(int i) {
        return (bg8) this.f28226b[((i / 4) << 1) + 1];
    }

    /* renamed from: F */
    public final int mo41947F(int i) {
        return this.f28225a[i + 1];
    }

    /* renamed from: G */
    public final int mo41948G(int i) {
        return this.f28225a[i + 2];
    }

    /* renamed from: H */
    public final int mo41949H(int i) {
        int i2 = this.f28227c;
        if (i >= i2) {
            int i3 = this.f28229e;
            if (i < i3) {
                int i4 = (i - i2) << 2;
                if (this.f28225a[i4] == i) {
                    return i4;
                }
                return -1;
            } else if (i <= this.f28228d) {
                int i5 = i3 - i2;
                int length = (this.f28225a.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    int i7 = i6 << 2;
                    int i8 = this.f28225a[i7];
                    if (i == i8) {
                        return i7;
                    }
                    if (i < i8) {
                        length = i6 - 1;
                    } else {
                        i5 = i6 + 1;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: I */
    public final void mo41950I(T t, int i) {
        if (!this.f28233i) {
            int G = mo41948G(i);
            long j = (long) (G & 1048575);
            qp8.m50755g(t, j, qp8.m50735H(t, j) | (1 << (G >>> 20)));
        }
    }

    /* renamed from: J */
    public final void mo41951J(T t, int i, int i2) {
        qp8.m50755g(t, (long) (mo41948G(i2) & 1048575), i);
    }

    /* renamed from: K */
    public final void mo41952K(T t, T t2, int i) {
        int F = mo41947F(i);
        int i2 = this.f28225a[i];
        long j = (long) (F & 1048575);
        if (mo41972z(t2, i2, i)) {
            Object M = qp8.m50740M(t, j);
            Object M2 = qp8.m50740M(t2, j);
            if (M != null && M2 != null) {
                qp8.m50757i(t, j, vf8.m53378d(M, M2));
                mo41951J(t, i2, i);
            } else if (M2 != null) {
                qp8.m50757i(t, j, M2);
                mo41951J(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41953L(T r19, p000.dr8 r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f28231g
            if (r3 == 0) goto L_0x0021
            id8<?> r3 = r0.f28241q
            td8 r3 = r3.mo30760b(r1)
            boolean r5 = r3.mo48080b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo48084e()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f28225a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f28224s
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x0492
            int r12 = r0.mo41947F(r10)
            int[] r13 = r0.f28225a
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f28233i
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x005b
            r4 = 17
            if (r15 > r4) goto L_0x005b
            int r4 = r10 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0055
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            r6 = r13
        L_0x0055:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x005e
        L_0x005b:
            r17 = r10
            r4 = 0
        L_0x005e:
            if (r5 == 0) goto L_0x007c
            id8<?> r9 = r0.f28241q
            int r9 = r9.mo30759a(r5)
            if (r9 > r14) goto L_0x007c
            id8<?> r9 = r0.f28241q
            r9.mo30762d(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007a
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005e
        L_0x007a:
            r5 = 0
            goto L_0x005e
        L_0x007c:
            r9 = r12 & r16
            long r9 = (long) r9
            r12 = r17
            switch(r15) {
                case 0: goto L_0x0483;
                case 1: goto L_0x0477;
                case 2: goto L_0x046b;
                case 3: goto L_0x045f;
                case 4: goto L_0x0453;
                case 5: goto L_0x0447;
                case 6: goto L_0x043b;
                case 7: goto L_0x042f;
                case 8: goto L_0x0423;
                case 9: goto L_0x0412;
                case 10: goto L_0x0403;
                case 11: goto L_0x03f6;
                case 12: goto L_0x03e9;
                case 13: goto L_0x03dc;
                case 14: goto L_0x03cf;
                case 15: goto L_0x03c2;
                case 16: goto L_0x03b5;
                case 17: goto L_0x03a4;
                case 18: goto L_0x0394;
                case 19: goto L_0x0384;
                case 20: goto L_0x0374;
                case 21: goto L_0x0364;
                case 22: goto L_0x0354;
                case 23: goto L_0x0344;
                case 24: goto L_0x0334;
                case 25: goto L_0x0324;
                case 26: goto L_0x0315;
                case 27: goto L_0x0302;
                case 28: goto L_0x02f3;
                case 29: goto L_0x02e3;
                case 30: goto L_0x02d3;
                case 31: goto L_0x02c3;
                case 32: goto L_0x02b3;
                case 33: goto L_0x02a3;
                case 34: goto L_0x0293;
                case 35: goto L_0x0283;
                case 36: goto L_0x0273;
                case 37: goto L_0x0263;
                case 38: goto L_0x0253;
                case 39: goto L_0x0243;
                case 40: goto L_0x0233;
                case 41: goto L_0x0223;
                case 42: goto L_0x0213;
                case 43: goto L_0x0203;
                case 44: goto L_0x01f3;
                case 45: goto L_0x01e3;
                case 46: goto L_0x01d3;
                case 47: goto L_0x01c3;
                case 48: goto L_0x01b3;
                case 49: goto L_0x01a0;
                case 50: goto L_0x0197;
                case 51: goto L_0x0188;
                case 52: goto L_0x0179;
                case 53: goto L_0x016a;
                case 54: goto L_0x015b;
                case 55: goto L_0x014c;
                case 56: goto L_0x013d;
                case 57: goto L_0x012e;
                case 58: goto L_0x011f;
                case 59: goto L_0x0110;
                case 60: goto L_0x00fd;
                case 61: goto L_0x00ed;
                case 62: goto L_0x00df;
                case 63: goto L_0x00d1;
                case 64: goto L_0x00c3;
                case 65: goto L_0x00b5;
                case 66: goto L_0x00a7;
                case 67: goto L_0x0099;
                case 68: goto L_0x0087;
                default: goto L_0x0084;
            }
        L_0x0084:
            r13 = 0
            goto L_0x048e
        L_0x0087:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            hm8 r9 = r0.mo41944C(r12)
            r2.mo42007M(r14, r4, r9)
            goto L_0x0084
        L_0x0099:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            long r9 = m43515R(r1, r9)
            r2.mo42013a(r14, r9)
            goto L_0x0084
        L_0x00a7:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            int r4 = m43514Q(r1, r9)
            r2.mo42028s(r14, r4)
            goto L_0x0084
        L_0x00b5:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            long r9 = m43515R(r1, r9)
            r2.mo42003I(r14, r9)
            goto L_0x0084
        L_0x00c3:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            int r4 = m43514Q(r1, r9)
            r2.mo42012R(r14, r4)
            goto L_0x0084
        L_0x00d1:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            int r4 = m43514Q(r1, r9)
            r2.mo42010P(r14, r4)
            goto L_0x0084
        L_0x00df:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            int r4 = m43514Q(r1, r9)
            r2.mo42027r(r14, r4)
            goto L_0x0084
        L_0x00ed:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.zzbb r4 = (com.google.android.gms.internal.clearcut.zzbb) r4
            r2.mo42001G(r14, r4)
            goto L_0x0084
        L_0x00fd:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            hm8 r9 = r0.mo41944C(r12)
            r2.mo42009O(r14, r4, r9)
            goto L_0x0084
        L_0x0110:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r8.getObject(r1, r9)
            m43524u(r14, r4, r2)
            goto L_0x0084
        L_0x011f:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            boolean r4 = m43516S(r1, r9)
            r2.mo41999E(r14, r4)
            goto L_0x0084
        L_0x012e:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            int r4 = m43514Q(r1, r9)
            r2.mo42023n(r14, r4)
            goto L_0x0084
        L_0x013d:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            long r9 = m43515R(r1, r9)
            r2.mo42016e(r14, r9)
            goto L_0x0084
        L_0x014c:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            int r4 = m43514Q(r1, r9)
            r2.mo42015c(r14, r4)
            goto L_0x0084
        L_0x015b:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            long r9 = m43515R(r1, r9)
            r2.mo42020k(r14, r9)
            goto L_0x0084
        L_0x016a:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            long r9 = m43515R(r1, r9)
            r2.mo42008N(r14, r9)
            goto L_0x0084
        L_0x0179:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            float r4 = m43513P(r1, r9)
            r2.mo42022m(r14, r4)
            goto L_0x0084
        L_0x0188:
            boolean r4 = r0.mo41972z(r1, r14, r12)
            if (r4 == 0) goto L_0x0084
            double r9 = m43512O(r1, r9)
            r2.mo42021l(r14, r9)
            goto L_0x0084
        L_0x0197:
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.mo41970x(r2, r14, r4, r12)
            goto L_0x0084
        L_0x01a0:
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            hm8 r10 = r0.mo41944C(r12)
            p000.nm8.m48881l(r4, r9, r2, r10)
            goto L_0x0084
        L_0x01b3:
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 1
            p000.nm8.m48844F(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01c3:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48855Q(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01d3:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48849K(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01e3:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48857S(r4, r9, r2, r13)
            goto L_0x0084
        L_0x01f3:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48858T(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0203:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48853O(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0213:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48859U(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0223:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48856R(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0233:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48846H(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0243:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48851M(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0253:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48893x(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0263:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48887r(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0273:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48882m(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0283:
            r13 = 1
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48875f(r4, r9, r2, r13)
            goto L_0x0084
        L_0x0293:
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            p000.nm8.m48844F(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02a3:
            r13 = 0
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48855Q(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02b3:
            r13 = 0
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48849K(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02c3:
            r13 = 0
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48857S(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02d3:
            r13 = 0
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48858T(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02e3:
            r13 = 0
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48853O(r4, r9, r2, r13)
            goto L_0x048e
        L_0x02f3:
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48880k(r4, r9, r2)
            goto L_0x0084
        L_0x0302:
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            hm8 r10 = r0.mo41944C(r12)
            p000.nm8.m48873e(r4, r9, r2, r10)
            goto L_0x0084
        L_0x0315:
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48871d(r4, r9, r2)
            goto L_0x0084
        L_0x0324:
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            p000.nm8.m48859U(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0334:
            r13 = 0
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48856R(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0344:
            r13 = 0
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48846H(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0354:
            r13 = 0
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48851M(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0364:
            r13 = 0
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48893x(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0374:
            r13 = 0
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48887r(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0384:
            r13 = 0
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48882m(r4, r9, r2, r13)
            goto L_0x048e
        L_0x0394:
            r13 = 0
            int[] r4 = r0.f28225a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48875f(r4, r9, r2, r13)
            goto L_0x048e
        L_0x03a4:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            hm8 r9 = r0.mo41944C(r12)
            r2.mo42007M(r14, r4, r9)
            goto L_0x048e
        L_0x03b5:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.mo42013a(r14, r9)
            goto L_0x048e
        L_0x03c2:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.mo42028s(r14, r4)
            goto L_0x048e
        L_0x03cf:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.mo42003I(r14, r9)
            goto L_0x048e
        L_0x03dc:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.mo42012R(r14, r4)
            goto L_0x048e
        L_0x03e9:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.mo42010P(r14, r4)
            goto L_0x048e
        L_0x03f6:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.mo42027r(r14, r4)
            goto L_0x048e
        L_0x0403:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.zzbb r4 = (com.google.android.gms.internal.clearcut.zzbb) r4
            r2.mo42001G(r14, r4)
            goto L_0x048e
        L_0x0412:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            hm8 r9 = r0.mo41944C(r12)
            r2.mo42009O(r14, r4, r9)
            goto L_0x048e
        L_0x0423:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            java.lang.Object r4 = r8.getObject(r1, r9)
            m43524u(r14, r4, r2)
            goto L_0x048e
        L_0x042f:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            boolean r4 = p000.qp8.m50737J(r1, r9)
            r2.mo41999E(r14, r4)
            goto L_0x048e
        L_0x043b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.mo42023n(r14, r4)
            goto L_0x048e
        L_0x0447:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.mo42016e(r14, r9)
            goto L_0x048e
        L_0x0453:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            int r4 = r8.getInt(r1, r9)
            r2.mo42015c(r14, r4)
            goto L_0x048e
        L_0x045f:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.mo42020k(r14, r9)
            goto L_0x048e
        L_0x046b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            long r9 = r8.getLong(r1, r9)
            r2.mo42008N(r14, r9)
            goto L_0x048e
        L_0x0477:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            float r4 = p000.qp8.m50738K(r1, r9)
            r2.mo42022m(r14, r4)
            goto L_0x048e
        L_0x0483:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x048e
            double r9 = p000.qp8.m50739L(r1, r9)
            r2.mo42021l(r14, r9)
        L_0x048e:
            int r10 = r12 + 4
            goto L_0x002b
        L_0x0492:
            if (r5 == 0) goto L_0x04a9
            id8<?> r4 = r0.f28241q
            r4.mo30762d(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a7
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x0492
        L_0x04a7:
            r5 = 0
            goto L_0x0492
        L_0x04a9:
            go8<?, ?> r3 = r0.f28240p
            m43525w(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk8.mo41953L(java.lang.Object, dr8):void");
    }

    /* renamed from: M */
    public final boolean mo41954M(T t, T t2, int i) {
        return mo41971y(t, i) == mo41971y(t2, i);
    }

    /* renamed from: a */
    public final void mo41955a(T t) {
        int[] iArr = this.f28236l;
        if (iArr != null) {
            for (int F : iArr) {
                long F2 = (long) (mo41947F(F) & 1048575);
                Object M = qp8.m50740M(t, F2);
                if (M != null) {
                    qp8.m50757i(t, F2, this.f28242r.mo43628e(M));
                }
            }
        }
        int[] iArr2 = this.f28237m;
        if (iArr2 != null) {
            for (int i : iArr2) {
                this.f28239o.mo42894a(t, (long) i);
            }
        }
        this.f28240p.mo42939d(t);
        if (this.f28231g) {
            this.f28241q.mo30764f(t);
        }
    }

    /* renamed from: b */
    public final T mo41956b() {
        return this.f28238n.mo30785a(this.f28230f);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = p000.qp8.m50740M(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = m43514Q(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = m43515R(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = p000.qp8.m50740M(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) p000.qp8.m50740M(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = p000.vf8.m53380f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = p000.vf8.m53384j(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41957c(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f28225a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r8.mo41947F(r1)
            int[] r4 = r8.f28225a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012a
        L_0x0020:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0061
        L_0x0027:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0061:
            java.lang.Object r3 = p000.qp8.m50740M(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            boolean r3 = m43516S(r9, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0093:
            int r2 = r2 * 53
            int r3 = m43514Q(r9, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = m43515R(r9, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            float r3 = m43513P(r9, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r8.mo41972z(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            double r3 = m43512O(r9, r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = p000.qp8.m50740M(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = p000.qp8.m50740M(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = p000.qp8.m50740M(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = p000.qp8.m50740M(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = p000.qp8.m50737J(r9, r5)
        L_0x00fd:
            int r3 = p000.vf8.m53380f(r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = p000.qp8.m50735H(r9, r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = p000.qp8.m50736I(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = p000.qp8.m50738K(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = p000.qp8.m50739L(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = p000.vf8.m53384j(r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 4
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            go8<?, ?> r0 = r8.f28240p
            java.lang.Object r0 = r0.mo42946k(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f28231g
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            id8<?> r0 = r8.f28241q
            td8 r9 = r0.mo30760b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk8.mo41957c(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (p000.nm8.m48894y(p000.qp8.m50740M(r10, r6), p000.qp8.m50740M(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (p000.qp8.m50736I(r10, r6) == p000.qp8.m50736I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (p000.qp8.m50735H(r10, r6) == p000.qp8.m50735H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (p000.qp8.m50736I(r10, r6) == p000.qp8.m50736I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (p000.qp8.m50735H(r10, r6) == p000.qp8.m50735H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (p000.qp8.m50735H(r10, r6) == p000.qp8.m50735H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (p000.qp8.m50735H(r10, r6) == p000.qp8.m50735H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (p000.nm8.m48894y(p000.qp8.m50740M(r10, r6), p000.qp8.m50740M(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (p000.nm8.m48894y(p000.qp8.m50740M(r10, r6), p000.qp8.m50740M(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (p000.nm8.m48894y(p000.qp8.m50740M(r10, r6), p000.qp8.m50740M(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (p000.qp8.m50737J(r10, r6) == p000.qp8.m50737J(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (p000.qp8.m50735H(r10, r6) == p000.qp8.m50735H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (p000.qp8.m50736I(r10, r6) == p000.qp8.m50736I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (p000.qp8.m50735H(r10, r6) == p000.qp8.m50735H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (p000.qp8.m50736I(r10, r6) == p000.qp8.m50736I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (p000.qp8.m50736I(r10, r6) == p000.qp8.m50736I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        if (p000.qp8.m50735H(r10, r6) == p000.qp8.m50735H(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a0, code lost:
        if (p000.qp8.m50736I(r10, r6) == p000.qp8.m50736I(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (p000.nm8.m48894y(p000.qp8.m50740M(r10, r6), p000.qp8.m50740M(r11, r6)) != false) goto L_0x01a3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41958d(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f28225a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01aa
            int r4 = r9.mo41947F(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0190;
                case 1: goto L_0x017f;
                case 2: goto L_0x016c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0148;
                case 5: goto L_0x0135;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01a3
        L_0x001c:
            int r4 = r9.mo41948G(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = p000.qp8.m50735H(r10, r4)
            int r4 = p000.qp8.m50735H(r11, r4)
            if (r8 != r4) goto L_0x01a2
            java.lang.Object r4 = p000.qp8.m50740M(r10, r6)
            java.lang.Object r5 = p000.qp8.m50740M(r11, r6)
            boolean r4 = p000.nm8.m48894y(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x003c:
            java.lang.Object r3 = p000.qp8.m50740M(r10, r6)
            java.lang.Object r4 = p000.qp8.m50740M(r11, r6)
            boolean r3 = p000.nm8.m48894y(r3, r4)
            goto L_0x01a3
        L_0x004a:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = p000.qp8.m50740M(r10, r6)
            java.lang.Object r5 = p000.qp8.m50740M(r11, r6)
            boolean r4 = p000.nm8.m48894y(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a2
        L_0x0060:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = p000.qp8.m50736I(r10, r6)
            long r6 = p000.qp8.m50736I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x0074:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = p000.qp8.m50735H(r10, r6)
            int r5 = p000.qp8.m50735H(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x0086:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = p000.qp8.m50736I(r10, r6)
            long r6 = p000.qp8.m50736I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x009a:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = p000.qp8.m50735H(r10, r6)
            int r5 = p000.qp8.m50735H(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x00ac:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = p000.qp8.m50735H(r10, r6)
            int r5 = p000.qp8.m50735H(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x00be:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = p000.qp8.m50735H(r10, r6)
            int r5 = p000.qp8.m50735H(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x00d0:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = p000.qp8.m50740M(r10, r6)
            java.lang.Object r5 = p000.qp8.m50740M(r11, r6)
            boolean r4 = p000.nm8.m48894y(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x00e6:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = p000.qp8.m50740M(r10, r6)
            java.lang.Object r5 = p000.qp8.m50740M(r11, r6)
            boolean r4 = p000.nm8.m48894y(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a2
        L_0x00fc:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = p000.qp8.m50740M(r10, r6)
            java.lang.Object r5 = p000.qp8.m50740M(r11, r6)
            boolean r4 = p000.nm8.m48894y(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x0112:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            boolean r4 = p000.qp8.m50737J(r10, r6)
            boolean r5 = p000.qp8.m50737J(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x0124:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = p000.qp8.m50735H(r10, r6)
            int r5 = p000.qp8.m50735H(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x0135:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = p000.qp8.m50736I(r10, r6)
            long r6 = p000.qp8.m50736I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            goto L_0x01a2
        L_0x0148:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = p000.qp8.m50735H(r10, r6)
            int r5 = p000.qp8.m50735H(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x0159:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = p000.qp8.m50736I(r10, r6)
            long r6 = p000.qp8.m50736I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            goto L_0x01a2
        L_0x016c:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = p000.qp8.m50736I(r10, r6)
            long r6 = p000.qp8.m50736I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x017f:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = p000.qp8.m50735H(r10, r6)
            int r5 = p000.qp8.m50735H(r11, r6)
            if (r4 == r5) goto L_0x01a3
        L_0x018f:
            goto L_0x01a2
        L_0x0190:
            boolean r4 = r9.mo41954M(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = p000.qp8.m50736I(r10, r6)
            long r6 = p000.qp8.m50736I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
        L_0x01a2:
            r3 = r1
        L_0x01a3:
            if (r3 != 0) goto L_0x01a6
            return r1
        L_0x01a6:
            int r2 = r2 + 4
            goto L_0x0005
        L_0x01aa:
            go8<?, ?> r0 = r9.f28240p
            java.lang.Object r0 = r0.mo42946k(r10)
            go8<?, ?> r2 = r9.f28240p
            java.lang.Object r2 = r2.mo42946k(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01bd
            return r1
        L_0x01bd:
            boolean r0 = r9.f28231g
            if (r0 == 0) goto L_0x01d2
            id8<?> r0 = r9.f28241q
            td8 r10 = r0.mo30760b(r10)
            id8<?> r0 = r9.f28241q
            td8 r11 = r0.mo30760b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk8.mo41958d(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r1 = r11.f34171c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r0 = p000.q98.m50475e(r12, r10, r11);
        r1 = r11.f34169a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        r9.putLong(r23, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f5, code lost:
        r0 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0164, code lost:
        if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0188, code lost:
        if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a1, code lost:
        if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41959e(T r23, byte[] r24, int r25, int r26, p000.t98 r27) throws java.io.IOException {
        /*
            r22 = this;
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            boolean r0 = r15.f28233i
            if (r0 == 0) goto L_0x01ce
            sun.misc.Unsafe r9 = f28224s
            r0 = r25
        L_0x0012:
            if (r0 >= r13) goto L_0x01c5
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0024
            int r0 = p000.q98.m50474d(r0, r12, r1, r11)
            int r1 = r11.f34169a
            r10 = r0
            r16 = r1
            goto L_0x0027
        L_0x0024:
            r16 = r0
            r10 = r1
        L_0x0027:
            int r6 = r16 >>> 3
            r7 = r16 & 7
            int r8 = r15.mo41949H(r6)
            if (r8 < 0) goto L_0x01a5
            int[] r0 = r15.f28225a
            int r1 = r8 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r4 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r2 = (long) r0
            r0 = 17
            r1 = 2
            if (r4 > r0) goto L_0x0106
            r0 = 5
            r6 = 1
            switch(r4) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x00ec;
                case 2: goto L_0x00db;
                case 3: goto L_0x00db;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00a2;
                case 8: goto L_0x0091;
                case 9: goto L_0x0079;
                case 10: goto L_0x006d;
                case 11: goto L_0x00ce;
                case 12: goto L_0x0069;
                case 13: goto L_0x00b7;
                case 14: goto L_0x00c1;
                case 15: goto L_0x005b;
                case 16: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x01a5
        L_0x004d:
            if (r7 != 0) goto L_0x01a5
            int r6 = p000.q98.m50477g(r12, r10, r11)
            long r0 = r11.f34170b
            long r4 = p000.hc8.m45122a(r0)
            goto L_0x00e3
        L_0x005b:
            if (r7 != 0) goto L_0x01a5
            int r0 = p000.q98.m50475e(r12, r10, r11)
            int r1 = r11.f34169a
            int r1 = p000.hc8.m45124e(r1)
            goto L_0x00d6
        L_0x0069:
            if (r7 != 0) goto L_0x01a5
            goto L_0x00d0
        L_0x006d:
            if (r7 != r1) goto L_0x01a5
            int r0 = p000.q98.m50483m(r12, r10, r11)
        L_0x0073:
            java.lang.Object r1 = r11.f34171c
        L_0x0075:
            r9.putObject(r14, r2, r1)
            goto L_0x0012
        L_0x0079:
            if (r7 != r1) goto L_0x01a5
            hm8 r0 = r15.mo41944C(r8)
            int r0 = m43521q(r0, r12, r10, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x008a
            goto L_0x0073
        L_0x008a:
            java.lang.Object r4 = r11.f34171c
            java.lang.Object r1 = p000.vf8.m53378d(r1, r4)
            goto L_0x0075
        L_0x0091:
            if (r7 != r1) goto L_0x01a5
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x009d
            int r0 = p000.q98.m50479i(r12, r10, r11)
            goto L_0x0073
        L_0x009d:
            int r0 = p000.q98.m50480j(r12, r10, r11)
            goto L_0x0073
        L_0x00a2:
            if (r7 != 0) goto L_0x01a5
            int r0 = p000.q98.m50477g(r12, r10, r11)
            long r4 = r11.f34170b
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            p000.qp8.m50758j(r14, r2, r6)
            goto L_0x0012
        L_0x00b7:
            if (r7 != r0) goto L_0x01a5
            int r0 = p000.q98.m50478h(r12, r10)
            r9.putInt(r14, r2, r0)
            goto L_0x00f5
        L_0x00c1:
            if (r7 != r6) goto L_0x01a5
            long r4 = p000.q98.m50481k(r12, r10)
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            goto L_0x0102
        L_0x00ce:
            if (r7 != 0) goto L_0x01a5
        L_0x00d0:
            int r0 = p000.q98.m50475e(r12, r10, r11)
            int r1 = r11.f34169a
        L_0x00d6:
            r9.putInt(r14, r2, r1)
            goto L_0x0012
        L_0x00db:
            if (r7 != 0) goto L_0x01a5
            int r6 = p000.q98.m50477g(r12, r10, r11)
            long r4 = r11.f34170b
        L_0x00e3:
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x0012
        L_0x00ec:
            if (r7 != r0) goto L_0x01a5
            float r0 = p000.q98.m50484n(r12, r10)
            p000.qp8.m50754f(r14, r2, r0)
        L_0x00f5:
            int r0 = r10 + 4
            goto L_0x0012
        L_0x00f9:
            if (r7 != r6) goto L_0x01a5
            double r0 = p000.q98.m50482l(r12, r10)
            p000.qp8.m50753e(r14, r2, r0)
        L_0x0102:
            int r0 = r10 + 8
            goto L_0x0012
        L_0x0106:
            r0 = 27
            if (r4 != r0) goto L_0x013e
            if (r7 != r1) goto L_0x01a5
            java.lang.Object r0 = r9.getObject(r14, r2)
            hg8 r0 = (p000.hg8) r0
            boolean r1 = r0.mo43293y()
            if (r1 != 0) goto L_0x012a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0121
            r1 = 10
            goto L_0x0123
        L_0x0121:
            int r1 = r1 << 1
        L_0x0123:
            hg8 r0 = r0.mo43292h0(r1)
            r9.putObject(r14, r2, r0)
        L_0x012a:
            r5 = r0
            hm8 r0 = r15.mo41944C(r8)
            r1 = r16
            r2 = r24
            r3 = r10
            r4 = r26
            r6 = r27
            int r0 = m43519o(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0012
        L_0x013e:
            r0 = 49
            if (r4 > r0) goto L_0x0167
            long r0 = (long) r5
            r17 = r0
            r0 = r22
            r1 = r23
            r19 = r2
            r2 = r24
            r3 = r10
            r5 = r4
            r4 = r26
            r25 = r5
            r5 = r16
            r21 = r9
            r15 = r10
            r9 = r17
            r11 = r25
            r12 = r19
            r14 = r27
            int r0 = r0.mo41965l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x01b7
            goto L_0x01a3
        L_0x0167:
            r19 = r2
            r25 = r4
            r21 = r9
            r15 = r10
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x018b
            if (r7 != r1) goto L_0x01a8
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r5 = r8
            r7 = r19
            r9 = r27
            int r0 = r0.mo41966m(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 != r15) goto L_0x01b7
            goto L_0x01a3
        L_0x018b:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r10 = r5
            r5 = r16
            r12 = r8
            r8 = r10
            r10 = r19
            r13 = r27
            int r0 = r0.mo41964k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x01b7
        L_0x01a3:
            r2 = r0
            goto L_0x01a9
        L_0x01a5:
            r21 = r9
            r15 = r10
        L_0x01a8:
            r2 = r15
        L_0x01a9:
            r0 = r16
            r1 = r24
            r3 = r26
            r4 = r23
            r5 = r27
            int r0 = m43518j(r0, r1, r2, r3, r4, r5)
        L_0x01b7:
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            r9 = r21
            goto L_0x0012
        L_0x01c5:
            r4 = r13
            if (r0 != r4) goto L_0x01c9
            return
        L_0x01c9:
            com.google.android.gms.internal.clearcut.zzco r0 = com.google.android.gms.internal.clearcut.zzco.zzbo()
            throw r0
        L_0x01ce:
            r4 = r13
            r5 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r27
            r0.mo41967n(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk8.mo41959e(java.lang.Object, byte[], int, int, t98):void");
    }

    /* renamed from: f */
    public final boolean mo41960f(T t) {
        int i;
        int i2;
        boolean z;
        T t2 = t;
        int[] iArr = this.f28235k;
        if (!(iArr == null || iArr.length == 0)) {
            int i3 = -1;
            int length = iArr.length;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5 = i + 1) {
                int i6 = iArr[i5];
                int H = mo41949H(i6);
                int F = mo41947F(H);
                if (!this.f28233i) {
                    int i7 = this.f28225a[H + 2];
                    int i8 = i7 & 1048575;
                    i2 = 1 << (i7 >>> 20);
                    if (i8 != i3) {
                        i = i5;
                        i4 = f28224s.getInt(t2, (long) i8);
                        i3 = i8;
                    } else {
                        i = i5;
                    }
                } else {
                    i = i5;
                    i2 = 0;
                }
                if (((268435456 & F) != 0) && !mo41943A(t2, H, i4, i2)) {
                    return false;
                }
                int i9 = (267386880 & F) >>> 20;
                if (i9 != 9 && i9 != 17) {
                    if (i9 != 27) {
                        if (i9 == 60 || i9 == 68) {
                            if (mo41972z(t2, i6, H) && !m43510B(t2, F, mo41944C(H))) {
                                return false;
                            }
                        } else if (i9 != 49) {
                            if (i9 == 50 && !this.f28242r.mo43633j(qp8.m50740M(t2, (long) (F & 1048575))).isEmpty()) {
                                this.f28242r.mo43631h(mo41945D(H));
                                throw null;
                            }
                        }
                    }
                    List list = (List) qp8.m50740M(t2, (long) (F & 1048575));
                    if (!list.isEmpty()) {
                        hm8 C = mo41944C(H);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= list.size()) {
                                break;
                            } else if (!C.mo41960f(list.get(i10))) {
                                z = false;
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                        return false;
                    }
                } else if (mo41943A(t2, H, i4, i2) && !m43510B(t2, F, mo41944C(H))) {
                    return false;
                }
            }
            return !this.f28231g || this.f28241q.mo30760b(t2).mo48083d();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        p000.qp8.m50757i(r7, r2, p000.qp8.m50740M(r8, r2));
        mo41951J(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        p000.qp8.m50757i(r7, r2, p000.qp8.m50740M(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        p000.qp8.m50755g(r7, r2, p000.qp8.m50735H(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        p000.qp8.m50756h(r7, r2, p000.qp8.m50736I(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        mo41950I(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ef, code lost:
        r0 = r0 + 4;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41961g(T r7, T r8) {
        /*
            r6 = this;
            r8.getClass()
            r0 = 0
        L_0x0004:
            int[] r1 = r6.f28225a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f3
            int r1 = r6.mo41947F(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f28225a
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00df;
                case 1: goto L_0x00d1;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00a7;
                case 6: goto L_0x00a0;
                case 7: goto L_0x0092;
                case 8: goto L_0x0084;
                case 9: goto L_0x007f;
                case 10: goto L_0x0078;
                case 11: goto L_0x0071;
                case 12: goto L_0x006a;
                case 13: goto L_0x0063;
                case 14: goto L_0x005b;
                case 15: goto L_0x0054;
                case 16: goto L_0x004c;
                case 17: goto L_0x007f;
                case 18: goto L_0x0045;
                case 19: goto L_0x0045;
                case 20: goto L_0x0045;
                case 21: goto L_0x0045;
                case 22: goto L_0x0045;
                case 23: goto L_0x0045;
                case 24: goto L_0x0045;
                case 25: goto L_0x0045;
                case 26: goto L_0x0045;
                case 27: goto L_0x0045;
                case 28: goto L_0x0045;
                case 29: goto L_0x0045;
                case 30: goto L_0x0045;
                case 31: goto L_0x0045;
                case 32: goto L_0x0045;
                case 33: goto L_0x0045;
                case 34: goto L_0x0045;
                case 35: goto L_0x0045;
                case 36: goto L_0x0045;
                case 37: goto L_0x0045;
                case 38: goto L_0x0045;
                case 39: goto L_0x0045;
                case 40: goto L_0x0045;
                case 41: goto L_0x0045;
                case 42: goto L_0x0045;
                case 43: goto L_0x0045;
                case 44: goto L_0x0045;
                case 45: goto L_0x0045;
                case 46: goto L_0x0045;
                case 47: goto L_0x0045;
                case 48: goto L_0x0045;
                case 49: goto L_0x0045;
                case 50: goto L_0x003e;
                case 51: goto L_0x002c;
                case 52: goto L_0x002c;
                case 53: goto L_0x002c;
                case 54: goto L_0x002c;
                case 55: goto L_0x002c;
                case 56: goto L_0x002c;
                case 57: goto L_0x002c;
                case 58: goto L_0x002c;
                case 59: goto L_0x002c;
                case 60: goto L_0x0027;
                case 61: goto L_0x0020;
                case 62: goto L_0x0020;
                case 63: goto L_0x0020;
                case 64: goto L_0x0020;
                case 65: goto L_0x0020;
                case 66: goto L_0x0020;
                case 67: goto L_0x0020;
                case 68: goto L_0x0027;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x00ef
        L_0x0020:
            boolean r1 = r6.mo41972z(r8, r4, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x0032
        L_0x0027:
            r6.mo41952K(r7, r8, r0)
            goto L_0x00ef
        L_0x002c:
            boolean r1 = r6.mo41972z(r8, r4, r0)
            if (r1 == 0) goto L_0x00ef
        L_0x0032:
            java.lang.Object r1 = p000.qp8.m50740M(r8, r2)
            p000.qp8.m50757i(r7, r2, r1)
            r6.mo41951J(r7, r4, r0)
            goto L_0x00ef
        L_0x003e:
            ij8 r1 = r6.f28242r
            p000.nm8.m48877h(r1, r7, r8, r2)
            goto L_0x00ef
        L_0x0045:
            gh8 r1 = r6.f28239o
            r1.mo42895b(r7, r8, r2)
            goto L_0x00ef
        L_0x004c:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00c9
        L_0x0054:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x0070
        L_0x005b:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00c9
        L_0x0063:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x0070
        L_0x006a:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
        L_0x0070:
            goto L_0x00b4
        L_0x0071:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00b4
        L_0x0078:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x008a
        L_0x007f:
            r6.mo41969v(r7, r8, r0)
            goto L_0x00ef
        L_0x0084:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
        L_0x008a:
            java.lang.Object r1 = p000.qp8.m50740M(r8, r2)
            p000.qp8.m50757i(r7, r2, r1)
            goto L_0x00ec
        L_0x0092:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            boolean r1 = p000.qp8.m50737J(r8, r2)
            p000.qp8.m50758j(r7, r2, r1)
            goto L_0x00ec
        L_0x00a0:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00b4
        L_0x00a7:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00c9
        L_0x00ae:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
        L_0x00b4:
            int r1 = p000.qp8.m50735H(r8, r2)
            p000.qp8.m50755g(r7, r2, r1)
            goto L_0x00ec
        L_0x00bc:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            goto L_0x00c9
        L_0x00c3:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
        L_0x00c9:
            long r4 = p000.qp8.m50736I(r8, r2)
            p000.qp8.m50756h(r7, r2, r4)
            goto L_0x00ec
        L_0x00d1:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            float r1 = p000.qp8.m50738K(r8, r2)
            p000.qp8.m50754f(r7, r2, r1)
            goto L_0x00ec
        L_0x00df:
            boolean r1 = r6.mo41971y(r8, r0)
            if (r1 == 0) goto L_0x00ef
            double r4 = p000.qp8.m50739L(r8, r2)
            p000.qp8.m50753e(r7, r2, r4)
        L_0x00ec:
            r6.mo41950I(r7, r0)
        L_0x00ef:
            int r0 = r0 + 4
            goto L_0x0004
        L_0x00f3:
            boolean r0 = r6.f28233i
            if (r0 != 0) goto L_0x0105
            go8<?, ?> r0 = r6.f28240p
            p000.nm8.m48878i(r0, r7, r8)
            boolean r0 = r6.f28231g
            if (r0 == 0) goto L_0x0105
            id8<?> r0 = r6.f28241q
            p000.nm8.m48876g(r0, r7, r8)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk8.mo41961g(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r1, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (com.google.android.gms.internal.clearcut.zzbn.m33948B0(r3) + com.google.android.gms.internal.clearcut.zzbn.m33952D0(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0296, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029f, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33963P(r3, (p000.tj8) p000.qp8.m50740M(r1, r5), mo41944C(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b8, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33977g0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c7, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33986r0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d2, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33983o0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02dd, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33991v0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ec, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33993w0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fb, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33982n0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0306, code lost:
        r5 = p000.qp8.m50740M(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030a, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33961N(r3, (com.google.android.gms.internal.clearcut.zzbb) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0317, code lost:
        r3 = p000.nm8.m48883n(r3, p000.qp8.m50740M(r1, r5), mo41944C(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33946A(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0342, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33964Q(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x034e, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33988t0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035a, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33980k0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x036a, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33979j0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x037a, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33973d0(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x038a, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33967W(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0396, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33996z(r3, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a2, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.m33995y(r3, com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03aa, code lost:
        r12 = r12 + 4;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0414, code lost:
        if (mo41972z(r1, r15, r5) != false) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0434, code lost:
        if (mo41972z(r1, r15, r5) != false) goto L_0x06f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x043c, code lost:
        if (mo41972z(r1, r15, r5) != false) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x045c, code lost:
        if (mo41972z(r1, r15, r5) != false) goto L_0x0723;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0464, code lost:
        if (mo41972z(r1, r15, r5) != false) goto L_0x0732;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0474, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L_0x0727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x047c, code lost:
        if (mo41972z(r1, r15, r5) != false) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0514, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0526, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0538, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x054a, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x055c, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x056e, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0580, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0592, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05a3, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05b4, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05c5, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05d6, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x05e7, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05f8, code lost:
        if (r0.f28234j != false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05fa, code lost:
        r2.putInt(r1, (long) r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05fe, code lost:
        r9 = (com.google.android.gms.internal.clearcut.zzbn.m33948B0(r15) + com.google.android.gms.internal.clearcut.zzbn.m33952D0(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06ab, code lost:
        r6 = r6 + r4;
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06b9, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06bb, code lost:
        r9 = false;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06c4, code lost:
        if ((r12 & r18) != 0) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x06c6, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m33963P(r15, (p000.tj8) r2.getObject(r1, r10), mo41944C(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x06dd, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m33977g0(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06ea, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m33986r0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06f1, code lost:
        if ((r12 & r18) != 0) goto L_0x06f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06f3, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m33983o0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06fc, code lost:
        if ((r12 & r18) != 0) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06fe, code lost:
        r9 = com.google.android.gms.internal.clearcut.zzbn.m33991v0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0703, code lost:
        r6 = r6 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x070d, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m33993w0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x071a, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m33982n0(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0721, code lost:
        if ((r12 & r18) != 0) goto L_0x0723;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0723, code lost:
        r4 = r2.getObject(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0727, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m33961N(r15, (com.google.android.gms.internal.clearcut.zzbb) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0730, code lost:
        if ((r12 & r18) != 0) goto L_0x0732;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0732, code lost:
        r4 = p000.nm8.m48883n(r15, r2.getObject(r1, r10), mo41944C(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x074a, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L_0x0727;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x074d, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m33946A(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0757, code lost:
        if ((r12 & r18) != 0) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0759, code lost:
        r4 = com.google.android.gms.internal.clearcut.zzbn.m33964Q(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x07a6, code lost:
        r6 = r6 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x07c8, code lost:
        r5 = r5 + 4;
        r11 = r4;
        r4 = r9;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r0.f28234j != false) goto L_0x020d;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41962h(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f28233i
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x03b8
            sun.misc.Unsafe r2 = f28224s
            r12 = r11
            r13 = r12
        L_0x0016:
            int[] r14 = r0.f28225a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x03b0
            int r14 = r0.mo41947F(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f28225a
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.clearcut.zzcb r14 = com.google.android.gms.internal.clearcut.zzcb.DOUBLE_LIST_PACKED
            int r14 = r14.mo30857id()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.clearcut.zzcb r14 = com.google.android.gms.internal.clearcut.zzcb.SINT64_LIST_PACKED
            int r14 = r14.mo30857id()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f28225a
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = r11
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x039c;
                case 1: goto L_0x0390;
                case 2: goto L_0x0380;
                case 3: goto L_0x0370;
                case 4: goto L_0x0360;
                case 5: goto L_0x0354;
                case 6: goto L_0x0348;
                case 7: goto L_0x033c;
                case 8: goto L_0x0325;
                case 9: goto L_0x0311;
                case 10: goto L_0x0300;
                case 11: goto L_0x02f1;
                case 12: goto L_0x02e2;
                case 13: goto L_0x02d7;
                case 14: goto L_0x02cc;
                case 15: goto L_0x02bd;
                case 16: goto L_0x02ae;
                case 17: goto L_0x0299;
                case 18: goto L_0x028e;
                case 19: goto L_0x0285;
                case 20: goto L_0x027c;
                case 21: goto L_0x0273;
                case 22: goto L_0x026a;
                case 23: goto L_0x028e;
                case 24: goto L_0x0285;
                case 25: goto L_0x0261;
                case 26: goto L_0x0258;
                case 27: goto L_0x024b;
                case 28: goto L_0x0242;
                case 29: goto L_0x0239;
                case 30: goto L_0x0230;
                case 31: goto L_0x0285;
                case 32: goto L_0x028e;
                case 33: goto L_0x0227;
                case 34: goto L_0x021d;
                case 35: goto L_0x01fd;
                case 36: goto L_0x01ec;
                case 37: goto L_0x01db;
                case 38: goto L_0x01ca;
                case 39: goto L_0x01b9;
                case 40: goto L_0x01a8;
                case 41: goto L_0x0197;
                case 42: goto L_0x0185;
                case 43: goto L_0x0173;
                case 44: goto L_0x0161;
                case 45: goto L_0x014f;
                case 46: goto L_0x013d;
                case 47: goto L_0x012b;
                case 48: goto L_0x0119;
                case 49: goto L_0x010b;
                case 50: goto L_0x00fb;
                case 51: goto L_0x00f3;
                case 52: goto L_0x00eb;
                case 53: goto L_0x00df;
                case 54: goto L_0x00d3;
                case 55: goto L_0x00c7;
                case 56: goto L_0x00bf;
                case 57: goto L_0x00b7;
                case 58: goto L_0x00af;
                case 59: goto L_0x009f;
                case 60: goto L_0x0097;
                case 61: goto L_0x008f;
                case 62: goto L_0x0083;
                case 63: goto L_0x0077;
                case 64: goto L_0x006f;
                case 65: goto L_0x0067;
                case 66: goto L_0x005b;
                case 67: goto L_0x004f;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x03aa
        L_0x0047:
            boolean r14 = r0.mo41972z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x029f
        L_0x004f:
            boolean r14 = r0.mo41972z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m43515R(r1, r5)
            goto L_0x02b8
        L_0x005b:
            boolean r14 = r0.mo41972z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m43514Q(r1, r5)
            goto L_0x02c7
        L_0x0067:
            boolean r5 = r0.mo41972z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02d2
        L_0x006f:
            boolean r5 = r0.mo41972z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02dd
        L_0x0077:
            boolean r14 = r0.mo41972z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m43514Q(r1, r5)
            goto L_0x02ec
        L_0x0083:
            boolean r14 = r0.mo41972z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m43514Q(r1, r5)
            goto L_0x02fb
        L_0x008f:
            boolean r14 = r0.mo41972z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0306
        L_0x0097:
            boolean r14 = r0.mo41972z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0317
        L_0x009f:
            boolean r14 = r0.mo41972z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = p000.qp8.m50740M(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r6 == 0) goto L_0x0334
            goto L_0x0333
        L_0x00af:
            boolean r5 = r0.mo41972z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0342
        L_0x00b7:
            boolean r5 = r0.mo41972z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x034e
        L_0x00bf:
            boolean r5 = r0.mo41972z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x035a
        L_0x00c7:
            boolean r14 = r0.mo41972z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m43514Q(r1, r5)
            goto L_0x036a
        L_0x00d3:
            boolean r14 = r0.mo41972z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m43515R(r1, r5)
            goto L_0x037a
        L_0x00df:
            boolean r14 = r0.mo41972z(r1, r3, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m43515R(r1, r5)
            goto L_0x038a
        L_0x00eb:
            boolean r5 = r0.mo41972z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0396
        L_0x00f3:
            boolean r5 = r0.mo41972z(r1, r3, r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x03a2
        L_0x00fb:
            ij8 r14 = r0.f28242r
            java.lang.Object r5 = p000.qp8.m50740M(r1, r5)
            java.lang.Object r6 = r0.mo41945D(r12)
            int r3 = r14.mo43630g(r3, r5, r6)
            goto L_0x0296
        L_0x010b:
            java.util.List r5 = m43511N(r1, r5)
            hm8 r6 = r0.mo41944C(r12)
            int r3 = p000.nm8.m48890u(r3, r5, r6)
            goto L_0x0296
        L_0x0119:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48886q(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x012b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48848J(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x013d:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48852N(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x014f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48850L(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0161:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48891v(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0173:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48845G(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48854P(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0197:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48850L(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01a8:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48852N(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01b9:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48843E(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ca:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48879j(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01db:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48865a(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ec:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48850L(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = p000.nm8.m48852N(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f28234j
            if (r6 == 0) goto L_0x0211
        L_0x020d:
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33948B0(r3)
            int r6 = com.google.android.gms.internal.clearcut.zzbn.m33952D0(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0296
        L_0x021d:
            java.util.List r5 = m43511N(r1, r5)
            int r3 = p000.nm8.m48862X(r3, r5, r11)
            goto L_0x0296
        L_0x0227:
            java.util.List r5 = m43511N(r1, r5)
            int r3 = p000.nm8.m48868b0(r3, r5, r11)
            goto L_0x0296
        L_0x0230:
            java.util.List r5 = m43511N(r1, r5)
            int r3 = p000.nm8.m48863Y(r3, r5, r11)
            goto L_0x0296
        L_0x0239:
            java.util.List r5 = m43511N(r1, r5)
            int r3 = p000.nm8.m48866a0(r3, r5, r11)
            goto L_0x0296
        L_0x0242:
            java.util.List r5 = m43511N(r1, r5)
            int r3 = p000.nm8.m48889t(r3, r5)
            goto L_0x0296
        L_0x024b:
            java.util.List r5 = m43511N(r1, r5)
            hm8 r6 = r0.mo41944C(r12)
            int r3 = p000.nm8.m48885p(r3, r5, r6)
            goto L_0x0296
        L_0x0258:
            java.util.List r5 = m43511N(r1, r5)
            int r3 = p000.nm8.m48884o(r3, r5)
            goto L_0x0296
        L_0x0261:
            java.util.List r5 = m43511N(r1, r5)
            int r3 = p000.nm8.m48874e0(r3, r5, r11)
            goto L_0x0296
        L_0x026a:
            java.util.List r5 = m43511N(r1, r5)
            int r3 = p000.nm8.m48864Z(r3, r5, r11)
            goto L_0x0296
        L_0x0273:
            java.util.List r5 = m43511N(r1, r5)
            int r3 = p000.nm8.m48861W(r3, r5, r11)
            goto L_0x0296
        L_0x027c:
            java.util.List r5 = m43511N(r1, r5)
            int r3 = p000.nm8.m48860V(r3, r5, r11)
            goto L_0x0296
        L_0x0285:
            java.util.List r5 = m43511N(r1, r5)
            int r3 = p000.nm8.m48870c0(r3, r5, r11)
            goto L_0x0296
        L_0x028e:
            java.util.List r5 = m43511N(r1, r5)
            int r3 = p000.nm8.m48872d0(r3, r5, r11)
        L_0x0296:
            int r13 = r13 + r3
            goto L_0x03aa
        L_0x0299:
            boolean r14 = r0.mo41971y(r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x029f:
            java.lang.Object r5 = p000.qp8.m50740M(r1, r5)
            tj8 r5 = (p000.tj8) r5
            hm8 r6 = r0.mo41944C(r12)
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33963P(r3, r5, r6)
            goto L_0x0296
        L_0x02ae:
            boolean r14 = r0.mo41971y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = p000.qp8.m50736I(r1, r5)
        L_0x02b8:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33977g0(r3, r5)
            goto L_0x0296
        L_0x02bd:
            boolean r14 = r0.mo41971y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = p000.qp8.m50735H(r1, r5)
        L_0x02c7:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33986r0(r3, r5)
            goto L_0x0296
        L_0x02cc:
            boolean r5 = r0.mo41971y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02d2:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33983o0(r3, r9)
            goto L_0x0296
        L_0x02d7:
            boolean r5 = r0.mo41971y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02dd:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33991v0(r3, r11)
            goto L_0x0296
        L_0x02e2:
            boolean r14 = r0.mo41971y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = p000.qp8.m50735H(r1, r5)
        L_0x02ec:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33993w0(r3, r5)
            goto L_0x0296
        L_0x02f1:
            boolean r14 = r0.mo41971y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = p000.qp8.m50735H(r1, r5)
        L_0x02fb:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33982n0(r3, r5)
            goto L_0x0296
        L_0x0300:
            boolean r14 = r0.mo41971y(r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0306:
            java.lang.Object r5 = p000.qp8.m50740M(r1, r5)
        L_0x030a:
            com.google.android.gms.internal.clearcut.zzbb r5 = (com.google.android.gms.internal.clearcut.zzbb) r5
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33961N(r3, r5)
            goto L_0x0296
        L_0x0311:
            boolean r14 = r0.mo41971y(r1, r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0317:
            java.lang.Object r5 = p000.qp8.m50740M(r1, r5)
            hm8 r6 = r0.mo41944C(r12)
            int r3 = p000.nm8.m48883n(r3, r5, r6)
            goto L_0x0296
        L_0x0325:
            boolean r14 = r0.mo41971y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = p000.qp8.m50740M(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r6 == 0) goto L_0x0334
        L_0x0333:
            goto L_0x030a
        L_0x0334:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33946A(r3, r5)
            goto L_0x0296
        L_0x033c:
            boolean r5 = r0.mo41971y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0342:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33964Q(r3, r7)
            goto L_0x0296
        L_0x0348:
            boolean r5 = r0.mo41971y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x034e:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33988t0(r3, r11)
            goto L_0x0296
        L_0x0354:
            boolean r5 = r0.mo41971y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x035a:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33980k0(r3, r9)
            goto L_0x0296
        L_0x0360:
            boolean r14 = r0.mo41971y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = p000.qp8.m50735H(r1, r5)
        L_0x036a:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33979j0(r3, r5)
            goto L_0x0296
        L_0x0370:
            boolean r14 = r0.mo41971y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = p000.qp8.m50736I(r1, r5)
        L_0x037a:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33973d0(r3, r5)
            goto L_0x0296
        L_0x0380:
            boolean r14 = r0.mo41971y(r1, r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = p000.qp8.m50736I(r1, r5)
        L_0x038a:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33967W(r3, r5)
            goto L_0x0296
        L_0x0390:
            boolean r5 = r0.mo41971y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0396:
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33996z(r3, r4)
            goto L_0x0296
        L_0x039c:
            boolean r5 = r0.mo41971y(r1, r12)
            if (r5 == 0) goto L_0x03aa
        L_0x03a2:
            r5 = 0
            int r3 = com.google.android.gms.internal.clearcut.zzbn.m33995y(r3, r5)
            goto L_0x0296
        L_0x03aa:
            int r12 = r12 + 4
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x03b0:
            go8<?, ?> r2 = r0.f28240p
            int r1 = m43522r(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x03b8:
            sun.misc.Unsafe r2 = f28224s
            r3 = -1
            r5 = r11
            r6 = r5
            r12 = r6
        L_0x03be:
            int[] r13 = r0.f28225a
            int r13 = r13.length
            if (r5 >= r13) goto L_0x07cf
            int r13 = r0.mo41947F(r5)
            int[] r14 = r0.f28225a
            r15 = r14[r5]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x03e9
            int r11 = r5 + 2
            r11 = r14[r11]
            r14 = r11 & r8
            int r18 = r11 >>> 20
            int r18 = r7 << r18
            if (r14 == r3) goto L_0x03e7
            long r9 = (long) r14
            int r12 = r2.getInt(r1, r9)
            r3 = r14
        L_0x03e7:
            r9 = r11
            goto L_0x0408
        L_0x03e9:
            boolean r9 = r0.f28234j
            if (r9 == 0) goto L_0x0405
            com.google.android.gms.internal.clearcut.zzcb r9 = com.google.android.gms.internal.clearcut.zzcb.DOUBLE_LIST_PACKED
            int r9 = r9.mo30857id()
            if (r4 < r9) goto L_0x0405
            com.google.android.gms.internal.clearcut.zzcb r9 = com.google.android.gms.internal.clearcut.zzcb.SINT64_LIST_PACKED
            int r9 = r9.mo30857id()
            if (r4 > r9) goto L_0x0405
            int[] r9 = r0.f28225a
            int r10 = r5 + 2
            r9 = r9[r10]
            r9 = r9 & r8
            goto L_0x0406
        L_0x0405:
            r9 = 0
        L_0x0406:
            r18 = 0
        L_0x0408:
            r10 = r13 & r8
            long r10 = (long) r10
            switch(r4) {
                case 0: goto L_0x07b9;
                case 1: goto L_0x07a9;
                case 2: goto L_0x0797;
                case 3: goto L_0x0787;
                case 4: goto L_0x0777;
                case 5: goto L_0x076b;
                case 6: goto L_0x075f;
                case 7: goto L_0x0755;
                case 8: goto L_0x0740;
                case 9: goto L_0x072e;
                case 10: goto L_0x071f;
                case 11: goto L_0x0712;
                case 12: goto L_0x0705;
                case 13: goto L_0x06fa;
                case 14: goto L_0x06ef;
                case 15: goto L_0x06e2;
                case 16: goto L_0x06d5;
                case 17: goto L_0x06c2;
                case 18: goto L_0x06ae;
                case 19: goto L_0x06a0;
                case 20: goto L_0x0694;
                case 21: goto L_0x0688;
                case 22: goto L_0x067c;
                case 23: goto L_0x0670;
                case 24: goto L_0x06a0;
                case 25: goto L_0x0664;
                case 26: goto L_0x0659;
                case 27: goto L_0x064a;
                case 28: goto L_0x063e;
                case 29: goto L_0x0631;
                case 30: goto L_0x0624;
                case 31: goto L_0x06a0;
                case 32: goto L_0x0670;
                case 33: goto L_0x0617;
                case 34: goto L_0x060a;
                case 35: goto L_0x05ea;
                case 36: goto L_0x05d9;
                case 37: goto L_0x05c8;
                case 38: goto L_0x05b7;
                case 39: goto L_0x05a6;
                case 40: goto L_0x0595;
                case 41: goto L_0x0584;
                case 42: goto L_0x0572;
                case 43: goto L_0x0560;
                case 44: goto L_0x054e;
                case 45: goto L_0x053c;
                case 46: goto L_0x052a;
                case 47: goto L_0x0518;
                case 48: goto L_0x0506;
                case 49: goto L_0x04f6;
                case 50: goto L_0x04e6;
                case 51: goto L_0x04d8;
                case 52: goto L_0x04cb;
                case 53: goto L_0x04bb;
                case 54: goto L_0x04ab;
                case 55: goto L_0x049b;
                case 56: goto L_0x048d;
                case 57: goto L_0x0480;
                case 58: goto L_0x0478;
                case 59: goto L_0x0468;
                case 60: goto L_0x0460;
                case 61: goto L_0x0458;
                case 62: goto L_0x044c;
                case 63: goto L_0x0440;
                case 64: goto L_0x0438;
                case 65: goto L_0x0430;
                case 66: goto L_0x0424;
                case 67: goto L_0x0418;
                case 68: goto L_0x0410;
                default: goto L_0x040e;
            }
        L_0x040e:
            goto L_0x06ba
        L_0x0410:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            goto L_0x06c6
        L_0x0418:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            long r9 = m43515R(r1, r10)
            goto L_0x06dd
        L_0x0424:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            int r4 = m43514Q(r1, r10)
            goto L_0x06ea
        L_0x0430:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            goto L_0x06f3
        L_0x0438:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            goto L_0x06fe
        L_0x0440:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            int r4 = m43514Q(r1, r10)
            goto L_0x070d
        L_0x044c:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            int r4 = m43514Q(r1, r10)
            goto L_0x071a
        L_0x0458:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            goto L_0x0723
        L_0x0460:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            goto L_0x0732
        L_0x0468:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r9 == 0) goto L_0x074d
            goto L_0x074c
        L_0x0478:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            goto L_0x0759
        L_0x0480:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            r4 = 0
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m33988t0(r15, r4)
            goto L_0x0703
        L_0x048d:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            r9 = 0
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33980k0(r15, r9)
            goto L_0x06b9
        L_0x049b:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            int r4 = m43514Q(r1, r10)
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33979j0(r15, r4)
            goto L_0x06b9
        L_0x04ab:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            long r9 = m43515R(r1, r10)
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33973d0(r15, r9)
            goto L_0x06b9
        L_0x04bb:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            long r9 = m43515R(r1, r10)
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33967W(r15, r9)
            goto L_0x06b9
        L_0x04cb:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            r4 = 0
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m33996z(r15, r4)
            goto L_0x0703
        L_0x04d8:
            boolean r4 = r0.mo41972z(r1, r15, r5)
            if (r4 == 0) goto L_0x06ba
            r9 = 0
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33995y(r15, r9)
            goto L_0x06b9
        L_0x04e6:
            ij8 r4 = r0.f28242r
            java.lang.Object r9 = r2.getObject(r1, r10)
            java.lang.Object r10 = r0.mo41945D(r5)
            int r4 = r4.mo43630g(r15, r9, r10)
            goto L_0x06b9
        L_0x04f6:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            hm8 r9 = r0.mo41944C(r5)
            int r4 = p000.nm8.m48890u(r15, r4, r9)
            goto L_0x06b9
        L_0x0506:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48886q(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x0518:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48848J(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x052a:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48852N(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x053c:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48850L(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x054e:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48891v(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x0560:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48845G(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x0572:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48854P(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x0584:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48850L(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x0595:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48852N(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x05a6:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48843E(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x05b7:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48879j(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x05c8:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48865a(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x05d9:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48850L(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
            goto L_0x05fa
        L_0x05ea:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48852N(r4)
            if (r4 <= 0) goto L_0x06ba
            boolean r10 = r0.f28234j
            if (r10 == 0) goto L_0x05fe
        L_0x05fa:
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x05fe:
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m33948B0(r15)
            int r10 = com.google.android.gms.internal.clearcut.zzbn.m33952D0(r4)
            int r9 = r9 + r10
            int r9 = r9 + r4
            goto L_0x0703
        L_0x060a:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = p000.nm8.m48862X(r15, r4, r9)
            goto L_0x06ab
        L_0x0617:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48868b0(r15, r4, r9)
            goto L_0x06ab
        L_0x0624:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48863Y(r15, r4, r9)
            goto L_0x06ab
        L_0x0631:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48866a0(r15, r4, r9)
            goto L_0x06b9
        L_0x063e:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48889t(r15, r4)
            goto L_0x06b9
        L_0x064a:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            hm8 r9 = r0.mo41944C(r5)
            int r4 = p000.nm8.m48885p(r15, r4, r9)
            goto L_0x06b9
        L_0x0659:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48884o(r15, r4)
            goto L_0x06b9
        L_0x0664:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = p000.nm8.m48874e0(r15, r4, r9)
            goto L_0x06ab
        L_0x0670:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48872d0(r15, r4, r9)
            goto L_0x06ab
        L_0x067c:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48864Z(r15, r4, r9)
            goto L_0x06ab
        L_0x0688:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48861W(r15, r4, r9)
            goto L_0x06ab
        L_0x0694:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48860V(r15, r4, r9)
            goto L_0x06ab
        L_0x06a0:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48870c0(r15, r4, r9)
        L_0x06ab:
            int r6 = r6 + r4
            r4 = r9
            goto L_0x06bb
        L_0x06ae:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = p000.nm8.m48872d0(r15, r4, r9)
        L_0x06b9:
            int r6 = r6 + r4
        L_0x06ba:
            r4 = 0
        L_0x06bb:
            r9 = 0
            r10 = 0
            r13 = 0
            goto L_0x07c8
        L_0x06c2:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ba
        L_0x06c6:
            java.lang.Object r4 = r2.getObject(r1, r10)
            tj8 r4 = (p000.tj8) r4
            hm8 r9 = r0.mo41944C(r5)
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33963P(r15, r4, r9)
            goto L_0x06b9
        L_0x06d5:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ba
            long r9 = r2.getLong(r1, r10)
        L_0x06dd:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33977g0(r15, r9)
            goto L_0x06b9
        L_0x06e2:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ba
            int r4 = r2.getInt(r1, r10)
        L_0x06ea:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33986r0(r15, r4)
            goto L_0x06b9
        L_0x06ef:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ba
        L_0x06f3:
            r9 = 0
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33983o0(r15, r9)
            goto L_0x06b9
        L_0x06fa:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ba
        L_0x06fe:
            r4 = 0
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m33991v0(r15, r4)
        L_0x0703:
            int r6 = r6 + r9
            goto L_0x06ba
        L_0x0705:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ba
            int r4 = r2.getInt(r1, r10)
        L_0x070d:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33993w0(r15, r4)
            goto L_0x06b9
        L_0x0712:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ba
            int r4 = r2.getInt(r1, r10)
        L_0x071a:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33982n0(r15, r4)
            goto L_0x06b9
        L_0x071f:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ba
        L_0x0723:
            java.lang.Object r4 = r2.getObject(r1, r10)
        L_0x0727:
            com.google.android.gms.internal.clearcut.zzbb r4 = (com.google.android.gms.internal.clearcut.zzbb) r4
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33961N(r15, r4)
            goto L_0x06b9
        L_0x072e:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ba
        L_0x0732:
            java.lang.Object r4 = r2.getObject(r1, r10)
            hm8 r9 = r0.mo41944C(r5)
            int r4 = p000.nm8.m48883n(r15, r4, r9)
            goto L_0x06b9
        L_0x0740:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ba
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r9 == 0) goto L_0x074d
        L_0x074c:
            goto L_0x0727
        L_0x074d:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33946A(r15, r4)
            goto L_0x06b9
        L_0x0755:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ba
        L_0x0759:
            int r4 = com.google.android.gms.internal.clearcut.zzbn.m33964Q(r15, r7)
            goto L_0x06b9
        L_0x075f:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06ba
            r4 = 0
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m33988t0(r15, r4)
            int r6 = r6 + r9
            goto L_0x06bb
        L_0x076b:
            r4 = 0
            r9 = r12 & r18
            r13 = 0
            if (r9 == 0) goto L_0x07a7
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m33980k0(r15, r13)
            goto L_0x07a6
        L_0x0777:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x07a7
            int r9 = r2.getInt(r1, r10)
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m33979j0(r15, r9)
            goto L_0x07a6
        L_0x0787:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x07a7
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m33973d0(r15, r9)
            goto L_0x07a6
        L_0x0797:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x07a7
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.clearcut.zzbn.m33967W(r15, r9)
        L_0x07a6:
            int r6 = r6 + r9
        L_0x07a7:
            r9 = 0
            goto L_0x07b6
        L_0x07a9:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x07a7
            r9 = 0
            int r10 = com.google.android.gms.internal.clearcut.zzbn.m33996z(r15, r9)
            int r6 = r6 + r10
        L_0x07b6:
            r10 = 0
            goto L_0x07c8
        L_0x07b9:
            r4 = 0
            r9 = 0
            r13 = 0
            r10 = r12 & r18
            if (r10 == 0) goto L_0x07b6
            r10 = 0
            int r15 = com.google.android.gms.internal.clearcut.zzbn.m33995y(r15, r10)
            int r6 = r6 + r15
        L_0x07c8:
            int r5 = r5 + 4
            r11 = r4
            r4 = r9
            r9 = r13
            goto L_0x03be
        L_0x07cf:
            go8<?, ?> r2 = r0.f28240p
            int r2 = m43522r(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f28231g
            if (r2 == 0) goto L_0x07e5
            id8<?> r2 = r0.f28241q
            td8 r1 = r2.mo30760b(r1)
            int r1 = r1.mo48090l()
            int r6 = r6 + r1
        L_0x07e5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk8.mo41962h(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0385, code lost:
        r15.mo42007M(r9, p000.qp8.m50740M(r14, (long) (r8 & 1048575)), mo41944C(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03a0, code lost:
        r15.mo42013a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03b1, code lost:
        r15.mo42028s(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03c2, code lost:
        r15.mo42003I(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d3, code lost:
        r15.mo42012R(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03e4, code lost:
        r15.mo42010P(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03f5, code lost:
        r15.mo42027r(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0400, code lost:
        r15.mo42001G(r9, (com.google.android.gms.internal.clearcut.zzbb) p000.qp8.m50740M(r14, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0413, code lost:
        r15.mo42009O(r9, p000.qp8.m50740M(r14, (long) (r8 & 1048575)), mo41944C(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0428, code lost:
        m43524u(r9, p000.qp8.m50740M(r14, (long) (r8 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x043f, code lost:
        r15.mo41999E(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0450, code lost:
        r15.mo42023n(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0460, code lost:
        r15.mo42016e(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0470, code lost:
        r15.mo42015c(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0480, code lost:
        r15.mo42020k(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0490, code lost:
        r15.mo42008N(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04a0, code lost:
        r15.mo42022m(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04b0, code lost:
        r15.mo42021l(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0842, code lost:
        r15.mo42007M(r10, p000.qp8.m50740M(r14, (long) (r9 & 1048575)), mo41944C(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x085d, code lost:
        r15.mo42013a(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x086e, code lost:
        r15.mo42028s(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x087f, code lost:
        r15.mo42003I(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0890, code lost:
        r15.mo42012R(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x08a1, code lost:
        r15.mo42010P(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x08b2, code lost:
        r15.mo42027r(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x08bd, code lost:
        r15.mo42001G(r10, (com.google.android.gms.internal.clearcut.zzbb) p000.qp8.m50740M(r14, (long) (r9 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x08d0, code lost:
        r15.mo42009O(r10, p000.qp8.m50740M(r14, (long) (r9 & 1048575)), mo41944C(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08e5, code lost:
        m43524u(r10, p000.qp8.m50740M(r14, (long) (r9 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x08fc, code lost:
        r15.mo41999E(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x090d, code lost:
        r15.mo42023n(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x091d, code lost:
        r15.mo42016e(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x092d, code lost:
        r15.mo42015c(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x093d, code lost:
        r15.mo42020k(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x094d, code lost:
        r15.mo42008N(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x095d, code lost:
        r15.mo42022m(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x096d, code lost:
        r15.mo42021l(r10, r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0976  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41963i(T r14, p000.dr8 r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.mo42002H()
            int r1 = com.google.android.gms.internal.clearcut.C4056e.C4061e.f22466m
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04cf
            go8<?, ?> r0 = r13.f28240p
            m43525w(r0, r14, r15)
            boolean r0 = r13.f28231g
            if (r0 == 0) goto L_0x0030
            id8<?> r0 = r13.f28241q
            td8 r0 = r0.mo30760b(r14)
            boolean r1 = r0.mo48080b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.mo48079a()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.f28225a
            int r7 = r7.length
            int r7 = r7 + -4
        L_0x0037:
            if (r7 < 0) goto L_0x04b7
            int r8 = r13.mo41947F(r7)
            int[] r9 = r13.f28225a
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            id8<?> r10 = r13.f28241q
            int r10 = r10.mo30759a(r1)
            if (r10 <= r9) goto L_0x005f
            id8<?> r10 = r13.f28241q
            r10.mo30762d(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0041
        L_0x005d:
            r1 = r3
            goto L_0x0041
        L_0x005f:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04a4;
                case 1: goto L_0x0494;
                case 2: goto L_0x0484;
                case 3: goto L_0x0474;
                case 4: goto L_0x0464;
                case 5: goto L_0x0454;
                case 6: goto L_0x0444;
                case 7: goto L_0x0433;
                case 8: goto L_0x0422;
                case 9: goto L_0x040d;
                case 10: goto L_0x03fa;
                case 11: goto L_0x03e9;
                case 12: goto L_0x03d8;
                case 13: goto L_0x03c7;
                case 14: goto L_0x03b6;
                case 15: goto L_0x03a5;
                case 16: goto L_0x0394;
                case 17: goto L_0x037f;
                case 18: goto L_0x036e;
                case 19: goto L_0x035d;
                case 20: goto L_0x034c;
                case 21: goto L_0x033b;
                case 22: goto L_0x032a;
                case 23: goto L_0x0319;
                case 24: goto L_0x0308;
                case 25: goto L_0x02f7;
                case 26: goto L_0x02e6;
                case 27: goto L_0x02d1;
                case 28: goto L_0x02c0;
                case 29: goto L_0x02af;
                case 30: goto L_0x029e;
                case 31: goto L_0x028d;
                case 32: goto L_0x027c;
                case 33: goto L_0x026b;
                case 34: goto L_0x025a;
                case 35: goto L_0x0249;
                case 36: goto L_0x0238;
                case 37: goto L_0x0227;
                case 38: goto L_0x0216;
                case 39: goto L_0x0205;
                case 40: goto L_0x01f4;
                case 41: goto L_0x01e3;
                case 42: goto L_0x01d2;
                case 43: goto L_0x01c1;
                case 44: goto L_0x01b0;
                case 45: goto L_0x019f;
                case 46: goto L_0x018e;
                case 47: goto L_0x017d;
                case 48: goto L_0x016c;
                case 49: goto L_0x0157;
                case 50: goto L_0x014c;
                case 51: goto L_0x013e;
                case 52: goto L_0x0130;
                case 53: goto L_0x0122;
                case 54: goto L_0x0114;
                case 55: goto L_0x0106;
                case 56: goto L_0x00f8;
                case 57: goto L_0x00ea;
                case 58: goto L_0x00dc;
                case 59: goto L_0x00d4;
                case 60: goto L_0x00cc;
                case 61: goto L_0x00c4;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x007e;
                case 67: goto L_0x0070;
                case 68: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x04b3
        L_0x0068:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0385
        L_0x0070:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m43515R(r14, r10)
            goto L_0x03a0
        L_0x007e:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m43514Q(r14, r10)
            goto L_0x03b1
        L_0x008c:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m43515R(r14, r10)
            goto L_0x03c2
        L_0x009a:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m43514Q(r14, r10)
            goto L_0x03d3
        L_0x00a8:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m43514Q(r14, r10)
            goto L_0x03e4
        L_0x00b6:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m43514Q(r14, r10)
            goto L_0x03f5
        L_0x00c4:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0400
        L_0x00cc:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0413
        L_0x00d4:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            goto L_0x0428
        L_0x00dc:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m43516S(r14, r10)
            goto L_0x043f
        L_0x00ea:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m43514Q(r14, r10)
            goto L_0x0450
        L_0x00f8:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m43515R(r14, r10)
            goto L_0x0460
        L_0x0106:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m43514Q(r14, r10)
            goto L_0x0470
        L_0x0114:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m43515R(r14, r10)
            goto L_0x0480
        L_0x0122:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m43515R(r14, r10)
            goto L_0x0490
        L_0x0130:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m43513P(r14, r10)
            goto L_0x04a0
        L_0x013e:
            boolean r10 = r13.mo41972z(r14, r9, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m43512O(r14, r10)
            goto L_0x04b0
        L_0x014c:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            r13.mo41970x(r15, r9, r8, r7)
            goto L_0x04b3
        L_0x0157:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            hm8 r10 = r13.mo41944C(r7)
            p000.nm8.m48881l(r9, r8, r15, r10)
            goto L_0x04b3
        L_0x016c:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48844F(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x017d:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48855Q(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x018e:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48849K(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x019f:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48857S(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01b0:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48858T(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01c1:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48853O(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01d2:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48859U(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01e3:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48856R(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x01f4:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48846H(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0205:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48851M(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0216:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48893x(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0227:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48887r(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0238:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48882m(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x0249:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48875f(r9, r8, r15, r4)
            goto L_0x04b3
        L_0x025a:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48844F(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x026b:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48855Q(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x027c:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48849K(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x028d:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48857S(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x029e:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48858T(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x02af:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48853O(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x02c0:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48880k(r9, r8, r15)
            goto L_0x04b3
        L_0x02d1:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            hm8 r10 = r13.mo41944C(r7)
            p000.nm8.m48873e(r9, r8, r15, r10)
            goto L_0x04b3
        L_0x02e6:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48871d(r9, r8, r15)
            goto L_0x04b3
        L_0x02f7:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48859U(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x0308:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48856R(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x0319:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48846H(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x032a:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48851M(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x033b:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48893x(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x034c:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48887r(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x035d:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48882m(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x036e:
            int[] r9 = r13.f28225a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            p000.nm8.m48875f(r9, r8, r15, r5)
            goto L_0x04b3
        L_0x037f:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0385:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            hm8 r10 = r13.mo41944C(r7)
            r15.mo42007M(r9, r8, r10)
            goto L_0x04b3
        L_0x0394:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = p000.qp8.m50736I(r14, r10)
        L_0x03a0:
            r15.mo42013a(r9, r10)
            goto L_0x04b3
        L_0x03a5:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = p000.qp8.m50735H(r14, r10)
        L_0x03b1:
            r15.mo42028s(r9, r8)
            goto L_0x04b3
        L_0x03b6:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = p000.qp8.m50736I(r14, r10)
        L_0x03c2:
            r15.mo42003I(r9, r10)
            goto L_0x04b3
        L_0x03c7:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = p000.qp8.m50735H(r14, r10)
        L_0x03d3:
            r15.mo42012R(r9, r8)
            goto L_0x04b3
        L_0x03d8:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = p000.qp8.m50735H(r14, r10)
        L_0x03e4:
            r15.mo42010P(r9, r8)
            goto L_0x04b3
        L_0x03e9:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = p000.qp8.m50735H(r14, r10)
        L_0x03f5:
            r15.mo42027r(r9, r8)
            goto L_0x04b3
        L_0x03fa:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0400:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            com.google.android.gms.internal.clearcut.zzbb r8 = (com.google.android.gms.internal.clearcut.zzbb) r8
            r15.mo42001G(r9, r8)
            goto L_0x04b3
        L_0x040d:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0413:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            hm8 r10 = r13.mo41944C(r7)
            r15.mo42009O(r9, r8, r10)
            goto L_0x04b3
        L_0x0422:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
        L_0x0428:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = p000.qp8.m50740M(r14, r10)
            m43524u(r9, r8, r15)
            goto L_0x04b3
        L_0x0433:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = p000.qp8.m50737J(r14, r10)
        L_0x043f:
            r15.mo41999E(r9, r8)
            goto L_0x04b3
        L_0x0444:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = p000.qp8.m50735H(r14, r10)
        L_0x0450:
            r15.mo42023n(r9, r8)
            goto L_0x04b3
        L_0x0454:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = p000.qp8.m50736I(r14, r10)
        L_0x0460:
            r15.mo42016e(r9, r10)
            goto L_0x04b3
        L_0x0464:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = p000.qp8.m50735H(r14, r10)
        L_0x0470:
            r15.mo42015c(r9, r8)
            goto L_0x04b3
        L_0x0474:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = p000.qp8.m50736I(r14, r10)
        L_0x0480:
            r15.mo42020k(r9, r10)
            goto L_0x04b3
        L_0x0484:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = p000.qp8.m50736I(r14, r10)
        L_0x0490:
            r15.mo42008N(r9, r10)
            goto L_0x04b3
        L_0x0494:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = p000.qp8.m50738K(r14, r10)
        L_0x04a0:
            r15.mo42022m(r9, r8)
            goto L_0x04b3
        L_0x04a4:
            boolean r10 = r13.mo41971y(r14, r7)
            if (r10 == 0) goto L_0x04b3
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = p000.qp8.m50739L(r14, r10)
        L_0x04b0:
            r15.mo42021l(r9, r10)
        L_0x04b3:
            int r7 = r7 + -4
            goto L_0x0037
        L_0x04b7:
            if (r1 == 0) goto L_0x04ce
            id8<?> r14 = r13.f28241q
            r14.mo30762d(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x04cc
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x04b7
        L_0x04cc:
            r1 = r3
            goto L_0x04b7
        L_0x04ce:
            return
        L_0x04cf:
            boolean r0 = r13.f28233i
            if (r0 == 0) goto L_0x0990
            boolean r0 = r13.f28231g
            if (r0 == 0) goto L_0x04ee
            id8<?> r0 = r13.f28241q
            td8 r0 = r0.mo30760b(r14)
            boolean r1 = r0.mo48080b()
            if (r1 != 0) goto L_0x04ee
            java.util.Iterator r0 = r0.mo48084e()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x04f0
        L_0x04ee:
            r0 = r3
            r1 = r0
        L_0x04f0:
            int[] r7 = r13.f28225a
            int r7 = r7.length
            r8 = r5
        L_0x04f4:
            if (r8 >= r7) goto L_0x0974
            int r9 = r13.mo41947F(r8)
            int[] r10 = r13.f28225a
            r10 = r10[r8]
        L_0x04fe:
            if (r1 == 0) goto L_0x051c
            id8<?> r11 = r13.f28241q
            int r11 = r11.mo30759a(r1)
            if (r11 > r10) goto L_0x051c
            id8<?> r11 = r13.f28241q
            r11.mo30762d(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x051a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x04fe
        L_0x051a:
            r1 = r3
            goto L_0x04fe
        L_0x051c:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0961;
                case 1: goto L_0x0951;
                case 2: goto L_0x0941;
                case 3: goto L_0x0931;
                case 4: goto L_0x0921;
                case 5: goto L_0x0911;
                case 6: goto L_0x0901;
                case 7: goto L_0x08f0;
                case 8: goto L_0x08df;
                case 9: goto L_0x08ca;
                case 10: goto L_0x08b7;
                case 11: goto L_0x08a6;
                case 12: goto L_0x0895;
                case 13: goto L_0x0884;
                case 14: goto L_0x0873;
                case 15: goto L_0x0862;
                case 16: goto L_0x0851;
                case 17: goto L_0x083c;
                case 18: goto L_0x082b;
                case 19: goto L_0x081a;
                case 20: goto L_0x0809;
                case 21: goto L_0x07f8;
                case 22: goto L_0x07e7;
                case 23: goto L_0x07d6;
                case 24: goto L_0x07c5;
                case 25: goto L_0x07b4;
                case 26: goto L_0x07a3;
                case 27: goto L_0x078e;
                case 28: goto L_0x077d;
                case 29: goto L_0x076c;
                case 30: goto L_0x075b;
                case 31: goto L_0x074a;
                case 32: goto L_0x0739;
                case 33: goto L_0x0728;
                case 34: goto L_0x0717;
                case 35: goto L_0x0706;
                case 36: goto L_0x06f5;
                case 37: goto L_0x06e4;
                case 38: goto L_0x06d3;
                case 39: goto L_0x06c2;
                case 40: goto L_0x06b1;
                case 41: goto L_0x06a0;
                case 42: goto L_0x068f;
                case 43: goto L_0x067e;
                case 44: goto L_0x066d;
                case 45: goto L_0x065c;
                case 46: goto L_0x064b;
                case 47: goto L_0x063a;
                case 48: goto L_0x0629;
                case 49: goto L_0x0614;
                case 50: goto L_0x0609;
                case 51: goto L_0x05fb;
                case 52: goto L_0x05ed;
                case 53: goto L_0x05df;
                case 54: goto L_0x05d1;
                case 55: goto L_0x05c3;
                case 56: goto L_0x05b5;
                case 57: goto L_0x05a7;
                case 58: goto L_0x0599;
                case 59: goto L_0x0591;
                case 60: goto L_0x0589;
                case 61: goto L_0x0581;
                case 62: goto L_0x0573;
                case 63: goto L_0x0565;
                case 64: goto L_0x0557;
                case 65: goto L_0x0549;
                case 66: goto L_0x053b;
                case 67: goto L_0x052d;
                case 68: goto L_0x0525;
                default: goto L_0x0523;
            }
        L_0x0523:
            goto L_0x0970
        L_0x0525:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            goto L_0x0842
        L_0x052d:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m43515R(r14, r11)
            goto L_0x085d
        L_0x053b:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m43514Q(r14, r11)
            goto L_0x086e
        L_0x0549:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m43515R(r14, r11)
            goto L_0x087f
        L_0x0557:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m43514Q(r14, r11)
            goto L_0x0890
        L_0x0565:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m43514Q(r14, r11)
            goto L_0x08a1
        L_0x0573:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m43514Q(r14, r11)
            goto L_0x08b2
        L_0x0581:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            goto L_0x08bd
        L_0x0589:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            goto L_0x08d0
        L_0x0591:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            goto L_0x08e5
        L_0x0599:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m43516S(r14, r11)
            goto L_0x08fc
        L_0x05a7:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m43514Q(r14, r11)
            goto L_0x090d
        L_0x05b5:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m43515R(r14, r11)
            goto L_0x091d
        L_0x05c3:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m43514Q(r14, r11)
            goto L_0x092d
        L_0x05d1:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m43515R(r14, r11)
            goto L_0x093d
        L_0x05df:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m43515R(r14, r11)
            goto L_0x094d
        L_0x05ed:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m43513P(r14, r11)
            goto L_0x095d
        L_0x05fb:
            boolean r11 = r13.mo41972z(r14, r10, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m43512O(r14, r11)
            goto L_0x096d
        L_0x0609:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            r13.mo41970x(r15, r10, r9, r8)
            goto L_0x0970
        L_0x0614:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            hm8 r11 = r13.mo41944C(r8)
            p000.nm8.m48881l(r10, r9, r15, r11)
            goto L_0x0970
        L_0x0629:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48844F(r10, r9, r15, r4)
            goto L_0x0970
        L_0x063a:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48855Q(r10, r9, r15, r4)
            goto L_0x0970
        L_0x064b:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48849K(r10, r9, r15, r4)
            goto L_0x0970
        L_0x065c:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48857S(r10, r9, r15, r4)
            goto L_0x0970
        L_0x066d:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48858T(r10, r9, r15, r4)
            goto L_0x0970
        L_0x067e:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48853O(r10, r9, r15, r4)
            goto L_0x0970
        L_0x068f:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48859U(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06a0:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48856R(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06b1:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48846H(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06c2:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48851M(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06d3:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48893x(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06e4:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48887r(r10, r9, r15, r4)
            goto L_0x0970
        L_0x06f5:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48882m(r10, r9, r15, r4)
            goto L_0x0970
        L_0x0706:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48875f(r10, r9, r15, r4)
            goto L_0x0970
        L_0x0717:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48844F(r10, r9, r15, r5)
            goto L_0x0970
        L_0x0728:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48855Q(r10, r9, r15, r5)
            goto L_0x0970
        L_0x0739:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48849K(r10, r9, r15, r5)
            goto L_0x0970
        L_0x074a:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48857S(r10, r9, r15, r5)
            goto L_0x0970
        L_0x075b:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48858T(r10, r9, r15, r5)
            goto L_0x0970
        L_0x076c:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48853O(r10, r9, r15, r5)
            goto L_0x0970
        L_0x077d:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48880k(r10, r9, r15)
            goto L_0x0970
        L_0x078e:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            hm8 r11 = r13.mo41944C(r8)
            p000.nm8.m48873e(r10, r9, r15, r11)
            goto L_0x0970
        L_0x07a3:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48871d(r10, r9, r15)
            goto L_0x0970
        L_0x07b4:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48859U(r10, r9, r15, r5)
            goto L_0x0970
        L_0x07c5:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48856R(r10, r9, r15, r5)
            goto L_0x0970
        L_0x07d6:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48846H(r10, r9, r15, r5)
            goto L_0x0970
        L_0x07e7:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48851M(r10, r9, r15, r5)
            goto L_0x0970
        L_0x07f8:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48893x(r10, r9, r15, r5)
            goto L_0x0970
        L_0x0809:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48887r(r10, r9, r15, r5)
            goto L_0x0970
        L_0x081a:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48882m(r10, r9, r15, r5)
            goto L_0x0970
        L_0x082b:
            int[] r10 = r13.f28225a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            p000.nm8.m48875f(r10, r9, r15, r5)
            goto L_0x0970
        L_0x083c:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
        L_0x0842:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            hm8 r11 = r13.mo41944C(r8)
            r15.mo42007M(r10, r9, r11)
            goto L_0x0970
        L_0x0851:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = p000.qp8.m50736I(r14, r11)
        L_0x085d:
            r15.mo42013a(r10, r11)
            goto L_0x0970
        L_0x0862:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = p000.qp8.m50735H(r14, r11)
        L_0x086e:
            r15.mo42028s(r10, r9)
            goto L_0x0970
        L_0x0873:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = p000.qp8.m50736I(r14, r11)
        L_0x087f:
            r15.mo42003I(r10, r11)
            goto L_0x0970
        L_0x0884:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = p000.qp8.m50735H(r14, r11)
        L_0x0890:
            r15.mo42012R(r10, r9)
            goto L_0x0970
        L_0x0895:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = p000.qp8.m50735H(r14, r11)
        L_0x08a1:
            r15.mo42010P(r10, r9)
            goto L_0x0970
        L_0x08a6:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = p000.qp8.m50735H(r14, r11)
        L_0x08b2:
            r15.mo42027r(r10, r9)
            goto L_0x0970
        L_0x08b7:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
        L_0x08bd:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            com.google.android.gms.internal.clearcut.zzbb r9 = (com.google.android.gms.internal.clearcut.zzbb) r9
            r15.mo42001G(r10, r9)
            goto L_0x0970
        L_0x08ca:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
        L_0x08d0:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            hm8 r11 = r13.mo41944C(r8)
            r15.mo42009O(r10, r9, r11)
            goto L_0x0970
        L_0x08df:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
        L_0x08e5:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = p000.qp8.m50740M(r14, r11)
            m43524u(r10, r9, r15)
            goto L_0x0970
        L_0x08f0:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = p000.qp8.m50737J(r14, r11)
        L_0x08fc:
            r15.mo41999E(r10, r9)
            goto L_0x0970
        L_0x0901:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = p000.qp8.m50735H(r14, r11)
        L_0x090d:
            r15.mo42023n(r10, r9)
            goto L_0x0970
        L_0x0911:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = p000.qp8.m50736I(r14, r11)
        L_0x091d:
            r15.mo42016e(r10, r11)
            goto L_0x0970
        L_0x0921:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = p000.qp8.m50735H(r14, r11)
        L_0x092d:
            r15.mo42015c(r10, r9)
            goto L_0x0970
        L_0x0931:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = p000.qp8.m50736I(r14, r11)
        L_0x093d:
            r15.mo42020k(r10, r11)
            goto L_0x0970
        L_0x0941:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = p000.qp8.m50736I(r14, r11)
        L_0x094d:
            r15.mo42008N(r10, r11)
            goto L_0x0970
        L_0x0951:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = p000.qp8.m50738K(r14, r11)
        L_0x095d:
            r15.mo42022m(r10, r9)
            goto L_0x0970
        L_0x0961:
            boolean r11 = r13.mo41971y(r14, r8)
            if (r11 == 0) goto L_0x0970
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = p000.qp8.m50739L(r14, r11)
        L_0x096d:
            r15.mo42021l(r10, r11)
        L_0x0970:
            int r8 = r8 + 4
            goto L_0x04f4
        L_0x0974:
            if (r1 == 0) goto L_0x098a
            id8<?> r2 = r13.f28241q
            r2.mo30762d(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0988
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0974
        L_0x0988:
            r1 = r3
            goto L_0x0974
        L_0x098a:
            go8<?, ?> r0 = r13.f28240p
            m43525w(r0, r14, r15)
            return
        L_0x0990:
            r13.mo41953L(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk8.mo41963i(java.lang.Object, dr8):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b7, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013f, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014c, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0150, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015e, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016f, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41964k(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, p000.t98 r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f28224s
            int[] r7 = r0.f28225a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0164;
                case 52: goto L_0x0154;
                case 53: goto L_0x0144;
                case 54: goto L_0x0144;
                case 55: goto L_0x0137;
                case 56: goto L_0x012b;
                case 57: goto L_0x0120;
                case 58: goto L_0x010a;
                case 59: goto L_0x00de;
                case 60: goto L_0x00ba;
                case 61: goto L_0x00a2;
                case 62: goto L_0x0137;
                case 63: goto L_0x0074;
                case 64: goto L_0x0120;
                case 65: goto L_0x012b;
                case 66: goto L_0x0066;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0178
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0178
            r2 = r2 & -8
            r7 = r2 | 4
            hm8 r2 = r0.mo41944C(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = m43520p(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f34171c
            if (r15 != 0) goto L_0x0052
            goto L_0x0150
        L_0x0052:
            java.lang.Object r3 = p000.vf8.m53378d(r15, r3)
            goto L_0x0150
        L_0x0058:
            if (r5 != 0) goto L_0x0178
            int r2 = p000.q98.m50477g(r3, r4, r11)
            long r3 = r11.f34170b
            long r3 = p000.hc8.m45122a(r3)
            goto L_0x014c
        L_0x0066:
            if (r5 != 0) goto L_0x0178
            int r2 = p000.q98.m50475e(r3, r4, r11)
            int r3 = r11.f34169a
            int r3 = p000.hc8.m45124e(r3)
            goto L_0x013f
        L_0x0074:
            if (r5 != 0) goto L_0x0178
            int r3 = p000.q98.m50475e(r3, r4, r11)
            int r4 = r11.f34169a
            bg8 r5 = r0.mo41946E(r6)
            if (r5 == 0) goto L_0x0098
            yf8 r5 = r5.mo29577h(r4)
            if (r5 == 0) goto L_0x0089
            goto L_0x0098
        L_0x0089:
            jo8 r1 = m43517T(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo44548e(r2, r4)
            r2 = r3
            goto L_0x0179
        L_0x0098:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x0174
        L_0x00a2:
            if (r5 != r15) goto L_0x0178
            int r2 = p000.q98.m50475e(r3, r4, r11)
            int r4 = r11.f34169a
            if (r4 != 0) goto L_0x00b0
            com.google.android.gms.internal.clearcut.zzbb r3 = com.google.android.gms.internal.clearcut.zzbb.zzfi
            goto L_0x0150
        L_0x00b0:
            com.google.android.gms.internal.clearcut.zzbb r3 = com.google.android.gms.internal.clearcut.zzbb.zzb((byte[]) r3, (int) r2, (int) r4)
            r12.putObject(r1, r9, r3)
        L_0x00b7:
            int r2 = r2 + r4
            goto L_0x0174
        L_0x00ba:
            if (r5 != r15) goto L_0x0178
            hm8 r2 = r0.mo41944C(r6)
            r5 = r20
            int r2 = m43521q(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d1
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00d2
        L_0x00d1:
            r15 = 0
        L_0x00d2:
            java.lang.Object r3 = r11.f34171c
            if (r15 != 0) goto L_0x00d8
            goto L_0x0150
        L_0x00d8:
            java.lang.Object r3 = p000.vf8.m53378d(r15, r3)
            goto L_0x0150
        L_0x00de:
            if (r5 != r15) goto L_0x0178
            int r2 = p000.q98.m50475e(r3, r4, r11)
            int r4 = r11.f34169a
            if (r4 != 0) goto L_0x00eb
            java.lang.String r3 = ""
            goto L_0x0150
        L_0x00eb:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00ff
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.clearcut.C4064h.m33897i(r3, r2, r5)
            if (r5 == 0) goto L_0x00fa
            goto L_0x00ff
        L_0x00fa:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbp()
            throw r1
        L_0x00ff:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = p000.vf8.f34940a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            goto L_0x00b7
        L_0x010a:
            if (r5 != 0) goto L_0x0178
            int r2 = p000.q98.m50477g(r3, r4, r11)
            long r3 = r11.f34170b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x011a
            r15 = 1
            goto L_0x011b
        L_0x011a:
            r15 = 0
        L_0x011b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x0150
        L_0x0120:
            if (r5 != r7) goto L_0x0178
            int r2 = p000.q98.m50478h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x015e
        L_0x012b:
            r2 = 1
            if (r5 != r2) goto L_0x0178
            long r2 = p000.q98.m50481k(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x016f
        L_0x0137:
            if (r5 != 0) goto L_0x0178
            int r2 = p000.q98.m50475e(r3, r4, r11)
            int r3 = r11.f34169a
        L_0x013f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0150
        L_0x0144:
            if (r5 != 0) goto L_0x0178
            int r2 = p000.q98.m50477g(r3, r4, r11)
            long r3 = r11.f34170b
        L_0x014c:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0150:
            r12.putObject(r1, r9, r3)
            goto L_0x0174
        L_0x0154:
            if (r5 != r7) goto L_0x0178
            float r2 = p000.q98.m50484n(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x015e:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0174
        L_0x0164:
            r2 = 1
            if (r5 != r2) goto L_0x0178
            double r2 = p000.q98.m50482l(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x016f:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0174:
            r12.putInt(r1, r13, r8)
            goto L_0x0179
        L_0x0178:
            r2 = r4
        L_0x0179:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk8.mo41964k(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, t98):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0233, code lost:
        if (r7.f34170b != 0) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0235, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0237, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0238, code lost:
        r12.mo48920j(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x023b, code lost:
        if (r4 >= r5) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x023d, code lost:
        r6 = p000.q98.m50475e(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0243, code lost:
        if (r2 != r7.f34169a) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0245, code lost:
        r4 = p000.q98.m50477g(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x024d, code lost:
        if (r7.f34170b == 0) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0137, code lost:
        if (r4 == 0) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0139, code lost:
        r12.add(com.google.android.gms.internal.clearcut.zzbb.zzfi);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013f, code lost:
        r12.add(com.google.android.gms.internal.clearcut.zzbb.zzb(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0147, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0149, code lost:
        r4 = p000.q98.m50475e(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014f, code lost:
        if (r2 != r7.f34169a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0151, code lost:
        r1 = p000.q98.m50475e(r3, r4, r7);
        r4 = r7.f34169a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
        if (r4 != 0) goto L_0x013f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d4  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41965l(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, p000.t98 r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f28224s
            java.lang.Object r12 = r11.getObject(r1, r9)
            hg8 r12 = (p000.hg8) r12
            boolean r13 = r12.mo43293y()
            r14 = 1
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 << r14
        L_0x002c:
            hg8 r12 = r12.mo43292h0(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 0
            r13 = 2
            switch(r26) {
                case 18: goto L_0x035e;
                case 19: goto L_0x0320;
                case 20: goto L_0x02e8;
                case 21: goto L_0x02e8;
                case 22: goto L_0x02ce;
                case 23: goto L_0x028f;
                case 24: goto L_0x0250;
                case 25: goto L_0x01ff;
                case 26: goto L_0x0174;
                case 27: goto L_0x015a;
                case 28: goto L_0x012f;
                case 29: goto L_0x02ce;
                case 30: goto L_0x00f7;
                case 31: goto L_0x0250;
                case 32: goto L_0x028f;
                case 33: goto L_0x00b7;
                case 34: goto L_0x0077;
                case 35: goto L_0x035e;
                case 36: goto L_0x0320;
                case 37: goto L_0x02e8;
                case 38: goto L_0x02e8;
                case 39: goto L_0x02ce;
                case 40: goto L_0x028f;
                case 41: goto L_0x0250;
                case 42: goto L_0x01ff;
                case 43: goto L_0x02ce;
                case 44: goto L_0x00f7;
                case 45: goto L_0x0250;
                case 46: goto L_0x028f;
                case 47: goto L_0x00b7;
                case 48: goto L_0x0077;
                case 49: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x039c
        L_0x003c:
            r1 = 3
            if (r6 != r1) goto L_0x039c
            hm8 r1 = r15.mo41944C(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = m43520p(r21, r22, r23, r24, r25, r26)
        L_0x0057:
            java.lang.Object r8 = r7.f34171c
            r12.add(r8)
            if (r4 >= r5) goto L_0x039c
            int r8 = p000.q98.m50475e(r3, r4, r7)
            int r9 = r7.f34169a
            if (r2 != r9) goto L_0x039c
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = m43520p(r21, r22, r23, r24, r25, r26)
            goto L_0x0057
        L_0x0077:
            if (r6 != r13) goto L_0x009b
            pi8 r12 = (p000.pi8) r12
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r2 = r7.f34169a
            int r2 = r2 + r1
        L_0x0082:
            if (r1 >= r2) goto L_0x0092
            int r1 = p000.q98.m50477g(r3, r1, r7)
            long r4 = r7.f34170b
            long r4 = p000.hc8.m45122a(r4)
            r12.mo46754q(r4)
            goto L_0x0082
        L_0x0092:
            if (r1 != r2) goto L_0x0096
            goto L_0x039d
        L_0x0096:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x009b:
            if (r6 != 0) goto L_0x039c
            pi8 r12 = (p000.pi8) r12
        L_0x009f:
            int r1 = p000.q98.m50477g(r3, r4, r7)
            long r8 = r7.f34170b
            long r8 = p000.hc8.m45122a(r8)
            r12.mo46754q(r8)
            if (r1 >= r5) goto L_0x039d
            int r4 = p000.q98.m50475e(r3, r1, r7)
            int r6 = r7.f34169a
            if (r2 != r6) goto L_0x039d
            goto L_0x009f
        L_0x00b7:
            if (r6 != r13) goto L_0x00db
            sf8 r12 = (p000.sf8) r12
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r2 = r7.f34169a
            int r2 = r2 + r1
        L_0x00c2:
            if (r1 >= r2) goto L_0x00d2
            int r1 = p000.q98.m50475e(r3, r1, r7)
            int r4 = r7.f34169a
            int r4 = p000.hc8.m45124e(r4)
            r12.mo47764k(r4)
            goto L_0x00c2
        L_0x00d2:
            if (r1 != r2) goto L_0x00d6
            goto L_0x039d
        L_0x00d6:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x00db:
            if (r6 != 0) goto L_0x039c
            sf8 r12 = (p000.sf8) r12
        L_0x00df:
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r4 = r7.f34169a
            int r4 = p000.hc8.m45124e(r4)
            r12.mo47764k(r4)
            if (r1 >= r5) goto L_0x039d
            int r4 = p000.q98.m50475e(r3, r1, r7)
            int r6 = r7.f34169a
            if (r2 != r6) goto L_0x039d
            goto L_0x00df
        L_0x00f7:
            if (r6 != r13) goto L_0x00fe
            int r2 = p000.q98.m50476f(r3, r4, r12, r7)
            goto L_0x010f
        L_0x00fe:
            if (r6 != 0) goto L_0x039c
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = p000.q98.m50472b(r2, r3, r4, r5, r6, r7)
        L_0x010f:
            com.google.android.gms.internal.clearcut.e r1 = (com.google.android.gms.internal.clearcut.C4056e) r1
            jo8 r3 = r1.zzjp
            jo8 r4 = p000.jo8.m46688h()
            if (r3 != r4) goto L_0x011a
            r3 = 0
        L_0x011a:
            bg8 r4 = r15.mo41946E(r8)
            go8<?, ?> r5 = r0.f28240p
            r6 = r21
            java.lang.Object r3 = p000.nm8.m48869c(r6, r12, r4, r3, r5)
            jo8 r3 = (p000.jo8) r3
            if (r3 == 0) goto L_0x012c
            r1.zzjp = r3
        L_0x012c:
            r1 = r2
            goto L_0x039d
        L_0x012f:
            if (r6 != r13) goto L_0x039c
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r4 = r7.f34169a
            if (r4 != 0) goto L_0x013f
        L_0x0139:
            com.google.android.gms.internal.clearcut.zzbb r4 = com.google.android.gms.internal.clearcut.zzbb.zzfi
            r12.add(r4)
            goto L_0x0147
        L_0x013f:
            com.google.android.gms.internal.clearcut.zzbb r6 = com.google.android.gms.internal.clearcut.zzbb.zzb((byte[]) r3, (int) r1, (int) r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0147:
            if (r1 >= r5) goto L_0x039d
            int r4 = p000.q98.m50475e(r3, r1, r7)
            int r6 = r7.f34169a
            if (r2 != r6) goto L_0x039d
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r4 = r7.f34169a
            if (r4 != 0) goto L_0x013f
            goto L_0x0139
        L_0x015a:
            if (r6 != r13) goto L_0x039c
            hm8 r1 = r15.mo41944C(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = m43519o(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x039d
        L_0x0174:
            if (r6 != r13) goto L_0x039c
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01b3
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r4 = r7.f34169a
            if (r4 != 0) goto L_0x018d
        L_0x0189:
            r12.add(r6)
            goto L_0x0198
        L_0x018d:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p000.vf8.f34940a
            r8.<init>(r3, r1, r4, r9)
        L_0x0194:
            r12.add(r8)
            int r1 = r1 + r4
        L_0x0198:
            if (r1 >= r5) goto L_0x039d
            int r4 = p000.q98.m50475e(r3, r1, r7)
            int r8 = r7.f34169a
            if (r2 != r8) goto L_0x039d
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r4 = r7.f34169a
            if (r4 != 0) goto L_0x01ab
            goto L_0x0189
        L_0x01ab:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p000.vf8.f34940a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x0194
        L_0x01b3:
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r4 = r7.f34169a
            if (r4 != 0) goto L_0x01bf
        L_0x01bb:
            r12.add(r6)
            goto L_0x01d2
        L_0x01bf:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.clearcut.C4064h.m33897i(r3, r1, r8)
            if (r9 == 0) goto L_0x01fa
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p000.vf8.f34940a
            r9.<init>(r3, r1, r4, r10)
        L_0x01ce:
            r12.add(r9)
            r1 = r8
        L_0x01d2:
            if (r1 >= r5) goto L_0x039d
            int r4 = p000.q98.m50475e(r3, r1, r7)
            int r8 = r7.f34169a
            if (r2 != r8) goto L_0x039d
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r4 = r7.f34169a
            if (r4 != 0) goto L_0x01e5
            goto L_0x01bb
        L_0x01e5:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.clearcut.C4064h.m33897i(r3, r1, r8)
            if (r9 == 0) goto L_0x01f5
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p000.vf8.f34940a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01ce
        L_0x01f5:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbp()
            throw r1
        L_0x01fa:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbp()
            throw r1
        L_0x01ff:
            r1 = 0
            if (r6 != r13) goto L_0x0227
            w98 r12 = (p000.w98) r12
            int r2 = p000.q98.m50475e(r3, r4, r7)
            int r4 = r7.f34169a
            int r4 = r4 + r2
        L_0x020b:
            if (r2 >= r4) goto L_0x021e
            int r2 = p000.q98.m50477g(r3, r2, r7)
            long r5 = r7.f34170b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0219
            r5 = r14
            goto L_0x021a
        L_0x0219:
            r5 = r1
        L_0x021a:
            r12.mo48920j(r5)
            goto L_0x020b
        L_0x021e:
            if (r2 != r4) goto L_0x0222
            goto L_0x012c
        L_0x0222:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x0227:
            if (r6 != 0) goto L_0x039c
            w98 r12 = (p000.w98) r12
            int r4 = p000.q98.m50477g(r3, r4, r7)
            long r8 = r7.f34170b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0237
        L_0x0235:
            r6 = r14
            goto L_0x0238
        L_0x0237:
            r6 = r1
        L_0x0238:
            r12.mo48920j(r6)
            if (r4 >= r5) goto L_0x039c
            int r6 = p000.q98.m50475e(r3, r4, r7)
            int r8 = r7.f34169a
            if (r2 != r8) goto L_0x039c
            int r4 = p000.q98.m50477g(r3, r6, r7)
            long r8 = r7.f34170b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0237
            goto L_0x0235
        L_0x0250:
            if (r6 != r13) goto L_0x0270
            sf8 r12 = (p000.sf8) r12
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r2 = r7.f34169a
            int r2 = r2 + r1
        L_0x025b:
            if (r1 >= r2) goto L_0x0267
            int r4 = p000.q98.m50478h(r3, r1)
            r12.mo47764k(r4)
            int r1 = r1 + 4
            goto L_0x025b
        L_0x0267:
            if (r1 != r2) goto L_0x026b
            goto L_0x039d
        L_0x026b:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x0270:
            if (r6 != r9) goto L_0x039c
            sf8 r12 = (p000.sf8) r12
            int r1 = p000.q98.m50478h(r17, r18)
            r12.mo47764k(r1)
        L_0x027b:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x039d
            int r4 = p000.q98.m50475e(r3, r1, r7)
            int r6 = r7.f34169a
            if (r2 != r6) goto L_0x039d
            int r1 = p000.q98.m50478h(r3, r4)
            r12.mo47764k(r1)
            goto L_0x027b
        L_0x028f:
            if (r6 != r13) goto L_0x02af
            pi8 r12 = (p000.pi8) r12
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r2 = r7.f34169a
            int r2 = r2 + r1
        L_0x029a:
            if (r1 >= r2) goto L_0x02a6
            long r4 = p000.q98.m50481k(r3, r1)
            r12.mo46754q(r4)
            int r1 = r1 + 8
            goto L_0x029a
        L_0x02a6:
            if (r1 != r2) goto L_0x02aa
            goto L_0x039d
        L_0x02aa:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x02af:
            if (r6 != r14) goto L_0x039c
            pi8 r12 = (p000.pi8) r12
            long r8 = p000.q98.m50481k(r17, r18)
            r12.mo46754q(r8)
        L_0x02ba:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x039d
            int r4 = p000.q98.m50475e(r3, r1, r7)
            int r6 = r7.f34169a
            if (r2 != r6) goto L_0x039d
            long r8 = p000.q98.m50481k(r3, r4)
            r12.mo46754q(r8)
            goto L_0x02ba
        L_0x02ce:
            if (r6 != r13) goto L_0x02d6
            int r1 = p000.q98.m50476f(r3, r4, r12, r7)
            goto L_0x039d
        L_0x02d6:
            if (r6 != 0) goto L_0x039c
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = p000.q98.m50472b(r20, r21, r22, r23, r24, r25)
            goto L_0x039d
        L_0x02e8:
            if (r6 != r13) goto L_0x0308
            pi8 r12 = (p000.pi8) r12
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r2 = r7.f34169a
            int r2 = r2 + r1
        L_0x02f3:
            if (r1 >= r2) goto L_0x02ff
            int r1 = p000.q98.m50477g(r3, r1, r7)
            long r4 = r7.f34170b
            r12.mo46754q(r4)
            goto L_0x02f3
        L_0x02ff:
            if (r1 != r2) goto L_0x0303
            goto L_0x039d
        L_0x0303:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x0308:
            if (r6 != 0) goto L_0x039c
            pi8 r12 = (p000.pi8) r12
        L_0x030c:
            int r1 = p000.q98.m50477g(r3, r4, r7)
            long r8 = r7.f34170b
            r12.mo46754q(r8)
            if (r1 >= r5) goto L_0x039d
            int r4 = p000.q98.m50475e(r3, r1, r7)
            int r6 = r7.f34169a
            if (r2 != r6) goto L_0x039d
            goto L_0x030c
        L_0x0320:
            if (r6 != r13) goto L_0x033f
            kf8 r12 = (p000.kf8) r12
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r2 = r7.f34169a
            int r2 = r2 + r1
        L_0x032b:
            if (r1 >= r2) goto L_0x0337
            float r4 = p000.q98.m50484n(r3, r1)
            r12.mo44781j(r4)
            int r1 = r1 + 4
            goto L_0x032b
        L_0x0337:
            if (r1 != r2) goto L_0x033a
            goto L_0x039d
        L_0x033a:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x033f:
            if (r6 != r9) goto L_0x039c
            kf8 r12 = (p000.kf8) r12
            float r1 = p000.q98.m50484n(r17, r18)
            r12.mo44781j(r1)
        L_0x034a:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x039d
            int r4 = p000.q98.m50475e(r3, r1, r7)
            int r6 = r7.f34169a
            if (r2 != r6) goto L_0x039d
            float r1 = p000.q98.m50484n(r3, r4)
            r12.mo44781j(r1)
            goto L_0x034a
        L_0x035e:
            if (r6 != r13) goto L_0x037d
            xc8 r12 = (p000.xc8) r12
            int r1 = p000.q98.m50475e(r3, r4, r7)
            int r2 = r7.f34169a
            int r2 = r2 + r1
        L_0x0369:
            if (r1 >= r2) goto L_0x0375
            double r4 = p000.q98.m50482l(r3, r1)
            r12.mo49455j(r4)
            int r1 = r1 + 8
            goto L_0x0369
        L_0x0375:
            if (r1 != r2) goto L_0x0378
            goto L_0x039d
        L_0x0378:
            com.google.android.gms.internal.clearcut.zzco r1 = com.google.android.gms.internal.clearcut.zzco.zzbl()
            throw r1
        L_0x037d:
            if (r6 != r14) goto L_0x039c
            xc8 r12 = (p000.xc8) r12
            double r8 = p000.q98.m50482l(r17, r18)
            r12.mo49455j(r8)
        L_0x0388:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x039d
            int r4 = p000.q98.m50475e(r3, r1, r7)
            int r6 = r7.f34169a
            if (r2 != r6) goto L_0x039d
            double r8 = p000.q98.m50482l(r3, r4)
            r12.mo49455j(r8)
            goto L_0x0388
        L_0x039c:
            r1 = r4
        L_0x039d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk8.mo41965l(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, t98):int");
    }

    /* renamed from: m */
    public final <K, V> int mo41966m(T t, byte[] bArr, int i, int i2, int i3, int i4, long j, t98 t98) throws IOException {
        Unsafe unsafe = f28224s;
        Object D = mo41945D(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f28242r.mo43629f(object)) {
            Object i5 = this.f28242r.mo43632i(D);
            this.f28242r.mo43627c(i5, object);
            unsafe.putObject(t, j, i5);
            object = i5;
        }
        this.f28242r.mo43631h(D);
        this.f28242r.mo43634k(object);
        int e = q98.m50475e(bArr, i, t98);
        int i6 = t98.f34169a;
        if (i6 < 0 || i6 > i2 - e) {
            throw zzco.zzbl();
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f2, code lost:
        if (r0 == r15) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x033a, code lost:
        if (r0 == r15) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0356, code lost:
        if (r0 == r15) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0358, code lost:
        r9 = r29;
        r8 = r31;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        r5 = r4;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d5, code lost:
        r12 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0122, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0139, code lost:
        r6 = r6 | r20;
        r13 = r30;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013e, code lost:
        r1 = r9;
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018d, code lost:
        r10.putObject(r14, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c8, code lost:
        r6 = r6 | r20;
        r7 = r29;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ef, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0258, code lost:
        r6 = r6 | r20;
        r7 = r29;
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x025e, code lost:
        r1 = r9;
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0260, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0261, code lost:
        r11 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0265, code lost:
        r7 = r29;
        r8 = r31;
        r2 = r5;
        r25 = r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41967n(T r27, byte[] r28, int r29, int r30, int r31, p000.t98 r32) throws java.io.IOException {
        /*
            r26 = this;
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            sun.misc.Unsafe r10 = f28224s
            r16 = 0
            r8 = -1
            r0 = r29
            r7 = r8
            r1 = r16
            r6 = r1
        L_0x0017:
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 >= r13) goto L_0x0397
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = p000.q98.m50474d(r0, r12, r1, r9)
            int r1 = r9.f34169a
            r4 = r0
            r5 = r1
            goto L_0x002d
        L_0x002b:
            r5 = r0
            r4 = r1
        L_0x002d:
            int r3 = r5 >>> 3
            r2 = r5 & 7
            int r1 = r15.mo41949H(r3)
            if (r1 == r8) goto L_0x035e
            int[] r0 = r15.f28225a
            int r18 = r1 + 1
            r8 = r0[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r8 & r18
            int r11 = r18 >>> 20
            r29 = r5
            r5 = r8 & r17
            long r12 = (long) r5
            r5 = 17
            r18 = r8
            if (r11 > r5) goto L_0x026e
            int r5 = r1 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r8 = 1
            int r20 = r8 << r5
            r0 = r0 & r17
            r5 = -1
            if (r0 == r7) goto L_0x0068
            if (r7 == r5) goto L_0x0062
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x0062:
            long r6 = (long) r0
            int r6 = r10.getInt(r14, r6)
            r7 = r0
        L_0x0068:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0242;
                case 1: goto L_0x022c;
                case 2: goto L_0x0208;
                case 3: goto L_0x0208;
                case 4: goto L_0x01f2;
                case 5: goto L_0x01cf;
                case 6: goto L_0x01b2;
                case 7: goto L_0x0191;
                case 8: goto L_0x016e;
                case 9: goto L_0x0142;
                case 10: goto L_0x0125;
                case 11: goto L_0x01f2;
                case 12: goto L_0x00f0;
                case 13: goto L_0x01b2;
                case 14: goto L_0x01cf;
                case 15: goto L_0x00d8;
                case 16: goto L_0x00b2;
                case 17: goto L_0x0077;
                default: goto L_0x006c;
            }
        L_0x006c:
            r12 = r28
            r9 = r29
            r11 = r32
        L_0x0072:
            r5 = r4
            r29 = r7
            goto L_0x0265
        L_0x0077:
            r0 = 3
            if (r2 != r0) goto L_0x00ad
            int r0 = r3 << 3
            r8 = r0 | 4
            hm8 r0 = r15.mo41944C(r1)
            r1 = r28
            r2 = r4
            r3 = r30
            r4 = r8
            r9 = r29
            r8 = r5
            r5 = r32
            int r0 = m43520p(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r20
            r11 = r32
            if (r1 != 0) goto L_0x009a
            java.lang.Object r1 = r11.f34171c
            goto L_0x00a4
        L_0x009a:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r11.f34171c
            java.lang.Object r1 = p000.vf8.m53378d(r1, r2)
        L_0x00a4:
            r10.putObject(r14, r12, r1)
            r6 = r6 | r20
            r12 = r28
            goto L_0x0122
        L_0x00ad:
            r9 = r29
            r11 = r32
            goto L_0x00d5
        L_0x00b2:
            r9 = r29
            r11 = r32
            r8 = r5
            if (r2 != 0) goto L_0x00d5
            r2 = r12
            r12 = r28
            int r13 = p000.q98.m50477g(r12, r4, r11)
            long r0 = r11.f34170b
            long r4 = p000.hc8.m45122a(r0)
            r0 = r10
            r1 = r27
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            r1 = r9
            r9 = r11
            r0 = r13
            r13 = r30
            goto L_0x0261
        L_0x00d5:
            r12 = r28
            goto L_0x0072
        L_0x00d8:
            r9 = r29
            r11 = r32
            r8 = r5
            r0 = r12
            r12 = r28
            if (r2 != 0) goto L_0x0072
            int r2 = p000.q98.m50475e(r12, r4, r11)
            int r3 = r11.f34169a
            int r3 = p000.hc8.m45124e(r3)
            r10.putInt(r14, r0, r3)
            goto L_0x0139
        L_0x00f0:
            r9 = r29
            r11 = r32
            r8 = r5
            r21 = r12
            r12 = r28
            if (r2 != 0) goto L_0x0072
            int r0 = p000.q98.m50475e(r12, r4, r11)
            int r2 = r11.f34169a
            bg8 r1 = r15.mo41946E(r1)
            if (r1 == 0) goto L_0x011b
            yf8 r1 = r1.mo29577h(r2)
            if (r1 == 0) goto L_0x010e
            goto L_0x011b
        L_0x010e:
            jo8 r1 = m43517T(r27)
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.mo44548e(r9, r2)
            goto L_0x0122
        L_0x011b:
            r3 = r21
            r10.putInt(r14, r3, r2)
            r6 = r6 | r20
        L_0x0122:
            r13 = r30
            goto L_0x013e
        L_0x0125:
            r9 = r29
            r11 = r32
            r8 = r5
            r0 = r12
            r3 = 2
            r12 = r28
            if (r2 != r3) goto L_0x0072
            int r2 = p000.q98.m50483m(r12, r4, r11)
            java.lang.Object r3 = r11.f34171c
            r10.putObject(r14, r0, r3)
        L_0x0139:
            r6 = r6 | r20
            r13 = r30
            r0 = r2
        L_0x013e:
            r1 = r9
            r9 = r11
            goto L_0x0261
        L_0x0142:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r3 = 2
            r12 = r28
            if (r2 != r3) goto L_0x016a
            hm8 r0 = r15.mo41944C(r1)
            r5 = r30
            int r0 = m43521q(r0, r12, r4, r5, r11)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x015f
            java.lang.Object r1 = r11.f34171c
            goto L_0x018d
        L_0x015f:
            java.lang.Object r1 = r10.getObject(r14, r7)
            java.lang.Object r2 = r11.f34171c
            java.lang.Object r1 = p000.vf8.m53378d(r1, r2)
            goto L_0x018d
        L_0x016a:
            r5 = r30
            goto L_0x01ef
        L_0x016e:
            r9 = r29
            r5 = r30
            r11 = r32
            r29 = r7
            r7 = r12
            r0 = 2
            r12 = r28
            if (r2 != r0) goto L_0x01ef
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r18 & r0
            if (r0 != 0) goto L_0x0187
            int r0 = p000.q98.m50479i(r12, r4, r11)
            goto L_0x018b
        L_0x0187:
            int r0 = p000.q98.m50480j(r12, r4, r11)
        L_0x018b:
            java.lang.Object r1 = r11.f34171c
        L_0x018d:
            r10.putObject(r14, r7, r1)
            goto L_0x01c8
        L_0x0191:
            r9 = r29
            r5 = r30
            r11 = r32
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != 0) goto L_0x01ef
            int r0 = p000.q98.m50477g(r12, r4, r11)
            long r1 = r11.f34170b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x01ac
            r1 = 1
            goto L_0x01ae
        L_0x01ac:
            r1 = r16
        L_0x01ae:
            p000.qp8.m50758j(r14, r7, r1)
            goto L_0x01c8
        L_0x01b2:
            r9 = r29
            r5 = r30
            r11 = r32
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != r0) goto L_0x01ef
            int r0 = p000.q98.m50478h(r12, r4)
            r10.putInt(r14, r7, r0)
            int r0 = r4 + 4
        L_0x01c8:
            r6 = r6 | r20
            r7 = r29
            r13 = r5
            goto L_0x025e
        L_0x01cf:
            r9 = r29
            r5 = r30
            r11 = r32
            r29 = r7
            r7 = r12
            r0 = 1
            r12 = r28
            if (r2 != r0) goto L_0x01ef
            long r17 = p000.q98.m50481k(r12, r4)
            r0 = r10
            r1 = r27
            r2 = r7
            r7 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x0258
        L_0x01ef:
            r5 = r4
            goto L_0x0265
        L_0x01f2:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != 0) goto L_0x0265
            int r0 = p000.q98.m50475e(r12, r5, r11)
            int r1 = r11.f34169a
            r10.putInt(r14, r7, r1)
            goto L_0x0258
        L_0x0208:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != 0) goto L_0x0265
            int r17 = p000.q98.m50477g(r12, r5, r11)
            long r4 = r11.f34170b
            r0 = r10
            r1 = r27
            r2 = r7
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            r7 = r29
            r13 = r30
            r1 = r9
            r9 = r11
            r0 = r17
            goto L_0x0260
        L_0x022c:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != r0) goto L_0x0265
            float r0 = p000.q98.m50484n(r12, r5)
            p000.qp8.m50754f(r14, r7, r0)
            int r0 = r5 + 4
            goto L_0x0258
        L_0x0242:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r0 = 1
            r12 = r28
            if (r2 != r0) goto L_0x0265
            double r0 = p000.q98.m50482l(r12, r5)
            p000.qp8.m50753e(r14, r7, r0)
            int r0 = r5 + 8
        L_0x0258:
            r6 = r6 | r20
            r7 = r29
            r13 = r30
        L_0x025e:
            r1 = r9
            r9 = r11
        L_0x0260:
            r8 = -1
        L_0x0261:
            r11 = r31
            goto L_0x0017
        L_0x0265:
            r7 = r29
            r8 = r31
            r2 = r5
            r25 = r10
            goto L_0x0370
        L_0x026e:
            r9 = r29
            r5 = r4
            r19 = r7
            r7 = r12
            r12 = r28
            r0 = 27
            if (r11 != r0) goto L_0x02c0
            r0 = 2
            if (r2 != r0) goto L_0x02b9
            java.lang.Object r0 = r10.getObject(r14, r7)
            hg8 r0 = (p000.hg8) r0
            boolean r2 = r0.mo43293y()
            if (r2 != 0) goto L_0x029b
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0292
            r2 = 10
            goto L_0x0294
        L_0x0292:
            int r2 = r2 << 1
        L_0x0294:
            hg8 r0 = r0.mo43292h0(r2)
            r10.putObject(r14, r7, r0)
        L_0x029b:
            r7 = r0
            hm8 r0 = r15.mo41944C(r1)
            r1 = r9
            r2 = r28
            r3 = r5
            r4 = r30
            r5 = r7
            r20 = r6
            r6 = r32
            int r0 = m43519o(r0, r1, r2, r3, r4, r5, r6)
            r13 = r30
            r11 = r31
            r7 = r19
            r6 = r20
            goto L_0x0392
        L_0x02b9:
            r20 = r6
            r15 = r5
            r29 = r9
            goto L_0x0365
        L_0x02c0:
            r20 = r6
            r0 = 49
            if (r11 > r0) goto L_0x030d
            r6 = r18
            long r13 = (long) r6
            r0 = r26
            r18 = r1
            r1 = r27
            r6 = r2
            r2 = r28
            r21 = r3
            r3 = r5
            r4 = r30
            r15 = r5
            r5 = r9
            r22 = r6
            r6 = r21
            r23 = r7
            r7 = r22
            r8 = r18
            r29 = r9
            r25 = r10
            r9 = r13
            r14 = r31
            r12 = r23
            r14 = r32
            int r0 = r0.mo41965l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02f6
            goto L_0x0358
        L_0x02f6:
            r15 = r26
            r14 = r27
            r12 = r28
            r1 = r29
            r13 = r30
            r11 = r31
            r9 = r32
            r7 = r19
            r6 = r20
            r10 = r25
            r8 = -1
            goto L_0x0017
        L_0x030d:
            r22 = r2
            r21 = r3
            r15 = r5
            r23 = r7
            r29 = r9
            r25 = r10
            r6 = r18
            r18 = r1
            r0 = 50
            r7 = r22
            if (r11 != r0) goto L_0x033d
            r0 = 2
            if (r7 != r0) goto L_0x0367
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r18
            r6 = r21
            r7 = r23
            r9 = r32
            int r0 = r0.mo41966m(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 != r15) goto L_0x02f6
            goto L_0x0358
        L_0x033d:
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r29
            r8 = r6
            r6 = r21
            r9 = r11
            r10 = r23
            r12 = r18
            r13 = r32
            int r0 = r0.mo41964k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02f6
        L_0x0358:
            r9 = r29
            r8 = r31
            r2 = r0
            goto L_0x036c
        L_0x035e:
            r15 = r4
            r29 = r5
            r20 = r6
            r19 = r7
        L_0x0365:
            r25 = r10
        L_0x0367:
            r9 = r29
            r8 = r31
            r2 = r15
        L_0x036c:
            r7 = r19
            r6 = r20
        L_0x0370:
            if (r9 != r8) goto L_0x0379
            if (r8 != 0) goto L_0x0375
            goto L_0x0379
        L_0x0375:
            r0 = r7
            r1 = -1
            r7 = r2
            goto L_0x03a3
        L_0x0379:
            r0 = r9
            r1 = r28
            r3 = r30
            r4 = r27
            r5 = r32
            int r0 = m43518j(r0, r1, r2, r3, r4, r5)
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r8
            r1 = r9
            r10 = r25
        L_0x0392:
            r8 = -1
            r9 = r32
            goto L_0x0017
        L_0x0397:
            r20 = r6
            r19 = r7
            r25 = r10
            r8 = r11
            r7 = r0
            r9 = r1
            r0 = r19
            r1 = -1
        L_0x03a3:
            if (r0 == r1) goto L_0x03ae
            long r0 = (long) r0
            r10 = r27
            r2 = r25
            r2.putInt(r10, r0, r6)
            goto L_0x03b0
        L_0x03ae:
            r10 = r27
        L_0x03b0:
            r11 = r26
            int[] r12 = r11.f28236l
            if (r12 == 0) goto L_0x03f2
            r0 = 0
            int r13 = r12.length
            r5 = r0
            r14 = r16
        L_0x03bb:
            if (r14 >= r13) goto L_0x03eb
            r1 = r12[r14]
            go8<?, ?> r6 = r11.f28240p
            int[] r0 = r11.f28225a
            r2 = r0[r1]
            int r0 = r11.mo41947F(r1)
            r0 = r0 & r17
            long r3 = (long) r0
            java.lang.Object r0 = p000.qp8.m50740M(r10, r3)
            if (r0 != 0) goto L_0x03d3
            goto L_0x03e6
        L_0x03d3:
            bg8 r4 = r11.mo41946E(r1)
            if (r4 != 0) goto L_0x03da
            goto L_0x03e6
        L_0x03da:
            ij8 r3 = r11.f28242r
            java.util.Map r3 = r3.mo43634k(r0)
            r0 = r26
            java.lang.Object r5 = r0.mo41968s(r1, r2, r3, r4, r5, r6)
        L_0x03e6:
            jo8 r5 = (p000.jo8) r5
            int r14 = r14 + 1
            goto L_0x03bb
        L_0x03eb:
            if (r5 == 0) goto L_0x03f2
            go8<?, ?> r0 = r11.f28240p
            r0.mo42943h(r10, r5)
        L_0x03f2:
            r0 = r30
            if (r8 != 0) goto L_0x03fe
            if (r7 != r0) goto L_0x03f9
            goto L_0x0402
        L_0x03f9:
            com.google.android.gms.internal.clearcut.zzco r0 = com.google.android.gms.internal.clearcut.zzco.zzbo()
            throw r0
        L_0x03fe:
            if (r7 > r0) goto L_0x0403
            if (r9 != r8) goto L_0x0403
        L_0x0402:
            return r7
        L_0x0403:
            com.google.android.gms.internal.clearcut.zzco r0 = com.google.android.gms.internal.clearcut.zzco.zzbo()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dk8.mo41967n(java.lang.Object, byte[], int, int, int, t98):int");
    }

    /* renamed from: s */
    public final <K, V, UT, UB> UB mo41968s(int i, int i2, Map<K, V> map, bg8<?> bg8, UB ub, go8<UT, UB> go8) {
        this.f28242r.mo43631h(mo41945D(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (bg8.mo29577h(((Integer) next.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = go8.mo42941f();
                }
                C4053b zzk = zzbb.zzk(bj8.m32591a((dj8) null, next.getKey(), next.getValue()));
                try {
                    bj8.m32592b(zzk.mo30758b(), (dj8) null, next.getKey(), next.getValue());
                    go8.mo42937b(ub, i2, zzk.mo30757a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: v */
    public final void mo41969v(T t, T t2, int i) {
        long F = (long) (mo41947F(i) & 1048575);
        if (mo41971y(t2, i)) {
            Object M = qp8.m50740M(t, F);
            Object M2 = qp8.m50740M(t2, F);
            if (M != null && M2 != null) {
                qp8.m50757i(t, F, vf8.m53378d(M, M2));
                mo41950I(t, i);
            } else if (M2 != null) {
                qp8.m50757i(t, F, M2);
                mo41950I(t, i);
            }
        }
    }

    /* renamed from: x */
    public final <K, V> void mo41970x(dr8 dr8, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f28242r.mo43631h(mo41945D(i2));
            dr8.mo42005K(i, (dj8) null, this.f28242r.mo43633j(obj));
        }
    }

    /* renamed from: y */
    public final boolean mo41971y(T t, int i) {
        if (this.f28233i) {
            int F = mo41947F(i);
            long j = (long) (F & 1048575);
            switch ((F & 267386880) >>> 20) {
                case 0:
                    return qp8.m50739L(t, j) != Utils.DOUBLE_EPSILON;
                case 1:
                    return qp8.m50738K(t, j) != Utils.FLOAT_EPSILON;
                case 2:
                    return qp8.m50736I(t, j) != 0;
                case 3:
                    return qp8.m50736I(t, j) != 0;
                case 4:
                    return qp8.m50735H(t, j) != 0;
                case 5:
                    return qp8.m50736I(t, j) != 0;
                case 6:
                    return qp8.m50735H(t, j) != 0;
                case 7:
                    return qp8.m50737J(t, j);
                case 8:
                    Object M = qp8.m50740M(t, j);
                    if (M instanceof String) {
                        return !((String) M).isEmpty();
                    }
                    if (M instanceof zzbb) {
                        return !zzbb.zzfi.equals(M);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return qp8.m50740M(t, j) != null;
                case 10:
                    return !zzbb.zzfi.equals(qp8.m50740M(t, j));
                case 11:
                    return qp8.m50735H(t, j) != 0;
                case 12:
                    return qp8.m50735H(t, j) != 0;
                case 13:
                    return qp8.m50735H(t, j) != 0;
                case 14:
                    return qp8.m50736I(t, j) != 0;
                case 15:
                    return qp8.m50735H(t, j) != 0;
                case 16:
                    return qp8.m50736I(t, j) != 0;
                case 17:
                    return qp8.m50740M(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int G = mo41948G(i);
            return (qp8.m50735H(t, (long) (G & 1048575)) & (1 << (G >>> 20))) != 0;
        }
    }

    /* renamed from: z */
    public final boolean mo41972z(T t, int i, int i2) {
        return qp8.m50735H(t, (long) (mo41948G(i2) & 1048575)) == i;
    }
}
