package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement$containsFunctionN$1 extends Lambda implements rc2<w47, Boolean> {
    public static final SignatureEnhancement$containsFunctionN$1 INSTANCE = new SignatureEnhancement$containsFunctionN$1();

    public SignatureEnhancement$containsFunctionN$1() {
        super(1);
    }

    public final Boolean invoke(w47 w47) {
        eg0 d = w47.mo51134H0().mo51180d();
        if (d == null) {
            return Boolean.FALSE;
        }
        r24 name = d.getName();
        c23 c23 = c23.f37039a;
        return Boolean.valueOf(vx2.m53586b(name, c23.mo50787h().mo66201g()) && vx2.m53586b(DescriptorUtilsKt.m62443d(d), c23.mo50787h()));
    }
}
