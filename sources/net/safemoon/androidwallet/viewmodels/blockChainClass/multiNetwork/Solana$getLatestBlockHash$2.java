package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaLatestBlockHashRequest;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaLatestBlockHashResponse;
import retrofit2.KotlinExtensions;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"", "it", "", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getLatestBlockHash$2", mo48632f = "Solana.kt", mo48633l = {271}, mo48634m = "invokeSuspend")
/* compiled from: Solana.kt */
public final class Solana$getLatestBlockHash$2 extends SuspendLambda implements fd2<Integer, ns0<? super String>, Object> {
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ Solana this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Solana$getLatestBlockHash$2(Solana solana, ns0<? super Solana$getLatestBlockHash$2> ns0) {
        super(2, ns0);
        this.this$0 = solana;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        Solana$getLatestBlockHash$2 solana$getLatestBlockHash$2 = new Solana$getLatestBlockHash$2(this.this$0, ns0);
        solana$getLatestBlockHash$2.I$0 = ((Number) obj).intValue();
        return solana$getLatestBlockHash$2;
    }

    public final Object invoke(int i, ns0<? super String> ns0) {
        return ((Solana$getLatestBlockHash$2) create(Integer.valueOf(i), ns0)).invokeSuspend(r37.f33317a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (ns0<? super String>) (ns0) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        SolanaLatestBlockHashResponse.Result result;
        SolanaLatestBlockHashResponse.ResultValue value;
        String blockhash;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            if (this.I$0 < 0) {
                return null;
            }
            k90<SolanaLatestBlockHashResponse> a = C9384u3.m72573n(this.this$0.mo61909w()).mo56375a(new SolanaLatestBlockHashRequest());
            this.label = 1;
            obj = KotlinExtensions.m71521c(a, this);
            if (obj == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SolanaLatestBlockHashResponse solanaLatestBlockHashResponse = (SolanaLatestBlockHashResponse) ((bg5) obj).mo50578a();
        if (solanaLatestBlockHashResponse != null && (result = solanaLatestBlockHashResponse.getResult()) != null && (value = result.getValue()) != null && (blockhash = value.getBlockhash()) != null) {
            return blockhash;
        }
        throw new Exception("Retry");
    }
}
