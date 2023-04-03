package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wf7 */
public final class wf7 implements yo7 {

    /* renamed from: c */
    public static final Map<String, wf7> f45513c;

    /* renamed from: a */
    public final int f45514a;

    /* renamed from: b */
    public final String f45515b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m73593b("SHA-256", 32, 16, 67), new wf7(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(m73593b("SHA-512", 64, 16, 131), new wf7(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(m73593b("SHAKE128", 32, 16, 67), new wf7(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(m73593b("SHAKE256", 64, 16, 131), new wf7(67108868, "WOTSP_SHAKE256_W16"));
        f45513c = Collections.unmodifiableMap(hashMap);
    }

    public wf7(int i, String str) {
        this.f45514a = i;
        this.f45515b = str;
    }

    /* renamed from: b */
    public static String m73593b(String str, int i, int i2, int i3) {
        if (str != null) {
            return str + "-" + i + "-" + i2 + "-" + i3;
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: c */
    public static wf7 m73594c(String str, int i, int i2, int i3) {
        if (str != null) {
            return f45513c.get(m73593b(str, i, i2, i3));
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: a */
    public int mo66669a() {
        return this.f45514a;
    }

    public String toString() {
        return this.f45515b;
    }
}
