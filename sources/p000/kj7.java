package p000;

import android.util.Pair;
import androidx.media3.common.C0792h;
import androidx.media3.common.ParserException;
import java.io.IOException;
import okhttp3.internal.http.StatusLine;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.zs6;

/* renamed from: kj7 */
/* compiled from: WavExtractor */
public final class kj7 implements hy1 {

    /* renamed from: h */
    public static final ny1 f14104h = new jj7();

    /* renamed from: a */
    public jy1 f14105a;

    /* renamed from: b */
    public zs6 f14106b;

    /* renamed from: c */
    public int f14107c = 0;

    /* renamed from: d */
    public long f14108d = -1;

    /* renamed from: e */
    public C2685b f14109e;

    /* renamed from: f */
    public int f14110f = -1;

    /* renamed from: g */
    public long f14111g = -1;

    /* renamed from: kj7$a */
    /* compiled from: WavExtractor */
    public static final class C2684a implements C2685b {

        /* renamed from: m */
        public static final int[] f14112m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        public static final int[] f14113n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        public final jy1 f14114a;

        /* renamed from: b */
        public final zs6 f14115b;

        /* renamed from: c */
        public final lj7 f14116c;

        /* renamed from: d */
        public final int f14117d;

        /* renamed from: e */
        public final byte[] f14118e;

        /* renamed from: f */
        public final gm4 f14119f;

        /* renamed from: g */
        public final int f14120g;

        /* renamed from: h */
        public final C0792h f14121h;

        /* renamed from: i */
        public int f14122i;

        /* renamed from: j */
        public long f14123j;

        /* renamed from: k */
        public int f14124k;

        /* renamed from: l */
        public long f14125l;

        public C2684a(jy1 jy1, zs6 zs6, lj7 lj7) throws ParserException {
            this.f14114a = jy1;
            this.f14115b = zs6;
            this.f14116c = lj7;
            int max = Math.max(1, lj7.f14532c / 10);
            this.f14120g = max;
            gm4 gm4 = new gm4(lj7.f14536g);
            gm4.mo20697v();
            int v = gm4.mo20697v();
            this.f14117d = v;
            int i = lj7.f14531b;
            int i2 = (((lj7.f14534e - (i * 4)) * 8) / (lj7.f14535f * i)) + 1;
            if (v == i2) {
                int l = w67.m29364l(max, v);
                this.f14118e = new byte[(lj7.f14534e * l)];
                this.f14119f = new gm4(l * m20770h(v, i));
                int i3 = ((lj7.f14532c * lj7.f14534e) * 8) / v;
                this.f14121h = new C0792h.C0794b().mo6670e0("audio/raw").mo6646G(i3).mo6665Z(i3).mo6662W(m20770h(max, i)).mo6647H(lj7.f14531b).mo6671f0(lj7.f14532c).mo6664Y(2).mo6644E();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected frames per block: " + i2 + "; got: " + v, (Throwable) null);
        }

        /* renamed from: h */
        public static int m20770h(int i, int i2) {
            return i * 2 * i2;
        }

        /* renamed from: a */
        public void mo22329a(int i, long j) {
            this.f14114a.mo7715g(new nj7(this.f14116c, this.f14117d, (long) i, j));
            this.f14115b.mo7303d(this.f14121h);
        }

        /* renamed from: b */
        public void mo22330b(long j) {
            this.f14122i = 0;
            this.f14123j = j;
            this.f14124k = 0;
            this.f14125l = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x003e A[EDGE_INSN: B:22:0x003e->B:10:0x003e ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0020  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo22331c(p000.iy1 r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f14120g
                int r1 = r6.f14124k
                int r1 = r6.mo22334f(r1)
                int r0 = r0 - r1
                int r1 = r6.f14117d
                int r0 = p000.w67.m29364l(r0, r1)
                lj7 r1 = r6.f14116c
                int r1 = r1.f14534e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L_0x001d
            L_0x001b:
                r1 = r2
                goto L_0x001e
            L_0x001d:
                r1 = 0
            L_0x001e:
                if (r1 != 0) goto L_0x003e
                int r3 = r6.f14122i
                if (r3 >= r0) goto L_0x003e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f14118e
                int r5 = r6.f14122i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L_0x0038
                goto L_0x001b
            L_0x0038:
                int r4 = r6.f14122i
                int r4 = r4 + r3
                r6.f14122i = r4
                goto L_0x001e
            L_0x003e:
                int r7 = r6.f14122i
                lj7 r8 = r6.f14116c
                int r8 = r8.f14534e
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0075
                byte[] r8 = r6.f14118e
                gm4 r9 = r6.f14119f
                r6.mo22332d(r8, r7, r9)
                int r8 = r6.f14122i
                lj7 r9 = r6.f14116c
                int r9 = r9.f14534e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f14122i = r8
                gm4 r7 = r6.f14119f
                int r7 = r7.mo20681f()
                zs6 r8 = r6.f14115b
                gm4 r9 = r6.f14119f
                r8.mo7300a(r9, r7)
                int r8 = r6.f14124k
                int r8 = r8 + r7
                r6.f14124k = r8
                int r7 = r6.mo22334f(r8)
                int r8 = r6.f14120g
                if (r7 < r8) goto L_0x0075
                r6.mo22336i(r8)
            L_0x0075:
                if (r1 == 0) goto L_0x0082
                int r7 = r6.f14124k
                int r7 = r6.mo22334f(r7)
                if (r7 <= 0) goto L_0x0082
                r6.mo22336i(r7)
            L_0x0082:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.kj7.C2684a.mo22331c(iy1, long):boolean");
        }

        /* renamed from: d */
        public final void mo22332d(byte[] bArr, int i, gm4 gm4) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.f14116c.f14531b; i3++) {
                    mo22333e(bArr, i2, i3, gm4.mo20679d());
                }
            }
            int g = mo22335g(this.f14117d * i);
            gm4.mo20674P(0);
            gm4.mo20673O(g);
        }

