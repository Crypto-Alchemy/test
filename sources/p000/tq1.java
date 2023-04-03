package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import net.safemoon.androidwallet.activity.EnterPasswordActivity;

/* renamed from: tq1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class tq1 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ EnterPasswordActivity f44806a;

    public /* synthetic */ tq1(EnterPasswordActivity enterPasswordActivity) {
        this.f44806a = enterPasswordActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return EnterPasswordActivity.m65333e0(this.f44806a, textView, i, keyEvent);
    }
}
