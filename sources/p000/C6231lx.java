package p000;

/* renamed from: lx */
/* compiled from: Base32 */
public class C6231lx extends C3869az {

    /* renamed from: l */
    public static final byte[] f31430l = {13, 10};

    /* renamed from: m */
    public static final byte[] f31431m = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

    /* renamed from: n */
    public static final byte[] f31432n = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};

    /* renamed from: o */
    public static final byte[] f31433o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

    /* renamed from: p */
    public static final byte[] f31434p = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};

    /* renamed from: g */
    public final int f31435g;

    /* renamed from: h */
    public final byte[] f31436h;

    /* renamed from: i */
    public final int f31437i;

    /* renamed from: j */
    public final byte[] f31438j;

    /* renamed from: k */
    public final byte[] f31439k;

    public C6231lx() {
        this(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29392c(byte[] r17, int r18, int r19, p000.C3869az.C3870a r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r20
            boolean r3 = r2.f21090f
            if (r3 == 0) goto L_0x000b
            return
        L_0x000b:
            r3 = 0
            r4 = 1
            if (r1 >= 0) goto L_0x019e
            r2.f21090f = r4
            int r1 = r2.f21092h
            if (r1 != 0) goto L_0x001a
            int r1 = r0.f21083e
            if (r1 != 0) goto L_0x001a
            return
        L_0x001a:
            int r1 = r0.f31437i
            byte[] r1 = r0.mo29395f(r1, r2)
            int r5 = r2.f21088d
            int r6 = r2.f21092h
            if (r6 == 0) goto L_0x017f
            r7 = 3
            r8 = 2
            if (r6 == r4) goto L_0x0149
            r9 = 4
            if (r6 == r8) goto L_0x0101
            if (r6 == r7) goto L_0x00ae
            if (r6 != r9) goto L_0x0095
            int r4 = r5 + 1
            byte[] r6 = r0.f31438j
            long r9 = r2.f21086b
            r11 = 27
            long r11 = r9 >> r11
            int r11 = (int) r11
            r11 = r11 & 31
            byte r11 = r6[r11]
            r1[r5] = r11
            int r11 = r4 + 1
            r12 = 22
            long r12 = r9 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r6[r12]
            r1[r4] = r12
            int r4 = r11 + 1
            r12 = 17
            long r12 = r9 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r6[r12]
            r1[r11] = r12
            int r11 = r4 + 1
            r12 = 12
            long r12 = r9 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r6[r12]
            r1[r4] = r12
            int r4 = r11 + 1
            r12 = 7
            long r12 = r9 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r6[r12]
            r1[r11] = r12
            int r11 = r4 + 1
            long r12 = r9 >> r8
            int r8 = (int) r12
            r8 = r8 & 31
            byte r8 = r6[r8]
            r1[r4] = r8
            int r4 = r11 + 1
            long r7 = r9 << r7
            int r7 = (int) r7
            r7 = r7 & 31
            byte r6 = r6[r7]
            r1[r11] = r6
            int r6 = r4 + 1
            r2.f21088d = r6
            byte r6 = r0.f21080b
            r1[r4] = r6
            goto L_0x017f
        L_0x0095:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r2 = r2.f21092h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Impossible modulus "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x00ae:
            int r6 = r5 + 1
            byte[] r7 = r0.f31438j
            long r10 = r2.f21086b
            r8 = 19
            long r12 = r10 >> r8
            int r8 = (int) r12
            r8 = r8 & 31
            byte r8 = r7[r8]
            r1[r5] = r8
            int r8 = r6 + 1
            r12 = 14
            long r12 = r10 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r7[r12]
            r1[r6] = r12
            int r6 = r8 + 1
            r12 = 9
            long r12 = r10 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r7[r12]
            r1[r8] = r12
            int r8 = r6 + 1
            long r12 = r10 >> r9
            int r9 = (int) r12
            r9 = r9 & 31
            byte r9 = r7[r9]
            r1[r6] = r9
            int r6 = r8 + 1
            long r9 = r10 << r4
            int r4 = (int) r9
            r4 = r4 & 31
            byte r4 = r7[r4]
            r1[r8] = r4
            int r4 = r6 + 1
            byte r7 = r0.f21080b
            r1[r6] = r7
            int r6 = r4 + 1
            r1[r4] = r7
            int r4 = r6 + 1
            r2.f21088d = r4
            r1[r6] = r7
            goto L_0x017f
        L_0x0101:
            int r6 = r5 + 1
            byte[] r7 = r0.f31438j
            long r10 = r2.f21086b
            r8 = 11
            long r12 = r10 >> r8
            int r8 = (int) r12
            r8 = r8 & 31
            byte r8 = r7[r8]
            r1[r5] = r8
            int r8 = r6 + 1
            r12 = 6
            long r12 = r10 >> r12
            int r12 = (int) r12
            r12 = r12 & 31
            byte r12 = r7[r12]
            r1[r6] = r12
            int r6 = r8 + 1
            long r12 = r10 >> r4
            int r4 = (int) r12
            r4 = r4 & 31
            byte r4 = r7[r4]
            r1[r8] = r4
            int r4 = r6 + 1
            long r8 = r10 << r9
            int r8 = (int) r8
            r8 = r8 & 31
            byte r7 = r7[r8]
            r1[r6] = r7
            int r6 = r4 + 1
            byte r7 = r0.f21080b
            r1[r4] = r7
            int r4 = r6 + 1
            r1[r6] = r7
            int r6 = r4 + 1
            r1[r4] = r7
            int r4 = r6 + 1
            r2.f21088d = r4
            r1[r6] = r7
            goto L_0x017f
        L_0x0149:
            int r4 = r5 + 1
            byte[] r6 = r0.f31438j
            long r9 = r2.f21086b
            long r11 = r9 >> r7
            int r7 = (int) r11
            r7 = r7 & 31
            byte r7 = r6[r7]
            r1[r5] = r7
            int r7 = r4 + 1
            long r8 = r9 << r8
            int r8 = (int) r8
            r8 = r8 & 31
            byte r6 = r6[r8]
            r1[r4] = r6
            int r4 = r7 + 1
            byte r6 = r0.f21080b
            r1[r7] = r6
            int r7 = r4 + 1
            r1[r4] = r6
            int r4 = r7 + 1
            r1[r7] = r6
            int r7 = r4 + 1
            r1[r4] = r6
            int r4 = r7 + 1
            r1[r7] = r6
            int r7 = r4 + 1
            r2.f21088d = r7
            r1[r4] = r6
        L_0x017f:
            int r4 = r2.f21091g
            int r6 = r2.f21088d
            int r5 = r6 - r5
            int r4 = r4 + r5
            r2.f21091g = r4
            int r5 = r0.f21083e
            if (r5 <= 0) goto L_0x0255
            if (r4 <= 0) goto L_0x0255
            byte[] r4 = r0.f31439k
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r3, r1, r6, r5)
            int r1 = r2.f21088d
            byte[] r3 = r0.f31439k
            int r3 = r3.length
            int r1 = r1 + r3
            r2.f21088d = r1
            goto L_0x0255
        L_0x019e:
            r5 = r18
            r6 = r3
        L_0x01a1:
            if (r6 >= r1) goto L_0x0255
            int r7 = r0.f31437i
            byte[] r7 = r0.mo29395f(r7, r2)
            int r8 = r2.f21092h
            int r8 = r8 + r4
            r9 = 5
            int r8 = r8 % r9
            r2.f21092h = r8
            int r10 = r5 + 1
            byte r5 = r17[r5]
            if (r5 >= 0) goto L_0x01b8
            int r5 = r5 + 256
        L_0x01b8:
            long r11 = r2.f21086b
            r13 = 8
            long r11 = r11 << r13
            long r14 = (long) r5
            long r11 = r11 + r14
            r2.f21086b = r11
            if (r8 != 0) goto L_0x024c
            int r5 = r2.f21088d
            int r8 = r5 + 1
            byte[] r14 = r0.f31438j
            r15 = 35
            long r3 = r11 >> r15
            int r3 = (int) r3
            r3 = r3 & 31
            byte r3 = r14[r3]
            r7[r5] = r3
            int r3 = r8 + 1
            r4 = 30
            long r4 = r11 >> r4
            int r4 = (int) r4
            r4 = r4 & 31
            byte r4 = r14[r4]
            r7[r8] = r4
            int r4 = r3 + 1
            r5 = 25
            r8 = r10
            long r9 = r11 >> r5
            int r5 = (int) r9
            r5 = r5 & 31
            byte r5 = r14[r5]
            r7[r3] = r5
            int r3 = r4 + 1
            r5 = 20
            long r9 = r11 >> r5
            int r5 = (int) r9
            r5 = r5 & 31
            byte r5 = r14[r5]
            r7[r4] = r5
            int r4 = r3 + 1
            r5 = 15
            long r9 = r11 >> r5
            int r5 = (int) r9
            r5 = r5 & 31
            byte r5 = r14[r5]
            r7[r3] = r5
            int r3 = r4 + 1
            r5 = 10
            long r9 = r11 >> r5
            int r5 = (int) r9
            r5 = r5 & 31
            byte r5 = r14[r5]
            r7[r4] = r5
            int r4 = r3 + 1
            r5 = 5
            long r9 = r11 >> r5
            int r5 = (int) r9
            r5 = r5 & 31
            byte r5 = r14[r5]
            r7[r3] = r5
            int r3 = r4 + 1
            r2.f21088d = r3
            int r5 = (int) r11
            r5 = r5 & 31
            byte r5 = r14[r5]
            r7[r4] = r5
            int r4 = r2.f21091g
            int r4 = r4 + r13
            r2.f21091g = r4
            int r5 = r0.f21083e
            if (r5 <= 0) goto L_0x024a
            if (r5 > r4) goto L_0x024a
            byte[] r4 = r0.f31439k
            int r5 = r4.length
            r9 = 0
            java.lang.System.arraycopy(r4, r9, r7, r3, r5)
            int r3 = r2.f21088d
            byte[] r4 = r0.f31439k
            int r4 = r4.length
            int r3 = r3 + r4
            r2.f21088d = r3
            r2.f21091g = r9
            goto L_0x024e
        L_0x024a:
            r9 = 0
            goto L_0x024e
        L_0x024c:
            r9 = r3
            r8 = r10
        L_0x024e:
            int r6 = r6 + 1
            r5 = r8
            r3 = r9
            r4 = 1
            goto L_0x01a1
        L_0x0255:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6231lx.mo29392c(byte[], int, int, az$a):void");
    }

    /* renamed from: i */
    public boolean mo29398i(byte b) {
        if (b >= 0) {
            byte[] bArr = this.f31436h;
            if (b >= bArr.length || bArr[b] == -1) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C6231lx(boolean z) {
        this(0, (byte[]) null, z, (byte) 61);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6231lx(int i, byte[] bArr, boolean z, byte b) {
        super(5, 8, i, bArr == null ? 0 : bArr.length, b);
        if (z) {
            this.f31438j = f31434p;
            this.f31436h = f31433o;
        } else {
            this.f31438j = f31432n;
            this.f31436h = f31431m;
        }
        if (i <= 0) {
            this.f31437i = 8;
            this.f31439k = null;
        } else if (bArr == null) {
            throw new IllegalArgumentException("lineLength " + i + " > 0, but lineSeparator is null");
        } else if (!mo29391b(bArr)) {
            this.f31437i = bArr.length + 8;
            byte[] bArr2 = new byte[bArr.length];
            this.f31439k = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        } else {
            String c = jb6.m46416c(bArr);
            throw new IllegalArgumentException("lineSeparator must not contain Base32 characters: [" + c + "]");
        }
        this.f31435g = this.f31437i - 1;
        if (mo29398i(b) || C3869az.m32299j(b)) {
            throw new IllegalArgumentException("pad must not be in alphabet or whitespace");
        }
    }
}
