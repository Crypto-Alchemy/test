package com.walletconnect.android.internal.common.model.params;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.model.params.PushParams;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/PushParams_RequestResponseParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/model/params/PushParams$RequestResponseParams;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PushParams_RequestResponseParamsJsonAdapter.kt */
public final class PushParams_RequestResponseParamsJsonAdapter extends C5391d<PushParams.RequestResponseParams> {

    /* renamed from: a */
    public final JsonReader.C5372b f27177a;

    /* renamed from: b */
    public final C5391d<String> f27178b;

    public PushParams_RequestResponseParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("publicKey");
        vx2.m53590f(a, "of(\"publicKey\")");
        this.f27177a = a;
        C5391d<String> f = hVar.mo39411f(String.class, ny5.m49095e(), "publicKey");
        vx2.m53590f(f, "moshi.adapter(String::cl…Set(),\n      \"publicKey\")");
        this.f27178b = f;
    }

    /* renamed from: k */
    public PushParams.RequestResponseParams mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        String str = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27177a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0 && (str = this.f27178b.mo39346b(jsonReader)) == null) {
                JsonDataException v = t67.m52121v("publicKey", "publicKey", jsonReader);
                vx2.m53590f(v, "unexpectedNull(\"publicKe…     \"publicKey\", reader)");
                throw v;
            }
        }
        jsonReader.mo39278d();
        if (str != null) {
            return new PushParams.RequestResponseParams(str);
        }
        JsonDataException n = t67.m52113n("publicKey", "publicKey", jsonReader);
        vx2.m53590f(n, "missingProperty(\"publicKey\", \"publicKey\", reader)");
        throw n;
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, PushParams.RequestResponseParams requestResponseParams) {
        vx2.m53591g(q73, "writer");
        if (requestResponseParams != null) {
            q73.mo39394c();
            q73.mo39399j("publicKey");
            this.f27178b.mo39347j(q73, requestResponseParams.mo40396a());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(54);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PushParams.RequestResponseParams");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
