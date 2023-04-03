package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.viewmodels.TransferViewModel;
import net.safemoon.androidwallet.viewmodels.blockChainClass.Transfer;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransferViewModel$getEstimateGas$1", mo48632f = "TransferViewModel.kt", mo48633l = {62}, mo48634m = "invokeSuspend")
/* compiled from: TransferViewModel.kt */
public final class TransferViewModel$getEstimateGas$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ TransferViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransferViewModel$getEstimateGas$1$1", mo48632f = "TransferViewModel.kt", mo48633l = {65}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$getEstimateGas$1$1 */
    /* compiled from: TransferViewModel.kt */
    public static final class C88691 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C88691(transferViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C88691) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            TransferViewModel transferViewModel;
            Transfer transfer;
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                Transfer o = transferViewModel.mo61766o();
                vx2.m53588d(o);
                transferViewModel = transferViewModel;
                this.L$0 = transferViewModel;
                this.L$1 = o;
                this.label = 1;
                if (o.mo61860g(this) == d) {
                    return d;
                }
                transfer = o;
            } else if (i == 1) {
                transfer = (Transfer) this.L$1;
                transferViewModel = (TransferViewModel) this.L$0;
                try {
                    hg5.m45199b(obj);
                } catch (Exception unused) {
                    transferViewModel.mo61760i().postValue(new TransferViewModel.C8862a(false, (Double) null));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transferViewModel.mo61760i().postValue(new TransferViewModel.C8862a(true, transfer.mo61862i()));
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferViewModel$getEstimateGas$1(TransferViewModel transferViewModel, ns0<? super TransferViewModel$getEstimateGas$1> ns0) {
        super(2, ns0);
        this.this$0 = transferViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new TransferViewModel$getEstimateGas$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((TransferViewModel$getEstimateGas$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final TransferViewModel transferViewModel = this.this$0;
            C88691 r1 = new C88691((ns0<? super C88691>) null);
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
