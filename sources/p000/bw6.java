package p000;

import android.view.View;
import net.safemoon.androidwallet.fragments.TransferNotificationDetailsFragment;
import net.safemoon.androidwallet.model.transaction.details.TransactionDetailsData;

/* renamed from: bw6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class bw6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TransferNotificationDetailsFragment f36965a;

    /* renamed from: d */
    public final /* synthetic */ String f36966d;

    /* renamed from: e */
    public final /* synthetic */ TransactionDetailsData f36967e;

    public /* synthetic */ bw6(TransferNotificationDetailsFragment transferNotificationDetailsFragment, String str, TransactionDetailsData transactionDetailsData) {
        this.f36965a = transferNotificationDetailsFragment;
        this.f36966d = str;
        this.f36967e = transactionDetailsData;
    }

    public final void onClick(View view) {
        TransferNotificationDetailsFragment.m67622K(this.f36965a, this.f36966d, this.f36967e, view);
    }
}
