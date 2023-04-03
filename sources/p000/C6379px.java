package p000;

/* renamed from: px */
/* compiled from: Base64 */
public class C6379px extends C3869az {

    /* renamed from: l */
    public static final byte[] f32860l = {13, 10};

    /* renamed from: m */
    public static final byte[] f32861m = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: n */
    public static final byte[] f32862n = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: o */
    public static final byte[] f32863o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: g */
    public final byte[] f32864g;

    /* renamed from: h */
    public final byte[] f32865h;

    /* renamed from: i */
    public final byte[] f32866i;

    /* renamed from: j */
    public final int f32867j;

    /* renamed from: k */
    public final int f32868k;

    public C6379px(boolean z) {
        this(76, f32860l, z);
    }

    /* renamed from: m */
    public static byte[] m50176m(byte[] bArr, boolean z) {
        return m50177n(bArr, z, false);
    }

    /* renamed from: n */
    public static byte[] m50177n(byte[] bArr, boolean z, boolean z2) {
        return m50178o(bArr, z, z2, Integer.MAX_VALUE);
    }

    /* renamed from: o */
    public static byte[] m50178o(byte[] bArr, boolean z, boolean z2, int i) {
        C6379px pxVar;
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        if (z) {
            pxVar = new C6379px(z2);
        } else {
            pxVar = new C6379px(0, f32860l, z2);
        }
        long h = pxVar.mo29397h(bArr);
        if (h <= ((long) i)) {
            return pxVar.mo29393d(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + h + ") than the specified maximum size of " + i);
    }

    /* renamed from: p */
    public static String m50179p(byte[] bArr) {
        return jb6.m46415b(m50176m(bArr, false));
    }

    /* renamed from: q */
    public static String m50180q(byte[] bArr) {
        return jb6.m46415b(m50177n(bArr, false, true));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29392c(byte[] r10, int r11, int r12, p000.C3869az.C3870a r13) {
        /*
            r9 = this;
            boolean r0 = r13.f21090f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r12 >= 0) goto L_0x00b7
            r13.f21090f = r1
            int r10 = r13.f21092h
            if (r10 != 0) goto L_0x0014
            int r10 = r9.f21083e
            if (r10 != 0) goto L_0x0014
            return
        L_0x0014:
            int r10 = r9.f32868k
            byte[] r10 = r9.mo29395f(r10, r13)
            int r11 = r13.f21088d
            int r12 = r13.f21092h
            if (r12 == 0) goto L_0x0099
            if (r12 == r1) goto L_0x006f
            r1 = 2
            if (r12 != r1) goto L_0x0056
            int r12 = r11 + 1
            byte[] r2 = r9.f32864g
            int r3 = r13.f21085a
            int r4 = r3 >> 10
            r4 = r4 & 63
            byte r4 = r2[r4]
            r10[r11] = r4
            int r4 = r12 + 1
            int r5 = r3 >> 4
            r5 = r5 & 63
            byte r5 = r2[r5]
            r10[r12] = r5
            int r12 = r4 + 1
            r13.f21088d = r12
            int r1 = r3 << 2
            r1 = r1 & 63
            byte r1 = r2[r1]
            r10[r4] = r1
            byte[] r1 = f32861m
            if (r2 != r1) goto L_0x0099
            int r1 = r12 + 1
            r13.f21088d = r1
            byte r1 = r9.f21080b
            r10[r12] = r1
            goto L_0x0099
        L_0x0056:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            int r11 = r13.f21092h
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Impossible modulus "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x006f:
            int r12 = r11 + 1
            byte[] r1 = r9.f32864g
            int r2 = r13.f21085a
            int r3 = r2 >> 2
            r3 = r3 & 63
            byte r3 = r1[r3]
            r10[r11] = r3
            int r3 = r12 + 1
            r13.f21088d = r3
            int r2 = r2 << 4
            r2 = r2 & 63
            byte r2 = r1[r2]
            r10[r12] = r2
            byte[] r12 = f32861m
            if (r1 != r12) goto L_0x0099
            int r12 = r3 + 1
            byte r1 = r9.f21080b
            r10[r3] = r1
            int r2 = r12 + 1
            r13.f21088d = r2
            r10[r12] = r1
        L_0x0099:
            int r12 = r13.f21091g
            int r1 = r13.f21088d
            int r11 = r1 - r11
            int r12 = r12 + r11
            r13.f21091g = r12
            int r11 = r9.f21083e
            if (r11 <= 0) goto L_0x0124
            if (r12 <= 0) goto L_0x0124
            byte[] r11 = r9.f32866i
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r0, r10, r1, r12)
            int r10 = r13.f21088d
            byte[] r11 = r9.f32866i
            int r11 = r11.length
            int r10 = r10 + r11
            r13.f21088d = r10
            goto L_0x0124
        L_0x00b7:
            r2 = r0
        L_0x00b8:
            if (r2 >= r12) goto L_0x0124
            int r3 = r9.f32868k
            byte[] r3 = r9.mo29395f(r3, r13)
            int r4 = r13.f21092h
            int r4 = r4 + r1
            int r4 = r4 % 3
            r13.f21092h = r4
            int r5 = r11 + 1
            byte r11 = r10[r11]
            if (r11 >= 0) goto L_0x00cf
            int r11 = r11 + 256
        L_0x00cf:
            int r6 = r13.f21085a
            int r6 = r6 << 8
            int r6 = r6 + r11
            r13.f21085a = r6
            if (r4 != 0) goto L_0x0120
            int r11 = r13.f21088d
            int r4 = r11 + 1
            byte[] r7 = r9.f32864g
            int r8 = r6 >> 18
            r8 = r8 & 63
            byte r8 = r7[r8]
            r3[r11] = r8
            int r11 = r4 + 1
            int r8 = r6 >> 12
            r8 = r8 & 63
            byte r8 = r7[r8]
            r3[r4] = r8
            int r4 = r11 + 1
            int r8 = r6 >> 6
            r8 = r8 & 63
            byte r8 = r7[r8]
            r3[r11] = r8
            int r11 = r4 + 1
            r13.f21088d = r11
            r6 = r6 & 63
            byte r6 = r7[r6]
            r3[r4] = r6
            int r4 = r13.f21091g
            int r4 = r4 + 4
            r13.f21091g = r4
            int r6 = r9.f21083e
            if (r6 <= 0) goto L_0x0120
            if (r6 > r4) goto L_0x0120
            byte[] r4 = r9.f32866i
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r0, r3, r11, r6)
            int r11 = r13.f21088d
            byte[] r3 = r9.f32866i
            int r3 = r3.length
            int r11 = r11 + r3
            r13.f21088d = r11
            r13.f21091g = r0
        L_0x0120:
            int r2 = r2 + 1
            r11 = r5
            goto L_0x00b8
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6379px.mo29392c(byte[], int, int, az$a):void");
    }

    /* renamed from: i */
    public boolean mo29398i(byte b) {
        if (b >= 0) {
            byte[] bArr = this.f32865h;
            if (b >= bArr.length || bArr[b] == -1) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6379px(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.f32865h = f32863o;
        if (bArr == null) {
            this.f32868k = 4;
            this.f32866i = null;
        } else if (mo29391b(bArr)) {
            String c = jb6.m46416c(bArr);
            throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + c + "]");
        } else if (i > 0) {
            this.f32868k = bArr.length + 4;
            byte[] bArr2 = new byte[bArr.length];
            this.f32866i = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        } else {
            this.f32868k = 4;
            this.f32866i = null;
        }
        this.f32867j = this.f32868k - 1;
        this.f32864g = z ? f32862n : f32861m;
    }
}
