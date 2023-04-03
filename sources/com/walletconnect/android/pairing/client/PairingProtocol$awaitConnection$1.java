package com.walletconnect.android.pairing.client;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "com.walletconnect.android.pairing.client.PairingProtocol", mo48632f = "PairingProtocol.kt", mo48633l = {122}, mo48634m = "awaitConnection")
/* compiled from: PairingProtocol.kt */
public final class PairingProtocol$awaitConnection$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PairingProtocol this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingProtocol$awaitConnection$1(PairingProtocol pairingProtocol, ns0<? super PairingProtocol$awaitConnection$1> ns0) {
        super(ns0);
        this.this$0 = pairingProtocol;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo40455f((pc2<r37>) null, (rc2<? super Throwable, r37>) null, this);
    }
}
