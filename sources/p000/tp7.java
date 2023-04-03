package p000;

import kotlin.Metadata;
import okio.ByteString;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\r\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000\" \u0010\n\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\" \u0010\r\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, mo44877d2 = {"", "", "a", "map", "b", "[B", "getBASE64", "()[B", "getBASE64$annotations", "()V", "BASE64", "d", "getBASE64_URL_SAFE$annotations", "BASE64_URL_SAFE", "okio"}, mo44878k = 2, mo44879mv = {1, 5, 1})
/* renamed from: tp7 */
/* compiled from: -Base64.kt */
public final class tp7 {

    /* renamed from: a */
    public static final byte[] f44802a;

    /* renamed from: b */
    public static final byte[] f44803b;

    static {
        ByteString.C9034a aVar = ByteString.Companion;
        f44802a = aVar.mo64480d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        f44803b = aVar.mo64480d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b7 A[LOOP:1: B:13:0x003d->B:57:0x00b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00b3 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m72408a(java.lang.String r17) {
        /*
            r0 = r17
            java.lang.String r1 = "<this>"
            p000.vx2.m53591g(r0, r1)
            int r1 = r17.length()
        L_0x000b:
            r2 = 9
            r3 = 32
            r4 = 13
            r5 = 10
            if (r1 <= 0) goto L_0x002b
            int r6 = r1 + -1
            char r6 = r0.charAt(r6)
            r7 = 61
            if (r6 == r7) goto L_0x0028
            if (r6 == r5) goto L_0x0028
            if (r6 == r4) goto L_0x0028
            if (r6 == r3) goto L_0x0028
            if (r6 == r2) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            int r1 = r1 + -1
            goto L_0x000b
        L_0x002b:
            long r6 = (long) r1
            r8 = 6
            long r6 = r6 * r8
            r8 = 8
            long r6 = r6 / r8
            int r6 = (int) r6
            byte[] r7 = new byte[r6]
            r8 = 0
            r10 = 1
            if (r1 <= 0) goto L_0x00b9
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x003d:
            int r15 = r11 + 1
            char r11 = r0.charAt(r11)
            r9 = 65
            if (r9 > r11) goto L_0x004d
            r9 = 90
            if (r11 > r9) goto L_0x004d
            r9 = r10
            goto L_0x004e
        L_0x004d:
            r9 = 0
        L_0x004e:
            if (r9 == 0) goto L_0x0053
            int r11 = r11 + -65
            goto L_0x0094
        L_0x0053:
            r9 = 97
            if (r9 > r11) goto L_0x005d
            r9 = 122(0x7a, float:1.71E-43)
            if (r11 > r9) goto L_0x005d
            r9 = r10
            goto L_0x005e
        L_0x005d:
            r9 = 0
        L_0x005e:
            if (r9 == 0) goto L_0x0063
            int r11 = r11 + -71
            goto L_0x0094
        L_0x0063:
            r9 = 48
            if (r9 > r11) goto L_0x006d
            r9 = 57
            if (r11 > r9) goto L_0x006d
            r9 = r10
            goto L_0x006e
        L_0x006d:
            r9 = 0
        L_0x006e:
            if (r9 == 0) goto L_0x0073
            int r11 = r11 + 4
            goto L_0x0094
        L_0x0073:
            r9 = 43
            if (r11 == r9) goto L_0x0092
            r9 = 45
            if (r11 != r9) goto L_0x007c
            goto L_0x0092
        L_0x007c:
            r9 = 47
            if (r11 == r9) goto L_0x008f
            r9 = 95
            if (r11 != r9) goto L_0x0085
            goto L_0x008f
        L_0x0085:
            if (r11 == r5) goto L_0x00b1
            if (r11 == r4) goto L_0x00b1
            if (r11 == r3) goto L_0x00b1
            if (r11 != r2) goto L_0x008e
            goto L_0x00b1
        L_0x008e:
            return r8
        L_0x008f:
            r11 = 63
            goto L_0x0094
        L_0x0092:
            r11 = 62
        L_0x0094:
            int r9 = r14 << 6
            r14 = r9 | r11
            int r13 = r13 + 1
            int r9 = r13 % 4
            if (r9 != 0) goto L_0x00b1
            int r9 = r12 + 1
            int r11 = r14 >> 16
            byte r11 = (byte) r11
            r7[r12] = r11
            int r11 = r9 + 1
            int r12 = r14 >> 8
            byte r12 = (byte) r12
            r7[r9] = r12
            int r12 = r11 + 1
            byte r9 = (byte) r14
            r7[r11] = r9
        L_0x00b1:
            if (r15 < r1) goto L_0x00b7
            r9 = r13
            r16 = r14
            goto L_0x00bd
        L_0x00b7:
            r11 = r15
            goto L_0x003d
        L_0x00b9:
            r9 = 0
            r12 = 0
            r16 = 0
        L_0x00bd:
            int r9 = r9 % 4
            if (r9 == r10) goto L_0x00f0
            r0 = 2
            if (r9 == r0) goto L_0x00d9
            r0 = 3
            if (r9 == r0) goto L_0x00c8
            goto L_0x00e3
        L_0x00c8:
            int r0 = r16 << 6
            int r1 = r12 + 1
            int r2 = r0 >> 16
            byte r2 = (byte) r2
            r7[r12] = r2
            int r12 = r1 + 1
            int r0 = r0 >> 8
            byte r0 = (byte) r0
            r7[r1] = r0
            goto L_0x00e3
        L_0x00d9:
            int r0 = r16 << 12
            int r1 = r12 + 1
            int r0 = r0 >> 16
            byte r0 = (byte) r0
            r7[r12] = r0
            r12 = r1
        L_0x00e3:
            if (r12 != r6) goto L_0x00e6
            return r7
        L_0x00e6:
            byte[] r0 = java.util.Arrays.copyOf(r7, r12)
            java.lang.String r1 = "java.util.Arrays.copyOf(this, newSize)"
            p000.vx2.m53590f(r0, r1)
            return r0
        L_0x00f0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tp7.m72408a(java.lang.String):byte[]");
    }

    /* renamed from: b */
    public static final String m72409b(byte[] bArr, byte[] bArr2) {
        vx2.m53591g(bArr, "<this>");
        vx2.m53591g(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i10] = b5;
            bArr3[i10 + 1] = b5;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i11];
            int i12 = i2 + 1;
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i13] = bArr2[(b7 & 15) << 2];
            bArr3[i13 + 1] = (byte) 61;
        }
        return wp7.m73730b(bArr3);
    }

    /* renamed from: c */
    public static /* synthetic */ String m72410c(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = f44802a;
        }
        return m72409b(bArr, bArr2);
    }

    /* renamed from: d */
    public static final byte[] m72411d() {
        return f44803b;
    }
}
