package com.walletconnect.foundation.network.model;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.foundation.common.adapters.SubscriptionIdAdapter;
import com.walletconnect.foundation.common.adapters.TopicAdapter;
import com.walletconnect.foundation.network.model.RelayDTO;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u001c"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO_Unsubscribe_Request_ParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Unsubscribe$Request$Params;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "Les6;", "b", "Lcom/squareup/moshi/d;", "topicAtQualifierAdapter", "Lsc6;", "c", "subscriptionIdAtQualifierAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RelayDTO_Unsubscribe_Request_ParamsJsonAdapter.kt */
public final class RelayDTO_Unsubscribe_Request_ParamsJsonAdapter extends C5391d<RelayDTO.Unsubscribe.Request.Params> {

    /* renamed from: a */
    public final JsonReader.C5372b f27501a;

    /* renamed from: b */
    public final C5391d<es6> f27502b;

    /* renamed from: c */
    public final C5391d<sc6> f27503c;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: com.walletconnect.foundation.network.model.RelayDTO_Unsubscribe_Request_ParamsJsonAdapter$a */
    /* compiled from: RelayDTO_Unsubscribe_Request_ParamsJsonAdapter.kt */
    public /* synthetic */ class C5622a implements SubscriptionIdAdapter.Qualifier {
        public final /* synthetic */ Class annotationType() {
            return SubscriptionIdAdapter.Qualifier.class;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SubscriptionIdAdapter.Qualifier)) {
                return false;
            }
            SubscriptionIdAdapter.Qualifier qualifier = (SubscriptionIdAdapter.Qualifier) obj;
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "@com.walletconnect.foundation.common.adapters.SubscriptionIdAdapter.Qualifier()";
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: com.walletconnect.foundation.network.model.RelayDTO_Unsubscribe_Request_ParamsJsonAdapter$b */
    /* compiled from: RelayDTO_Unsubscribe_Request_ParamsJsonAdapter.kt */
    public /* synthetic */ class C5623b implements TopicAdapter.Qualifier {
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

    public RelayDTO_Unsubscribe_Request_ParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("topic", "id");
        vx2.m53590f(a, "of(\"topic\", \"id\")");
        this.f27501a = a;
        C5391d<es6> f = hVar.mo39411f(es6.class, my5.m48548d(new C5623b()), "topic");
        vx2.m53590f(f, "moshi.adapter(Topic::cla…er.Qualifier()), \"topic\")");
        this.f27502b = f;
        C5391d<sc6> f2 = hVar.mo39411f(sc6.class, my5.m48548d(new C5622a()), "subscriptionId");
        vx2.m53590f(f2, "moshi.adapter(Subscripti…,\n      \"subscriptionId\")");
        this.f27503c = f2;
    }

    /* renamed from: k */
    public RelayDTO.Unsubscribe.Request.Params mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        es6 es6 = null;
        sc6 sc6 = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27501a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                es6 = this.f27502b.mo39346b(jsonReader);
                if (es6 == null) {
                    JsonDataException v = t67.m52121v("topic", "topic", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"topic\",\n…         \"topic\", reader)");
                    throw v;
                }
            } else if (z == 1 && (sc6 = this.f27503c.mo39346b(jsonReader)) == null) {
                JsonDataException v2 = t67.m52121v("subscriptionId", "id", jsonReader);
                vx2.m53590f(v2, "unexpectedNull(\"subscriptionId\", \"id\", reader)");
                throw v2;
            }
        }
        jsonReader.mo39278d();
        if (es6 == null) {
            JsonDataException n = t67.m52113n("topic", "topic", jsonReader);
            vx2.m53590f(n, "missingProperty(\"topic\", \"topic\", reader)");
            throw n;
        } else if (sc6 != null) {
            return new RelayDTO.Unsubscribe.Request.Params(es6, sc6);
        } else {
            JsonDataException n2 = t67.m52113n("subscriptionId", "id", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"subscri…\"id\",\n            reader)");
            throw n2;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, RelayDTO.Unsubscribe.Request.Params params) {
        vx2.m53591g(q73, "writer");
        if (params != null) {
            q73.mo39394c();
            q73.mo39399j("topic");
            this.f27502b.mo39347j(q73, params.mo40852b());
            q73.mo39399j("id");
            this.f27503c.mo39347j(q73, params.mo40851a());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(57);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.Unsubscribe.Request.Params");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
