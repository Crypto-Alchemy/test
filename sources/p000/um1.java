package p000;

import java.math.BigInteger;

/* renamed from: um1 */
public class um1 {
    /* renamed from: a */
    public static int[] m72909a(int[] iArr) {
        int i;
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
        } else if (iArr.length == 3) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (i2 >= i3 || i2 >= (i = iArr[2])) {
                int i4 = iArr[2];
                if (i3 < i4) {
                    iArr2[0] = i3;
                    int i5 = iArr[0];
                    if (i5 < i4) {
                        iArr2[1] = i5;
                        iArr2[2] = i4;
                    } else {
                        iArr2[1] = i4;
                        iArr2[2] = i5;
                    }
                } else {
                    iArr2[0] = i4;
                    int i6 = iArr[0];
                    if (i6 < i3) {
                        iArr2[1] = i6;
                        iArr2[2] = iArr[1];
                    } else {
                        iArr2[1] = i3;
                        iArr2[2] = i6;
                    }
                }
            } else {
                iArr2[0] = i2;
                if (i3 < i) {
                    iArr2[1] = i3;
                    iArr2[2] = i;
                } else {
                    iArr2[1] = i;
                    iArr2[2] = iArr[1];
                }
            }
        } else {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        }
        return iArr2;
    }

    /* renamed from: b */
    public static String m72910b(nm1 nm1, mm1 mm1) {
        ul1 a = mm1.mo56270a();
        return a != null ? new x12(C9367tq.m72428l(nm1.mo62743l(false), a.mo66316n().mo67331e(), a.mo66317o().mo67331e(), mm1.mo56271b().mo62743l(false))).toString() : new x12(nm1.mo62743l(false)).toString();
    }

    /* renamed from: c */
    public static String m72911c(C9156p4 p4Var) {
        return jm1.m59474c(p4Var);
    }

    /* renamed from: d */
    public static xl1 m72912d(my4 my4, mm1 mm1) {
        if (mm1 instanceof hm1) {
            hm1 hm1 = (hm1) mm1;
            return new km1(m72915g(hm1.mo52244f()), hm1.mo56270a(), hm1.mo56271b(), hm1.mo56273d(), hm1.mo56272c(), hm1.mo56274e());
        } else if (mm1 != null) {
            return new xl1(mm1.mo56270a(), mm1.mo56271b(), mm1.mo56273d(), mm1.mo56272c(), mm1.mo56274e());
        } else {
            mm1 b = my4.mo56335b();
            return new xl1(b.mo56270a(), b.mo56271b(), b.mo56273d(), b.mo56272c(), b.mo56274e());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: co7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.xl1 m72913e(p000.my4 r6, p000.ao7 r7) {
        /*
            boolean r0 = r7.mo50281u()
            if (r0 == 0) goto L_0x0025
            t4 r7 = r7.mo50279s()
            p4 r7 = p000.C9156p4.m70910O(r7)
            co7 r0 = m72914f(r7)
            if (r0 != 0) goto L_0x001f
            java.util.Map r6 = r6.mo56334a()
            java.lang.Object r6 = r6.get(r7)
            r0 = r6
            co7 r0 = (p000.co7) r0
        L_0x001f:
            km1 r6 = new km1
            r6.<init>(r7, r0)
            goto L_0x006d
        L_0x0025:
            boolean r0 = r7.mo50280t()
            if (r0 == 0) goto L_0x004a
            mm1 r6 = r6.mo56335b()
            xl1 r7 = new xl1
            ul1 r1 = r6.mo56270a()
            nm1 r2 = r6.mo56271b()
            java.math.BigInteger r3 = r6.mo56273d()
            java.math.BigInteger r4 = r6.mo56272c()
            byte[] r5 = r6.mo56274e()
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x006c
        L_0x004a:
            t4 r6 = r7.mo50279s()
            co7 r6 = p000.co7.m56481u(r6)
            xl1 r7 = new xl1
            ul1 r1 = r6.mo50929r()
            nm1 r2 = r6.mo50930s()
            java.math.BigInteger r3 = r6.mo50932w()
            java.math.BigInteger r4 = r6.mo50931t()
            byte[] r5 = r6.mo50928A()
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x006c:
            r6 = r7
        L_0x006d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.um1.m72913e(my4, ao7):xl1");
    }

    /* renamed from: f */
    public static co7 m72914f(C9156p4 p4Var) {
        co7 j = by0.m56204j(p4Var);
        return j == null ? jm1.m59473b(p4Var) : j;
    }

    /* renamed from: g */
    public static C9156p4 m72915g(String str) {
        if (str == null || str.length() < 1) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        C9156p4 h = m72916h(str);
        return h != null ? h : jm1.m59475d(str);
    }

    /* renamed from: h */
    public static C9156p4 m72916h(String str) {
        char charAt = str.charAt(0);
        if (charAt < '0' || charAt > '2') {
            return null;
        }
        try {
            return new C9156p4(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static int m72917i(my4 my4, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        mm1 b = my4.mo56335b();
        return b == null ? bigInteger2.bitLength() : b.mo56273d().bitLength();
    }

    /* renamed from: j */
    public static String m72918j(String str, BigInteger bigInteger, mm1 mm1) {
        StringBuffer stringBuffer = new StringBuffer();
        String d = ob6.m70225d();
        nm1 A = new k32().mo51129a(mm1.mo56271b(), bigInteger).mo62725A();
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(m72910b(A, mm1));
        stringBuffer.append("]");
        stringBuffer.append(d);
        stringBuffer.append("            X: ");
        stringBuffer.append(A.mo62737f().mo50994t().toString(16));
        stringBuffer.append(d);
        stringBuffer.append("            Y: ");
        stringBuffer.append(A.mo62738g().mo50994t().toString(16));
        stringBuffer.append(d);
        return stringBuffer.toString();
    }

    /* renamed from: k */
    public static String m72919k(String str, nm1 nm1, mm1 mm1) {
        StringBuffer stringBuffer = new StringBuffer();
        String d = ob6.m70225d();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(m72910b(nm1, mm1));
        stringBuffer.append("]");
        stringBuffer.append(d);
        stringBuffer.append("            X: ");
        stringBuffer.append(nm1.mo62737f().mo50994t().toString(16));
        stringBuffer.append(d);
        stringBuffer.append("            Y: ");
        stringBuffer.append(nm1.mo62738g().mo50994t().toString(16));
        stringBuffer.append(d);
        return stringBuffer.toString();
    }
}
