package com.walletconnect.android.internal.common.model.params;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.cacao.Cacao;
import com.walletconnect.android.internal.common.model.params.CoreAuthParams;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/CoreAuthParams_ResponseParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/model/params/CoreAuthParams$ResponseParams;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Header;", "b", "Lcom/squareup/moshi/d;", "headerAdapter", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Payload;", "c", "payloadAdapter", "Lcom/walletconnect/android/internal/common/cacao/Cacao$Signature;", "d", "signatureAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CoreAuthParams_ResponseParamsJsonAdapter.kt */
public final class CoreAuthParams_ResponseParamsJsonAdapter extends C5391d<CoreAuthParams.ResponseParams> {

    /* renamed from: a */
    public final JsonReader.C5372b f27146a;

    /* renamed from: b */
    public final C5391d<Cacao.Header> f27147b;

    /* renamed from: c */
    public final C5391d<Cacao.Payload> f27148c;

    /* renamed from: d */
    public final C5391d<Cacao.Signature> f27149d;

    public CoreAuthParams_ResponseParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("h", "p", "s");
        vx2.m53590f(a, "of(\"h\", \"p\", \"s\")");
        this.f27146a = a;
        C5391d<Cacao.Header> f = hVar.mo39411f(Cacao.Header.class, ny5.m49095e(), "header");
        vx2.m53590f(f, "moshi.adapter(Cacao.Head…    emptySet(), \"header\")");
        this.f27147b = f;
        C5391d<Cacao.Payload> f2 = hVar.mo39411f(Cacao.Payload.class, ny5.m49095e(), "payload");
        vx2.m53590f(f2, "moshi.adapter(Cacao.Payl…   emptySet(), \"payload\")");
        this.f27148c = f2;
        C5391d<Cacao.Signature> f3 = hVar.mo39411f(Cacao.Signature.class, ny5.m49095e(), "signature");
        vx2.m53590f(f3, "moshi.adapter(Cacao.Sign… emptySet(), \"signature\")");
        this.f27149d = f3;
    }

    /* renamed from: k */
    public CoreAuthParams.ResponseParams mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        Cacao.Header header = null;
        Cacao.Payload payload = null;
        Cacao.Signature signature = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27146a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                header = this.f27147b.mo39346b(jsonReader);
                if (header == null) {
                    JsonDataException v = t67.m52121v("header_", "h", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"header_\", \"h\",\n            reader)");
                    throw v;
                }
            } else if (z == 1) {
                payload = this.f27148c.mo39346b(jsonReader);
                if (payload == null) {
                    JsonDataException v2 = t67.m52121v("payload", "p", jsonReader);
                    vx2.m53590f(v2, "unexpectedNull(\"payload\", \"p\",\n            reader)");
                    throw v2;
                }
            } else if (z == 2 && (signature = this.f27149d.mo39346b(jsonReader)) == null) {
                JsonDataException v3 = t67.m52121v("signature", "s", jsonReader);
                vx2.m53590f(v3, "unexpectedNull(\"signatur…\n            \"s\", reader)");
                throw v3;
            }
        }
        jsonReader.mo39278d();
        if (header == null) {
            JsonDataException n = t67.m52113n("header_", "h", jsonReader);
            vx2.m53590f(n, "missingProperty(\"header_\", \"h\", reader)");
            throw n;
        } else if (payload == null) {
            JsonDataException n2 = t67.m52113n("payload", "p", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"payload\", \"p\", reader)");
            throw n2;
        } else if (signature != null) {
            return new CoreAuthParams.ResponseParams(header, payload, signature);
        } else {
            JsonDataException n3 = t67.m52113n("signature", "s", jsonReader);
            vx2.m53590f(n3, "missingProperty(\"signature\", \"s\", reader)");
            throw n3;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, CoreAuthParams.ResponseParams responseParams) {
        vx2.m53591g(q73, "writer");
        if (responseParams != null) {
            q73.mo39394c();
            q73.mo39399j("h");
            this.f27147b.mo39347j(q73, responseParams.mo40349d());
            q73.mo39399j("p");
            this.f27148c.mo39347j(q73, responseParams.mo40350e());
            q73.mo39399j("s");
            this.f27149d.mo39347j(q73, responseParams.mo40352f());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CoreAuthParams.ResponseParams");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
