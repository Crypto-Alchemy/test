package p000;

import com.walletconnect.android.internal.common.model.AppMetaData;
import com.walletconnect.android.internal.common.model.RelayProtocolOptions;
import com.walletconnect.android.internal.common.model.params.CoreSignParams;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.SessionParticipantVO;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams;
import com.walletconnect.sign.engine.model.EngineDO;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p000.cn4;
import p000.y77;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0000\u001a\f\u0010\u001a\u001a\u00020\u0019*\u00020\u0012H\u0000\u001a0\u0010$\u001a\u00020#*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0000\u001a$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020&0\u001f*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020%0\u001fH\u0000\u001a$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020(0\u001fH\u0000\u001a$\u0010*\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020(0\u001f*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0000\u001a\f\u0010-\u001a\u00020,*\u00020+H\u0000\u001a\f\u00100\u001a\u00020/*\u00020.H\u0000\u001a!\u00104\u001a\u000203*\u00020\u00002\u0006\u00102\u001a\u000201H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001a\u0014\u00107\u001a\u000206*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\f\u00109\u001a\u000208*\u00020\u000fH\u0000\u001a\f\u0010<\u001a\u00020;*\u00020:H\u0000\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006="}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionProposeParams;", "Les6;", "topic", "Lcom/walletconnect/sign/engine/model/EngineDO$j;", "g", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionRequestParams;", "Lrf7;", "request", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "peerAppMetaData", "Lcom/walletconnect/sign/engine/model/EngineDO$l;", "h", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$DeleteParams;", "Lcom/walletconnect/sign/engine/model/EngineDO$f;", "e", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$EventParams;", "Lcom/walletconnect/sign/engine/model/EngineDO$g;", "f", "Lcy5;", "Lcom/walletconnect/sign/engine/model/EngineDO$d;", "d", "Lnx1;", "expiryVO", "Lcom/walletconnect/sign/engine/model/EngineDO$h;", "j", "Lcom/walletconnect/sign/engine/model/EngineDO$e;", "p", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/SessionParticipantVO;", "selfParticipant", "", "sessionExpiry", "", "", "Lcom/walletconnect/sign/engine/model/EngineDO$b$b;", "namespaces", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionSettleParams;", "q", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Proposal;", "Lcom/walletconnect/sign/engine/model/EngineDO$b$a;", "k", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session;", "l", "m", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$b;", "Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse$JsonRpcResult;", "b", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$JsonRpcError;", "Lcom/walletconnect/sign/engine/model/EngineDO$JsonRpcResponse$JsonRpcError;", "a", "Lty4;", "selfPublicKey", "Lcom/walletconnect/android/internal/common/model/params/CoreSignParams$ApprovalParams;", "o", "(Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionProposeParams;Ljava/lang/String;)Lcom/walletconnect/android/internal/common/model/params/CoreSignParams$ApprovalParams;", "Lcom/walletconnect/sign/engine/model/EngineDO$c;", "c", "Lcom/walletconnect/sign/engine/model/EngineDO$a;", "i", "Ly77;", "Lcn4;", "n", "sdk_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: gq1 */
/* compiled from: EngineMapper.kt */
public final /* synthetic */ class gq1 {
    /* renamed from: c */
    public static final /* synthetic */ EngineDO.C5660c m44820c(SignParams.SessionRequestParams sessionRequestParams, es6 es6) {
        vx2.m53591g(sessionRequestParams, "<this>");
        vx2.m53591g(es6, "topic");
        return new EngineDO.C5660c(es6.mo42395a(), sessionRequestParams.mo41136b().mo41171a(), sessionRequestParams.mo41136b().mo41172b(), sessionRequestParams.mo41135a());
    }

    /* renamed from: e */
    public static final /* synthetic */ EngineDO.C5663f m44822e(SignParams.DeleteParams deleteParams, es6 es6) {
        vx2.m53591g(deleteParams, "<this>");
        vx2.m53591g(es6, "topic");
        return new EngineDO.C5663f(es6.mo42395a(), deleteParams.mo41116b());
    }

    /* renamed from: f */
    public static final /* synthetic */ EngineDO.C5664g m44823f(SignParams.EventParams eventParams, es6 es6) {
        vx2.m53591g(eventParams, "<this>");
        vx2.m53591g(es6, "topic");
        return new EngineDO.C5664g(es6.mo42395a(), eventParams.mo41118b().mo41163b(), eventParams.mo41118b().mo41162a().toString(), eventParams.mo41117a());
    }

    /* renamed from: g */
    public static final /* synthetic */ EngineDO.C5667j m44824g(SignParams.SessionProposeParams sessionProposeParams, es6 es6) {
        vx2.m53591g(sessionProposeParams, "<this>");
        vx2.m53591g(es6, "topic");
        String a = es6.mo42395a();
        String c = sessionProposeParams.mo41129b().mo40335a().mo40311c();
        String a2 = sessionProposeParams.mo41129b().mo40335a().mo40309a();
        String e = sessionProposeParams.mo41129b().mo40335a().mo40314e();
        List<String> b = sessionProposeParams.mo41129b().mo40335a().mo40310b();
        ArrayList arrayList = new ArrayList(dk0.m43495u(b, 10));
        for (String uri : b) {
            arrayList.add(new URI(uri));
        }
        return new EngineDO.C5667j(a, c, a2, e, arrayList, m44828k(sessionProposeParams.mo41128a()), sessionProposeParams.mo41129b().mo40336b(), ((RelayProtocolOptions) CollectionsKt___CollectionsKt.m47329Z(sessionProposeParams.mo41130c())).mo40328b(), ((RelayProtocolOptions) CollectionsKt___CollectionsKt.m47329Z(sessionProposeParams.mo41130c())).mo40327a());
    }

    /* renamed from: h */
    public static final /* synthetic */ EngineDO.C5669l m44825h(SignParams.SessionRequestParams sessionRequestParams, rf7 rf7, AppMetaData appMetaData) {
        vx2.m53591g(sessionRequestParams, "<this>");
        vx2.m53591g(rf7, "request");
        return new EngineDO.C5669l(rf7.mo47400d().mo42395a(), sessionRequestParams.mo41135a(), appMetaData, new EngineDO.C5669l.C5670a(rf7.mo47397a(), sessionRequestParams.mo41136b().mo41171a(), sessionRequestParams.mo41136b().mo41172b()));
    }

    /* renamed from: j */
    public static final /* synthetic */ EngineDO.C5665h m44827j(cy5 cy5, nx1 nx1) {
        vx2.m53591g(cy5, "<this>");
        vx2.m53591g(nx1, "expiryVO");
        return new EngineDO.C5665h(cy5.mo41768m(), nx1, m44829l(cy5.mo41758e()), cy5.mo41766k());
    }

    /* renamed from: k */
    public static final /* synthetic */ Map m44828k(Map map) {
        ArrayList arrayList;
        vx2.m53591g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(ao3.m31893e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            NamespaceVO.Proposal proposal = (NamespaceVO.Proposal) entry.getValue();
            List<String> e = proposal.mo40989e();
            List<String> h = proposal.mo40993h();
            List<String> f = proposal.mo40991f();
            List<NamespaceVO.Proposal.Extension> g = proposal.mo40992g();
            if (g != null) {
                arrayList = new ArrayList(dk0.m43495u(g, 10));
                for (NamespaceVO.Proposal.Extension extension : g) {
                    arrayList.add(new EngineDO.C5655b.C5656a.C5657a(extension.mo40996a(), extension.mo40998c(), extension.mo40997b()));
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put(key, new EngineDO.C5655b.C5656a(e, h, f, arrayList));
        }
        return linkedHashMap;
    }

    /* renamed from: l */
    public static final /* synthetic */ Map m44829l(Map map) {
        ArrayList arrayList;
        vx2.m53591g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(ao3.m31893e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            NamespaceVO.Session session = (NamespaceVO.Session) entry.getValue();
            List<String> e = session.mo41008e();
            List<String> h = session.mo41012h();
            List<String> f = session.mo41010f();
            List<NamespaceVO.Session.Extension> g = session.mo41011g();
            if (g != null) {
                arrayList = new ArrayList(dk0.m43495u(g, 10));
                for (NamespaceVO.Session.Extension extension : g) {
                    arrayList.add(new EngineDO.C5655b.C5658b.C5659a(extension.mo41015a(), extension.mo41017c(), extension.mo41016b()));
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put(key, new EngineDO.C5655b.C5658b(e, h, f, arrayList));
        }
        return linkedHashMap;
    }

    /* renamed from: m */
    public static final /* synthetic */ Map m44830m(Map map) {
        ArrayList arrayList;
        vx2.m53591g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(ao3.m31893e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            EngineDO.C5655b.C5658b bVar = (EngineDO.C5655b.C5658b) entry.getValue();
            List<String> a = bVar.mo41288a();
            List<String> d = bVar.mo41291d();
            List<String> b = bVar.mo41289b();
            List<EngineDO.C5655b.C5658b.C5659a> c = bVar.mo41290c();
            if (c != null) {
                arrayList = new ArrayList(dk0.m43495u(c, 10));
                for (EngineDO.C5655b.C5658b.C5659a aVar : c) {
                    arrayList.add(new NamespaceVO.Session.Extension(aVar.mo41295a(), aVar.mo41297c(), aVar.mo41296b()));
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put(key, new NamespaceVO.Session(a, d, b, arrayList));
        }
        return linkedHashMap;
    }

    /* renamed from: n */
    public static final /* synthetic */ cn4 m44831n(y77 y77) {
        vx2.m53591g(y77, "<this>");
        if (y77 instanceof y77.C6722g) {
            return new cn4.C3947a.C3949b(y77.mo49607a());
        }
        if (y77 instanceof y77.C6721f) {
            return new cn4.C3947a.C3948a(y77.mo49607a());
        }
        if (y77 instanceof y77.C6716a) {
            return new cn4.C3956c.C3957a(y77.mo49607a());
        }
        if (y77 instanceof y77.C6717b) {
            return new cn4.C3956c.C3958b(y77.mo49607a());
        }
        if (y77 instanceof y77.C6718c) {
            return new cn4.C3956c.C3959c(y77.mo49607a());
        }
        if (y77 instanceof y77.C6719d) {
            return new cn4.C3961d.C3962a(y77.mo49607a());
        }
        if (y77 instanceof y77.C6720e) {
            return new cn4.C3961d.C3964c(y77.mo49607a());
        }
        if (y77 instanceof y77.C6723h) {
            return new cn4.C3947a.C3950c(y77.mo49607a());
        }
        if (y77 instanceof y77.C6725j) {
            return new cn4.C3947a.C3952e(y77.mo49607a());
        }
        if (y77 instanceof y77.C6726k) {
            return new cn4.C3947a.C3953f(y77.mo49607a());
        }
        if (y77 instanceof y77.C6724i) {
            return new cn4.C3947a.C3951d(y77.mo49607a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: o */
    public static final /* synthetic */ CoreSignParams.ApprovalParams m44832o(SignParams.SessionProposeParams sessionProposeParams, String str) {
        vx2.m53591g(sessionProposeParams, "$this$toSessionApproveParams");
        vx2.m53591g(str, "selfPublicKey");
        return new CoreSignParams.ApprovalParams(new RelayProtocolOptions(((RelayProtocolOptions) CollectionsKt___CollectionsKt.m47329Z(sessionProposeParams.mo41130c())).mo40328b(), ((RelayProtocolOptions) CollectionsKt___CollectionsKt.m47329Z(sessionProposeParams.mo41130c())).mo40327a()), str);
    }

    /* renamed from: p */
    public static final /* synthetic */ EngineDO.C5662e m44833p(cy5 cy5) {
        vx2.m53591g(cy5, "<this>");
        String a = cy5.mo41768m().mo42395a();
        AppMetaData f = cy5.mo41760f();
        Map<String, NamespaceVO.Session> e = cy5.mo41758e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, NamespaceVO.Session> value : e.entrySet()) {
            hk0.m45275z(arrayList, ((NamespaceVO.Session) value.getValue()).mo41008e());
        }
        return new EngineDO.C5662e(a, f, arrayList, m44829l(cy5.mo41758e()));
    }

    /* renamed from: q */
    public static final /* synthetic */ SignParams.SessionSettleParams m44834q(SignParams.SessionProposeParams sessionProposeParams, SessionParticipantVO sessionParticipantVO, long j, Map map) {
        vx2.m53591g(sessionProposeParams, "<this>");
        vx2.m53591g(sessionParticipantVO, "selfParticipant");
        vx2.m53591g(map, "namespaces");
        return new SignParams.SessionSettleParams(new RelayProtocolOptions(((RelayProtocolOptions) CollectionsKt___CollectionsKt.m47329Z(sessionProposeParams.mo41130c())).mo40328b(), ((RelayProtocolOptions) CollectionsKt___CollectionsKt.m47329Z(sessionProposeParams.mo41130c())).mo40327a()), sessionParticipantVO, m44830m(map), j);
    }
}
