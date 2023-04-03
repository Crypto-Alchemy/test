package com.walletconnect.android.internal.common.json_rpc.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor", mo48632f = "JsonRpcInteractor.kt", mo48633l = {251, 253, 255}, mo48634m = "manageSubscriptions")
/* compiled from: JsonRpcInteractor.kt */
public final class JsonRpcInteractor$manageSubscriptions$2 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ JsonRpcInteractor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonRpcInteractor$manageSubscriptions$2(JsonRpcInteractor jsonRpcInteractor, ns0<? super JsonRpcInteractor$manageSubscriptions$2> ns0) {
        super(ns0);
        this.this$0 = jsonRpcInteractor;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo40286C((String) null, (es6) null, this);
    }
}
