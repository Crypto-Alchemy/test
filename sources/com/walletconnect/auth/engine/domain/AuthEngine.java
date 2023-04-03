package com.walletconnect.auth.engine.domain;

import com.walletconnect.android.internal.common.model.AppMetaData;
import com.walletconnect.android.internal.common.model.AppMetaDataType;
import com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface;
import com.walletconnect.android.pairing.handler.PairingControllerInterface;
import com.walletconnect.auth.common.exceptions.InvalidParamsException;
import com.walletconnect.auth.common.json_rpc.AuthParams;
import com.walletconnect.auth.common.model.PayloadParams;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.ut0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;¢\u0006\u0004\bS\u0010TJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010@R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020G0F8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020G0K8\u0006¢\u0006\f\n\u0004\b\u001a\u0010L\u001a\u0004\bM\u0010NR \u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130P8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010Q¨\u0006U"}, mo44877d2 = {"Lcom/walletconnect/auth/engine/domain/AuthEngine;", "", "Lr37;", "v", "Lcom/walletconnect/auth/common/model/PayloadParams;", "payloadParams", "", "iss", "q", "(Lcom/walletconnect/auth/common/model/PayloadParams;Ljava/lang/String;)Ljava/lang/String;", "Lrf7;", "wcRequest", "Lcom/walletconnect/auth/common/json_rpc/AuthParams$RequestParams;", "authParams", "s", "Lsf7;", "wcResponse", "requestParams", "t", "Les6;", "topic", "w", "Ly23;", "o", "p", "u", "n", "Lcom/walletconnect/android/internal/common/model/type/JsonRpcInteractorInterface;", "a", "Lcom/walletconnect/android/internal/common/model/type/JsonRpcInteractorInterface;", "jsonRpcInteractor", "Lwf2;", "b", "Lwf2;", "getPendingJsonRpcHistoryEntriesUseCase", "Lxf2;", "c", "Lxf2;", "getPendingJsonRpcHistoryEntryByIdUseCase", "Lra3;", "d", "Lra3;", "crypto", "Lcom/walletconnect/android/pairing/handler/PairingControllerInterface;", "e", "Lcom/walletconnect/android/pairing/handler/PairingControllerInterface;", "pairingHandler", "Lll4;", "f", "Lll4;", "pairingInterface", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "g", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "selfAppMetaData", "Lb80;", "h", "Lb80;", "cacaoVerifier", "Lsk3;", "i", "Lsk3;", "logger", "j", "Ly23;", "jsonRpcRequestsJob", "k", "jsonRpcResponsesJob", "l", "internalErrorsJob", "Lr04;", "Lbq1;", "m", "Lr04;", "_engineEvent", "Lxz5;", "Lxz5;", "r", "()Lxz5;", "engineEvent", "", "Ljava/util/Map;", "pairingTopicToResponseTopicMap", "<init>", "(Lcom/walletconnect/android/internal/common/model/type/JsonRpcInteractorInterface;Lwf2;Lxf2;Lra3;Lcom/walletconnect/android/pairing/handler/PairingControllerInterface;Lll4;Lcom/walletconnect/android/internal/common/model/AppMetaData;Lb80;Lsk3;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AuthEngine.kt */
public final class AuthEngine {

    /* renamed from: a */
    public final JsonRpcInteractorInterface f27324a;

    /* renamed from: b */
    public final wf2 f27325b;

    /* renamed from: c */
    public final xf2 f27326c;

    /* renamed from: d */
    public final ra3 f27327d;

    /* renamed from: e */
    public final PairingControllerInterface f27328e;

    /* renamed from: f */
    public final ll4 f27329f;

    /* renamed from: g */
    public final AppMetaData f27330g;

    /* renamed from: h */
    public final b80 f27331h;

    /* renamed from: i */
    public final sk3 f27332i;

    /* renamed from: j */
    public y23 f27333j;

    /* renamed from: k */
    public y23 f27334k;

    /* renamed from: l */
    public y23 f27335l;

    /* renamed from: m */
    public final r04<bq1> f27336m;

    /* renamed from: n */
    public final xz5<bq1> f27337n;

    /* renamed from: o */
    public final Map<es6, es6> f27338o = new LinkedHashMap();

    public AuthEngine(JsonRpcInteractorInterface jsonRpcInteractorInterface, wf2 wf2, xf2 xf2, ra3 ra3, PairingControllerInterface pairingControllerInterface, ll4 ll4, AppMetaData appMetaData, b80 b80, sk3 sk3) {
        vx2.m53591g(jsonRpcInteractorInterface, "jsonRpcInteractor");
        vx2.m53591g(wf2, "getPendingJsonRpcHistoryEntriesUseCase");
        vx2.m53591g(xf2, "getPendingJsonRpcHistoryEntryByIdUseCase");
        vx2.m53591g(ra3, "crypto");
        vx2.m53591g(pairingControllerInterface, "pairingHandler");
        vx2.m53591g(ll4, "pairingInterface");
        vx2.m53591g(appMetaData, "selfAppMetaData");
        vx2.m53591g(b80, "cacaoVerifier");
        vx2.m53591g(sk3, "logger");
        this.f27324a = jsonRpcInteractorInterface;
        this.f27325b = wf2;
        this.f27326c = xf2;
        this.f27327d = ra3;
        this.f27328e = pairingControllerInterface;
        this.f27329f = ll4;
        this.f27330g = appMetaData;
        this.f27331h = b80;
        this.f27332i = sk3;
        r04<bq1> b = yz5.m74703b(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f27336m = b;
        this.f27337n = e52.m57209a(b);
        pairingControllerInterface.mo40495b("wc_authRequest");
    }

    /* renamed from: n */
    public final y23 mo40672n() {
        return e52.m57232x(e52.m57202C(e52.m57200A(this.f27324a.mo40293f(), this.f27328e.mo40494a()), new AuthEngine$collectInternalErrors$1(this, (ns0<? super AuthEngine$collectInternalErrors$1>) null)), bh7.m32535a());
    }

    /* renamed from: o */
    public final y23 mo40673o() {
        return e52.m57232x(e52.m57202C(new AuthEngine$collectJsonRpcRequests$$inlined$filter$1(this.f27324a.mo40292e()), new AuthEngine$collectJsonRpcRequests$2(this, (ns0<? super AuthEngine$collectJsonRpcRequests$2>) null)), bh7.m32535a());
    }

    /* renamed from: p */
    public final y23 mo40674p() {
        return e52.m57232x(e52.m57202C(new AuthEngine$collectJsonRpcResponses$$inlined$filter$1(this.f27324a.mo40297j()), new AuthEngine$collectJsonRpcResponses$2(this, (ns0<? super AuthEngine$collectJsonRpcResponses$2>) null)), bh7.m32535a());
    }

    /* renamed from: q */
    public final String mo40675q(PayloadParams payloadParams, String str) {
        vx2.m53591g(payloadParams, "payloadParams");
        vx2.m53591g(str, "iss");
        qy2 qy2 = new qy2(str);
        if (vx2.m53586b(qy2.mo47306c(), payloadParams.mo40638b())) {
            zt0 zt0 = zt0.f36235a;
            if (!zt0.mo49917b(payloadParams.mo40638b())) {
                throw new InvalidParamsException("PayloadParams chainId is not CAIP-2 compliant");
            } else if (!zt0.mo49917b(qy2.mo47306c())) {
                throw new InvalidParamsException("Issuer chainId is not CAIP-2 compliant");
            } else if (zt0.mo49916a(qy2.mo47304a())) {
                return hq1.m45347b(payloadParams, qy2, (String) null, 2, (Object) null);
            } else {
                throw new InvalidParamsException("Issuer address is not CAIP-10 compliant");
            }
        } else {
            throw new InvalidParamsException("Issuer chaiId does not match with PayloadParams");
        }
    }

    /* renamed from: r */
    public final xz5<bq1> mo40676r() {
        return this.f27337n;
    }

    /* renamed from: s */
    public final void mo40677s(rf7 rf7, AuthParams.RequestParams requestParams) {
        y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new AuthEngine$onAuthRequest$1(this, rf7, requestParams, (ns0<? super AuthEngine$onAuthRequest$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[Catch:{ Exception -> 0x00a8 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d A[Catch:{ Exception -> 0x00a8 }] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40678t(p000.sf7 r11, com.walletconnect.auth.common.json_rpc.AuthParams.RequestParams r12) {
        /*
            r10 = this;
            r0 = 0
            es6 r1 = r11.mo47757c()     // Catch:{ Exception -> 0x00a8 }
            r10.mo40681w(r1, r12)     // Catch:{ Exception -> 0x00a8 }
            ll4 r12 = r10.f27329f     // Catch:{ Exception -> 0x00a8 }
            java.util.List r12 = r12.mo40454b()     // Catch:{ Exception -> 0x00a8 }
            boolean r2 = r12 instanceof java.util.Collection     // Catch:{ Exception -> 0x00a8 }
            if (r2 == 0) goto L_0x0019
            boolean r2 = r12.isEmpty()     // Catch:{ Exception -> 0x00a8 }
            if (r2 == 0) goto L_0x0019
            goto L_0x0039
        L_0x0019:
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x00a8 }
        L_0x001d:
            boolean r2 = r12.hasNext()     // Catch:{ Exception -> 0x00a8 }
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r12.next()     // Catch:{ Exception -> 0x00a8 }
            tt0$d r2 = (p000.tt0.C6539d) r2     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r2 = r2.mo48184a()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r3 = r1.mo42395a()     // Catch:{ Exception -> 0x00a8 }
            boolean r2 = p000.vx2.m53586b(r2, r3)     // Catch:{ Exception -> 0x00a8 }
            if (r2 == 0) goto L_0x001d
            r12 = 1
            goto L_0x003a
        L_0x0039:
            r12 = 0
        L_0x003a:
            if (r12 != 0) goto L_0x003d
            return
        L_0x003d:
            java.util.Map<es6, es6> r12 = r10.f27338o     // Catch:{ Exception -> 0x00a8 }
            r12.remove(r1)     // Catch:{ Exception -> 0x00a8 }
            com.walletconnect.android.internal.common.JsonRpcResponse r11 = r11.mo47756b()     // Catch:{ Exception -> 0x00a8 }
            boolean r12 = r11 instanceof com.walletconnect.android.internal.common.JsonRpcResponse.JsonRpcError     // Catch:{ Exception -> 0x00a8 }
            if (r12 == 0) goto L_0x005b
            hu0 r1 = p000.bh7.m32535a()     // Catch:{ Exception -> 0x00a8 }
            r2 = 0
            r3 = 0
            com.walletconnect.auth.engine.domain.AuthEngine$onAuthRequestResponse$2 r4 = new com.walletconnect.auth.engine.domain.AuthEngine$onAuthRequestResponse$2     // Catch:{ Exception -> 0x00a8 }
            r4.<init>(r10, r11, r0)     // Catch:{ Exception -> 0x00a8 }
            r5 = 3
            r6 = 0
            p000.y23 unused = p000.d50.m56748b(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00b9
        L_0x005b:
            boolean r12 = r11 instanceof com.walletconnect.android.internal.common.JsonRpcResponse.C5515b     // Catch:{ Exception -> 0x00a8 }
            if (r12 == 0) goto L_0x00b9
            r12 = r11
            com.walletconnect.android.internal.common.JsonRpcResponse$b r12 = (com.walletconnect.android.internal.common.JsonRpcResponse.C5515b) r12     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r12 = r12.mo40172b()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = "null cannot be cast to non-null type com.walletconnect.android.internal.common.model.params.CoreAuthParams.ResponseParams"
            p000.vx2.m53589e(r12, r1)     // Catch:{ Exception -> 0x00a8 }
            com.walletconnect.android.internal.common.model.params.CoreAuthParams$ResponseParams r12 = (com.walletconnect.android.internal.common.model.params.CoreAuthParams.ResponseParams) r12     // Catch:{ Exception -> 0x00a8 }
            com.walletconnect.android.internal.common.cacao.Cacao$Header r1 = r12.mo40345a()     // Catch:{ Exception -> 0x00a8 }
            com.walletconnect.android.internal.common.cacao.Cacao$Payload r2 = r12.mo40346b()     // Catch:{ Exception -> 0x00a8 }
            com.walletconnect.android.internal.common.cacao.Cacao$Signature r12 = r12.mo40347c()     // Catch:{ Exception -> 0x00a8 }
            com.walletconnect.android.internal.common.cacao.Cacao r3 = new com.walletconnect.android.internal.common.cacao.Cacao     // Catch:{ Exception -> 0x00a8 }
            r3.<init>(r1, r2, r12)     // Catch:{ Exception -> 0x00a8 }
            b80 r12 = r10.f27331h     // Catch:{ Exception -> 0x00a8 }
            boolean r12 = r12.mo29492a(r3)     // Catch:{ Exception -> 0x00a8 }
            if (r12 == 0) goto L_0x0097
            hu0 r4 = p000.bh7.m32535a()     // Catch:{ Exception -> 0x00a8 }
            r5 = 0
            r6 = 0
            com.walletconnect.auth.engine.domain.AuthEngine$onAuthRequestResponse$3 r7 = new com.walletconnect.auth.engine.domain.AuthEngine$onAuthRequestResponse$3     // Catch:{ Exception -> 0x00a8 }
            r7.<init>(r10, r11, r3, r0)     // Catch:{ Exception -> 0x00a8 }
            r8 = 3
            r9 = 0
            p000.y23 unused = p000.d50.m56748b(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00b9
        L_0x0097:
            hu0 r1 = p000.bh7.m32535a()     // Catch:{ Exception -> 0x00a8 }
            r2 = 0
            r3 = 0
            com.walletconnect.auth.engine.domain.AuthEngine$onAuthRequestResponse$4 r4 = new com.walletconnect.auth.engine.domain.AuthEngine$onAuthRequestResponse$4     // Catch:{ Exception -> 0x00a8 }
            r4.<init>(r10, r11, r0)     // Catch:{ Exception -> 0x00a8 }
            r5 = 3
            r6 = 0
            p000.y23 unused = p000.d50.m56748b(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00b9
        L_0x00a8:
            r11 = move-exception
            hu0 r1 = p000.bh7.m32535a()
            com.walletconnect.auth.engine.domain.AuthEngine$onAuthRequestResponse$5 r4 = new com.walletconnect.auth.engine.domain.AuthEngine$onAuthRequestResponse$5
            r4.<init>(r10, r11, r0)
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            p000.y23 unused = p000.d50.m56748b(r1, r2, r3, r4, r5, r6)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.auth.engine.domain.AuthEngine.mo40678t(sf7, com.walletconnect.auth.common.json_rpc.AuthParams$RequestParams):void");
    }

    /* renamed from: u */
    public final void mo40679u() {
        Map<es6, es6> map = this.f27338o;
        ArrayList<es6> arrayList = new ArrayList<>(map.size());
        for (Map.Entry<es6, es6> value : map.entrySet()) {
            arrayList.add((es6) value.getValue());
        }
        for (es6 f : arrayList) {
            try {
                JsonRpcInteractorInterface.DefaultImpls.m42233f(this.f27324a, f, (rc2) null, new AuthEngine$resubscribeToPendingRequestsTopics$2$1(this), 2, (Object) null);
            } catch (Exception e) {
                y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new AuthEngine$resubscribeToPendingRequestsTopics$2$2(this, e, (ns0<? super AuthEngine$resubscribeToPendingRequestsTopics$2$2>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: v */
    public final void mo40680v() {
        e52.m57232x(e52.m57202C(new AuthEngine$setup$$inlined$filter$1(e52.m57202C(this.f27324a.mo40288a(), new AuthEngine$setup$1(this, (ns0<? super AuthEngine$setup$1>) null))), new AuthEngine$setup$3(this, (ns0<? super AuthEngine$setup$3>) null)), bh7.m32535a());
    }

    /* renamed from: w */
    public final void mo40681w(es6 es6, AuthParams.RequestParams requestParams) {
        PairingControllerInterface.DefaultImpls.m42316b(this.f27328e, new ut0.C6578c(es6.mo42395a(), new nx1(fq6.m44372d())), (rc2) null, 2, (Object) null);
        PairingControllerInterface.DefaultImpls.m42317c(this.f27328e, new ut0.C6579d(es6.mo42395a(), ml4.m48364b(requestParams.mo40620b().mo40656a()), AppMetaDataType.PEER), (rc2) null, 2, (Object) null);
        PairingControllerInterface.DefaultImpls.m42315a(this.f27328e, new ut0.C6576a(es6.mo42395a()), (rc2) null, 2, (Object) null);
    }
}
