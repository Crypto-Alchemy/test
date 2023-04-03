package p000;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.util.encoders.DecoderException;
import org.bouncycastle.util.encoders.EncoderException;

/* renamed from: qx */
public class C9223qx {

    /* renamed from: a */
    public static final mp1 f44250a = new C9371tx();

    /* renamed from: a */
    public static byte[] m71364a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            f44250a.mo50655c(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("unable to decode base64 string: " + e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public static byte[] m71365b(byte[] bArr, int i, int i2) {
        mp1 mp1 = f44250a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(mp1.mo50653a(i2));
        try {
            mp1.mo50654b(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding base64 string: " + e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public static String m71366c(byte[] bArr) {
        return m71367d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public static String m71367d(byte[] bArr, int i, int i2) {
        return ob6.m70223b(m71365b(bArr, i, i2));
    }
}
