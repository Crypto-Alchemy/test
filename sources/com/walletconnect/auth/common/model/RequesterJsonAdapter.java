package com.walletconnect.auth.common.model;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.model.AppMetaData;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/auth/common/model/RequesterJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/auth/common/model/Requester;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "c", "appMetaDataAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RequesterJsonAdapter.kt */
public final class RequesterJsonAdapter extends C5391d<Requester> {

    /* renamed from: a */
    public final JsonReader.C5372b f27321a;

    /* renamed from: b */
    public final C5391d<String> f27322b;

    /* renamed from: c */
    public final C5391d<AppMetaData> f27323c;

    public RequesterJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("publicKey", "metadata");
        vx2.m53590f(a, "of(\"publicKey\", \"metadata\")");
        this.f27321a = a;
        C5391d<String> f = hVar.mo39411f(String.class, ny5.m49095e(), "publicKey");
        vx2.m53590f(f, "moshi.adapter(String::cl…Set(),\n      \"publicKey\")");
        this.f27322b = f;
        C5391d<AppMetaData> f2 = hVar.mo39411f(AppMetaData.class, ny5.m49095e(), "metadata");
        vx2.m53590f(f2, "moshi.adapter(AppMetaDat…  emptySet(), \"metadata\")");
        this.f27323c = f2;
    }

    /* renamed from: k */
    public Requester mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        String str = null;
        AppMetaData appMetaData = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27321a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                str = this.f27322b.mo39346b(jsonReader);
                if (str == null) {
                    JsonDataException v = t67.m52121v("publicKey", "publicKey", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"publicKe…     \"publicKey\", reader)");
                    throw v;
                }
            } else if (z == 1 && (appMetaData = this.f27323c.mo39346b(jsonReader)) == null) {
                JsonDataException v2 = t67.m52121v("metadata", "metadata", jsonReader);
                vx2.m53590f(v2, "unexpectedNull(\"metadata…      \"metadata\", reader)");
                throw v2;
            }
        }
        jsonReader.mo39278d();
        if (str == null) {
            JsonDataException n = t67.m52113n("publicKey", "publicKey", jsonReader);
            vx2.m53590f(n, "missingProperty(\"publicKey\", \"publicKey\", reader)");
            throw n;
        } else if (appMetaData != null) {
            return new Requester(str, appMetaData);
        } else {
            JsonDataException n2 = t67.m52113n("metadata", "metadata", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"metadata\", \"metadata\", reader)");
            throw n2;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, Requester requester) {
        vx2.m53591g(q73, "writer");
        if (requester != null) {
            q73.mo39394c();
            q73.mo39399j("publicKey");
            this.f27322b.mo39347j(q73, requester.mo40657b());
            q73.mo39399j("metadata");
            this.f27323c.mo39347j(q73, requester.mo40656a());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Requester");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
