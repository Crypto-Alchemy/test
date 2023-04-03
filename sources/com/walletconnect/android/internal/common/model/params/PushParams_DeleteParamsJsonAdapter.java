package com.walletconnect.android.internal.common.model.params;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.model.params.PushParams;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/PushParams_DeleteParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/model/params/PushParams$DeleteParams;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "", "b", "Lcom/squareup/moshi/d;", "longAdapter", "c", "stringAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PushParams_DeleteParamsJsonAdapter.kt */
public final class PushParams_DeleteParamsJsonAdapter extends C5391d<PushParams.DeleteParams> {

    /* renamed from: a */
    public final JsonReader.C5372b f27168a;

    /* renamed from: b */
    public final C5391d<Long> f27169b;

    /* renamed from: c */
    public final C5391d<String> f27170c;

    public PushParams_DeleteParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("code", ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53590f(a, "of(\"code\", \"message\")");
        this.f27168a = a;
        C5391d<Long> f = hVar.mo39411f(Long.TYPE, ny5.m49095e(), "code");
        vx2.m53590f(f, "moshi.adapter(Long::clas…java, emptySet(), \"code\")");
        this.f27169b = f;
        C5391d<String> f2 = hVar.mo39411f(String.class, ny5.m49095e(), ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53590f(f2, "moshi.adapter(String::cl…tySet(),\n      \"message\")");
        this.f27170c = f2;
    }

    /* renamed from: k */
    public PushParams.DeleteParams mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        Long l = null;
        String str = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27168a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                l = this.f27169b.mo39346b(jsonReader);
                if (l == null) {
                    JsonDataException v = t67.m52121v("code", "code", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"code\", \"code\",\n            reader)");
                    throw v;
                }
            } else if (z == 1 && (str = this.f27170c.mo39346b(jsonReader)) == null) {
                JsonDataException v2 = t67.m52121v(ThrowableDeserializer.PROP_NAME_MESSAGE, ThrowableDeserializer.PROP_NAME_MESSAGE, jsonReader);
                vx2.m53590f(v2, "unexpectedNull(\"message\"…       \"message\", reader)");
                throw v2;
            }
        }
        jsonReader.mo39278d();
        if (l != null) {
            long longValue = l.longValue();
            if (str != null) {
                return new PushParams.DeleteParams(longValue, str);
            }
            JsonDataException n = t67.m52113n(ThrowableDeserializer.PROP_NAME_MESSAGE, ThrowableDeserializer.PROP_NAME_MESSAGE, jsonReader);
            vx2.m53590f(n, "missingProperty(\"message\", \"message\", reader)");
            throw n;
        }
        JsonDataException n2 = t67.m52113n("code", "code", jsonReader);
        vx2.m53590f(n2, "missingProperty(\"code\", \"code\", reader)");
        throw n2;
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, PushParams.DeleteParams deleteParams) {
        vx2.m53591g(q73, "writer");
        if (deleteParams != null) {
            q73.mo39394c();
            q73.mo39399j("code");
            this.f27169b.mo39347j(q73, Long.valueOf(deleteParams.mo40375a()));
            q73.mo39399j(ThrowableDeserializer.PROP_NAME_MESSAGE);
            this.f27170c.mo39347j(q73, deleteParams.mo40376b());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PushParams.DeleteParams");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
