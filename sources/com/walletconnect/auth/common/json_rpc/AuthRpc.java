package com.walletconnect.auth.common.json_rpc;

import com.trustwallet.walletconnect.WCClientKt;
import com.walletconnect.auth.common.json_rpc.AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0001\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/walletconnect/auth/common/json_rpc/AuthRpc;", "Lo63;", "Lcom/walletconnect/auth/common/json_rpc/AuthParams;", "<init>", "()V", "AuthRequest", "Lcom/walletconnect/auth/common/json_rpc/AuthRpc$AuthRequest;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AuthRpc.kt */
public abstract class AuthRpc implements o63<AuthParams> {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/auth/common/json_rpc/AuthRpc$AuthRequest;", "Lcom/walletconnect/auth/common/json_rpc/AuthRpc;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/auth/common/json_rpc/AuthParams$RequestParams;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getMethod", "d", "Lcom/walletconnect/auth/common/json_rpc/AuthParams$RequestParams;", "()Lcom/walletconnect/auth/common/json_rpc/AuthParams$RequestParams;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/auth/common/json_rpc/AuthParams$RequestParams;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: AuthRpc.kt */
    public static final class AuthRequest extends AuthRpc {

        /* renamed from: a */
        public final long f27294a;

        /* renamed from: b */
        public final String f27295b;

        /* renamed from: c */
        public final String f27296c;

        /* renamed from: d */
        public final AuthParams.RequestParams f27297d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AuthRequest(long j, String str, String str2, AuthParams.RequestParams requestParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "wc_authRequest" : str2, requestParams);
        }

        /* renamed from: a */
        public String mo40628a() {
            return this.f27295b;
        }

        /* renamed from: b */
        public AuthParams.RequestParams getParams() {
            return this.f27297d;
        }

        public final AuthRequest copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") AuthParams.RequestParams requestParams) {
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(requestParams, "params");
            return new AuthRequest(j, str, str2, requestParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuthRequest)) {
                return false;
            }
            AuthRequest authRequest = (AuthRequest) obj;
            return getId() == authRequest.getId() && vx2.m53586b(mo40628a(), authRequest.mo40628a()) && vx2.m53586b(getMethod(), authRequest.getMethod()) && vx2.m53586b(getParams(), authRequest.getParams());
        }

        public long getId() {
            return this.f27294a;
        }

        public String getMethod() {
            return this.f27296c;
        }

        public int hashCode() {
            return (((((au0.m10781a(getId()) * 31) + mo40628a().hashCode()) * 31) + getMethod().hashCode()) * 31) + getParams().hashCode();
        }

        public String toString() {
            long id = getId();
            String a = mo40628a();
            String method = getMethod();
            AuthParams.RequestParams b = getParams();
            return "AuthRequest(id=" + id + ", jsonrpc=" + a + ", method=" + method + ", params=" + b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AuthRequest(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") AuthParams.RequestParams requestParams) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(requestParams, "params");
            this.f27294a = j;
            this.f27295b = str;
            this.f27296c = str2;
            this.f27297d = requestParams;
        }
    }

    private AuthRpc() {
    }

    public /* synthetic */ AuthRpc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
