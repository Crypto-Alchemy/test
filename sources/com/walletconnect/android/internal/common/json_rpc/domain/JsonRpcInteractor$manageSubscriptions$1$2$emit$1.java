package com.walletconnect.android.internal.common.json_rpc.domain;

import com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1$2", mo48632f = "JsonRpcInteractor.kt", mo48633l = {240}, mo48634m = "emit")
/* compiled from: JsonRpcInteractor.kt */
public final class JsonRpcInteractor$manageSubscriptions$1$2$emit$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ JsonRpcInteractor$manageSubscriptions$1.C55582<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonRpcInteractor$manageSubscriptions$1$2$emit$1(JsonRpcInteractor$manageSubscriptions$1.C55582<? super T> r1, ns0<? super JsonRpcInteractor$manageSubscriptions$1$2$emit$1> ns0) {
        super(ns0);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Pair<String, es6>) null, this);
    }
}
