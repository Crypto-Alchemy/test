package com.walletconnect.android.internal.common.json_rpc.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: JsonRpcInteractor.kt */
public final class JsonRpcInteractor$respondWithError$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ rc2<rf7, r37> $onSuccess;
    public final /* synthetic */ rf7 $request;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonRpcInteractor$respondWithError$1(rc2<? super rf7, r37> rc2, rf7 rf7) {
        super(0);
        this.$onSuccess = rc2;
        this.$request = rf7;
    }

    public final void invoke() {
        this.$onSuccess.invoke(this.$request);
    }
}
