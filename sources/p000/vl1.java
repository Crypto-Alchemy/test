package p000;

import java.math.BigInteger;

/* renamed from: vl1 */
/* compiled from: ECDSASignature */
public class vl1 {

    /* renamed from: r */
    public final BigInteger f45325r;

    /* renamed from: s */
    public final BigInteger f45326s;

    public vl1(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f45325r = bigInteger;
        this.f45326s = bigInteger2;
    }

    public boolean isCanonical() {
        if (this.f45326s.compareTo(c16.HALF_CURVE_ORDER) <= 0) {
            return true;
        }
        return false;
    }

    public vl1 toCanonicalised() {
        if (!isCanonical()) {
            return new vl1(this.f45325r, c16.CURVE.mo66884d().subtract(this.f45326s));
        }
        return this;
    }
}
