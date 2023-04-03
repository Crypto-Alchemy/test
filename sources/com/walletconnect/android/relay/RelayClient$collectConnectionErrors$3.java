package com.walletconnect.android.relay;

import com.walletconnect.android.internal.common.exception.WalletConnectException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/exception/WalletConnectException;", "walletConnectException", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.android.relay.RelayClient$collectConnectionErrors$3", mo48632f = "RelayClient.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: RelayClient.kt */
public final class RelayClient$collectConnectionErrors$3 extends SuspendLambda implements fd2<WalletConnectException, ns0<? super r37>, Object> {
    public final /* synthetic */ rc2<Throwable, r37> $onError;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RelayClient$collectConnectionErrors$3(rc2<? super Throwable, r37> rc2, ns0<? super RelayClient$collectConnectionErrors$3> ns0) {
        super(2, ns0);
        this.$onError = rc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        RelayClient$collectConnectionErrors$3 relayClient$collectConnectionErrors$3 = new RelayClient$collectConnectionErrors$3(this.$onError, ns0);
        relayClient$collectConnectionErrors$3.L$0 = obj;
        return relayClient$collectConnectionErrors$3;
    }

    public final Object invoke(WalletConnectException walletConnectException, ns0<? super r37> ns0) {
        return ((RelayClient$collectConnectionErrors$3) create(walletConnectException, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            this.$onError.invoke((WalletConnectException) this.L$0);
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
