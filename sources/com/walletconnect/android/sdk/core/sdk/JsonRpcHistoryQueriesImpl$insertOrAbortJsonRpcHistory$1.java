package com.walletconnect.android.sdk.core.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lo76;", "Lr37;", "invoke", "(Lo76;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AndroidCoreDatabaseImpl.kt */
public final class JsonRpcHistoryQueriesImpl$insertOrAbortJsonRpcHistory$1 extends Lambda implements rc2<o76, r37> {
    public final /* synthetic */ String $body;
    public final /* synthetic */ String $method;
    public final /* synthetic */ long $request_id;
    public final /* synthetic */ String $topic;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonRpcHistoryQueriesImpl$insertOrAbortJsonRpcHistory$1(long j, String str, String str2, String str3) {
        super(1);
        this.$request_id = j;
        this.$topic = str;
        this.$method = str2;
        this.$body = str3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((o76) obj);
        return r37.f33317a;
    }

    public final void invoke(o76 o76) {
        vx2.m53591g(o76, "$this$execute");
        o76.mo39608b(1, Long.valueOf(this.$request_id));
        o76.bindString(2, this.$topic);
        o76.bindString(3, this.$method);
        o76.bindString(4, this.$body);
    }
}
