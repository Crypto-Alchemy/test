package com.walletconnect.sign.common.model.p016vo.clientsync.session.params;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.payload.SessionRequestVO;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams_SessionRequestParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionRequestParams;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionRequestVO;", "b", "Lcom/squareup/moshi/d;", "sessionRequestVOAdapter", "c", "stringAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams_SessionRequestParamsJsonAdapter */
/* compiled from: SignParams_SessionRequestParamsJsonAdapter.kt */
public final class SignParams_SessionRequestParamsJsonAdapter extends C5391d<SignParams.SessionRequestParams> {

    /* renamed from: a */
    public final JsonReader.C5372b f27641a;

    /* renamed from: b */
    public final C5391d<SessionRequestVO> f27642b;

    /* renamed from: c */
    public final C5391d<String> f27643c;

    public SignParams_SessionRequestParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("request", "chainId");
        vx2.m53590f(a, "of(\"request\", \"chainId\")");
        this.f27641a = a;
        C5391d<SessionRequestVO> f = hVar.mo39411f(SessionRequestVO.class, ny5.m49095e(), "request");
        vx2.m53590f(f, "moshi.adapter(SessionReq…a, emptySet(), \"request\")");
        this.f27642b = f;
        C5391d<String> f2 = hVar.mo39411f(String.class, ny5.m49095e(), "chainId");
        vx2.m53590f(f2, "moshi.adapter(String::cl…tySet(),\n      \"chainId\")");
        this.f27643c = f2;
    }

    /* renamed from: k */
    public SignParams.SessionRequestParams mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        SessionRequestVO sessionRequestVO = null;
        String str = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27641a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                sessionRequestVO = this.f27642b.mo39346b(jsonReader);
                if (sessionRequestVO == null) {
                    JsonDataException v = t67.m52121v("request", "request", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"request\", \"request\", reader)");
                    throw v;
                }
            } else if (z == 1 && (str = this.f27643c.mo39346b(jsonReader)) == null) {
                JsonDataException v2 = t67.m52121v("chainId", "chainId", jsonReader);
                vx2.m53590f(v2, "unexpectedNull(\"chainId\"…       \"chainId\", reader)");
                throw v2;
            }
        }
        jsonReader.mo39278d();
        if (sessionRequestVO == null) {
            JsonDataException n = t67.m52113n("request", "request", jsonReader);
            vx2.m53590f(n, "missingProperty(\"request\", \"request\", reader)");
            throw n;
        } else if (str != null) {
            return new SignParams.SessionRequestParams(sessionRequestVO, str);
        } else {
            JsonDataException n2 = t67.m52113n("chainId", "chainId", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"chainId\", \"chainId\", reader)");
            throw n2;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, SignParams.SessionRequestParams sessionRequestParams) {
        vx2.m53591g(q73, "writer");
        if (sessionRequestParams != null) {
            q73.mo39394c();
            q73.mo39399j("request");
            this.f27642b.mo39347j(q73, sessionRequestParams.mo41136b());
            q73.mo39399j("chainId");
            this.f27643c.mo39347j(q73, sessionRequestParams.mo41135a());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SignParams.SessionRequestParams");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
