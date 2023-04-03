package p000;

/* renamed from: p */
/* compiled from: AKTCoinKAT */
public class C3019p {
    /* renamed from: a */
    public static byte[] m24453a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
