package com.walletconnect.android.internal.common.model.params;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.model.params.PushParams;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u001a"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/PushParams_MessageParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/model/params/PushParams$MessageParams;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "c", "nullableStringAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PushParams_MessageParamsJsonAdapter.kt */
public final class PushParams_MessageParamsJsonAdapter extends C5391d<PushParams.MessageParams> {

    /* renamed from: a */
    public final JsonReader.C5372b f27171a;

    /* renamed from: b */
    public final C5391d<String> f27172b;

    /* renamed from: c */
    public final C5391d<String> f27173c;

    public PushParams_MessageParamsJsonAdapter(C5401h hVar) {
        Class<String> cls = String.class;
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("title", "body", "icon", "url");
        vx2.m53590f(a, "of(\"title\", \"body\", \"icon\", \"url\")");
        this.f27171a = a;
        C5391d<String> f = hVar.mo39411f(cls, ny5.m49095e(), "title");
        vx2.m53590f(f, "moshi.adapter(String::cl…mptySet(),\n      \"title\")");
        this.f27172b = f;
        C5391d<String> f2 = hVar.mo39411f(cls, ny5.m49095e(), "icon");
        vx2.m53590f(f2, "moshi.adapter(String::cl…      emptySet(), \"icon\")");
        this.f27173c = f2;
    }

    /* renamed from: k */
    public PushParams.MessageParams mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27171a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                str = this.f27172b.mo39346b(jsonReader);
                if (str == null) {
                    JsonDataException v = t67.m52121v("title", "title", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"title\", …tle\",\n            reader)");
                    throw v;
                }
            } else if (z == 1) {
                str2 = this.f27172b.mo39346b(jsonReader);
                if (str2 == null) {
                    JsonDataException v2 = t67.m52121v("body", "body", jsonReader);
                    vx2.m53590f(v2, "unexpectedNull(\"body\", \"body\",\n            reader)");
                    throw v2;
                }
            } else if (z == 2) {
                str3 = this.f27173c.mo39346b(jsonReader);
            } else if (z == 3) {
                str4 = this.f27173c.mo39346b(jsonReader);
            }
        }
        jsonReader.mo39278d();
        if (str == null) {
            JsonDataException n = t67.m52113n("title", "title", jsonReader);
            vx2.m53590f(n, "missingProperty(\"title\", \"title\", reader)");
            throw n;
        } else if (str2 != null) {
            return new PushParams.MessageParams(str, str2, str3, str4);
        } else {
            JsonDataException n2 = t67.m52113n("body", "body", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"body\", \"body\", reader)");
            throw n2;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, PushParams.MessageParams messageParams) {
        vx2.m53591g(q73, "writer");
        if (messageParams != null) {
            q73.mo39394c();
            q73.mo39399j("title");
            this.f27172b.mo39347j(q73, messageParams.mo40383c());
            q73.mo39399j("body");
            this.f27172b.mo39347j(q73, messageParams.mo40381a());
            q73.mo39399j("icon");
            this.f27173c.mo39347j(q73, messageParams.mo40382b());
            q73.mo39399j("url");
            this.f27173c.mo39347j(q73, messageParams.mo40385d());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PushParams.MessageParams");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
