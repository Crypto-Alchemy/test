package p000;

import java.math.BigInteger;
import kotlin.Metadata;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006JK\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0006J\u001b\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0007H&J\u001a\u0010$\u001a\u0004\u0018\u00010\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, mo44877d2 = {"Lmo2;", "", "", "contractAddress", "Ljava/math/BigInteger;", "f", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "", "amount", "receiver", "estimateGas", "estimateGasPrice", "", "decimals", "b", "(DLjava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;Ljava/lang/Double;ILns0;)Ljava/lang/Object;", "_recipient", "e", "(DLjava/lang/String;Ljava/lang/String;ILns0;)Ljava/lang/Object;", "T", "hash", "j", "_gasPriceInGWEI", "h", "(Ljava/lang/Double;)Ljava/math/BigInteger;", "g", "()Ljava/lang/Double;", "c", "(Lns0;)Ljava/lang/Object;", "newGasPriceInGWEI", "Lr37;", "i", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: mo2 */
/* compiled from: IMultiNetwork.kt */
public interface mo2 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: mo2$a */
    /* compiled from: IMultiNetwork.kt */
    public static final class C7906a {
        /* renamed from: a */
        public static String m64364a(mo2 mo2, TokenType tokenType, Wallet wallet2) {
            vx2.m53591g(tokenType, "tokenType");
            vx2.m53591g(wallet2, "wallet");
            return wallet2.getAddress(tokenType.getCoinType().getValue());
        }

        /* renamed from: b */
        public static /* synthetic */ Object m64365b(mo2 mo2, String str, ns0 ns0, int i, Object obj) throws Exception {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return mo2.mo56295f(str, ns0);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBalance");
        }

        /* renamed from: c */
        public static /* synthetic */ BigInteger m64366c(mo2 mo2, Double d, int i, Object obj) throws Exception {
            if (obj == null) {
                if ((i & 1) != 0) {
                    d = null;
                }
                return mo2.mo56297h(d);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGasPrice");
        }

        /* renamed from: d */
        public static String m64367d(mo2 mo2, TokenType tokenType, Wallet wallet2) {
            vx2.m53591g(tokenType, "tokenType");
            vx2.m53591g(wallet2, "wallet");
            return wallet2.getPrivateKey(tokenType.getCoinType().getValue());
        }
    }

    /* renamed from: a */
    String mo56291a(TokenType tokenType, Wallet wallet2);

    /* renamed from: b */
    Object mo56292b(double d, String str, String str2, BigInteger bigInteger, Double d2, int i, ns0<? super String> ns0) throws Exception;

    /* renamed from: c */
    Object mo56293c(ns0<? super Double> ns0);

    /* renamed from: e */
    Object mo56294e(double d, String str, String str2, int i, ns0<? super BigInteger> ns0) throws Exception;

    /* renamed from: f */
    Object mo56295f(String str, ns0<? super BigInteger> ns0) throws Exception;

    /* renamed from: g */
    Double mo56296g();

    /* renamed from: h */
    BigInteger mo56297h(Double d) throws Exception;

    /* renamed from: i */
    void mo56298i(double d);

    /* renamed from: j */
    <T> Object mo56299j(String str, ns0<? super T> ns0) throws Exception;
}
