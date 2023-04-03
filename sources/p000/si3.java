package p000;

/* renamed from: si3 */
public class si3 {
    /* renamed from: a */
    public static void m71950a(byte[] bArr, ig1 ig1) {
        ig1.update(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static void m71951b(short s, ig1 ig1) {
        ig1.mo51713b((byte) (s >>> 8));
        ig1.mo51713b((byte) s);
    }

    /* renamed from: c */
    public static void m71952c(int i, ig1 ig1) {
        ig1.mo51713b((byte) (i >>> 24));
        ig1.mo51713b((byte) (i >>> 16));
        ig1.mo51713b((byte) (i >>> 8));
        ig1.mo51713b((byte) i);
    }
}
