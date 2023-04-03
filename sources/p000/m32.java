package p000;

import java.math.BigInteger;

/* renamed from: m32 */
public class m32 {

    /* renamed from: m32$a */
    public static class C7858a implements ut4 {

        /* renamed from: a */
        public final /* synthetic */ ul1 f40747a;

        /* renamed from: b */
        public final /* synthetic */ nm1 f40748b;

        public C7858a(ul1 ul1, nm1 nm1) {
            this.f40747a = ul1;
            this.f40748b = nm1;
        }

        /* renamed from: a */
        public vt4 mo56012a(vt4 vt4) {
            l32 l32 = vt4 instanceof l32 ? (l32) vt4 : null;
            int a = m32.m64055a(this.f40747a);
            int i = a > 250 ? 6 : 5;
            int i2 = 1 << i;
            if (mo56013b(l32, i2)) {
                return l32;
            }
            int i3 = ((a + i) - 1) / i;
            nm1[] nm1Arr = new nm1[(i + 1)];
            nm1Arr[0] = this.f40748b;
            for (int i4 = 1; i4 < i; i4++) {
                nm1Arr[i4] = nm1Arr[i4 - 1].mo62732I(i3);
            }
            nm1Arr[i] = nm1Arr[0].mo62731G(nm1Arr[1]);
            this.f40747a.mo66325y(nm1Arr);
            nm1[] nm1Arr2 = new nm1[i2];
            nm1Arr2[0] = nm1Arr[0];
            for (int i5 = i - 1; i5 >= 0; i5--) {
                nm1 nm1 = nm1Arr[i5];
                int i6 = 1 << i5;
                for (int i7 = i6; i7 < i2; i7 += i6 << 1) {
                    nm1Arr2[i7] = nm1Arr2[i7 - i6].mo50276a(nm1);
                }
            }
            this.f40747a.mo66325y(nm1Arr2);
            l32 l322 = new l32();
            l322.mo55816d(this.f40747a.mo50663e(nm1Arr2, 0, i2));
            l322.mo55817e(nm1Arr[i]);
            l322.mo55818f(i);
            return l322;
        }

        /* renamed from: b */
        public final boolean mo56013b(l32 l32, int i) {
            return l32 != null && mo56014c(l32.mo55813a(), i);
        }

        /* renamed from: c */
        public final boolean mo56014c(fm1 fm1, int i) {
            return fm1 != null && fm1.getSize() >= i;
        }
    }

    /* renamed from: a */
    public static int m64055a(ul1 ul1) {
        BigInteger w = ul1.mo66323w();
        return w == null ? ul1.mo50667t() + 1 : w.bitLength();
    }

    /* renamed from: b */
    public static l32 m64056b(nm1 nm1) {
        ul1 i = nm1.mo62740i();
        return (l32) i.mo66305A(nm1, "bc_fixed_point", new C7858a(i, nm1));
    }
}
