package com.walletconnect.android.internal.common.model.params;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.model.AppMetaData;
import com.walletconnect.android.internal.common.model.params.PushParams;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/PushParams_RequestParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/model/params/PushParams$RequestParams;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "c", "appMetaDataAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PushParams_RequestParamsJsonAdapter.kt */
public final class PushParams_RequestParamsJsonAdapter extends C5391d<PushParams.RequestParams> {

    /* renamed from: a */
    public final JsonReader.C5372b f27174a;

    /* renamed from: b */
    public final C5391d<String> f27175b;

    /* renamed from: c */
    public final C5391d<AppMetaData> f27176c;

    public PushParams_RequestParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("publicKey", "metadata", "account");
        vx2.m53590f(a, "of(\"publicKey\", \"metadata\",\n      \"account\")");
        this.f27174a = a;
        C5391d<String> f = hVar.mo39411f(String.class, ny5.m49095e(), "publicKey");
        vx2.m53590f(f, "moshi.adapter(String::cl…Set(),\n      \"publicKey\")");
        this.f27175b = f;
        C5391d<AppMetaData> f2 = hVar.mo39411f(AppMetaData.class, ny5.m49095e(), "metaData");
        vx2.m53590f(f2, "moshi.adapter(AppMetaDat…  emptySet(), \"metaData\")");
        this.f27176c = f2;
    }

    /* renamed from: k */
    public PushParams.RequestParams mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        String str = null;
        AppMetaData appMetaData = null;
        String str2 = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27174a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                str = this.f27175b.mo39346b(jsonReader);
                if (str == null) {
                    JsonDataException v = t67.m52121v("publicKey", "publicKey", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"publicKe…     \"publicKey\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                appMetaData = this.f27176c.mo39346b(jsonReader);
                if (appMetaData == null) {
                    JsonDataException v2 = t67.m52121v("metaData", "metadata", jsonReader);
                    vx2.m53590f(v2, "unexpectedNull(\"metaData…      \"metadata\", reader)");
                    throw v2;
                }
            } else if (z == 2 && (str2 = this.f27175b.mo39346b(jsonReader)) == null) {
                JsonDataException v3 = t67.m52121v("account", "account", jsonReader);
                vx2.m53590f(v3, "unexpectedNull(\"account\"…       \"account\", reader)");
                throw v3;
            }
        }
        jsonReader.mo39278d();
        if (str == null) {
            JsonDataException n = t67.m52113n("publicKey", "publicKey", jsonReader);
            vx2.m53590f(n, "missingProperty(\"publicKey\", \"publicKey\", reader)");
            throw n;
        } else if (appMetaData == null) {
            JsonDataException n2 = t67.m52113n("metaData", "metadata", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"metaData\", \"metadata\", reader)");
            throw n2;
        } else if (str2 != null) {
            return new PushParams.RequestParams(str, appMetaData, str2);
        } else {
            JsonDataException n3 = t67.m52113n("account", "account", jsonReader);
            vx2.m53590f(n3, "missingProperty(\"account\", \"account\", reader)");
            throw n3;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, PushParams.RequestParams requestParams) {
        vx2.m53591g(q73, "writer");
        if (requestParams != null) {
            q73.mo39394c();
            q73.mo39399j("publicKey");
            this.f27175b.mo39347j(q73, requestParams.mo40391c());
            q73.mo39399j("metadata");
            this.f27176c.mo39347j(q73, requestParams.mo40390b());
            q73.mo39399j("account");
            this.f27175b.mo39347j(q73, requestParams.mo40389a());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PushParams.RequestParams");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
