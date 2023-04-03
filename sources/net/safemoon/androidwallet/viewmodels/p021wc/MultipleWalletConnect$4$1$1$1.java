package net.safemoon.androidwallet.viewmodels.p021wc;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall;
import net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$4$1$1$1", "Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall$c;", "Lr37;", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$4$1$1$1 */
/* compiled from: MultipleWalletConnect.kt */
public final class MultipleWalletConnect$4$1$1$1 extends WalletConnectSmartContractCall.C8339c {

    /* renamed from: a */
    public final /* synthetic */ MultipleWalletConnect f43145a;

    /* renamed from: b */
    public final /* synthetic */ MultipleWalletConnect.C8883c f43146b;

    /* renamed from: c */
    public final /* synthetic */ WalletConnectSmartContractCall f43147c;

    public MultipleWalletConnect$4$1$1$1(MultipleWalletConnect multipleWalletConnect, MultipleWalletConnect.C8883c cVar, WalletConnectSmartContractCall walletConnectSmartContractCall) {
        this.f43145a = multipleWalletConnect;
        this.f43146b = cVar;
        this.f43147c = walletConnectSmartContractCall;
    }

    /* renamed from: a */
    public void mo57350a() {
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new MultipleWalletConnect$4$1$1$1$onApprove$1(this.f43145a, this.f43146b, this.f43147c, (ns0<? super MultipleWalletConnect$4$1$1$1$onApprove$1>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public void mo57351b() {
        WalletConnect walletConnect = (WalletConnect) this.f43145a.f43102f.get(this.f43146b.mo61941c().getPeerId());
        if (walletConnect != null) {
            walletConnect.mo62006u(this.f43146b.mo61939a());
        }
        this.f43145a.mo61916A().postValue(Boolean.FALSE);
    }
}
