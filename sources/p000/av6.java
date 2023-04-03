package p000;

import android.view.View;
import net.safemoon.androidwallet.fragments.TransferHistoryFragment;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

/* renamed from: av6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class av6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TransferHistoryFragment f36579a;

    /* renamed from: d */
    public final /* synthetic */ UserTokenItemDisplayModel f36580d;

    public /* synthetic */ av6(TransferHistoryFragment transferHistoryFragment, UserTokenItemDisplayModel userTokenItemDisplayModel) {
        this.f36579a = transferHistoryFragment;
        this.f36580d = userTokenItemDisplayModel;
    }

    public final void onClick(View view) {
        TransferHistoryFragment.m67539G0(this.f36579a, this.f36580d, view);
    }
}
