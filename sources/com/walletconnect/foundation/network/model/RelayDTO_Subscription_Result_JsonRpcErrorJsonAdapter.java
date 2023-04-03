package com.walletconnect.foundation.network.model;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.foundation.network.model.RelayDTO;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO_Subscription_Result_JsonRpcErrorJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscription$Result$JsonRpcError;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "Lcom/walletconnect/foundation/network/model/RelayDTO$Error;", "c", "errorAdapter", "", "d", "longAdapter", "Ljava/lang/reflect/Constructor;", "e", "Ljava/lang/reflect/Constructor;", "constructorRef", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RelayDTO_Subscription_Result_JsonRpcErrorJsonAdapter.kt */
public final class RelayDTO_Subscription_Result_JsonRpcErrorJsonAdapter extends C5391d<RelayDTO$Subscription$Result$JsonRpcError> {

    /* renamed from: a */
    public final JsonReader.C5372b f27491a;

    /* renamed from: b */
    public final C5391d<String> f27492b;

    /* renamed from: c */
    public final C5391d<RelayDTO.Error> f27493c;

    /* renamed from: d */
    public final C5391d<Long> f27494d;

    /* renamed from: e */
    public volatile Constructor<RelayDTO$Subscription$Result$JsonRpcError> f27495e;

    public RelayDTO_Subscription_Result_JsonRpcErrorJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("jsonrpc", "error", "id");
        vx2.m53590f(a, "of(\"jsonrpc\", \"error\", \"id\")");
        this.f27491a = a;
        C5391d<String> f = hVar.mo39411f(String.class, ny5.m49095e(), "jsonrpc");
        vx2.m53590f(f, "moshi.adapter(String::cl…tySet(),\n      \"jsonrpc\")");
        this.f27492b = f;
        C5391d<RelayDTO.Error> f2 = hVar.mo39411f(RelayDTO.Error.class, ny5.m49095e(), "error");
        vx2.m53590f(f2, "moshi.adapter(RelayDTO.E…     emptySet(), \"error\")");
        this.f27493c = f2;
        C5391d<Long> f3 = hVar.mo39411f(Long.TYPE, ny5.m49095e(), "id");
        vx2.m53590f(f3, "moshi.adapter(Long::class.java, emptySet(), \"id\")");
        this.f27494d = f3;
    }

    /* renamed from: k */
    public RelayDTO$Subscription$Result$JsonRpcError mo39346b(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        vx2.m53591g(jsonReader2, "reader");
        jsonReader.mo39276b();
        int i = -1;
        String str = null;
        RelayDTO.Error error = null;
        Long l = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader2.mo39295z(this.f27491a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                str = this.f27492b.mo39346b(jsonReader2);
                if (str != null) {
                    i &= -2;
                } else {
                    JsonDataException v = t67.m52121v("jsonrpc", "jsonrpc", jsonReader2);
                    vx2.m53590f(v, "unexpectedNull(\"jsonrpc\"…       \"jsonrpc\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                error = this.f27493c.mo39346b(jsonReader2);
                if (error == null) {
                    JsonDataException v2 = t67.m52121v("error", "error", jsonReader2);
                    vx2.m53590f(v2, "unexpectedNull(\"error\", …ror\",\n            reader)");
                    throw v2;
                }
            } else if (z == 2 && (l = this.f27494d.mo39346b(jsonReader2)) == null) {
                JsonDataException v3 = t67.m52121v("id", "id", jsonReader2);
                vx2.m53590f(v3, "unexpectedNull(\"id\", \"id\", reader)");
                throw v3;
            }
        }
        jsonReader.mo39278d();
        if (i == -2) {
            vx2.m53589e(str, "null cannot be cast to non-null type kotlin.String");
            if (error == null) {
                JsonDataException n = t67.m52113n("error", "error", jsonReader2);
                vx2.m53590f(n, "missingProperty(\"error\", \"error\", reader)");
                throw n;
            } else if (l != null) {
                return new RelayDTO$Subscription$Result$JsonRpcError(str, error, l.longValue());
            } else {
                JsonDataException n2 = t67.m52113n("id", "id", jsonReader2);
                vx2.m53590f(n2, "missingProperty(\"id\", \"id\", reader)");
                throw n2;
            }
        } else {
            Constructor<RelayDTO$Subscription$Result$JsonRpcError> constructor = this.f27495e;
            if (constructor == null) {
                constructor = RelayDTO$Subscription$Result$JsonRpcError.class.getDeclaredConstructor(new Class[]{String.class, RelayDTO.Error.class, Long.TYPE, Integer.TYPE, t67.f34130c});
                this.f27495e = constructor;
                vx2.m53590f(constructor, "RelayDTO.Subscription.Re…his.constructorRef = it }");
            }
            Object[] objArr = new Object[5];
            objArr[0] = str;
            if (error != null) {
                objArr[1] = error;
                if (l != null) {
                    objArr[2] = Long.valueOf(l.longValue());
                    objArr[3] = Integer.valueOf(i);
                    objArr[4] = null;
                    RelayDTO$Subscription$Result$JsonRpcError newInstance = constructor.newInstance(objArr);
                    vx2.m53590f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                JsonDataException n3 = t67.m52113n("id", "id", jsonReader2);
                vx2.m53590f(n3, "missingProperty(\"id\", \"id\", reader)");
                throw n3;
            }
            JsonDataException n4 = t67.m52113n("error", "error", jsonReader2);
            vx2.m53590f(n4, "missingProperty(\"error\", \"error\", reader)");
            throw n4;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, RelayDTO$Subscription$Result$JsonRpcError relayDTO$Subscription$Result$JsonRpcError) {
        vx2.m53591g(q73, "writer");
        if (relayDTO$Subscription$Result$JsonRpcError != null) {
            q73.mo39394c();
            q73.mo39399j("jsonrpc");
            this.f27492b.mo39347j(q73, relayDTO$Subscription$Result$JsonRpcError.mo40880c());
            q73.mo39399j("error");
            this.f27493c.mo39347j(q73, relayDTO$Subscription$Result$JsonRpcError.mo40878a());
            q73.mo39399j("id");
            this.f27494d.mo39347j(q73, Long.valueOf(relayDTO$Subscription$Result$JsonRpcError.mo40879b()));
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(63);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.Subscription.Result.JsonRpcError");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
