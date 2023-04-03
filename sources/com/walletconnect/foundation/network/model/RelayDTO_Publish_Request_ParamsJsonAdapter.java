package com.walletconnect.foundation.network.model;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.foundation.common.adapters.TopicAdapter;
import com.walletconnect.foundation.common.adapters.TtlAdapter;
import com.walletconnect.foundation.network.model.RelayDTO;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.ENS;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013¨\u0006$"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/model/RelayDTO_Publish_Request_ParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/foundation/network/model/RelayDTO$Publish$Request$Params;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "Les6;", "b", "Lcom/squareup/moshi/d;", "topicAtQualifierAdapter", "c", "stringAdapter", "Lky6;", "d", "ttlAtQualifierAdapter", "", "e", "intAdapter", "", "f", "nullableBooleanAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RelayDTO_Publish_Request_ParamsJsonAdapter.kt */
public final class RelayDTO_Publish_Request_ParamsJsonAdapter extends C5391d<RelayDTO.Publish.Request.Params> {

    /* renamed from: a */
    public final JsonReader.C5372b f27442a;

    /* renamed from: b */
    public final C5391d<es6> f27443b;

    /* renamed from: c */
    public final C5391d<String> f27444c;

    /* renamed from: d */
    public final C5391d<ky6> f27445d;

    /* renamed from: e */
    public final C5391d<Integer> f27446e;

    /* renamed from: f */
    public final C5391d<Boolean> f27447f;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: com.walletconnect.foundation.network.model.RelayDTO_Publish_Request_ParamsJsonAdapter$a */
    /* compiled from: RelayDTO_Publish_Request_ParamsJsonAdapter.kt */
    public /* synthetic */ class C5616a implements TopicAdapter.Qualifier {
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

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: com.walletconnect.foundation.network.model.RelayDTO_Publish_Request_ParamsJsonAdapter$b */
    /* compiled from: RelayDTO_Publish_Request_ParamsJsonAdapter.kt */
    public /* synthetic */ class C5617b implements TtlAdapter.Qualifier {
        public final /* synthetic */ Class annotationType() {
            return TtlAdapter.Qualifier.class;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof TtlAdapter.Qualifier)) {
                return false;
            }
            TtlAdapter.Qualifier qualifier = (TtlAdapter.Qualifier) obj;
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "@com.walletconnect.foundation.common.adapters.TtlAdapter.Qualifier()";
        }
    }

    public RelayDTO_Publish_Request_ParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("topic", ThrowableDeserializer.PROP_NAME_MESSAGE, ENS.FUNC_TTL, "tag", "prompt");
        vx2.m53590f(a, "of(\"topic\", \"message\", \"…\", \"tag\",\n      \"prompt\")");
        this.f27442a = a;
        C5391d<es6> f = hVar.mo39411f(es6.class, my5.m48548d(new C5616a()), "topic");
        vx2.m53590f(f, "moshi.adapter(Topic::cla…er.Qualifier()), \"topic\")");
        this.f27443b = f;
        C5391d<String> f2 = hVar.mo39411f(String.class, ny5.m49095e(), ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53590f(f2, "moshi.adapter(String::cl…tySet(),\n      \"message\")");
        this.f27444c = f2;
        C5391d<ky6> f3 = hVar.mo39411f(ky6.class, my5.m48548d(new C5617b()), ENS.FUNC_TTL);
        vx2.m53590f(f3, "moshi.adapter(Ttl::class…pter.Qualifier()), \"ttl\")");
        this.f27445d = f3;
        C5391d<Integer> f4 = hVar.mo39411f(Integer.TYPE, ny5.m49095e(), "tag");
        vx2.m53590f(f4, "moshi.adapter(Int::class.java, emptySet(), \"tag\")");
        this.f27446e = f4;
        C5391d<Boolean> f5 = hVar.mo39411f(Boolean.class, ny5.m49095e(), "prompt");
        vx2.m53590f(f5, "moshi.adapter(Boolean::c…pe, emptySet(), \"prompt\")");
        this.f27447f = f5;
    }

    /* renamed from: k */
    public RelayDTO.Publish.Request.Params mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        Integer num = null;
        es6 es6 = null;
        String str = null;
        ky6 ky6 = null;
        Boolean bool = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27442a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                es6 = this.f27443b.mo39346b(jsonReader);
                if (es6 == null) {
                    JsonDataException v = t67.m52121v("topic", "topic", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"topic\",\n…         \"topic\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                str = this.f27444c.mo39346b(jsonReader);
                if (str == null) {
                    JsonDataException v2 = t67.m52121v(ThrowableDeserializer.PROP_NAME_MESSAGE, ThrowableDeserializer.PROP_NAME_MESSAGE, jsonReader);
                    vx2.m53590f(v2, "unexpectedNull(\"message\"…       \"message\", reader)");
                    throw v2;
                }
            } else if (z == 2) {
                ky6 = this.f27445d.mo39346b(jsonReader);
                if (ky6 == null) {
                    JsonDataException v3 = t67.m52121v(ENS.FUNC_TTL, ENS.FUNC_TTL, jsonReader);
                    vx2.m53590f(v3, "unexpectedNull(\"ttl\", \"ttl\",\n            reader)");
                    throw v3;
                }
            } else if (z == 3) {
                num = this.f27446e.mo39346b(jsonReader);
                if (num == null) {
                    JsonDataException v4 = t67.m52121v("tag", "tag", jsonReader);
                    vx2.m53590f(v4, "unexpectedNull(\"tag\", \"tag\", reader)");
                    throw v4;
                }
            } else if (z == 4) {
                bool = this.f27447f.mo39346b(jsonReader);
            }
        }
        jsonReader.mo39278d();
        if (es6 == null) {
            JsonDataException n = t67.m52113n("topic", "topic", jsonReader);
            vx2.m53590f(n, "missingProperty(\"topic\", \"topic\", reader)");
            throw n;
        } else if (str == null) {
            JsonDataException n2 = t67.m52113n(ThrowableDeserializer.PROP_NAME_MESSAGE, ThrowableDeserializer.PROP_NAME_MESSAGE, jsonReader);
            vx2.m53590f(n2, "missingProperty(\"message\", \"message\", reader)");
            throw n2;
        } else if (ky6 == null) {
            JsonDataException n3 = t67.m52113n(ENS.FUNC_TTL, ENS.FUNC_TTL, jsonReader);
            vx2.m53590f(n3, "missingProperty(\"ttl\", \"ttl\", reader)");
            throw n3;
        } else if (num != null) {
            return new RelayDTO.Publish.Request.Params(es6, str, ky6, num.intValue(), bool);
        } else {
            JsonDataException n4 = t67.m52113n("tag", "tag", jsonReader);
            vx2.m53590f(n4, "missingProperty(\"tag\", \"tag\", reader)");
            throw n4;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, RelayDTO.Publish.Request.Params params) {
        vx2.m53591g(q73, "writer");
        if (params != null) {
            q73.mo39394c();
            q73.mo39399j("topic");
            this.f27443b.mo39347j(q73, params.mo40777d());
            q73.mo39399j(ThrowableDeserializer.PROP_NAME_MESSAGE);
            this.f27444c.mo39347j(q73, params.mo40773a());
            q73.mo39399j(ENS.FUNC_TTL);
            this.f27445d.mo39347j(q73, params.mo40778e());
            q73.mo39399j("tag");
            this.f27446e.mo39347j(q73, Integer.valueOf(params.mo40775c()));
            q73.mo39399j("prompt");
            this.f27447f.mo39347j(q73, params.mo40774b());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.Publish.Request.Params");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
