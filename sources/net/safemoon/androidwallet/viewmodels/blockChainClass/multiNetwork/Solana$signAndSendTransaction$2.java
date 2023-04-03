package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaSendTransactionMessageRequest;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaSendTransactionMessageResponse;
import retrofit2.KotlinExtensions;
import wallet.core.jni.proto.Solana;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"", "it", "", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signAndSendTransaction$2", mo48632f = "Solana.kt", mo48633l = {204}, mo48634m = "invokeSuspend")
/* compiled from: Solana.kt */
public final class Solana$signAndSendTransaction$2 extends SuspendLambda implements fd2<Integer, ns0<? super String>, Object> {
    public final /* synthetic */ Solana.SigningOutput $sign;
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ Solana this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Solana$signAndSendTransaction$2(Solana solana, Solana.SigningOutput signingOutput, ns0<? super Solana$signAndSendTransaction$2> ns0) {
        super(2, ns0);
        this.this$0 = solana;
        this.$sign = signingOutput;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        Solana$signAndSendTransaction$2 solana$signAndSendTransaction$2 = new Solana$signAndSendTransaction$2(this.this$0, this.$sign, ns0);
        solana$signAndSendTransaction$2.I$0 = ((Number) obj).intValue();
        return solana$signAndSendTransaction$2;
    }

    public final Object invoke(int i, ns0<? super String> ns0) {
        return ((Solana$signAndSendTransaction$2) create(Integer.valueOf(i), ns0)).invokeSuspend(r37.f33317a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (ns0<? super String>) (ns0) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        String result;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            if (this.I$0 < 0) {
                return null;
            }
            n65 n = C9384u3.m72573n(this.this$0.mo61909w());
            String encoded = this.$sign.getEncoded();
            vx2.m53590f(encoded, "sign.encoded");
            k90<SolanaSendTransactionMessageResponse> b = n.mo56376b(new SolanaSendTransactionMessageRequest(encoded));
            this.label = 1;
            obj = KotlinExtensions.m71521c(b, this);
            if (obj == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SolanaSendTransactionMessageResponse solanaSendTransactionMessageResponse = (SolanaSendTransactionMessageResponse) ((bg5) obj).mo50578a();
        if (solanaSendTransactionMessageResponse != null && (result = solanaSendTransactionMessageResponse.getResult()) != null) {
            return result;
        }
        throw new Exception("Retry");
    }
}
