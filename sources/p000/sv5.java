package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import net.safemoon.androidwallet.fragments.SendtoFragment;

/* renamed from: sv5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class sv5 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ SendtoFragment f44612a;

    public /* synthetic */ sv5(SendtoFragment sendtoFragment) {
        this.f44612a = sendtoFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return SendtoFragment.m67052Z(this.f44612a, textView, i, keyEvent);
    }
}
