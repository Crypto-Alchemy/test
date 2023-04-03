package com.walletconnect.foundation.network.model;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.trustwallet.walletconnect.WCClientKt;
import com.walletconnect.foundation.common.adapters.SubscriptionIdAdapter;
import com.walletconnect.foundation.common.adapters.TopicAdapter;
import com.walletconnect.foundation.common.adapters.TtlAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.ENS;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\t\n\u000b\f¨\u0006\r"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO;", "", "<init>", "()V", "Error", "Publish", "Subscribe", "Subscription", "Unsubscribe", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe;", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RelayDTO.kt */
public abstract class RelayDTO {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "", "", "code", "", "message", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "()J", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "errorMessage", "<init>", "(JLjava/lang/String;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: RelayDTO.kt */
    public static final class Error {

        /* renamed from: a */
        public final long f27379a;

        /* renamed from: b */
        public final String f27380b;

        /* renamed from: c */
        public final String f27381c;

        public Error(@y33(name = "code") long j, @y33(name = "message") String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            this.f27379a = j;
            this.f27380b = str;
            this.f27381c = "Error code: " + j + "; Error message: " + str;
        }

        /* renamed from: a */
        public final long mo40758a() {
            return this.f27379a;
        }

        /* renamed from: b */
        public final String mo40759b() {
            return this.f27381c;
        }

        /* renamed from: c */
        public final String mo40760c() {
            return this.f27380b;
        }

        public final Error copy(@y33(name = "code") long j, @y33(name = "message") String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            return new Error(j, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.f27379a == error.f27379a && vx2.m53586b(this.f27380b, error.f27380b);
        }

        public int hashCode() {
            return (au0.m10781a(this.f27379a) * 31) + this.f27380b.hashCode();
        }

        public String toString() {
            long j = this.f27379a;
            String str = this.f27380b;
            return "Error(code=" + j + ", message=" + str + ")";
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Publish;", "Lcom/walletconnect/foundation/network/model/RelayDTO;", "()V", "Request", "Result", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Request;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Result;", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: RelayDTO.kt */
    public static abstract class Publish extends RelayDTO {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Request;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Request$Params;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "d", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Request$Params;", "()Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Request$Params;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Request$Params;)V", "Params", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        @h43(generateAdapter = true)
        /* compiled from: RelayDTO.kt */
        public static final class Request extends Publish {

            /* renamed from: a */
            public final long f27382a;

            /* renamed from: b */
            public final String f27383b;

            /* renamed from: c */
            public final String f27384c;

            /* renamed from: d */
            public final Params f27385d;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b!\u0010\"JD\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006#"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Request$Params;", "", "Les6;", "topic", "", "message", "Lky6;", "ttl", "", "tag", "", "prompt", "copy", "(Les6;Ljava/lang/String;Lky6;ILjava/lang/Boolean;)Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Request$Params;", "toString", "hashCode", "other", "equals", "a", "Les6;", "d", "()Les6;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Lky6;", "e", "()Lky6;", "I", "()I", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "<init>", "(Les6;Ljava/lang/String;Lky6;ILjava/lang/Boolean;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            @h43(generateAdapter = true)
            /* compiled from: RelayDTO.kt */
            public static final class Params {
                @TopicAdapter.Qualifier

                /* renamed from: a */
                public final es6 f27386a;

                /* renamed from: b */
                public final String f27387b;
                @TtlAdapter.Qualifier

                /* renamed from: c */
                public final ky6 f27388c;

                /* renamed from: d */
                public final int f27389d;

                /* renamed from: e */
                public final Boolean f27390e;

                public Params(@y33(name = "topic") es6 es6, @y33(name = "message") String str, @y33(name = "ttl") ky6 ky6, @y33(name = "tag") int i, @y33(name = "prompt") Boolean bool) {
                    vx2.m53591g(es6, "topic");
                    vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                    vx2.m53591g(ky6, ENS.FUNC_TTL);
                    this.f27386a = es6;
                    this.f27387b = str;
                    this.f27388c = ky6;
                    this.f27389d = i;
                    this.f27390e = bool;
                }

                /* renamed from: a */
                public final String mo40773a() {
                    return this.f27387b;
                }

                /* renamed from: b */
                public final Boolean mo40774b() {
                    return this.f27390e;
                }

                /* renamed from: c */
                public final int mo40775c() {
                    return this.f27389d;
                }

                public final Params copy(@y33(name = "topic") es6 es6, @y33(name = "message") String str, @y33(name = "ttl") ky6 ky6, @y33(name = "tag") int i, @y33(name = "prompt") Boolean bool) {
                    vx2.m53591g(es6, "topic");
                    vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                    vx2.m53591g(ky6, ENS.FUNC_TTL);
                    return new Params(es6, str, ky6, i, bool);
                }

                /* renamed from: d */
                public final es6 mo40777d() {
                    return this.f27386a;
                }

                /* renamed from: e */
                public final ky6 mo40778e() {
                    return this.f27388c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Params)) {
                        return false;
                    }
                    Params params = (Params) obj;
                    return vx2.m53586b(this.f27386a, params.f27386a) && vx2.m53586b(this.f27387b, params.f27387b) && vx2.m53586b(this.f27388c, params.f27388c) && this.f27389d == params.f27389d && vx2.m53586b(this.f27390e, params.f27390e);
                }

                public int hashCode() {
                    int hashCode = ((((((this.f27386a.hashCode() * 31) + this.f27387b.hashCode()) * 31) + this.f27388c.hashCode()) * 31) + this.f27389d) * 31;
                    Boolean bool = this.f27390e;
                    return hashCode + (bool == null ? 0 : bool.hashCode());
                }

                public String toString() {
                    es6 es6 = this.f27386a;
                    String str = this.f27387b;
                    ky6 ky6 = this.f27388c;
                    int i = this.f27389d;
                    Boolean bool = this.f27390e;
                    return "Params(topic=" + es6 + ", message=" + str + ", ttl=" + ky6 + ", tag=" + i + ", prompt=" + bool + ")";
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "irn_publish" : str2, params);
            }

            /* renamed from: a */
            public long mo40765a() {
                return this.f27382a;
            }

            /* renamed from: b */
            public String mo40766b() {
                return this.f27383b;
            }

            /* renamed from: c */
            public final String mo40767c() {
                return this.f27384c;
            }

            public final Request copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") Params params) {
                vx2.m53591g(str, "jsonrpc");
                vx2.m53591g(str2, "method");
                vx2.m53591g(params, "params");
                return new Request(j, str, str2, params);
            }

            /* renamed from: d */
            public final Params mo40769d() {
                return this.f27385d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Request)) {
                    return false;
                }
                Request request = (Request) obj;
                return mo40765a() == request.mo40765a() && vx2.m53586b(mo40766b(), request.mo40766b()) && vx2.m53586b(this.f27384c, request.f27384c) && vx2.m53586b(this.f27385d, request.f27385d);
            }

