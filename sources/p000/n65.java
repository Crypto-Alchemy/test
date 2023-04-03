package p000;

import kotlin.Metadata;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceRequest;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceResponse;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenRequest;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaGetFeeForMessageRequest;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaGetFeeForMessageResponse;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaLatestBlockHashRequest;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaLatestBlockHashResponse;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaSendTransactionMessageRequest;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaSendTransactionMessageResponse;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¨\u0006\u0013"}, mo44877d2 = {"Ln65;", "", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceRequest;", "iBalanceRequest", "Lk90;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceResponse;", "e", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenRequest;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaBalanceTokenResponse;", "d", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaLatestBlockHashRequest;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaLatestBlockHashResponse;", "a", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaGetFeeForMessageRequest;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaGetFeeForMessageResponse;", "c", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaSendTransactionMessageRequest;", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaSendTransactionMessageResponse;", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: n65 */
/* compiled from: RPCApiInterface.kt */
public interface n65 {
    @ak4("/")
    /* renamed from: a */
    k90<SolanaLatestBlockHashResponse> mo56375a(@p30 SolanaLatestBlockHashRequest solanaLatestBlockHashRequest);

    @ak4("/")
    /* renamed from: b */
    k90<SolanaSendTransactionMessageResponse> mo56376b(@p30 SolanaSendTransactionMessageRequest solanaSendTransactionMessageRequest);

    @ak4("/")
    /* renamed from: c */
    k90<SolanaGetFeeForMessageResponse> mo56377c(@p30 SolanaGetFeeForMessageRequest solanaGetFeeForMessageRequest);

    @ak4("/")
    /* renamed from: d */
    k90<SolanaBalanceTokenResponse> mo56378d(@p30 SolanaBalanceTokenRequest solanaBalanceTokenRequest);

    @ak4("/")
    /* renamed from: e */
    k90<SolanaBalanceResponse> mo56379e(@p30 SolanaBalanceRequest solanaBalanceRequest);
}
