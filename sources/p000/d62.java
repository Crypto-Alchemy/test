package p000;

import java.math.BigInteger;
import p018io.reactivex.BackpressureStrategy;

/* renamed from: d62 */
/* compiled from: Flowables */
public class d62 {
    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$range$0(BigInteger bigInteger, BigInteger bigInteger2, l52 l52) throws Exception {
        while (bigInteger.compareTo(bigInteger2) < 1 && !l52.isCancelled()) {
            l52.onNext(bigInteger);
            bigInteger = bigInteger.add(BigInteger.ONE);
        }
        if (!l52.isCancelled()) {
            l52.onComplete();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$range$1(BigInteger bigInteger, BigInteger bigInteger2, l52 l52) throws Exception {
        while (bigInteger.compareTo(bigInteger2) > -1 && !l52.isCancelled()) {
            l52.onNext(bigInteger);
            bigInteger = bigInteger.subtract(BigInteger.ONE);
        }
        if (!l52.isCancelled()) {
            l52.onComplete();
        }
    }

    public static g52<BigInteger> range(BigInteger bigInteger, BigInteger bigInteger2) {
        return range(bigInteger, bigInteger2, true);
    }

    public static g52<BigInteger> range(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        if (bigInteger.compareTo(BigInteger.ZERO) == -1) {
            throw new IllegalArgumentException("Negative start index cannot be used");
        } else if (bigInteger.compareTo(bigInteger2) > 0) {
            throw new IllegalArgumentException("Negative start index cannot be greater then end index");
        } else if (z) {
            return g52.m44532j(new b62(bigInteger, bigInteger2), BackpressureStrategy.BUFFER);
        } else {
            return g52.m44532j(new c62(bigInteger2, bigInteger), BackpressureStrategy.BUFFER);
        }
    }
}
