package p000;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import net.safemoon.androidwallet.dialogs.ConfirmSwapTransactionFragment;

/* renamed from: jp0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class jp0 implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ PopupWindow f38756a;

    public /* synthetic */ jp0(PopupWindow popupWindow) {
        this.f38756a = popupWindow;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return ConfirmSwapTransactionFragment.m65976X(this.f38756a, view, motionEvent);
    }
}
