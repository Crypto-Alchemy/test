package com.trustwallet.walletconnect.jsonrpc;

import com.trustwallet.walletconnect.WCClientKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000e\u0010\u0012\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/jsonrpc/JsonRpcResponse;", "T", "", "jsonrpc", "", "id", "", "result", "(Ljava/lang/String;JLjava/lang/Object;)V", "getId", "()J", "getJsonrpc", "()Ljava/lang/String;", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;JLjava/lang/Object;)Lcom/trustwallet/walletconnect/jsonrpc/JsonRpcResponse;", "equals", "", "other", "hashCode", "", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: JsonRpcResponse.kt */
public final class JsonRpcResponse<T> {

    /* renamed from: id */
    private final long f27001id;
    private final String jsonrpc;
    private final T result;

    public JsonRpcResponse(String str, long j, T t) {
        vx2.m53591g(str, "jsonrpc");
        this.jsonrpc = str;
        this.f27001id = j;
        this.result = t;
    }

    public static /* synthetic */ JsonRpcResponse copy$default(JsonRpcResponse jsonRpcResponse, String str, long j, T t, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jsonRpcResponse.jsonrpc;
        }
        if ((i & 2) != 0) {
            j = jsonRpcResponse.f27001id;
        }
        if ((i & 4) != 0) {
            t = jsonRpcResponse.result;
        }
        return jsonRpcResponse.copy(str, j, t);
    }

    public final String component1() {
        return this.jsonrpc;
    }

    public final long component2() {
        return this.f27001id;
    }

    public final T component3() {
        return this.result;
    }

    public final JsonRpcResponse<T> copy(String str, long j, T t) {
        vx2.m53591g(str, "jsonrpc");
        return new JsonRpcResponse<>(str, j, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcResponse)) {
            return false;
        }
        JsonRpcResponse jsonRpcResponse = (JsonRpcResponse) obj;
        return vx2.m53586b(this.jsonrpc, jsonRpcResponse.jsonrpc) && this.f27001id == jsonRpcResponse.f27001id && vx2.m53586b(this.result, jsonRpcResponse.result);
    }

    public final long getId() {
        return this.f27001id;
    }

    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    public final T getResult() {
        return this.result;
    }

    public int hashCode() {
        int hashCode = ((this.jsonrpc.hashCode() * 31) + au0.m10781a(this.f27001id)) * 31;
        T t = this.result;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "JsonRpcResponse(jsonrpc=" + this.jsonrpc + ", id=" + this.f27001id + ", result=" + this.result + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsonRpcResponse(String str, long j, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? WCClientKt.JSONRPC_VERSION : str, j, obj);
    }
}
