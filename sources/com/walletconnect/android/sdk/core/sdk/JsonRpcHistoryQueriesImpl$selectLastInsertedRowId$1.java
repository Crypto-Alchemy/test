package com.walletconnect.android.sdk.core.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ll76;", "cursor", "", "invoke", "(Ll76;)Ljava/lang/Long;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AndroidCoreDatabaseImpl.kt */
public final class JsonRpcHistoryQueriesImpl$selectLastInsertedRowId$1 extends Lambda implements rc2<l76, Long> {
    public static final JsonRpcHistoryQueriesImpl$selectLastInsertedRowId$1 INSTANCE = new JsonRpcHistoryQueriesImpl$selectLastInsertedRowId$1();

    public JsonRpcHistoryQueriesImpl$selectLastInsertedRowId$1() {
        super(1);
    }

    public final Long invoke(l76 l76) {
        vx2.m53591g(l76, "cursor");
        Long l = l76.getLong(0);
        vx2.m53588d(l);
        return l;
    }
}
