package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import net.safemoon.androidwallet.repository.TransactionDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ldl4;", "", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "invoke", "()Ldl4;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransactionHistoryViewModel.kt */
public final class TransactionHistoryViewModel$transactionListFlow$2 extends Lambda implements pc2<dl4<Integer, Result>> {
    public final /* synthetic */ TokenType $tokenType;
    public final /* synthetic */ UserTokenItemDisplayModel $userTokenItemDisplayModel;
    public final /* synthetic */ TransactionHistoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionHistoryViewModel$transactionListFlow$2(TransactionHistoryViewModel transactionHistoryViewModel, TokenType tokenType, UserTokenItemDisplayModel userTokenItemDisplayModel) {
        super(0);
        this.this$0 = transactionHistoryViewModel;
        this.$tokenType = tokenType;
        this.$userTokenItemDisplayModel = userTokenItemDisplayModel;
    }

    public final dl4<Integer, Result> invoke() {
        Application b = this.this$0.mo27549b();
        vx2.m53590f(b, "getApplication()");
        Wallet c = this.this$0.mo61739e();
        String address = c != null ? c.getAddress(this.$tokenType.getCoinType().getValue()) : null;
        vx2.m53588d(address);
        return new TransactionDataSource(b, address, this.$userTokenItemDisplayModel, this.$tokenType, this.this$0.mo61747m());
    }
}
