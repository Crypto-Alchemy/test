package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "kotlin.jvm.PlatformType", "result", "Lr37;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferHistoryFragment.kt */
public final class TransferHistoryFragment$initPriceAlertFragmentState$1 extends Lambda implements rc2<Boolean, r37> {
    public final /* synthetic */ TransferHistoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferHistoryFragment$initPriceAlertFragmentState$1(TransferHistoryFragment transferHistoryFragment) {
        super(1);
        this.this$0 = transferHistoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return r37.f33317a;
    }

    public final void invoke(Boolean bool) {
        vx2.m53590f(bool, "result");
        if (bool.booleanValue()) {
            UserTokenItemDisplayModel Z = this.this$0.mo57901q0();
            TransactionHistoryViewModel X = this.this$0.mo57899o0();
            String contractAddress = Z.getContractAddress();
            if (contractAddress.length() == 0) {
                contractAddress = null;
            }
            X.mo61745k(contractAddress, Z.getSymbol());
        }
    }
}
