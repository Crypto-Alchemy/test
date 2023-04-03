package p000;

import java.nio.charset.Charset;

/* renamed from: jb6 */
/* compiled from: StringUtils */
public class jb6 {
    /* renamed from: a */
    public static String m46414a(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    /* renamed from: b */
    public static String m46415b(byte[] bArr) {
        return m46414a(bArr, Charset.forName("US-ASCII"));
    }

    /* renamed from: c */
    public static String m46416c(byte[] bArr) {
        return m46414a(bArr, Charset.forName("UTF-8"));
    }
}
