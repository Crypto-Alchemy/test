package p000;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import net.safemoon.androidwallet.fragments.TransferHistoryFragment;

/* renamed from: qu6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class qu6 implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ PopupWindow f44246a;

    public /* synthetic */ qu6(PopupWindow popupWindow) {
        this.f44246a = popupWindow;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return TransferHistoryFragment.m67568X0(this.f44246a, view, motionEvent);
    }
}
