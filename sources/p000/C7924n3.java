package p000;

import java.math.BigInteger;
import java.util.Hashtable;
import p000.ul1;

/* renamed from: n3 */
public class C7924n3 {

    /* renamed from: a */
    public static do7 f41096a = new C7925a();

    /* renamed from: b */
    public static final Hashtable f41097b = new Hashtable();

    /* renamed from: c */
    public static final Hashtable f41098c = new Hashtable();

    /* renamed from: d */
    public static final Hashtable f41099d = new Hashtable();

    /* renamed from: n3$a */
    public static class C7925a extends do7 {
        /* renamed from: a */
        public co7 mo50748a() {
            BigInteger a = C7924n3.m64504g("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger a2 = C7924n3.m64504g("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger a3 = C7924n3.m64504g("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger a4 = C7924n3.m64504g("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger valueOf = BigInteger.valueOf(1);
            ul1 b = C7924n3.m64502e(new ul1.C9411f(a, a2, a3, a4, valueOf));
            return new co7(b, C7924n3.m64501d(b, "04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB"), a4, valueOf, (byte[]) null);
        }
    }

    static {
        m64503f("FRP256v1", C9012o3.f43581a, f41096a);
    }

    /* renamed from: d */
    public static eo7 m64501d(ul1 ul1, String str) {
        eo7 eo7 = new eo7(ul1, zl2.m75083a(str));
        vf7.m73219c(eo7.mo51515r());
        return eo7;
    }

    /* renamed from: e */
    public static ul1 m64502e(ul1 ul1) {
        return ul1;
    }

    /* renamed from: f */
    public static void m64503f(String str, C9156p4 p4Var, do7 do7) {
        f41097b.put(ob6.m70227f(str), p4Var);
        f41099d.put(p4Var, str);
        f41098c.put(p4Var, do7);
    }

    /* renamed from: g */
    public static BigInteger m64504g(String str) {
        return new BigInteger(1, zl2.m75083a(str));
    }

    /* renamed from: h */
    public static co7 m64505h(String str) {
        C9156p4 k = m64508k(str);
        if (k == null) {
            return null;
        }
        return m64506i(k);
    }

    /* renamed from: i */
    public static co7 m64506i(C9156p4 p4Var) {
        do7 do7 = (do7) f41098c.get(p4Var);
        if (do7 == null) {
            return null;
        }
        return do7.mo51242b();
    }

    /* renamed from: j */
    public static String m64507j(C9156p4 p4Var) {
        return (String) f41099d.get(p4Var);
    }

    /* renamed from: k */
    public static C9156p4 m64508k(String str) {
        return (C9156p4) f41097b.get(ob6.m70227f(str));
    }
}
