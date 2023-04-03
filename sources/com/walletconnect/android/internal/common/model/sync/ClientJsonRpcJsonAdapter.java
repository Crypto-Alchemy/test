package com.walletconnect.android.internal.common.model.sync;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/sync/ClientJsonRpcJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/model/sync/ClientJsonRpc;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "", "b", "Lcom/squareup/moshi/d;", "longAdapter", "c", "stringAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ClientJsonRpcJsonAdapter.kt */
public final class ClientJsonRpcJsonAdapter extends C5391d<ClientJsonRpc> {

    /* renamed from: a */
    public final JsonReader.C5372b f27182a;

    /* renamed from: b */
    public final C5391d<Long> f27183b;

    /* renamed from: c */
    public final C5391d<String> f27184c;

    public ClientJsonRpcJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("id", "jsonrpc", "method");
        vx2.m53590f(a, "of(\"id\", \"jsonrpc\", \"method\")");
        this.f27182a = a;
        C5391d<Long> f = hVar.mo39411f(Long.TYPE, ny5.m49095e(), "id");
        vx2.m53590f(f, "moshi.adapter(Long::class.java, emptySet(), \"id\")");
        this.f27183b = f;
        C5391d<String> f2 = hVar.mo39411f(String.class, ny5.m49095e(), "jsonrpc");
        vx2.m53590f(f2, "moshi.adapter(String::cl…tySet(),\n      \"jsonrpc\")");
        this.f27184c = f2;
    }

    /* renamed from: k */
    public ClientJsonRpc mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        Long l = null;
        String str = null;
        String str2 = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27182a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                l = this.f27183b.mo39346b(jsonReader);
                if (l == null) {
                    JsonDataException v = t67.m52121v("id", "id", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"id\", \"id\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                str = this.f27184c.mo39346b(jsonReader);
                if (str == null) {
                    JsonDataException v2 = t67.m52121v("jsonrpc", "jsonrpc", jsonReader);
                    vx2.m53590f(v2, "unexpectedNull(\"jsonrpc\"…       \"jsonrpc\", reader)");
                    throw v2;
                }
            } else if (z == 2 && (str2 = this.f27184c.mo39346b(jsonReader)) == null) {
                JsonDataException v3 = t67.m52121v("method", "method", jsonReader);
                vx2.m53590f(v3, "unexpectedNull(\"method\",…        \"method\", reader)");
                throw v3;
            }
        }
        jsonReader.mo39278d();
        if (l != null) {
            long longValue = l.longValue();
            if (str == null) {
                JsonDataException n = t67.m52113n("jsonrpc", "jsonrpc", jsonReader);
                vx2.m53590f(n, "missingProperty(\"jsonrpc\", \"jsonrpc\", reader)");
                throw n;
            } else if (str2 != null) {
                return new ClientJsonRpc(longValue, str, str2);
            } else {
                JsonDataException n2 = t67.m52113n("method", "method", jsonReader);
                vx2.m53590f(n2, "missingProperty(\"method\", \"method\", reader)");
                throw n2;
            }
        } else {
            JsonDataException n3 = t67.m52113n("id", "id", jsonReader);
            vx2.m53590f(n3, "missingProperty(\"id\", \"id\", reader)");
            throw n3;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, ClientJsonRpc clientJsonRpc) {
        vx2.m53591g(q73, "writer");
        if (clientJsonRpc != null) {
            q73.mo39394c();
            q73.mo39399j("id");
            this.f27183b.mo39347j(q73, Long.valueOf(clientJsonRpc.mo40413a()));
            q73.mo39399j("jsonrpc");
            this.f27184c.mo39347j(q73, clientJsonRpc.mo40414b());
            q73.mo39399j("method");
            this.f27184c.mo39347j(q73, clientJsonRpc.mo40415c());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ClientJsonRpc");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
