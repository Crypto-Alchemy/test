package com.walletconnect.android.pairing.engine.domain;

import com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.android.pairing.engine.domain.PairingEngine$isValid$1$1", mo48632f = "PairingEngine.kt", mo48633l = {293}, mo48634m = "invokeSuspend")
/* compiled from: PairingEngine.kt */
public final class PairingEngine$isValid$1$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ kl4 $this_isValid;
    public int label;
    public final /* synthetic */ PairingEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingEngine$isValid$1$1(PairingEngine pairingEngine, kl4 kl4, ns0<? super PairingEngine$isValid$1$1> ns0) {
        super(2, ns0);
        this.this$0 = pairingEngine;
        this.$this_isValid = kl4;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new PairingEngine$isValid$1$1(this.this$0, this.$this_isValid, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((PairingEngine$isValid$1$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            JsonRpcInteractorInterface.DefaultImpls.m42234g(this.this$0.f27196e, this.$this_isValid.mo44832f(), (pc2) null, (rc2) null, 6, (Object) null);
            this.this$0.f27197f.mo40443a(this.$this_isValid.mo44832f());
            this.this$0.f27194c.mo40438d(this.$this_isValid.mo44832f());
            this.this$0.f27195d.mo47352a(this.$this_isValid.mo44832f().mo42395a());
            r04 h = this.this$0.f27200i;
            es6 f = this.$this_isValid.mo44832f();
            this.label = 1;
            if (h.emit(f, this) == d) {
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
