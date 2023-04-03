package com.walletconnect.android.pairing.handler;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.tt0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "error", "Lr37;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: PairingController.kt */
public final class PairingController$updateExpiry$1 extends Lambda implements rc2<Throwable, r37> {
    public final /* synthetic */ rc2<tt0.C6538c, r37> $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PairingController$updateExpiry$1(rc2<? super tt0.C6538c, r37> rc2) {
        super(1);
        this.$onError = rc2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return r37.f33317a;
    }

    public final void invoke(Throwable th) {
        vx2.m53591g(th, "error");
        this.$onError.invoke(new tt0.C6538c(th));
    }
}
