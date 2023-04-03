package com.walletconnect.auth.common.json_rpc;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.auth.common.json_rpc.AuthParams;
import com.walletconnect.auth.common.model.PayloadParams;
import com.walletconnect.auth.common.model.Requester;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u001c"}, mo44877d2 = {"Lcom/walletconnect/auth/common/json_rpc/AuthParams_RequestParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/auth/common/json_rpc/AuthParams$RequestParams;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/walletconnect/auth/common/model/Requester;", "b", "Lcom/squareup/moshi/d;", "requesterAdapter", "Lcom/walletconnect/auth/common/model/PayloadParams;", "c", "payloadParamsAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AuthParams_RequestParamsJsonAdapter.kt */
public final class AuthParams_RequestParamsJsonAdapter extends C5391d<AuthParams.RequestParams> {

    /* renamed from: a */
    public final JsonReader.C5372b f27291a;

    /* renamed from: b */
    public final C5391d<Requester> f27292b;

    /* renamed from: c */
    public final C5391d<PayloadParams> f27293c;

    public AuthParams_RequestParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("requester", "payloadParams");
        vx2.m53590f(a, "of(\"requester\", \"payloadParams\")");
        this.f27291a = a;
        C5391d<Requester> f = hVar.mo39411f(Requester.class, ny5.m49095e(), "requester");
        vx2.m53590f(f, "moshi.adapter(Requester:… emptySet(), \"requester\")");
        this.f27292b = f;
        C5391d<PayloadParams> f2 = hVar.mo39411f(PayloadParams.class, ny5.m49095e(), "payloadParams");
        vx2.m53590f(f2, "moshi.adapter(PayloadPar…tySet(), \"payloadParams\")");
        this.f27293c = f2;
    }

    /* renamed from: k */
    public AuthParams.RequestParams mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        Requester requester = null;
        PayloadParams payloadParams = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27291a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                requester = this.f27292b.mo39346b(jsonReader);
                if (requester == null) {
                    JsonDataException v = t67.m52121v("requester", "requester", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"requeste…     \"requester\", reader)");
                    throw v;
                }
            } else if (z == 1 && (payloadParams = this.f27293c.mo39346b(jsonReader)) == null) {
                JsonDataException v2 = t67.m52121v("payloadParams", "payloadParams", jsonReader);
                vx2.m53590f(v2, "unexpectedNull(\"payloadP… \"payloadParams\", reader)");
                throw v2;
            }
        }
        jsonReader.mo39278d();
        if (requester == null) {
            JsonDataException n = t67.m52113n("requester", "requester", jsonReader);
            vx2.m53590f(n, "missingProperty(\"requester\", \"requester\", reader)");
            throw n;
        } else if (payloadParams != null) {
            return new AuthParams.RequestParams(requester, payloadParams);
        } else {
            JsonDataException n2 = t67.m52113n("payloadParams", "payloadParams", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"payload… \"payloadParams\", reader)");
            throw n2;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, AuthParams.RequestParams requestParams) {
        vx2.m53591g(q73, "writer");
        if (requestParams != null) {
            q73.mo39394c();
            q73.mo39399j("requester");
            this.f27292b.mo39347j(q73, requestParams.mo40620b());
            q73.mo39399j("payloadParams");
            this.f27293c.mo39347j(q73, requestParams.mo40619a());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AuthParams.RequestParams");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
