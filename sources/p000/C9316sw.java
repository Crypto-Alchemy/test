package p000;

/* renamed from: sw */
/* compiled from: BIG */
public class C9316sw {

    /* renamed from: a */
    public long[] f44615a;

    public C9316sw() {
        this.f44615a = new long[5];
        for (int i = 0; i < 5; i++) {
            this.f44615a[i] = 0;
        }
    }

    /* renamed from: E */
    public static hz0 m72071E(C9316sw swVar) {
        C9316sw swVar2 = swVar;
        hz0 hz0 = new hz0(0);
        int i = 0;
        while (i < 5) {
            int i2 = i + 1;
            long j = 0;
            for (int i3 = i2; i3 < 5; i3++) {
                long[] jArr = swVar2.f44615a;
                int i4 = i + i3;
                long[] s = m72079s(2 * jArr[i], jArr[i3], j, hz0.f38290a[i4]);
                j = s[0];
                hz0.f38290a[i4] = s[1];
            }
            hz0.f38290a[i + 5] = j;
            i = i2;
        }
        for (int i5 = 0; i5 < 5; i5++) {
            long j2 = swVar2.f44615a[i5];
            int i6 = i5 * 2;
            long[] s2 = m72079s(j2, j2, 0, hz0.f38290a[i6]);
            long[] jArr2 = hz0.f38290a;
            int i7 = i6 + 1;
            jArr2[i7] = jArr2[i7] + s2[0];
            jArr2[i6] = s2[1];
        }
        hz0.mo52328b();
        return hz0;
    }

    /* renamed from: F */
    public static int m72072F(C9316sw swVar, C9316sw swVar2, C9316sw swVar3) {
        C9316sw swVar4 = swVar;
        C9316sw swVar5 = swVar2;
        C9316sw swVar6 = swVar3;
        long[] jArr = swVar6.f44615a;
        long j = (jArr[0] >> 1) | ((jArr[1] << 55) & 72057594037927935L);
        jArr[0] = j;
        long[] jArr2 = swVar4.f44615a;
        long j2 = swVar5.f44615a[0] - j;
        jArr2[0] = j2;
        long j3 = j2 >> 56;
        jArr2[0] = j2 & 72057594037927935L;
        int i = 1;
        while (i < 4) {
            long[] jArr3 = swVar6.f44615a;
            int i2 = i + 1;
            long j4 = (jArr3[i] >> 1) | ((jArr3[i2] << 55) & 72057594037927935L);
            jArr3[i] = j4;
            long[] jArr4 = swVar4.f44615a;
            long j5 = (swVar5.f44615a[i] - j4) + j3;
            jArr4[i] = j5;
            j3 = j5 >> 56;
            jArr4[i] = j5 & 72057594037927935L;
            i = i2;
        }
        long[] jArr5 = swVar6.f44615a;
        long j6 = jArr5[4] >> 1;
        jArr5[4] = j6;
        long[] jArr6 = swVar4.f44615a;
        long j7 = (swVar5.f44615a[4] - j6) + j3;
        jArr6[4] = j7;
        return (int) ((j7 >> 63) & 1);
    }

    /* renamed from: b */
    public static long m72073b(int i) {
        return (long) i;
    }

    /* renamed from: d */
    public static int m72074d(C9316sw swVar, C9316sw swVar2) {
        long j = 0;
        long j2 = 1;
        for (int i = 4; i >= 0; i--) {
            long j3 = swVar2.f44615a[i];
            long j4 = swVar.f44615a[i];
            j |= ((j3 - j4) >> 56) & j2;
            j2 &= ((j3 ^ j4) - 1) >> 56;
        }
        return (int) (((j + j) + j2) - 1);
    }

    /* renamed from: h */
    public static C9316sw m72075h(byte[] bArr) {
        return m72076i(bArr, 0);
    }

