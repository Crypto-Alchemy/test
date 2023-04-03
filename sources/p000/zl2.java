package p000;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.util.encoders.DecoderException;
import org.bouncycastle.util.encoders.EncoderException;

/* renamed from: zl2 */
public class zl2 {

    /* renamed from: a */
    public static final bm2 f46414a = new bm2();

    /* renamed from: a */
    public static byte[] m75083a(String str) {
        try {
            return f46414a.mo50656d(str, 0, str.length());
        } catch (Exception e) {
            throw new DecoderException("exception decoding Hex string: " + e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public static byte[] m75084b(byte[] bArr) {
        return m75085c(bArr, 0, bArr.length);
    }

    /* renamed from: c */
    public static byte[] m75085c(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f46414a.mo50654b(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding Hex string: " + e.getMessage(), e);
        }
    }
}
