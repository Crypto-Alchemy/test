package com.walletconnect.sign.common.model.p016vo.clientsync.session.params;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.walletconnect.android.internal.common.model.RelayProtocolOptions;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.SessionParticipantVO;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R&\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u00180\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006#"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams_SessionSettleParamsJsonAdapter;", "Lcom/squareup/moshi/d;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionSettleParams;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "k", "Lq73;", "writer", "value_", "Lr37;", "l", "Lcom/squareup/moshi/JsonReader$b;", "a", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "b", "Lcom/squareup/moshi/d;", "relayProtocolOptionsAdapter", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/SessionParticipantVO;", "c", "sessionParticipantVOAdapter", "", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session;", "d", "mapOfStringSessionAdapter", "", "e", "longAdapter", "Lcom/squareup/moshi/h;", "moshi", "<init>", "(Lcom/squareup/moshi/h;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams_SessionSettleParamsJsonAdapter */
/* compiled from: SignParams_SessionSettleParamsJsonAdapter.kt */
public final class SignParams_SessionSettleParamsJsonAdapter extends C5391d<SignParams.SessionSettleParams> {

    /* renamed from: a */
    public final JsonReader.C5372b f27644a;

    /* renamed from: b */
    public final C5391d<RelayProtocolOptions> f27645b;

    /* renamed from: c */
    public final C5391d<SessionParticipantVO> f27646c;

    /* renamed from: d */
    public final C5391d<Map<String, NamespaceVO.Session>> f27647d;

    /* renamed from: e */
    public final C5391d<Long> f27648e;

    public SignParams_SessionSettleParamsJsonAdapter(C5401h hVar) {
        vx2.m53591g(hVar, "moshi");
        JsonReader.C5372b a = JsonReader.C5372b.m41530a("relay", "controller", "namespaces", "expiry");
        vx2.m53590f(a, "of(\"relay\", \"controller\"…  \"namespaces\", \"expiry\")");
        this.f27644a = a;
        C5391d<RelayProtocolOptions> f = hVar.mo39411f(RelayProtocolOptions.class, ny5.m49095e(), "relay");
        vx2.m53590f(f, "moshi.adapter(RelayProto…ava, emptySet(), \"relay\")");
        this.f27645b = f;
        C5391d<SessionParticipantVO> f2 = hVar.mo39411f(SessionParticipantVO.class, ny5.m49095e(), "controller");
        vx2.m53590f(f2, "moshi.adapter(SessionPar…emptySet(), \"controller\")");
        this.f27646c = f2;
        C5391d<Map<String, NamespaceVO.Session>> f3 = hVar.mo39411f(u27.m52594j(Map.class, String.class, NamespaceVO.Session.class), ny5.m49095e(), "namespaces");
        vx2.m53590f(f3, "moshi.adapter(Types.newP…emptySet(), \"namespaces\")");
        this.f27647d = f3;
        C5391d<Long> f4 = hVar.mo39411f(Long.TYPE, ny5.m49095e(), "expiry");
        vx2.m53590f(f4, "moshi.adapter(Long::clas…va, emptySet(), \"expiry\")");
        this.f27648e = f4;
    }

    /* renamed from: k */
    public SignParams.SessionSettleParams mo39346b(JsonReader jsonReader) {
        vx2.m53591g(jsonReader, "reader");
        jsonReader.mo39276b();
        Long l = null;
        RelayProtocolOptions relayProtocolOptions = null;
        SessionParticipantVO sessionParticipantVO = null;
        Map map = null;
        while (jsonReader.mo39280f()) {
            int z = jsonReader.mo39295z(this.f27644a);
            if (z == -1) {
                jsonReader.mo39272I();
                jsonReader.mo39273J();
            } else if (z == 0) {
                relayProtocolOptions = this.f27645b.mo39346b(jsonReader);
                if (relayProtocolOptions == null) {
                    JsonDataException v = t67.m52121v("relay", "relay", jsonReader);
                    vx2.m53590f(v, "unexpectedNull(\"relay\", \"relay\", reader)");
                    throw v;
                }
            } else if (z == 1) {
                sessionParticipantVO = this.f27646c.mo39346b(jsonReader);
                if (sessionParticipantVO == null) {
                    JsonDataException v2 = t67.m52121v("controller", "controller", jsonReader);
                    vx2.m53590f(v2, "unexpectedNull(\"controller\", \"controller\", reader)");
                    throw v2;
                }
            } else if (z == 2) {
                map = this.f27647d.mo39346b(jsonReader);
                if (map == null) {
                    JsonDataException v3 = t67.m52121v("namespaces", "namespaces", jsonReader);
                    vx2.m53590f(v3, "unexpectedNull(\"namespaces\", \"namespaces\", reader)");
                    throw v3;
                }
            } else if (z == 3 && (l = this.f27648e.mo39346b(jsonReader)) == null) {
                JsonDataException v4 = t67.m52121v("expiry", "expiry", jsonReader);
                vx2.m53590f(v4, "unexpectedNull(\"expiry\",…iry\",\n            reader)");
                throw v4;
            }
        }
        jsonReader.mo39278d();
        if (relayProtocolOptions == null) {
            JsonDataException n = t67.m52113n("relay", "relay", jsonReader);
            vx2.m53590f(n, "missingProperty(\"relay\", \"relay\", reader)");
            throw n;
        } else if (sessionParticipantVO == null) {
            JsonDataException n2 = t67.m52113n("controller", "controller", jsonReader);
            vx2.m53590f(n2, "missingProperty(\"control…r\", \"controller\", reader)");
            throw n2;
        } else if (map == null) {
            JsonDataException n3 = t67.m52113n("namespaces", "namespaces", jsonReader);
            vx2.m53590f(n3, "missingProperty(\"namespa…s\", \"namespaces\", reader)");
            throw n3;
        } else if (l != null) {
            return new SignParams.SessionSettleParams(relayProtocolOptions, sessionParticipantVO, map, l.longValue());
        } else {
            JsonDataException n4 = t67.m52113n("expiry", "expiry", jsonReader);
            vx2.m53590f(n4, "missingProperty(\"expiry\", \"expiry\", reader)");
            throw n4;
        }
    }

    /* renamed from: l */
    public void mo39347j(q73 q73, SignParams.SessionSettleParams sessionSettleParams) {
        vx2.m53591g(q73, "writer");
        if (sessionSettleParams != null) {
            q73.mo39394c();
            q73.mo39399j("relay");
            this.f27645b.mo39347j(q73, sessionSettleParams.mo41145d());
            q73.mo39399j("controller");
            this.f27646c.mo39347j(q73, sessionSettleParams.mo41141a());
            q73.mo39399j("namespaces");
            this.f27647d.mo39347j(q73, sessionSettleParams.mo41143c());
            q73.mo39399j("expiry");
            this.f27648e.mo39347j(q73, Long.valueOf(sessionSettleParams.mo41142b()));
            q73.mo39398g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SignParams.SessionSettleParams");
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
