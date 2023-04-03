package com.walletconnect.android.internal.common.storage;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: JsonRpcHistory.kt */
public /* synthetic */ class JsonRpcHistory$updateRequestWithResponse$record$1 extends FunctionReferenceImpl implements md2<Long, String, String, String, String, q63> {
    public JsonRpcHistory$updateRequestWithResponse$record$1(Object obj) {
        super(5, obj, JsonRpcHistory.class, "toRecord", "toRecord(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/walletconnect/android/internal/common/json_rpc/model/JsonRpcHistoryRecord;", 0);
    }

    public final q63 invoke(long j, String str, String str2, String str3, String str4) {
        vx2.m53591g(str, "p1");
        vx2.m53591g(str2, "p2");
        vx2.m53591g(str3, "p3");
        return ((JsonRpcHistory) this.receiver).mo40431d(j, str, str2, str3, str4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke(((Number) obj).longValue(), (String) obj2, (String) obj3, (String) obj4, (String) obj5);
    }
}
