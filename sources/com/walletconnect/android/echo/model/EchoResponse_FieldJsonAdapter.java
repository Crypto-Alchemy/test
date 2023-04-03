package com.walletconnect.android.echo.model;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.echo.model.EchoResponse;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, mo44877d2 = {"Lcom/walletconnect/android/echo/model/EchoResponse_FieldJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/echo/model/EchoResponse$Field;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: EchoResponse_FieldJsonAdapter.kt */
public final class EchoResponse_FieldJsonAdapter extends C5391d<EchoResponse.Field> {

    /* renamed from: a */
    public final JsonReader.C5372b f27038a;

    /* renamed from: b */
    public final C5391d<String> f27039b;

    public EchoResponse_FieldJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("description", "field", "location");
        vx2.m53590f(a, "of(\"description\", \"field\",\n      \"location\")");
        this.f27038a = a;
        C5391d<String> f = hVar.mo39411f(String.class, ny5.m49095e(), "description");
        vx2.m53590f(f, "moshi.adapter(String::cl…t(),\n      \"description\")");
        this.f27039b = f;
    }

    /* renamed from: k */
    public EchoResponse.Field mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27038a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                str = this.f27039b.mo39346b(jsonReader);
                if (str == null) {
                    JsonDataException v = t67.m52121v("description", "description", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"descript…\", \"description\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                str2 = this.f27039b.mo39346b(jsonReader);
                if (str2 == null) {
                    JsonDataException v2 = t67.m52121v("field_", "field", jsonReader);
                    vx2.m53590f(v2, "unexpectedNull(\"field_\",…eld\",\n            reader)");
                    throw v2;
                }
            } else if (z == 2 && (str3 = this.f27039b.mo39346b(jsonReader)) == null) {
                JsonDataException v3 = t67.m52121v("location", "location", jsonReader);
                vx2.m53590f(v3, "unexpectedNull(\"location…      \"location\", reader)");
                throw v3;
            }
        }
        jsonReader.mo39278d();
        if (str == null) {
            JsonDataException n = t67.m52113n("description", "description", jsonReader);
            vx2.m53590f(n, "missingProperty(\"descrip…ion\",\n            reader)");
            throw n;
        } else if (str2 == null) {
            JsonDataException n2 = t67.m52113n("field_", "field", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"field_\", \"field\", reader)");
            throw n2;
        } else if (str3 != null) {
            return new EchoResponse.Field(str, str2, str3);
        } else {
            JsonDataException n3 = t67.m52113n("location", "location", jsonReader);
            vx2.m53590f(n3, "missingProperty(\"location\", \"location\", reader)");
            throw n3;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, EchoResponse.Field field) {
        vx2.m53591g(q73, "writer");
        if (field != null) {
            q73.mo39394c();
            q73.mo39399j("description");
            this.f27039b.mo39347j(q73, field.mo40122a());
            q73.mo39399j("field");
            this.f27039b.mo39347j(q73, field.mo40123b());
            q73.mo39399j("location");
            this.f27039b.mo39347j(q73, field.mo40124c());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EchoResponse.Field");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
