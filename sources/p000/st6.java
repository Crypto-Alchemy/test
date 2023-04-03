package p000;

import android.view.View;
import net.safemoon.androidwallet.adapter.TransactionAdapter;
import net.safemoon.androidwallet.model.transaction.history.Result;

/* renamed from: st6 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class st6 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TransactionAdapter f44603a;

    /* renamed from: d */
    public final /* synthetic */ Result f44604d;

    public /* synthetic */ st6(TransactionAdapter transactionAdapter, Result result) {
        this.f44603a = transactionAdapter;
        this.f44604d = result;
    }

    public final void onClick(View view) {
        TransactionAdapter.C8232b.m65707e(this.f44603a, this.f44604d, view);
    }
}
