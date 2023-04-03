package p000;

import android.view.View;
import net.safemoon.androidwallet.fragments.walletconnect.WalletConnectDetailFragment;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;

/* renamed from: lg7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class lg7 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WalletConnectDetailFragment f40616a;

    /* renamed from: d */
    public final /* synthetic */ RoomConnectedInfo f40617d;

    public /* synthetic */ lg7(WalletConnectDetailFragment walletConnectDetailFragment, RoomConnectedInfo roomConnectedInfo) {
        this.f40616a = walletConnectDetailFragment;
        this.f40617d = roomConnectedInfo;
    }

    public final void onClick(View view) {
        WalletConnectDetailFragment.m68077B(this.f40616a, this.f40617d, view);
    }
}
