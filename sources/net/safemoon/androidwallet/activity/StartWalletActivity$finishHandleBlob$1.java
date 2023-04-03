package net.safemoon.androidwallet.activity;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "list", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: StartWalletActivity.kt */
public final class StartWalletActivity$finishHandleBlob$1 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ Wallet $activeWallet;
    public final /* synthetic */ boolean $updateWalletInfo;
    public final /* synthetic */ StartWalletActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartWalletActivity$finishHandleBlob$1(Wallet wallet2, StartWalletActivity startWalletActivity, boolean z) {
        super(1);
        this.$activeWallet = wallet2;
        this.this$0 = startWalletActivity;
        this.$updateWalletInfo = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<Wallet> list) {
        vx2.m53591g(list, "list");
        Wallet wallet2 = this.$activeWallet;
        boolean z = false;
        if (((wallet2 != null && wallet2.isPrimaryWallet()) || this.$activeWallet == null) && list.size() > 1 && !g06.f37938a.mo51834c(this.this$0)) {
            this.this$0.f8530x.mo61245D(list.get(1));
        }
        if (this.$updateWalletInfo) {
            boolean z2 = true;
            for (Wallet next : list) {
                if (next.isPrimaryWallet()) {
                    if (!next.isLinked()) {
                        this.this$0.f8530x.mo61247F(next, 1, (pc2<r37>) null);
                    }
                } else if (!CollectionsKt___CollectionsKt.m47320R(this.this$0.f41496e0, Wallet.getAddress$default(next, 0, 1, (Object) null))) {
                    this.this$0.f8530x.mo61247F(next, 0, (pc2<r37>) null);
                    z2 = false;
                } else if (!this.this$0.f41497k0.containsKey(Wallet.getAddress$default(next, 0, 1, (Object) null)) || vx2.m53586b(next.getName(), this.this$0.f41497k0.get(Wallet.getAddress$default(next, 0, 1, (Object) null)))) {
                    this.this$0.f8530x.mo61247F(next, 1, (pc2<r37>) null);
                } else {
                    MultiWalletViewModel D0 = this.this$0.f8530x;
                    Object obj = this.this$0.f41497k0.get(Wallet.getAddress$default(next, 0, 1, (Object) null));
                    vx2.m53588d(obj);
                    D0.mo61248G(next, (String) obj, 1, (pc2<r37>) null);
                }
            }
            if (list.size() != 1) {
                z = z2;
            }
            g06.f37938a.mo51839h(this.this$0, z);
        }
        this.this$0.mo56887N0();
    }
}
