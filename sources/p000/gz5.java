package p000;

import android.widget.CompoundButton;
import net.safemoon.androidwallet.fragments.SettingsFragment;
import net.safemoon.androidwallet.model.wallets.Wallet;

/* renamed from: gz5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class gz5 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SettingsFragment f38132a;

    /* renamed from: b */
    public final /* synthetic */ Wallet f38133b;

    public /* synthetic */ gz5(SettingsFragment settingsFragment, Wallet wallet2) {
        this.f38132a = settingsFragment;
        this.f38133b = wallet2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f38132a.m67095B(this.f38133b, compoundButton, z);
    }
}
