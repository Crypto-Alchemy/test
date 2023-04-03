package com.walletconnect.android.internal.common;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.trustwallet.walletconnect.WCClientKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0002\u000b\f¨\u0006\r"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/JsonRpcResponse;", "Lpw5;", "", "getId", "()J", "id", "<init>", "()V", "a", "JsonRpcError", "b", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$JsonRpcError;", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: JsonRpcResponse.kt */
public abstract class JsonRpcResponse implements pw5 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u001d"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/JsonRpcResponse$JsonRpcError;", "Lcom/walletconnect/android/internal/common/JsonRpcResponse;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "getId", "()J", "id", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "jsonrpc", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$a;", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$a;", "()Lcom/walletconnect/android/internal/common/JsonRpcResponse$a;", "error", "d", "errorMessage", "<init>", "(JLjava/lang/String;Lcom/walletconnect/android/internal/common/JsonRpcResponse$a;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: JsonRpcResponse.kt */
    public static final class JsonRpcError extends JsonRpcResponse {

        /* renamed from: a */
        public final long f27052a;

        /* renamed from: b */
        public final String f27053b;

        /* renamed from: c */
        public final C5514a f27054c;

        /* renamed from: d */
        public final String f27055d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ JsonRpcError(long j, String str, C5514a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, aVar);
        }

        /* renamed from: a */
        public final C5514a mo40160a() {
            return this.f27054c;
        }

        /* renamed from: b */
        public final String mo40161b() {
            return this.f27055d;
        }

        /* renamed from: c */
        public final String mo40162c() {
            return this.f27053b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JsonRpcError)) {
                return false;
            }
            JsonRpcError jsonRpcError = (JsonRpcError) obj;
            return getId() == jsonRpcError.getId() && vx2.m53586b(this.f27053b, jsonRpcError.f27053b) && vx2.m53586b(this.f27054c, jsonRpcError.f27054c);
        }

        public long getId() {
            return this.f27052a;
        }

        public int hashCode() {
            return (((au0.m10781a(getId()) * 31) + this.f27053b.hashCode()) * 31) + this.f27054c.hashCode();
        }

        public String toString() {
            long id = getId();
            String str = this.f27053b;
            C5514a aVar = this.f27054c;
            return "JsonRpcError(id=" + id + ", jsonrpc=" + str + ", error=" + aVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public JsonRpcError(long j, String str, C5514a aVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(aVar, "error");
            this.f27052a = j;
            this.f27053b = str;
            this.f27054c = aVar;
            String b = aVar.mo40167b();
            int a = aVar.mo40166a();
            this.f27055d = b + " : code: " + a;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/JsonRpcResponse$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "code", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "message", "<init>", "(ILjava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.android.internal.common.JsonRpcResponse$a */
    /* compiled from: JsonRpcResponse.kt */
    public static final class C5514a {

        /* renamed from: a */
        public final int f27056a;

        /* renamed from: b */
        public final String f27057b;

        public C5514a(int i, String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            this.f27056a = i;
            this.f27057b = str;
        }

        /* renamed from: a */
        public final int mo40166a() {
            return this.f27056a;
        }

        /* renamed from: b */
        public final String mo40167b() {
            return this.f27057b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5514a)) {
                return false;
            }
            C5514a aVar = (C5514a) obj;
            return this.f27056a == aVar.f27056a && vx2.m53586b(this.f27057b, aVar.f27057b);
        }

        public int hashCode() {
            return (this.f27056a * 31) + this.f27057b.hashCode();
        }

        public String toString() {
            int i = this.f27056a;
            String str = this.f27057b;
            return "Error(code=" + i + ", message=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/JsonRpcResponse$b;", "Lcom/walletconnect/android/internal/common/JsonRpcResponse;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "getId", "()J", "id", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "jsonrpc", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "result", "<init>", "(JLjava/lang/String;Ljava/lang/Object;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = false)
    /* renamed from: com.walletconnect.android.internal.common.JsonRpcResponse$b */
    /* compiled from: JsonRpcResponse.kt */
    public static final class C5515b extends JsonRpcResponse {

        /* renamed from: a */
        public final long f27058a;

        /* renamed from: b */
        public final String f27059b;

        /* renamed from: c */
        public final Object f27060c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C5515b(long j, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, obj);
        }

        /* renamed from: a */
        public final String mo40171a() {
            return this.f27059b;
        }

        /* renamed from: b */
        public final Object mo40172b() {
            return this.f27060c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5515b)) {
                return false;
            }
            C5515b bVar = (C5515b) obj;
            return getId() == bVar.getId() && vx2.m53586b(this.f27059b, bVar.f27059b) && vx2.m53586b(this.f27060c, bVar.f27060c);
        }

        public long getId() {
            return this.f27058a;
        }

        public int hashCode() {
            return (((au0.m10781a(getId()) * 31) + this.f27059b.hashCode()) * 31) + this.f27060c.hashCode();
        }

        public String toString() {
            long id = getId();
            String str = this.f27059b;
            Object obj = this.f27060c;
            return "JsonRpcResult(id=" + id + ", jsonrpc=" + str + ", result=" + obj + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5515b(long j, String str, Object obj) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(obj, "result");
            this.f27058a = j;
            this.f27059b = str;
            this.f27060c = obj;
        }
    }

    private JsonRpcResponse() {
    }

    public /* synthetic */ JsonRpcResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long getId();
}
