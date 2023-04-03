package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenRequest;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse;
import retrofit2.KotlinExtensions;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"", "it", "", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getAssociatedAddress$2", mo48632f = "Solana.kt", mo48633l = {64}, mo48634m = "invokeSuspend")
/* compiled from: Solana.kt */
public final class Solana$getAssociatedAddress$2 extends SuspendLambda implements fd2<Integer, ns0<? super String>, Object> {
    public final /* synthetic */ String $contractAddress;
    public final /* synthetic */ String $walletAddress;
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ Solana this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Solana$getAssociatedAddress$2(Solana solana, String str, String str2, ns0<? super Solana$getAssociatedAddress$2> ns0) {
        super(2, ns0);
        this.this$0 = solana;
        this.$walletAddress = str;
        this.$contractAddress = str2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        Solana$getAssociatedAddress$2 solana$getAssociatedAddress$2 = new Solana$getAssociatedAddress$2(this.this$0, this.$walletAddress, this.$contractAddress, ns0);
        solana$getAssociatedAddress$2.I$0 = ((Number) obj).intValue();
        return solana$getAssociatedAddress$2;
    }

    public final Object invoke(int i, ns0<? super String> ns0) {
        return ((Solana$getAssociatedAddress$2) create(Integer.valueOf(i), ns0)).invokeSuspend(r37.f33317a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (ns0<? super String>) (ns0) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        SolanaBalanceTokenResponse.Result result;
        ArrayList<SolanaBalanceTokenResponse.Value> value;
        SolanaBalanceTokenResponse.Value value2;
        String pubkey;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            if (this.I$0 < 0) {
                return null;
            }
            k90<SolanaBalanceTokenResponse> d2 = C9384u3.m72573n(this.this$0.mo61909w()).mo56378d(new SolanaBalanceTokenRequest(this.$walletAddress, this.$contractAddress));
            this.label = 1;
            obj = KotlinExtensions.m71521c(d2, this);
            if (obj == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SolanaBalanceTokenResponse solanaBalanceTokenResponse = (SolanaBalanceTokenResponse) ((bg5) obj).mo50578a();
        if (solanaBalanceTokenResponse != null && (result = solanaBalanceTokenResponse.getResult()) != null && (value = result.getValue()) != null && (value2 = (SolanaBalanceTokenResponse.Value) CollectionsKt___CollectionsKt.m47331b0(value)) != null && (pubkey = value2.getPubkey()) != null) {
            return pubkey;
        }
        throw new Exception("Retry");
    }
}
