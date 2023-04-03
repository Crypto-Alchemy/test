package net.safemoon.androidwallet.fragments;

import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.utils.ChartParameter;
import p000.bi0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/WalletFragment$onViewCreated$2$2", "Lbi0$c;", "Lnet/safemoon/androidwallet/model/Coin;", "coin", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WalletFragment.kt */
public final class WalletFragment$onViewCreated$2$2 implements bi0.C6865c {

    /* renamed from: a */
    public final /* synthetic */ WalletFragment f42290a;

    public WalletFragment$onViewCreated$2$2(WalletFragment walletFragment) {
        this.f42290a = walletFragment;
    }

    /* renamed from: a */
    public void mo50597a(Coin coin) {
        vx2.m53591g(coin, "coin");
        FragmentManager childFragmentManager = this.f42290a.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        ce0.m56388h(new ce0(coin, childFragmentManager), (ChartParameter) null, WalletFragment$onViewCreated$2$2$onCoinItemClick$1.INSTANCE, 1, (Object) null);
    }
}
