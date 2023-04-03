package p000;

import android.view.View;
import net.safemoon.androidwallet.fragments.SwitchWalletFragment;
import net.safemoon.androidwallet.model.wallets.Wallet;

/* renamed from: vj6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class vj6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SwitchWalletFragment f45317a;

    /* renamed from: d */
    public final /* synthetic */ Wallet f45318d;

    public /* synthetic */ vj6(SwitchWalletFragment switchWalletFragment, Wallet wallet2) {
        this.f45317a = switchWalletFragment;
        this.f45318d = wallet2;
    }

    public final void onClick(View view) {
        SwitchWalletFragment.m67423y0(this.f45317a, this.f45318d, view);
    }
}
