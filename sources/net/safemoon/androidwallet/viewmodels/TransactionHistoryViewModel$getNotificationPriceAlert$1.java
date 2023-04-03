package net.safemoon.androidwallet.viewmodels;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel$getNotificationPriceAlert$1", mo48632f = "TransactionHistoryViewModel.kt", mo48633l = {104}, mo48634m = "invokeSuspend")
/* compiled from: TransactionHistoryViewModel.kt */
public final class TransactionHistoryViewModel$getNotificationPriceAlert$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ String $tokenAddress;
    public final /* synthetic */ String $tokenSymbol;
    public Object L$0;
    public int label;
    public final /* synthetic */ TransactionHistoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionHistoryViewModel$getNotificationPriceAlert$1(TransactionHistoryViewModel transactionHistoryViewModel, String str, String str2, ns0<? super TransactionHistoryViewModel$getNotificationPriceAlert$1> ns0) {
        super(2, ns0);
        this.this$0 = transactionHistoryViewModel;
        this.$tokenAddress = str;
        this.$tokenSymbol = str2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new TransactionHistoryViewModel$getNotificationPriceAlert$1(this.this$0, this.$tokenAddress, this.$tokenSymbol, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((TransactionHistoryViewModel$getNotificationPriceAlert$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        k04<List<PriceAlertToken>> k04;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            k04<List<PriceAlertToken>> l = this.this$0.mo61746l();
            TransactionHistoryViewModel transactionHistoryViewModel = this.this$0;
            String str = this.$tokenAddress;
            String str2 = this.$tokenSymbol;
            this.L$0 = l;
            this.label = 1;
            Object d2 = transactionHistoryViewModel.mo61748n(str, str2, this);
            if (d2 == d) {
                return d;
            }
            k04 = l;
            obj = d2;
        } else if (i == 1) {
            k04 = (k04) this.L$0;
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k04.postValue(obj);
        return r37.f33317a;
    }
}
