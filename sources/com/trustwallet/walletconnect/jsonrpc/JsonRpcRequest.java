package com.trustwallet.walletconnect.jsonrpc;

import com.trustwallet.walletconnect.WCClientKt;
import com.trustwallet.walletconnect.models.WCMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000e\u0010\u0017\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0012J>\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, mo44877d2 = {"Lcom/trustwallet/walletconnect/jsonrpc/JsonRpcRequest;", "T", "", "id", "", "jsonrpc", "", "method", "Lcom/trustwallet/walletconnect/models/WCMethod;", "params", "(JLjava/lang/String;Lcom/trustwallet/walletconnect/models/WCMethod;Ljava/lang/Object;)V", "getId", "()J", "getJsonrpc", "()Ljava/lang/String;", "getMethod", "()Lcom/trustwallet/walletconnect/models/WCMethod;", "getParams", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/String;Lcom/trustwallet/walletconnect/models/WCMethod;Ljava/lang/Object;)Lcom/trustwallet/walletconnect/jsonrpc/JsonRpcRequest;", "equals", "", "other", "hashCode", "", "toString", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: JsonRpcRequest.kt */
public final class JsonRpcRequest<T> {

    /* renamed from: id */
    private final long f27000id;
    private final String jsonrpc;
    private final WCMethod method;
    private final T params;

    public JsonRpcRequest(long j, String str, WCMethod wCMethod, T t) {
        vx2.m53591g(str, "jsonrpc");
        this.f27000id = j;
        this.jsonrpc = str;
        this.method = wCMethod;
        this.params = t;
    }

    public static /* synthetic */ JsonRpcRequest copy$default(JsonRpcRequest jsonRpcRequest, long j, String str, WCMethod wCMethod, T t, int i, Object obj) {
        if ((i & 1) != 0) {
            j = jsonRpcRequest.f27000id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = jsonRpcRequest.jsonrpc;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            wCMethod = jsonRpcRequest.method;
        }
        WCMethod wCMethod2 = wCMethod;
        if ((i & 8) != 0) {
            t = jsonRpcRequest.params;
        }
        return jsonRpcRequest.copy(j2, str2, wCMethod2, t);
    }

    public final long component1() {
        return this.f27000id;
    }

    public final String component2() {
        return this.jsonrpc;
    }

    public final WCMethod component3() {
        return this.method;
    }

    public final T component4() {
        return this.params;
    }

    public final JsonRpcRequest<T> copy(long j, String str, WCMethod wCMethod, T t) {
        vx2.m53591g(str, "jsonrpc");
        return new JsonRpcRequest(j, str, wCMethod, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcRequest)) {
            return false;
        }
        JsonRpcRequest jsonRpcRequest = (JsonRpcRequest) obj;
        return this.f27000id == jsonRpcRequest.f27000id && vx2.m53586b(this.jsonrpc, jsonRpcRequest.jsonrpc) && this.method == jsonRpcRequest.method && vx2.m53586b(this.params, jsonRpcRequest.params);
    }

    public final long getId() {
        return this.f27000id;
    }

    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    public final WCMethod getMethod() {
        return this.method;
    }

    public final T getParams() {
        return this.params;
    }

    public int hashCode() {
        int a = ((au0.m10781a(this.f27000id) * 31) + this.jsonrpc.hashCode()) * 31;
        WCMethod wCMethod = this.method;
        int i = 0;
        int hashCode = (a + (wCMethod == null ? 0 : wCMethod.hashCode())) * 31;
        T t = this.params;
        if (t != null) {
            i = t.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "JsonRpcRequest(id=" + this.f27000id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsonRpcRequest(long j, String str, WCMethod wCMethod, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, wCMethod, obj);
    }
}
