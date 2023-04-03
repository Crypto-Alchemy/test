package com.walletconnect.foundation.network;

import com.walletconnect.foundation.network.model.RelayDTO;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.ec5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.foundation.network.BaseRelayClient$observeUnsubscribeResult$1", mo48632f = "BaseRelayClient.kt", mo48633l = {143}, mo48634m = "invokeSuspend")
/* compiled from: BaseRelayClient.kt */
public final class BaseRelayClient$observeUnsubscribeResult$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ rc2<Result<ec5.C5764a.C5773d.C5774a>, r37> $onResult;
    public int label;
    public final /* synthetic */ BaseRelayClient this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo44877d2 = {"La52;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Result;", "", "exception", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "com.walletconnect.foundation.network.BaseRelayClient$observeUnsubscribeResult$1$1", mo48632f = "BaseRelayClient.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: com.walletconnect.foundation.network.BaseRelayClient$observeUnsubscribeResult$1$1 */
    /* compiled from: BaseRelayClient.kt */
    public static final class C56111 extends SuspendLambda implements id2<a52<? super RelayDTO.Unsubscribe.Result>, Throwable, ns0<? super r37>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final Object invoke(a52<? super RelayDTO.Unsubscribe.Result> a52, Throwable th, ns0<? super r37> ns0) {
            C56111 r2 = new C56111(baseRelayClient, ns0);
            r2.L$0 = th;
            return r2.invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                baseRelayClient.mo40735h().mo40252a((Throwable) this.L$0);
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo44877d2 = {"com/walletconnect/foundation/network/BaseRelayClient$observeUnsubscribeResult$1$a", "La52;", "value", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.foundation.network.BaseRelayClient$observeUnsubscribeResult$1$a */
    /* compiled from: Collect.kt */
    public static final class C5612a implements a52<RelayDTO.Unsubscribe.Result> {

        /* renamed from: a */
        public final /* synthetic */ rc2 f27377a;

        public C5612a(rc2 rc2) {
            this.f27377a = rc2;
        }

        public Object emit(Object obj, ns0 ns0) {
            Object c = qd6.m71251c(new BaseRelayClient$observeUnsubscribeResult$1$2$1((RelayDTO.Unsubscribe.Result) obj, this.f27377a, (ns0<? super BaseRelayClient$observeUnsubscribeResult$1$2$1>) null), ns0);
            if (c == wx2.m54101d()) {
                return c;
            }
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRelayClient$observeUnsubscribeResult$1(BaseRelayClient baseRelayClient, rc2<? super Result<ec5.C5764a.C5773d.C5774a>, r37> rc2, ns0<? super BaseRelayClient$observeUnsubscribeResult$1> ns0) {
        super(2, ns0);
        this.this$0 = baseRelayClient;
        this.$onResult = rc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new BaseRelayClient$observeUnsubscribeResult$1(this.this$0, this.$onResult, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((BaseRelayClient$observeUnsubscribeResult$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            z42 A = e52.m57200A(this.this$0.mo40736i().mo43554e(), this.this$0.mo40736i().mo43553d());
            final BaseRelayClient baseRelayClient = this.this$0;
            z42 f = e52.m57214f(A, new C56111((ns0<? super C56111>) null));
            C5612a aVar = new C5612a(this.$onResult);
            this.label = 1;
            if (f.mo8646a(aVar, this) == d) {
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
