package com.walletconnect.android.internal.common.json_rpc.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import p000.ec5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lkotlin/Result;", "Lec5$a$b$a;", "result", "Lr37;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: JsonRpcInteractor.kt */
public final class JsonRpcInteractor$subscribe$1 extends Lambda implements rc2<Result<? extends ec5.C5764a.C5767b.C5768a>, r37> {
    public final /* synthetic */ rc2<Throwable, r37> $onFailure;
    public final /* synthetic */ rc2<es6, r37> $onSuccess;
    public final /* synthetic */ es6 $topic;
    public final /* synthetic */ JsonRpcInteractor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonRpcInteractor$subscribe$1(JsonRpcInteractor jsonRpcInteractor, es6 es6, rc2<? super es6, r37> rc2, rc2<? super Throwable, r37> rc22) {
        super(1);
        this.this$0 = jsonRpcInteractor;
        this.$topic = es6;
        this.$onSuccess = rc2;
        this.$onFailure = rc22;
    }

    public final void invoke(Object obj) {
        JsonRpcInteractor jsonRpcInteractor = this.this$0;
        es6 es6 = this.$topic;
        rc2<es6, r37> rc2 = this.$onSuccess;
        rc2<Throwable, r37> rc22 = this.$onFailure;
        Throwable r4 = Result.m75638exceptionOrNullimpl(obj);
        if (r4 == null) {
            jsonRpcInteractor.f27112k.put(es6.mo42395a(), ((ec5.C5764a.C5767b.C5768a) obj).mo42216c());
            rc2.invoke(es6);
            return;
        }
        sk3 n = jsonRpcInteractor.f27105d;
        n.error("Subscribe to topic error: " + es6 + " error: " + r4);
        rc22.invoke(r4);
    }
}
