package p000;

import android.view.View;
import android.widget.PopupWindow;
import net.safemoon.androidwallet.fragments.TransferHistoryFragment;

/* renamed from: su6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class su6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ PopupWindow f44608a;

    /* renamed from: d */
    public final /* synthetic */ TransferHistoryFragment f44609d;

    /* renamed from: e */
    public final /* synthetic */ View f44610e;

    public /* synthetic */ su6(PopupWindow popupWindow, TransferHistoryFragment transferHistoryFragment, View view) {
        this.f44608a = popupWindow;
        this.f44609d = transferHistoryFragment;
        this.f44610e = view;
    }

    public final void onClick(View view) {
        TransferHistoryFragment.m67554P0(this.f44608a, this.f44609d, this.f44610e, view);
    }
}
