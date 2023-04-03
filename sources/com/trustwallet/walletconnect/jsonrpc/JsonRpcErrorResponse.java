package com.trustwallet.walletconnect.jsonrpc;

import com.trustwallet.walletconnect.WCClientKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/jsonrpc/JsonRpcErrorResponse;", "", "jsonrpc", "", "id", "", "error", "Lcom/trustwallet/walletconnect/jsonrpc/JsonRpcError;", "(Ljava/lang/String;JLcom/trustwallet/walletconnect/jsonrpc/JsonRpcError;)V", "getError", "()Lcom/trustwallet/walletconnect/jsonrpc/JsonRpcError;", "getId", "()J", "getJsonrpc", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: JsonRpcResponse.kt */
public final class JsonRpcErrorResponse {
    private final JsonRpcError error;

    /* renamed from: id */
    private final long f26999id;
    private final String jsonrpc;

    public JsonRpcErrorResponse(String str, long j, JsonRpcError jsonRpcError) {
        vx2.m53591g(str, "jsonrpc");
        vx2.m53591g(jsonRpcError, "error");
        this.jsonrpc = str;
        this.f26999id = j;
        this.error = jsonRpcError;
    }

    public static /* synthetic */ JsonRpcErrorResponse copy$default(JsonRpcErrorResponse jsonRpcErrorResponse, String str, long j, JsonRpcError jsonRpcError, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jsonRpcErrorResponse.jsonrpc;
        }
        if ((i & 2) != 0) {
            j = jsonRpcErrorResponse.f26999id;
        }
        if ((i & 4) != 0) {
            jsonRpcError = jsonRpcErrorResponse.error;
        }
        return jsonRpcErrorResponse.copy(str, j, jsonRpcError);
    }

    public final String component1() {
        return this.jsonrpc;
    }

    public final long component2() {
        return this.f26999id;
    }

    public final JsonRpcError component3() {
        return this.error;
    }

    public final JsonRpcErrorResponse copy(String str, long j, JsonRpcError jsonRpcError) {
        vx2.m53591g(str, "jsonrpc");
        vx2.m53591g(jsonRpcError, "error");
        return new JsonRpcErrorResponse(str, j, jsonRpcError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcErrorResponse)) {
            return false;
        }
        JsonRpcErrorResponse jsonRpcErrorResponse = (JsonRpcErrorResponse) obj;
        return vx2.m53586b(this.jsonrpc, jsonRpcErrorResponse.jsonrpc) && this.f26999id == jsonRpcErrorResponse.f26999id && vx2.m53586b(this.error, jsonRpcErrorResponse.error);
    }

    public final JsonRpcError getError() {
        return this.error;
    }

    public final long getId() {
        return this.f26999id;
    }

    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    public int hashCode() {
        return (((this.jsonrpc.hashCode() * 31) + au0.m10781a(this.f26999id)) * 31) + this.error.hashCode();
    }

    public String toString() {
        return "JsonRpcErrorResponse(jsonrpc=" + this.jsonrpc + ", id=" + this.f26999id + ", error=" + this.error + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsonRpcErrorResponse(String str, long j, JsonRpcError jsonRpcError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? WCClientKt.JSONRPC_VERSION : str, j, jsonRpcError);
    }
}
