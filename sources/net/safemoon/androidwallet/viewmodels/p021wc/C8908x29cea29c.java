package net.safemoon.androidwallet.viewmodels.p021wc;

import android.content.DialogInterface;
import com.trustwallet.walletconnect.models.ethereum.WCEthereumTransaction;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect;
import net.safemoon.androidwallet.viewmodels.wcv2.Wc2Web3;
import net.safemoon.androidwallet.viewmodels.wcv2.sessionrequest.SessionRequestViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$4$1$1$1$onApprove$1", mo48632f = "MultipleWalletConnect.kt", mo48633l = {219, 220}, mo48634m = "invokeSuspend")
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$4$1$1$1$onApprove$1 */
/* compiled from: MultipleWalletConnect.kt */
public final class C8908x29cea29c extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ MultipleWalletConnect.C8883c $it;
    public final /* synthetic */ WalletConnectSmartContractCall $this_apply;
    public final /* synthetic */ Wc2Web3 $wcWeb3;
    public int label;
    public final /* synthetic */ MultipleWalletConnect this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$4$1$1$1$onApprove$1$1", mo48632f = "MultipleWalletConnect.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$4$1$1$1$onApprove$1$1 */
    /* compiled from: MultipleWalletConnect.kt */
    public static final class C89091 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "it", "Lr37;", "onDismiss", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
        /* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$4$1$1$1$onApprove$1$1$a */
        /* compiled from: MultipleWalletConnect.kt */
        public static final class C8910a implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            public static final C8910a f43153a = new C8910a();

            public final void onDismiss(DialogInterface dialogInterface) {
            }
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C89091(ss1, walletConnectSmartContractCall, multipleWalletConnect, cVar, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C89091) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                ss1 ss1 = ss1;
                MultipleWalletConnect.C8883c cVar = cVar;
                WalletConnectSmartContractCall walletConnectSmartContractCall = walletConnectSmartContractCall;
                MultipleWalletConnect multipleWalletConnect = multipleWalletConnect;
                if (ss1.getError() == null && ss1.getTransactionHash() != null) {
                    String r = Common.f42577a.mo60911r(TokenType.Companion.mo57099b(cVar.mo61941c().getChainId()));
                    String transactionHash = ss1.getTransactionHash();
                    wf1.m73588e(new WeakReference(walletConnectSmartContractCall.requireActivity()), r + transactionHash, C8910a.f43153a);
                    SessionRequestViewModel m = multipleWalletConnect.f43100d;
                    String transactionHash2 = ss1.getTransactionHash();
                    vx2.m53590f(transactionHash2, "result.transactionHash");
                    m.mo62070b(transactionHash2, C8911x454b4d84.INSTANCE);
                }
                walletConnectSmartContractCall.mo22266k();
                multipleWalletConnect.mo61916A().postValue(a40.m31670a(true));
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8908x29cea29c(Wc2Web3 wc2Web3, MultipleWalletConnect.C8883c cVar, WalletConnectSmartContractCall walletConnectSmartContractCall, MultipleWalletConnect multipleWalletConnect, ns0<? super C8908x29cea29c> ns0) {
        super(2, ns0);
        this.$wcWeb3 = wc2Web3;
        this.$it = cVar;
        this.$this_apply = walletConnectSmartContractCall;
        this.this$0 = multipleWalletConnect;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new C8908x29cea29c(this.$wcWeb3, this.$it, this.$this_apply, this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((C8908x29cea29c) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            Wc2Web3 wc2Web3 = this.$wcWeb3;
            WCEthereumTransaction b = this.$it.mo61940b();
            this.label = 1;
            obj = wc2Web3.mo62034B(b, this);
            if (obj == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else if (i == 2) {
            hg5.m45199b(obj);
            return r37.f33317a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        final ss1 ss1 = (ss1) obj;
        vm3 c = qh1.m71266c();
        final WalletConnectSmartContractCall walletConnectSmartContractCall = this.$this_apply;
        final MultipleWalletConnect multipleWalletConnect = this.this$0;
        final MultipleWalletConnect.C8883c cVar = this.$it;
        C89091 r3 = new C89091((ns0<? super C89091>) null);
        this.label = 2;
        if (b50.m55768e(c, r3, this) == d) {
            return d;
        }
        return r37.f33317a;
    }
}
