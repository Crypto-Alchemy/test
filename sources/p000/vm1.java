package p000;

import java.math.BigInteger;
import java.security.spec.ECParameterSpec;

/* renamed from: vm1 */
public class vm1 {
    /* renamed from: a */
    public static ao7 m73290a(ECParameterSpec eCParameterSpec, boolean z) {
        if (eCParameterSpec instanceof im1) {
            im1 im1 = (im1) eCParameterSpec;
            C9156p4 g = um1.m72915g(im1.mo52498a());
            if (g == null) {
                g = new C9156p4(im1.mo52498a());
            }
            return new ao7(g);
        } else if (eCParameterSpec == null) {
            return new ao7((C7820l4) wz0.f45797d);
        } else {
            ul1 a = rl1.m71560a(eCParameterSpec.getCurve());
            return new ao7(new co7(a, new eo7(rl1.m71563d(a, eCParameterSpec.getGenerator()), z), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
    }
}
