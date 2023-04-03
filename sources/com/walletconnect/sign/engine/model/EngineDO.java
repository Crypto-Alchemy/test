package com.walletconnect.sign.engine.model;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.trustwallet.walletconnect.WCClientKt;
import com.walletconnect.android.internal.common.model.AppMetaData;
import java.net.URI;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0011\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO;", "", "<init>", "()V", "a", "JsonRpcResponse", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "Lcom/walletconnect/sign/engine/model/EngineDO$a;", "Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse;", "Lcom/walletconnect/sign/engine/model/EngineDO$b;", "Lcom/walletconnect/sign/engine/model/EngineDO$c;", "Lcom/walletconnect/sign/engine/model/EngineDO$d;", "Lcom/walletconnect/sign/engine/model/EngineDO$e;", "Lcom/walletconnect/sign/engine/model/EngineDO$f;", "Lcom/walletconnect/sign/engine/model/EngineDO$g;", "Lcom/walletconnect/sign/engine/model/EngineDO$h;", "Lcom/walletconnect/sign/engine/model/EngineDO$i;", "Lcom/walletconnect/sign/engine/model/EngineDO$j;", "Lcom/walletconnect/sign/engine/model/EngineDO$k;", "Lcom/walletconnect/sign/engine/model/EngineDO$l;", "Lcom/walletconnect/sign/engine/model/EngineDO$l$a;", "Lcom/walletconnect/sign/engine/model/EngineDO$m;", "Lcom/walletconnect/sign/engine/model/EngineDO$n;", "Lcom/walletconnect/sign/engine/model/EngineDO$o;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: EngineDO.kt */
public abstract class EngineDO {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0007\b¨\u0006\t"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "<init>", "()V", "a", "JsonRpcError", "JsonRpcResult", "Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse$JsonRpcError;", "Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse$JsonRpcResult;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: EngineDO.kt */
    public static abstract class JsonRpcResponse extends EngineDO {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse$JsonRpcError;", "Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "b", "()J", "id", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "jsonrpc", "Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse$a;", "Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse$a;", "()Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse$a;", "error", "<init>", "(JLjava/lang/String;Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse$a;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        @h43(generateAdapter = true)
        /* compiled from: EngineDO.kt */
        public static final class JsonRpcError extends JsonRpcResponse {

            /* renamed from: a */
            public final long f27684a;

            /* renamed from: b */
            public final String f27685b;

            /* renamed from: c */
            public final C5653a f27686c;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ JsonRpcError(long j, String str, C5653a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, aVar);
            }

            /* renamed from: a */
            public final C5653a mo41254a() {
                return this.f27686c;
            }

            /* renamed from: b */
            public long mo41255b() {
                return this.f27684a;
            }

