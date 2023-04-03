package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.repository.WalletDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$deleteWallet$1", mo48632f = "MultiWalletViewModel.kt", mo48633l = {323}, mo48634m = "invokeSuspend")
/* compiled from: MultiWalletViewModel.kt */
public final class MultiWalletViewModel$deleteWallet$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Wallet $wallet;
    public int label;
    public final /* synthetic */ MultiWalletViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$deleteWallet$1$1", mo48632f = "MultiWalletViewModel.kt", mo48633l = {324}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$deleteWallet$1$1 */
    /* compiled from: MultiWalletViewModel.kt */
    public static final class C87031 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87031(multiWalletViewModel, wallet2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87031) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                WalletDataSource j = multiWalletViewModel.mo61260v();
                Wallet wallet2 = wallet2;
                this.label = 1;
                if (j.mo60773e(wallet2, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                hg5.m45199b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hu0 a = cd7.m11843a(multiWalletViewModel);
            final MultiWalletViewModel multiWalletViewModel = multiWalletViewModel;
            y23 unused = d50.m56748b(a, (CoroutineContext) null, (CoroutineStart) null, new fd2<hu0, ns0<? super r37>, Object>((ns0<? super C87041>) null) {
                public int label;

                public final ns0<r37> create(Object obj, ns0<?> ns0) {
                    return 

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public MultiWalletViewModel$deleteWallet$1(MultiWalletViewModel multiWalletViewModel, Wallet wallet2, ns0<? super MultiWalletViewModel$deleteWallet$1> ns0) {
                        super(2, ns0);
                        this.this$0 = multiWalletViewModel;
                        this.$wallet = wallet2;
                    }

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        return new MultiWalletViewModel$deleteWallet$1(this.this$0, this.$wallet, ns0);
                    }

                    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                        return ((MultiWalletViewModel$deleteWallet$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object d = wx2.m54101d();
                        int i = this.label;
                        if (i == 0) {
                            hg5.m45199b(obj);
                            CoroutineDispatcher b = qh1.m71265b();
                            final MultiWalletViewModel multiWalletViewModel = this.this$0;
                            final Wallet wallet2 = this.$wallet;
                            C87031 r1 = new C87031((ns0<? super C87031>) null);
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
