package com.walletconnect.sign.engine.domain;

import com.walletconnect.android.internal.common.model.EnvelopeType;
import com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.cn4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SignEngine.kt */
public final class SignEngine$onSessionUpdate$3 extends Lambda implements pc2<r37> {
    public final /* synthetic */ ny2 $irnParams;
    public final /* synthetic */ rf7 $request;
    public final /* synthetic */ SignEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignEngine$onSessionUpdate$3(SignEngine signEngine, rf7 rf7, ny2 ny2) {
        super(0);
        this.this$0 = signEngine;
        this.$request = rf7;
        this.$irnParams = ny2;
    }

    public final void invoke() {
        JsonRpcInteractorInterface.DefaultImpls.m42230c(this.this$0.f27657a, this.$request, new cn4.C3956c.C3960d("Updating Namespace Failed. Review Namespace structure"), this.$irnParams, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
    }
}
