package net.safemoon.androidwallet.viewmodels.p021wc;

import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;
import net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lss1;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$4$1$1$1$onApprove$1$ethTransaction$1", mo48632f = "MultipleWalletConnect.kt", mo48633l = {136}, mo48634m = "invokeSuspend")
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$4$1$1$1$onApprove$1$ethTransaction$1 */
/* compiled from: MultipleWalletConnect.kt */
public final class MultipleWalletConnect$4$1$1$1$onApprove$1$ethTransaction$1 extends SuspendLambda implements fd2<hu0, ns0<? super ss1>, Object> {
    public final /* synthetic */ MultipleWalletConnect.C8883c $it;
    public int label;
    public final /* synthetic */ MultipleWalletConnect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultipleWalletConnect$4$1$1$1$onApprove$1$ethTransaction$1(MultipleWalletConnect multipleWalletConnect, MultipleWalletConnect.C8883c cVar, ns0<? super MultipleWalletConnect$4$1$1$1$onApprove$1$ethTransaction$1> ns0) {
        super(2, ns0);
        this.this$0 = multipleWalletConnect;
        this.$it = cVar;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new MultipleWalletConnect$4$1$1$1$onApprove$1$ethTransaction$1(this.this$0, this.$it, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super ss1> ns0) {
        return ((MultipleWalletConnect$4$1$1$1$onApprove$1$ethTransaction$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            WalletConnect walletConnect = (WalletConnect) this.this$0.f43102f.get(this.$it.mo61941c().getPeerId());
            if (walletConnect == null) {
                return null;
            }
            RoomConnectedInfo c = this.$it.mo61941c();
            long a = this.$it.mo61939a();
            WCEthereumTransaction b = this.$it.mo61940b();
            this.label = 1;
            obj = WalletConnect.m69392k(walletConnect, c, a, b, false, this, 8, (Object) null);
            if (obj == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (ss1) obj;
    }
}
