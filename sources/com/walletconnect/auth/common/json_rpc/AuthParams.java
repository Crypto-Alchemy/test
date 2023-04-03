package com.walletconnect.auth.common.json_rpc;

import com.walletconnect.auth.common.model.PayloadParams;
import com.walletconnect.auth.common.model.Requester;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, mo44877d2 = {"Lcom/walletconnect/auth/common/json_rpc/AuthParams;", "Lrg0;", "<init>", "()V", "RequestParams", "Lcom/walletconnect/auth/common/json_rpc/AuthParams$RequestParams;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AuthParams.kt */
public abstract class AuthParams implements rg0 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/auth/common/json_rpc/AuthParams$RequestParams;", "Lcom/walletconnect/auth/common/json_rpc/AuthParams;", "Lcom/walletconnect/auth/common/model/Requester;", "requester", "Lcom/walletconnect/auth/common/model/PayloadParams;", "payloadParams", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/walletconnect/auth/common/model/Requester;", "b", "()Lcom/walletconnect/auth/common/model/Requester;", "Lcom/walletconnect/auth/common/model/PayloadParams;", "()Lcom/walletconnect/auth/common/model/PayloadParams;", "<init>", "(Lcom/walletconnect/auth/common/model/Requester;Lcom/walletconnect/auth/common/model/PayloadParams;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: AuthParams.kt */
    public static final class RequestParams extends AuthParams {

        /* renamed from: a */
        public final Requester f27289a;

        /* renamed from: b */
        public final PayloadParams f27290b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RequestParams(@y33(name = "requester") Requester requester, @y33(name = "payloadParams") PayloadParams payloadParams) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(requester, "requester");
            vx2.m53591g(payloadParams, "payloadParams");
            this.f27289a = requester;
            this.f27290b = payloadParams;
        }

        /* renamed from: a */
        public final PayloadParams mo40619a() {
            return this.f27290b;
        }

        /* renamed from: b */
        public final Requester mo40620b() {
            return this.f27289a;
        }

        public final RequestParams copy(@y33(name = "requester") Requester requester, @y33(name = "payloadParams") PayloadParams payloadParams) {
            vx2.m53591g(requester, "requester");
            vx2.m53591g(payloadParams, "payloadParams");
            return new RequestParams(requester, payloadParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestParams)) {
                return false;
            }
            RequestParams requestParams = (RequestParams) obj;
            return vx2.m53586b(this.f27289a, requestParams.f27289a) && vx2.m53586b(this.f27290b, requestParams.f27290b);
        }

        public int hashCode() {
            return (this.f27289a.hashCode() * 31) + this.f27290b.hashCode();
        }

        public String toString() {
            Requester requester = this.f27289a;
            PayloadParams payloadParams = this.f27290b;
            return "RequestParams(requester=" + requester + ", payloadParams=" + payloadParams + ")";
        }
    }

    private AuthParams() {
    }

    public /* synthetic */ AuthParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
