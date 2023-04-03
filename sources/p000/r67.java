package p000;

import com.google.crypto.tink.internal.TinkBugException;
import java.security.SecureRandom;

/* renamed from: r67 */
/* compiled from: Util */
public final class r67 {
    /* renamed from: a */
    public static Integer m50954a() {
        return z40.m54983a();
    }

    /* renamed from: b */
    public static int m50955b() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b = 0;
        while (b == 0) {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b;
    }

    /* renamed from: c */
    public static final byte m50956c(char c) {
        if (c >= '!' && c <= '~') {
            return (byte) c;
        }
        throw new TinkBugException("Not a printable ASCII character: " + c);
    }

    /* renamed from: d */
    public static final e70 m50957d(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = m50956c(str.charAt(i));
        }
        return e70.m43803a(bArr);
    }
}
