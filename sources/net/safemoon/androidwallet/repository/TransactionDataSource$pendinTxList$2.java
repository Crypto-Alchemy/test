package net.safemoon.androidwallet.repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.service.TxnListService;

@Metadata(mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: TransactionDataSource.kt */
public final class TransactionDataSource$pendinTxList$2 extends Lambda implements pc2<List<? extends Result>> {
    public final /* synthetic */ TransactionDataSource this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.repository.TransactionDataSource$pendinTxList$2$a */
    /* compiled from: Comparisons.kt */
    public static final class C8613a<T> implements Comparator {
        public final int compare(T t, T t2) {
            String str = ((Result) t2).timeStamp;
            vx2.m53590f(str, "it.timeStamp");
            Long valueOf = Long.valueOf(Long.parseLong(str));
            String str2 = ((Result) t).timeStamp;
            vx2.m53590f(str2, "it.timeStamp");
            return xl0.m54426a(valueOf, Long.valueOf(Long.parseLong(str2)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionDataSource$pendinTxList$2(TransactionDataSource transactionDataSource) {
        super(0);
        this.this$0 = transactionDataSource;
    }

    public final List<Result> invoke() {
        List<Result> a = TxnListService.f42549B.mo60835a(this.this$0.f42530c);
        TransactionDataSource transactionDataSource = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (T next : a) {
            if (vx2.m53586b(((Result) next).tokenSymbol, transactionDataSource.f42532e.getSymbol())) {
                arrayList.add(next);
            }
        }
        return CollectionsKt___CollectionsKt.m47304D0(arrayList, new C8613a());
    }
}
