package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import net.safemoon.androidwallet.dialogs.SwapTransactionTimeLimit;

/* renamed from: ej6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ej6 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ SwapTransactionTimeLimit f37562a;

    public /* synthetic */ ej6(SwapTransactionTimeLimit swapTransactionTimeLimit) {
        this.f37562a = swapTransactionTimeLimit;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return SwapTransactionTimeLimit.m66250E(this.f37562a, textView, i, keyEvent);
    }
}
