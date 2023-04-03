package com.walletconnect.foundation.network.model;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.foundation.common.adapters.TopicAdapter;
import com.walletconnect.foundation.network.model.RelayDTO;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO_Subscribe_Request_ParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Subscribe$Request$Params;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "Les6;", "b", "Lcom/squareup/moshi/d;", "topicAtQualifierAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RelayDTO_Subscribe_Request_ParamsJsonAdapter.kt */
public final class RelayDTO_Subscribe_Request_ParamsJsonAdapter extends C5391d<RelayDTO.Subscribe.Request.Params> {

    /* renamed from: a */
    public final JsonReader.C5372b f27463a;

    /* renamed from: b */
    public final C5391d<es6> f27464b;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: com.walletconnect.foundation.network.model.RelayDTO_Subscribe_Request_ParamsJsonAdapter$a */
    /* compiled from: RelayDTO_Subscribe_Request_ParamsJsonAdapter.kt */
    public /* synthetic */ class C5618a implements TopicAdapter.Qualifier {
        public final /* synthetic */ Class annotationType() {
            return TopicAdapter.Qualifier.class;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof TopicAdapter.Qualifier)) {
                return false;
            }
            TopicAdapter.Qualifier qualifier = (TopicAdapter.Qualifier) obj;
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "@com.walletconnect.foundation.common.adapters.TopicAdapter.Qualifier()";
        }
    }

    public RelayDTO_Subscribe_Request_ParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("topic");
        vx2.m53590f(a, "of(\"topic\")");
        this.f27463a = a;
        C5391d<es6> f = hVar.mo39411f(es6.class, my5.m48548d(new C5618a()), "topic");
        vx2.m53590f(f, "moshi.adapter(Topic::cla…er.Qualifier()), \"topic\")");
        this.f27464b = f;
    }

    /* renamed from: k */
    public RelayDTO.Subscribe.Request.Params mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        es6 es6 = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27463a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0 && (es6 = this.f27464b.mo39346b(jsonReader)) == null) {
                JsonDataException v = t67.m52121v("topic", "topic", jsonReader);
                vx2.m53590f(v, "unexpectedNull(\"topic\",\n…         \"topic\", reader)");
                throw v;
            }
        }
        jsonReader.mo39278d();
        if (es6 != null) {
            return new RelayDTO.Subscribe.Request.Params(es6);
        }
        JsonDataException n = t67.m52113n("topic", "topic", jsonReader);
        vx2.m53590f(n, "missingProperty(\"topic\", \"topic\", reader)");
        throw n;
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, RelayDTO.Subscribe.Request.Params params) {
        vx2.m53591g(q73, "writer");
        if (params != null) {
            q73.mo39394c();
            q73.mo39399j("topic");
            this.f27464b.mo39347j(q73, params.mo40804a());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.Subscribe.Request.Params");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