            public int hashCode() {
                return (((((au0.m10781a(mo40765a()) * 31) + mo40766b().hashCode()) * 31) + this.f27384c.hashCode()) * 31) + this.f27385d.hashCode();
            }

            public String toString() {
                long a = mo40765a();
                String b = mo40766b();
                String str = this.f27384c;
                Params params = this.f27385d;
                return "Request(id=" + a + ", jsonrpc=" + b + ", method=" + str + ", params=" + params + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Request(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") Params params) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "jsonrpc");
                vx2.m53591g(str2, "method");
                vx2.m53591g(params, "params");
                this.f27382a = j;
                this.f27383b = str;
                this.f27384c = str2;
                this.f27385d = params;
            }
        }

        @Metadata(mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Result;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish;", "()V", "Acknowledgement", "JsonRpcError", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Result$Acknowledgement;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Result$JsonRpcError;", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* compiled from: RelayDTO.kt */
        public static abstract class Result extends Publish {

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Result$Acknowledgement;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Result;", "", "id", "", "jsonrpc", "", "result", "copy", "toString", "", "hashCode", "", "other", "equals", "a", "J", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Z", "()Z", "<init>", "(JLjava/lang/String;Z)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            @h43(generateAdapter = true)
            /* compiled from: RelayDTO.kt */
            public static final class Acknowledgement extends Result {

                /* renamed from: a */
                public final long f27391a;

                /* renamed from: b */
                public final String f27392b;

                /* renamed from: c */
                public final boolean f27393c;

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Acknowledgement(long j, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, z);
                }

                /* renamed from: a */
                public long mo40782a() {
                    return this.f27391a;
                }

                /* renamed from: b */
                public String mo40783b() {
                    return this.f27392b;
                }

                /* renamed from: c */
                public final boolean mo40784c() {
                    return this.f27393c;
                }

                public final Acknowledgement copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "result") boolean z) {
                    vx2.m53591g(str, "jsonrpc");
                    return new Acknowledgement(j, str, z);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Acknowledgement)) {
                        return false;
                    }
                    Acknowledgement acknowledgement = (Acknowledgement) obj;
                    return mo40782a() == acknowledgement.mo40782a() && vx2.m53586b(mo40783b(), acknowledgement.mo40783b()) && this.f27393c == acknowledgement.f27393c;
                }

                public int hashCode() {
                    int a = ((au0.m10781a(mo40782a()) * 31) + mo40783b().hashCode()) * 31;
                    boolean z = this.f27393c;
                    if (z) {
                        z = true;
                    }
                    return a + (z ? 1 : 0);
                }

                public String toString() {
                    long a = mo40782a();
                    String b = mo40783b();
                    boolean z = this.f27393c;
                    return "Acknowledgement(id=" + a + ", jsonrpc=" + b + ", result=" + z + ")";
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public Acknowledgement(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "result") boolean z) {
                    super((DefaultConstructorMarker) null);
                    vx2.m53591g(str, "jsonrpc");
                    this.f27391a = j;
                    this.f27392b = str;
                    this.f27393c = z;
                }
            }

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Result$JsonRpcError;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Result;", "", "jsonrpc", "Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "error", "", "id", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "()Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "J", "()J", "<init>", "(Ljava/lang/String;Lcom/walletconnect/foundation/network/model/RelayDTO$Error;J)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            @h43(generateAdapter = true)
            /* compiled from: RelayDTO.kt */
            public static final class JsonRpcError extends Result {

                /* renamed from: a */
                public final String f27394a;

                /* renamed from: b */
                public final Error f27395b;

                /* renamed from: c */
                public final long f27396c;

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? WCClientKt.JSONRPC_VERSION : str, error, j);
                }

                /* renamed from: a */
                public final Error mo40789a() {
                    return this.f27395b;
                }

                /* renamed from: b */
                public long mo40790b() {
                    return this.f27396c;
                }

                /* renamed from: c */
                public String mo40791c() {
                    return this.f27394a;
                }

                public final JsonRpcError copy(@y33(name = "jsonrpc") String str, @y33(name = "error") Error error, @y33(name = "id") long j) {
                    vx2.m53591g(str, "jsonrpc");
                    vx2.m53591g(error, "error");
                    return new JsonRpcError(str, error, j);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof JsonRpcError)) {
                        return false;
                    }
                    JsonRpcError jsonRpcError = (JsonRpcError) obj;
                    return vx2.m53586b(mo40791c(), jsonRpcError.mo40791c()) && vx2.m53586b(this.f27395b, jsonRpcError.f27395b) && mo40790b() == jsonRpcError.mo40790b();
                }

                public int hashCode() {
                    return (((mo40791c().hashCode() * 31) + this.f27395b.hashCode()) * 31) + au0.m10781a(mo40790b());
                }

                public String toString() {
                    String c = mo40791c();
                    Error error = this.f27395b;
                    long b = mo40790b();
                    return "JsonRpcError(jsonrpc=" + c + ", error=" + error + ", id=" + b + ")";
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public JsonRpcError(@y33(name = "jsonrpc") String str, @y33(name = "error") Error error, @y33(name = "id") long j) {
                    super((DefaultConstructorMarker) null);
                    vx2.m53591g(str, "jsonrpc");
                    vx2.m53591g(error, "error");
                    this.f27394a = str;
                    this.f27395b = error;
                    this.f27396c = j;
                }
            }

            private Result() {
                super((DefaultConstructorMarker) null);
            }

            public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private Publish() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ Publish(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe;", "Lcom/walletconnect/foundation/network/model/RelayDTO;", "()V", "Request", "Result", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Request;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Result;", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: RelayDTO.kt */
    public static abstract class Subscribe extends RelayDTO {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Request;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Request$Params;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "d", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Request$Params;", "()Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Request$Params;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Request$Params;)V", "Params", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        @h43(generateAdapter = true)
        /* compiled from: RelayDTO.kt */
        public static final class Request extends Subscribe {

            /* renamed from: a */
            public final long f27397a;

            /* renamed from: b */
            public final String f27398b;

            /* renamed from: c */
            public final String f27399c;

            /* renamed from: d */
            public final Params f27400d;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0011"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Request$Params;", "", "Les6;", "topic", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Les6;", "()Les6;", "<init>", "(Les6;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            @h43(generateAdapter = true)
            /* compiled from: RelayDTO.kt */
            public static final class Params {
                @TopicAdapter.Qualifier

                /* renamed from: a */
                public final es6 f27401a;

                public Params(@y33(name = "topic") es6 es6) {
                    vx2.m53591g(es6, "topic");
                    this.f27401a = es6;
                }

                /* renamed from: a */
                public final es6 mo40804a() {
                    return this.f27401a;
                }

                public final Params copy(@y33(name = "topic") es6 es6) {
                    vx2.m53591g(es6, "topic");
                    return new Params(es6);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Params) && vx2.m53586b(this.f27401a, ((Params) obj).f27401a);
                }

                public int hashCode() {
                    return this.f27401a.hashCode();
                }

                public String toString() {
                    es6 es6 = this.f27401a;
                    return "Params(topic=" + es6 + ")";
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "irn_subscribe" : str2, params);
            }

            /* renamed from: a */
            public long mo40796a() {
                return this.f27397a;
            }

            /* renamed from: b */
            public String mo40797b() {
                return this.f27398b;
            }

            /* renamed from: c */
            public final String mo40798c() {
                return this.f27399c;
            }

            public final Request copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") Params params) {
                vx2.m53591g(str, "jsonrpc");
                vx2.m53591g(str2, "method");
                vx2.m53591g(params, "params");
                return new Request(j, str, str2, params);
            }

            /* renamed from: d */
            public final Params mo40800d() {
                return this.f27400d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Request)) {
                    return false;
                }
                Request request = (Request) obj;
                return mo40796a() == request.mo40796a() && vx2.m53586b(mo40797b(), request.mo40797b()) && vx2.m53586b(this.f27399c, request.f27399c) && vx2.m53586b(this.f27400d, request.f27400d);
            }

            public int hashCode() {
                return (((((au0.m10781a(mo40796a()) * 31) + mo40797b().hashCode()) * 31) + this.f27399c.hashCode()) * 31) + this.f27400d.hashCode();
            }

            public String toString() {
                long a = mo40796a();
                String b = mo40797b();
                String str = this.f27399c;
                Params params = this.f27400d;
                return "Request(id=" + a + ", jsonrpc=" + b + ", method=" + str + ", params=" + params + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Request(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") Params params) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "jsonrpc");
                vx2.m53591g(str2, "method");
                vx2.m53591g(params, "params");
                this.f27397a = j;
                this.f27398b = str;
                this.f27399c = str2;
                this.f27400d = params;
            }
        }

        @Metadata(mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Result;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe;", "()V", "Acknowledgement", "JsonRpcError", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Result$Acknowledgement;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Result$JsonRpcError;", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* compiled from: RelayDTO.kt */
        public static abstract class Result extends Subscribe {

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Result$Acknowledgement;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Result;", "", "id", "", "jsonrpc", "Lsc6;", "result", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Lsc6;", "()Lsc6;", "<init>", "(JLjava/lang/String;Lsc6;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            @h43(generateAdapter = true)
            /* compiled from: RelayDTO.kt */
            public static final class Acknowledgement extends Result {

                /* renamed from: a */
                public final long f27402a;

                /* renamed from: b */
                public final String f27403b;
                @SubscriptionIdAdapter.Qualifier

                /* renamed from: c */
                public final sc6 f27404c;

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Acknowledgement(long j, String str, sc6 sc6, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, sc6);
                }

                /* renamed from: a */
                public long mo40809a() {
                    return this.f27402a;
                }

                /* renamed from: b */
                public String mo40810b() {
                    return this.f27403b;
                }

                /* renamed from: c */
                public final sc6 mo40811c() {
                    return this.f27404c;
                }

                public final Acknowledgement copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "result") sc6 sc6) {
                    vx2.m53591g(str, "jsonrpc");
                    vx2.m53591g(sc6, "result");
                    return new Acknowledgement(j, str, sc6);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Acknowledgement)) {
                        return false;
                    }
                    Acknowledgement acknowledgement = (Acknowledgement) obj;
                    return mo40809a() == acknowledgement.mo40809a() && vx2.m53586b(mo40810b(), acknowledgement.mo40810b()) && vx2.m53586b(this.f27404c, acknowledgement.f27404c);
                }

                public int hashCode() {
                    return (((au0.m10781a(mo40809a()) * 31) + mo40810b().hashCode()) * 31) + this.f27404c.hashCode();
                }

                public String toString() {
                    long a = mo40809a();
                    String b = mo40810b();
                    sc6 sc6 = this.f27404c;
                    return "Acknowledgement(id=" + a + ", jsonrpc=" + b + ", result=" + sc6 + ")";
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public Acknowledgement(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "result") sc6 sc6) {
                    super((DefaultConstructorMarker) null);
                    vx2.m53591g(str, "jsonrpc");
                    vx2.m53591g(sc6, "result");
                    this.f27402a = j;
                    this.f27403b = str;
                    this.f27404c = sc6;
                }
            }

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Result$JsonRpcError;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Result;", "", "jsonrpc", "Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "error", "", "id", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "()Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "J", "()J", "<init>", "(Ljava/lang/String;Lcom/walletconnect/foundation/network/model/RelayDTO$Error;J)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            @h43(generateAdapter = true)
            /* compiled from: RelayDTO.kt */
            public static final class JsonRpcError extends Result {

                /* renamed from: a */
                public final String f27405a;

                /* renamed from: b */
                public final Error f27406b;

                /* renamed from: c */
                public final long f27407c;

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? WCClientKt.JSONRPC_VERSION : str, error, j);
                }

                /* renamed from: a */
                public final Error mo40816a() {
                    return this.f27406b;
                }

                /* renamed from: b */
                public long mo40817b() {
                    return this.f27407c;
                }

                /* renamed from: c */
                public String mo40818c() {
                    return this.f27405a;
                }

                public final JsonRpcError copy(@y33(name = "jsonrpc") String str, @y33(name = "error") Error error, @y33(name = "id") long j) {
                    vx2.m53591g(str, "jsonrpc");
                    vx2.m53591g(error, "error");
                    return new JsonRpcError(str, error, j);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof JsonRpcError)) {
                        return false;
                    }
                    JsonRpcError jsonRpcError = (JsonRpcError) obj;
                    return vx2.m53586b(mo40818c(), jsonRpcError.mo40818c()) && vx2.m53586b(this.f27406b, jsonRpcError.f27406b) && mo40817b() == jsonRpcError.mo40817b();
                }

                public int hashCode() {
                    return (((mo40818c().hashCode() * 31) + this.f27406b.hashCode()) * 31) + au0.m10781a(mo40817b());
                }

                public String toString() {
                    String c = mo40818c();
                    Error error = this.f27406b;
                    long b = mo40817b();
                    return "JsonRpcError(jsonrpc=" + c + ", error=" + error + ", id=" + b + ")";
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public JsonRpcError(@y33(name = "jsonrpc") String str, @y33(name = "error") Error error, @y33(name = "id") long j) {
                    super((DefaultConstructorMarker) null);
                    vx2.m53591g(str, "jsonrpc");
                    vx2.m53591g(error, "error");
                    this.f27405a = str;
                    this.f27406b = error;
                    this.f27407c = j;
                }
            }

            private Result() {
                super((DefaultConstructorMarker) null);
            }

            public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private Subscribe() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ Subscribe(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription;", "Lcom/walletconnect/foundation/network/model/RelayDTO;", "<init>", "()V", "Request", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Result$Acknowledgement;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Result$JsonRpcError;", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: RelayDTO.kt */
    public static abstract class Subscription extends RelayDTO {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request$Params;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "d", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request$Params;", "()Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request$Params;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request$Params;)V", "Params", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        @h43(generateAdapter = true)
        /* compiled from: RelayDTO.kt */
        public static final class Request extends Subscription {

            /* renamed from: a */
            public final long f27408a;

            /* renamed from: b */
            public final String f27409b;

            /* renamed from: c */
            public final String f27410c;

            /* renamed from: d */
            public final Params f27411d;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request$Params;", "", "Lsc6;", "subscriptionId", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request$Params$SubscriptionData;", "subscriptionData", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lsc6;", "b", "()Lsc6;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request$Params$SubscriptionData;", "()Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request$Params$SubscriptionData;", "<init>", "(Lsc6;Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request$Params$SubscriptionData;)V", "SubscriptionData", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            @h43(generateAdapter = true)
            /* compiled from: RelayDTO.kt */
            public static final class Params {
                @SubscriptionIdAdapter.Qualifier

                /* renamed from: a */
                public final sc6 f27412a;

                /* renamed from: b */
                public final SubscriptionData f27413b;

                @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0015"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Request$Params$SubscriptionData;", "", "Les6;", "topic", "", "message", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Les6;", "b", "()Les6;", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Les6;Ljava/lang/String;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
                @h43(generateAdapter = true)
                /* compiled from: RelayDTO.kt */
                public static final class SubscriptionData {
                    @TopicAdapter.Qualifier

                    /* renamed from: a */
                    public final es6 f27414a;

                    /* renamed from: b */
                    public final String f27415b;

                    public SubscriptionData(@y33(name = "topic") es6 es6, @y33(name = "message") String str) {
                        vx2.m53591g(es6, "topic");
                        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                        this.f27414a = es6;
                        this.f27415b = str;
                    }

                    /* renamed from: a */
                    public final String mo40837a() {
                        return this.f27415b;
                    }

                    /* renamed from: b */
                    public final es6 mo40838b() {
                        return this.f27414a;
                    }

                    public final SubscriptionData copy(@y33(name = "topic") es6 es6, @y33(name = "message") String str) {
                        vx2.m53591g(es6, "topic");
                        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
                        return new SubscriptionData(es6, str);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof SubscriptionData)) {
                            return false;
                        }
                        SubscriptionData subscriptionData = (SubscriptionData) obj;
                        return vx2.m53586b(this.f27414a, subscriptionData.f27414a) && vx2.m53586b(this.f27415b, subscriptionData.f27415b);
                    }

                    public int hashCode() {
                        return (this.f27414a.hashCode() * 31) + this.f27415b.hashCode();
                    }

                    public String toString() {
                        es6 es6 = this.f27414a;
                        String str = this.f27415b;
                        return "SubscriptionData(topic=" + es6 + ", message=" + str + ")";
                    }
                }

                public Params(@y33(name = "id") sc6 sc6, @y33(name = "data") SubscriptionData subscriptionData) {
                    vx2.m53591g(sc6, "subscriptionId");
                    vx2.m53591g(subscriptionData, "subscriptionData");
                    this.f27412a = sc6;
                    this.f27413b = subscriptionData;
                }

                /* renamed from: a */
                public final SubscriptionData mo40831a() {
                    return this.f27413b;
                }

                /* renamed from: b */
                public final sc6 mo40832b() {
                    return this.f27412a;
                }

                public final Params copy(@y33(name = "id") sc6 sc6, @y33(name = "data") SubscriptionData subscriptionData) {
                    vx2.m53591g(sc6, "subscriptionId");
                    vx2.m53591g(subscriptionData, "subscriptionData");
                    return new Params(sc6, subscriptionData);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Params)) {
                        return false;
                    }
                    Params params = (Params) obj;
                    return vx2.m53586b(this.f27412a, params.f27412a) && vx2.m53586b(this.f27413b, params.f27413b);
                }

                public int hashCode() {
                    return (this.f27412a.hashCode() * 31) + this.f27413b.hashCode();
                }

                public String toString() {
                    sc6 sc6 = this.f27412a;
                    SubscriptionData subscriptionData = this.f27413b;
                    return "Params(subscriptionId=" + sc6 + ", subscriptionData=" + subscriptionData + ")";
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "irn_subscription" : str2, params);
            }

            /* renamed from: a */
            public long mo40823a() {
                return this.f27408a;
            }

            /* renamed from: b */
            public String mo40824b() {
                return this.f27409b;
            }

            /* renamed from: c */
            public final String mo40825c() {
                return this.f27410c;
            }

            public final Request copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") Params params) {
                vx2.m53591g(str, "jsonrpc");
                vx2.m53591g(str2, "method");
                vx2.m53591g(params, "params");
                return new Request(j, str, str2, params);
            }

            /* renamed from: d */
            public final Params mo40827d() {
                return this.f27411d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Request)) {
                    return false;
                }
                Request request = (Request) obj;
                return mo40823a() == request.mo40823a() && vx2.m53586b(mo40824b(), request.mo40824b()) && vx2.m53586b(this.f27410c, request.f27410c) && vx2.m53586b(this.f27411d, request.f27411d);
            }

            public int hashCode() {
                return (((((au0.m10781a(mo40823a()) * 31) + mo40824b().hashCode()) * 31) + this.f27410c.hashCode()) * 31) + this.f27411d.hashCode();
            }

            public String toString() {
                long a = mo40823a();
                String b = mo40824b();
                String str = this.f27410c;
                Params params = this.f27411d;
                return "Request(id=" + a + ", jsonrpc=" + b + ", method=" + str + ", params=" + params + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Request(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") Params params) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "jsonrpc");
                vx2.m53591g(str2, "method");
                vx2.m53591g(params, "params");
                this.f27408a = j;
                this.f27409b = str;
                this.f27410c = str2;
                this.f27411d = params;
            }
        }

        private Subscription() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ Subscription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe;", "Lcom/walletconnect/foundation/network/model/RelayDTO;", "()V", "Request", "Result", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Request;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Result;", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: RelayDTO.kt */
    public static abstract class Unsubscribe extends RelayDTO {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Request;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Request$Params;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "d", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Request$Params;", "()Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Request$Params;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Request$Params;)V", "Params", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        @h43(generateAdapter = true)
        /* compiled from: RelayDTO.kt */
        public static final class Request extends Unsubscribe {

            /* renamed from: a */
            public final long f27416a;

            /* renamed from: b */
            public final String f27417b;

            /* renamed from: c */
            public final String f27418c;

            /* renamed from: d */
            public final Params f27419d;

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0016"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Request$Params;", "", "Les6;", "topic", "Lsc6;", "subscriptionId", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Les6;", "b", "()Les6;", "Lsc6;", "()Lsc6;", "<init>", "(Les6;Lsc6;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            @h43(generateAdapter = true)
            /* compiled from: RelayDTO.kt */
            public static final class Params {
                @TopicAdapter.Qualifier

                /* renamed from: a */
                public final es6 f27420a;
                @SubscriptionIdAdapter.Qualifier

                /* renamed from: b */
                public final sc6 f27421b;

                public Params(@y33(name = "topic") es6 es6, @y33(name = "id") sc6 sc6) {
                    vx2.m53591g(es6, "topic");
                    vx2.m53591g(sc6, "subscriptionId");
                    this.f27420a = es6;
                    this.f27421b = sc6;
                }

                /* renamed from: a */
                public final sc6 mo40851a() {
                    return this.f27421b;
                }

                /* renamed from: b */
                public final es6 mo40852b() {
                    return this.f27420a;
                }

                public final Params copy(@y33(name = "topic") es6 es6, @y33(name = "id") sc6 sc6) {
                    vx2.m53591g(es6, "topic");
                    vx2.m53591g(sc6, "subscriptionId");
                    return new Params(es6, sc6);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Params)) {
                        return false;
                    }
                    Params params = (Params) obj;
                    return vx2.m53586b(this.f27420a, params.f27420a) && vx2.m53586b(this.f27421b, params.f27421b);
                }

                public int hashCode() {
                    return (this.f27420a.hashCode() * 31) + this.f27421b.hashCode();
                }

                public String toString() {
                    es6 es6 = this.f27420a;
                    sc6 sc6 = this.f27421b;
                    return "Params(topic=" + es6 + ", subscriptionId=" + sc6 + ")";
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "irn_unsubscribe" : str2, params);
            }

            /* renamed from: a */
            public long mo40843a() {
                return this.f27416a;
            }

            /* renamed from: b */
            public String mo40844b() {
                return this.f27417b;
            }

            /* renamed from: c */
            public final String mo40845c() {
                return this.f27418c;
            }

            public final Request copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") Params params) {
                vx2.m53591g(str, "jsonrpc");
                vx2.m53591g(str2, "method");
                vx2.m53591g(params, "params");
                return new Request(j, str, str2, params);
            }

            /* renamed from: d */
            public final Params mo40847d() {
                return this.f27419d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Request)) {
                    return false;
                }
                Request request = (Request) obj;
                return mo40843a() == request.mo40843a() && vx2.m53586b(mo40844b(), request.mo40844b()) && vx2.m53586b(this.f27418c, request.f27418c) && vx2.m53586b(this.f27419d, request.f27419d);
            }

            public int hashCode() {
                return (((((au0.m10781a(mo40843a()) * 31) + mo40844b().hashCode()) * 31) + this.f27418c.hashCode()) * 31) + this.f27419d.hashCode();
            }

            public String toString() {
                long a = mo40843a();
                String b = mo40844b();
                String str = this.f27418c;
                Params params = this.f27419d;
                return "Request(id=" + a + ", jsonrpc=" + b + ", method=" + str + ", params=" + params + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Request(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") Params params) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(str, "jsonrpc");
                vx2.m53591g(str2, "method");
                vx2.m53591g(params, "params");
                this.f27416a = j;
                this.f27417b = str;
                this.f27418c = str2;
                this.f27419d = params;
            }
        }

        @Metadata(mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Result;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe;", "()V", "Acknowledgement", "JsonRpcError", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Result$Acknowledgement;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Result$JsonRpcError;", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* compiled from: RelayDTO.kt */
        public static abstract class Result extends Unsubscribe {

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Result$Acknowledgement;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Result;", "", "id", "", "jsonrpc", "", "result", "copy", "toString", "", "hashCode", "", "other", "equals", "a", "J", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Z", "()Z", "<init>", "(JLjava/lang/String;Z)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            @h43(generateAdapter = true)
            /* compiled from: RelayDTO.kt */
            public static final class Acknowledgement extends Result {

                /* renamed from: a */
                public final long f27422a;

                /* renamed from: b */
                public final String f27423b;

                /* renamed from: c */
                public final boolean f27424c;

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Acknowledgement(long j, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, z);
                }

                /* renamed from: a */
                public long mo40857a() {
                    return this.f27422a;
                }

                /* renamed from: b */
                public String mo40858b() {
                    return this.f27423b;
                }

                /* renamed from: c */
                public final boolean mo40859c() {
                    return this.f27424c;
                }

                public final Acknowledgement copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "result") boolean z) {
                    vx2.m53591g(str, "jsonrpc");
                    return new Acknowledgement(j, str, z);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Acknowledgement)) {
                        return false;
                    }
                    Acknowledgement acknowledgement = (Acknowledgement) obj;
                    return mo40857a() == acknowledgement.mo40857a() && vx2.m53586b(mo40858b(), acknowledgement.mo40858b()) && this.f27424c == acknowledgement.f27424c;
                }

                public int hashCode() {
                    int a = ((au0.m10781a(mo40857a()) * 31) + mo40858b().hashCode()) * 31;
                    boolean z = this.f27424c;
                    if (z) {
                        z = true;
                    }
                    return a + (z ? 1 : 0);
                }

                public String toString() {
                    long a = mo40857a();
                    String b = mo40858b();
                    boolean z = this.f27424c;
                    return "Acknowledgement(id=" + a + ", jsonrpc=" + b + ", result=" + z + ")";
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public Acknowledgement(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "result") boolean z) {
                    super((DefaultConstructorMarker) null);
                    vx2.m53591g(str, "jsonrpc");
                    this.f27422a = j;
                    this.f27423b = str;
                    this.f27424c = z;
                }
            }

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Result$JsonRpcError;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Result;", "", "jsonrpc", "Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "error", "", "id", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "()Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "J", "()J", "<init>", "(Ljava/lang/String;Lcom/walletconnect/foundation/network/model/RelayDTO$Error;J)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
            @h43(generateAdapter = true)
            /* compiled from: RelayDTO.kt */
            public static final class JsonRpcError extends Result {

                /* renamed from: a */
                public final String f27425a;

                /* renamed from: b */
                public final Error f27426b;

                /* renamed from: c */
                public final long f27427c;

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? WCClientKt.JSONRPC_VERSION : str, error, j);
                }

                /* renamed from: a */
                public final Error mo40864a() {
                    return this.f27426b;
                }

                /* renamed from: b */
                public long mo40865b() {
                    return this.f27427c;
                }

                /* renamed from: c */
                public String mo40866c() {
                    return this.f27425a;
                }

                public final JsonRpcError copy(@y33(name = "jsonrpc") String str, @y33(name = "error") Error error, @y33(name = "id") long j) {
                    vx2.m53591g(str, "jsonrpc");
                    vx2.m53591g(error, "error");
                    return new JsonRpcError(str, error, j);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof JsonRpcError)) {
                        return false;
                    }
                    JsonRpcError jsonRpcError = (JsonRpcError) obj;
                    return vx2.m53586b(mo40866c(), jsonRpcError.mo40866c()) && vx2.m53586b(this.f27426b, jsonRpcError.f27426b) && mo40865b() == jsonRpcError.mo40865b();
                }

                public int hashCode() {
                    return (((mo40866c().hashCode() * 31) + this.f27426b.hashCode()) * 31) + au0.m10781a(mo40865b());
                }

                public String toString() {
                    String c = mo40866c();
                    Error error = this.f27426b;
                    long b = mo40865b();
                    return "JsonRpcError(jsonrpc=" + c + ", error=" + error + ", id=" + b + ")";
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public JsonRpcError(@y33(name = "jsonrpc") String str, @y33(name = "error") Error error, @y33(name = "id") long j) {
                    super((DefaultConstructorMarker) null);
                    vx2.m53591g(str, "jsonrpc");
                    vx2.m53591g(error, "error");
                    this.f27425a = str;
                    this.f27426b = error;
                    this.f27427c = j;
                }
            }

            private Result() {
                super((DefaultConstructorMarker) null);
            }

            public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private Unsubscribe() {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ Unsubscribe(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private RelayDTO() {
    }

    public /* synthetic */ RelayDTO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
