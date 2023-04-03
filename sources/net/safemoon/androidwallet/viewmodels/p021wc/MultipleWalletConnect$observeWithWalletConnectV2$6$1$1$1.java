package net.safemoon.androidwallet.viewmodels.p021wc;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall;
import net.safemoon.androidwallet.viewmodels.p021wc.MultipleWalletConnect;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/wc/MultipleWalletConnect$observeWithWalletConnectV2$6$1$1$1", "Lnet/safemoon/androidwallet/dialogs/WalletConnectSmartContractCall$c;", "", "sign", "Lr37;", "c", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$6$1$1$1 */
/* compiled from: MultipleWalletConnect.kt */
public final class MultipleWalletConnect$observeWithWalletConnectV2$6$1$1$1 extends WalletConnectSmartContractCall.C8339c {

    /* renamed from: a */
    public final /* synthetic */ WalletConnectSmartContractCall f43157a;

    /* renamed from: b */
    public final /* synthetic */ MultipleWalletConnect.C8885e f43158b;

    /* renamed from: c */
    public final /* synthetic */ MultipleWalletConnect f43159c;

    public MultipleWalletConnect$observeWithWalletConnectV2$6$1$1$1(WalletConnectSmartContractCall walletConnectSmartContractCall, MultipleWalletConnect.C8885e eVar, MultipleWalletConnect multipleWalletConnect) {
        this.f43157a = walletConnectSmartContractCall;
        this.f43158b = eVar;
        this.f43159c = multipleWalletConnect;
    }

    /* renamed from: a */
    public void mo57350a() {
    }

    /* renamed from: b */
    public void mo57351b() {
        this.f43159c.f43100d.mo62073e(C8916x72274e68.INSTANCE);
    }

    /* renamed from: c */
    public void mo57352c(String str) {
        LifecycleCoroutineScope a;
        vx2.m53591g(str, "sign");
        super.mo57352c(str);
        FragmentActivity activity = this.f43157a.getActivity();
        if (activity != null && (a = vg3.m28804a(activity)) != null) {
            y23 unused = d50.m56748b(a, (CoroutineContext) null, (CoroutineStart) null, new C8917xc041e182(str, this.f43158b, this.f43157a, this.f43159c, (ns0<? super C8917xc041e182>) null), 3, (Object) null);
        }
    }
}
