package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import android.os.Bundle;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MyTokensListViewModel$updateNativeBalances$1$1", mo48632f = "MyTokensListViewModel.kt", mo48633l = {547}, mo48634m = "invokeSuspend")
/* compiled from: MyTokensListViewModel.kt */
public final class MyTokensListViewModel$updateNativeBalances$1$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ IToken $it;
    public int label;
    public final /* synthetic */ MyTokensListViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MyTokensListViewModel$updateNativeBalances$1$1$1", mo48632f = "MyTokensListViewModel.kt", mo48633l = {559}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.MyTokensListViewModel$updateNativeBalances$1$1$1 */
    /* compiled from: MyTokensListViewModel.kt */
    public static final class C87201 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87201(iToken, myTokensListViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87201) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                a14 a14 = a14.f36348a;
                TokenType b = TokenType.Companion.mo57099b(iToken.getChainId());
                String contractAddress = iToken.getContractAddress();
                Application b2 = myTokensListViewModel.mo27549b();
                vx2.m53590f(b2, "getApplication<Application>()");
                Wallet c = ol0.m70351c(b2);
                vx2.m53588d(c);
                this.label = 1;
                obj = a14.mo50041a(b, contractAddress, c, this);
                if (obj == d) {
                    return d;
                }
            } else if (i == 1) {
                try {
                    hg5.m45199b(obj);
                } catch (Exception e) {
                    Bundle bundle = new Bundle();
                    bundle.putString("updateNativeBalances", "UpdateNativeBalanceError");
                    bundle.putSerializable("Key", e);
                    myTokensListViewModel.mo61290B().mo36096a("select_item", bundle);
                    String localizedMessage = e.getLocalizedMessage();
                    if (localizedMessage == null) {
                        localizedMessage = e.getMessage();
                    }
                    if (localizedMessage != null) {
                        ol0.m70350b0(localizedMessage, "ErrorFetch");
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String bigInteger = ((BigInteger) obj).toString();
            vx2.m53590f(bigInteger, "balance.toString()");
            BigDecimal q = ol0.m70375q(bigInteger, iToken.getDecimals());
            vx2.m53588d(q);
            myTokensListViewModel.f42771c.mo50490b(iToken.getSymbolWithType(), q.doubleValue());
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyTokensListViewModel$updateNativeBalances$1$1(IToken iToken, MyTokensListViewModel myTokensListViewModel, ns0<? super MyTokensListViewModel$updateNativeBalances$1$1> ns0) {
        super(2, ns0);
        this.$it = iToken;
        this.this$0 = myTokensListViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new MyTokensListViewModel$updateNativeBalances$1$1(this.$it, this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((MyTokensListViewModel$updateNativeBalances$1$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final IToken iToken = this.$it;
            final MyTokensListViewModel myTokensListViewModel = this.this$0;
            C87201 r1 = new C87201((ns0<? super C87201>) null);
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
