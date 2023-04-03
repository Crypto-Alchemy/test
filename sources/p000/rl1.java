package p000;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import p000.ul1;

/* renamed from: rl1 */
public class rl1 {

    /* renamed from: a */
    public static Map f44385a = new HashMap();

    static {
        Enumeration l = by0.m56206l();
        while (l.hasMoreElements()) {
            String str = (String) l.nextElement();
            co7 a = jm1.m59472a(str);
            if (a != null) {
                f44385a.put(a.mo50929r(), by0.m56203i(str).mo50929r());
            }
        }
        ul1 r = by0.m56203i("Curve25519").mo50929r();
        f44385a.put(new ul1.C9411f(r.mo66321s().mo50779b(), r.mo66316n().mo50994t(), r.mo66317o().mo50994t(), r.mo66323w(), r.mo66318p()), r);
    }

    /* renamed from: a */
    public static ul1 m71560a(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a = ellipticCurve.getA();
        BigInteger b = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            ul1.C9411f fVar = new ul1.C9411f(((ECFieldFp) field).getP(), a, b);
            return f44385a.containsKey(fVar) ? (ul1) f44385a.get(fVar) : fVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] a2 = um1.m72909a(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new ul1.C9409e(m, a2[0], a2[1], a2[2], a, b);
    }

    /* renamed from: b */
    public static EllipticCurve m71561b(ul1 ul1, byte[] bArr) {
        return new EllipticCurve(m71562c(ul1.mo66321s()), ul1.mo66316n().mo50994t(), ul1.mo66317o().mo50994t(), (byte[]) null);
    }

    /* renamed from: c */
    public static ECField m71562c(c22 c22) {
        if (sl1.m71975n(c22)) {
            return new ECFieldFp(c22.mo50779b());
        }
        ds4 c = ((es4) c22).mo51541c();
        int[] a = c.mo51279a();
        return new ECFieldF2m(c.mo51280b(), C9367tq.m72416E(C9367tq.m72431o(a, 1, a.length - 1)));
    }

