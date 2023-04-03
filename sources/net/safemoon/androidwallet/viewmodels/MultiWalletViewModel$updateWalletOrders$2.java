package net.safemoon.androidwallet.viewmodels;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.repository.WalletDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$updateWalletOrders$2", mo48632f = "MultiWalletViewModel.kt", mo48633l = {148}, mo48634m = "invokeSuspend")
/* compiled from: MultiWalletViewModel.kt */
public final class MultiWalletViewModel$updateWalletOrders$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ List<Pair<Long, Integer>> $orderOfWallet;
    public int label;
    public final /* synthetic */ MultiWalletViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$updateWalletOrders$2$1", mo48632f = "MultiWalletViewModel.kt", mo48633l = {149}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$updateWalletOrders$2$1 */
    /* compiled from: MultiWalletViewModel.kt */
    public static final class C87101 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87101(multiWalletViewModel, list, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87101) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                WalletDataSource j = multiWalletViewModel.mo61260v();
                Pair[] pairArr = (Pair[]) list.toArray(new Pair[0]);
                this.label = 1;
                if (j.mo60781m((Pair[]) Arrays.copyOf(pairArr, pairArr.length), this) == d) {
                    return d;
                }
            } else if (i == 1) {
                hg5.m45199b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            multiWalletViewModel.mo61244C(list);
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiWalletViewModel$updateWalletOrders$2(MultiWalletViewModel multiWalletViewModel, List<Pair<Long, Integer>> list, ns0<? super MultiWalletViewModel$updateWalletOrders$2> ns0) {
        super(2, ns0);
        this.this$0 = multiWalletViewModel;
        this.$orderOfWallet = list;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new MultiWalletViewModel$updateWalletOrders$2(this.this$0, this.$orderOfWallet, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((MultiWalletViewModel$updateWalletOrders$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final MultiWalletViewModel multiWalletViewModel = this.this$0;
            final List<Pair<Long, Integer>> list = this.$orderOfWallet;
            C87101 r1 = new C87101((ns0<? super C87101>) null);
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
