package net.safemoon.androidwallet.viewmodels.p021wc;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.viewmodels.wcv2.WCDelegate;
import p000.hg7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Ltj7;", "event", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$2", mo48632f = "MultipleWalletConnect.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* renamed from: net.safemoon.androidwallet.viewmodels.wc.MultipleWalletConnect$observeWithWalletConnectV2$2 */
/* compiled from: MultipleWalletConnect.kt */
public final class MultipleWalletConnect$observeWithWalletConnectV2$2 extends SuspendLambda implements fd2<tj7, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ MultipleWalletConnect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultipleWalletConnect$observeWithWalletConnectV2$2(MultipleWalletConnect multipleWalletConnect, ns0<? super MultipleWalletConnect$observeWithWalletConnectV2$2> ns0) {
        super(2, ns0);
        this.this$0 = multipleWalletConnect;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        MultipleWalletConnect$observeWithWalletConnectV2$2 multipleWalletConnect$observeWithWalletConnectV2$2 = new MultipleWalletConnect$observeWithWalletConnectV2$2(this.this$0, ns0);
        multipleWalletConnect$observeWithWalletConnectV2$2.L$0 = obj;
        return multipleWalletConnect$observeWithWalletConnectV2$2;
    }

    public final Object invoke(tj7 tj7, ns0<? super r37> ns0) {
        return ((MultipleWalletConnect$observeWithWalletConnectV2$2) create(tj7, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            tj7 tj7 = (tj7) this.L$0;
            if (tj7 instanceof j16) {
                hg7.C5915j n = WCDelegate.f43174a.mo62020n();
                if (n != null) {
                    this.this$0.mo61926K(n);
                }
            } else if (tj7 instanceof h16) {
                this.this$0.f43098b.mo62065g();
            } else {
                boolean z = tj7 instanceof C7914mt;
            }
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
