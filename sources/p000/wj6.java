package p000;

import android.view.View;
import net.safemoon.androidwallet.fragments.SwitchWalletFragment;
import net.safemoon.androidwallet.model.wallets.Wallet;

/* renamed from: wj6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class wj6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SwitchWalletFragment f45723a;

    /* renamed from: d */
    public final /* synthetic */ Wallet f45724d;

    public /* synthetic */ wj6(SwitchWalletFragment switchWalletFragment, Wallet wallet2) {
        this.f45723a = switchWalletFragment;
        this.f45724d = wallet2;
    }

    public final void onClick(View view) {
        SwitchWalletFragment.m67425z0(this.f45723a, this.f45724d, view);
    }
}