    /* renamed from: d */
    public static nm1 m71563d(ul1 ul1, ECPoint eCPoint) {
        return ul1.mo66311g(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    /* renamed from: e */
    public static nm1 m71564e(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return m71563d(m71560a(eCParameterSpec.getCurve()), eCPoint);
    }

    /* renamed from: f */
    public static ECPoint m71565f(nm1 nm1) {
        nm1 A = nm1.mo62725A();
        return new ECPoint(A.mo62737f().mo50994t(), A.mo62738g().mo50994t());
    }

    /* renamed from: g */
    public static mm1 m71566g(ECParameterSpec eCParameterSpec) {
        ul1 a = m71560a(eCParameterSpec.getCurve());
        nm1 d = m71563d(a, eCParameterSpec.getGenerator());
        BigInteger order = eCParameterSpec.getOrder();
        BigInteger valueOf = BigInteger.valueOf((long) eCParameterSpec.getCofactor());
        byte[] seed = eCParameterSpec.getCurve().getSeed();
        return eCParameterSpec instanceof im1 ? new hm1(((im1) eCParameterSpec).mo52498a(), a, d, order, valueOf, seed) : new mm1(a, d, order, valueOf, seed);
    }

    /* renamed from: h */
    public static ECParameterSpec m71567h(EllipticCurve ellipticCurve, mm1 mm1) {
        ECPoint f = m71565f(mm1.mo56271b());
        if (!(mm1 instanceof hm1)) {
            return new ECParameterSpec(ellipticCurve, f, mm1.mo56273d(), mm1.mo56272c().intValue());
        }
        return new im1(((hm1) mm1).mo52244f(), ellipticCurve, f, mm1.mo56273d(), mm1.mo56272c());
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.security.spec.ECParameterSpec] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.security.spec.ECParameterSpec] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.spec.ECParameterSpec m71568i(p000.ao7 r8, p000.ul1 r9) {
        /*
            boolean r0 = r8.mo50281u()
            if (r0 == 0) goto L_0x0048
            t4 r8 = r8.mo50279s()
            p4 r8 = (p000.C9156p4) r8
            co7 r0 = p000.um1.m72914f(r8)
            if (r0 != 0) goto L_0x0024
            my4 r1 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.util.Map r1 = r1.mo56334a()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0024
            java.lang.Object r0 = r1.get(r8)
            co7 r0 = (p000.co7) r0
        L_0x0024:
            byte[] r1 = r0.mo50928A()
            java.security.spec.EllipticCurve r4 = m71561b(r9, r1)
            im1 r9 = new im1
            java.lang.String r3 = p000.um1.m72911c(r8)
            nm1 r8 = r0.mo50930s()
            java.security.spec.ECPoint r5 = m71565f(r8)
            java.math.BigInteger r6 = r0.mo50932w()
            java.math.BigInteger r7 = r0.mo50931t()
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x00da
        L_0x0048:
            boolean r0 = r8.mo50280t()
            if (r0 == 0) goto L_0x0051
            r9 = 0
            goto L_0x00da
        L_0x0051:
            t4 r8 = r8.mo50279s()
            w4 r8 = p000.C9480w4.m73427L(r8)
            int r0 = r8.size()
            r1 = 3
            if (r0 <= r1) goto L_0x009f
            co7 r8 = p000.co7.m56481u(r8)
            byte[] r0 = r8.mo50928A()
            java.security.spec.EllipticCurve r9 = m71561b(r9, r0)
            java.math.BigInteger r0 = r8.mo50931t()
            if (r0 == 0) goto L_0x008c
            java.security.spec.ECParameterSpec r0 = new java.security.spec.ECParameterSpec
            nm1 r1 = r8.mo50930s()
            java.security.spec.ECPoint r1 = m71565f(r1)
            java.math.BigInteger r2 = r8.mo50932w()
            java.math.BigInteger r8 = r8.mo50931t()
            int r8 = r8.intValue()
            r0.<init>(r9, r1, r2, r8)
            goto L_0x00d9
        L_0x008c:
            java.security.spec.ECParameterSpec r0 = new java.security.spec.ECParameterSpec
            nm1 r1 = r8.mo50930s()
            java.security.spec.ECPoint r1 = m71565f(r1)
            java.math.BigInteger r8 = r8.mo50932w()
            r2 = 1
            r0.<init>(r9, r1, r8, r2)
            goto L_0x00d9
        L_0x009f:
            ve2 r8 = p000.ve2.m73201r(r8)
            p4 r9 = r8.mo66491s()
            java.lang.String r9 = p000.bm1.m56068f(r9)
            hm1 r9 = p000.am1.m55586a(r9)
            ul1 r0 = r9.mo56270a()
            byte[] r1 = r9.mo56274e()
            java.security.spec.EllipticCurve r4 = m71561b(r0, r1)
            im1 r0 = new im1
            p4 r8 = r8.mo66491s()
            java.lang.String r3 = p000.bm1.m56068f(r8)
            nm1 r8 = r9.mo56271b()
            java.security.spec.ECPoint r5 = m71565f(r8)
            java.math.BigInteger r6 = r9.mo56273d()
            java.math.BigInteger r7 = r9.mo56272c()
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x00d9:
            r9 = r0
        L_0x00da:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rl1.m71568i(ao7, ul1):java.security.spec.ECParameterSpec");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: co7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.ul1 m71569j(p000.my4 r2, p000.ao7 r3) {
        /*
            java.util.Set r0 = r2.mo56336c()
            boolean r1 = r3.mo50281u()
            if (r1 == 0) goto L_0x003d
            t4 r3 = r3.mo50279s()
            p4 r3 = p000.C9156p4.m70910O(r3)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0027
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x001f
            goto L_0x0027
        L_0x001f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "named curve not acceptable"
            r2.<init>(r3)
            throw r2
        L_0x0027:
            co7 r0 = p000.um1.m72914f(r3)
            if (r0 != 0) goto L_0x0038
            java.util.Map r2 = r2.mo56334a()
            java.lang.Object r2 = r2.get(r3)
            r0 = r2
            co7 r0 = (p000.co7) r0
        L_0x0038:
            ul1 r2 = r0.mo50929r()
            goto L_0x0077
        L_0x003d:
            boolean r1 = r3.mo50280t()
            if (r1 == 0) goto L_0x004c
            mm1 r2 = r2.mo56335b()
            ul1 r2 = r2.mo56270a()
            goto L_0x0077
        L_0x004c:
            t4 r2 = r3.mo50279s()
            w4 r2 = p000.C9480w4.m73427L(r2)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0078
            int r3 = r2.size()
            r0 = 3
            if (r3 <= r0) goto L_0x0066
            co7 r2 = p000.co7.m56481u(r2)
            goto L_0x0073
        L_0x0066:
            r3 = 0
            b4 r2 = r2.mo52675M(r3)
            p4 r2 = p000.C9156p4.m70910O(r2)
            co7 r2 = p000.bm1.m56067e(r2)
        L_0x0073:
            ul1 r2 = r2.mo50929r()
        L_0x0077:
            return r2
        L_0x0078:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "encoded parameters not acceptable"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rl1.m71569j(my4, ao7):ul1");
    }

    /* renamed from: k */
    public static xl1 m71570k(my4 my4, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return um1.m72912d(my4, m71566g(eCParameterSpec));
        }
        mm1 b = my4.mo56335b();
        return new xl1(b.mo56270a(), b.mo56271b(), b.mo56273d(), b.mo56272c(), b.mo56274e());
    }
}
