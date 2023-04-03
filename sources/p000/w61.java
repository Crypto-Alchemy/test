package p000;

import java.math.BigInteger;
import org.web3j.protocol.core.DefaultBlockParameterName;

/* renamed from: w61 */
/* compiled from: DefaultBlockParameter */
public final /* synthetic */ class w61 {
    /* renamed from: a */
    public static x61 m73486a(String str) {
        return DefaultBlockParameterName.fromString(str);
    }

    /* renamed from: b */
    public static x61 m73487b(BigInteger bigInteger) {
        BigInteger bigInteger2 = BigInteger.ZERO;
        if (bigInteger2.compareTo(bigInteger) >= 0) {
            bigInteger = bigInteger2;
        }
        return new y61(bigInteger);
    }
}
