package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: r77 */
public class r77 {

    /* renamed from: a */
    public static final C6825af f44301a;

    /* renamed from: b */
    public static final C6825af f44302b;

    /* renamed from: c */
    public static final C6825af f44303c = new C6825af(n24.f41075j);

    /* renamed from: d */
    public static final C6825af f44304d = new C6825af(n24.f41071h);

    /* renamed from: e */
    public static final C6825af f44305e = new C6825af(n24.f41061c);

    /* renamed from: f */
    public static final C6825af f44306f = new C6825af(n24.f41065e);

    /* renamed from: g */
    public static final C6825af f44307g = new C6825af(n24.f41081m);

    /* renamed from: h */
    public static final C6825af f44308h = new C6825af(n24.f41083n);

    /* renamed from: i */
    public static final Map f44309i;

    static {
        C9156p4 p4Var = bk4.f36866X;
        f44301a = new C6825af(p4Var);
        C9156p4 p4Var2 = bk4.f36867Y;
        f44302b = new C6825af(p4Var2);
        HashMap hashMap = new HashMap();
        f44309i = hashMap;
        hashMap.put(p4Var, gx2.m58284d(5));
        hashMap.put(p4Var2, gx2.m58284d(6));
    }

    /* renamed from: a */
    public static C6825af m71473a(String str) {
        if (str.equals("SHA-1")) {
            return new C6825af(rc4.f44343i, wz0.f45797d);
        }
        if (str.equals("SHA-224")) {
            return new C6825af(n24.f41067f);
        }
        if (str.equals("SHA-256")) {
            return new C6825af(n24.f41061c);
        }
        if (str.equals("SHA-384")) {
            return new C6825af(n24.f41063d);
        }
        if (str.equals("SHA-512")) {
            return new C6825af(n24.f41065e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    /* renamed from: b */
    public static ig1 m71474b(C9156p4 p4Var) {
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

    /* renamed from: c */
    public static String m71475c(C9156p4 p4Var) {
        if (p4Var.mo65963B(rc4.f44343i)) {
            return "SHA-1";
        }
        if (p4Var.mo65963B(n24.f41067f)) {
            return "SHA-224";
        }
        if (p4Var.mo65963B(n24.f41061c)) {
            return "SHA-256";
        }
        if (p4Var.mo65963B(n24.f41063d)) {
            return "SHA-384";
        }
        if (p4Var.mo65963B(n24.f41065e)) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + p4Var);
    }

    /* renamed from: d */
    public static C6825af m71476d(int i) {
        if (i == 5) {
            return f44301a;
        }
        if (i == 6) {
            return f44302b;
        }
        throw new IllegalArgumentException("unknown security category: " + i);
    }

    /* renamed from: e */
    public static int m71477e(C6825af afVar) {
        return ((Integer) f44309i.get(afVar.mo50159r())).intValue();
    }

    /* renamed from: f */
    public static C6825af m71478f(String str) {
        if (str.equals("SHA3-256")) {
            return f44303c;
        }
        if (str.equals("SHA-512/256")) {
            return f44304d;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    /* renamed from: g */
    public static String m71479g(lj5 lj5) {
        C6825af s = lj5.mo55912s();
        if (s.mo50159r().mo65963B(f44303c.mo50159r())) {
            return "SHA3-256";
        }
        if (s.mo50159r().mo65963B(f44304d.mo50159r())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + s.mo50159r());
    }

    /* renamed from: h */
    public static C6825af m71480h(String str) {
        if (str.equals("SHA-256")) {
            return f44305e;
        }
        if (str.equals("SHA-512")) {
            return f44306f;
        }
        if (str.equals("SHAKE128")) {
            return f44307g;
        }
        if (str.equals("SHAKE256")) {
            return f44308h;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}
