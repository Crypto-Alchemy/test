package com.walletconnect.android.internal.common.model.params;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.model.RelayProtocolOptions;
import com.walletconnect.android.internal.common.model.params.CoreSignParams;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/CoreSignParams_ApprovalParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/android/internal/common/model/params/CoreSignParams$ApprovalParams;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "b", "Lcom/squareup/moshi/d;", "relayProtocolOptionsAdapter", "c", "stringAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CoreSignParams_ApprovalParamsJsonAdapter.kt */
public final class CoreSignParams_ApprovalParamsJsonAdapter extends C5391d<CoreSignParams.ApprovalParams> {

    /* renamed from: a */
    public final JsonReader.C5372b f27155a;

    /* renamed from: b */
    public final C5391d<RelayProtocolOptions> f27156b;

    /* renamed from: c */
    public final C5391d<String> f27157c;

    public CoreSignParams_ApprovalParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("relay", "responderPublicKey");
        vx2.m53590f(a, "of(\"relay\", \"responderPublicKey\")");
        this.f27155a = a;
        C5391d<RelayProtocolOptions> f = hVar.mo39411f(RelayProtocolOptions.class, ny5.m49095e(), "relay");
        vx2.m53590f(f, "moshi.adapter(RelayProto…ava, emptySet(), \"relay\")");
        this.f27156b = f;
        C5391d<String> f2 = hVar.mo39411f(String.class, ny5.m49095e(), "responderPublicKey");
        vx2.m53590f(f2, "moshi.adapter(String::cl…    \"responderPublicKey\")");
        this.f27157c = f2;
    }

    /* renamed from: k */
    public CoreSignParams.ApprovalParams mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        RelayProtocolOptions relayProtocolOptions = null;
        String str = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27155a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                relayProtocolOptions = this.f27156b.mo39346b(jsonReader);
                if (relayProtocolOptions == null) {
                    JsonDataException v = t67.m52121v("relay", "relay", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"relay\", \"relay\", reader)");
                    throw v;
                }
            } else if (z == 1 && (str = this.f27157c.mo39346b(jsonReader)) == null) {
                JsonDataException v2 = t67.m52121v("responderPublicKey", "responderPublicKey", jsonReader);
                vx2.m53590f(v2, "unexpectedNull(\"responde…ponderPublicKey\", reader)");
                throw v2;
            }
        }
        jsonReader.mo39278d();
        if (relayProtocolOptions == null) {
            JsonDataException n = t67.m52113n("relay", "relay", jsonReader);
            vx2.m53590f(n, "missingProperty(\"relay\", \"relay\", reader)");
            throw n;
        } else if (str != null) {
            return new CoreSignParams.ApprovalParams(relayProtocolOptions, str);
        } else {
            JsonDataException n2 = t67.m52113n("responderPublicKey", "responderPublicKey", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"respond…ponderPublicKey\", reader)");
            throw n2;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, CoreSignParams.ApprovalParams approvalParams) {
        vx2.m53591g(q73, "writer");
        if (approvalParams != null) {
            q73.mo39394c();
            q73.mo39399j("relay");
            this.f27156b.mo39347j(q73, approvalParams.mo40366a());
            q73.mo39399j("responderPublicKey");
            this.f27157c.mo39347j(q73, approvalParams.mo40367b());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CoreSignParams.ApprovalParams");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
