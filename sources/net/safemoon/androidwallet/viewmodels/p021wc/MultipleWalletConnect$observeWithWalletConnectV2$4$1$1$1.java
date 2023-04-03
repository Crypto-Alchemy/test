package net.safemoon.androidwallet.viewmodels.p021wc;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall;
import net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect;
import net.safemoon.androidwallet.viewmodels.wcv2.Wc2Web3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$observeWithWalletConnectV2$4$1$1$1", "Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall$c;", "Lr37;", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$4$1$1$1 */
/* compiled from: MultipleWalletConnect.kt */
public final class MultipleWalletConnect$observeWithWalletConnectV2$4$1$1$1 extends WalletConnectSmartContractCall.C8339c {

    /* renamed from: a */
    public final /* synthetic */ MultipleWalletConnect.C8883c f43150a;

    /* renamed from: b */
    public final /* synthetic */ WalletConnectSmartContractCall f43151b;

    /* renamed from: c */
    public final /* synthetic */ MultipleWalletConnect f43152c;

    public MultipleWalletConnect$observeWithWalletConnectV2$4$1$1$1(MultipleWalletConnect.C8883c cVar, WalletConnectSmartContractCall walletConnectSmartContractCall, MultipleWalletConnect multipleWalletConnect) {
        this.f43150a = cVar;
        this.f43151b = walletConnectSmartContractCall;
        this.f43152c = multipleWalletConnect;
    }

    /* renamed from: a */
    public void mo57350a() {
        Wc2Web3 wc2Web3 = new Wc2Web3(this.f43150a.mo61941c().getChainId(), this.f43150a.mo61942d());
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new C8908x29cea29c(wc2Web3, this.f43150a, this.f43151b, this.f43152c, (ns0<? super C8908x29cea29c>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public void mo57351b() {
        this.f43152c.f43100d.mo62073e(C8912xe9038a2a.INSTANCE);
    }
}
