package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xa1 */
public final class xa1 implements yo7 {

    /* renamed from: c */
    public static final Map<String, xa1> f45854c;

    /* renamed from: a */
    public final int f45855a;

    /* renamed from: b */
    public final String f45856b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m73894b("SHA-256", 32, 16, 67, 10), new xa1(1, "XMSS_SHA2_10_256"));
        hashMap.put(m73894b("SHA-256", 32, 16, 67, 16), new xa1(2, "XMSS_SHA2_16_256"));
        hashMap.put(m73894b("SHA-256", 32, 16, 67, 20), new xa1(3, "XMSS_SHA2_20_256"));
        hashMap.put(m73894b("SHA-512", 64, 16, 131, 10), new xa1(4, "XMSS_SHA2_10_512"));
        hashMap.put(m73894b("SHA-512", 64, 16, 131, 16), new xa1(5, "XMSS_SHA2_16_512"));
        hashMap.put(m73894b("SHA-512", 64, 16, 131, 20), new xa1(6, "XMSS_SHA2_20_512"));
        hashMap.put(m73894b("SHAKE128", 32, 16, 67, 10), new xa1(7, "XMSS_SHAKE_10_256"));
        hashMap.put(m73894b("SHAKE128", 32, 16, 67, 16), new xa1(8, "XMSS_SHAKE_16_256"));
        hashMap.put(m73894b("SHAKE128", 32, 16, 67, 20), new xa1(9, "XMSS_SHAKE_20_256"));
        hashMap.put(m73894b("SHAKE256", 64, 16, 131, 10), new xa1(10, "XMSS_SHAKE_10_512"));
        hashMap.put(m73894b("SHAKE256", 64, 16, 131, 16), new xa1(11, "XMSS_SHAKE_16_512"));
        hashMap.put(m73894b("SHAKE256", 64, 16, 131, 20), new xa1(12, "XMSS_SHAKE_20_512"));
        f45854c = Collections.unmodifiableMap(hashMap);
    }

    public xa1(int i, String str) {
        this.f45855a = i;
        this.f45856b = str;
    }

    /* renamed from: b */
    public static String m73894b(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: c */
    public static xa1 m73895c(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return f45854c.get(m73894b(str, i, i2, i3, i4));
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: a */
    public int mo66669a() {
        return this.f45855a;
    }

    public String toString() {
        return this.f45856b;
    }
}
