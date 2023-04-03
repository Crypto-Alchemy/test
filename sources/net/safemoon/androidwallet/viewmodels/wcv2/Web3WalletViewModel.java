package net.safemoon.androidwallet.viewmodels.wcv2;

import com.walletconnect.web3.wallet.client.Web3Wallet;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import p000.i06;
import p000.ig7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/Web3WalletViewModel;", "Lad7;", "", "pairingUri", "Lr37;", "c", "Lxz5;", "Ltj7;", "a", "Lxz5;", "b", "()Lxz5;", "walletEvents", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Web3WalletViewModel.kt */
public final class Web3WalletViewModel extends ad7 {

    /* renamed from: a */
    public final xz5<tj7> f43185a = FlowKt__ShareKt.m63369f(new Web3WalletViewModel$special$$inlined$map$1(WCDelegate.f43174a.mo62021o()), cd7.m11843a(this), i06.C7198a.m58757b(i06.f38305a, 0, 0, 3, (Object) null), 0, 4, (Object) null);

    /* renamed from: b */
    public final xz5<tj7> mo62038b() {
        return this.f43185a;
    }

    /* renamed from: c */
    public final void mo62039c(String str) {
        vx2.m53591g(str, "pairingUri");
        Web3Wallet.m43030j(Web3Wallet.f27840a, new ig7.C5962c(str), (rc2) null, Web3WalletViewModel$pair$1.INSTANCE, 2, (Object) null);
    }
}
