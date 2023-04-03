package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel$transactionListFlow$1", mo48632f = "TransactionHistoryViewModel.kt", mo48633l = {56}, mo48634m = "invokeSuspend")
/* compiled from: TransactionHistoryViewModel.kt */
public final class TransactionHistoryViewModel$transactionListFlow$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ TokenType $tokenType;
    public int label;
    public final /* synthetic */ TransactionHistoryViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel$transactionListFlow$1$1", mo48632f = "TransactionHistoryViewModel.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel$transactionListFlow$1$1 */
    /* compiled from: TransactionHistoryViewModel.kt */
    public static final class C88611 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C88611(transactionHistoryViewModel, tokenType, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C88611) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                k04<List<IToken>> f = transactionHistoryViewModel.mo61740f();
                C7126gf gfVar = C7126gf.f38011a;
                Application b = transactionHistoryViewModel.mo27549b();
                vx2.m53590f(b, "getApplication()");
                f.postValue(gfVar.mo51908b(b).mo51655a(tokenType));
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionHistoryViewModel$transactionListFlow$1(TransactionHistoryViewModel transactionHistoryViewModel, TokenType tokenType, ns0<? super TransactionHistoryViewModel$transactionListFlow$1> ns0) {
        super(2, ns0);
        this.this$0 = transactionHistoryViewModel;
        this.$tokenType = tokenType;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new TransactionHistoryViewModel$transactionListFlow$1(this.this$0, this.$tokenType, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((TransactionHistoryViewModel$transactionListFlow$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final TransactionHistoryViewModel transactionHistoryViewModel = this.this$0;
            final TokenType tokenType = this.$tokenType;
            C88611 r1 = new C88611((ns0<? super C88611>) null);
            this.label = 1;
            if (b50.m55768e(b, r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
