package p000;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinBalanceResponse;
import net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSendTxResponse;
import net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction;
import net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinUTXOResponse;
import org.web3j.abi.datatypes.Address;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\t\u001a\u00020\u0002¨\u0006\u0014"}, mo44877d2 = {"Lll1;", "", "", "address", "Lk90;", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinBalanceResponse;", "a", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinUTXOResponse;", "c", "txData", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinSendTxResponse;", "g", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinSpecificTransaction;", "b", "d", "f", "h", "e", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ll1 */
/* compiled from: DynamicApiClient.kt */
public final class ll1 {

    /* renamed from: a */
    public static final ll1 f40640a = new ll1();

    /* renamed from: a */
    public final k90<BitcoinBalanceResponse> mo55915a(String str) {
        vx2.m53591g(str, Address.TYPE_NAME);
        jl1 k = C9384u3.m72570k();
        String str2 = "https://btcbook.nownodes.io/api/v2/address/" + str;
        String str3 = C9384u3.f44866h;
        vx2.m53590f(str3, "BTC_API_KEY");
        return k.mo52743f(str2, str3);
    }

    /* renamed from: b */
    public final k90<BitcoinSpecificTransaction> mo55916b(String str) {
        vx2.m53591g(str, "txData");
        jl1 k = C9384u3.m72570k();
        String str2 = "https://btcbook.nownodes.io/api/v2/tx-specific/" + str;
        String str3 = C9384u3.f44866h;
        vx2.m53590f(str3, "BTC_API_KEY");
        return k.mo52741d(str2, str3);
    }

    /* renamed from: c */
    public final k90<BitcoinUTXOResponse> mo55917c(String str) {
        vx2.m53591g(str, Address.TYPE_NAME);
        jl1 k = C9384u3.m72570k();
        String str2 = "https://btcbook.nownodes.io/api/v2/utxo/" + str;
        String str3 = C9384u3.f44866h;
        vx2.m53590f(str3, "BTC_API_KEY");
        return k.mo52739b(str2, str3);
    }

    /* renamed from: d */
    public final k90<BitcoinBalanceResponse> mo55918d(String str) {
        vx2.m53591g(str, Address.TYPE_NAME);
        jl1 k = C9384u3.m72570k();
        String str2 = "https://dogebook.nownodes.io/api/v2/address/" + str;
        String str3 = C9384u3.f44866h;
        vx2.m53590f(str3, "BTC_API_KEY");
        return k.mo52743f(str2, str3);
    }

    /* renamed from: e */
    public final k90<BitcoinSpecificTransaction> mo55919e(String str) {
        vx2.m53591g(str, "txData");
        jl1 k = C9384u3.m72570k();
        String str2 = "https://dogebook.nownodes.io/api/v2/tx-specific/" + str;
        String str3 = C9384u3.f44866h;
        vx2.m53590f(str3, "BTC_API_KEY");
        return k.mo52741d(str2, str3);
    }

    /* renamed from: f */
    public final k90<BitcoinUTXOResponse> mo55920f(String str) {
        vx2.m53591g(str, Address.TYPE_NAME);
        jl1 k = C9384u3.m72570k();
        String str2 = "https://dogebook.nownodes.io/api/v2/utxo/" + str;
        String str3 = C9384u3.f44866h;
        vx2.m53590f(str3, "BTC_API_KEY");
        return k.mo52739b(str2, str3);
    }

    /* renamed from: g */
    public final k90<BitcoinSendTxResponse> mo55921g(String str) {
        vx2.m53591g(str, "txData");
        jl1 k = C9384u3.m72570k();
        String str2 = "https://btcbook.nownodes.io/api/v2/sendtx/" + str;
        String str3 = C9384u3.f44866h;
        vx2.m53590f(str3, "BTC_API_KEY");
        return k.mo52742e(str2, str3);
    }

    /* renamed from: h */
    public final k90<BitcoinSendTxResponse> mo55922h(String str) {
        vx2.m53591g(str, "txData");
        jl1 k = C9384u3.m72570k();
        String str2 = "https://dogebook.nownodes.io/api/v2/sendtx/" + str;
        String str3 = C9384u3.f44866h;
        vx2.m53590f(str3, "BTC_API_KEY");
        return k.mo52742e(str2, str3);
    }
}
