package p000;

import java.math.BigInteger;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\u0010H&\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo44877d2 = {"Lno2;", "", "", "toAddress", "Ljava/math/BigInteger;", "tokenId", "amount", "", "shouldFetchGas", "Lzr1;", "d", "(Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;ZLns0;)Ljava/lang/Object;", "Lss1;", "k", "(Ljava/lang/String;Ljava/math/BigInteger;Ljava/math/BigInteger;Lns0;)Ljava/lang/Object;", "getGasPrice", "", "getChain", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: no2 */
/* compiled from: INftWeb.kt */
public interface no2 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: no2$a */
    /* compiled from: INftWeb.kt */
    public static final class C8998a {
        /* renamed from: a */
        public static /* synthetic */ Object m69887a(no2 no2, String str, BigInteger bigInteger, BigInteger bigInteger2, boolean z, ns0 ns0, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    bigInteger2 = BigInteger.ONE;
                    vx2.m53590f(bigInteger2, "ONE");
                }
                return no2.mo61840d(str, bigInteger, bigInteger2, z, ns0);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: estimateGas");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m69888b(no2 no2, String str, BigInteger bigInteger, BigInteger bigInteger2, ns0 ns0, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    bigInteger2 = BigInteger.ONE;
                    vx2.m53590f(bigInteger2, "ONE");
                }
                return no2.mo61843k(str, bigInteger, bigInteger2, ns0);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: safeTransferFrom");
        }
    }

    /* renamed from: d */
    Object mo61840d(String str, BigInteger bigInteger, BigInteger bigInteger2, boolean z, ns0<? super zr1> ns0);

    int getChain();

    BigInteger getGasPrice();

    /* renamed from: k */
    Object mo61843k(String str, BigInteger bigInteger, BigInteger bigInteger2, ns0<? super ss1> ns0);
}
