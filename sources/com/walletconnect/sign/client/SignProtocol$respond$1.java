package com.walletconnect.sign.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.b16;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SignProtocol.kt */
public final class SignProtocol$respond$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ rc2<b16.C3874d, r37> $onSuccess;
    public final /* synthetic */ b16.C3874d $response;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignProtocol$respond$1(rc2<? super b16.C3874d, r37> rc2, b16.C3874d dVar) {
        super(0);
        this.$onSuccess = rc2;
        this.$response = dVar;
    }

    public final void invoke() {
        this.$onSuccess.invoke(this.$response);
    }
}
