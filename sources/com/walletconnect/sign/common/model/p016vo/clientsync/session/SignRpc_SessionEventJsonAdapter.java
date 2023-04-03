package com.walletconnect.sign.common.model.p016vo.clientsync.session;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.SignRpc;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams;
import java.lang.reflect.Constructor;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc_SessionEventJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionEvent;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "", "b", "Lcom/squareup/moshi/d;", "longAdapter", "c", "stringAdapter", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$EventParams;", "d", "eventParamsAdapter", "Ljava/lang/reflect/Constructor;", "e", "Ljava/lang/reflect/Constructor;", "constructorRef", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.SignRpc_SessionEventJsonAdapter */
/* compiled from: SignRpc_SessionEventJsonAdapter.kt */
public final class SignRpc_SessionEventJsonAdapter extends C5391d<SignRpc.SessionEvent> {

    /* renamed from: a */
    public final JsonReader.C5372b f27583a;

    /* renamed from: b */
    public final C5391d<Long> f27584b;

    /* renamed from: c */
    public final C5391d<String> f27585c;

    /* renamed from: d */
    public final C5391d<SignParams.EventParams> f27586d;

    /* renamed from: e */
    public volatile Constructor<SignRpc.SessionEvent> f27587e;

    public SignRpc_SessionEventJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("id", "jsonrpc", "method", "params");
        vx2.m53590f(a, "of(\"id\", \"jsonrpc\", \"method\",\n      \"params\")");
        this.f27583a = a;
        C5391d<Long> f = hVar.mo39411f(Long.TYPE, ny5.m49095e(), "id");
        vx2.m53590f(f, "moshi.adapter(Long::class.java, emptySet(), \"id\")");
        this.f27584b = f;
        C5391d<String> f2 = hVar.mo39411f(String.class, ny5.m49095e(), "jsonrpc");
        vx2.m53590f(f2, "moshi.adapter(String::cl…tySet(),\n      \"jsonrpc\")");
        this.f27585c = f2;
        C5391d<SignParams.EventParams> f3 = hVar.mo39411f(SignParams.EventParams.class, ny5.m49095e(), "params");
        vx2.m53590f(f3, "moshi.adapter(SignParams…va, emptySet(), \"params\")");
        this.f27586d = f3;
    }

    /* renamed from: k */
    public SignRpc.SessionEvent mo39346b(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        vx2.m53591g(jsonReader2, "reader");
        jsonReader.mo39276b();
        int i = -1;
        Long l = null;
        String str = null;
        String str2 = null;
        SignParams.EventParams eventParams = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader2.mo39295z(this.f27583a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                l = this.f27584b.mo39346b(jsonReader2);
                if (l == null) {
                    JsonDataException v = t67.m52121v("id", "id", jsonReader2);
                    vx2.m53590f(v, "unexpectedNull(\"id\", \"id\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                str = this.f27585c.mo39346b(jsonReader2);
                if (str != null) {
                    i &= -3;
                } else {
                    JsonDataException v2 = t67.m52121v("jsonrpc", "jsonrpc", jsonReader2);
                    vx2.m53590f(v2, "unexpectedNull(\"jsonrpc\"…       \"jsonrpc\", reader)");
                    throw v2;
                }
            } else if (z == 2) {
                str2 = this.f27585c.mo39346b(jsonReader2);
                if (str2 != null) {
                    i &= -5;
                } else {
                    JsonDataException v3 = t67.m52121v("method", "method", jsonReader2);
                    vx2.m53590f(v3, "unexpectedNull(\"method\",…d\",\n              reader)");
                    throw v3;
                }
            } else if (z == 3 && (eventParams = this.f27586d.mo39346b(jsonReader2)) == null) {
                JsonDataException v4 = t67.m52121v("params", "params", jsonReader2);
                vx2.m53590f(v4, "unexpectedNull(\"params\",…        \"params\", reader)");
                throw v4;
            }
        }
        jsonReader.mo39278d();
        if (i != -7) {
            Constructor<SignRpc.SessionEvent> constructor = this.f27587e;
            if (constructor == null) {
                constructor = SignRpc.SessionEvent.class.getDeclaredConstructor(new Class[]{Long.TYPE, cls, cls, SignParams.EventParams.class, Integer.TYPE, t67.f34130c});
                this.f27587e = constructor;
                vx2.m53590f(constructor, "SignRpc.SessionEvent::cl…his.constructorRef = it }");
            }
            Object[] objArr = new Object[6];
            if (l != null) {
                objArr[0] = Long.valueOf(l.longValue());
                objArr[1] = str;
                objArr[2] = str2;
                if (eventParams != null) {
                    objArr[3] = eventParams;
                    objArr[4] = Integer.valueOf(i);
                    objArr[5] = null;
                    SignRpc.SessionEvent newInstance = constructor.newInstance(objArr);
                    vx2.m53590f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                    return newInstance;
                }
                JsonDataException n = t67.m52113n("params", "params", jsonReader2);
                vx2.m53590f(n, "missingProperty(\"params\", \"params\", reader)");
                throw n;
            }
            JsonDataException n2 = t67.m52113n("id", "id", jsonReader2);
            vx2.m53590f(n2, "missingProperty(\"id\", \"id\", reader)");
            throw n2;
        } else if (l != null) {
            long longValue = l.longValue();
            vx2.m53589e(str, "null cannot be cast to non-null type kotlin.String");
            vx2.m53589e(str2, "null cannot be cast to non-null type kotlin.String");
            if (eventParams != null) {
                return new SignRpc.SessionEvent(longValue, str, str2, eventParams);
            }
            JsonDataException n3 = t67.m52113n("params", "params", jsonReader2);
            vx2.m53590f(n3, "missingProperty(\"params\", \"params\", reader)");
            throw n3;
        } else {
            JsonDataException n4 = t67.m52113n("id", "id", jsonReader2);
            vx2.m53590f(n4, "missingProperty(\"id\", \"id\", reader)");
            throw n4;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, SignRpc.SessionEvent sessionEvent) {
        vx2.m53591g(q73, "writer");
        if (sessionEvent != null) {
            q73.mo39394c();
            q73.mo39399j("id");
            this.f27584b.mo39347j(q73, Long.valueOf(sessionEvent.getId()));
            q73.mo39399j("jsonrpc");
            this.f27585c.mo39347j(q73, sessionEvent.mo41049a());
            q73.mo39399j("method");
            this.f27585c.mo39347j(q73, sessionEvent.getMethod());
            q73.mo39399j("params");
            this.f27586d.mo39347j(q73, sessionEvent.getParams());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SignRpc.SessionEvent");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
