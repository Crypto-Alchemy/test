package net.safemoon.androidwallet.viewmodels.p021wc;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaSendTransactionMessageRequest;
import net.safemoon.androidwallet.model.rpc2.solana.SolanaSendTransactionMessageResponse;
import retrofit2.KotlinExtensions;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"", "it", "Lnet/safemoon/androidwallet/model/rpc2/solana/SolanaSendTransactionMessageResponse;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$6$1$1$1$signFromWebView$1$1$result$1", mo48632f = "MultipleWalletConnect.kt", mo48633l = {291}, mo48634m = "invokeSuspend")
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$6$1$1$1$signFromWebView$1$1$result$1 */
/* compiled from: MultipleWalletConnect.kt */
public final class C8923xbf8118df extends SuspendLambda implements fd2<Integer, ns0<? super SolanaSendTransactionMessageResponse>, Object> {
    public final /* synthetic */ String $sign;
    public /* synthetic */ int I$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8923xbf8118df(String str, ns0<? super C8923xbf8118df> ns0) {
        super(2, ns0);
        this.$sign = str;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        C8923xbf8118df multipleWalletConnect$observeWithWalletConnectV2$6$1$1$1$signFromWebView$1$1$result$1 = new C8923xbf8118df(this.$sign, ns0);
        multipleWalletConnect$observeWithWalletConnectV2$6$1$1$1$signFromWebView$1$1$result$1.I$0 = ((Number) obj).intValue();
        return multipleWalletConnect$observeWithWalletConnectV2$6$1$1$1$signFromWebView$1$1$result$1;
    }

    public final Object invoke(int i, ns0<? super SolanaSendTransactionMessageResponse> ns0) {
        return ((C8923xbf8118df) create(Integer.valueOf(i), ns0)).invokeSuspend(r37.f33317a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (ns0<? super SolanaSendTransactionMessageResponse>) (ns0) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        String str = null;
        if (i == 0) {
            hg5.m45199b(obj);
            if (this.I$0 < 0) {
                return null;
            }
            k90<SolanaSendTransactionMessageResponse> b = C9384u3.m72573n(TokenType.SOLANA).mo56376b(new SolanaSendTransactionMessageRequest(this.$sign));
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
        if (solanaSendTransactionMessageResponse != null) {
            str = solanaSendTransactionMessageResponse.getResult();
        }
        if (str != null) {
            return solanaSendTransactionMessageResponse;
        }
        throw new Exception("Retry");
    }
}
