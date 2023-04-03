package p000;

import android.view.View;
import net.safemoon.androidwallet.fragments.TransferHistoryFragment;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

/* renamed from: iu6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class iu6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TransferHistoryFragment f38520a;

    /* renamed from: d */
    public final /* synthetic */ UserTokenItemDisplayModel f38521d;

    public /* synthetic */ iu6(TransferHistoryFragment transferHistoryFragment, UserTokenItemDisplayModel userTokenItemDisplayModel) {
        this.f38520a = transferHistoryFragment;
        this.f38521d = userTokenItemDisplayModel;
    }

    public final void onClick(View view) {
        TransferHistoryFragment.m67535E0(this.f38520a, this.f38521d, view);
    }
}
