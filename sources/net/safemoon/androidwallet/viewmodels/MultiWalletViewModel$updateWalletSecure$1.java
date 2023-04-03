package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.repository.WalletDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$updateWalletSecure$1", mo48632f = "MultiWalletViewModel.kt", mo48633l = {166}, mo48634m = "invokeSuspend")
/* compiled from: MultiWalletViewModel.kt */
public final class MultiWalletViewModel$updateWalletSecure$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ pc2<r37> $callBack;
    public final /* synthetic */ Ref$ObjectRef<String> $encryptedMnemonic;
    public final /* synthetic */ String $encryptedPrivateKey;
    public final /* synthetic */ int $order;
    public final /* synthetic */ String $u5B64;
    public final /* synthetic */ Wallet $wallet;
    public int label;
    public final /* synthetic */ MultiWalletViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$updateWalletSecure$1$1", mo48632f = "MultiWalletViewModel.kt", mo48633l = {169}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$updateWalletSecure$1$1 */
    /* compiled from: MultiWalletViewModel.kt */
    public static final class C87111 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87111(wallet2, multiWalletViewModel, str, ref$ObjectRef, str2, i2, pc2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87111) create(hu0, ns0)).invokeSuspend(r37.f33317a);
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
                    Wallet wallet3 = wallet2;
                    MultiWalletViewModel multiWalletViewModel2 = multiWalletViewModel;
                    String str = str;
                    Ref$ObjectRef<String> ref$ObjectRef = ref$ObjectRef;
                    String str2 = str2;
                    int i2 = i2;
                    pc2<r37> pc22 = pc2;
                    long longValue = id.longValue();
                    String I = yb6.m74332I(yb6.m74332I(wallet3.getName(), "|", "", false, 4, (Object) null), ",", "", false, 4, (Object) null);
                    WalletDataSource j = multiWalletViewModel2.mo61260v();
                    vx2.m53590f(str, "encryptedPrivateKey");
                    T t = ref$ObjectRef.element;
                    vx2.m53590f(str2, "u5B64");
                    this.L$0 = multiWalletViewModel2;
                    this.L$1 = pc22;
                    this.label = 1;
                    if (j.mo60782n(longValue, str, (String) t, (String) t, str2, i2, I, this) == d) {
                        return d;
                    }
                    multiWalletViewModel = multiWalletViewModel2;
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
            y23 unused = d50.m56748b(cd7.m11843a(multiWalletViewModel), (CoroutineContext) null, (CoroutineStart) null, new MultiWalletViewModel$updateWalletSecure$1$1$1$1(pc2, (ns0<? super MultiWalletViewModel$updateWalletSecure$1$1$1$1>) null), 3, (Object) null);
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiWalletViewModel$updateWalletSecure$1(Wallet wallet2, MultiWalletViewModel multiWalletViewModel, String str, Ref$ObjectRef<String> ref$ObjectRef, String str2, int i, pc2<r37> pc2, ns0<? super MultiWalletViewModel$updateWalletSecure$1> ns0) {
        super(2, ns0);
        this.$wallet = wallet2;
        this.this$0 = multiWalletViewModel;
        this.$encryptedPrivateKey = str;
        this.$encryptedMnemonic = ref$ObjectRef;
        this.$u5B64 = str2;
        this.$order = i;
        this.$callBack = pc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new MultiWalletViewModel$updateWalletSecure$1(this.$wallet, this.this$0, this.$encryptedPrivateKey, this.$encryptedMnemonic, this.$u5B64, this.$order, this.$callBack, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((MultiWalletViewModel$updateWalletSecure$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final Wallet wallet2 = this.$wallet;
            final MultiWalletViewModel multiWalletViewModel = this.this$0;
            final String str = this.$encryptedPrivateKey;
            final Ref$ObjectRef<String> ref$ObjectRef = this.$encryptedMnemonic;
            final String str2 = this.$u5B64;
            final int i2 = this.$order;
            final pc2<r37> pc2 = this.$callBack;
            C87111 r3 = new C87111((ns0<? super C87111>) null);
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
