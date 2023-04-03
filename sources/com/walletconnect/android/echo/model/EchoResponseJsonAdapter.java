package com.walletconnect.android.echo.model;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.echo.model.EchoResponse;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/android/echo/model/EchoResponseJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/echo/model/EchoResponse;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "", "Lcom/walletconnect/android/echo/model/EchoResponse$Error;", "b", "Lcom/squareup/moshi/d;", "listOfErrorAdapter", "Lcom/walletconnect/android/echo/model/EchoResponse$Field;", "c", "listOfFieldAdapter", "d", "stringAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: EchoResponseJsonAdapter.kt */
public final class EchoResponseJsonAdapter extends C5391d<EchoResponse> {

    /* renamed from: a */
    public final JsonReader.C5372b f27032a;

    /* renamed from: b */
    public final C5391d<List<EchoResponse.Error>> f27033b;

    /* renamed from: c */
    public final C5391d<List<EchoResponse.Field>> f27034c;

    /* renamed from: d */
    public final C5391d<String> f27035d;

    public EchoResponseJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("errors", "fields", "status");
        vx2.m53590f(a, "of(\"errors\", \"fields\", \"status\")");
        this.f27032a = a;
        C5391d<List<EchoResponse.Error>> f = hVar.mo39411f(u27.m52594j(List.class, EchoResponse.Error.class), ny5.m49095e(), "errors");
        vx2.m53590f(f, "moshi.adapter(Types.newP…    emptySet(), \"errors\")");
        this.f27033b = f;
        C5391d<List<EchoResponse.Field>> f2 = hVar.mo39411f(u27.m52594j(List.class, EchoResponse.Field.class), ny5.m49095e(), "fields");
        vx2.m53590f(f2, "moshi.adapter(Types.newP…    emptySet(), \"fields\")");
        this.f27034c = f2;
        C5391d<String> f3 = hVar.mo39411f(String.class, ny5.m49095e(), "status");
        vx2.m53590f(f3, "moshi.adapter(String::cl…ptySet(),\n      \"status\")");
        this.f27035d = f3;
    }

    /* renamed from: k */
    public EchoResponse mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        List list = null;
        List list2 = null;
        String str = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27032a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                list = this.f27033b.mo39346b(jsonReader);
                if (list == null) {
                    JsonDataException v = t67.m52121v("errors", "errors", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"errors\",…        \"errors\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                list2 = this.f27034c.mo39346b(jsonReader);
                if (list2 == null) {
                    JsonDataException v2 = t67.m52121v("fields", "fields", jsonReader);
                    vx2.m53590f(v2, "unexpectedNull(\"fields\",…        \"fields\", reader)");
                    throw v2;
                }
            } else if (z == 2 && (str = this.f27035d.mo39346b(jsonReader)) == null) {
                JsonDataException v3 = t67.m52121v("status", "status", jsonReader);
                vx2.m53590f(v3, "unexpectedNull(\"status\",…        \"status\", reader)");
                throw v3;
            }
        }
        jsonReader.mo39278d();
        if (list == null) {
            JsonDataException n = t67.m52113n("errors", "errors", jsonReader);
            vx2.m53590f(n, "missingProperty(\"errors\", \"errors\", reader)");
            throw n;
        } else if (list2 == null) {
            JsonDataException n2 = t67.m52113n("fields", "fields", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"fields\", \"fields\", reader)");
            throw n2;
        } else if (str != null) {
            return new EchoResponse(list, list2, str);
        } else {
            JsonDataException n3 = t67.m52113n("status", "status", jsonReader);
            vx2.m53590f(n3, "missingProperty(\"status\", \"status\", reader)");
            throw n3;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, EchoResponse echoResponse) {
        vx2.m53591g(q73, "writer");
        if (echoResponse != null) {
            q73.mo39394c();
            q73.mo39399j("errors");
            this.f27033b.mo39347j(q73, echoResponse.mo40109a());
            q73.mo39399j("fields");
            this.f27034c.mo39347j(q73, echoResponse.mo40110b());
            q73.mo39399j("status");
            this.f27035d.mo39347j(q73, echoResponse.mo40111c());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EchoResponse");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
