package p000;

/* renamed from: s77 */
public class s77 {
    /* renamed from: a */
    public static C6825af m71890a(String str) {
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
    public static ig1 m71891b(C6825af afVar) {
        if (afVar.mo50159r().mo65963B(rc4.f44343i)) {
            return jg1.m59368b();
        }
        if (afVar.mo50159r().mo65963B(n24.f41067f)) {
            return jg1.m59369c();
        }
        if (afVar.mo50159r().mo65963B(n24.f41061c)) {
            return jg1.m59370d();
        }
        if (afVar.mo50159r().mo65963B(n24.f41063d)) {
            return jg1.m59371e();
        }
        if (afVar.mo50159r().mo65963B(n24.f41065e)) {
            return jg1.m59376j();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + afVar.mo50159r());
    }
}
