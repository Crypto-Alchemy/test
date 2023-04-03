package p000;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: z65 */
/* compiled from: RandomFidGenerator */
public class z65 {

    /* renamed from: a */
    public static final byte f35994a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f35995b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    public static String m54991b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    public static byte[] m54992c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String mo49799a() {
        byte[] c = m54992c(UUID.randomUUID(), new byte[17]);
        byte b = c[0];
        c[16] = b;
        c[0] = (byte) ((b & f35995b) | f35994a);
        return m54991b(c);
    }
}
