package net.safemoon.androidwallet.fragments;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.transaction.history.Result;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.TransferHistoryFragment$initRecyclerView$2", mo48632f = "TransferHistoryFragment.kt", mo48633l = {560}, mo48634m = "invokeSuspend")
/* compiled from: TransferHistoryFragment.kt */
public final class TransferHistoryFragment$initRecyclerView$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ TransferHistoryFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lcl4;", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "it", "Lr37;", "a", "(Lcl4;Lns0;)Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.TransferHistoryFragment$initRecyclerView$2$a */
    /* compiled from: TransferHistoryFragment.kt */
    public static final class C8504a<T> implements a52 {

        /* renamed from: a */
        public final /* synthetic */ TransferHistoryFragment f42265a;

        public C8504a(TransferHistoryFragment transferHistoryFragment) {
            this.f42265a = transferHistoryFragment;
        }

        /* renamed from: a */
        public final Object emit(cl4<Result> cl4, ns0<? super r37> ns0) {
            Object e = this.f42265a.mo57898n0().mo8739e(cl4, ns0);
            if (e == wx2.m54101d()) {
                return e;
            }
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferHistoryFragment$initRecyclerView$2(TransferHistoryFragment transferHistoryFragment, ns0<? super TransferHistoryFragment$initRecyclerView$2> ns0) {
        super(2, ns0);
        this.this$0 = transferHistoryFragment;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new TransferHistoryFragment$initRecyclerView$2(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((TransferHistoryFragment$initRecyclerView$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            z42 Y = this.this$0.mo57900p0();
            C8504a aVar = new C8504a(this.this$0);
            this.label = 1;
            if (Y.mo8646a(aVar, this) == d) {
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
