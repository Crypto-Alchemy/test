package com.walletconnect.sign.engine.model;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.sign.engine.model.EngineDO;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/model/EngineDO_JsonRpcResponse_JsonRpcResultJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse$JsonRpcResult;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "", "b", "Lcom/squareup/moshi/d;", "longAdapter", "c", "stringAdapter", "Ljava/lang/reflect/Constructor;", "d", "Ljava/lang/reflect/Constructor;", "constructorRef", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: EngineDO_JsonRpcResponse_JsonRpcResultJsonAdapter.kt */
public final class EngineDO_JsonRpcResponse_JsonRpcResultJsonAdapter extends C5391d<EngineDO.JsonRpcResponse.JsonRpcResult> {

    /* renamed from: a */
    public final JsonReader.C5372b f27765a;

    /* renamed from: b */
    public final C5391d<Long> f27766b;

    /* renamed from: c */
    public final C5391d<String> f27767c;

    /* renamed from: d */
    public volatile Constructor<EngineDO.JsonRpcResponse.JsonRpcResult> f27768d;

    public EngineDO_JsonRpcResponse_JsonRpcResultJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("id", "jsonrpc", "result");
        vx2.m53590f(a, "of(\"id\", \"jsonrpc\", \"result\")");
        this.f27765a = a;
        C5391d<Long> f = hVar.mo39411f(Long.TYPE, ny5.m49095e(), "id");
        vx2.m53590f(f, "moshi.adapter(Long::class.java, emptySet(), \"id\")");
        this.f27766b = f;
        C5391d<String> f2 = hVar.mo39411f(String.class, ny5.m49095e(), "jsonrpc");
        vx2.m53590f(f2, "moshi.adapter(String::cl…tySet(),\n      \"jsonrpc\")");
        this.f27767c = f2;
    }

    /* renamed from: k */
    public EngineDO.JsonRpcResponse.JsonRpcResult mo39346b(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        vx2.m53591g(jsonReader2, "reader");
        jsonReader.mo39276b();
        int i = -1;
        Long l = null;
        String str = null;
        String str2 = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader2.mo39295z(this.f27765a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                l = this.f27766b.mo39346b(jsonReader2);
                if (l == null) {
                    JsonDataException v = t67.m52121v("id", "id", jsonReader2);
                    vx2.m53590f(v, "unexpectedNull(\"id\", \"id\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                str2 = this.f27767c.mo39346b(jsonReader2);
                if (str2 != null) {
                    i &= -3;
                } else {
                    JsonDataException v2 = t67.m52121v("jsonrpc", "jsonrpc", jsonReader2);
                    vx2.m53590f(v2, "unexpectedNull(\"jsonrpc\"…       \"jsonrpc\", reader)");
                    throw v2;
                }
            } else if (z == 2 && (str = this.f27767c.mo39346b(jsonReader2)) == null) {
                JsonDataException v3 = t67.m52121v("result", "result", jsonReader2);
                vx2.m53590f(v3, "unexpectedNull(\"result\",…        \"result\", reader)");
                throw v3;
            }
        }
        jsonReader.mo39278d();
        if (i != -3) {
            Constructor<EngineDO.JsonRpcResponse.JsonRpcResult> constructor = this.f27768d;
            if (constructor == null) {
                constructor = EngineDO.JsonRpcResponse.JsonRpcResult.class.getDeclaredConstructor(new Class[]{Long.TYPE, cls, cls, Integer.TYPE, t67.f34130c});
                this.f27768d = constructor;
                vx2.m53590f(constructor, "EngineDO.JsonRpcResponse…his.constructorRef = it }");
            }
            Object[] objArr = new Object[5];
            if (l != null) {
                objArr[0] = Long.valueOf(l.longValue());
                objArr[1] = str2;
                if (str != null) {
                    objArr[2] = str;
                    objArr[3] = Integer.valueOf(i);
                    objArr[4] = null;
                    EngineDO.JsonRpcResponse.JsonRpcResult newInstance = constructor.newInstance(objArr);
                    vx2.m53590f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                JsonDataException n = t67.m52113n("result", "result", jsonReader2);
                vx2.m53590f(n, "missingProperty(\"result\", \"result\", reader)");
                throw n;
            }
            JsonDataException n2 = t67.m52113n("id", "id", jsonReader2);
            vx2.m53590f(n2, "missingProperty(\"id\", \"id\", reader)");
            throw n2;
        } else if (l != null) {
            long longValue = l.longValue();
            vx2.m53589e(str2, "null cannot be cast to non-null type kotlin.String");
            if (str != null) {
                return new EngineDO.JsonRpcResponse.JsonRpcResult(longValue, str2, str);
            }
            JsonDataException n3 = t67.m52113n("result", "result", jsonReader2);
            vx2.m53590f(n3, "missingProperty(\"result\", \"result\", reader)");
            throw n3;
        } else {
            JsonDataException n4 = t67.m52113n("id", "id", jsonReader2);
            vx2.m53590f(n4, "missingProperty(\"id\", \"id\", reader)");
            throw n4;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, EngineDO.JsonRpcResponse.JsonRpcResult jsonRpcResult) {
        vx2.m53591g(q73, "writer");
        if (jsonRpcResult != null) {
            q73.mo39394c();
            q73.mo39399j("id");
            this.f27766b.mo39347j(q73, Long.valueOf(jsonRpcResult.mo41260a()));
            q73.mo39399j("jsonrpc");
            this.f27767c.mo39347j(q73, jsonRpcResult.mo41261b());
            q73.mo39399j("result");
            this.f27767c.mo39347j(q73, jsonRpcResult.mo41262c());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EngineDO.JsonRpcResponse.JsonRpcResult");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
