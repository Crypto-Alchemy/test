package com.walletconnect.android.echo.model;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, mo44877d2 = {"Lcom/walletconnect/android/echo/model/EchoBodyJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/echo/model/EchoBody;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "Ljava/lang/reflect/Constructor;", "c", "Ljava/lang/reflect/Constructor;", "constructorRef", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: EchoBodyJsonAdapter.kt */
public final class EchoBodyJsonAdapter extends C5391d<EchoBody> {

    /* renamed from: a */
    public final JsonReader.C5372b f27021a;

    /* renamed from: b */
    public final C5391d<String> f27022b;

    /* renamed from: c */
    public volatile Constructor<EchoBody> f27023c;

    public EchoBodyJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("client_id", "token", "type");
        vx2.m53590f(a, "of(\"client_id\", \"token\", \"type\")");
        this.f27021a = a;
        C5391d<String> f = hVar.mo39411f(String.class, ny5.m49095e(), "clientId");
        vx2.m53590f(f, "moshi.adapter(String::cl…ySet(),\n      \"clientId\")");
        this.f27022b = f;
    }

    /* renamed from: k */
    public EchoBody mo39346b(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        vx2.m53591g(jsonReader2, "reader");
        jsonReader.mo39276b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader2.mo39295z(this.f27021a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                str = this.f27022b.mo39346b(jsonReader2);
                if (str == null) {
                    JsonDataException v = t67.m52121v("clientId", "client_id", jsonReader2);
                    vx2.m53590f(v, "unexpectedNull(\"clientId…     \"client_id\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                str2 = this.f27022b.mo39346b(jsonReader2);
                if (str2 == null) {
                    JsonDataException v2 = t67.m52121v("token", "token", jsonReader2);
                    vx2.m53590f(v2, "unexpectedNull(\"token\", …ken\",\n            reader)");
                    throw v2;
                }
            } else if (z == 2) {
                str3 = this.f27022b.mo39346b(jsonReader2);
                if (str3 != null) {
                    i &= -5;
                } else {
                    JsonDataException v3 = t67.m52121v("type", "type", jsonReader2);
                    vx2.m53590f(v3, "unexpectedNull(\"type\", \"type\", reader)");
                    throw v3;
                }
            } else {
                continue;
            }
        }
        jsonReader.mo39278d();
        if (i != -5) {
            Constructor<EchoBody> constructor = this.f27023c;
            if (constructor == null) {
                constructor = EchoBody.class.getDeclaredConstructor(new Class[]{cls, cls, cls, Integer.TYPE, t67.f34130c});
                this.f27023c = constructor;
                vx2.m53590f(constructor, "EchoBody::class.java.get…his.constructorRef = it }");
            }
            Object[] objArr = new Object[5];
            if (str != null) {
                objArr[0] = str;
                if (str2 != null) {
                    objArr[1] = str2;
                    objArr[2] = str3;
                    objArr[3] = Integer.valueOf(i);
                    objArr[4] = null;
                    EchoBody newInstance = constructor.newInstance(objArr);
                    vx2.m53590f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                JsonDataException n = t67.m52113n("token", "token", jsonReader2);
                vx2.m53590f(n, "missingProperty(\"token\", \"token\", reader)");
                throw n;
            }
            JsonDataException n2 = t67.m52113n("clientId", "client_id", jsonReader2);
            vx2.m53590f(n2, "missingProperty(\"clientId\", \"client_id\", reader)");
            throw n2;
        } else if (str == null) {
            JsonDataException n3 = t67.m52113n("clientId", "client_id", jsonReader2);
            vx2.m53590f(n3, "missingProperty(\"clientId\", \"client_id\", reader)");
            throw n3;
        } else if (str2 != null) {
            vx2.m53589e(str3, "null cannot be cast to non-null type kotlin.String");
            return new EchoBody(str, str2, str3);
        } else {
            JsonDataException n4 = t67.m52113n("token", "token", jsonReader2);
            vx2.m53590f(n4, "missingProperty(\"token\", \"token\", reader)");
            throw n4;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, EchoBody echoBody) {
        vx2.m53591g(q73, "writer");
        if (echoBody != null) {
            q73.mo39394c();
            q73.mo39399j("client_id");
            this.f27022b.mo39347j(q73, echoBody.mo40099a());
            q73.mo39399j("token");
            this.f27022b.mo39347j(q73, echoBody.mo40100b());
            q73.mo39399j("type");
            this.f27022b.mo39347j(q73, echoBody.mo40101c());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EchoBody");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
