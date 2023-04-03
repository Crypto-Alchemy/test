package com.walletconnect.android.internal.common.model;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/RelayProtocolOptionsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "c", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "d", "Ljava/lang/reflect/Constructor;", "constructorRef", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RelayProtocolOptionsJsonAdapter.kt */
public final class RelayProtocolOptionsJsonAdapter extends C5391d<RelayProtocolOptions> {

    /* renamed from: a */
    public final JsonReader.C5372b f27133a;

    /* renamed from: b */
    public final C5391d<String> f27134b;

    /* renamed from: c */
    public final C5391d<String> f27135c;

    /* renamed from: d */
    public volatile Constructor<RelayProtocolOptions> f27136d;

    public RelayProtocolOptionsJsonAdapter(C5401h hVar) {
        Class<String> cls = String.class;
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("protocol", "data");
        vx2.m53590f(a, "of(\"protocol\", \"data\")");
        this.f27133a = a;
        C5391d<String> f = hVar.mo39411f(cls, ny5.m49095e(), "protocol");
        vx2.m53590f(f, "moshi.adapter(String::cl…ySet(),\n      \"protocol\")");
        this.f27134b = f;
        C5391d<String> f2 = hVar.mo39411f(cls, ny5.m49095e(), "data");
        vx2.m53590f(f2, "moshi.adapter(String::cl…      emptySet(), \"data\")");
        this.f27135c = f2;
    }

    /* renamed from: k */
    public RelayProtocolOptions mo39346b(JsonReader jsonReader) {
        Class<String> cls = String.class;
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        int i = -1;
        String str = null;
        String str2 = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27133a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                str = this.f27134b.mo39346b(jsonReader);
                if (str != null) {
                    i &= -2;
                } else {
                    JsonDataException v = t67.m52121v("protocol", "protocol", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"protocol…      \"protocol\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                str2 = this.f27135c.mo39346b(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo39278d();
        if (i == -4) {
            vx2.m53589e(str, "null cannot be cast to non-null type kotlin.String");
            return new RelayProtocolOptions(str, str2);
        }
        Constructor<RelayProtocolOptions> constructor = this.f27136d;
        if (constructor == null) {
            constructor = RelayProtocolOptions.class.getDeclaredConstructor(new Class[]{cls, cls, Integer.TYPE, t67.f34130c});
            this.f27136d = constructor;
            vx2.m53590f(constructor, "RelayProtocolOptions::cl…his.constructorRef = it }");
        }
        RelayProtocolOptions newInstance = constructor.newInstance(new Object[]{str, str2, Integer.valueOf(i), null});
        vx2.m53590f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, RelayProtocolOptions relayProtocolOptions) {
        vx2.m53591g(q73, "writer");
        if (relayProtocolOptions != null) {
            q73.mo39394c();
            q73.mo39399j("protocol");
            this.f27134b.mo39347j(q73, relayProtocolOptions.mo40328b());
            q73.mo39399j("data");
            this.f27135c.mo39347j(q73, relayProtocolOptions.mo40327a());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayProtocolOptions");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
