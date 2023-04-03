package p000;

import android.view.View;
import net.safemoon.androidwallet.fragments.TransferDetailsFragmentStatus;
import net.safemoon.androidwallet.model.transaction.history.Result;

/* renamed from: gu6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class gu6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TransferDetailsFragmentStatus f38065a;

    /* renamed from: d */
    public final /* synthetic */ String f38066d;

    /* renamed from: e */
    public final /* synthetic */ Result f38067e;

    public /* synthetic */ gu6(TransferDetailsFragmentStatus transferDetailsFragmentStatus, String str, Result result) {
        this.f38065a = transferDetailsFragmentStatus;
        this.f38066d = str;
        this.f38067e = result;
    }

    public final void onClick(View view) {
        TransferDetailsFragmentStatus.m67507P(this.f38065a, this.f38066d, this.f38067e, view);
    }
}