    /* renamed from: i */
    public static C9316sw m72076i(byte[] bArr, int i) {
        C9316sw swVar = new C9316sw(0);
        for (int i2 = 0; i2 < 32; i2++) {
            swVar.mo65931j(8);
            long[] jArr = swVar.f44615a;
            jArr[0] = jArr[0] + ((long) (bArr[i2 + i] & 255));
        }
        return swVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057 A[LOOP:2: B:17:0x0049->B:19:0x0057, LOOP_END] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C9316sw m72077q(p000.C9316sw r17, long r18, p000.hz0 r20) {
        /*
            r0 = r20
            r1 = 0
            r2 = r1
        L_0x0004:
            r3 = 5
            if (r2 < r3) goto L_0x001f
            sw r4 = new sw
            r4.<init>((int) r1)
        L_0x000c:
            if (r1 < r3) goto L_0x0012
            r4.mo65940v()
            return r4
        L_0x0012:
            long[] r2 = r4.f44615a
            long[] r5 = r0.f38290a
            int r6 = r1 + 5
            r6 = r5[r6]
            r2[r1] = r6
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001f:
            r4 = -1
            int r4 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            r5 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            if (r4 != 0) goto L_0x0032
            long[] r4 = r0.f38290a
            r7 = r4[r2]
            long r7 = -r7
        L_0x002f:
            long r4 = r7 & r5
            goto L_0x0045
        L_0x0032:
            r7 = 1
            int r4 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x003e
            long[] r4 = r0.f38290a
            r5 = r4[r2]
            r4 = r5
            goto L_0x0045
        L_0x003e:
            long[] r4 = r0.f38290a
            r7 = r4[r2]
            long r7 = r7 * r18
            goto L_0x002f
        L_0x0045:
            r6 = 0
            r14 = r1
            r10 = r6
        L_0x0049:
            if (r14 < r3) goto L_0x0057
            long[] r3 = r0.f38290a
            int r4 = r2 + 5
            r5 = r3[r4]
            long r5 = r5 + r10
            r3[r4] = r5
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0057:
            r15 = r17
            long[] r6 = r15.f44615a
            r8 = r6[r14]
            long[] r6 = r0.f38290a
            int r16 = r2 + r14
            r12 = r6[r16]
            r6 = r4
            long[] r6 = m72079s(r6, r8, r10, r12)
            r10 = r6[r1]
            long[] r7 = r0.f38290a
            r8 = 1
            r8 = r6[r8]
            r7[r16] = r8
            int r14 = r14 + 1
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9316sw.m72077q(sw, long, hz0):sw");
    }

    /* renamed from: r */
    public static hz0 m72078r(C9316sw swVar, C9316sw swVar2) {
        hz0 hz0 = new hz0(0);
        for (int i = 0; i < 5; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = i + i2;
                long[] s = m72079s(swVar.f44615a[i], swVar2.f44615a[i2], j, hz0.f38290a[i3]);
                j = s[0];
                hz0.f38290a[i3] = s[1];
            }
            hz0.f38290a[i + 5] = j;
        }
        return hz0;
    }

    /* renamed from: s */
    public static long[] m72079s(long j, long j2, long j3, long j4) {
        long t = m72080t(j, j2);
        long j5 = j * j2;
        long j6 = j5 & 72057594037927935L;
        long j7 = j6 + j3 + j4;
        return new long[]{((j5 >>> 56) | (t << 8)) + (j7 >>> 56), 72057594037927935L & j7};
    }

    /* renamed from: t */
    public static long m72080t(long j, long j2) {
        if (j < 0 || j2 < 0) {
            long j3 = j >> 32;
            long j4 = j & 4294967295L;
            long j5 = j2 >> 32;
            long j6 = j2 & 4294967295L;
            long j7 = (j6 * j3) + ((j4 * j6) >>> 32);
            return (j3 * j5) + (j7 >> 32) + (((j7 & 4294967295L) + (j4 * j5)) >> 32);
        }
        long j8 = j >>> 32;
        long j9 = j2 >>> 32;
        long j10 = j & 4294967295L;
        long j11 = j2 & 4294967295L;
        long j12 = j8 * j9;
        long j13 = j10 * j11;
        return (((j13 >>> 32) + ((((j8 + j10) * (j9 + j11)) - j12) - j13)) >>> 32) + j12;
    }

    /* renamed from: A */
    public long mo65918A(int i) {
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            long[] jArr = this.f44615a;
            long j2 = jArr[i2];
            jArr[i2] = 0;
            long[] s = m72079s(j2, (long) i, j, 0);
            j = s[0];
            this.f44615a[i2] = s[1];
        }
        return j;
    }

    /* renamed from: B */
    public void mo65919B(C9316sw swVar) {
        for (int i = 0; i < 5; i++) {
            long[] jArr = this.f44615a;
            jArr[i] = swVar.f44615a[i] - jArr[i];
        }
    }

