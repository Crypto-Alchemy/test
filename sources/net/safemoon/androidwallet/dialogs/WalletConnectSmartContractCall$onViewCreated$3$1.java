package net.safemoon.androidwallet.dialogs;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$onViewCreated$3$1", mo48632f = "WalletConnectSmartContractCall.kt", mo48633l = {150}, mo48634m = "invokeSuspend")
/* compiled from: WalletConnectSmartContractCall.kt */
public final class WalletConnectSmartContractCall$onViewCreated$3$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ WalletConnectSmartContractCall this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$onViewCreated$3$1$1", mo48632f = "WalletConnectSmartContractCall.kt", mo48633l = {151}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.dialogs.WalletConnectSmartContractCall$onViewCreated$3$1$1 */
    /* compiled from: WalletConnectSmartContractCall.kt */
    public static final class C83411 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C83411(walletConnectSmartContractCall, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C83411) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                WalletConnectSmartContractCall walletConnectSmartContractCall = walletConnectSmartContractCall;
                this.label = 1;
                if (walletConnectSmartContractCall.mo57342Z(this) == d) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletConnectSmartContractCall$onViewCreated$3$1(WalletConnectSmartContractCall walletConnectSmartContractCall, ns0<? super WalletConnectSmartContractCall$onViewCreated$3$1> ns0) {
        super(2, ns0);
        this.this$0 = walletConnectSmartContractCall;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new WalletConnectSmartContractCall$onViewCreated$3$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((WalletConnectSmartContractCall$onViewCreated$3$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final WalletConnectSmartContractCall walletConnectSmartContractCall = this.this$0;
            C83411 r1 = new C83411((ns0<? super C83411>) null);
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
