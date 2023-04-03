package com.walletconnect.android.pairing.engine.domain;

import com.walletconnect.android.pairing.model.PairingParams;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "com.walletconnect.android.pairing.engine.domain.PairingEngine", mo48632f = "PairingEngine.kt", mo48633l = {233}, mo48634m = "onPairingDelete")
/* compiled from: PairingEngine.kt */
public final class PairingEngine$onPairingDelete$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PairingEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingEngine$onPairingDelete$1(PairingEngine pairingEngine, ns0<? super PairingEngine$onPairingDelete$1> ns0) {
        super(ns0);
        this.this$0 = pairingEngine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo40478w((rf7) null, (PairingParams.DeleteParams) null, this);
    }
}
