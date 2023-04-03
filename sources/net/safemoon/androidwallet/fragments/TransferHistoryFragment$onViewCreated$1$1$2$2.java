package net.safemoon.androidwallet.fragments;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.common.PaymentMethod;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/content/DialogInterface;", "<anonymous parameter 0>", "Lr37;", "invoke", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferHistoryFragment.kt */
public final class TransferHistoryFragment$onViewCreated$1$1$2$2 extends Lambda implements rc2<DialogInterface, r37> {
    public final /* synthetic */ UserTokenItemDisplayModel $it;
    public final /* synthetic */ TransferHistoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferHistoryFragment$onViewCreated$1$1$2$2(TransferHistoryFragment transferHistoryFragment, UserTokenItemDisplayModel userTokenItemDisplayModel) {
        super(1);
        this.this$0 = transferHistoryFragment;
        this.$it = userTokenItemDisplayModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DialogInterface) obj);
        return r37.f33317a;
    }

    public final void invoke(DialogInterface dialogInterface) {
        vx2.m53591g(dialogInterface, "<anonymous parameter 0>");
        this.this$0.mo57893i0(PaymentMethod.MOONPAY, ap2.m55613a(this.$it.getSymbolWithType()).mo67355c(), TokenType.Companion.mo57099b(this.$it.getChainId()).getCoinType().getValue(), false);
    }
}
