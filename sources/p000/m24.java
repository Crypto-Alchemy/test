package p000;

import java.util.Hashtable;

/* renamed from: m24 */
public class m24 {

    /* renamed from: a */
    public static final Hashtable f40737a = new Hashtable();

    /* renamed from: b */
    public static final Hashtable f40738b = new Hashtable();

    static {
        m64043a("B-571", xi5.f45902F);
        m64043a("B-409", xi5.f45900D);
        m64043a("B-283", xi5.f45935n);
        m64043a("B-233", xi5.f45941t);
        m64043a("B-163", xi5.f45933l);
        m64043a("K-571", xi5.f45901E);
        m64043a("K-409", xi5.f45899C);
        m64043a("K-283", xi5.f45934m);
        m64043a("K-233", xi5.f45940s);
        m64043a("K-163", xi5.f45923b);
        m64043a("P-521", xi5.f45898B);
        m64043a("P-384", xi5.f45897A);
        m64043a("P-256", xi5.f45904H);
        m64043a("P-224", xi5.f45947z);
        m64043a("P-192", xi5.f45903G);
    }

    /* renamed from: a */
    public static void m64043a(String str, C9156p4 p4Var) {
        f40737a.put(str, p4Var);
        f40738b.put(p4Var, str);
    }

    /* renamed from: b */
    public static co7 m64044b(String str) {
        C9156p4 p4Var = (C9156p4) f40737a.get(ob6.m70228g(str));
        if (p4Var != null) {
            return m64045c(p4Var);
        }
        return null;
    }

    /* renamed from: c */
    public static co7 m64045c(C9156p4 p4Var) {
        return wi5.m73633k(p4Var);
    }

    /* renamed from: d */
    public static String m64046d(C9156p4 p4Var) {
        return (String) f40738b.get(p4Var);
    }

    /* renamed from: e */
    public static C9156p4 m64047e(String str) {
        return (C9156p4) f40737a.get(ob6.m70228g(str));
    }
}
