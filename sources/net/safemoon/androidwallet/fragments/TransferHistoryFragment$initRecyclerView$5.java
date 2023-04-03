package net.safemoon.androidwallet.fragments;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;", "it", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/tokensInfo/CurrencyTokenInfo;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferHistoryFragment.kt */
public final class TransferHistoryFragment$initRecyclerView$5 extends Lambda implements rc2<CurrencyTokenInfo, r37> {
    public final /* synthetic */ TransferHistoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferHistoryFragment$initRecyclerView$5(TransferHistoryFragment transferHistoryFragment) {
        super(1);
        this.this$0 = transferHistoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CurrencyTokenInfo) obj);
        return r37.f33317a;
    }

    public final void invoke(CurrencyTokenInfo currencyTokenInfo) {
        if (currencyTokenInfo != null) {
            TransferHistoryFragment transferHistoryFragment = this.this$0;
            transferHistoryFragment.f42264y = currencyTokenInfo;
            db2 R = transferHistoryFragment.f42262s;
            AppCompatImageView appCompatImageView = R != null ? R.f28129k : null;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
        }
    }
}
