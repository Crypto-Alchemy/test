package p000;

import android.view.View;
import net.safemoon.androidwallet.adapter.TransactionAdapter;
import net.safemoon.androidwallet.model.transaction.history.Result;

/* renamed from: rt6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class rt6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TransactionAdapter f44461a;

    /* renamed from: d */
    public final /* synthetic */ Result f44462d;

    public /* synthetic */ rt6(TransactionAdapter transactionAdapter, Result result) {
        this.f44461a = transactionAdapter;
        this.f44462d = result;
    }

    public final void onClick(View view) {
        TransactionAdapter.C8232b.m65706d(this.f44461a, this.f44462d, view);
    }
}
