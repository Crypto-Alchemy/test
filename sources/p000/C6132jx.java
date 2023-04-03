package p000;

/* renamed from: jx */
/* compiled from: Base16 */
public class C6132jx {

    /* renamed from: a */
    public static String[] f30657a = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    /* renamed from: b */
    public static String[] f30658b = new String[256];

    static {
        for (int i = 0; i < 256; i++) {
            String[] strArr = f30658b;
            String[] strArr2 = f30657a;
            String str = strArr2[(i >> 4) & 15];
            String str2 = strArr2[i & 15];
            strArr[i] = str + str2;
        }
    }

    /* renamed from: a */
    public static String m46800a(byte b) {
        return f30658b[b & 255];
    }

    /* renamed from: b */
    public static String m46801b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte a : bArr) {
            sb.append(m46800a(a));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m46802c(byte[] bArr) {
        return m46801b(bArr);
    }
}
