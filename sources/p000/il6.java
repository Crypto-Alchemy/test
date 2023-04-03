package p000;

import java.util.Random;

/* renamed from: il6 */
/* compiled from: TOTPData */
public final class il6 {

    /* renamed from: d */
    public static final char[] f38403d = "0123456789ABCDEF".toCharArray();

    /* renamed from: e */
    public static final Random f38404e = new Random();

    /* renamed from: a */
    public final String f38405a;

    /* renamed from: b */
    public final String f38406b;

    /* renamed from: c */
    public final byte[] f38407c;

    public il6(String str, String str2, byte[] bArr) {
        this.f38405a = str;
        this.f38406b = str2;
        this.f38407c = bArr;
    }

    /* renamed from: a */
    public static byte[] m58998a() {
        byte[] bArr = new byte[20];
        f38404e.nextBytes(bArr);
        return bArr;
    }

    /* renamed from: b */
    public String mo52496b() {
        return C7810kx.m63633b(this.f38407c);
    }

    /* renamed from: c */
    public String mo52497c() {
        String b = mo52496b();
        String str = this.f38405a;
        return String.format("otpauth://totp/%s:%s?secret=%s&issuer=%s", new Object[]{str, this.f38406b, b, str});
    }
}
