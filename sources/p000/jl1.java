package p000;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinBalanceResponse;
import net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSendTxResponse;
import net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction;
import net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinUTXOResponse;
import net.safemoon.androidwallet.model.transaction.history.SolSplFromExplorer;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'JO\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¨\u0006\u0017"}, mo44877d2 = {"Ljl1;", "", "", "url", "Lk90;", "c", "address", "token_address", "", "limit", "offset", "Lnet/safemoon/androidwallet/model/transaction/history/SolSplFromExplorer;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lk90;", "apiKey", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinBalanceResponse;", "f", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinUTXOResponse;", "b", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinSendTxResponse;", "e", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinSpecificTransaction;", "d", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: jl1 */
/* compiled from: DynamicAPIInterface.kt */
public interface jl1 {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: jl1$a */
    /* compiled from: DynamicAPIInterface.kt */
    public static final class C7299a {
        /* renamed from: a */
        public static /* synthetic */ k90 m59465a(jl1 jl1, String str, String str2, String str3, Integer num, Integer num2, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "https://api.solscan.io/account/token/txs";
                }
                String str4 = str;
                if ((i & 8) != 0) {
                    num = 10;
                }
                Integer num3 = num;
                if ((i & 16) != 0) {
                    num2 = 0;
                }
                return jl1.mo52738a(str4, str2, str3, num3, num2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSplTokenHistory");
        }
    }

    @le2
    /* renamed from: a */
    k90<SolSplFromExplorer> mo52738a(@k57 String str, @sz4("address") String str2, @sz4("token_address") String str3, @sz4("limit") Integer num, @sz4("offset") Integer num2);

    @le2
    /* renamed from: b */
    k90<BitcoinUTXOResponse> mo52739b(@k57 String str, @nl2("api-key") String str2);

    @le2
    /* renamed from: c */
    k90<String> mo52740c(@k57 String str);

    @le2
    /* renamed from: d */
    k90<BitcoinSpecificTransaction> mo52741d(@k57 String str, @nl2("api-key") String str2);

    @le2
    /* renamed from: e */
    k90<BitcoinSendTxResponse> mo52742e(@k57 String str, @nl2("api-key") String str2);

    @le2
    /* renamed from: f */
    k90<BitcoinBalanceResponse> mo52743f(@k57 String str, @nl2("api-key") String str2);
}
