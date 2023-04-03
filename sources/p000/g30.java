package p000;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g30 */
public class g30 implements tx1 {

    /* renamed from: m */
    public static final long[] f37953m = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};

    /* renamed from: n */
    public static final byte[][] f37954n = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};

    /* renamed from: o */
    public static int f37955o = 12;

    /* renamed from: a */
    public int f37956a;

    /* renamed from: b */
    public int f37957b;

    /* renamed from: c */
    public byte[] f37958c;

    /* renamed from: d */
    public byte[] f37959d;

    /* renamed from: e */
    public byte[] f37960e;

    /* renamed from: f */
    public byte[] f37961f;

    /* renamed from: g */
    public int f37962g;

    /* renamed from: h */
    public long[] f37963h;

    /* renamed from: i */
    public long[] f37964i;

    /* renamed from: j */
    public long f37965j;

    /* renamed from: k */
    public long f37966k;

    /* renamed from: l */
    public long f37967l;

    public g30() {
        this((int) RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN);
    }

    public g30(int i) {
        this.f37956a = 64;
        this.f37957b = 0;
        this.f37958c = null;
        this.f37959d = null;
        this.f37960e = null;
        this.f37961f = null;
        this.f37962g = 0;
        this.f37963h = new long[16];
        this.f37964i = null;
        this.f37965j = 0;
        this.f37966k = 0;
        this.f37967l = 0;
        if (i < 8 || i > 512 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.f37961f = new byte[128];
        this.f37957b = 0;
        this.f37956a = i / 8;
        mo51859i();
    }

    public g30(g30 g30) {
        this.f37956a = 64;
        this.f37957b = 0;
        this.f37958c = null;
        this.f37959d = null;
        this.f37960e = null;
        this.f37961f = null;
        this.f37962g = 0;
        this.f37963h = new long[16];
        this.f37964i = null;
        this.f37965j = 0;
        this.f37966k = 0;
        this.f37967l = 0;
        this.f37962g = g30.f37962g;
        this.f37961f = C9367tq.m72422f(g30.f37961f);
        this.f37957b = g30.f37957b;
        this.f37960e = C9367tq.m72422f(g30.f37960e);
        this.f37956a = g30.f37956a;
        this.f37964i = C9367tq.m72424h(g30.f37964i);
        this.f37959d = C9367tq.m72422f(g30.f37959d);
        this.f37958c = C9367tq.m72422f(g30.f37958c);
        this.f37965j = g30.f37965j;
        this.f37966k = g30.f37966k;
        this.f37967l = g30.f37967l;
    }

    /* renamed from: a */
    public int mo50198a(byte[] bArr, int i) {
        long[] jArr;
        int i2;
        this.f37967l = -1;
        long j = this.f37965j;
        int i3 = this.f37962g;
        long j2 = j + ((long) i3);
        this.f37965j = j2;
        if (i3 > 0 && j2 == 0) {
            this.f37966k++;
        }
        mo51858h(this.f37961f, 0);
        C9367tq.m72432p(this.f37961f, (byte) 0);
        C9367tq.m72435s(this.f37963h, 0);
        int i4 = 0;
        while (true) {
            jArr = this.f37964i;
            if (i4 >= jArr.length || (i2 = i4 * 8) >= this.f37956a) {
                C9367tq.m72435s(jArr, 0);
                reset();
            } else {
                byte[] o = ek4.m57395o(jArr[i4]);
                int i5 = this.f37956a;
                if (i2 < i5 - 8) {
                    System.arraycopy(o, 0, bArr, i2 + i, 8);
                } else {
                    System.arraycopy(o, 0, bArr, i + i2, i5 - i2);
                }
                i4++;
            }
        }
        C9367tq.m72435s(jArr, 0);
        reset();
        return this.f37956a;
    }

    /* renamed from: b */
    public void mo51713b(byte b) {
        int i = this.f37962g;
        if (128 - i == 0) {
            long j = this.f37965j + 128;
            this.f37965j = j;
            if (j == 0) {
                this.f37966k++;
            }
            mo51858h(this.f37961f, 0);
            C9367tq.m72432p(this.f37961f, (byte) 0);
            this.f37961f[0] = b;
            this.f37962g = 1;
            return;
        }
        this.f37961f[i] = b;
        this.f37962g = i + 1;
    }

    /* renamed from: c */
    public final void mo51857c(long j, long j2, int i, int i2, int i3, int i4) {
        long[] jArr = this.f37963h;
        long j3 = jArr[i] + jArr[i2] + j;
        jArr[i] = j3;
        jArr[i4] = kl3.m59857a(jArr[i4] ^ j3, 32);
        long[] jArr2 = this.f37963h;
        long j4 = jArr2[i3] + jArr2[i4];
        jArr2[i3] = j4;
        jArr2[i2] = kl3.m59857a(j4 ^ jArr2[i2], 24);
        long[] jArr3 = this.f37963h;
        long j5 = jArr3[i] + jArr3[i2] + j2;
        jArr3[i] = j5;
        jArr3[i4] = kl3.m59857a(jArr3[i4] ^ j5, 16);
        long[] jArr4 = this.f37963h;
        long j6 = jArr4[i3] + jArr4[i4];
        jArr4[i3] = j6;
        jArr4[i2] = kl3.m59857a(j6 ^ jArr4[i2], 63);
    }

    /* renamed from: d */
    public String mo50201d() {
        return "BLAKE2b";
    }

    /* renamed from: e */
    public int mo50202e() {
        return this.f37956a;
    }

    /* renamed from: g */
    public int mo51714g() {
        return 128;
    }

    /* renamed from: h */
    public final void mo51858h(byte[] bArr, int i) {
        mo51860j();
        long[] jArr = new long[16];
        int i2 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            jArr[i3] = ek4.m57390j(bArr, (i3 * 8) + i);
        }
        for (int i4 = 0; i4 < f37955o; i4++) {
            byte[][] bArr2 = f37954n;
            byte[] bArr3 = bArr2[i4];
            mo51857c(jArr[bArr3[0]], jArr[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i4];
            mo51857c(jArr[bArr4[2]], jArr[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i4];
            mo51857c(jArr[bArr5[4]], jArr[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i4];
            mo51857c(jArr[bArr6[6]], jArr[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i4];
            mo51857c(jArr[bArr7[8]], jArr[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i4];
            mo51857c(jArr[bArr8[10]], jArr[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i4];
            mo51857c(jArr[bArr9[12]], jArr[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i4];
            mo51857c(jArr[bArr10[14]], jArr[bArr10[15]], 3, 4, 9, 14);
        }
        while (true) {
            long[] jArr2 = this.f37964i;
            if (i2 < jArr2.length) {
                long j = jArr2[i2];
                long[] jArr3 = this.f37963h;
                jArr2[i2] = (j ^ jArr3[i2]) ^ jArr3[i2 + 8];
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final void mo51859i() {
        if (this.f37964i == null) {
            long[] jArr = new long[8];
            this.f37964i = jArr;
            long[] jArr2 = f37953m;
            jArr[0] = jArr2[0] ^ ((long) ((this.f37956a | (this.f37957b << 8)) | 16842752));
            jArr[1] = jArr2[1];
            jArr[2] = jArr2[2];
            jArr[3] = jArr2[3];
            long j = jArr2[4];
            jArr[4] = j;
            jArr[5] = jArr2[5];
            byte[] bArr = this.f37958c;
            if (bArr != null) {
                jArr[4] = j ^ ek4.m57390j(bArr, 0);
                long[] jArr3 = this.f37964i;
                jArr3[5] = jArr3[5] ^ ek4.m57390j(this.f37958c, 8);
            }
            long[] jArr4 = this.f37964i;
            long j2 = jArr2[6];
            jArr4[6] = j2;
            jArr4[7] = jArr2[7];
            byte[] bArr2 = this.f37959d;
            if (bArr2 != null) {
                jArr4[6] = ek4.m57390j(bArr2, 0) ^ j2;
                long[] jArr5 = this.f37964i;
                jArr5[7] = jArr5[7] ^ ek4.m57390j(this.f37959d, 8);
            }
        }
    }

    /* renamed from: j */
    public final void mo51860j() {
        long[] jArr = this.f37964i;
        System.arraycopy(jArr, 0, this.f37963h, 0, jArr.length);
        long[] jArr2 = f37953m;
        System.arraycopy(jArr2, 0, this.f37963h, this.f37964i.length, 4);
        long[] jArr3 = this.f37963h;
        jArr3[12] = this.f37965j ^ jArr2[4];
        jArr3[13] = this.f37966k ^ jArr2[5];
        jArr3[14] = this.f37967l ^ jArr2[6];
        jArr3[15] = jArr2[7];
    }

    public void reset() {
        this.f37962g = 0;
        this.f37967l = 0;
        this.f37965j = 0;
        this.f37966k = 0;
        this.f37964i = null;
        C9367tq.m72432p(this.f37961f, (byte) 0);
        byte[] bArr = this.f37960e;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f37961f, 0, bArr.length);
            this.f37962g = 128;
        }
        mo51859i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x0061
            if (r14 != 0) goto L_0x0005
            goto L_0x0061
        L_0x0005:
            int r0 = r11.f37962g
            r1 = 1
            r3 = 0
            r5 = 128(0x80, double:6.32E-322)
            r7 = 0
            if (r0 == 0) goto L_0x003f
            int r8 = 128 - r0
            if (r8 >= r14) goto L_0x0034
            byte[] r9 = r11.f37961f
            java.lang.System.arraycopy(r12, r13, r9, r0, r8)
            long r9 = r11.f37965j
            long r9 = r9 + r5
            r11.f37965j = r9
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            long r9 = r11.f37966k
            long r9 = r9 + r1
            r11.f37966k = r9
        L_0x0027:
            byte[] r0 = r11.f37961f
            r11.mo51858h(r0, r7)
            r11.f37962g = r7
            byte[] r0 = r11.f37961f
            p000.C9367tq.m72432p(r0, r7)
            goto L_0x0040
        L_0x0034:
            byte[] r1 = r11.f37961f
            java.lang.System.arraycopy(r12, r13, r1, r0, r14)
        L_0x0039:
            int r12 = r11.f37962g
            int r12 = r12 + r14
            r11.f37962g = r12
            return
        L_0x003f:
            r8 = r7
        L_0x0040:
            int r14 = r14 + r13
            int r0 = r14 + -128
            int r13 = r13 + r8
        L_0x0044:
            if (r13 >= r0) goto L_0x005a
            long r8 = r11.f37965j
            long r8 = r8 + r5
            r11.f37965j = r8
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0054
            long r8 = r11.f37966k
            long r8 = r8 + r1
            r11.f37966k = r8
        L_0x0054:
            r11.mo51858h(r12, r13)
            int r13 = r13 + 128
            goto L_0x0044
        L_0x005a:
            byte[] r0 = r11.f37961f
            int r14 = r14 - r13
            java.lang.System.arraycopy(r12, r13, r0, r7, r14)
            goto L_0x0039
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g30.update(byte[], int, int):void");
    }
}
