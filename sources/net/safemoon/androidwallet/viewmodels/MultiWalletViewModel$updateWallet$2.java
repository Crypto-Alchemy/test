package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.repository.WalletDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$updateWallet$2", mo48632f = "MultiWalletViewModel.kt", mo48633l = {101}, mo48634m = "invokeSuspend")
/* compiled from: MultiWalletViewModel.kt */
public final class MultiWalletViewModel$updateWallet$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ pc2<r37> $callBack;
    public final /* synthetic */ String $newName;
    public final /* synthetic */ Wallet $wallet;
    public int label;
    public final /* synthetic */ MultiWalletViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$updateWallet$2$1", mo48632f = "MultiWalletViewModel.kt", mo48633l = {103}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$updateWallet$2$1 */
    /* compiled from: MultiWalletViewModel.kt */
    public static final class C87081 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87081(wallet2, multiWalletViewModel, str, pc2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87081) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            MultiWalletViewModel multiWalletViewModel;
            pc2<r37> pc2;
            Long id;
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                Wallet wallet2 = wallet2;
                if (!(wallet2 == null || (id = wallet2.getId()) == null)) {
                    multiWalletViewModel = multiWalletViewModel;
                    String str = str;
                    pc2<r37> pc22 = pc2;
                    long longValue = id.longValue();
                    WalletDataSource j = multiWalletViewModel.mo61260v();
                    this.L$0 = multiWalletViewModel;
                    this.L$1 = pc22;
                    this.label = 1;
                    if (j.mo60780l(longValue, str, this) == d) {
                        return d;
                    }
                    pc2 = pc22;
                }
                return r37.f33317a;
            } else if (i == 1) {
                pc2 = (pc2) this.L$1;
                multiWalletViewModel = (MultiWalletViewModel) this.L$0;
                hg5.m45199b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y23 unused = d50.m56748b(cd7.m11843a(multiWalletViewModel), (CoroutineContext) null, (CoroutineStart) null, new MultiWalletViewModel$updateWallet$2$1$1$1(pc2, (ns0<? super MultiWalletViewModel$updateWallet$2$1$1$1>) null), 3, (Object) null);
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiWalletViewModel$updateWallet$2(Wallet wallet2, MultiWalletViewModel multiWalletViewModel, String str, pc2<r37> pc2, ns0<? super MultiWalletViewModel$updateWallet$2> ns0) {
        super(2, ns0);
        this.$wallet = wallet2;
        this.this$0 = multiWalletViewModel;
        this.$newName = str;
        this.$callBack = pc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new MultiWalletViewModel$updateWallet$2(this.$wallet, this.this$0, this.$newName, this.$callBack, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((MultiWalletViewModel$updateWallet$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final Wallet wallet2 = this.$wallet;
            final MultiWalletViewModel multiWalletViewModel = this.this$0;
            final String str = this.$newName;
            final pc2<r37> pc2 = this.$callBack;
            C87081 r3 = new C87081((ns0<? super C87081>) null);
            this.label = 1;
            if (b50.m55768e(b, r3, this) == d) {
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
