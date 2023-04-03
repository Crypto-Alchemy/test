package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfo;
import net.safemoon.androidwallet.model.tokensInfo.CurrencyTokenInfoResult;
import net.safemoon.androidwallet.utils.Common;
import retrofit2.KotlinExtensions;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel$getCurrencyTokenInfo$1", mo48632f = "TransactionHistoryViewModel.kt", mo48633l = {86}, mo48634m = "invokeSuspend")
/* compiled from: TransactionHistoryViewModel.kt */
public final class TransactionHistoryViewModel$getCurrencyTokenInfo$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ String $tokenAddress;
    public int label;
    public final /* synthetic */ TransactionHistoryViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel$getCurrencyTokenInfo$1$1", mo48632f = "TransactionHistoryViewModel.kt", mo48633l = {89}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.TransactionHistoryViewModel$getCurrencyTokenInfo$1$1 */
    /* compiled from: TransactionHistoryViewModel.kt */
    public static final class C88601 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C88601(str, transactionHistoryViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C88601) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            CurrencyTokenInfo data;
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                ho3 l = C9384u3.m72571l();
                String str = str;
                k90<CurrencyTokenInfoResult> i2 = l.mo52280i(str, Common.f42577a.mo60908o(str));
                this.label = 1;
                obj = KotlinExtensions.m71521c(i2, this);
                if (obj == d) {
                    return d;
                }
            } else if (i == 1) {
                try {
                    hg5.m45199b(obj);
                } catch (Exception unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CurrencyTokenInfoResult currencyTokenInfoResult = (CurrencyTokenInfoResult) ((bg5) obj).mo50578a();
            if (!(currencyTokenInfoResult == null || (data = currencyTokenInfoResult.getData()) == null)) {
                transactionHistoryViewModel.mo61741g().postValue(data);
            }
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionHistoryViewModel$getCurrencyTokenInfo$1(String str, TransactionHistoryViewModel transactionHistoryViewModel, ns0<? super TransactionHistoryViewModel$getCurrencyTokenInfo$1> ns0) {
        super(2, ns0);
        this.$tokenAddress = str;
        this.this$0 = transactionHistoryViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new TransactionHistoryViewModel$getCurrencyTokenInfo$1(this.$tokenAddress, this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((TransactionHistoryViewModel$getCurrencyTokenInfo$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final String str = this.$tokenAddress;
            final TransactionHistoryViewModel transactionHistoryViewModel = this.this$0;
            C88601 r1 = new C88601((ns0<? super C88601>) null);
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
