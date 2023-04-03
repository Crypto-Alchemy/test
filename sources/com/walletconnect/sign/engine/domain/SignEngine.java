package com.walletconnect.sign.engine.domain;

import android.database.sqlite.SQLiteException;
import com.walletconnect.android.internal.common.JsonRpcResponse;
import com.walletconnect.android.internal.common.exception.CannotFindSequenceForTopic;
import com.walletconnect.android.internal.common.model.AppMetaData;
import com.walletconnect.android.internal.common.model.AppMetaDataType;
import com.walletconnect.android.internal.common.model.EnvelopeType;
import com.walletconnect.android.internal.common.model.Tags;
import com.walletconnect.android.internal.common.model.params.CoreSignParams;
import com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface;
import com.walletconnect.android.pairing.handler.PairingControllerInterface;
import com.walletconnect.sign.common.exceptions.CannotFindSessionProposalException;
import com.walletconnect.sign.common.exceptions.InvalidNamespaceException;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.SessionParticipantVO;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.SignRpc;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.payload.SessionEventVO;
import com.walletconnect.sign.engine.model.EngineDO;
import com.walletconnect.sign.storage.sequence.SessionStorageRepository;
import com.walletconnect.utils.UtilFunctionsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.cn4;
import p000.n37;
import p000.tt0;
import p000.ut0;
import p000.w75;
import p000.y77;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u0000 y2\u00020\u0001:\u0001>BO\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A\u0012\u0006\u0010H\u001a\u00020E\u0012\u0006\u0010L\u001a\u00020I\u0012\u0006\u0010P\u001a\u00020M\u0012\u0006\u0010T\u001a\u00020Q\u0012\u0006\u0010X\u001a\u00020U\u0012\u0006\u0010\\\u001a\u00020Y\u0012\u0006\u0010`\u001a\u00020]¢\u0006\u0004\bw\u0010xJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0014H\u0002J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0016H\u0002J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0018\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\nH\u0002J\b\u0010$\u001a\u00020\nH\u0002J\u0006\u0010%\u001a\u00020\nJQ\u00100\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020)0(2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0+2\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\n0-H\u0000¢\u0006\u0004\b0\u00101JA\u00105\u001a\u00020\n2\u0006\u00102\u001a\u00020&2\u0006\u00104\u001a\u0002032\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0+2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\n0-H\u0000¢\u0006\u0004\b5\u00106J9\u00107\u001a\u00020\n2\u0006\u00102\u001a\u00020&2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0+2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\n0-H\u0000¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020:09H\u0000¢\u0006\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010bR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020i0h8\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001d\u0010r\u001a\b\u0012\u0004\u0012\u00020i0m8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR \u0010v\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00060s8\u0002X\u0004¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006z"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/domain/SignEngine;", "", "Ly23;", "E", "D", "F", "Lrf7;", "request", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionProposeParams;", "payloadParams", "Lr37;", "O", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionSettleParams;", "settleParams", "R", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$DeleteParams;", "params", "K", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionRequestParams;", "P", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$EventParams;", "L", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$UpdateNamespacesParams;", "T", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$ExtendParams;", "requestParams", "M", "J", "Lsf7;", "wcResponse", "N", "S", "U", "response", "Q", "W", "Y", "X", "", "proposerPublicKey", "", "Lcom/walletconnect/sign/engine/model/EngineDO$b$b;", "namespaces", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onFailure", "B", "(Ljava/lang/String;Ljava/util/Map;Lpc2;Lrc2;)V", "topic", "Lcom/walletconnect/android/internal/common/JsonRpcResponse;", "jsonRpcResponse", "V", "(Ljava/lang/String;Lcom/walletconnect/android/internal/common/JsonRpcResponse;Lpc2;Lrc2;)V", "G", "(Ljava/lang/String;Lpc2;Lrc2;)V", "", "Lcom/walletconnect/sign/engine/model/EngineDO$d;", "I", "()Ljava/util/List;", "Lcom/walletconnect/android/internal/common/model/type/JsonRpcInteractorInterface;", "a", "Lcom/walletconnect/android/internal/common/model/type/JsonRpcInteractorInterface;", "jsonRpcInteractor", "Lyf2;", "b", "Lyf2;", "getPendingRequestsUseCase", "Lra3;", "c", "Lra3;", "crypto", "Lcom/walletconnect/sign/storage/sequence/SessionStorageRepository;", "d", "Lcom/walletconnect/sign/storage/sequence/SessionStorageRepository;", "sessionStorageRepository", "Lkv3;", "e", "Lkv3;", "metadataStorageRepository", "Lll4;", "f", "Lll4;", "pairingInterface", "Lcom/walletconnect/android/pairing/handler/PairingControllerInterface;", "g", "Lcom/walletconnect/android/pairing/handler/PairingControllerInterface;", "pairingHandler", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "h", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "selfAppMetaData", "Lsk3;", "i", "Lsk3;", "logger", "j", "Ly23;", "jsonRpcRequestsJob", "k", "jsonRpcResponsesJob", "l", "internalErrorsJob", "Lr04;", "Lbq1;", "m", "Lr04;", "_engineEvent", "Lxz5;", "n", "Lxz5;", "H", "()Lxz5;", "engineEvent", "", "o", "Ljava/util/Map;", "sessionProposalRequest", "<init>", "(Lcom/walletconnect/android/internal/common/model/type/JsonRpcInteractorInterface;Lyf2;Lra3;Lcom/walletconnect/sign/storage/sequence/SessionStorageRepository;Lkv3;Lll4;Lcom/walletconnect/android/pairing/handler/PairingControllerInterface;Lcom/walletconnect/android/internal/common/model/AppMetaData;Lsk3;)V", "p", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SignEngine.kt */
public final class SignEngine {

    /* renamed from: p */
    public static final C5638a f27656p = new C5638a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final JsonRpcInteractorInterface f27657a;

    /* renamed from: b */
    public final yf2 f27658b;

    /* renamed from: c */
    public final ra3 f27659c;

    /* renamed from: d */
    public final SessionStorageRepository f27660d;

    /* renamed from: e */
    public final kv3 f27661e;

    /* renamed from: f */
    public final ll4 f27662f;

    /* renamed from: g */
    public final PairingControllerInterface f27663g;

    /* renamed from: h */
    public final AppMetaData f27664h;

    /* renamed from: i */
    public final sk3 f27665i;

    /* renamed from: j */
    public y23 f27666j;

    /* renamed from: k */
    public y23 f27667k;

    /* renamed from: l */
    public y23 f27668l;

    /* renamed from: m */
    public final r04<bq1> f27669m;

    /* renamed from: n */
    public final xz5<bq1> f27670n;

    /* renamed from: o */
    public final Map<String, rf7> f27671o = new LinkedHashMap();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Lcom/walletconnect/sign/engine/domain/SignEngine$a;", "", "", "FIVE_MINUTES_TIMEOUT", "J", "THIRTY_SECONDS_TIMEOUT", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.engine.domain.SignEngine$a */
    /* compiled from: SignEngine.kt */
    public static final class C5638a {
        public C5638a() {
        }

        public /* synthetic */ C5638a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SignEngine(JsonRpcInteractorInterface jsonRpcInteractorInterface, yf2 yf2, ra3 ra3, SessionStorageRepository sessionStorageRepository, kv3 kv3, ll4 ll4, PairingControllerInterface pairingControllerInterface, AppMetaData appMetaData, sk3 sk3) {
        JsonRpcInteractorInterface jsonRpcInteractorInterface2 = jsonRpcInteractorInterface;
        yf2 yf22 = yf2;
        ra3 ra32 = ra3;
        SessionStorageRepository sessionStorageRepository2 = sessionStorageRepository;
        kv3 kv32 = kv3;
        ll4 ll42 = ll4;
        PairingControllerInterface pairingControllerInterface2 = pairingControllerInterface;
        AppMetaData appMetaData2 = appMetaData;
        sk3 sk32 = sk3;
        vx2.m53591g(jsonRpcInteractorInterface2, "jsonRpcInteractor");
        vx2.m53591g(yf22, "getPendingRequestsUseCase");
        vx2.m53591g(ra32, "crypto");
        vx2.m53591g(sessionStorageRepository2, "sessionStorageRepository");
        vx2.m53591g(kv32, "metadataStorageRepository");
        vx2.m53591g(ll42, "pairingInterface");
        vx2.m53591g(pairingControllerInterface2, "pairingHandler");
        vx2.m53591g(appMetaData2, "selfAppMetaData");
        vx2.m53591g(sk32, "logger");
        this.f27657a = jsonRpcInteractorInterface2;
        this.f27658b = yf22;
        this.f27659c = ra32;
        this.f27660d = sessionStorageRepository2;
        this.f27661e = kv32;
        this.f27662f = ll42;
        this.f27663g = pairingControllerInterface2;
        this.f27664h = appMetaData2;
        this.f27665i = sk32;
        r04<bq1> b = yz5.m74703b(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f27669m = b;
        this.f27670n = e52.m57209a(b);
        pairingControllerInterface2.mo40495b("wc_sessionPropose", "wc_sessionSettle", "wc_sessionRequest", "wc_sessionEvent", "wc_sessionDelete", "wc_sessionExtend", "wc_sessionPing", "wc_sessionUpdate");
        mo41215Y();
    }

    /* renamed from: C */
    public static final void m42782C(SignEngine signEngine, Map<String, EngineDO.C5655b.C5658b> map, rc2<? super Throwable, r37> rc2, pc2<r37> pc2, long j, SignParams.SessionProposeParams sessionProposeParams, es6 es6, es6 es62) {
        SignEngine signEngine2 = signEngine;
        rc2<? super Throwable, r37> rc22 = rc2;
        es6 es63 = es6;
        SessionParticipantVO sessionParticipantVO = new SessionParticipantVO(signEngine2.f27659c.mo47355d(es63), signEngine2.f27664h);
        long a = mx1.m48527a();
        try {
            signEngine2.f27660d.mo41518w(cy5.f27978o.mo41773b(es6, sessionProposeParams, sessionParticipantVO, a, map), es62, j);
            signEngine2.f27661e.mo40436b(es63, signEngine2.f27664h, AppMetaDataType.SELF);
            signEngine2.f27661e.mo40436b(es63, sessionProposeParams.mo41129b().mo40335a(), AppMetaDataType.PEER);
            SignRpc.SessionSettle sessionSettle = new SignRpc.SessionSettle(x67.m54246b(), (String) null, (String) null, gq1.m44834q(sessionProposeParams, sessionParticipantVO, a, map), 6, (DefaultConstructorMarker) null);
            es6 es64 = es6;
            JsonRpcInteractorInterface.DefaultImpls.m42228a(signEngine2.f27657a, es64, new ny2(Tags.SESSION_SETTLE, new ky6(fq6.m44371c()), false, 4, (DefaultConstructorMarker) null), sessionSettle, (EnvelopeType) null, (qm4) null, new SignEngine$approve$sessionSettle$1(pc2), new SignEngine$approve$sessionSettle$2(rc22), 24, (Object) null);
        } catch (SQLiteException e) {
            signEngine2.f27660d.mo41508k(es63);
            rc22.invoke(e);
        }
    }

    /* renamed from: B */
    public final void mo41193B(String str, Map<String, EngineDO.C5655b.C5658b> map, pc2<r37> pc2, rc2<? super Throwable, r37> rc2) {
        String str2 = str;
        rc2<? super Throwable, r37> rc22 = rc2;
        vx2.m53591g(str2, "proposerPublicKey");
        vx2.m53591g(map, "namespaces");
        vx2.m53591g(pc2, "onSuccess");
        vx2.m53591g(rc22, "onFailure");
        rf7 rf7 = this.f27671o.get(str2);
        if (rf7 != null) {
            this.f27671o.remove(str2);
            rg0 c = rf7.mo47399c();
            vx2.m53589e(c, "null cannot be cast to non-null type com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams.SessionProposeParams");
            SignParams.SessionProposeParams sessionProposeParams = (SignParams.SessionProposeParams) c;
            p16 p16 = p16.f32536a;
            Map m = gq1.m44830m(map);
            Map<String, NamespaceVO.Proposal> a = sessionProposeParams.mo41128a();
            if (!p16.mo46595H(m)) {
                throw new InvalidNamespaceException(y77.C6722g.f35791b.mo49607a());
            } else if (!p16.mo46588A(m, a)) {
                throw new InvalidNamespaceException(y77.C6723h.f35792b.mo49607a());
            } else if (!p16.mo46603w(m)) {
                throw new InvalidNamespaceException(new y77.C6724i("Accounts must not be empty").mo49607a());
            } else if (!p16.mo46601u(m)) {
                throw new InvalidNamespaceException(new y77.C6724i("Accounts must be CAIP-10 compliant").mo49607a());
            } else if (!p16.mo46602v(m)) {
                throw new InvalidNamespaceException(new y77.C6724i("Accounts must be defined in matching namespace").mo49607a());
            } else if (!p16.mo46604x(m, a)) {
                throw new InvalidNamespaceException(new y77.C6724i("All chains must have at least one account").mo49607a());
            } else if (!p16.mo46606z(m, a)) {
                throw new InvalidNamespaceException(y77.C6726k.f35794b.mo49607a());
            } else if (!p16.mo46605y(m, a)) {
                throw new InvalidNamespaceException(y77.C6725j.f35793b.mo49607a());
            } else if (p16.mo46592E(m)) {
                String g = this.f27659c.mo47358g();
                es6 c2 = this.f27659c.mo47354c(g, ty4.m52569c(str));
                CoreSignParams.ApprovalParams o = gq1.m44832o(sessionProposeParams, g);
                ny2 ny2 = new ny2(Tags.SESSION_PROPOSE_RESPONSE, new ky6(fq6.m44371c()), false, 4, (DefaultConstructorMarker) null);
                JsonRpcInteractorInterface.DefaultImpls.m42233f(this.f27657a, c2, (rc2) null, new SignEngine$approve$4(rc22), 2, (Object) null);
                JsonRpcInteractorInterface.DefaultImpls.m42231d(this.f27657a, rf7, o, ny2, (EnvelopeType) null, (qm4) null, new SignEngine$approve$5(rc22), 24, (Object) null);
                m42782C(this, map, rc2, pc2, rf7.mo47397a(), sessionProposeParams, c2, rf7.mo47400d());
            } else {
                throw new InvalidNamespaceException(new y77.C6724i("Extension accounts must not be empty").mo49607a());
            }
        } else {
            throw new CannotFindSessionProposalException("No session proposal for proposer publicKey: " + str2);
        }
    }

    /* renamed from: D */
    public final y23 mo41194D() {
        return e52.m57232x(e52.m57202C(e52.m57200A(this.f27657a.mo40293f(), this.f27663g.mo40494a()), new SignEngine$collectInternalErrors$1(this, (ns0<? super SignEngine$collectInternalErrors$1>) null)), bh7.m32535a());
    }

    /* renamed from: E */
    public final y23 mo41195E() {
        return e52.m57232x(e52.m57202C(new SignEngine$collectJsonRpcRequests$$inlined$filter$1(this.f27657a.mo40292e()), new SignEngine$collectJsonRpcRequests$2(this, (ns0<? super SignEngine$collectJsonRpcRequests$2>) null)), bh7.m32535a());
    }

    /* renamed from: F */
    public final y23 mo41196F() {
        return e52.m57232x(e52.m57202C(new SignEngine$collectJsonRpcResponses$$inlined$filter$1(this.f27657a.mo40297j()), new SignEngine$collectJsonRpcResponses$2(this, (ns0<? super SignEngine$collectJsonRpcResponses$2>) null)), bh7.m32535a());
    }

    /* renamed from: G */
    public final void mo41197G(String str, pc2<r37> pc2, rc2<? super Throwable, r37> rc2) {
        String str2 = str;
        pc2<r37> pc22 = pc2;
        rc2<? super Throwable, r37> rc22 = rc2;
        vx2.m53591g(str2, "topic");
        vx2.m53591g(pc22, "onSuccess");
        vx2.m53591g(rc22, "onFailure");
        if (this.f27660d.mo41519x(new es6(str2))) {
            w75.C6644a aVar = w75.C6644a.f35243a;
            SignRpc.SessionDelete sessionDelete = new SignRpc.SessionDelete(x67.m54246b(), (String) null, (String) null, new SignParams.DeleteParams(aVar.getCode(), aVar.getMessage()), 6, (DefaultConstructorMarker) null);
            this.f27660d.mo41508k(new es6(str2));
            JsonRpcInteractorInterface.DefaultImpls.m42234g(this.f27657a, new es6(str2), (pc2) null, (rc2) null, 6, (Object) null);
            ny2 ny2 = new ny2(Tags.SESSION_DELETE, new ky6(fq6.m44370b()), false, 4, (DefaultConstructorMarker) null);
            JsonRpcInteractorInterface.DefaultImpls.m42228a(this.f27657a, new es6(str2), ny2, sessionDelete, (EnvelopeType) null, (qm4) null, new SignEngine$disconnect$1(this, pc22), new SignEngine$disconnect$2(this, rc22), 24, (Object) null);
            return;
        }
        throw new CannotFindSequenceForTopic("Cannot find sequence for given topic: " + str2);
    }

    /* renamed from: H */
    public final xz5<bq1> mo41198H() {
        return this.f27670n;
    }

    /* renamed from: I */
    public final List<EngineDO.C5661d> mo41199I() {
        boolean z;
        List n = this.f27660d.mo41511n();
        ArrayList<cy5> arrayList = new ArrayList<>();
        for (Object next : n) {
            cy5 cy5 = (cy5) next;
            if (!cy5.mo41769n() || !UtilFunctionsKt.m43027g(cy5.mo41757d())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList<cy5> arrayList2 = new ArrayList<>(dk0.m43495u(arrayList, 10));
        for (cy5 cy52 : arrayList) {
            arrayList2.add(cy5.m43274b(cy52, (es6) null, (nx1) null, (String) null, (String) null, (String) null, (String) null, this.f27664h, (String) null, this.f27661e.mo40437c(cy52.mo41768m(), AppMetaDataType.PEER), (Map) null, (Map) null, false, 3775, (Object) null));
        }
        ArrayList arrayList3 = new ArrayList(dk0.m43495u(arrayList2, 10));
        for (cy5 d : arrayList2) {
            arrayList3.add(vx2.m53591g(d, "<this>"));
        }
        return arrayList3;
    }

    /* renamed from: J */
    public final void mo41200J(rf7 rf7) {
        JsonRpcInteractorInterface.DefaultImpls.m42232e(this.f27657a, rf7, new ny2(Tags.SESSION_PING_RESPONSE, new ky6(fq6.m44373e()), false, 4, (DefaultConstructorMarker) null), (EnvelopeType) null, (qm4) null, 12, (Object) null);
    }

    /* renamed from: K */
    public final void mo41201K(rf7 rf7, SignParams.DeleteParams deleteParams) {
        ny2 ny2 = new ny2(Tags.SESSION_DELETE_RESPONSE, new ky6(fq6.m44370b()), false, 4, (DefaultConstructorMarker) null);
        try {
            if (!this.f27660d.mo41519x(rf7.mo47400d())) {
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new n37.C6274b("SESSION", rf7.mo47400d().mo42395a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                return;
            }
            this.f27657a.mo40291d(rf7.mo47400d(), new SignEngine$onSessionDelete$1(this, rf7), new SignEngine$onSessionDelete$2(this));
            this.f27660d.mo41508k(rf7.mo47400d());
            y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$onSessionDelete$3(this, deleteParams, rf7, (ns0<? super SignEngine$onSessionDelete$3>) null), 3, (Object) null);
        } catch (Exception e) {
            JsonRpcInteractorInterface jsonRpcInteractorInterface = this.f27657a;
            String message = e.getMessage();
            es6 d = rf7.mo47400d();
            JsonRpcInteractorInterface.DefaultImpls.m42230c(jsonRpcInteractorInterface, rf7, new n37.C6273a("Cannot delete a session: " + message + ", topic: " + d), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
        }
    }

    /* renamed from: L */
    public final void mo41202L(rf7 rf7, SignParams.EventParams eventParams) {
        boolean z;
        boolean z2;
        ny2 ny2 = new ny2(Tags.SESSION_EVENT_RESPONSE, new ky6(fq6.m44371c()), false, 4, (DefaultConstructorMarker) null);
        try {
            p16 p16 = p16.f32536a;
            EngineDO.C5654a i = vx2.m53591g(eventParams, "<this>");
            boolean z3 = true;
            if (i.mo41270b().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (i.mo41271c().length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (i.mo41269a().length() != 0) {
                        z3 = false;
                    }
                    if (!z3) {
                        if (zt0.f36235a.mo49917b(i.mo41269a())) {
                            if (!this.f27660d.mo41519x(rf7.mo47400d())) {
                                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new n37.C6274b("SESSION", rf7.mo47400d().mo42395a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                                return;
                            }
                            cy5 q = this.f27660d.mo41514q(rf7.mo47400d());
                            if (!q.mo41770o()) {
                                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new cn4.C3961d.C3962a("SESSION"), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                                return;
                            } else if (!q.mo41769n()) {
                                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new n37.C6274b("SESSION", rf7.mo47400d().mo42395a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                                return;
                            } else {
                                SessionEventVO b = eventParams.mo41118b();
                                String a = eventParams.mo41117a();
                                String b2 = b.mo41163b();
                                Map a2 = p16.mo46597q(q.mo41758e());
                                if (a2.get(b2) != null) {
                                    try {
                                        Object obj = a2.get(b2);
                                        vx2.m53588d(obj);
                                        if (((List) obj).contains(a)) {
                                            JsonRpcInteractorInterface.DefaultImpls.m42232e(this.f27657a, rf7, ny2, (EnvelopeType) null, (qm4) null, 12, (Object) null);
                                            y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$onSessionEvent$3(this, eventParams, rf7, (ns0<? super SignEngine$onSessionEvent$3>) null), 3, (Object) null);
                                            return;
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        rf7 rf72 = rf7;
                                        JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new n37.C6273a("Cannot emit an event: " + e.getMessage() + ", topic: " + rf7.mo47400d()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                                    }
                                }
                                rf7 rf73 = rf7;
                                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, gq1.m44831n(y77.C6719d.f35789b), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                                return;
                            }
                        }
                    }
                }
            }
            JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, gq1.m44831n(y77.C6716a.f35786b), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
        } catch (Exception e2) {
            e = e2;
            JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new n37.C6273a("Cannot emit an event: " + e.getMessage() + ", topic: " + rf7.mo47400d()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
        }
    }

    /* renamed from: M */
    public final void mo41203M(rf7 rf7, SignParams.ExtendParams extendParams) {
        ny2 ny2 = new ny2(Tags.SESSION_EXTEND_RESPONSE, new ky6(fq6.m44370b()), false, 4, (DefaultConstructorMarker) null);
        try {
            if (!this.f27660d.mo41519x(rf7.mo47400d())) {
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new n37.C6274b("SESSION", rf7.mo47400d().mo42395a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                return;
            }
            cy5 q = this.f27660d.mo41514q(rf7.mo47400d());
            if (!q.mo41770o()) {
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new cn4.C3961d.C3963b("SESSION"), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                return;
            }
            long a = extendParams.mo41123a();
            p16 p16 = p16.f32536a;
            long a2 = q.mo41757d().mo46241a();
            long j = a - a2;
            long f = fq6.m44374f();
            if (a > a2) {
                if (j <= f) {
                    this.f27660d.mo41509l(rf7.mo47400d(), a);
                    JsonRpcInteractorInterface.DefaultImpls.m42232e(this.f27657a, rf7, ny2, (EnvelopeType) null, (qm4) null, 12, (Object) null);
                    y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$onSessionExtend$2(this, q, a, (ns0<? super SignEngine$onSessionExtend$2>) null), 3, (Object) null);
                    return;
                }
            }
            rf7 rf72 = rf7;
            JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf72, gq1.m44831n(y77.C6717b.f35787b), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
        } catch (Exception e) {
            JsonRpcInteractorInterface jsonRpcInteractorInterface = this.f27657a;
            String message = e.getMessage();
            es6 d = rf7.mo47400d();
            JsonRpcInteractorInterface.DefaultImpls.m42230c(jsonRpcInteractorInterface, rf7, new n37.C6273a("Cannot update a session: " + message + ", topic: " + d), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f A[Catch:{ Exception -> 0x00d6 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[Catch:{ Exception -> 0x00d6 }] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41204N(p000.sf7 r10, com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams.SessionProposeParams r11) {
        /*
            r9 = this;
            r0 = 0
            es6 r1 = r10.mo47757c()     // Catch:{ Exception -> 0x00d6 }
            com.walletconnect.android.pairing.handler.PairingControllerInterface r2 = r9.f27663g     // Catch:{ Exception -> 0x00d6 }
            ut0$c r3 = new ut0$c     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r4 = r1.mo42395a()     // Catch:{ Exception -> 0x00d6 }
            nx1 r5 = new nx1     // Catch:{ Exception -> 0x00d6 }
            long r6 = p000.fq6.m44372d()     // Catch:{ Exception -> 0x00d6 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00d6 }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x00d6 }
            r4 = 2
            com.walletconnect.android.pairing.handler.PairingControllerInterface.DefaultImpls.m42316b(r2, r3, r0, r4, r0)     // Catch:{ Exception -> 0x00d6 }
            com.walletconnect.android.pairing.handler.PairingControllerInterface r2 = r9.f27663g     // Catch:{ Exception -> 0x00d6 }
            ut0$a r3 = new ut0$a     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r5 = r1.mo42395a()     // Catch:{ Exception -> 0x00d6 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x00d6 }
            com.walletconnect.android.pairing.handler.PairingControllerInterface.DefaultImpls.m42315a(r2, r3, r0, r4, r0)     // Catch:{ Exception -> 0x00d6 }
            ll4 r2 = r9.f27662f     // Catch:{ Exception -> 0x00d6 }
            java.util.List r2 = r2.mo40454b()     // Catch:{ Exception -> 0x00d6 }
            boolean r3 = r2 instanceof java.util.Collection     // Catch:{ Exception -> 0x00d6 }
            if (r3 == 0) goto L_0x003c
            boolean r3 = r2.isEmpty()     // Catch:{ Exception -> 0x00d6 }
            if (r3 == 0) goto L_0x003c
            goto L_0x005c
        L_0x003c:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00d6 }
        L_0x0040:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00d6 }
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00d6 }
            tt0$d r3 = (p000.tt0.C6539d) r3     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r3 = r3.mo48184a()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r4 = r1.mo42395a()     // Catch:{ Exception -> 0x00d6 }
            boolean r3 = p000.vx2.m53586b(r3, r4)     // Catch:{ Exception -> 0x00d6 }
            if (r3 == 0) goto L_0x0040
            r2 = 1
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            if (r2 != 0) goto L_0x0060
            return
        L_0x0060:
            com.walletconnect.android.internal.common.JsonRpcResponse r10 = r10.mo47756b()     // Catch:{ Exception -> 0x00d6 }
            boolean r2 = r10 instanceof com.walletconnect.android.internal.common.JsonRpcResponse.C5515b     // Catch:{ Exception -> 0x00d6 }
            if (r2 == 0) goto L_0x00a4
            sk3 r1 = r9.f27665i     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r2 = "Session proposal approve received"
            r1.log(r2)     // Catch:{ Exception -> 0x00d6 }
            com.walletconnect.android.internal.common.model.SessionProposer r11 = r11.mo41129b()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r11 = r11.mo40336b()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r11 = p000.ty4.m52569c(r11)     // Catch:{ Exception -> 0x00d6 }
            com.walletconnect.android.internal.common.JsonRpcResponse$b r10 = (com.walletconnect.android.internal.common.JsonRpcResponse.C5515b) r10     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r10 = r10.mo40172b()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r1 = "null cannot be cast to non-null type com.walletconnect.android.internal.common.model.params.CoreSignParams.ApprovalParams"
            p000.vx2.m53589e(r10, r1)     // Catch:{ Exception -> 0x00d6 }
            com.walletconnect.android.internal.common.model.params.CoreSignParams$ApprovalParams r10 = (com.walletconnect.android.internal.common.model.params.CoreSignParams.ApprovalParams) r10     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r10 = r10.mo40367b()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r10 = p000.ty4.m52569c(r10)     // Catch:{ Exception -> 0x00d6 }
            ra3 r1 = r9.f27659c     // Catch:{ Exception -> 0x00d6 }
            es6 r3 = r1.mo47354c(r11, r10)     // Catch:{ Exception -> 0x00d6 }
            com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface r2 = r9.f27657a     // Catch:{ Exception -> 0x00d6 }
            r4 = 0
            com.walletconnect.sign.engine.domain.SignEngine$onSessionProposalResponse$2 r5 = new com.walletconnect.sign.engine.domain.SignEngine$onSessionProposalResponse$2     // Catch:{ Exception -> 0x00d6 }
            r5.<init>(r9)     // Catch:{ Exception -> 0x00d6 }
            r6 = 2
            r7 = 0
            com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface.DefaultImpls.m42233f(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00e7
        L_0x00a4:
            boolean r11 = r10 instanceof com.walletconnect.android.internal.common.JsonRpcResponse.JsonRpcError     // Catch:{ Exception -> 0x00d6 }
            if (r11 == 0) goto L_0x00e7
            sk3 r11 = r9.f27665i     // Catch:{ Exception -> 0x00d6 }
            r2 = r10
            com.walletconnect.android.internal.common.JsonRpcResponse$JsonRpcError r2 = (com.walletconnect.android.internal.common.JsonRpcResponse.JsonRpcError) r2     // Catch:{ Exception -> 0x00d6 }
            com.walletconnect.android.internal.common.JsonRpcResponse$a r2 = r2.mo40160a()     // Catch:{ Exception -> 0x00d6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d6 }
            r3.<init>()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r4 = "Session proposal reject received: "
            r3.append(r4)     // Catch:{ Exception -> 0x00d6 }
            r3.append(r2)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x00d6 }
            r11.log(r2)     // Catch:{ Exception -> 0x00d6 }
            hu0 r3 = p000.bh7.m32535a()     // Catch:{ Exception -> 0x00d6 }
            r4 = 0
            r5 = 0
            com.walletconnect.sign.engine.domain.SignEngine$onSessionProposalResponse$3 r6 = new com.walletconnect.sign.engine.domain.SignEngine$onSessionProposalResponse$3     // Catch:{ Exception -> 0x00d6 }
            r6.<init>(r9, r1, r10, r0)     // Catch:{ Exception -> 0x00d6 }
            r7 = 3
            r8 = 0
            p000.y23 unused = p000.d50.m56748b(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00e7
        L_0x00d6:
            r10 = move-exception
            hu0 r1 = p000.bh7.m32535a()
            com.walletconnect.sign.engine.domain.SignEngine$onSessionProposalResponse$4 r4 = new com.walletconnect.sign.engine.domain.SignEngine$onSessionProposalResponse$4
            r4.<init>(r9, r10, r0)
            r2 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            p000.y23 unused = p000.d50.m56748b(r1, r2, r3, r4, r5, r6)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.sign.engine.domain.SignEngine.mo41204N(sf7, com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams$SessionProposeParams):void");
    }

    /* renamed from: O */
    public final void mo41205O(rf7 rf7, SignParams.SessionProposeParams sessionProposeParams) {
        ny2 ny2 = new ny2(Tags.SESSION_PROPOSE_RESPONSE, new ky6(fq6.m44371c()), false, 4, (DefaultConstructorMarker) null);
        try {
            p16 p16 = p16.f32536a;
            Map<String, NamespaceVO.Proposal> a = sessionProposeParams.mo41128a();
            if (!p16.mo46594G(a)) {
                rf7 rf72 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf72, gq1.m44831n(y77.C6722g.f35791b), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!p16.mo46591D(a)) {
                rf7 rf73 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf73, gq1.m44831n(new y77.C6721f("Chains must not be empty")), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!p16.mo46589B(a)) {
                rf7 rf74 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf74, gq1.m44831n(new y77.C6721f("Chains must be CAIP-2 compliant")), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!p16.mo46590C(a)) {
                rf7 rf75 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf75, gq1.m44831n(new y77.C6721f("Chains must be defined in matching namespace")), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!p16.mo46593F(a)) {
                rf7 rf76 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf76, gq1.m44831n(new y77.C6721f("Extension chains must not be empty")), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else {
                this.f27671o.put(sessionProposeParams.mo41129b().mo40336b(), rf7);
                PairingControllerInterface.DefaultImpls.m42317c(this.f27663g, new ut0.C6579d(rf7.mo47400d().mo42395a(), ml4.m48364b(sessionProposeParams.mo41129b().mo40335a()), AppMetaDataType.PEER), (rc2) null, 2, (Object) null);
                y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$onSessionPropose$2(this, sessionProposeParams, rf7, (ns0<? super SignEngine$onSessionPropose$2>) null), 3, (Object) null);
            }
        } catch (Exception e) {
            JsonRpcInteractorInterface jsonRpcInteractorInterface = this.f27657a;
            String message = e.getMessage();
            es6 d = rf7.mo47400d();
            JsonRpcInteractorInterface.DefaultImpls.m42230c(jsonRpcInteractorInterface, rf7, new n37.C6273a("Cannot handle a session proposal: " + message + ", topic: " + d), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
        }
    }

    /* renamed from: P */
    public final void mo41206P(rf7 rf7, SignParams.SessionRequestParams sessionRequestParams) {
        boolean z;
        boolean z2;
        boolean z3;
        ny2 ny2 = new ny2(Tags.SESSION_REQUEST_RESPONSE, new ky6(fq6.m44371c()), false, 4, (DefaultConstructorMarker) null);
        try {
            p16 p16 = p16.f32536a;
            EngineDO.C5660c c = gq1.m44820c(sessionRequestParams, rf7.mo47400d());
            boolean z4 = true;
            if (c.mo41303c().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (c.mo41302b().length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (c.mo41301a().length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        if (c.mo41304d().length() != 0) {
                            z4 = false;
                        }
                        if (!z4) {
                            if (zt0.f36235a.mo49917b(c.mo41301a())) {
                                if (!this.f27660d.mo41519x(rf7.mo47400d())) {
                                    JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new n37.C6274b("SESSION", rf7.mo47400d().mo42395a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                                    return;
                                }
                                cy5 q = this.f27660d.mo41514q(rf7.mo47400d());
                                Pair<A, B> a = wy6.m54142a(q.mo41758e(), this.f27661e.mo40437c(q.mo41768m(), AppMetaDataType.PEER));
                                AppMetaData appMetaData = (AppMetaData) a.component2();
                                String a2 = sessionRequestParams.mo41136b().mo41171a();
                                String a3 = sessionRequestParams.mo41135a();
                                Map b = p16.mo46598r((Map) a.component1());
                                if (b.get(a2) != null) {
                                    Object obj = b.get(a2);
                                    vx2.m53588d(obj);
                                    if (((List) obj).contains(a3)) {
                                        y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$onSessionRequest$4(this, sessionRequestParams, rf7, appMetaData, (ns0<? super SignEngine$onSessionRequest$4>) null), 3, (Object) null);
                                        return;
                                    }
                                }
                                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, gq1.m44831n(y77.C6720e.f35790b), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                                return;
                            }
                        }
                    }
                }
            }
            JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, gq1.m44831n(y77.C6718c.f35788b), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
        } catch (Exception e) {
            JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new n37.C6273a("Cannot handle a session request: " + e.getMessage() + ", topic: " + rf7.mo47400d()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
        }
    }

    /* renamed from: Q */
    public final void mo41207Q(sf7 sf7, SignParams.SessionRequestParams sessionRequestParams) {
        EngineDO.JsonRpcResponse a;
        try {
            JsonRpcResponse b = sf7.mo47756b();
            if (b instanceof JsonRpcResponse.C5515b) {
                JsonRpcResponse b2 = sf7.mo47756b();
                vx2.m53589e(b2, "null cannot be cast to non-null type com.walletconnect.android.internal.common.JsonRpcResponse.JsonRpcResult");
                a = vx2.m53591g((JsonRpcResponse.C5515b) b2, "<this>");
            } else if (b instanceof JsonRpcResponse.JsonRpcError) {
                JsonRpcResponse b3 = sf7.mo47756b();
                vx2.m53589e(b3, "null cannot be cast to non-null type com.walletconnect.android.internal.common.JsonRpcResponse.JsonRpcError");
                a = vx2.m53591g((JsonRpcResponse.JsonRpcError) b3, "<this>");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            EngineDO.JsonRpcResponse jsonRpcResponse = a;
            String a2 = sessionRequestParams.mo41136b().mo41171a();
            y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$onSessionRequestResponse$1(this, sf7, sessionRequestParams, a2, jsonRpcResponse, (ns0<? super SignEngine$onSessionRequestResponse$1>) null), 3, (Object) null);
        } catch (Exception e) {
            y23 unused2 = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$onSessionRequestResponse$2(this, e, (ns0<? super SignEngine$onSessionRequestResponse$2>) null), 3, (Object) null);
        }
    }

    /* renamed from: R */
    public final void mo41208R(rf7 rf7, SignParams.SessionSettleParams sessionSettleParams) {
        es6 d = rf7.mo47400d();
        Tags tags = Tags.SESSION_SETTLE;
        ny2 ny2 = new ny2(tags, new ky6(fq6.m44371c()), false, 4, (DefaultConstructorMarker) null);
        try {
            String d2 = this.f27659c.mo47355d(d);
            AppMetaData a = sessionSettleParams.mo41141a().mo41034a();
            rf7 rf72 = this.f27671o.get(d2);
            if (rf72 != null) {
                if (!(rf72.mo47399c() instanceof SignParams.SessionProposeParams)) {
                    JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new cn4.C3954b.C3955a("No proposal for Session Namespace"), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                    return;
                }
                rg0 c = rf72.mo47399c();
                vx2.m53589e(c, "null cannot be cast to non-null type com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams.SessionProposeParams");
                Map<String, NamespaceVO.Proposal> a2 = ((SignParams.SessionProposeParams) c).mo41128a();
                p16 p16 = p16.f32536a;
                Map<String, NamespaceVO.Session> c2 = sessionSettleParams.mo41143c();
                if (!p16.mo46595H(c2)) {
                    rf7 rf73 = rf7;
                    JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf73, gq1.m44831n(y77.C6722g.f35791b), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                } else if (!p16.mo46588A(c2, a2)) {
                    rf7 rf74 = rf7;
                    JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf74, gq1.m44831n(y77.C6723h.f35792b), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                } else if (!p16.mo46603w(c2)) {
                    rf7 rf75 = rf7;
                    JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf75, gq1.m44831n(new y77.C6724i("Accounts must not be empty")), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                } else if (!p16.mo46601u(c2)) {
                    rf7 rf76 = rf7;
                    JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf76, gq1.m44831n(new y77.C6724i("Accounts must be CAIP-10 compliant")), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                } else if (!p16.mo46602v(c2)) {
                    rf7 rf77 = rf7;
                    JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf77, gq1.m44831n(new y77.C6724i("Accounts must be defined in matching namespace")), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                } else if (!p16.mo46604x(c2, a2)) {
                    rf7 rf78 = rf7;
                    JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf78, gq1.m44831n(new y77.C6724i("All chains must have at least one account")), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                } else if (!p16.mo46606z(c2, a2)) {
                    rf7 rf79 = rf7;
                    JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf79, gq1.m44831n(y77.C6726k.f35794b), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                } else if (!p16.mo46605y(c2, a2)) {
                    rf7 rf710 = rf7;
                    JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf710, gq1.m44831n(y77.C6725j.f35793b), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                } else if (!p16.mo46592E(c2)) {
                    rf7 rf711 = rf7;
                    JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf711, gq1.m44831n(new y77.C6724i("Extension accounts must not be empty")), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                } else {
                    rf7 rf712 = (rf7) C6177b.m47362j(this.f27671o, d2);
                    try {
                        cy5 a3 = cy5.f27978o.mo41772a(d, sessionSettleParams, d2, this.f27664h, a2);
                        this.f27671o.remove(d2);
                        this.f27660d.mo41518w(a3, rf7.mo47400d(), rf7.mo47397a());
                        PairingControllerInterface pairingControllerInterface = this.f27663g;
                        String a4 = rf72.mo47400d().mo42395a();
                        tt0.C6536a b = ml4.m48364b(a);
                        AppMetaDataType appMetaDataType = AppMetaDataType.PEER;
                        PairingControllerInterface.DefaultImpls.m42317c(pairingControllerInterface, new ut0.C6579d(a4, b, appMetaDataType), (rc2) null, 2, (Object) null);
                        this.f27661e.mo40436b(d, a, appMetaDataType);
                        rf7 rf713 = rf7;
                        JsonRpcInteractorInterface.DefaultImpls.m42232e(this.f27657a, rf713, new ny2(tags, new ky6(fq6.m44371c()), false, 4, (DefaultConstructorMarker) null), (EnvelopeType) null, (qm4) null, 12, (Object) null);
                        y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$onSessionSettle$2(this, a3, (ns0<? super SignEngine$onSessionSettle$2>) null), 3, (Object) null);
                    } catch (SQLiteException e) {
                        this.f27671o.put(d2, rf712);
                        this.f27660d.mo41508k(d);
                        JsonRpcInteractorInterface jsonRpcInteractorInterface = this.f27657a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = vx2.m53591g(cb6.f21669a, "<this>");
                        }
                        JsonRpcInteractorInterface.DefaultImpls.m42230c(jsonRpcInteractorInterface, rf7, new cn4.C3954b.C3955a(message), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                    }
                }
            }
        } catch (Exception e2) {
            JsonRpcInteractorInterface jsonRpcInteractorInterface2 = this.f27657a;
            String message2 = e2.getMessage();
            if (message2 == null) {
                message2 = vx2.m53591g(cb6.f21669a, "<this>");
            }
            JsonRpcInteractorInterface.DefaultImpls.m42230c(jsonRpcInteractorInterface2, rf7, new cn4.C3954b.C3955a(message2), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
        }
    }

    /* renamed from: S */
    public final void mo41209S(sf7 sf7) {
        try {
            es6 c = sf7.mo47757c();
            if (this.f27660d.mo41519x(c)) {
                cy5 q = this.f27660d.mo41514q(c);
                cy5 b = cy5.m43274b(q, (es6) null, (nx1) null, (String) null, (String) null, (String) null, (String) null, q.mo41766k(), (String) null, this.f27661e.mo40437c(q.mo41768m(), AppMetaDataType.PEER), (Map) null, (Map) null, false, 3775, (Object) null);
                JsonRpcResponse b2 = sf7.mo47756b();
                if (b2 instanceof JsonRpcResponse.C5515b) {
                    this.f27665i.log("Session settle success received");
                    this.f27660d.mo41506i(c);
                    y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$onSessionSettleResponse$1(this, b, (ns0<? super SignEngine$onSessionSettleResponse$1>) null), 3, (Object) null);
                } else if (b2 instanceof JsonRpcResponse.JsonRpcError) {
                    sk3 sk3 = this.f27665i;
                    JsonRpcResponse b3 = sf7.mo47756b();
                    vx2.m53589e(b3, "null cannot be cast to non-null type com.walletconnect.android.internal.common.JsonRpcResponse.JsonRpcError");
                    String b4 = ((JsonRpcResponse.JsonRpcError) b3).mo40161b();
                    sk3.error("Peer failed to settle session: " + b4);
                    JsonRpcInteractorInterface.DefaultImpls.m42234g(this.f27657a, c, new SignEngine$onSessionSettleResponse$2(this, c), (rc2) null, 4, (Object) null);
                }
            }
        } catch (Exception e) {
            y23 unused2 = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$onSessionSettleResponse$3(this, e, (ns0<? super SignEngine$onSessionSettleResponse$3>) null), 3, (Object) null);
        }
    }

    /* renamed from: T */
    public final void mo41210T(rf7 rf7, SignParams.UpdateNamespacesParams updateNamespacesParams) {
        ny2 ny2 = new ny2(Tags.SESSION_UPDATE_RESPONSE, new ky6(fq6.m44370b()), false, 4, (DefaultConstructorMarker) null);
        try {
            if (!this.f27660d.mo41519x(rf7.mo47400d())) {
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new n37.C6274b("SESSION", rf7.mo47400d().mo42395a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                return;
            }
            cy5 q = this.f27660d.mo41514q(rf7.mo47400d());
            if (!q.mo41770o()) {
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new cn4.C3961d.C3965d("SESSION"), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
                return;
            }
            p16 p16 = p16.f32536a;
            Map<String, NamespaceVO.Session> a = updateNamespacesParams.mo41149a();
            Map<String, NamespaceVO.Proposal> h = q.mo41762h();
            if (!p16.mo46595H(a)) {
                rf7 rf72 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf72, new cn4.C3956c.C3960d(y77.C6722g.f35791b.mo49607a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!p16.mo46588A(a, h)) {
                rf7 rf73 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf73, new cn4.C3956c.C3960d(y77.C6723h.f35792b.mo49607a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!p16.mo46603w(a)) {
                rf7 rf74 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf74, new cn4.C3956c.C3960d(new y77.C6724i("Accounts must not be empty").mo49607a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!p16.mo46601u(a)) {
                rf7 rf75 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf75, new cn4.C3956c.C3960d(new y77.C6724i("Accounts must be CAIP-10 compliant").mo49607a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!p16.mo46602v(a)) {
                rf7 rf76 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf76, new cn4.C3956c.C3960d(new y77.C6724i("Accounts must be defined in matching namespace").mo49607a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!p16.mo46604x(a, h)) {
                rf7 rf77 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf77, new cn4.C3956c.C3960d(new y77.C6724i("All chains must have at least one account").mo49607a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!p16.mo46606z(a, h)) {
                rf7 rf78 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf78, new cn4.C3956c.C3960d(y77.C6726k.f35794b.mo49607a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!p16.mo46605y(a, h)) {
                rf7 rf79 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf79, new cn4.C3956c.C3960d(y77.C6725j.f35793b.mo49607a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!p16.mo46592E(a)) {
                rf7 rf710 = rf7;
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf710, new cn4.C3956c.C3960d(new y77.C6724i("Extension accounts must not be empty").mo49607a()), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else if (!this.f27660d.mo41521z(q.mo41768m().mo42395a(), UtilFunctionsKt.m43023c(rf7.mo47397a()))) {
                JsonRpcInteractorInterface.DefaultImpls.m42230c(this.f27657a, rf7, new cn4.C3956c.C3960d("Update Namespace Request ID too old"), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
            } else {
                this.f27660d.mo41507j(q.mo41768m().mo42395a(), updateNamespacesParams.mo41149a(), rf7.mo47397a(), new SignEngine$onSessionUpdate$2(this, rf7, ny2, updateNamespacesParams), new SignEngine$onSessionUpdate$3(this, rf7, ny2));
            }
        } catch (Exception e) {
            JsonRpcInteractorInterface jsonRpcInteractorInterface = this.f27657a;
            String message = e.getMessage();
            es6 d = rf7.mo47400d();
            JsonRpcInteractorInterface.DefaultImpls.m42230c(jsonRpcInteractorInterface, rf7, new n37.C6273a("Cannot update a session: " + message + ", topic: " + d), ny2, (EnvelopeType) null, (qm4) null, (rc2) null, (rc2) null, 120, (Object) null);
        }
    }

    /* renamed from: U */
    public final void mo41211U(sf7 sf7) {
        try {
            es6 c = sf7.mo47757c();
            if (this.f27660d.mo41519x(c)) {
                cy5 q = this.f27660d.mo41514q(c);
                if (this.f27660d.mo41520y(q.mo41768m().mo42395a(), UtilFunctionsKt.m43023c(sf7.mo47756b().getId()))) {
                    JsonRpcResponse b = sf7.mo47756b();
                    if (b instanceof JsonRpcResponse.C5515b) {
                        this.f27665i.log("Session update namespaces response received");
                        long id = sf7.mo47756b().getId();
                        this.f27660d.mo41507j(q.mo41768m().mo42395a(), this.f27660d.mo41515r(id), id, new SignEngine$onSessionUpdateResponse$1(this, id, q), new SignEngine$onSessionUpdateResponse$2(this));
                    } else if (b instanceof JsonRpcResponse.JsonRpcError) {
                        sk3 sk3 = this.f27665i;
                        JsonRpcResponse.C5514a a = ((JsonRpcResponse.JsonRpcError) b).mo40160a();
                        sk3.error("Peer failed to update session namespaces: " + a);
                        y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$onSessionUpdateResponse$3(this, b, (ns0<? super SignEngine$onSessionUpdateResponse$3>) null), 3, (Object) null);
                    }
                }
            }
        } catch (Exception e) {
            y23 unused2 = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$onSessionUpdateResponse$4(this, e, (ns0<? super SignEngine$onSessionUpdateResponse$4>) null), 3, (Object) null);
        }
    }

    /* renamed from: V */
    public final void mo41212V(String str, JsonRpcResponse jsonRpcResponse, pc2<r37> pc2, rc2<? super Throwable, r37> rc2) {
        vx2.m53591g(str, "topic");
        vx2.m53591g(jsonRpcResponse, "jsonRpcResponse");
        vx2.m53591g(pc2, "onSuccess");
        vx2.m53591g(rc2, "onFailure");
        if (this.f27660d.mo41519x(new es6(str))) {
            JsonRpcInteractorInterface.DefaultImpls.m42229b(this.f27657a, new es6(str), new ny2(Tags.SESSION_REQUEST_RESPONSE, new ky6(fq6.m44371c()), false, 4, (DefaultConstructorMarker) null), jsonRpcResponse, new SignEngine$respondSessionRequest$1(this, pc2), new SignEngine$respondSessionRequest$2(this, rc2), (qm4) null, (EnvelopeType) null, 96, (Object) null);
            return;
        }
        throw new CannotFindSequenceForTopic("Cannot find sequence for given topic: " + str);
    }

    /* renamed from: W */
    public final void mo41213W() {
        try {
            List n = this.f27660d.mo41511n();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object next : n) {
                if (!UtilFunctionsKt.m43027g(((cy5) next).mo41757d())) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List<cy5> list = (List) pair.component1();
            List<cy5> list2 = (List) pair.component2();
            ArrayList<es6> arrayList3 = new ArrayList<>(dk0.m43495u(list, 10));
            for (cy5 m : list) {
                arrayList3.add(m.mo41768m());
            }
            for (es6 es6 : arrayList3) {
                JsonRpcInteractorInterface.DefaultImpls.m42234g(this.f27657a, es6, new SignEngine$resubscribeToSession$3$1(this, es6), (rc2) null, 4, (Object) null);
            }
            for (cy5 m2 : list2) {
                JsonRpcInteractorInterface.DefaultImpls.m42233f(this.f27657a, m2.mo41768m(), (rc2) null, new SignEngine$resubscribeToSession$4$1(this), 2, (Object) null);
            }
        } catch (Exception e) {
            y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$resubscribeToSession$5(this, e, (ns0<? super SignEngine$resubscribeToSession$5>) null), 3, (Object) null);
        }
    }

    /* renamed from: X */
    public final void mo41214X() {
        e52.m57232x(e52.m57202C(new SignEngine$setup$$inlined$filter$1(e52.m57202C(this.f27657a.mo40288a(), new SignEngine$setup$1(this, (ns0<? super SignEngine$setup$1>) null))), new SignEngine$setup$3(this, (ns0<? super SignEngine$setup$3>) null)), bh7.m32535a());
    }

    /* renamed from: Y */
    public final void mo41215Y() {
        try {
            this.f27660d.mo41504E(new SignEngine$setupSequenceExpiration$1(this));
            e52.m57232x(e52.m57202C(this.f27663g.mo40498e(), new SignEngine$setupSequenceExpiration$2(this, (ns0<? super SignEngine$setupSequenceExpiration$2>) null)), bh7.m32535a());
        } catch (Exception e) {
            y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new SignEngine$setupSequenceExpiration$3(this, e, (ns0<? super SignEngine$setupSequenceExpiration$3>) null), 3, (Object) null);
        }
    }
}
