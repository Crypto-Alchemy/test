package p000;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: nc0 */
public class nc0 {

    /* renamed from: l */
    public static final byte[] f41136l = new byte[15];

    /* renamed from: a */
    public final tc0 f41137a;

    /* renamed from: b */
    public final km3 f41138b;

    /* renamed from: c */
    public final byte[] f41139c;

    /* renamed from: d */
    public final byte[] f41140d;

    /* renamed from: e */
    public final byte[] f41141e;

    /* renamed from: f */
    public final byte[] f41142f;

    /* renamed from: g */
    public byte[] f41143g;

    /* renamed from: h */
    public long f41144h;

    /* renamed from: i */
    public long f41145i;

    /* renamed from: j */
    public int f41146j;

    /* renamed from: k */
    public int f41147k;

    public nc0() {
        this(new as4());
    }

    public nc0(km3 km3) {
        this.f41139c = new byte[32];
        this.f41140d = new byte[12];
        this.f41141e = new byte[80];
        this.f41142f = new byte[16];
        this.f41146j = 0;
        if (km3 == null) {
            throw new NullPointerException("'poly1305' cannot be null");
        } else if (16 == km3.mo50313b()) {
            this.f41137a = new tc0();
            this.f41138b = km3;
        } else {
            throw new IllegalArgumentException("'poly1305' must be a 128-bit MAC");
        }
    }