            /* renamed from: c */
            public final String mo41256c() {
                return this.f27685b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof JsonRpcError)) {
                    return false;
                }
                JsonRpcError jsonRpcError = (JsonRpcError) obj;
                return mo41255b() == jsonRpcError.mo41255b() && vx2.m53586b(this.f27685b, jsonRpcError.f27685b) && vx2.m53586b(this.f27686c, jsonRpcError.f27686c);
            }

            public int hashCode() {
                return (((au0.m10781a(mo41255b()) * 31) + this.f27685b.hashCode()) * 31) + this.f27686c.hashCode();
            }

            public String toString() {
                long b = mo41255b();
                String str = this.f27685b;
                C5653a aVar = this.f27686c;
                return "JsonRpcError(id=" + b + ", jsonrpc=" + str + ", error=" + aVar + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public JsonRpcError(long j, String str, C5653a aVar) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "jsonrpc");
                vx2.m53591g(aVar, "error");
                this.f27684a = j;
                this.f27685b = str;
                this.f27686c = aVar;
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse$JsonRpcResult;", "Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "()J", "id", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "jsonrpc", "c", "result", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        @h43(generateAdapter = true)
        /* compiled from: EngineDO.kt */
        public static final class JsonRpcResult extends JsonRpcResponse {

            /* renamed from: a */
            public final long f27687a;

            /* renamed from: b */
            public final String f27688b;

            /* renamed from: c */
            public final String f27689c;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ JsonRpcResult(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, str2);
            }

            /* renamed from: a */
            public long mo41260a() {
                return this.f27687a;
            }

            /* renamed from: b */
            public final String mo41261b() {
                return this.f27688b;
            }

            /* renamed from: c */
            public final String mo41262c() {
                return this.f27689c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof JsonRpcResult)) {
                    return false;
                }
                JsonRpcResult jsonRpcResult = (JsonRpcResult) obj;
                return mo41260a() == jsonRpcResult.mo41260a() && vx2.m53586b(this.f27688b, jsonRpcResult.f27688b) && vx2.m53586b(this.f27689c, jsonRpcResult.f27689c);
            }

            public int hashCode() {
                return (((au0.m10781a(mo41260a()) * 31) + this.f27688b.hashCode()) * 31) + this.f27689c.hashCode();
            }

            public String toString() {
                long a = mo41260a();
                String str = this.f27688b;
                String str2 = this.f27689c;
                return "JsonRpcResult(id=" + a + ", jsonrpc=" + str + ", result=" + str2 + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public JsonRpcResult(long j, String str, String str2) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "jsonrpc");
                vx2.m53591g(str2, "result");
                this.f27687a = j;
                this.f27688b = str;
                this.f27689c = str2;
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getCode", "()I", "code", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(ILjava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: com.walletconnect.sign.engine.model.EngineDO$JsonRpcResponse$a */
        /* compiled from: EngineDO.kt */
        public static final class C5653a {

            /* renamed from: a */
            public final int f27690a;

            /* renamed from: b */
            public final String f27691b;

            public C5653a(int i, String str) {
                vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                this.f27690a = i;
                this.f27691b = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5653a)) {
                    return false;
                }
                C5653a aVar = (C5653a) obj;
                return this.f27690a == aVar.f27690a && vx2.m53586b(this.f27691b, aVar.f27691b);
            }

            public int hashCode() {
                return (this.f27690a * 31) + this.f27691b.hashCode();
            }

            public String toString() {
                int i = this.f27690a;
                String str = this.f27691b;
                return "Error(code=" + i + ", message=" + str + ")";
            }
        }

        private JsonRpcResponse() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ JsonRpcResponse(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0014"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$a;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "name", "b", "data", "chainId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$a */
    /* compiled from: EngineDO.kt */
    public static final class C5654a extends EngineDO {

        /* renamed from: a */
        public final String f27692a;

        /* renamed from: b */
        public final String f27693b;

        /* renamed from: c */
        public final String f27694c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5654a(String str, String str2, String str3) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            vx2.m53591g(str2, "data");
            vx2.m53591g(str3, "chainId");
            this.f27692a = str;
            this.f27693b = str2;
            this.f27694c = str3;
        }

        /* renamed from: a */
        public final String mo41269a() {
            return this.f27694c;
        }

        /* renamed from: b */
        public final String mo41270b() {
            return this.f27693b;
        }

        /* renamed from: c */
        public final String mo41271c() {
            return this.f27692a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5654a)) {
                return false;
            }
            C5654a aVar = (C5654a) obj;
            return vx2.m53586b(this.f27692a, aVar.f27692a) && vx2.m53586b(this.f27693b, aVar.f27693b) && vx2.m53586b(this.f27694c, aVar.f27694c);
        }

        public int hashCode() {
            return (((this.f27692a.hashCode() * 31) + this.f27693b.hashCode()) * 31) + this.f27694c.hashCode();
        }

        public String toString() {
            String str = this.f27692a;
            String str2 = this.f27693b;
            String str3 = this.f27694c;
            return "Event(name=" + str + ", data=" + str2 + ", chainId=" + str3 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$b;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "<init>", "()V", "a", "b", "Lcom/walletconnect/sign/engine/model/EngineDO$b$a;", "Lcom/walletconnect/sign/engine/model/EngineDO$b$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$b */
    /* compiled from: EngineDO.kt */
    public static abstract class C5655b extends EngineDO {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001\u000bBA\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0012\u0010\r¨\u0006\u0018"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$b$a;", "Lcom/walletconnect/sign/engine/model/EngineDO$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "chains", "b", "d", "methods", "c", "events", "Lcom/walletconnect/sign/engine/model/EngineDO$b$a$a;", "extensions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: com.walletconnect.sign.engine.model.EngineDO$b$a */
        /* compiled from: EngineDO.kt */
        public static final class C5656a extends C5655b {

            /* renamed from: a */
            public final List<String> f27695a;

            /* renamed from: b */
            public final List<String> f27696b;

            /* renamed from: c */
            public final List<String> f27697c;

            /* renamed from: d */
            public final List<C5657a> f27698d;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$b$a$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "chains", "b", "c", "methods", "events", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            /* renamed from: com.walletconnect.sign.engine.model.EngineDO$b$a$a */
            /* compiled from: EngineDO.kt */
            public static final class C5657a {

                /* renamed from: a */
                public final List<String> f27699a;

                /* renamed from: b */
                public final List<String> f27700b;

                /* renamed from: c */
                public final List<String> f27701c;

                public C5657a(List<String> list, List<String> list2, List<String> list3) {
                    vx2.m53591g(list, "chains");
                    vx2.m53591g(list2, "methods");
                    vx2.m53591g(list3, "events");
                    this.f27699a = list;
                    this.f27700b = list2;
                    this.f27701c = list3;
                }

                /* renamed from: a */
                public final List<String> mo41282a() {
                    return this.f27699a;
                }

                /* renamed from: b */
                public final List<String> mo41283b() {
                    return this.f27701c;
                }

                /* renamed from: c */
                public final List<String> mo41284c() {
                    return this.f27700b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C5657a)) {
                        return false;
                    }
                    C5657a aVar = (C5657a) obj;
                    return vx2.m53586b(this.f27699a, aVar.f27699a) && vx2.m53586b(this.f27700b, aVar.f27700b) && vx2.m53586b(this.f27701c, aVar.f27701c);
                }

                public int hashCode() {
                    return (((this.f27699a.hashCode() * 31) + this.f27700b.hashCode()) * 31) + this.f27701c.hashCode();
                }

                public String toString() {
                    List<String> list = this.f27699a;
                    List<String> list2 = this.f27700b;
                    List<String> list3 = this.f27701c;
                    return "Extension(chains=" + list + ", methods=" + list2 + ", events=" + list3 + ")";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5656a(List<String> list, List<String> list2, List<String> list3, List<C5657a> list4) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(list, "chains");
                vx2.m53591g(list2, "methods");
                vx2.m53591g(list3, "events");
                this.f27695a = list;
                this.f27696b = list2;
                this.f27697c = list3;
                this.f27698d = list4;
            }

            /* renamed from: a */
            public final List<String> mo41275a() {
                return this.f27695a;
            }

            /* renamed from: b */
            public final List<String> mo41276b() {
                return this.f27697c;
            }

            /* renamed from: c */
            public final List<C5657a> mo41277c() {
                return this.f27698d;
            }

            /* renamed from: d */
            public final List<String> mo41278d() {
                return this.f27696b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5656a)) {
                    return false;
                }
                C5656a aVar = (C5656a) obj;
                return vx2.m53586b(this.f27695a, aVar.f27695a) && vx2.m53586b(this.f27696b, aVar.f27696b) && vx2.m53586b(this.f27697c, aVar.f27697c) && vx2.m53586b(this.f27698d, aVar.f27698d);
            }

            public int hashCode() {
                int hashCode = ((((this.f27695a.hashCode() * 31) + this.f27696b.hashCode()) * 31) + this.f27697c.hashCode()) * 31;
                List<C5657a> list = this.f27698d;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            public String toString() {
                List<String> list = this.f27695a;
                List<String> list2 = this.f27696b;
                List<String> list3 = this.f27697c;
                List<C5657a> list4 = this.f27698d;
                return "Proposal(chains=" + list + ", methods=" + list2 + ", events=" + list3 + ", extensions=" + list4 + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001\u000bBA\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0012\u0010\r¨\u0006\u0018"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$b$b;", "Lcom/walletconnect/sign/engine/model/EngineDO$b;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "accounts", "b", "d", "methods", "c", "events", "Lcom/walletconnect/sign/engine/model/EngineDO$b$b$a;", "extensions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: com.walletconnect.sign.engine.model.EngineDO$b$b */
        /* compiled from: EngineDO.kt */
        public static final class C5658b extends C5655b {

            /* renamed from: a */
            public final List<String> f27702a;

            /* renamed from: b */
            public final List<String> f27703b;

            /* renamed from: c */
            public final List<String> f27704c;

            /* renamed from: d */
            public final List<C5659a> f27705d;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$b$b$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "accounts", "b", "c", "methods", "events", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            /* renamed from: com.walletconnect.sign.engine.model.EngineDO$b$b$a */
            /* compiled from: EngineDO.kt */
            public static final class C5659a {

                /* renamed from: a */
                public final List<String> f27706a;

                /* renamed from: b */
                public final List<String> f27707b;

                /* renamed from: c */
                public final List<String> f27708c;

                public C5659a(List<String> list, List<String> list2, List<String> list3) {
                    vx2.m53591g(list, "accounts");
                    vx2.m53591g(list2, "methods");
                    vx2.m53591g(list3, "events");
                    this.f27706a = list;
                    this.f27707b = list2;
                    this.f27708c = list3;
                }

                /* renamed from: a */
                public final List<String> mo41295a() {
                    return this.f27706a;
                }

                /* renamed from: b */
                public final List<String> mo41296b() {
                    return this.f27708c;
                }

                /* renamed from: c */
                public final List<String> mo41297c() {
                    return this.f27707b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C5659a)) {
                        return false;
                    }
                    C5659a aVar = (C5659a) obj;
                    return vx2.m53586b(this.f27706a, aVar.f27706a) && vx2.m53586b(this.f27707b, aVar.f27707b) && vx2.m53586b(this.f27708c, aVar.f27708c);
                }

                public int hashCode() {
                    return (((this.f27706a.hashCode() * 31) + this.f27707b.hashCode()) * 31) + this.f27708c.hashCode();
                }

                public String toString() {
                    List<String> list = this.f27706a;
                    List<String> list2 = this.f27707b;
                    List<String> list3 = this.f27708c;
                    return "Extension(accounts=" + list + ", methods=" + list2 + ", events=" + list3 + ")";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5658b(List<String> list, List<String> list2, List<String> list3, List<C5659a> list4) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(list, "accounts");
                vx2.m53591g(list2, "methods");
                vx2.m53591g(list3, "events");
                this.f27702a = list;
                this.f27703b = list2;
                this.f27704c = list3;
                this.f27705d = list4;
            }

            /* renamed from: a */
            public final List<String> mo41288a() {
                return this.f27702a;
            }

            /* renamed from: b */
            public final List<String> mo41289b() {
                return this.f27704c;
            }

            /* renamed from: c */
            public final List<C5659a> mo41290c() {
                return this.f27705d;
            }

            /* renamed from: d */
            public final List<String> mo41291d() {
                return this.f27703b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5658b)) {
                    return false;
                }
                C5658b bVar = (C5658b) obj;
                return vx2.m53586b(this.f27702a, bVar.f27702a) && vx2.m53586b(this.f27703b, bVar.f27703b) && vx2.m53586b(this.f27704c, bVar.f27704c) && vx2.m53586b(this.f27705d, bVar.f27705d);
            }

            public int hashCode() {
                int hashCode = ((((this.f27702a.hashCode() * 31) + this.f27703b.hashCode()) * 31) + this.f27704c.hashCode()) * 31;
                List<C5659a> list = this.f27705d;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            public String toString() {
                List<String> list = this.f27702a;
                List<String> list2 = this.f27703b;
                List<String> list3 = this.f27704c;
                List<C5659a> list4 = this.f27705d;
                return "Session(accounts=" + list + ", methods=" + list2 + ", events=" + list3 + ", extensions=" + list4 + ")";
            }
        }

        public C5655b() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C5655b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0016"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$c;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "topic", "b", "method", "c", "params", "chainId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$c */
    /* compiled from: EngineDO.kt */
    public static final class C5660c extends EngineDO {

        /* renamed from: a */
        public final String f27709a;

        /* renamed from: b */
        public final String f27710b;

        /* renamed from: c */
        public final String f27711c;

        /* renamed from: d */
        public final String f27712d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5660c(String str, String str2, String str3, String str4) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(str2, "method");
            vx2.m53591g(str3, "params");
            vx2.m53591g(str4, "chainId");
            this.f27709a = str;
            this.f27710b = str2;
            this.f27711c = str3;
            this.f27712d = str4;
        }

        /* renamed from: a */
        public final String mo41301a() {
            return this.f27712d;
        }

        /* renamed from: b */
        public final String mo41302b() {
            return this.f27710b;
        }

        /* renamed from: c */
        public final String mo41303c() {
            return this.f27711c;
        }

        /* renamed from: d */
        public final String mo41304d() {
            return this.f27709a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5660c)) {
                return false;
            }
            C5660c cVar = (C5660c) obj;
            return vx2.m53586b(this.f27709a, cVar.f27709a) && vx2.m53586b(this.f27710b, cVar.f27710b) && vx2.m53586b(this.f27711c, cVar.f27711c) && vx2.m53586b(this.f27712d, cVar.f27712d);
        }

        public int hashCode() {
            return (((((this.f27709a.hashCode() * 31) + this.f27710b.hashCode()) * 31) + this.f27711c.hashCode()) * 31) + this.f27712d.hashCode();
        }

        public String toString() {
            String str = this.f27709a;
            String str2 = this.f27710b;
            String str3 = this.f27711c;
            String str4 = this.f27712d;
            return "Request(topic=" + str + ", method=" + str2 + ", params=" + str3 + ", chainId=" + str4 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b \u0010!J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001aR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\""}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$d;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "", "Lbq1;", "", "toString", "", "hashCode", "other", "", "equals", "Les6;", "a", "Les6;", "d", "()Les6;", "topic", "Lnx1;", "b", "Lnx1;", "()Lnx1;", "expiry", "", "Lcom/walletconnect/sign/engine/model/EngineDO$b$b;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "namespaces", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "()Lcom/walletconnect/android/internal/common/model/AppMetaData;", "peerAppMetaData", "<init>", "(Les6;Lnx1;Ljava/util/Map;Lcom/walletconnect/android/internal/common/model/AppMetaData;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$d */
    /* compiled from: EngineDO.kt */
    public static final class C5661d extends EngineDO implements bq1 {

        /* renamed from: a */
        public final es6 f27713a;

        /* renamed from: b */
        public final nx1 f27714b;

        /* renamed from: c */
        public final Map<String, C5655b.C5658b> f27715c;

        /* renamed from: d */
        public final AppMetaData f27716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5661d(es6 es6, nx1 nx1, Map<String, C5655b.C5658b> map, AppMetaData appMetaData) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(es6, "topic");
            vx2.m53591g(nx1, "expiry");
            vx2.m53591g(map, "namespaces");
            this.f27713a = es6;
            this.f27714b = nx1;
            this.f27715c = map;
            this.f27716d = appMetaData;
        }

        /* renamed from: a */
        public nx1 mo41308a() {
            return this.f27714b;
        }

        /* renamed from: b */
        public final Map<String, C5655b.C5658b> mo41309b() {
            return this.f27715c;
        }

        /* renamed from: c */
        public final AppMetaData mo41310c() {
            return this.f27716d;
        }

        /* renamed from: d */
        public es6 mo41311d() {
            return this.f27713a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5661d)) {
                return false;
            }
            C5661d dVar = (C5661d) obj;
            return vx2.m53586b(mo41311d(), dVar.mo41311d()) && vx2.m53586b(mo41308a(), dVar.mo41308a()) && vx2.m53586b(this.f27715c, dVar.f27715c) && vx2.m53586b(this.f27716d, dVar.f27716d);
        }

        public int hashCode() {
            int hashCode = ((((mo41311d().hashCode() * 31) + mo41308a().hashCode()) * 31) + this.f27715c.hashCode()) * 31;
            AppMetaData appMetaData = this.f27716d;
            return hashCode + (appMetaData == null ? 0 : appMetaData.hashCode());
        }

        public String toString() {
            es6 d = mo41311d();
            nx1 a = mo41308a();
            Map<String, C5655b.C5658b> map = this.f27715c;
            AppMetaData appMetaData = this.f27716d;
            return "Session(topic=" + d + ", expiry=" + a + ", namespaces=" + map + ", peerAppMetaData=" + appMetaData + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b#\u0010$J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$e;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "Lbq1;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getTopic", "()Ljava/lang/String;", "topic", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "b", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "getPeerAppMetaData", "()Lcom/walletconnect/android/internal/common/model/AppMetaData;", "peerAppMetaData", "", "c", "Ljava/util/List;", "getAccounts", "()Ljava/util/List;", "accounts", "", "Lcom/walletconnect/sign/engine/model/EngineDO$b$b;", "d", "Ljava/util/Map;", "getNamespaces", "()Ljava/util/Map;", "namespaces", "<init>", "(Ljava/lang/String;Lcom/walletconnect/android/internal/common/model/AppMetaData;Ljava/util/List;Ljava/util/Map;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$e */
    /* compiled from: EngineDO.kt */
    public static final class C5662e extends EngineDO implements bq1 {

        /* renamed from: a */
        public final String f27717a;

        /* renamed from: b */
        public final AppMetaData f27718b;

        /* renamed from: c */
        public final List<String> f27719c;

        /* renamed from: d */
        public final Map<String, C5655b.C5658b> f27720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5662e(String str, AppMetaData appMetaData, List<String> list, Map<String, C5655b.C5658b> map) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(list, "accounts");
            vx2.m53591g(map, "namespaces");
            this.f27717a = str;
            this.f27718b = appMetaData;
            this.f27719c = list;
            this.f27720d = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5662e)) {
                return false;
            }
            C5662e eVar = (C5662e) obj;
            return vx2.m53586b(this.f27717a, eVar.f27717a) && vx2.m53586b(this.f27718b, eVar.f27718b) && vx2.m53586b(this.f27719c, eVar.f27719c) && vx2.m53586b(this.f27720d, eVar.f27720d);
        }

        public int hashCode() {
            int hashCode = this.f27717a.hashCode() * 31;
            AppMetaData appMetaData = this.f27718b;
            return ((((hashCode + (appMetaData == null ? 0 : appMetaData.hashCode())) * 31) + this.f27719c.hashCode()) * 31) + this.f27720d.hashCode();
        }

        public String toString() {
            String str = this.f27717a;
            AppMetaData appMetaData = this.f27718b;
            List<String> list = this.f27719c;
            Map<String, C5655b.C5658b> map = this.f27720d;
            return "SessionApproved(topic=" + str + ", peerAppMetaData=" + appMetaData + ", accounts=" + list + ", namespaces=" + map + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0013"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$f;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "Lbq1;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "topic", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$f */
    /* compiled from: EngineDO.kt */
    public static final class C5663f extends EngineDO implements bq1 {

        /* renamed from: a */
        public final String f27721a;

        /* renamed from: b */
        public final String f27722b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5663f(String str, String str2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(str2, "reason");
            this.f27721a = str;
            this.f27722b = str2;
        }

        /* renamed from: a */
        public final String mo41318a() {
            return this.f27722b;
        }

        /* renamed from: b */
        public final String mo41319b() {
            return this.f27721a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5663f)) {
                return false;
            }
            C5663f fVar = (C5663f) obj;
            return vx2.m53586b(this.f27721a, fVar.f27721a) && vx2.m53586b(this.f27722b, fVar.f27722b);
        }

        public int hashCode() {
            return (this.f27721a.hashCode() * 31) + this.f27722b.hashCode();
        }

        public String toString() {
            String str = this.f27721a;
            String str2 = this.f27722b;
            return "SessionDelete(topic=" + str + ", reason=" + str2 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$g;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "Lbq1;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getTopic", "()Ljava/lang/String;", "topic", "b", "getName", "name", "c", "getData", "data", "d", "getChainId", "chainId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$g */
    /* compiled from: EngineDO.kt */
    public static final class C5664g extends EngineDO implements bq1 {

        /* renamed from: a */
        public final String f27723a;

        /* renamed from: b */
        public final String f27724b;

        /* renamed from: c */
        public final String f27725c;

        /* renamed from: d */
        public final String f27726d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5664g(String str, String str2, String str3, String str4) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(str2, PublicResolver.FUNC_NAME);
            vx2.m53591g(str3, "data");
            this.f27723a = str;
            this.f27724b = str2;
            this.f27725c = str3;
            this.f27726d = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5664g)) {
                return false;
            }
            C5664g gVar = (C5664g) obj;
            return vx2.m53586b(this.f27723a, gVar.f27723a) && vx2.m53586b(this.f27724b, gVar.f27724b) && vx2.m53586b(this.f27725c, gVar.f27725c) && vx2.m53586b(this.f27726d, gVar.f27726d);
        }

        public int hashCode() {
            int hashCode = ((((this.f27723a.hashCode() * 31) + this.f27724b.hashCode()) * 31) + this.f27725c.hashCode()) * 31;
            String str = this.f27726d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f27723a;
            String str2 = this.f27724b;
            String str3 = this.f27725c;
            String str4 = this.f27726d;
            return "SessionEvent(topic=" + str + ", name=" + str2 + ", data=" + str3 + ", chainId=" + str4 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0015\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\"\u0010#J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0013R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$h;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "", "Lbq1;", "", "toString", "", "hashCode", "other", "", "equals", "Les6;", "a", "Les6;", "b", "()Les6;", "topic", "Lnx1;", "Lnx1;", "()Lnx1;", "expiry", "", "Lcom/walletconnect/sign/engine/model/EngineDO$b$b;", "c", "Ljava/util/Map;", "getNamespaces", "()Ljava/util/Map;", "namespaces", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "d", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "getPeerAppMetaData", "()Lcom/walletconnect/android/internal/common/model/AppMetaData;", "peerAppMetaData", "<init>", "(Les6;Lnx1;Ljava/util/Map;Lcom/walletconnect/android/internal/common/model/AppMetaData;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$h */
    /* compiled from: EngineDO.kt */
    public static final class C5665h extends EngineDO implements bq1 {

        /* renamed from: a */
        public final es6 f27727a;

        /* renamed from: b */
        public final nx1 f27728b;

        /* renamed from: c */
        public final Map<String, C5655b.C5658b> f27729c;

        /* renamed from: d */
        public final AppMetaData f27730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5665h(es6 es6, nx1 nx1, Map<String, C5655b.C5658b> map, AppMetaData appMetaData) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(es6, "topic");
            vx2.m53591g(nx1, "expiry");
            vx2.m53591g(map, "namespaces");
            this.f27727a = es6;
            this.f27728b = nx1;
            this.f27729c = map;
            this.f27730d = appMetaData;
        }

        /* renamed from: a */
        public nx1 mo41326a() {
            return this.f27728b;
        }

        /* renamed from: b */
        public es6 mo41327b() {
            return this.f27727a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5665h)) {
                return false;
            }
            C5665h hVar = (C5665h) obj;
            return vx2.m53586b(mo41327b(), hVar.mo41327b()) && vx2.m53586b(mo41326a(), hVar.mo41326a()) && vx2.m53586b(this.f27729c, hVar.f27729c) && vx2.m53586b(this.f27730d, hVar.f27730d);
        }

        public int hashCode() {
            int hashCode = ((((mo41327b().hashCode() * 31) + mo41326a().hashCode()) * 31) + this.f27729c.hashCode()) * 31;
            AppMetaData appMetaData = this.f27730d;
            return hashCode + (appMetaData == null ? 0 : appMetaData.hashCode());
        }

        public String toString() {
            es6 b = mo41327b();
            nx1 a = mo41326a();
            Map<String, C5655b.C5658b> map = this.f27729c;
            AppMetaData appMetaData = this.f27730d;
            return "SessionExtend(topic=" + b + ", expiry=" + a + ", namespaces=" + map + ", peerAppMetaData=" + appMetaData + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$i;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "Lbq1;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getTopic", "()Ljava/lang/String;", "topic", "b", "getChainId", "chainId", "c", "getMethod", "method", "Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse;", "d", "Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse;", "getResult", "()Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse;", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$i */
    /* compiled from: EngineDO.kt */
    public static final class C5666i extends EngineDO implements bq1 {

        /* renamed from: a */
        public final String f27731a;

        /* renamed from: b */
        public final String f27732b;

        /* renamed from: c */
        public final String f27733c;

        /* renamed from: d */
        public final JsonRpcResponse f27734d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5666i(String str, String str2, String str3, JsonRpcResponse jsonRpcResponse) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(str3, "method");
            vx2.m53591g(jsonRpcResponse, "result");
            this.f27731a = str;
            this.f27732b = str2;
            this.f27733c = str3;
            this.f27734d = jsonRpcResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5666i)) {
                return false;
            }
            C5666i iVar = (C5666i) obj;
            return vx2.m53586b(this.f27731a, iVar.f27731a) && vx2.m53586b(this.f27732b, iVar.f27732b) && vx2.m53586b(this.f27733c, iVar.f27733c) && vx2.m53586b(this.f27734d, iVar.f27734d);
        }

        public int hashCode() {
            int hashCode = this.f27731a.hashCode() * 31;
            String str = this.f27732b;
            return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f27733c.hashCode()) * 31) + this.f27734d.hashCode();
        }

        public String toString() {
            String str = this.f27731a;
            String str2 = this.f27732b;
            String str3 = this.f27733c;
            JsonRpcResponse jsonRpcResponse = this.f27734d;
            return "SessionPayloadResponse(topic=" + str + ", chainId=" + str2 + ", method=" + str3 + ", result=" + jsonRpcResponse + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b'\u0010(J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0010\u0010\u001aR#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010$\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010%\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b#\u0010\u000eR\u0019\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u001e\u0010\u000e¨\u0006)"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$j;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "Lbq1;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "pairingTopic", "b", "c", "name", "description", "i", "url", "", "Ljava/net/URI;", "e", "Ljava/util/List;", "()Ljava/util/List;", "icons", "", "Lcom/walletconnect/sign/engine/model/EngineDO$b$a;", "f", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "requiredNamespaces", "g", "proposerPublicKey", "relayProtocol", "relayData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$j */
    /* compiled from: EngineDO.kt */
    public static final class C5667j extends EngineDO implements bq1 {

        /* renamed from: a */
        public final String f27735a;

        /* renamed from: b */
        public final String f27736b;

        /* renamed from: c */
        public final String f27737c;

        /* renamed from: d */
        public final String f27738d;

        /* renamed from: e */
        public final List<URI> f27739e;

        /* renamed from: f */
        public final Map<String, C5655b.C5656a> f27740f;

        /* renamed from: g */
        public final String f27741g;

        /* renamed from: h */
        public final String f27742h;

        /* renamed from: i */
        public final String f27743i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5667j(String str, String str2, String str3, String str4, List<URI> list, Map<String, C5655b.C5656a> map, String str5, String str6, String str7) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "pairingTopic");
            vx2.m53591g(str2, PublicResolver.FUNC_NAME);
            vx2.m53591g(str3, "description");
            vx2.m53591g(str4, "url");
            vx2.m53591g(list, "icons");
            vx2.m53591g(map, "requiredNamespaces");
            vx2.m53591g(str5, "proposerPublicKey");
            vx2.m53591g(str6, "relayProtocol");
            this.f27735a = str;
            this.f27736b = str2;
            this.f27737c = str3;
            this.f27738d = str4;
            this.f27739e = list;
            this.f27740f = map;
            this.f27741g = str5;
            this.f27742h = str6;
            this.f27743i = str7;
        }

        /* renamed from: a */
        public final String mo41334a() {
            return this.f27737c;
        }

        /* renamed from: b */
        public final List<URI> mo41335b() {
            return this.f27739e;
        }

        /* renamed from: c */
        public final String mo41336c() {
            return this.f27736b;
        }

        /* renamed from: d */
        public final String mo41337d() {
            return this.f27735a;
        }

        /* renamed from: e */
        public final String mo41338e() {
            return this.f27741g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5667j)) {
                return false;
            }
            C5667j jVar = (C5667j) obj;
            return vx2.m53586b(this.f27735a, jVar.f27735a) && vx2.m53586b(this.f27736b, jVar.f27736b) && vx2.m53586b(this.f27737c, jVar.f27737c) && vx2.m53586b(this.f27738d, jVar.f27738d) && vx2.m53586b(this.f27739e, jVar.f27739e) && vx2.m53586b(this.f27740f, jVar.f27740f) && vx2.m53586b(this.f27741g, jVar.f27741g) && vx2.m53586b(this.f27742h, jVar.f27742h) && vx2.m53586b(this.f27743i, jVar.f27743i);
        }

        /* renamed from: f */
        public final String mo41340f() {
            return this.f27743i;
        }

        /* renamed from: g */
        public final String mo41341g() {
            return this.f27742h;
        }

        /* renamed from: h */
        public final Map<String, C5655b.C5656a> mo41342h() {
            return this.f27740f;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((this.f27735a.hashCode() * 31) + this.f27736b.hashCode()) * 31) + this.f27737c.hashCode()) * 31) + this.f27738d.hashCode()) * 31) + this.f27739e.hashCode()) * 31) + this.f27740f.hashCode()) * 31) + this.f27741g.hashCode()) * 31) + this.f27742h.hashCode()) * 31;
            String str = this.f27743i;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        /* renamed from: i */
        public final String mo41344i() {
            return this.f27738d;
        }

        public String toString() {
            String str = this.f27735a;
            String str2 = this.f27736b;
            String str3 = this.f27737c;
            String str4 = this.f27738d;
            List<URI> list = this.f27739e;
            Map<String, C5655b.C5656a> map = this.f27740f;
            String str5 = this.f27741g;
            String str6 = this.f27742h;
            String str7 = this.f27743i;
            return "SessionProposal(pairingTopic=" + str + ", name=" + str2 + ", description=" + str3 + ", url=" + str4 + ", icons=" + list + ", requiredNamespaces=" + map + ", proposerPublicKey=" + str5 + ", relayProtocol=" + str6 + ", relayData=" + str7 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$k;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "Lbq1;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getTopic", "()Ljava/lang/String;", "topic", "b", "getReason", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$k */
    /* compiled from: EngineDO.kt */
    public static final class C5668k extends EngineDO implements bq1 {

        /* renamed from: a */
        public final String f27744a;

        /* renamed from: b */
        public final String f27745b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5668k(String str, String str2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(str2, "reason");
            this.f27744a = str;
            this.f27745b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5668k)) {
                return false;
            }
            C5668k kVar = (C5668k) obj;
            return vx2.m53586b(this.f27744a, kVar.f27744a) && vx2.m53586b(this.f27745b, kVar.f27745b);
        }

        public int hashCode() {
            return (this.f27744a.hashCode() * 31) + this.f27745b.hashCode();
        }

        public String toString() {
            String str = this.f27744a;
            String str2 = this.f27745b;
            return "SessionRejected(topic=" + str + ", reason=" + str2 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB+\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$l;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "Lbq1;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "topic", "b", "chainId", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "c", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "()Lcom/walletconnect/android/internal/common/model/AppMetaData;", "peerAppMetaData", "Lcom/walletconnect/sign/engine/model/EngineDO$l$a;", "Lcom/walletconnect/sign/engine/model/EngineDO$l$a;", "()Lcom/walletconnect/sign/engine/model/EngineDO$l$a;", "request", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/walletconnect/android/internal/common/model/AppMetaData;Lcom/walletconnect/sign/engine/model/EngineDO$l$a;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$l */
    /* compiled from: EngineDO.kt */
    public static final class C5669l extends EngineDO implements bq1 {

        /* renamed from: a */
        public final String f27746a;

        /* renamed from: b */
        public final String f27747b;

        /* renamed from: c */
        public final AppMetaData f27748c;

        /* renamed from: d */
        public final C5670a f27749d;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$l$a;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "J", "()J", "id", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "method", "c", "params", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: com.walletconnect.sign.engine.model.EngineDO$l$a */
        /* compiled from: EngineDO.kt */
        public static final class C5670a extends EngineDO {

            /* renamed from: a */
            public final long f27750a;

            /* renamed from: b */
            public final String f27751b;

            /* renamed from: c */
            public final String f27752c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5670a(long j, String str, String str2) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "method");
                vx2.m53591g(str2, "params");
                this.f27750a = j;
                this.f27751b = str;
                this.f27752c = str2;
            }

            /* renamed from: a */
            public final long mo41356a() {
                return this.f27750a;
            }

            /* renamed from: b */
            public final String mo41357b() {
                return this.f27751b;
            }

            /* renamed from: c */
            public final String mo41358c() {
                return this.f27752c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5670a)) {
                    return false;
                }
                C5670a aVar = (C5670a) obj;
                return this.f27750a == aVar.f27750a && vx2.m53586b(this.f27751b, aVar.f27751b) && vx2.m53586b(this.f27752c, aVar.f27752c);
            }

            public int hashCode() {
                return (((au0.m10781a(this.f27750a) * 31) + this.f27751b.hashCode()) * 31) + this.f27752c.hashCode();
            }

            public String toString() {
                long j = this.f27750a;
                String str = this.f27751b;
                String str2 = this.f27752c;
                return "JSONRPCRequest(id=" + j + ", method=" + str + ", params=" + str2 + ")";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5669l(String str, String str2, AppMetaData appMetaData, C5670a aVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(aVar, "request");
            this.f27746a = str;
            this.f27747b = str2;
            this.f27748c = appMetaData;
            this.f27749d = aVar;
        }

        /* renamed from: a */
        public final String mo41349a() {
            return this.f27747b;
        }

        /* renamed from: b */
        public final AppMetaData mo41350b() {
            return this.f27748c;
        }

        /* renamed from: c */
        public final C5670a mo41351c() {
            return this.f27749d;
        }

        /* renamed from: d */
        public final String mo41352d() {
            return this.f27746a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5669l)) {
                return false;
            }
            C5669l lVar = (C5669l) obj;
            return vx2.m53586b(this.f27746a, lVar.f27746a) && vx2.m53586b(this.f27747b, lVar.f27747b) && vx2.m53586b(this.f27748c, lVar.f27748c) && vx2.m53586b(this.f27749d, lVar.f27749d);
        }

        public int hashCode() {
            int hashCode = this.f27746a.hashCode() * 31;
            String str = this.f27747b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AppMetaData appMetaData = this.f27748c;
            if (appMetaData != null) {
                i = appMetaData.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.f27749d.hashCode();
        }

        public String toString() {
            String str = this.f27746a;
            String str2 = this.f27747b;
            AppMetaData appMetaData = this.f27748c;
            C5670a aVar = this.f27749d;
            return "SessionRequest(topic=" + str + ", chainId=" + str2 + ", peerAppMetaData=" + appMetaData + ", request=" + aVar + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$m;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "Lbq1;", "", "toString", "", "hashCode", "", "other", "", "equals", "Les6;", "a", "Les6;", "getTopic", "()Les6;", "topic", "", "Lcom/walletconnect/sign/engine/model/EngineDO$b$b;", "b", "Ljava/util/Map;", "getNamespaces", "()Ljava/util/Map;", "namespaces", "<init>", "(Les6;Ljava/util/Map;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$m */
    /* compiled from: EngineDO.kt */
    public static final class C5671m extends EngineDO implements bq1 {

        /* renamed from: a */
        public final es6 f27753a;

        /* renamed from: b */
        public final Map<String, C5655b.C5658b> f27754b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5671m(es6 es6, Map<String, C5655b.C5658b> map) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(es6, "topic");
            vx2.m53591g(map, "namespaces");
            this.f27753a = es6;
            this.f27754b = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5671m)) {
                return false;
            }
            C5671m mVar = (C5671m) obj;
            return vx2.m53586b(this.f27753a, mVar.f27753a) && vx2.m53586b(this.f27754b, mVar.f27754b);
        }

        public int hashCode() {
            return (this.f27753a.hashCode() * 31) + this.f27754b.hashCode();
        }

        public String toString() {
            es6 es6 = this.f27753a;
            Map<String, C5655b.C5658b> map = this.f27754b;
            return "SessionUpdateNamespaces(topic=" + es6 + ", namespaces=" + map + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0002\u0007\b¨\u0006\t"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$n;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "Lbq1;", "<init>", "()V", "a", "b", "Lcom/walletconnect/sign/engine/model/EngineDO$n$a;", "Lcom/walletconnect/sign/engine/model/EngineDO$n$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$n */
    /* compiled from: EngineDO.kt */
    public static abstract class C5672n extends EngineDO implements bq1 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$n$a;", "Lcom/walletconnect/sign/engine/model/EngineDO$n;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "errorMessage", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: com.walletconnect.sign.engine.model.EngineDO$n$a */
        /* compiled from: EngineDO.kt */
        public static final class C5673a extends C5672n {

            /* renamed from: a */
            public final String f27755a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5673a(String str) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "errorMessage");
                this.f27755a = str;
            }

            /* renamed from: a */
            public final String mo41365a() {
                return this.f27755a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5673a) && vx2.m53586b(this.f27755a, ((C5673a) obj).f27755a);
            }

            public int hashCode() {
                return this.f27755a.hashCode();
            }

            public String toString() {
                String str = this.f27755a;
                return "Error(errorMessage=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$n$b;", "Lcom/walletconnect/sign/engine/model/EngineDO$n;", "", "toString", "", "hashCode", "", "other", "", "equals", "Les6;", "a", "Les6;", "b", "()Les6;", "topic", "", "Lcom/walletconnect/sign/engine/model/EngineDO$b$b;", "Ljava/util/Map;", "()Ljava/util/Map;", "namespaces", "<init>", "(Les6;Ljava/util/Map;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: com.walletconnect.sign.engine.model.EngineDO$n$b */
        /* compiled from: EngineDO.kt */
        public static final class C5674b extends C5672n {

            /* renamed from: a */
            public final es6 f27756a;

            /* renamed from: b */
            public final Map<String, C5655b.C5658b> f27757b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5674b(es6 es6, Map<String, C5655b.C5658b> map) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(es6, "topic");
                vx2.m53591g(map, "namespaces");
                this.f27756a = es6;
                this.f27757b = map;
            }

            /* renamed from: a */
            public final Map<String, C5655b.C5658b> mo41369a() {
                return this.f27757b;
            }

            /* renamed from: b */
            public final es6 mo41370b() {
                return this.f27756a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5674b)) {
                    return false;
                }
                C5674b bVar = (C5674b) obj;
                return vx2.m53586b(this.f27756a, bVar.f27756a) && vx2.m53586b(this.f27757b, bVar.f27757b);
            }

            public int hashCode() {
                return (this.f27756a.hashCode() * 31) + this.f27757b.hashCode();
            }

            public String toString() {
                es6 es6 = this.f27756a;
                Map<String, C5655b.C5658b> map = this.f27757b;
                return "Result(topic=" + es6 + ", namespaces=" + map + ")";
            }
        }

        public C5672n() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C5672n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0002\u0007\b¨\u0006\t"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$o;", "Lcom/walletconnect/sign/engine/model/EngineDO;", "Lbq1;", "<init>", "()V", "a", "b", "Lcom/walletconnect/sign/engine/model/EngineDO$o$a;", "Lcom/walletconnect/sign/engine/model/EngineDO$o$b;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.model.EngineDO$o */
    /* compiled from: EngineDO.kt */
    public static abstract class C5675o extends EngineDO implements bq1 {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$o$a;", "Lcom/walletconnect/sign/engine/model/EngineDO$o;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "errorMessage", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: com.walletconnect.sign.engine.model.EngineDO$o$a */
        /* compiled from: EngineDO.kt */
        public static final class C5676a extends C5675o {

            /* renamed from: a */
            public final String f27758a;

            /* renamed from: a */
            public final String mo41374a() {
                return this.f27758a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5676a) && vx2.m53586b(this.f27758a, ((C5676a) obj).f27758a);
            }

            public int hashCode() {
                return this.f27758a.hashCode();
            }

            public String toString() {
                String str = this.f27758a;
                return "Error(errorMessage=" + str + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO$o$b;", "Lcom/walletconnect/sign/engine/model/EngineDO$o;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/walletconnect/sign/engine/model/EngineDO$d;", "a", "Lcom/walletconnect/sign/engine/model/EngineDO$d;", "()Lcom/walletconnect/sign/engine/model/EngineDO$d;", "settledSession", "<init>", "(Lcom/walletconnect/sign/engine/model/EngineDO$d;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: com.walletconnect.sign.engine.model.EngineDO$o$b */
        /* compiled from: EngineDO.kt */
        public static final class C5677b extends C5675o {

            /* renamed from: a */
            public final C5661d f27759a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5677b(C5661d dVar) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(dVar, "settledSession");
                this.f27759a = dVar;
            }

            /* renamed from: a */
            public final C5661d mo41378a() {
                return this.f27759a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5677b) && vx2.m53586b(this.f27759a, ((C5677b) obj).f27759a);
            }

            public int hashCode() {
                return this.f27759a.hashCode();
            }

            public String toString() {
                C5661d dVar = this.f27759a;
                return "Result(settledSession=" + dVar + ")";
            }
        }

        public C5675o() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ C5675o(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private EngineDO() {
    }

    public /* synthetic */ EngineDO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
