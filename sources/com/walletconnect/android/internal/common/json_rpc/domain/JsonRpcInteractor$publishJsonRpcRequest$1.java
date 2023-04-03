package com.walletconnect.android.internal.common.json_rpc.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import p000.ec5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Lkotlin/Result;", "Lec5$a$a$a;", "result", "Lr37;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: JsonRpcInteractor.kt */
public final class JsonRpcInteractor$publishJsonRpcRequest$1 extends Lambda implements rc2<Result<? extends ec5.C5764a.C5765a.C5766a>, r37> {
    public final /* synthetic */ rc2<Throwable, r37> $onFailure;
    public final /* synthetic */ pc2<r37> $onSuccess;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonRpcInteractor$publishJsonRpcRequest$1(pc2<r37> pc2, rc2<? super Throwable, r37> rc2) {
        super(1);
        this.$onSuccess = pc2;
        this.$onFailure = rc2;
    }

    public final void invoke(Object obj) {
        pc2<r37> pc2 = this.$onSuccess;
        rc2<Throwable, r37> rc2 = this.$onFailure;
        Throwable r2 = Result.m75638exceptionOrNullimpl(obj);
        if (r2 == null) {
            ec5.C5764a.C5765a.C5766a aVar = (ec5.C5764a.C5765a.C5766a) obj;
            pc2.invoke();
            return;
        }
        rc2.invoke(r2);
    }
}
