package p000;

/* renamed from: lg1 */
public class lg1 {
    /* renamed from: a */
    public static C9156p4 m63830a(String str) {
        if (str.equals("SHA-256")) {
            return n24.f41061c;
        }
        if (str.equals("SHA-512")) {
            return n24.f41065e;
        }
        if (str.equals("SHAKE128")) {
            return n24.f41081m;
        }
        if (str.equals("SHAKE256")) {
            return n24.f41083n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }

    /* renamed from: b */
    public static String m63831b(C9156p4 p4Var) {
        if (p4Var.mo65963B(n24.f41061c)) {
            return "SHA256";
        }
        if (p4Var.mo65963B(n24.f41065e)) {
            return "SHA512";
        }
        if (p4Var.mo65963B(n24.f41081m)) {
            return "SHAKE128";
        }
        if (p4Var.mo65963B(n24.f41083n)) {
            return "SHAKE256";
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + p4Var);
    }
}