    /* renamed from: C */
    public void mo65920C(int i) {
        int i2 = i % 56;
        int i3 = i / 56;
        long[] jArr = this.f44615a;
        long j = jArr[4 - i3] << i2;
        jArr[4] = j;
        if (5 >= i3 + 2) {
            jArr[4] = j | (jArr[(5 - i3) - 2] >> (56 - i2));
        }
        for (int i4 = 3; i4 > i3; i4--) {
            long[] jArr2 = this.f44615a;
            int i5 = i4 - i3;
            jArr2[i4] = (72057594037927935L & (jArr2[i5] << i2)) | (jArr2[i5 - 1] >> (56 - i2));
        }
        long[] jArr3 = this.f44615a;
        jArr3[i3] = 72057594037927935L & (jArr3[0] << i2);
        for (int i6 = 0; i6 < i3; i6++) {
            this.f44615a[i6] = 0;
        }
    }

    /* renamed from: D */
    public void mo65921D(int i) {
        int i2;
        int i3;
        int i4 = i % 56;
        int i5 = i / 56;
        int i6 = 0;
        while (true) {
            i2 = 5 - i5;
            i3 = i2 - 1;
            if (i6 >= i3) {
                break;
            }
            long[] jArr = this.f44615a;
            int i7 = i5 + i6;
            jArr[i6] = (jArr[i7] >> i4) | ((jArr[i7 + 1] << (56 - i4)) & 72057594037927935L);
            i6++;
        }
        if (5 > i5) {
            long[] jArr2 = this.f44615a;
            jArr2[i3] = jArr2[4] >> i4;
        }
        while (i2 < 5) {
            this.f44615a[i2] = 0;
            i2++;
        }
    }

    /* renamed from: G */
    public void mo65922G(C9316sw swVar) {
        for (int i = 0; i < 5; i++) {
            long[] jArr = this.f44615a;
            jArr[i] = jArr[i] - swVar.f44615a[i];
        }
    }

    /* renamed from: H */
    public void mo65923H(byte[] bArr) {
        mo65924I(bArr, 0);
    }

    /* renamed from: I */
    public void mo65924I(byte[] bArr, int i) {
        C9316sw swVar = new C9316sw(this);
        swVar.mo65940v();
        for (int i2 = 31; i2 >= 0; i2--) {
            bArr[i2 + i] = (byte) ((int) swVar.f44615a[0]);
            swVar.mo65932k(8);
        }
    }

    /* renamed from: J */
    public void mo65925J() {
        for (int i = 0; i < 5; i++) {
            this.f44615a[i] = 0;
        }
    }

    /* renamed from: a */
    public void mo65926a(C9316sw swVar) {
        for (int i = 0; i < 5; i++) {
            long[] jArr = this.f44615a;
            jArr[i] = jArr[i] + swVar.f44615a[i];
        }
    }

    /* renamed from: c */
    public void mo65927c(C9316sw swVar, int i) {
        long j = (long) (-i);
        for (int i2 = 0; i2 < 5; i2++) {
            long[] jArr = this.f44615a;
            long j2 = jArr[i2];
            jArr[i2] = j2 ^ ((j2 ^ swVar.f44615a[i2]) & j);
        }
    }

    /* renamed from: e */
    public void mo65928e(C9316sw swVar) {
        for (int i = 0; i < 5; i++) {
            this.f44615a[i] = swVar.f44615a[i];
        }
    }

