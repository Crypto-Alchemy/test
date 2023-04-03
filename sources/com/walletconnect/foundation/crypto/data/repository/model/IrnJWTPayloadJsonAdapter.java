package com.walletconnect.foundation.crypto.data.repository.model;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/foundation/crypto/data/repository/model/IrnJWTPayloadJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/foundation/crypto/data/repository/model/IrnJWTPayload;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "", "c", "longAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: IrnJWTPayloadJsonAdapter.kt */
public final class IrnJWTPayloadJsonAdapter extends C5391d<IrnJWTPayload> {

    /* renamed from: a */
    public final JsonReader.C5372b f27359a;

    /* renamed from: b */
    public final C5391d<String> f27360b;

    /* renamed from: c */
    public final C5391d<Long> f27361c;

    public IrnJWTPayloadJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("iss", "sub", "aud", "iat", "exp");
        vx2.m53590f(a, "of(\"iss\", \"sub\", \"aud\", \"iat\", \"exp\")");
        this.f27359a = a;
        C5391d<String> f = hVar.mo39411f(String.class, ny5.m49095e(), "issuer");
        vx2.m53590f(f, "moshi.adapter(String::cl…ptySet(),\n      \"issuer\")");
        this.f27360b = f;
        C5391d<Long> f2 = hVar.mo39411f(Long.TYPE, ny5.m49095e(), "issuedAt");
        vx2.m53590f(f2, "moshi.adapter(Long::clas…ySet(),\n      \"issuedAt\")");
        this.f27361c = f2;
    }

    /* renamed from: k */
    public IrnJWTPayload mo39346b(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        vx2.m53591g(jsonReader2, "reader");
        jsonReader.mo39276b();
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            Long l3 = l2;
            Long l4 = l;
            if (jsonReader.mo39280f()) {
                int z = jsonReader2.mo39295z(this.f27359a);
                String str4 = str3;
                if (z == -1) {
                    jsonReader.mo39272I();
                    jsonReader.mo39273J();
                } else if (z == 0) {
                    str = this.f27360b.mo39346b(jsonReader2);
                    if (str == null) {
                        JsonDataException v = t67.m52121v("issuer", "iss", jsonReader2);
                        vx2.m53590f(v, "unexpectedNull(\"issuer\",…iss\",\n            reader)");
                        throw v;
                    }
                } else if (z == 1) {
                    str2 = this.f27360b.mo39346b(jsonReader2);
                    if (str2 == null) {
                        JsonDataException v2 = t67.m52121v("subject", "sub", jsonReader2);
                        vx2.m53590f(v2, "unexpectedNull(\"subject\"…sub\",\n            reader)");
                        throw v2;
                    }
                } else if (z == 2) {
                    str3 = this.f27360b.mo39346b(jsonReader2);
                    if (str3 != null) {
                        l2 = l3;
                        l = l4;
                    } else {
                        JsonDataException v3 = t67.m52121v("audience", "aud", jsonReader2);
                        vx2.m53590f(v3, "unexpectedNull(\"audience…           \"aud\", reader)");
                        throw v3;
                    }
                } else if (z == 3) {
                    l = this.f27361c.mo39346b(jsonReader2);
                    if (l != null) {
                        l2 = l3;
                        str3 = str4;
                    } else {
                        JsonDataException v4 = t67.m52121v("issuedAt", "iat", jsonReader2);
                        vx2.m53590f(v4, "unexpectedNull(\"issuedAt…iat\",\n            reader)");
                        throw v4;
                    }
                } else if (z == 4) {
                    l2 = this.f27361c.mo39346b(jsonReader2);
                    if (l2 == null) {
                        JsonDataException v5 = t67.m52121v("expiration", "exp", jsonReader2);
                        vx2.m53590f(v5, "unexpectedNull(\"expirati…           \"exp\", reader)");
                        throw v5;
                    }
                    l = l4;
                    str3 = str4;
                }
                l2 = l3;
                l = l4;
                str3 = str4;
            } else {
                String str5 = str3;
                jsonReader.mo39278d();
                if (str == null) {
                    JsonDataException n = t67.m52113n("issuer", "iss", jsonReader2);
                    vx2.m53590f(n, "missingProperty(\"issuer\", \"iss\", reader)");
                    throw n;
                } else if (str2 == null) {
                    JsonDataException n2 = t67.m52113n("subject", "sub", jsonReader2);
                    vx2.m53590f(n2, "missingProperty(\"subject\", \"sub\", reader)");
                    throw n2;
                } else if (str5 == null) {
                    JsonDataException n3 = t67.m52113n("audience", "aud", jsonReader2);
                    vx2.m53590f(n3, "missingProperty(\"audience\", \"aud\", reader)");
                    throw n3;
                } else if (l4 != null) {
                    long longValue = l4.longValue();
                    if (l3 != null) {
                        return new IrnJWTPayload(str, str2, str5, longValue, l3.longValue());
                    }
                    JsonDataException n4 = t67.m52113n("expiration", "exp", jsonReader2);
                    vx2.m53590f(n4, "missingProperty(\"expiration\", \"exp\", reader)");
                    throw n4;
                } else {
                    JsonDataException n5 = t67.m52113n("issuedAt", "iat", jsonReader2);
                    vx2.m53590f(n5, "missingProperty(\"issuedAt\", \"iat\", reader)");
                    throw n5;
                }
            }
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, IrnJWTPayload irnJWTPayload) {
        vx2.m53591g(q73, "writer");
        if (irnJWTPayload != null) {
            q73.mo39394c();
            q73.mo39399j("iss");
            this.f27360b.mo39347j(q73, irnJWTPayload.mo40718d());
            q73.mo39399j("sub");
            this.f27360b.mo39347j(q73, irnJWTPayload.mo40719e());
            q73.mo39399j("aud");
            this.f27360b.mo39347j(q73, irnJWTPayload.mo40714a());
            q73.mo39399j("iat");
            this.f27361c.mo39347j(q73, Long.valueOf(irnJWTPayload.mo40716c()));
            q73.mo39399j("exp");
            this.f27361c.mo39347j(q73, Long.valueOf(irnJWTPayload.mo40715b()));
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("IrnJWTPayload");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
