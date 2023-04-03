package p000;

import java.math.BigInteger;

/* renamed from: d6 */
public abstract class C6965d6 implements gm1 {
    /* renamed from: a */
    public nm1 mo51129a(nm1 nm1, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || nm1.mo62751u()) {
            return nm1.mo62740i().mo50668u();
        }
        nm1 c = mo51131c(nm1, bigInteger.abs());
        if (signum <= 0) {
            c = c.mo50278z();
        }
        return mo51130b(c);
    }

    /* renamed from: b */
    public nm1 mo51130b(nm1 nm1) {
        return sl1.m71962a(nm1);
    }

    /* renamed from: c */
    public abstract nm1 mo51131c(nm1 nm1, BigInteger bigInteger);
}
