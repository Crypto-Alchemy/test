package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransferViewModel$fetchAllTokens$1", mo48632f = "TransferViewModel.kt", mo48633l = {43}, mo48634m = "invokeSuspend")
/* compiled from: TransferViewModel.kt */
public final class TransferViewModel$fetchAllTokens$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ TokenType $tokenType;
    public int label;
    public final /* synthetic */ TransferViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransferViewModel$fetchAllTokens$1$1", mo48632f = "TransferViewModel.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$fetchAllTokens$1$1 */
    /* compiled from: TransferViewModel.kt */
    public static final class C88681 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C88681(transferViewModel, tokenType, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C88681) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                k04<List<IToken>> e = transferViewModel.mo61756e();
                C7126gf gfVar = C7126gf.f38011a;
                Application b = transferViewModel.mo27549b();
                vx2.m53590f(b, "getApplication()");
                e.postValue(gfVar.mo51908b(b).mo51655a(tokenType));
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferViewModel$fetchAllTokens$1(TransferViewModel transferViewModel, TokenType tokenType, ns0<? super TransferViewModel$fetchAllTokens$1> ns0) {
        super(2, ns0);
        this.this$0 = transferViewModel;
        this.$tokenType = tokenType;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new TransferViewModel$fetchAllTokens$1(this.this$0, this.$tokenType, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((TransferViewModel$fetchAllTokens$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final TransferViewModel transferViewModel = this.this$0;
            final TokenType tokenType = this.$tokenType;
            C88681 r1 = new C88681((ns0<? super C88681>) null);
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
