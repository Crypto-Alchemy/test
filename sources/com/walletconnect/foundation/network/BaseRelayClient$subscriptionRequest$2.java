package com.walletconnect.foundation.network;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import p000.ec5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lz42;", "Lec5$a$c$a;", "invoke", "()Lz42;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: BaseRelayClient.kt */
public final class BaseRelayClient$subscriptionRequest$2 extends Lambda implements pc2<z42<? extends ec5.C5764a.C5769c.C5770a>> {
    public final /* synthetic */ BaseRelayClient this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Lec5$a$c$a;", "relayRequest", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "com.walletconnect.foundation.network.BaseRelayClient$subscriptionRequest$2$2", mo48632f = "BaseRelayClient.kt", mo48633l = {42}, mo48634m = "invokeSuspend")
    /* renamed from: com.walletconnect.foundation.network.BaseRelayClient$subscriptionRequest$2$2 */
    /* compiled from: BaseRelayClient.kt */
    public static final class C56132 extends SuspendLambda implements fd2<ec5.C5764a.C5769c.C5770a, ns0<? super r37>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            C56132 r0 = new C56132(baseRelayClient, ns0);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(ec5.C5764a.C5769c.C5770a aVar, ns0<? super r37> ns0) {
            return ((C56132) create(aVar, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                final ec5.C5764a.C5769c.C5770a aVar = (ec5.C5764a.C5769c.C5770a) this.L$0;
                final BaseRelayClient baseRelayClient = baseRelayClient;
                C56141 r1 = new fd2<hu0, ns0<? super r37>, Object>((ns0<? super C56141>) null) {
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public BaseRelayClient$subscriptionRequest$2(BaseRelayClient baseRelayClient) {
                            super(0);
                            this.this$0 = baseRelayClient;
                        }

                        public final z42<ec5.C5764a.C5769c.C5770a> invoke() {
                            BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1 baseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1 = new BaseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1(this.this$0.mo40736i().mo43560k());
                            final BaseRelayClient baseRelayClient = this.this$0;
                            return e52.m57202C(baseRelayClient$subscriptionRequest$2$invoke$$inlined$map$1, new C56132((ns0<? super C56132>) null));
                        }
                    }
