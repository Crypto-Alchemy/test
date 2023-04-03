package p000;

import java.security.SecureRandom;

/* renamed from: y65 */
/* compiled from: Random */
public final class y65 {

    /* renamed from: a */
    public static final ThreadLocal<SecureRandom> f35776a = new C6715a();

    /* renamed from: y65$a */
    /* compiled from: Random */
    public class C6715a extends ThreadLocal<SecureRandom> {
        /* renamed from: a */
        public SecureRandom initialValue() {
            return y65.m54636b();
        }
    }

    /* renamed from: b */
    public static SecureRandom m54636b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    /* renamed from: c */
    public static byte[] m54637c(int i) {
        byte[] bArr = new byte[i];
        f35776a.get().nextBytes(bArr);
        return bArr;
    }
}
