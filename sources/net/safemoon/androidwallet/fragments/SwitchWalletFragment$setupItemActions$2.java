package net.safemoon.androidwallet.fragments;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/SwitchWalletFragment$setupItemActions$2", "Lez2;", "", "itemPosition", "Lr37;", "b", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SwitchWalletFragment.kt */
public final class SwitchWalletFragment$setupItemActions$2 implements ez2 {

    /* renamed from: a */
    public final /* synthetic */ SwitchWalletFragment f42223a;

    public SwitchWalletFragment$setupItemActions$2(SwitchWalletFragment switchWalletFragment) {
        this.f42223a = switchWalletFragment;
    }

    /* renamed from: a */
    public void mo51553a() {
        if (this.f42223a.f42203I != null) {
            MultiWalletViewModel M = this.f42223a.mo57821n0();
            d24 N = this.f42223a.f42203I;
            if (N == null) {
                vx2.m53605u("myAdapter");
                N = null;
            }
            M.mo61250I(N.mo51034a());
        }
    }

    /* renamed from: b */
    public void mo51554b(int i) {
        d24 N = this.f42223a.f42203I;
        if (N == null) {
            vx2.m53605u("myAdapter");
            N = null;
        }
        Wallet wallet2 = N.mo51034a().get(i);
        SwitchWalletFragment switchWalletFragment = this.f42223a;
        C9001np.m69926K(new WeakReference(switchWalletFragment.requireActivity()), Integer.valueOf(R.string.delete_wallet_title), R.string.delete_wallet_msg, R.string.confirm, R.string.cancel, new SwitchWalletFragment$setupItemActions$2$onItemRemoved$1$1(switchWalletFragment, wallet2), SwitchWalletFragment$setupItemActions$2$onItemRemoved$1$2.INSTANCE);
    }
}