        /* renamed from: e */
        public final void mo22333e(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3;
            lj7 lj7 = this.f14116c;
            int i4 = lj7.f14534e;
            int i5 = lj7.f14531b;
            int i6 = (i * i4) + (i2 * 4);
            int i7 = (i5 * 4) + i6;
            int i8 = (i4 / i5) - 4;
            int i9 = (short) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255));
            int min = Math.min(bArr[i6 + 2] & 255, 88);
            int i10 = f14113n[min];
            int i11 = ((i * this.f14117d * i5) + i2) * 2;
            bArr2[i11] = (byte) (i9 & 255);
            bArr2[i11 + 1] = (byte) (i9 >> 8);
            for (int i12 = 0; i12 < i8 * 2; i12++) {
                byte b = bArr[((i12 / 8) * i5 * 4) + i7 + ((i12 / 2) % 4)] & 255;
                if (i12 % 2 == 0) {
                    i3 = b & 15;
                } else {
                    i3 = b >> 4;
                }
                int i13 = ((((i3 & 7) * 2) + 1) * i10) >> 3;
                if ((i3 & 8) != 0) {
                    i13 = -i13;
                }
                i9 = w67.m29374q(i9 + i13, -32768, 32767);
                i11 += i5 * 2;
                bArr2[i11] = (byte) (i9 & 255);
                bArr2[i11 + 1] = (byte) (i9 >> 8);
                int i14 = min + f14112m[i3];
                int[] iArr = f14113n;
                min = w67.m29374q(i14, 0, iArr.length - 1);
                i10 = iArr[min];
            }
        }

        /* renamed from: f */
        public final int mo22334f(int i) {
            return i / (this.f14116c.f14531b * 2);
        }

        /* renamed from: g */
        public final int mo22335g(int i) {
            return m20770h(i, this.f14116c.f14531b);
        }

        /* renamed from: i */
        public final void mo22336i(int i) {
            long J0 = this.f14123j + w67.m29313J0(this.f14125l, 1000000, (long) this.f14116c.f14532c);
            int g = mo22335g(i);
            this.f14115b.mo7301b(J0, 1, g, this.f14124k - g, (zs6.C3758a) null);
            this.f14125l += (long) i;
            this.f14124k -= g;
        }
    }

    /* renamed from: kj7$b */
    /* compiled from: WavExtractor */
    public interface C2685b {
        /* renamed from: a */
        void mo22329a(int i, long j) throws ParserException;

        /* renamed from: b */
        void mo22330b(long j);

        /* renamed from: c */
        boolean mo22331c(iy1 iy1, long j) throws IOException;
    }

    /* renamed from: kj7$c */
    /* compiled from: WavExtractor */
    public static final class C2686c implements C2685b {

        /* renamed from: a */
        public final jy1 f14126a;

        /* renamed from: b */
        public final zs6 f14127b;

        /* renamed from: c */
        public final lj7 f14128c;

        /* renamed from: d */
        public final C0792h f14129d;

        /* renamed from: e */
        public final int f14130e;

        /* renamed from: f */
        public long f14131f;

        /* renamed from: g */
        public int f14132g;

        /* renamed from: h */
        public long f14133h;

        public C2686c(jy1 jy1, zs6 zs6, lj7 lj7, String str, int i) throws ParserException {
            this.f14126a = jy1;
            this.f14127b = zs6;
            this.f14128c = lj7;
            int i2 = (lj7.f14531b * lj7.f14535f) / 8;
            if (lj7.f14534e == i2) {
                int i3 = lj7.f14532c;
                int i4 = i3 * i2 * 8;
                int max = Math.max(i2, (i3 * i2) / 10);
                this.f14130e = max;
                this.f14129d = new C0792h.C0794b().mo6670e0(str).mo6646G(i4).mo6665Z(i4).mo6662W(max).mo6647H(lj7.f14531b).mo6671f0(lj7.f14532c).mo6664Y(i).mo6644E();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected block size: " + i2 + "; got: " + lj7.f14534e, (Throwable) null);
        }

        /* renamed from: a */
        public void mo22329a(int i, long j) {
            this.f14126a.mo7715g(new nj7(this.f14128c, 1, (long) i, j));
            this.f14127b.mo7303d(this.f14129d);
        }

        /* renamed from: b */
        public void mo22330b(long j) {
            this.f14131f = j;
            this.f14132g = 0;
            this.f14133h = 0;
        }

        /* renamed from: c */
        public boolean mo22331c(iy1 iy1, long j) throws IOException {
            int i;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i <= 0 || (i2 = this.f14132g) >= (i3 = this.f14130e)) {
                    lj7 lj7 = this.f14128c;
                    int i4 = lj7.f14534e;
                    int i5 = this.f14132g / i4;
                } else {
                    int e = this.f14127b.mo7304e(iy1, (int) Math.min((long) (i3 - i2), j2), true);
                    if (e == -1) {
                        j2 = 0;
                    } else {
                        this.f14132g += e;
                        j2 -= (long) e;
                    }
                }
            }
            lj7 lj72 = this.f14128c;
            int i42 = lj72.f14534e;
            int i52 = this.f14132g / i42;
            if (i52 > 0) {
                int i6 = i52 * i42;
                int i7 = this.f14132g - i6;
                this.f14127b.mo7301b(this.f14131f + w67.m29313J0(this.f14133h, 1000000, (long) lj72.f14532c), 1, i6, i7, (zs6.C3758a) null);
                this.f14133h += (long) i52;
                this.f14132g = i7;
            }
            if (i <= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ hy1[] m20758g() {
        return new hy1[]{new kj7()};
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        int i;
        if (j == 0) {
            i = 0;
        } else {
            i = 4;
        }
        this.f14107c = i;
        C2685b bVar = this.f14109e;
        if (bVar != null) {
            bVar.mo22330b(j2);
        }
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        mo22323f();
        int i = this.f14107c;
        if (i == 0) {
            mo22324h(iy1);
            return 0;
        } else if (i == 1) {
            mo22326k(iy1);
            return 0;
        } else if (i == 2) {
            mo22325i(iy1);
            return 0;
        } else if (i == 3) {
            mo22328m(iy1);
            return 0;
        } else if (i == 4) {
            return mo22327l(iy1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        return mj7.m22327a(iy1);
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* renamed from: f */
    public final void mo22323f() {
        C2725kr.m20989i(this.f14106b);
        w67.m29360j(this.f14105a);
    }

    /* renamed from: h */
    public final void mo22324h(iy1 iy1) throws IOException {
        boolean z;
        if (iy1.getPosition() == 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        int i = this.f14110f;
        if (i != -1) {
            iy1.mo92k(i);
            this.f14107c = 4;
        } else if (mj7.m22327a(iy1)) {
            iy1.mo92k((int) (iy1.mo89h() - iy1.getPosition()));
            this.f14107c = 1;
        } else {
            throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", (Throwable) null);
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    /* renamed from: i */
    public final void mo22325i(iy1 iy1) throws IOException {
        lj7 b = mj7.m22328b(iy1);
        int i = b.f14530a;
        if (i == 17) {
            this.f14109e = new C2684a(this.f14105a, this.f14106b, b);
        } else if (i == 6) {
            this.f14109e = new C2686c(this.f14105a, this.f14106b, b, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.f14109e = new C2686c(this.f14105a, this.f14106b, b, "audio/g711-mlaw", -1);
        } else {
            int a = oj7.m23842a(i, b.f14535f);
            if (a != 0) {
                this.f14109e = new C2686c(this.f14105a, this.f14106b, b, "audio/raw", a);
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + b.f14530a);
            }
        }
        this.f14107c = 3;
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f14105a = jy1;
        this.f14106b = jy1.mo7713f(0, 1);
        jy1.mo7722p();
    }

    /* renamed from: k */
    public final void mo22326k(iy1 iy1) throws IOException {
        this.f14108d = mj7.m22329c(iy1);
        this.f14107c = 2;
    }

    /* renamed from: l */
    public final int mo22327l(iy1 iy1) throws IOException {
        boolean z;
        if (this.f14111g != -1) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        if (((C2685b) C2725kr.m20985e(this.f14109e)).mo22331c(iy1, this.f14111g - iy1.getPosition())) {
            return -1;
        }
        return 0;
    }

    /* renamed from: m */
    public final void mo22328m(iy1 iy1) throws IOException {
        Pair<Long, Long> e = mj7.m22331e(iy1);
        this.f14110f = ((Long) e.first).intValue();
        long longValue = ((Long) e.second).longValue();
        long j = this.f14108d;
        if (j != -1 && longValue == 4294967295L) {
            longValue = j;
        }
        this.f14111g = ((long) this.f14110f) + longValue;
        long length = iy1.getLength();
        if (length != -1 && this.f14111g > length) {
            gk3.m18132i("WavExtractor", "Data exceeds input length: " + this.f14111g + ", " + length);
            this.f14111g = length;
        }
        ((C2685b) C2725kr.m20985e(this.f14109e)).mo22329a(this.f14110f, this.f14111g);
        this.f14107c = 4;
    }
}
