package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wa1 */
public final class wa1 implements yo7 {

    /* renamed from: c */
    public static final Map<String, wa1> f45484c;

    /* renamed from: a */
    public final int f45485a;

    /* renamed from: b */
    public final String f45486b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m73524b("SHA-256", 32, 16, 67, 20, 2), new wa1(1, "XMSSMT_SHA2_20/2_256"));
        hashMap.put(m73524b("SHA-256", 32, 16, 67, 20, 4), new wa1(2, "XMSSMT_SHA2_20/4_256"));
        hashMap.put(m73524b("SHA-256", 32, 16, 67, 40, 2), new wa1(3, "XMSSMT_SHA2_40/2_256"));
        hashMap.put(m73524b("SHA-256", 32, 16, 67, 40, 2), new wa1(4, "XMSSMT_SHA2_40/4_256"));
        hashMap.put(m73524b("SHA-256", 32, 16, 67, 40, 4), new wa1(5, "XMSSMT_SHA2_40/8_256"));
        hashMap.put(m73524b("SHA-256", 32, 16, 67, 60, 8), new wa1(6, "XMSSMT_SHA2_60/3_256"));
        hashMap.put(m73524b("SHA-256", 32, 16, 67, 60, 6), new wa1(7, "XMSSMT_SHA2_60/6_256"));
        hashMap.put(m73524b("SHA-256", 32, 16, 67, 60, 12), new wa1(8, "XMSSMT_SHA2_60/12_256"));
        hashMap.put(m73524b("SHA-512", 64, 16, 131, 20, 2), new wa1(9, "XMSSMT_SHA2_20/2_512"));
        hashMap.put(m73524b("SHA-512", 64, 16, 131, 20, 4), new wa1(10, "XMSSMT_SHA2_20/4_512"));
        hashMap.put(m73524b("SHA-512", 64, 16, 131, 40, 2), new wa1(11, "XMSSMT_SHA2_40/2_512"));
        hashMap.put(m73524b("SHA-512", 64, 16, 131, 40, 4), new wa1(12, "XMSSMT_SHA2_40/4_512"));
        hashMap.put(m73524b("SHA-512", 64, 16, 131, 40, 8), new wa1(13, "XMSSMT_SHA2_40/8_512"));
        hashMap.put(m73524b("SHA-512", 64, 16, 131, 60, 3), new wa1(14, "XMSSMT_SHA2_60/3_512"));
        hashMap.put(m73524b("SHA-512", 64, 16, 131, 60, 6), new wa1(15, "XMSSMT_SHA2_60/6_512"));
        hashMap.put(m73524b("SHA-512", 64, 16, 131, 60, 12), new wa1(16, "XMSSMT_SHA2_60/12_512"));
        hashMap.put(m73524b("SHAKE128", 32, 16, 67, 20, 2), new wa1(17, "XMSSMT_SHAKE_20/2_256"));
        hashMap.put(m73524b("SHAKE128", 32, 16, 67, 20, 4), new wa1(18, "XMSSMT_SHAKE_20/4_256"));
        hashMap.put(m73524b("SHAKE128", 32, 16, 67, 40, 2), new wa1(19, "XMSSMT_SHAKE_40/2_256"));
        hashMap.put(m73524b("SHAKE128", 32, 16, 67, 40, 4), new wa1(20, "XMSSMT_SHAKE_40/4_256"));
        hashMap.put(m73524b("SHAKE128", 32, 16, 67, 40, 8), new wa1(21, "XMSSMT_SHAKE_40/8_256"));
        hashMap.put(m73524b("SHAKE128", 32, 16, 67, 60, 3), new wa1(22, "XMSSMT_SHAKE_60/3_256"));
        hashMap.put(m73524b("SHAKE128", 32, 16, 67, 60, 6), new wa1(23, "XMSSMT_SHAKE_60/6_256"));
        hashMap.put(m73524b("SHAKE128", 32, 16, 67, 60, 12), new wa1(24, "XMSSMT_SHAKE_60/12_256"));
        hashMap.put(m73524b("SHAKE256", 64, 16, 131, 20, 2), new wa1(25, "XMSSMT_SHAKE_20/2_512"));
        hashMap.put(m73524b("SHAKE256", 64, 16, 131, 20, 4), new wa1(26, "XMSSMT_SHAKE_20/4_512"));
        hashMap.put(m73524b("SHAKE256", 64, 16, 131, 40, 2), new wa1(27, "XMSSMT_SHAKE_40/2_512"));
        hashMap.put(m73524b("SHAKE256", 64, 16, 131, 40, 4), new wa1(28, "XMSSMT_SHAKE_40/4_512"));
        hashMap.put(m73524b("SHAKE256", 64, 16, 131, 40, 8), new wa1(29, "XMSSMT_SHAKE_40/8_512"));
        hashMap.put(m73524b("SHAKE256", 64, 16, 131, 60, 3), new wa1(30, "XMSSMT_SHAKE_60/3_512"));
        hashMap.put(m73524b("SHAKE256", 64, 16, 131, 60, 6), new wa1(31, "XMSSMT_SHAKE_60/6_512"));
        hashMap.put(m73524b("SHAKE256", 64, 16, 131, 60, 12), new wa1(32, "XMSSMT_SHAKE_60/12_512"));
        f45484c = Collections.unmodifiableMap(hashMap);
    }

    public wa1(int i, String str) {
        this.f45485a = i;
        this.f45486b = str;
    }

    /* renamed from: b */
    public static String m73524b(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4 + "-" + i5;
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: c */
    public static wa1 m73525c(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return f45484c.get(m73524b(str, i, i2, i3, i4, i5));
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: a */
    public int mo66669a() {
        return this.f45485a;
    }

    public String toString() {
        return this.f45486b;
    }
}
