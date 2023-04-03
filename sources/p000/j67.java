package p000;

/* renamed from: j67 */
/* compiled from: utfEncoding.kt */
public final class j67 {
    /* renamed from: a */
    public static final byte[] m59266a(String[] strArr) {
        vx2.m53591g(strArr, "strings");
        int i = 0;
        for (String length : strArr) {
            i += length.length();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (String str : strArr) {
            int length2 = str.length();
            int i3 = 0;
            while (i3 < length2) {
                bArr[i2] = (byte) str.charAt(i3);
                i3++;
                i2++;
            }
        }
        return bArr;
    }
}
