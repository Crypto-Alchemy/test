package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import net.safemoon.androidwallet.dialogs.CryptoPriceAlertFragment;

/* renamed from: nw0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class nw0 implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ CryptoPriceAlertFragment f43569a;

    public /* synthetic */ nw0(CryptoPriceAlertFragment cryptoPriceAlertFragment) {
        this.f43569a = cryptoPriceAlertFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return CryptoPriceAlertFragment.m66002T(this.f43569a, dialogInterface, i, keyEvent);
    }
}
