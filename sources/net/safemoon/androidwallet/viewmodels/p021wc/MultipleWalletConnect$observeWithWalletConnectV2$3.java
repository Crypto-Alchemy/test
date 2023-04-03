package net.safemoon.androidwallet.viewmodels.p021wc;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Ltj7;", "event", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$3", mo48632f = "MultipleWalletConnect.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$3 */
/* compiled from: MultipleWalletConnect.kt */
public final class MultipleWalletConnect$observeWithWalletConnectV2$3 extends SuspendLambda implements fd2<tj7, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ MultipleWalletConnect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultipleWalletConnect$observeWithWalletConnectV2$3(MultipleWalletConnect multipleWalletConnect, ns0<? super MultipleWalletConnect$observeWithWalletConnectV2$3> ns0) {
        super(2, ns0);
        this.this$0 = multipleWalletConnect;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        MultipleWalletConnect$observeWithWalletConnectV2$3 multipleWalletConnect$observeWithWalletConnectV2$3 = new MultipleWalletConnect$observeWithWalletConnectV2$3(this.this$0, ns0);
        multipleWalletConnect$observeWithWalletConnectV2$3.L$0 = obj;
        return multipleWalletConnect$observeWithWalletConnectV2$3;
    }

    public final Object invoke(tj7 tj7, ns0<? super r37> ns0) {
        return ((MultipleWalletConnect$observeWithWalletConnectV2$3) create(tj7, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            if (((tj7) this.L$0) instanceof wt0) {
                this.this$0.f43098b.mo62065g();
            }
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
