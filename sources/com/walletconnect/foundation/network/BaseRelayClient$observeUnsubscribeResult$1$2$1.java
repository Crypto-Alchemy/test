package com.walletconnect.foundation.network;

import com.walletconnect.foundation.network.model.RelayDTO;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.ec5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.foundation.network.BaseRelayClient$observeUnsubscribeResult$1$2$1", mo48632f = "BaseRelayClient.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: BaseRelayClient.kt */
public final class BaseRelayClient$observeUnsubscribeResult$1$2$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ rc2<Result<ec5.C5764a.C5773d.C5774a>, r37> $onResult;
    public final /* synthetic */ RelayDTO.Unsubscribe.Result $subscribeResult;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRelayClient$observeUnsubscribeResult$1$2$1(RelayDTO.Unsubscribe.Result result, rc2<? super Result<ec5.C5764a.C5773d.C5774a>, r37> rc2, ns0<? super BaseRelayClient$observeUnsubscribeResult$1$2$1> ns0) {
        super(2, ns0);
        this.$subscribeResult = result;
        this.$onResult = rc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        BaseRelayClient$observeUnsubscribeResult$1$2$1 baseRelayClient$observeUnsubscribeResult$1$2$1 = new BaseRelayClient$observeUnsubscribeResult$1$2$1(this.$subscribeResult, this.$onResult, ns0);
        baseRelayClient$observeUnsubscribeResult$1$2$1.L$0 = obj;
        return baseRelayClient$observeUnsubscribeResult$1$2$1;
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((BaseRelayClient$observeUnsubscribeResult$1$2$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            hu0 hu0 = (hu0) this.L$0;
            RelayDTO.Unsubscribe.Result result = this.$subscribeResult;
            if (result instanceof RelayDTO.Unsubscribe.Result.Acknowledgement) {
                rc2<Result<ec5.C5764a.C5773d.C5774a>, r37> rc2 = this.$onResult;
                Result.C6167a aVar = Result.Companion;
                rc2.invoke(Result.m75634boximpl(Result.m75635constructorimpl(vx2.m53591g((RelayDTO.Unsubscribe.Result.Acknowledgement) result, "<this>"))));
            } else if (result instanceof RelayDTO.Unsubscribe.Result.JsonRpcError) {
                rc2<Result<ec5.C5764a.C5773d.C5774a>, r37> rc22 = this.$onResult;
                Result.C6167a aVar2 = Result.Companion;
                rc22.invoke(Result.m75634boximpl(Result.m75635constructorimpl(hg5.m45198a(new Throwable(((RelayDTO.Unsubscribe.Result.JsonRpcError) this.$subscribeResult).mo40864a().mo40759b())))));
            }
            iu0.m59114d(hu0, (CancellationException) null, 1, (Object) null);
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
