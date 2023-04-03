package p000;

import android.view.View;
import android.widget.PopupWindow;
import net.safemoon.androidwallet.fragments.TransferHistoryFragment;

/* renamed from: ru6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ru6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ PopupWindow f44465a;

    /* renamed from: d */
    public final /* synthetic */ TransferHistoryFragment f44466d;

    /* renamed from: e */
    public final /* synthetic */ View f44467e;

    public /* synthetic */ ru6(PopupWindow popupWindow, TransferHistoryFragment transferHistoryFragment, View view) {
        this.f44465a = popupWindow;
        this.f44466d = transferHistoryFragment;
        this.f44467e = view;
    }

    public final void onClick(View view) {
        TransferHistoryFragment.m67552O0(this.f44465a, this.f44466d, this.f44467e, view);
    }
}
