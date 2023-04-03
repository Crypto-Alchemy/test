package p000;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import net.safemoon.androidwallet.fragments.WalletFragment;

/* renamed from: mh7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class mh7 implements SwipeRefreshLayout.C1408j {

    /* renamed from: a */
    public final /* synthetic */ kb2 f40921a;

    /* renamed from: b */
    public final /* synthetic */ WalletFragment f40922b;

    public /* synthetic */ mh7(kb2 kb2, WalletFragment walletFragment) {
        this.f40921a = kb2;
        this.f40922b = walletFragment;
    }

    public final void onRefresh() {
        WalletFragment.m67652X(this.f40921a, this.f40922b);
    }
}
