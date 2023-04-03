package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import net.safemoon.androidwallet.dialogs.SwapSlipPage;

/* renamed from: ti6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ti6 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ SwapSlipPage f44765a;

    public /* synthetic */ ti6(SwapSlipPage swapSlipPage) {
        this.f44765a = swapSlipPage;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return SwapSlipPage.m66218K(this.f44765a, textView, i, keyEvent);
    }
}
