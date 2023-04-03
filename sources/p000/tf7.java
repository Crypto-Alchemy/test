package p000;

import java.math.BigInteger;

/* renamed from: tf7 */
public class tf7 extends C6965d6 {
    /* renamed from: c */
    public nm1 mo51131c(nm1 nm1, BigInteger bigInteger) {
        nm1 nm12;
        uf7 k = vf7.m73227k(nm1, vf7.m73224h(bigInteger.bitLength()), true);
        nm1[] c = k.mo66270c();
        nm1[] d = k.mo66271d();
        int g = k.mo66274g();
        int[] e = vf7.m73221e(g, bigInteger);
        nm1 u = nm1.mo62740i().mo50668u();
        int length = e.length;
        if (length > 1) {
            length--;
            int i = e[length];
            int i2 = i >> 16;
            int i3 = i & 65535;
            int abs = Math.abs(i2);
            nm1[] nm1Arr = i2 < 0 ? d : c;
            if ((abs << 2) < (1 << g)) {
                int a = 32 - gx2.m58281a(abs);
                int i4 = g - a;
                nm12 = nm1Arr[((1 << (g - 1)) - 1) >>> 1].mo50276a(nm1Arr[(((abs ^ (1 << (a - 1))) << i4) + 1) >>> 1]);
                i3 -= i4;
            } else {
                nm12 = nm1Arr[abs >>> 1];
            }
            u = nm12.mo62732I(i3);
        }
        while (length > 0) {
            length--;
            int i5 = e[length];
            int i6 = i5 >> 16;
            u = u.mo50275K((i6 < 0 ? d : c)[Math.abs(i6) >>> 1]).mo62732I(i5 & 65535);
        }
        return u;
    }
}
