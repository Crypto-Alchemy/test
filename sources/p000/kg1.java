package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: kg1 */
public class kg1 {

    /* renamed from: a */
    public static Map<String, C9156p4> f38897a = new HashMap();

    /* renamed from: b */
    public static Map<C9156p4, String> f38898b = new HashMap();

    static {
        Map<String, C9156p4> map = f38897a;
        C9156p4 p4Var = n24.f41061c;
        map.put("SHA-256", p4Var);
        Map<String, C9156p4> map2 = f38897a;
        C9156p4 p4Var2 = n24.f41065e;
        map2.put("SHA-512", p4Var2);
        Map<String, C9156p4> map3 = f38897a;
        C9156p4 p4Var3 = n24.f41081m;
        map3.put("SHAKE128", p4Var3);
        Map<String, C9156p4> map4 = f38897a;
        C9156p4 p4Var4 = n24.f41083n;
        map4.put("SHAKE256", p4Var4);
        f38898b.put(p4Var, "SHA-256");
        f38898b.put(p4Var2, "SHA-512");
        f38898b.put(p4Var3, "SHAKE128");
        f38898b.put(p4Var4, "SHAKE256");
    }

    /* renamed from: a */
    public static ig1 m59760a(C9156p4 p4Var) {
        if (p4Var.mo65963B(n24.f41061c)) {
            return new bj5();
        }
        if (p4Var.mo65963B(n24.f41065e)) {
            return new fj5();
        }
        if (p4Var.mo65963B(n24.f41081m)) {
            return new gj5(128);
        }
        if (p4Var.mo65963B(n24.f41083n)) {
            return new gj5(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + p4Var);
    }

    /* renamed from: b */
    public static String m59761b(C9156p4 p4Var) {
        String str = f38898b.get(p4Var);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unrecognized digest oid: " + p4Var);
    }

    /* renamed from: c */
    public static C9156p4 m59762c(String str) {
        C9156p4 p4Var = f38897a.get(str);
        if (p4Var != null) {
            return p4Var;
        }
        throw new IllegalArgumentException("unrecognized digest name: " + str);
    }
}
