package com.walletconnect.android.internal.common;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.JsonRpcResponse;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/JsonRpcResponse_JsonRpcErrorJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$JsonRpcError;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "", "b", "Lcom/squareup/moshi/d;", "longAdapter", "c", "stringAdapter", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$a;", "d", "errorAdapter", "Ljava/lang/reflect/Constructor;", "e", "Ljava/lang/reflect/Constructor;", "constructorRef", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: JsonRpcResponse_JsonRpcErrorJsonAdapter.kt */
public final class JsonRpcResponse_JsonRpcErrorJsonAdapter extends C5391d<JsonRpcResponse.JsonRpcError> {

    /* renamed from: a */
    public final JsonReader.C5372b f27061a;

    /* renamed from: b */
    public final C5391d<Long> f27062b;

    /* renamed from: c */
    public final C5391d<String> f27063c;

    /* renamed from: d */
    public final C5391d<JsonRpcResponse.C5514a> f27064d;

    /* renamed from: e */
    public volatile Constructor<JsonRpcResponse.JsonRpcError> f27065e;

    public JsonRpcResponse_JsonRpcErrorJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("id", "jsonrpc", "error");
        vx2.m53590f(a, "of(\"id\", \"jsonrpc\", \"error\")");
        this.f27061a = a;
        C5391d<Long> f = hVar.mo39411f(Long.TYPE, ny5.m49095e(), "id");
        vx2.m53590f(f, "moshi.adapter(Long::class.java, emptySet(), \"id\")");
        this.f27062b = f;
        C5391d<String> f2 = hVar.mo39411f(String.class, ny5.m49095e(), "jsonrpc");
        vx2.m53590f(f2, "moshi.adapter(String::cl…tySet(),\n      \"jsonrpc\")");
        this.f27063c = f2;
        C5391d<JsonRpcResponse.C5514a> f3 = hVar.mo39411f(JsonRpcResponse.C5514a.class, ny5.m49095e(), "error");
        vx2.m53590f(f3, "moshi.adapter(JsonRpcRes…ava, emptySet(), \"error\")");
        this.f27064d = f3;
    }

    /* renamed from: k */
    public JsonRpcResponse.JsonRpcError mo39346b(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        vx2.m53591g(jsonReader2, "reader");
        jsonReader.mo39276b();
        int i = -1;
        Long l = null;
        JsonRpcResponse.C5514a aVar = null;
        String str = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader2.mo39295z(this.f27061a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                l = this.f27062b.mo39346b(jsonReader2);
                if (l == null) {
                    JsonDataException v = t67.m52121v("id", "id", jsonReader2);
                    vx2.m53590f(v, "unexpectedNull(\"id\", \"id\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                str = this.f27063c.mo39346b(jsonReader2);
                if (str != null) {
                    i &= -3;
                } else {
                    JsonDataException v2 = t67.m52121v("jsonrpc", "jsonrpc", jsonReader2);
                    vx2.m53590f(v2, "unexpectedNull(\"jsonrpc\"…       \"jsonrpc\", reader)");
                    throw v2;
                }
            } else if (z == 2 && (aVar = this.f27064d.mo39346b(jsonReader2)) == null) {
                JsonDataException v3 = t67.m52121v("error", "error", jsonReader2);
                vx2.m53590f(v3, "unexpectedNull(\"error\", …ror\",\n            reader)");
                throw v3;
            }
        }
        jsonReader.mo39278d();
        if (i != -3) {
            Constructor<JsonRpcResponse.JsonRpcError> constructor = this.f27065e;
            if (constructor == null) {
                constructor = JsonRpcResponse.JsonRpcError.class.getDeclaredConstructor(new Class[]{Long.TYPE, String.class, JsonRpcResponse.C5514a.class, Integer.TYPE, t67.f34130c});
                this.f27065e = constructor;
                vx2.m53590f(constructor, "JsonRpcResponse.JsonRpcE…his.constructorRef = it }");
            }
            Object[] objArr = new Object[5];
            if (l != null) {
                objArr[0] = Long.valueOf(l.longValue());
                objArr[1] = str;
                if (aVar != null) {
                    objArr[2] = aVar;
                    objArr[3] = Integer.valueOf(i);
                    objArr[4] = null;
                    JsonRpcResponse.JsonRpcError newInstance = constructor.newInstance(objArr);
                    vx2.m53590f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                JsonDataException n = t67.m52113n("error", "error", jsonReader2);
                vx2.m53590f(n, "missingProperty(\"error\", \"error\", reader)");
                throw n;
            }
            JsonDataException n2 = t67.m52113n("id", "id", jsonReader2);
            vx2.m53590f(n2, "missingProperty(\"id\", \"id\", reader)");
            throw n2;
        } else if (l != null) {
            long longValue = l.longValue();
            vx2.m53589e(str, "null cannot be cast to non-null type kotlin.String");
            if (aVar != null) {
                return new JsonRpcResponse.JsonRpcError(longValue, str, aVar);
            }
            JsonDataException n3 = t67.m52113n("error", "error", jsonReader2);
            vx2.m53590f(n3, "missingProperty(\"error\", \"error\", reader)");
            throw n3;
        } else {
            JsonDataException n4 = t67.m52113n("id", "id", jsonReader2);
            vx2.m53590f(n4, "missingProperty(\"id\", \"id\", reader)");
            throw n4;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, JsonRpcResponse.JsonRpcError jsonRpcError) {
        vx2.m53591g(q73, "writer");
        if (jsonRpcError != null) {
            q73.mo39394c();
            q73.mo39399j("id");
            this.f27062b.mo39347j(q73, Long.valueOf(jsonRpcError.getId()));
            q73.mo39399j("jsonrpc");
            this.f27063c.mo39347j(q73, jsonRpcError.mo40162c());
            q73.mo39399j("error");
            this.f27064d.mo39347j(q73, jsonRpcError.mo40160a());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(50);
        sb.append("GeneratedJsonAdapter(");
        sb.append("JsonRpcResponse.JsonRpcError");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
