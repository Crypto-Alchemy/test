package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaGetFeeForMessageRequest;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaGetFeeForMessageResponse;
import retrofit2.KotlinExtensions;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"", "it", "Ljava/math/BigInteger;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$feeForMessage$2", mo48632f = "Solana.kt", mo48633l = {243}, mo48634m = "invokeSuspend")
/* compiled from: Solana.kt */
public final class Solana$getEstimateGas$feeForMessage$2 extends SuspendLambda implements fd2<Integer, ns0<? super BigInteger>, Object> {
    public final /* synthetic */ String $unSignMessage;
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ Solana this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Solana$getEstimateGas$feeForMessage$2(Solana solana, String str, ns0<? super Solana$getEstimateGas$feeForMessage$2> ns0) {
        super(2, ns0);
        this.this$0 = solana;
        this.$unSignMessage = str;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        Solana$getEstimateGas$feeForMessage$2 solana$getEstimateGas$feeForMessage$2 = new Solana$getEstimateGas$feeForMessage$2(this.this$0, this.$unSignMessage, ns0);
        solana$getEstimateGas$feeForMessage$2.I$0 = ((Number) obj).intValue();
        return solana$getEstimateGas$feeForMessage$2;
    }

    public final Object invoke(int i, ns0<? super BigInteger> ns0) {
        return ((Solana$getEstimateGas$feeForMessage$2) create(Integer.valueOf(i), ns0)).invokeSuspend(r37.f33317a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (ns0<? super BigInteger>) (ns0) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        SolanaGetFeeForMessageResponse.Result result;
        Long value;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            if (this.I$0 < 0) {
                return null;
            }
            k90<SolanaGetFeeForMessageResponse> c = C9384u3.m72573n(this.this$0.mo61909w()).mo56377c(new SolanaGetFeeForMessageRequest(this.$unSignMessage));
            this.label = 1;
            obj = KotlinExtensions.m71521c(c, this);
            if (obj == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SolanaGetFeeForMessageResponse solanaGetFeeForMessageResponse = (SolanaGetFeeForMessageResponse) ((bg5) obj).mo50578a();
        if (!(solanaGetFeeForMessageResponse == null || (result = solanaGetFeeForMessageResponse.getResult()) == null || (value = result.getValue()) == null)) {
            BigInteger valueOf = BigInteger.valueOf(value.longValue());
            vx2.m53590f(valueOf, "valueOf(this)");
            if (valueOf != null) {
                return valueOf;
            }
        }
        throw new Exception("Retry");
    }
}
