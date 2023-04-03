package com.walletconnect.sign.common.model.p016vo.clientsync.session.params;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.model.RelayProtocolOptions;
import com.walletconnect.android.internal.common.model.SessionProposer;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R&\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014¨\u0006!"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams_SessionProposeParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionProposeParams;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "", "Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "b", "Lcom/squareup/moshi/d;", "listOfRelayProtocolOptionsAdapter", "Lcom/walletconnect/android/internal/common/model/SessionProposer;", "c", "sessionProposerAdapter", "", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Proposal;", "d", "mapOfStringProposalAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams_SessionProposeParamsJsonAdapter */
/* compiled from: SignParams_SessionProposeParamsJsonAdapter.kt */
public final class SignParams_SessionProposeParamsJsonAdapter extends C5391d<SignParams.SessionProposeParams> {

    /* renamed from: a */
    public final JsonReader.C5372b f27637a;

    /* renamed from: b */
    public final C5391d<List<RelayProtocolOptions>> f27638b;

    /* renamed from: c */
    public final C5391d<SessionProposer> f27639c;

    /* renamed from: d */
    public final C5391d<Map<String, NamespaceVO.Proposal>> f27640d;

    public SignParams_SessionProposeParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("relays", "proposer", "requiredNamespaces");
        vx2.m53590f(a, "of(\"relays\", \"proposer\",…    \"requiredNamespaces\")");
        this.f27637a = a;
        C5391d<List<RelayProtocolOptions>> f = hVar.mo39411f(u27.m52594j(List.class, RelayProtocolOptions.class), ny5.m49095e(), "relays");
        vx2.m53590f(f, "moshi.adapter(Types.newP…    emptySet(), \"relays\")");
        this.f27638b = f;
        C5391d<SessionProposer> f2 = hVar.mo39411f(SessionProposer.class, ny5.m49095e(), "proposer");
        vx2.m53590f(f2, "moshi.adapter(SessionPro…, emptySet(), \"proposer\")");
        this.f27639c = f2;
        C5391d<Map<String, NamespaceVO.Proposal>> f3 = hVar.mo39411f(u27.m52594j(Map.class, String.class, NamespaceVO.Proposal.class), ny5.m49095e(), "namespaces");
        vx2.m53590f(f3, "moshi.adapter(Types.newP…emptySet(), \"namespaces\")");
        this.f27640d = f3;
    }

    /* renamed from: k */
    public SignParams.SessionProposeParams mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        List list = null;
        SessionProposer sessionProposer = null;
        Map map = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27637a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                list = this.f27638b.mo39346b(jsonReader);
                if (list == null) {
                    JsonDataException v = t67.m52121v("relays", "relays", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"relays\", \"relays\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                sessionProposer = this.f27639c.mo39346b(jsonReader);
                if (sessionProposer == null) {
                    JsonDataException v2 = t67.m52121v("proposer", "proposer", jsonReader);
                    vx2.m53590f(v2, "unexpectedNull(\"proposer\", \"proposer\", reader)");
                    throw v2;
                }
            } else if (z == 2 && (map = this.f27640d.mo39346b(jsonReader)) == null) {
                JsonDataException v3 = t67.m52121v("namespaces", "requiredNamespaces", jsonReader);
                vx2.m53590f(v3, "unexpectedNull(\"namespac…uiredNamespaces\", reader)");
                throw v3;
            }
        }
        jsonReader.mo39278d();
        if (list == null) {
            JsonDataException n = t67.m52113n("relays", "relays", jsonReader);
            vx2.m53590f(n, "missingProperty(\"relays\", \"relays\", reader)");
            throw n;
        } else if (sessionProposer == null) {
            JsonDataException n2 = t67.m52113n("proposer", "proposer", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"proposer\", \"proposer\", reader)");
            throw n2;
        } else if (map != null) {
            return new SignParams.SessionProposeParams(list, sessionProposer, map);
        } else {
            JsonDataException n3 = t67.m52113n("namespaces", "requiredNamespaces", jsonReader);
            vx2.m53590f(n3, "missingProperty(\"namespa…ces\",\n            reader)");
            throw n3;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, SignParams.SessionProposeParams sessionProposeParams) {
        vx2.m53591g(q73, "writer");
        if (sessionProposeParams != null) {
            q73.mo39394c();
            q73.mo39399j("relays");
            this.f27638b.mo39347j(q73, sessionProposeParams.mo41130c());
            q73.mo39399j("proposer");
            this.f27639c.mo39347j(q73, sessionProposeParams.mo41129b());
            q73.mo39399j("requiredNamespaces");
            this.f27640d.mo39347j(q73, sessionProposeParams.mo41128a());
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SignParams.SessionProposeParams");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
