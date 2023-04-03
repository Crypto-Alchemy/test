package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: rx */
/* compiled from: Base64 */
public class C9287rx {

    /* renamed from: a */
    public static final byte[] f44474a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    public static final byte[] f44475b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: c */
    public static final byte[] f44476c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: d */
    public static final byte[] f44477d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: e */
    public static final byte[] f44478e = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: f */
    public static final byte[] f44479f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: d */
    public static int m71686d(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        if (bArr == null) {
            throw new IllegalArgumentException("Source array was null.");
        } else if (bArr2 == null) {
            throw new IllegalArgumentException("Destination array was null.");
        } else if (i < 0 || (i4 = i + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i)}));
        } else if (i2 < 0 || (i5 = i2 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i2)}));
        } else {
            byte[] k = m71693k(i3);
            byte b = bArr[i + 2];
            if (b == 61) {
                bArr2[i2] = (byte) ((((k[bArr[i + 1]] & 255) << 12) | ((k[bArr[i]] & 255) << 18)) >>> 16);
                return 1;
            }
            byte b2 = bArr[i4];
            if (b2 == 61) {
                int i6 = ((k[bArr[i + 1]] & 255) << 12) | ((k[bArr[i]] & 255) << 18) | ((k[b] & 255) << 6);
                bArr2[i2] = (byte) (i6 >>> 16);
                bArr2[i2 + 1] = (byte) (i6 >>> 8);
                return 2;
            }
            byte b3 = ((k[bArr[i + 1]] & 255) << 12) | ((k[bArr[i]] & 255) << 18) | ((k[b] & 255) << 6) | (k[b2] & 255);
            bArr2[i2] = (byte) (b3 >> 16);
            bArr2[i2 + 1] = (byte) (b3 >> 8);
            bArr2[i5] = (byte) b3;
            return 3;
        }
    }

    /* renamed from: e */
    public static byte[] m71687e(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        byte[] j = m71692j(i4);
        int i7 = 0;
        if (i2 > 0) {
            i5 = (bArr[i] << 24) >>> 8;
        } else {
            i5 = 0;
        }
        if (i2 > 1) {
            i6 = (bArr[i + 1] << 24) >>> 16;
        } else {
            i6 = 0;
        }
        int i8 = i5 | i6;
        if (i2 > 2) {
            i7 = (bArr[i + 2] << 24) >>> 24;
        }
        int i9 = i8 | i7;
        if (i2 == 1) {
            bArr2[i3] = j[i9 >>> 18];
            bArr2[i3 + 1] = j[(i9 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 == 2) {
            bArr2[i3] = j[i9 >>> 18];
            bArr2[i3 + 1] = j[(i9 >>> 12) & 63];
            bArr2[i3 + 2] = j[(i9 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 != 3) {
            return bArr2;
        } else {
            bArr2[i3] = j[i9 >>> 18];
            bArr2[i3 + 1] = j[(i9 >>> 12) & 63];
            bArr2[i3 + 2] = j[(i9 >>> 6) & 63];
            bArr2[i3 + 3] = j[i9 & 63];
            return bArr2;
        }
    }

    /* renamed from: f */
    public static byte[] m71688f(byte[] bArr, byte[] bArr2, int i, int i2) {
        m71687e(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: g */
    public static String m71689g(byte[] bArr) {
        try {
            return m71690h(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m71690h(byte[] bArr, int i, int i2, int i3) throws IOException {
        byte[] i4 = m71691i(bArr, i, i2, i3);
        try {
            return new String(i4, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(i4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:13|14|15|16|17|18|19|20|21|22|23|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:31|32|45|46|47|48|49|50|51) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0031 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x005b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x005e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m71691i(byte[] r18, int r19, int r20, int r21) throws java.io.IOException {
        /*
            r0 = r18
            r7 = r19
            r8 = r20
            if (r0 == 0) goto L_0x0120
            if (r7 < 0) goto L_0x0109
            if (r8 < 0) goto L_0x00f2
            int r1 = r7 + r8
            int r2 = r0.length
            r9 = 1
            if (r1 > r2) goto L_0x00ce
            r1 = r21 & 2
            if (r1 == 0) goto L_0x0062
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0051, all -> 0x004d }
            r2.<init>()     // Catch:{ IOException -> 0x0051, all -> 0x004d }
            rx$a r3 = new rx$a     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            r4 = r21 | 1
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x0048, all -> 0x0045 }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            r4.write(r0, r7, r8)     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            r4.close()     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            r4.close()     // Catch:{ Exception -> 0x0031 }
        L_0x0031:
            r3.close()     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            r2.close()     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            byte[] r0 = r2.toByteArray()
            return r0
        L_0x003c:
            r0 = move-exception
            goto L_0x0057
        L_0x003e:
            r0 = move-exception
            goto L_0x004b
        L_0x0040:
            r0 = move-exception
            goto L_0x0058
        L_0x0042:
            r0 = move-exception
            r4 = r1
            goto L_0x004b
        L_0x0045:
            r0 = move-exception
            r3 = r1
            goto L_0x0058
        L_0x0048:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x004b:
            r1 = r2
            goto L_0x0054
        L_0x004d:
            r0 = move-exception
            r2 = r1
            r3 = r2
            goto L_0x0058
        L_0x0051:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x0054:
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            r2 = r1
        L_0x0057:
            r1 = r4
        L_0x0058:
            r1.close()     // Catch:{ Exception -> 0x005b }
        L_0x005b:
            r3.close()     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            r2.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            throw r0
        L_0x0062:
            r1 = r21 & 8
            if (r1 == 0) goto L_0x0068
            r11 = r9
            goto L_0x0069
        L_0x0068:
            r11 = 0
        L_0x0069:
            int r1 = r8 / 3
            r12 = 4
            int r1 = r1 * r12
            int r2 = r8 % 3
            if (r2 <= 0) goto L_0x0073
            r2 = r12
            goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            int r1 = r1 + r2
            if (r11 == 0) goto L_0x007a
            int r2 = r1 / 76
            int r1 = r1 + r2
        L_0x007a:
            r13 = r1
            byte[] r14 = new byte[r13]
            int r15 = r8 + -2
            r6 = 0
            r16 = 0
            r17 = 0
        L_0x0084:
            if (r6 >= r15) goto L_0x00ae
            int r2 = r6 + r7
            r3 = 3
            r1 = r18
            r4 = r14
            r5 = r16
            r10 = r6
            r6 = r21
            m71687e(r1, r2, r3, r4, r5, r6)
            int r1 = r17 + 4
            if (r11 == 0) goto L_0x00a7
            r2 = 76
            if (r1 < r2) goto L_0x00a7
            int r1 = r16 + 4
            r2 = 10
            r14[r1] = r2
            int r16 = r16 + 1
            r17 = 0
            goto L_0x00a9
        L_0x00a7:
            r17 = r1
        L_0x00a9:
            int r6 = r10 + 3
            int r16 = r16 + 4
            goto L_0x0084
        L_0x00ae:
            r10 = r6
            if (r10 >= r8) goto L_0x00c1
            int r2 = r10 + r7
            int r3 = r8 - r10
            r1 = r18
            r4 = r14
            r5 = r16
            r6 = r21
            m71687e(r1, r2, r3, r4, r5, r6)
            int r16 = r16 + 4
        L_0x00c1:
            r0 = r16
            int r13 = r13 - r9
            if (r0 > r13) goto L_0x00cd
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.System.arraycopy(r14, r2, r1, r2, r0)
            return r1
        L_0x00cd:
            return r14
        L_0x00ce:
            r2 = 0
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r3[r2] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r3[r9] = r2
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 2
            r3[r2] = r0
            java.lang.String r0 = "Cannot have offset of %d and length of %d with array of length %d"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x00f2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have length offset: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0109:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have negative offset: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0120:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot serialize a null array."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9287rx.m71691i(byte[], int, int, int):byte[]");
    }

    /* renamed from: j */
    public static final byte[] m71692j(int i) {
        if ((i & 16) == 16) {
            return f44476c;
        }
        if ((i & 32) == 32) {
            return f44478e;
        }
        return f44474a;
    }

    /* renamed from: k */
    public static final byte[] m71693k(int i) {
        if ((i & 16) == 16) {
            return f44477d;
        }
        if ((i & 32) == 32) {
            return f44479f;
        }
        return f44475b;
    }

    /* renamed from: rx$a */
    /* compiled from: Base64 */
    public static class C9288a extends FilterOutputStream {

        /* renamed from: A */
        public byte[] f44480A;

        /* renamed from: a */
        public boolean f44481a;

        /* renamed from: d */
        public int f44482d;

        /* renamed from: e */
        public byte[] f44483e;

        /* renamed from: g */
        public int f44484g;

        /* renamed from: k */
        public int f44485k;

        /* renamed from: r */
        public boolean f44486r;

        /* renamed from: s */
        public byte[] f44487s;

        /* renamed from: x */
        public boolean f44488x;

        /* renamed from: y */
        public int f44489y;

        public C9288a(OutputStream outputStream, int i) {
            super(outputStream);
            boolean z;
            int i2;
            boolean z2 = true;
            if ((i & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f44486r = z;
            z2 = (i & 1) == 0 ? false : z2;
            this.f44481a = z2;
            if (z2) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            this.f44484g = i2;
            this.f44483e = new byte[i2];
            this.f44482d = 0;
            this.f44485k = 0;
            this.f44488x = false;
            this.f44487s = new byte[4];
            this.f44489y = i;
            this.f44480A = C9287rx.m71693k(i);
        }

        /* renamed from: a */
        public void mo65763a() throws IOException {
            int i = this.f44482d;
            if (i <= 0) {
                return;
            }
            if (this.f44481a) {
                this.out.write(C9287rx.m71688f(this.f44487s, this.f44483e, i, this.f44489y));
                this.f44482d = 0;
                return;
            }
            throw new IOException("Base64 input not properly padded.");
        }

        public void close() throws IOException {
            mo65763a();
            super.close();
            this.f44483e = null;
            this.out = null;
        }

        public void write(int i) throws IOException {
            if (this.f44488x) {
                this.out.write(i);
            } else if (this.f44481a) {
                byte[] bArr = this.f44483e;
                int i2 = this.f44482d;
                int i3 = i2 + 1;
                this.f44482d = i3;
                bArr[i2] = (byte) i;
                int i4 = this.f44484g;
                if (i3 >= i4) {
                    this.out.write(C9287rx.m71688f(this.f44487s, bArr, i4, this.f44489y));
                    int i5 = this.f44485k + 4;
                    this.f44485k = i5;
                    if (this.f44486r && i5 >= 76) {
                        this.out.write(10);
                        this.f44485k = 0;
                    }
                    this.f44482d = 0;
                }
            } else {
                byte b = this.f44480A[i & 127];
                if (b > -5) {
                    byte[] bArr2 = this.f44483e;
                    int i6 = this.f44482d;
                    int i7 = i6 + 1;
                    this.f44482d = i7;
                    bArr2[i6] = (byte) i;
                    if (i7 >= this.f44484g) {
                        this.out.write(this.f44487s, 0, C9287rx.m71686d(bArr2, 0, this.f44487s, 0, this.f44489y));
                        this.f44482d = 0;
                    }
                } else if (b != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
            }
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.f44488x) {
                this.out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }
}