    /* renamed from: a */
    public final void mo56432a() {
        int i = this.f41146j;
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return;
            }
            if (i != 4) {
                i2 = 6;
                if (i != 5) {
                    if (i != 6) {
                        throw new IllegalStateException();
                    }
                    return;
                }
            } else {
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            }
        }
        this.f41146j = i2;
    }

    /* renamed from: b */
    public final void mo56433b() {
        int i;
        switch (this.f41146j) {
            case 1:
            case 2:
                i = 3;
                break;
            case 3:
            case 7:
                return;
            case 4:
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            case 5:
            case 6:
                i = 7;
                break;
            default:
                throw new IllegalStateException();
        }
        mo56435d(i);
    }

    /* renamed from: c */
    public int mo56434c(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        int i2;
        if (bArr == null) {
            throw new NullPointerException("'out' cannot be null");
        } else if (i >= 0) {
            mo56433b();
            C9367tq.m72421e(this.f41142f);
            int i3 = this.f41146j;
            if (i3 == 3) {
                int i4 = this.f41147k;
                i2 = i4 + 16;
                if (i <= bArr.length - i2) {
                    if (i4 > 0) {
                        mo56444m(this.f41141e, 0, i4, bArr, i);
                        this.f41138b.update(bArr, i, this.f41147k);
                    }
                    mo56436e(4);
                    System.arraycopy(this.f41142f, 0, bArr, i + this.f41147k, 16);
                } else {
                    throw new OutputLengthException("Output buffer too short");
                }
            } else if (i3 == 7) {
                int i5 = this.f41147k;
                if (i5 >= 16) {
                    i2 = i5 - 16;
                    if (i <= bArr.length - i2) {
                        if (i2 > 0) {
                            this.f41138b.update(this.f41141e, 0, i2);
                            mo56444m(this.f41141e, 0, i2, bArr, i);
                        }
                        mo56436e(8);
                        if (!C9367tq.m72429m(16, this.f41142f, 0, this.f41141e, i2)) {
                            throw new InvalidCipherTextException("mac check in ChaCha20Poly1305 failed");
                        }
                    } else {
                        throw new OutputLengthException("Output buffer too short");
                    }
                } else {
                    throw new InvalidCipherTextException("data too short");
                }
            } else {
                throw new IllegalStateException();
            }
            mo56445n(false, true);
            return i2;
        } else {
            throw new IllegalArgumentException("'outOff' cannot be negative");
        }
    }

    /* renamed from: d */
    public final void mo56435d(int i) {
        mo56441j(this.f41144h);
        this.f41146j = i;
    }

    /* renamed from: e */
    public final void mo56436e(int i) {
        mo56441j(this.f41145i);
        byte[] bArr = new byte[16];
        ek4.m57393m(this.f41144h, bArr, 0);
        ek4.m57393m(this.f41145i, bArr, 8);
        this.f41138b.update(bArr, 0, 16);
        this.f41138b.mo50312a(this.f41142f, 0);
        this.f41146j = i;
    }

    /* renamed from: f */
    public int mo56437f(int i) {
        int max = Math.max(0, i) + this.f41147k;
        int i2 = this.f41146j;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return max + 16;
        }
        if (i2 == 5 || i2 == 6 || i2 == 7) {
            return Math.max(0, max - 16);
        }
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public final long mo56438g(long j, int i, long j2) {
        long j3 = (long) i;
        if (j - Long.MIN_VALUE <= (j2 - j3) - Long.MIN_VALUE) {
            return j + j3;
        }
        throw new IllegalStateException("Limit exceeded");
    }

    /* JADX WARNING: type inference failed for: r8v9, types: [we0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo56439h(boolean r7, p000.we0 r8) throws java.lang.IllegalArgumentException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p000.C6784a
            if (r0 == 0) goto L_0x0039
            a r8 = (p000.C6784a) r8
            int r0 = r8.mo50012c()
            r1 = 128(0x80, float:1.794E-43)
            if (r1 != r0) goto L_0x0022
            va3 r0 = r8.mo50011b()
            byte[] r1 = r8.mo50013d()
            yl4 r2 = new yl4
            r2.<init>(r0, r1)
            byte[] r8 = r8.mo50010a()
            r6.f41143g = r8
            goto L_0x004e
        L_0x0022:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "Invalid value for MAC size: "
            r8.append(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0039:
            boolean r0 = r8 instanceof p000.yl4
            if (r0 == 0) goto L_0x00c4
            r2 = r8
            yl4 r2 = (p000.yl4) r2
            we0 r8 = r2.mo67128b()
            r0 = r8
            va3 r0 = (p000.va3) r0
            byte[] r1 = r2.mo67127a()
            r8 = 0
            r6.f41143g = r8
        L_0x004e:
            r8 = 32
            if (r0 != 0) goto L_0x005f
            int r3 = r6.f41146j
            if (r3 == 0) goto L_0x0057
            goto L_0x0066
        L_0x0057:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Key must be specified in initial init"
            r7.<init>(r8)
            throw r7
        L_0x005f:
            byte[] r3 = r0.mo66464a()
            int r3 = r3.length
            if (r8 != r3) goto L_0x00bc
        L_0x0066:
            if (r1 == 0) goto L_0x00b4
            int r3 = r1.length
            r4 = 12
            if (r4 != r3) goto L_0x00b4
            int r3 = r6.f41146j
            if (r3 == 0) goto L_0x0092
            if (r7 == 0) goto L_0x0092
            byte[] r3 = r6.f41140d
            boolean r3 = p000.C9367tq.m72417a(r3, r1)
            if (r3 == 0) goto L_0x0092
            if (r0 == 0) goto L_0x008a
            byte[] r3 = r6.f41139c
            byte[] r5 = r0.mo66464a()
            boolean r3 = p000.C9367tq.m72417a(r3, r5)
            if (r3 != 0) goto L_0x008a
            goto L_0x0092
        L_0x008a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "cannot reuse nonce for ChaCha20Poly1305 encryption"
            r7.<init>(r8)
            throw r7
        L_0x0092:
            r3 = 0
            if (r0 == 0) goto L_0x009e
            byte[] r0 = r0.mo66464a()
            byte[] r5 = r6.f41139c
            java.lang.System.arraycopy(r0, r3, r5, r3, r8)
        L_0x009e:
            byte[] r8 = r6.f41140d
            java.lang.System.arraycopy(r1, r3, r8, r3, r4)
            tc0 r8 = r6.f41137a
            r0 = 1
            r8.mo66295e(r0, r2)
            if (r7 == 0) goto L_0x00ad
            r7 = r0
            goto L_0x00ae
        L_0x00ad:
            r7 = 5
        L_0x00ae:
            r6.f41146j = r7
            r6.mo56445n(r0, r3)
            return
        L_0x00b4:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Nonce must be 96 bits"
            r7.<init>(r8)
            throw r7
        L_0x00bc:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Key must be 256 bits"
            r7.<init>(r8)
            throw r7
        L_0x00c4:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "invalid parameters passed to ChaCha20Poly1305"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nc0.mo56439h(boolean, we0):void");
    }

    /* renamed from: i */
    public final void mo56440i() {
        byte[] bArr = new byte[64];
        try {
            this.f41137a.mo66298h(bArr, 0, 64, bArr, 0);
            this.f41138b.mo50314c(new va3(bArr, 0, 32));
        } finally {
            C9367tq.m72421e(bArr);
        }
    }

    /* renamed from: j */
    public final void mo56441j(long j) {
        int i = ((int) j) & 15;
        if (i != 0) {
            this.f41138b.update(f41136l, 0, 16 - i);
        }
    }

    /* renamed from: k */
    public void mo56442k(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("'in' cannot be null");
        } else if (i < 0) {
            throw new IllegalArgumentException("'inOff' cannot be negative");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        } else if (i <= bArr.length - i2) {
            mo56432a();
            if (i2 > 0) {
                this.f41144h = mo56438g(this.f41144h, i2, -1);
                this.f41138b.update(bArr, i, i2);
            }
        } else {
            throw new DataLengthException("Input buffer too short");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095 A[LOOP:2: B:27:0x0093->B:28:0x0095, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo56443l(byte[] r17, int r18, int r19, byte[] r20, int r21) throws org.bouncycastle.crypto.DataLengthException {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            if (r7 == 0) goto L_0x00da
            if (r8 < 0) goto L_0x00d2
            if (r9 < 0) goto L_0x00ca
            int r0 = r7.length
            int r0 = r0 - r9
            if (r8 > r0) goto L_0x00c2
            if (r11 < 0) goto L_0x00ba
            r16.mo56433b()
            int r0 = r6.f41146j
            r1 = 3
            r12 = 0
            r13 = 64
            if (r0 == r1) goto L_0x0062
            r1 = 7
            if (r0 != r1) goto L_0x005c
            r14 = r12
            r15 = r14
        L_0x0028:
            if (r14 >= r9) goto L_0x00b9
            byte[] r0 = r6.f41141e
            int r1 = r6.f41147k
            int r2 = r8 + r14
            byte r2 = r7[r2]
            r0[r1] = r2
            int r1 = r1 + 1
            r6.f41147k = r1
            int r2 = r0.length
            if (r1 != r2) goto L_0x0059
            km3 r1 = r6.f41138b
            r1.update(r0, r12, r13)
            byte[] r1 = r6.f41141e
            r2 = 0
            r3 = 64
            int r5 = r11 + r15
            r0 = r16
            r4 = r20
            r0.mo56444m(r1, r2, r3, r4, r5)
            byte[] r0 = r6.f41141e
            r1 = 16
            java.lang.System.arraycopy(r0, r13, r0, r12, r1)
            r6.f41147k = r1
            int r15 = r15 + 64
        L_0x0059:
            int r14 = r14 + 1
            goto L_0x0028
        L_0x005c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0062:
            int r0 = r6.f41147k
            if (r0 == 0) goto L_0x0092
        L_0x0066:
            if (r9 <= 0) goto L_0x0092
            int r9 = r9 + -1
            byte[] r1 = r6.f41141e
            int r0 = r6.f41147k
            int r14 = r8 + 1
            byte r2 = r7[r8]
            r1[r0] = r2
            int r0 = r0 + 1
            r6.f41147k = r0
            if (r0 != r13) goto L_0x0090
            r2 = 0
            r3 = 64
            r0 = r16
            r4 = r20
            r5 = r21
            r0.mo56444m(r1, r2, r3, r4, r5)
            km3 r0 = r6.f41138b
            r0.update(r10, r11, r13)
            r6.f41147k = r12
            r15 = r13
            r8 = r14
            goto L_0x0093
        L_0x0090:
            r8 = r14
            goto L_0x0066
        L_0x0092:
            r15 = r12
        L_0x0093:
            if (r9 < r13) goto L_0x00b0
            r3 = 64
            int r14 = r11 + r15
            r0 = r16
            r1 = r17
            r2 = r8
            r4 = r20
            r5 = r14
            r0.mo56444m(r1, r2, r3, r4, r5)
            km3 r0 = r6.f41138b
            r0.update(r10, r14, r13)
            int r8 = r8 + 64
            int r9 = r9 + -64
            int r15 = r15 + 64
            goto L_0x0093
        L_0x00b0:
            if (r9 <= 0) goto L_0x00b9
            byte[] r0 = r6.f41141e
            java.lang.System.arraycopy(r7, r8, r0, r12, r9)
            r6.f41147k = r9
        L_0x00b9:
            return r15
        L_0x00ba:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "'outOff' cannot be negative"
            r0.<init>(r1)
            throw r0
        L_0x00c2:
            org.bouncycastle.crypto.DataLengthException r0 = new org.bouncycastle.crypto.DataLengthException
            java.lang.String r1 = "Input buffer too short"
            r0.<init>(r1)
            throw r0
        L_0x00ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "'len' cannot be negative"
            r0.<init>(r1)
            throw r0
        L_0x00d2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "'inOff' cannot be negative"
            r0.<init>(r1)
            throw r0
        L_0x00da:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "'in' cannot be null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nc0.mo56443l(byte[], int, int, byte[], int):int");
    }

    /* renamed from: m */
    public final void mo56444m(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i3 <= bArr2.length - i2) {
            this.f41137a.mo66298h(bArr, i, i2, bArr2, i3);
            this.f41145i = mo56438g(this.f41145i, i2, 274877906880L);
            return;
        }
        throw new OutputLengthException("Output buffer too short");
    }

    /* renamed from: n */
    public final void mo56445n(boolean z, boolean z2) {
        C9367tq.m72421e(this.f41141e);
        if (z) {
            C9367tq.m72421e(this.f41142f);
        }
        this.f41144h = 0;
        this.f41145i = 0;
        this.f41147k = 0;
        switch (this.f41146j) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.f41146j = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.f41146j = 5;
                break;
            default:
                throw new IllegalStateException();
        }
        if (z2) {
            this.f41137a.mo66299i();
        }
        mo56440i();
        byte[] bArr = this.f41143g;
        if (bArr != null) {
            mo56442k(bArr, 0, bArr.length);
        }
    }
}
