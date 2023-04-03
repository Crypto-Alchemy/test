package com.trustwallet.walletconnect.jsonrpc;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/jsonrpc/JsonRpcError;", "", "code", "", "message", "", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: JsonRpcError.kt */
public final class JsonRpcError {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int code;
    private final String message;

    @Metadata(mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000b"}, mo44877d2 = {"Lcom/trustwallet/walletconnect/jsonrpc/JsonRpcError$Companion;", "", "()V", "invalidParams", "Lcom/trustwallet/walletconnect/jsonrpc/JsonRpcError;", "message", "", "invalidRequest", "methodNotFound", "parseError", "serverError", "library-walletconnect_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: JsonRpcError.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JsonRpcError invalidParams(String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            return new JsonRpcError(-32602, str);
        }

        public final JsonRpcError invalidRequest(String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            return new JsonRpcError(-32600, str);
        }

        public final JsonRpcError methodNotFound(String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            return new JsonRpcError(-32601, str);
        }

        public final JsonRpcError parseError(String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            return new JsonRpcError(-32700, str);
        }

        public final JsonRpcError serverError(String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            return new JsonRpcError(-32000, str);
        }
    }

    public JsonRpcError(int i, String str) {
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        this.code = i;
        this.message = str;
    }

    public static /* synthetic */ JsonRpcError copy$default(JsonRpcError jsonRpcError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jsonRpcError.code;
        }
        if ((i2 & 2) != 0) {
            str = jsonRpcError.message;
        }
        return jsonRpcError.copy(i, str);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final JsonRpcError copy(int i, String str) {
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        return new JsonRpcError(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonRpcError)) {
            return false;
        }
        JsonRpcError jsonRpcError = (JsonRpcError) obj;
        return this.code == jsonRpcError.code && vx2.m53586b(this.message, jsonRpcError.message);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.code * 31) + this.message.hashCode();
    }

    public String toString() {
        return "JsonRpcError(code=" + this.code + ", message=" + this.message + ')';
    }
}
