package net.safemoon.androidwallet.viewmodels;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.repository.WalletDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$getAllWallets$1", mo48632f = "MultiWalletViewModel.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: MultiWalletViewModel.kt */
public final class MultiWalletViewModel$getAllWallets$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ rc2<List<Wallet>, r37> $list;
    public final /* synthetic */ TokenType $tokenType;
    public int label;
    public final /* synthetic */ MultiWalletViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$getAllWallets$1$1", mo48632f = "MultiWalletViewModel.kt", mo48633l = {59}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$getAllWallets$1$1 */
    /* compiled from: MultiWalletViewModel.kt */
    public static final class C87051 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87051(rc2, multiWalletViewModel, tokenType, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87051) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            rc2<List<Wallet>, r37> rc2;
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                rc2<List<Wallet>, r37> rc22 = rc2;
                WalletDataSource j = multiWalletViewModel.mo61260v();
                TokenType tokenType = tokenType;
                this.L$0 = rc22;
                this.label = 1;
                Object d2 = j.mo60772d(tokenType, this);
                if (d2 == d) {
                    return d;
                }
                rc2 = rc22;
                obj = d2;
            } else if (i == 1) {
                rc2 = (rc2) this.L$0;
                hg5.m45199b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rc2.invoke(obj);
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiWalletViewModel$getAllWallets$1(MultiWalletViewModel multiWalletViewModel, rc2<? super List<Wallet>, r37> rc2, TokenType tokenType, ns0<? super MultiWalletViewModel$getAllWallets$1> ns0) {
        super(2, ns0);
        this.this$0 = multiWalletViewModel;
        this.$list = rc2;
        this.$tokenType = tokenType;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new MultiWalletViewModel$getAllWallets$1(this.this$0, this.$list, this.$tokenType, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((MultiWalletViewModel$getAllWallets$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            hu0 a = cd7.m11843a(this.this$0);
            final rc2<List<Wallet>, r37> rc2 = this.$list;
            final MultiWalletViewModel multiWalletViewModel = this.this$0;
            final TokenType tokenType = this.$tokenType;
            y23 unused = d50.m56748b(a, (CoroutineContext) null, (CoroutineStart) null, new C87051((ns0<? super C87051>) null), 3, (Object) null);
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
