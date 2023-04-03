package p000;

/* renamed from: kx */
/* compiled from: Base32 */
public class C7810kx {

    /* renamed from: a */
    public static final int[] f40540a = {255, 255, 26, 27, 28, 29, 30, 31, 255, 255, 255, 255, 255, 255, 255, 255, 255, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 255, 255, 255, 255, 255, 255, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 255, 255, 255, 255, 255};

    /* renamed from: a */
    public static byte[] m63632a(String str) {
        int i;
        int length = (str.length() * 5) / 8;
        byte[] bArr = new byte[length];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            int charAt = str.charAt(i4) - '0';
            if (charAt >= 0) {
                int[] iArr = f40540a;
                if (charAt < iArr.length && (i = iArr[charAt]) != 255) {
                    if (i2 <= 3) {
                        i2 = (i2 + 5) % 8;
                        if (i2 == 0) {
                            bArr[i3] = (byte) (i | bArr[i3]);
                            i3++;
                            if (i3 >= length) {
                                break;
                            }
                        } else {
                            bArr[i3] = (byte) ((i << (8 - i2)) | bArr[i3]);
                        }
                    } else {
                        i2 = (i2 + 5) % 8;
                        bArr[i3] = (byte) (bArr[i3] | (i >>> i2));
                        i3++;
                        if (i3 >= length) {
                            break;
                        }
                        bArr[i3] = (byte) ((i << (8 - i2)) | bArr[i3]);
                    }
                }
            }
        }
        return bArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m63633b(byte[] r7) {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            int r1 = r7.length
            int r1 = r1 + 7
            int r1 = r1 * 8
            int r1 = r1 / 5
            r0.<init>(r1)
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x000f:
            int r4 = r7.length
            if (r2 >= r4) goto L_0x004f
            byte r4 = r7[r2]
            if (r4 < 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            int r4 = r4 + 256
        L_0x0019:
            r5 = 3
            if (r3 <= r5) goto L_0x0038
            int r2 = r2 + 1
            int r5 = r7.length
            if (r2 >= r5) goto L_0x0029
            byte r5 = r7[r2]
            if (r5 < 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            int r5 = r5 + 256
            goto L_0x002a
        L_0x0029:
            r5 = r1
        L_0x002a:
            r6 = 255(0xff, float:3.57E-43)
            int r6 = r6 >> r3
            r4 = r4 & r6
            int r3 = r3 + 5
            int r3 = r3 % 8
            int r4 = r4 << r3
            int r6 = 8 - r3
            int r5 = r5 >> r6
            r4 = r4 | r5
            goto L_0x0045
        L_0x0038:
            int r3 = r3 + 5
            int r5 = 8 - r3
            int r4 = r4 >> r5
            r4 = r4 & 31
            int r3 = r3 % 8
            if (r3 != 0) goto L_0x0045
            int r2 = r2 + 1
        L_0x0045:
            java.lang.String r5 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"
            char r4 = r5.charAt(r4)
            r0.append(r4)
            goto L_0x000f
        L_0x004f:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7810kx.m63633b(byte[]):java.lang.String");
    }
}
