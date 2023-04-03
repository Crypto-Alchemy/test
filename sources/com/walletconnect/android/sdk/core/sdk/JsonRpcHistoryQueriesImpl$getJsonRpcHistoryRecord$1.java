package com.walletconnect.android.sdk.core.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "T", "Ll76;", "cursor", "invoke", "(Ll76;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AndroidCoreDatabaseImpl.kt */
public final class JsonRpcHistoryQueriesImpl$getJsonRpcHistoryRecord$1 extends Lambda implements rc2<l76, T> {
    public final /* synthetic */ md2<Long, String, String, String, String, T> $mapper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonRpcHistoryQueriesImpl$getJsonRpcHistoryRecord$1(md2<? super Long, ? super String, ? super String, ? super String, ? super String, ? extends T> md2) {
        super(1);
        this.$mapper = md2;
    }

    public final T invoke(l76 l76) {
        vx2.m53591g(l76, "cursor");
        md2<Long, String, String, String, String, T> md2 = this.$mapper;
        Long l = l76.getLong(0);
        vx2.m53588d(l);
        String string = l76.getString(1);
        vx2.m53588d(string);
        String string2 = l76.getString(2);
        vx2.m53588d(string2);
        String string3 = l76.getString(3);
        vx2.m53588d(string3);
        return md2.invoke(l, string, string2, string3, l76.getString(4));
    }
}
