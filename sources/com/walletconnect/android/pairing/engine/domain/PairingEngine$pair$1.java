package com.walletconnect.android.pairing.engine.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Les6;", "it", "Lr37;", "invoke", "(Les6;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: PairingEngine.kt */
public final class PairingEngine$pair$1 extends Lambda implements rc2<es6, r37> {
    public final /* synthetic */ pc2<r37> $onSuccess;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingEngine$pair$1(pc2<r37> pc2) {
        super(1);
        this.$onSuccess = pc2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((es6) obj);
        return r37.f33317a;
    }

    public final void invoke(es6 es6) {
        vx2.m53591g(es6, "it");
        this.$onSuccess.invoke();
    }
}
