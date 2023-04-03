package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public abstract class zzii extends bx8 {

    /* renamed from: b */
    public static final Logger f22983b = Logger.getLogger(zzii.class.getName());

    /* renamed from: c */
    public static final boolean f22984c = l99.m47695m();

    /* renamed from: a */
    public lz8 f22985a;

    /* renamed from: com.google.android.gms.internal.vision.zzii$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static class C4149a extends zzii {

        /* renamed from: d */
        public final byte[] f22986d;

        /* renamed from: e */
        public final int f22987e;

        /* renamed from: f */
        public final int f22988f;

        /* renamed from: g */
        public int f22989g;

        public C4149a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i2 | 0 | (bArr.length - i2)) >= 0) {
                this.f22986d = bArr;
                this.f22987e = 0;
                this.f22989g = 0;
                this.f22988f = i2;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
        }

        /* renamed from: F0 */
        public final void mo31305F0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f22986d, this.f22989g, i2);
                this.f22989g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22989g), Integer.valueOf(this.f22988f), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: O */
        public final void mo31273O(int i) throws IOException {
            if (!zzii.f22984c || hw8.m45399b() || mo31282b() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f22986d;
                    int i2 = this.f22989g;
                    this.f22989g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f22986d;
                    int i3 = this.f22989g;
                    this.f22989g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22989g), Integer.valueOf(this.f22988f), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f22986d;
                int i4 = this.f22989g;
                this.f22989g = i4 + 1;
                l99.m47694l(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f22986d;
                int i5 = this.f22989g;
                this.f22989g = i5 + 1;
                l99.m47694l(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f22986d;
                    int i7 = this.f22989g;
                    this.f22989g = i7 + 1;
                    l99.m47694l(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f22986d;
                int i8 = this.f22989g;
                this.f22989g = i8 + 1;
                l99.m47694l(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f22986d;
                    int i10 = this.f22989g;
                    this.f22989g = i10 + 1;
                    l99.m47694l(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f22986d;
                int i11 = this.f22989g;
                this.f22989g = i11 + 1;
                l99.m47694l(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f22986d;
                    int i13 = this.f22989g;
                    this.f22989g = i13 + 1;
                    l99.m47694l(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f22986d;
                int i14 = this.f22989g;
                this.f22989g = i14 + 1;
                l99.m47694l(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f22986d;
                int i15 = this.f22989g;
                this.f22989g = i15 + 1;
                l99.m47694l(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: P */
        public final void mo31274P(int i, int i2) throws IOException {
            mo31292m(i, 0);
            mo31288j(i2);
        }

        /* renamed from: R */
        public final void mo31276R(int i, zzht zzht) throws IOException {
            mo31292m(1, 3);
            mo31279X(2, i);
            mo31294o(3, zzht);
            mo31292m(1, 4);
        }

        /* renamed from: X */
        public final void mo31279X(int i, int i2) throws IOException {
            mo31292m(i, 0);
            mo31273O(i2);
        }

        /* renamed from: Y */
        public final void mo31280Y(int i, long j) throws IOException {
            mo31292m(i, 1);
            mo31281Z(j);
        }

        /* renamed from: Z */
        public final void mo31281Z(long j) throws IOException {
            try {
                byte[] bArr = this.f22986d;
                int i = this.f22989g;
                int i2 = i + 1;
                bArr[i] = (byte) ((int) j);
                int i3 = i2 + 1;
                bArr[i2] = (byte) ((int) (j >> 8));
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((int) (j >> 16));
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((int) (j >> 24));
                int i6 = i5 + 1;
                bArr[i5] = (byte) ((int) (j >> 32));
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((int) (j >> 40));
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((int) (j >> 48));
                this.f22989g = i8 + 1;
                bArr[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22989g), Integer.valueOf(this.f22988f), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo29800a(byte[] bArr, int i, int i2) throws IOException {
            mo31305F0(bArr, i, i2);
        }

        /* renamed from: b */
        public final int mo31282b() {
            return this.f22988f - this.f22989g;
        }

        /* renamed from: e0 */
        public final void mo31283e0(int i) throws IOException {
            try {
                byte[] bArr = this.f22986d;
                int i2 = this.f22989g;
                int i3 = i2 + 1;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (i >> 16);
                this.f22989g = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22989g), Integer.valueOf(this.f22988f), 1}), e);
            }
        }

        /* renamed from: g */
        public final void mo31285g(byte b) throws IOException {
            try {
                byte[] bArr = this.f22986d;
                int i = this.f22989g;
                this.f22989g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22989g), Integer.valueOf(this.f22988f), 1}), e);
            }
        }

        /* renamed from: j */
        public final void mo31288j(int i) throws IOException {
            if (i >= 0) {
                mo31273O(i);
            } else {
                mo31299t((long) i);
            }
        }

        /* renamed from: j0 */
        public final void mo31289j0(int i, int i2) throws IOException {
            mo31292m(i, 5);
            mo31283e0(i2);
        }

        /* renamed from: m */
        public final void mo31292m(int i, int i2) throws IOException {
            mo31273O((i << 3) | i2);
        }

        /* renamed from: n */
        public final void mo31293n(int i, long j) throws IOException {
            mo31292m(i, 0);
            mo31299t(j);
        }

        /* renamed from: o */
        public final void mo31294o(int i, zzht zzht) throws IOException {
            mo31292m(i, 2);
            mo31300u(zzht);
        }

        /* renamed from: p */
        public final void mo31295p(int i, String str) throws IOException {
            mo31292m(i, 2);
            mo31301v(str);
        }

        /* renamed from: q */
        public final void mo31296q(int i, k59 k59) throws IOException {
            mo31292m(1, 3);
            mo31279X(2, i);
            mo31292m(3, 2);
            mo31303x(k59);
            mo31292m(1, 4);
        }

        /* renamed from: r */
        public final void mo31297r(int i, k59 k59, g79 g79) throws IOException {
            mo31292m(i, 2);
            C4143y yVar = (C4143y) k59;
            int k = yVar.mo31176k();
            if (k == -1) {
                k = g79.mo31210f(yVar);
                yVar.mo31172f(k);
            }
            mo31273O(k);
            g79.mo31212h(k59, this.f22985a);
        }

        /* renamed from: s */
        public final void mo31298s(int i, boolean z) throws IOException {
            mo31292m(i, 0);
            mo31285g(z ? (byte) 1 : 0);
        }

        /* renamed from: t */
        public final void mo31299t(long j) throws IOException {
            if (!zzii.f22984c || mo31282b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f22986d;
                    int i = this.f22989g;
                    this.f22989g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f22986d;
                    int i2 = this.f22989g;
                    this.f22989g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22989g), Integer.valueOf(this.f22988f), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f22986d;
                    int i3 = this.f22989g;
                    this.f22989g = i3 + 1;
                    l99.m47694l(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f22986d;
                int i4 = this.f22989g;
                this.f22989g = i4 + 1;
                l99.m47694l(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: u */
        public final void mo31300u(zzht zzht) throws IOException {
            mo31273O(zzht.zza());
            zzht.zza((bx8) this);
        }

        /* renamed from: v */
        public final void mo31301v(String str) throws IOException {
            int i = this.f22989g;
            try {
                int o0 = zzii.m34411o0(str.length() * 3);
                int o02 = zzii.m34411o0(str.length());
                if (o02 == o0) {
                    int i2 = i + o02;
                    this.f22989g = i2;
                    int e = C4123i0.m34288e(str, this.f22986d, i2, mo31282b());
                    this.f22989g = i;
                    mo31273O((e - i) - o02);
                    this.f22989g = e;
                    return;
                }
                mo31273O(C4123i0.m34287d(str));
                this.f22989g = C4123i0.m34288e(str, this.f22986d, this.f22989g, mo31282b());
            } catch (zzmg e2) {
                this.f22989g = i;
                mo31302w(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzb(e3);
            }
        }

        /* renamed from: x */
        public final void mo31303x(k59 k59) throws IOException {
            mo31273O(k59.mo31175j());
            k59.mo31178m(this);
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public zzb(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L_0x0011
                java.lang.String r3 = r0.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzii.zzb.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public zzii() {
    }

    /* renamed from: A */
    public static int m34375A(float f) {
        return 4;
    }

    /* renamed from: A0 */
    public static int m34376A0(int i, int i2) {
        return m34411o0(i << 3) + 4;
    }

    /* renamed from: B */
    public static int m34377B(int i, double d) {
        return m34411o0(i << 3) + 8;
    }

    /* renamed from: B0 */
    public static int m34378B0(int i) {
        return m34407k0(i);
    }

    /* renamed from: C */
    public static int m34379C(int i, float f) {
        return m34411o0(i << 3) + 4;
    }

    /* renamed from: C0 */
    public static int m34380C0(int i, int i2) {
        return m34411o0(i << 3) + m34407k0(i2);
    }

    /* renamed from: D */
    public static int m34381D(int i, String str) {
        return m34411o0(i << 3) + m34389J(str);
    }

    @Deprecated
    /* renamed from: D0 */
    public static int m34382D0(int i) {
        return m34411o0(i);
    }

    /* renamed from: E */
    public static int m34383E(int i, d39 d39) {
        return (m34411o0(8) << 1) + m34412p0(2, i) + m34398c(3, d39);
    }

    /* renamed from: E0 */
    public static int m34384E0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: F */
    public static int m34385F(int i, k59 k59) {
        return (m34411o0(8) << 1) + m34412p0(2, i) + m34411o0(24) + m34390K(k59);
    }

    /* renamed from: G */
    public static int m34386G(int i, k59 k59, g79 g79) {
        return m34411o0(i << 3) + m34402e(k59, g79);
    }

    /* renamed from: H */
    public static int m34387H(int i, boolean z) {
        return m34411o0(i << 3) + 1;
    }

    /* renamed from: I */
    public static int m34388I(zzht zzht) {
        int zza = zzht.zza();
        return m34411o0(zza) + zza;
    }

    /* renamed from: J */
    public static int m34389J(String str) {
        int i;
        try {
            i = C4123i0.m34287d(str);
        } catch (zzmg unused) {
            i = str.getBytes(t19.f34083a).length;
        }
        return m34411o0(i) + i;
    }

    /* renamed from: K */
    public static int m34390K(k59 k59) {
        int j = k59.mo31175j();
        return m34411o0(j) + j;
    }

    /* renamed from: L */
    public static int m34391L(boolean z) {
        return 1;
    }

    /* renamed from: M */
    public static int m34392M(byte[] bArr) {
        int length = bArr.length;
        return m34411o0(length) + length;
    }

    /* renamed from: T */
    public static int m34393T(int i, zzht zzht) {
        int o0 = m34411o0(i << 3);
        int zza = zzht.zza();
        return o0 + m34411o0(zza) + zza;
    }

    @Deprecated
    /* renamed from: U */
    public static int m34394U(int i, k59 k59, g79 g79) {
        int o0 = m34411o0(i << 3) << 1;
        C4143y yVar = (C4143y) k59;
        int k = yVar.mo31176k();
        if (k == -1) {
            k = g79.mo31210f(yVar);
            yVar.mo31172f(k);
        }
        return o0 + k;
    }

    @Deprecated
    /* renamed from: V */
    public static int m34395V(k59 k59) {
        return k59.mo31175j();
    }

    /* renamed from: b0 */
    public static int m34397b0(int i, long j) {
        return m34411o0(i << 3) + m34406i0(j);
    }

    /* renamed from: c */
    public static int m34398c(int i, d39 d39) {
        int o0 = m34411o0(i << 3);
        int b = d39.mo41818b();
        return o0 + m34411o0(b) + b;
    }

    /* renamed from: c0 */
    public static int m34399c0(int i, zzht zzht) {
        return (m34411o0(8) << 1) + m34412p0(2, i) + m34393T(3, zzht);
    }

    /* renamed from: d */
    public static int m34400d(d39 d39) {
        int b = d39.mo41818b();
        return m34411o0(b) + b;
    }

    /* renamed from: d0 */
    public static int m34401d0(long j) {
        return m34406i0(j);
    }

    /* renamed from: e */
    public static int m34402e(k59 k59, g79 g79) {
        C4143y yVar = (C4143y) k59;
        int k = yVar.mo31176k();
        if (k == -1) {
            k = g79.mo31210f(yVar);
            yVar.mo31172f(k);
        }
        return m34411o0(k) + k;
    }

    /* renamed from: f */
    public static zzii m34403f(byte[] bArr) {
        return new C4149a(bArr, 0, bArr.length);
    }

    /* renamed from: g0 */
    public static int m34404g0(int i) {
        return m34411o0(i << 3);
    }

    /* renamed from: h0 */
    public static int m34405h0(int i, long j) {
        return m34411o0(i << 3) + m34406i0(j);
    }

    /* renamed from: i0 */
    public static int m34406i0(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: k0 */
    public static int m34407k0(int i) {
        if (i >= 0) {
            return m34411o0(i);
        }
        return 10;
    }

    /* renamed from: l0 */
    public static int m34408l0(int i, int i2) {
        return m34411o0(i << 3) + m34407k0(i2);
    }

    /* renamed from: m0 */
    public static int m34409m0(int i, long j) {
        return m34411o0(i << 3) + m34406i0(m34421y0(j));
    }

    /* renamed from: n0 */
    public static int m34410n0(long j) {
        return m34406i0(m34421y0(j));
    }

    /* renamed from: o0 */
    public static int m34411o0(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: p0 */
    public static int m34412p0(int i, int i2) {
        return m34411o0(i << 3) + m34411o0(i2);
    }

    /* renamed from: q0 */
    public static int m34413q0(int i, long j) {
        return m34411o0(i << 3) + 8;
    }

    /* renamed from: r0 */
    public static int m34414r0(long j) {
        return 8;
    }

    /* renamed from: s0 */
    public static int m34415s0(int i) {
        return m34411o0(m34384E0(i));
    }

    /* renamed from: t0 */
    public static int m34416t0(int i, int i2) {
        return m34411o0(i << 3) + m34411o0(m34384E0(i2));
    }

    /* renamed from: u0 */
    public static int m34417u0(int i, long j) {
        return m34411o0(i << 3) + 8;
    }

    /* renamed from: v0 */
    public static int m34418v0(long j) {
        return 8;
    }

    /* renamed from: w0 */
    public static int m34419w0(int i) {
        return 4;
    }

    /* renamed from: x0 */
    public static int m34420x0(int i, int i2) {
        return m34411o0(i << 3) + 4;
    }

    /* renamed from: y0 */
    public static long m34421y0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: z */
    public static int m34422z(double d) {
        return 8;
    }

    /* renamed from: z0 */
    public static int m34423z0(int i) {
        return 4;
    }

    /* renamed from: N */
    public final void mo31272N() {
        if (mo31282b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: O */
    public abstract void mo31273O(int i) throws IOException;

    /* renamed from: P */
    public abstract void mo31274P(int i, int i2) throws IOException;

    /* renamed from: Q */
    public final void mo31275Q(int i, long j) throws IOException {
        mo31293n(i, m34421y0(j));
    }

    /* renamed from: R */
    public abstract void mo31276R(int i, zzht zzht) throws IOException;

    /* renamed from: S */
    public final void mo31277S(long j) throws IOException {
        mo31299t(m34421y0(j));
    }

    /* renamed from: W */
    public final void mo31278W(int i) throws IOException {
        mo31273O(m34384E0(i));
    }

    /* renamed from: X */
    public abstract void mo31279X(int i, int i2) throws IOException;

    /* renamed from: Y */
    public abstract void mo31280Y(int i, long j) throws IOException;

    /* renamed from: Z */
    public abstract void mo31281Z(long j) throws IOException;

    /* renamed from: b */
    public abstract int mo31282b();

    /* renamed from: e0 */
    public abstract void mo31283e0(int i) throws IOException;

    /* renamed from: f0 */
    public final void mo31284f0(int i, int i2) throws IOException {
        mo31279X(i, m34384E0(i2));
    }

    /* renamed from: g */
    public abstract void mo31285g(byte b) throws IOException;

    /* renamed from: h */
    public final void mo31286h(double d) throws IOException {
        mo31281Z(Double.doubleToRawLongBits(d));
    }

    /* renamed from: i */
    public final void mo31287i(float f) throws IOException {
        mo31283e0(Float.floatToRawIntBits(f));
    }

    /* renamed from: j */
    public abstract void mo31288j(int i) throws IOException;

    /* renamed from: j0 */
    public abstract void mo31289j0(int i, int i2) throws IOException;

    /* renamed from: k */
    public final void mo31290k(int i, double d) throws IOException {
        mo31280Y(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: l */
    public final void mo31291l(int i, float f) throws IOException {
        mo31289j0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: m */
    public abstract void mo31292m(int i, int i2) throws IOException;

    /* renamed from: n */
    public abstract void mo31293n(int i, long j) throws IOException;

    /* renamed from: o */
    public abstract void mo31294o(int i, zzht zzht) throws IOException;

    /* renamed from: p */
    public abstract void mo31295p(int i, String str) throws IOException;

    /* renamed from: q */
    public abstract void mo31296q(int i, k59 k59) throws IOException;

    /* renamed from: r */
    public abstract void mo31297r(int i, k59 k59, g79 g79) throws IOException;

    /* renamed from: s */
    public abstract void mo31298s(int i, boolean z) throws IOException;

    /* renamed from: t */
    public abstract void mo31299t(long j) throws IOException;

    /* renamed from: u */
    public abstract void mo31300u(zzht zzht) throws IOException;

    /* renamed from: v */
    public abstract void mo31301v(String str) throws IOException;

    /* renamed from: w */
    public final void mo31302w(String str, zzmg zzmg) throws IOException {
        f22983b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzmg);
        byte[] bytes = str.getBytes(t19.f34083a);
        try {
            mo31273O(bytes.length);
            mo29800a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        } catch (zzb e2) {
            throw e2;
        }
    }

    /* renamed from: x */
    public abstract void mo31303x(k59 k59) throws IOException;

    /* renamed from: y */
    public final void mo31304y(boolean z) throws IOException {
        mo31285g(z ? (byte) 1 : 0);
    }
}
