package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import net.safemoon.androidwallet.fragments.ManageContactsFragment;

/* renamed from: cn3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class cn3 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ ManageContactsFragment f37167a;

    public /* synthetic */ cn3(ManageContactsFragment manageContactsFragment) {
        this.f37167a = manageContactsFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return ManageContactsFragment.m66595G(this.f37167a, textView, i, keyEvent);
    }
}
