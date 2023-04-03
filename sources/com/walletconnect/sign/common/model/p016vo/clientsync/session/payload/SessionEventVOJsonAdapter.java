package com.walletconnect.sign.common.model.p016vo.clientsync.session.payload;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionEventVOJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionEventVO;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "b", "Lcom/squareup/moshi/d;", "stringAdapter", "", "c", "anyAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.payload.SessionEventVOJsonAdapter */
/* compiled from: SessionEventVOJsonAdapter.kt */
public final class SessionEventVOJsonAdapter extends C5391d<SessionEventVO> {

    /* renamed from: a */
    public final JsonReader.C5372b f27651a;

    /* renamed from: b */
    public final C5391d<String> f27652b;

    /* renamed from: c */
    public final C5391d<Object> f27653c;

    public SessionEventVOJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a(PublicResolver.FUNC_NAME, "data");
        vx2.m53590f(a, "of(\"name\", \"data\")");
        this.f27651a = a;
        C5391d<String> f = hVar.mo39411f(String.class, ny5.m49095e(), PublicResolver.FUNC_NAME);
        vx2.m53590f(f, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.f27652b = f;
        C5391d<Object> f2 = hVar.mo39411f(Object.class, ny5.m49095e(), "data");
        vx2.m53590f(f2, "moshi.adapter(Any::class.java, emptySet(), \"data\")");
        this.f27653c = f2;
    }

    /* renamed from: k */
    public SessionEventVO mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        String str = null;
        Object obj = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27651a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                str = this.f27652b.mo39346b(jsonReader);
                if (str == null) {
                    JsonDataException v = t67.m52121v(PublicResolver.FUNC_NAME, PublicResolver.FUNC_NAME, jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"name\", \"name\",\n            reader)");
                    throw v;
                }
            } else if (z == 1 && (obj = this.f27653c.mo39346b(jsonReader)) == null) {
                JsonDataException v2 = t67.m52121v("data_", "data", jsonReader);
                vx2.m53590f(v2, "unexpectedNull(\"data_\", …ata\",\n            reader)");
                throw v2;
            }
        }
        jsonReader.mo39278d();
        if (str == null) {
            JsonDataException n = t67.m52113n(PublicResolver.FUNC_NAME, PublicResolver.FUNC_NAME, jsonReader);
            vx2.m53590f(n, "missingProperty(\"name\", \"name\", reader)");
            throw n;
        } else if (obj != null) {
            return new SessionEventVO(str, obj);
        } else {
            JsonDataException n2 = t67.m52113n("data_", "data", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"data_\", \"data\", reader)");
            throw n2;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, SessionEventVO sessionEventVO) {
        vx2.m53591g(q73, "writer");
        if (sessionEventVO != null) {
            q73.mo39394c();
            q73.mo39399j(PublicResolver.FUNC_NAME);
            this.f27652b.mo39347j(q73, sessionEventVO.mo41163b());
            q73.mo39399j("data");
            this.f27653c.mo39347j(q73, sessionEventVO.mo41162a());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SessionEventVO");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
