package com.walletconnect.android.pairing.engine.domain;

import com.walletconnect.android.internal.common.model.EnvelopeType;
import com.walletconnect.android.internal.common.model.Tags;
import com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p000.ay2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lz42;", "Ljava/lang/InternalError;", "invoke", "()Lz42;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: PairingEngine.kt */
public final class PairingEngine$jsonRpcErrorFlow$2 extends Lambda implements pc2<z42<? extends InternalError>> {
    public final /* synthetic */ PairingEngine this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Lrf7;", "request", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$2", mo48632f = "PairingEngine.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: com.walletconnect.android.pairing.engine.domain.PairingEngine$jsonRpcErrorFlow$2$2 */
    /* compiled from: PairingEngine.kt */
    public static final class C55742 extends SuspendLambda implements fd2<rf7, ns0<? super r37>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            C55742 r0 = new C55742(pairingEngine, ns0);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(rf7 rf7, ns0<? super r37> ns0) {
            return ((C55742) create(rf7, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                rf7 rf7 = (rf7) this.L$0;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(pairingEngine.f27196e, rf7, new ay2.C3868a(rf7.mo47398b()), new ny2(Tags.UNSUPPORTED_METHOD, new ky6(fq6.m44370b()), false, 4, (DefaultConstructorMarker) null), (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingEngine$jsonRpcErrorFlow$2(PairingEngine pairingEngine) {
        super(0);
        this.this$0 = pairingEngine;
    }

    public final z42<InternalError> invoke() {
        PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1 pairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1 = new PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1(this.this$0.f27196e.mo40292e(), this.this$0);
        final PairingEngine pairingEngine = this.this$0;
        return new PairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$map$1(e52.m57202C(pairingEngine$jsonRpcErrorFlow$2$invoke$$inlined$filter$1, new C55742((ns0<? super C55742>) null)));
    }
}
