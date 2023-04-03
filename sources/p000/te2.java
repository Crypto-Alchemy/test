package p000;

import java.math.BigInteger;
import java.util.Hashtable;
import p000.ul1;

/* renamed from: te2 */
public class te2 {

    /* renamed from: a */
    public static do7 f44720a = new C9353a();

    /* renamed from: b */
    public static do7 f44721b = new C9354b();

    /* renamed from: c */
    public static final Hashtable f44722c = new Hashtable();

    /* renamed from: d */
    public static final Hashtable f44723d = new Hashtable();

    /* renamed from: e */
    public static final Hashtable f44724e = new Hashtable();

    /* renamed from: te2$a */
    public static class C9353a extends do7 {
        /* renamed from: a */
        public co7 mo50748a() {
            BigInteger a = te2.m72277g("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger a2 = te2.m72277g("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger a3 = te2.m72277g("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger a4 = te2.m72277g("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger valueOf = BigInteger.valueOf(1);
            ul1 b = te2.m72275e(new ul1.C9411f(a, a2, a3, a4, valueOf));
            return new co7(b, te2.m72274d(b, "0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0"), a4, valueOf, (byte[]) null);
        }
    }

    /* renamed from: te2$b */
    public static class C9354b extends do7 {
        /* renamed from: a */
        public co7 mo50748a() {
            BigInteger a = te2.m72277g("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger a2 = te2.m72277g("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger a3 = te2.m72277g("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger a4 = te2.m72277g("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger valueOf = BigInteger.valueOf(1);
            ul1 b = te2.m72275e(new ul1.C9411f(a, a2, a3, a4, valueOf));
            return new co7(b, te2.m72274d(b, "044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2"), a4, valueOf, (byte[]) null);
        }
    }

    static {
        m72276f("wapip192v1", ue2.f44975J, f44721b);
        m72276f("sm2p256v1", ue2.f44971F, f44720a);
    }

    /* renamed from: d */
    public static eo7 m72274d(ul1 ul1, String str) {
        eo7 eo7 = new eo7(ul1, zl2.m75083a(str));
        vf7.m73219c(eo7.mo51515r());
        return eo7;
    }

    /* renamed from: e */
    public static ul1 m72275e(ul1 ul1) {
        return ul1;
    }

    /* renamed from: f */
    public static void m72276f(String str, C9156p4 p4Var, do7 do7) {
        f44722c.put(ob6.m70227f(str), p4Var);
        f44724e.put(p4Var, str);
        f44723d.put(p4Var, do7);
    }

    /* renamed from: g */
    public static BigInteger m72277g(String str) {
        return new BigInteger(1, zl2.m75083a(str));
    }

    /* renamed from: h */
    public static co7 m72278h(String str) {
        C9156p4 k = m72281k(str);
        if (k == null) {
            return null;
        }
        return m72279i(k);
    }

    /* renamed from: i */
    public static co7 m72279i(C9156p4 p4Var) {
        do7 do7 = (do7) f44723d.get(p4Var);
        if (do7 == null) {
            return null;
        }
        return do7.mo51242b();
    }

    /* renamed from: j */
    public static String m72280j(C9156p4 p4Var) {
        return (String) f44724e.get(p4Var);
    }

    /* renamed from: k */
    public static C9156p4 m72281k(String str) {
        return (C9156p4) f44722c.get(ob6.m70227f(str));
    }
}