    /* renamed from: f */
    public void mo65929f(C9316sw swVar, int i) {
        C9316sw swVar2 = new C9316sw(0);
        C9316sw swVar3 = new C9316sw(swVar);
        mo65940v();
        swVar3.mo65920C(i);
        while (true) {
            swVar2.mo65928e(this);
            swVar2.mo65922G(swVar3);
            swVar2.mo65940v();
            mo65927c(swVar2, (int) (1 - ((swVar2.f44615a[4] >> 63) & 1)));
            if (i != 0) {
                swVar3.mo65932k(1);
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public void mo65930g(int i) {
        mo65940v();
        long[] jArr = this.f44615a;
        jArr[0] = jArr[0] - ((long) i);
    }

    /* renamed from: j */
    public int mo65931j(int i) {
        long[] jArr = this.f44615a;
        int i2 = 56 - i;
        jArr[4] = (jArr[4] << i) | (jArr[3] >> i2);
        for (int i3 = 3; i3 > 0; i3--) {
            long[] jArr2 = this.f44615a;
            jArr2[i3] = (72057594037927935L & (jArr2[i3] << i)) | (jArr2[i3 - 1] >> i2);
        }
        long[] jArr3 = this.f44615a;
        jArr3[0] = 72057594037927935L & (jArr3[0] << i);
        return (int) (jArr3[4] >> 32);
    }

    /* renamed from: k */
    public int mo65932k(int i) {
        int i2 = 0;
        int b = (int) (this.f44615a[0] & ((m72073b(1) << i) - 1));
        while (i2 < 4) {
            long[] jArr = this.f44615a;
            int i3 = i2 + 1;
            jArr[i2] = (jArr[i2] >> i) | ((jArr[i3] << (56 - i)) & 72057594037927935L);
            i2 = i3;
        }
        long[] jArr2 = this.f44615a;
        jArr2[4] = jArr2[4] >> i;
        return b;
    }

    /* renamed from: l */
    public void mo65933l(int i) {
        mo65940v();
        long[] jArr = this.f44615a;
        jArr[0] = jArr[0] + ((long) i);
    }

    /* renamed from: m */
    public boolean mo65934m() {
        long j = 0;
        for (int i = 1; i < 5; i++) {
            j |= this.f44615a[i];
        }
        if ((((j - 1) >> 56) & 1 & (((this.f44615a[0] ^ 1) - 1) >> 56)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo65935n() {
        long j = 0;
        for (int i = 0; i < 5; i++) {
            j |= this.f44615a[i];
        }
        if ((((j - 1) >> 56) & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public int mo65936o(int i) {
        mo65940v();
        return ((1 << i) - 1) & ((int) this.f44615a[0]);
    }

    /* renamed from: p */
    public void mo65937p(C9316sw swVar) {
        int u = mo65939u() - swVar.mo65939u();
        if (u < 0) {
            u = 0;
        }
        mo65929f(swVar, u);
    }

    public String toString() {
        int i;
        int u = mo65939u();
        if (u % 4 == 0) {
            i = u / 4;
        } else {
            i = (u / 4) + 1;
        }
        if (i < 64) {
            i = 64;
        }
        String str = "";
        for (int i2 = i - 1; i2 >= 0; i2--) {
            C9316sw swVar = new C9316sw(this);
            swVar.mo65921D(i2 * 4);
            str = String.valueOf(str) + Long.toHexString(15 & swVar.f44615a[0]);
        }
        return str;
    }

    /* renamed from: u */
    public int mo65939u() {
        C9316sw swVar = new C9316sw(this);
        swVar.mo65940v();
        int i = 4;
        while (i >= 0 && swVar.f44615a[i] == 0) {
            i--;
        }
        if (i < 0) {
            return 0;
        }
        int i2 = i * 56;
        long j = swVar.f44615a[i];
        while (j != 0) {
            j /= 2;
            i2++;
        }
        return i2;
    }

    /* renamed from: v */
    public long mo65940v() {
        long j = 0;
        for (int i = 0; i < 4; i++) {
            long[] jArr = this.f44615a;
            long j2 = jArr[i] + j;
            jArr[i] = 72057594037927935L & j2;
            j = j2 >> 56;
        }
        long[] jArr2 = this.f44615a;
        long j3 = jArr2[4] + j;
        jArr2[4] = j3;
        return j3 >> 32;
    }

    /* renamed from: w */
    public void mo65941w() {
        this.f44615a[0] = 1;
        for (int i = 1; i < 5; i++) {
            this.f44615a[i] = 0;
        }
    }

    /* renamed from: x */
    public void mo65942x(C9316sw swVar) {
        for (int i = 0; i < 5; i++) {
            long[] jArr = this.f44615a;
            jArr[i] = jArr[i] | swVar.f44615a[i];
        }
    }

    /* renamed from: y */
    public int mo65943y() {
        return (int) (this.f44615a[0] % 2);
    }

    /* renamed from: z */
    public C9316sw mo65944z(C9316sw swVar) {
        C9316sw swVar2 = new C9316sw(0);
        for (int i = 0; i < 5; i++) {
            swVar2.f44615a[i] = this.f44615a[i] + swVar.f44615a[i];
        }
        swVar2.mo65940v();
        return swVar2;
    }

    public C9316sw(int i) {
        long[] jArr = new long[5];
        this.f44615a = jArr;
        jArr[0] = (long) i;
        for (int i2 = 1; i2 < 5; i2++) {
            this.f44615a[i2] = 0;
        }
    }

    public C9316sw(C9316sw swVar) {
        this.f44615a = new long[5];
        for (int i = 0; i < 5; i++) {
            this.f44615a[i] = swVar.f44615a[i];
        }
    }

    public C9316sw(long[] jArr) {
        this.f44615a = new long[5];
        for (int i = 0; i < 5; i++) {
            this.f44615a[i] = jArr[i];
        }
    }
}
