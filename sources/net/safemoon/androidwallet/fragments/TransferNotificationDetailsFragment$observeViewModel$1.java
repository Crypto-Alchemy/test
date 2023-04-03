package net.safemoon.androidwallet.fragments;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.transaction.details.TransactionDetailsData;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.TransferViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/transaction/details/TransactionDetailsData;", "transactionDetails", "Lr37;", "invoke", "(Lnet/safemoon/androidwallet/model/transaction/details/TransactionDetailsData;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: TransferNotificationDetailsFragment.kt */
public final class TransferNotificationDetailsFragment$observeViewModel$1 extends Lambda implements rc2<TransactionDetailsData, r37> {
    public final /* synthetic */ Ref$ObjectRef<TokenType> $chainForDetails;
    public final /* synthetic */ TransferNotificationDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferNotificationDetailsFragment$observeViewModel$1(TransferNotificationDetailsFragment transferNotificationDetailsFragment, Ref$ObjectRef<TokenType> ref$ObjectRef) {
        super(1);
        this.this$0 = transferNotificationDetailsFragment;
        this.$chainForDetails = ref$ObjectRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TransactionDetailsData) obj);
        return r37.f33317a;
    }

    public final void invoke(TransactionDetailsData transactionDetailsData) {
        if (transactionDetailsData != null) {
            cb2 w = this.this$0.f42274y;
            vx2.m53588d(w);
            w.f21655c.setVisibility(0);
            cb2 w2 = this.this$0.f42274y;
            vx2.m53588d(w2);
            w2.f21657e.setVisibility(8);
            this.this$0.mo57925J(transactionDetailsData);
            TokenType.C8246a aVar = TokenType.Companion;
            TokenType c = aVar.mo57100c(transactionDetailsData.getChain());
            Context requireContext = this.this$0.requireContext();
            vx2.m53590f(requireContext, "requireContext()");
            Wallet c2 = ol0.m70351c(requireContext);
            String address = c2 != null ? c2.getAddress(c.getCoinType().getValue()) : null;
            this.$chainForDetails.element = aVar.mo57100c(transactionDetailsData.getChain());
            TransferViewModel y = this.this$0.mo57921C();
            String hash = transactionDetailsData.getHash();
            T t = this.$chainForDetails.element;
            vx2.m53588d(t);
            y.mo61765n(hash, (TokenType) t, address);
            TransferViewModel y2 = this.this$0.mo57921C();
            T t2 = this.$chainForDetails.element;
            vx2.m53588d(t2);
            y2.mo61763l((TokenType) t2, transactionDetailsData.getHash(), transactionDetailsData.getFrom());
        }
    }
}
