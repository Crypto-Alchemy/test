package p000;

import android.view.MotionEvent;
import android.view.View;
import net.safemoon.androidwallet.fragments.collectibles.TransferNftFragment;

/* renamed from: sv6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class sv6 implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ TransferNftFragment f44613a;

    /* renamed from: d */
    public final /* synthetic */ eb2 f44614d;

    public /* synthetic */ sv6(TransferNftFragment transferNftFragment, eb2 eb2) {
        this.f44613a = transferNftFragment;
        this.f44614d = eb2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return TransferNftFragment.m67881S(this.f44613a, this.f44614d, view, motionEvent);
    }
}
