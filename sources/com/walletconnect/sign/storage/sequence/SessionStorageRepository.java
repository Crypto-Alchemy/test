package com.walletconnect.sign.storage.sequence;

import android.database.sqlite.SQLiteException;
import com.walletconnect.android.internal.common.model.AppMetaData;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import com.walletconnect.utils.UtilFunctionsKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.nt6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T¢\u0006\u0004\b`\u0010aJ,\u0010\n\u001a\u00020\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J$\u0010\f\u001a\u00020\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0002JV\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0014\u001a\u00020\u0006H\u0002JN\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040$2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030 H\u0002J2\u0010'\u001a\u00020&2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030 H\u0002J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0 J\u000e\u0010)\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010*\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030 2\u0006\u0010+\u001a\u00020\u000eJ\u001e\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010/\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u00101\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u0006J\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u0006JF\u00106\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u00103\u001a\u00020\u00062\f\u00104\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\f\u00105\u001a\b\u0012\u0004\u0012\u00020\t0\u0010J\u0016\u00108\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0006J\u0016\u00109\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0006J\u000e\u0010:\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010;\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010?\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR.\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0X8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006b"}, mo44877d2 = {"Lcom/walletconnect/sign/storage/sequence/SessionStorageRepository;", "", "", "", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session;", "namespaces", "", "sessionId", "requestId", "Lr37;", "s", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Proposal;", "u", "expiry", "Les6;", "topic", "Lkotlin/Function0;", "deleteSequence", "", "F", "id", "relay_protocol", "relay_data", "controller_key", "self_participant", "peer_participant", "is_acknowledged", "Lcy5;", "A", "o", "p", "key", "", "accounts", "methods", "events", "Lkotlin/Pair;", "C", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session$Extension;", "B", "n", "x", "q", "pairingTopic", "m", "session", "w", "i", "expiryInSeconds", "l", "r", "requestID", "onSuccess", "onFailure", "j", "timestamp", "z", "y", "D", "k", "Lpx5;", "a", "Lpx5;", "sessionDaoQueries", "Lb34;", "b", "Lb34;", "namespaceDaoQueries", "Lc34;", "c", "Lc34;", "extensionsDaoQueries", "Lrx4;", "d", "Lrx4;", "proposalNamespaceDaoQueries", "Lsx4;", "e", "Lsx4;", "proposalExtensionsDaoQueries", "Ltm6;", "f", "Ltm6;", "tempNamespaceDaoQueries", "Lum6;", "g", "Lum6;", "tempExtensionsDaoQueries", "Lkotlin/Function1;", "h", "Lrc2;", "getOnSessionExpired", "()Lrc2;", "E", "(Lrc2;)V", "onSessionExpired", "<init>", "(Lpx5;Lb34;Lc34;Lrx4;Lsx4;Ltm6;Lum6;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SessionStorageRepository.kt */
public final class SessionStorageRepository {

    /* renamed from: a */
    public final px5 f27829a;

    /* renamed from: b */
    public final b34 f27830b;

    /* renamed from: c */
    public final c34 f27831c;

    /* renamed from: d */
    public final rx4 f27832d;

    /* renamed from: e */
    public final sx4 f27833e;

    /* renamed from: f */
    public final tm6 f27834f;

    /* renamed from: g */
    public final um6 f27835g;

    /* renamed from: h */
    public /* synthetic */ rc2<? super es6, r37> f27836h = SessionStorageRepository$onSessionExpired$1.INSTANCE;

    public SessionStorageRepository(px5 px5, b34 b34, c34 c34, rx4 rx4, sx4 sx4, tm6 tm6, um6 um6) {
        vx2.m53591g(px5, "sessionDaoQueries");
        vx2.m53591g(b34, "namespaceDaoQueries");
        vx2.m53591g(c34, "extensionsDaoQueries");
        vx2.m53591g(rx4, "proposalNamespaceDaoQueries");
        vx2.m53591g(sx4, "proposalExtensionsDaoQueries");
        vx2.m53591g(tm6, "tempNamespaceDaoQueries");
        vx2.m53591g(um6, "tempExtensionsDaoQueries");
        this.f27829a = px5;
        this.f27830b = b34;
        this.f27831c = c34;
        this.f27832d = rx4;
        this.f27833e = sx4;
        this.f27834f = tm6;
        this.f27835g = um6;
    }

    /* renamed from: t */
    public static final void m42997t(fd2 fd2, Object obj, Object obj2) {
        vx2.m53591g(fd2, "$tmp0");
        fd2.invoke(obj, obj2);
    }

    /* renamed from: v */
    public static final void m42998v(fd2 fd2, Object obj, Object obj2) {
        vx2.m53591g(fd2, "$tmp0");
        fd2.invoke(obj, obj2);
    }

    /* renamed from: A */
    public final cy5 mo41500A(long j, String str, long j2, String str2, String str3, String str4, String str5, String str6, boolean z) {
        String str7;
        String str8;
        Map<String, NamespaceVO.Session> p = mo41513p(j);
        Map<String, NamespaceVO.Proposal> o = mo41512o(j);
        es6 es6 = new es6(str);
        nx1 nx1 = new nx1(j2);
        String c = ty4.m52569c(str5);
        if (str6 == null) {
            str7 = vx2.m53591g(cb6.f21669a, "<this>");
        } else {
            str7 = str6;
        }
        String c2 = ty4.m52569c(str7);
        if (str4 == null) {
            str8 = vx2.m53591g(cb6.f21669a, "<this>");
        } else {
            str8 = str4;
        }
        return new cy5(es6, nx1, str2, str3, ty4.m52569c(str8), c, (AppMetaData) null, c2, (AppMetaData) null, p, o, z, (DefaultConstructorMarker) null);
    }

    /* renamed from: B */
    public final NamespaceVO.Session.Extension mo41501B(List<String> list, List<String> list2, List<String> list3) {
        return new NamespaceVO.Session.Extension(list, list2, list3);
    }

    /* renamed from: C */
    public final Pair<String, NamespaceVO.Session> mo41502C(long j, String str, List<String> list, List<String> list2, List<String> list3) {
        List b = this.f27835g.mo41492a(str, j, new C5706x4505e24c(this)).mo47566b();
        if (!(!b.isEmpty())) {
            b = null;
        }
        return wy6.m54142a(str, new NamespaceVO.Session(list, list2, list3, b));
    }

    /* renamed from: D */
    public final /* synthetic */ void mo41503D(long j) {
        this.f27834f.mo41476d0(j);
    }

    /* renamed from: E */
    public final void mo41504E(rc2<? super es6, r37> rc2) {
        vx2.m53591g(rc2, "<set-?>");
        this.f27836h = rc2;
    }

    /* renamed from: F */
    public final boolean mo41505F(long j, es6 es6, pc2<r37> pc2) {
        if (UtilFunctionsKt.m43027g(new nx1(j))) {
            return true;
        }
        pc2.invoke();
        this.f27836h.invoke(es6);
        return false;
    }

    /* renamed from: i */
    public final /* synthetic */ void mo41506i(es6 es6) {
        vx2.m53591g(es6, "topic");
        this.f27829a.mo41447z(true, es6.mo42395a());
    }

    /* renamed from: j */
    public final /* synthetic */ void mo41507j(String str, Map map, long j, pc2 pc2, pc2 pc22) {
        vx2.m53591g(str, "topic");
        vx2.m53591g(map, "namespaces");
        pc2 pc23 = pc2;
        vx2.m53591g(pc23, "onSuccess");
        pc2 pc24 = pc22;
        vx2.m53591g(pc24, "onFailure");
        nt6.C6291a.m49014a(this.f27830b, false, new SessionStorageRepository$deleteNamespaceAndInsertNewNamespace$1(this, str, map, pc24, this.f27829a.mo41445t(str).mo47567c().longValue(), j, pc23), 1, (Object) null);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo41508k(es6 es6) {
        vx2.m53591g(es6, "topic");
        this.f27830b.mo29444V(es6.mo42395a());
        this.f27831c.mo29864H(es6.mo42395a());
        this.f27832d.mo41409C(es6.mo42395a());
        this.f27833e.mo41422x(es6.mo42395a());
        this.f27834f.mo41475a0(es6.mo42395a());
        this.f27835g.mo41491B(es6.mo42395a());
        this.f27829a.mo41431J(es6.mo42395a());
    }

    /* renamed from: l */
    public final /* synthetic */ void mo41509l(es6 es6, long j) {
        vx2.m53591g(es6, "topic");
        this.f27829a.mo41434Q(j, es6.mo42395a());
    }

    /* renamed from: m */
    public final /* synthetic */ List mo41510m(es6 es6) {
        vx2.m53591g(es6, "pairingTopic");
        return this.f27829a.mo41435S(es6.mo42395a()).mo47566b();
    }

    /* renamed from: n */
    public final /* synthetic */ List mo41511n() {
        return this.f27829a.mo41437j(new SessionStorageRepository$getListOfSessionVOsWithoutMetadata$1(this)).mo47566b();
    }

    /* renamed from: o */
    public final Map<String, NamespaceVO.Proposal> mo41512o(long j) {
        return C6177b.m47369q(this.f27832d.mo41410W(j, new SessionStorageRepository$getProposalNamespaces$1(this, j)).mo47566b());
    }

    /* renamed from: p */
    public final Map<String, NamespaceVO.Session> mo41513p(long j) {
        return C6177b.m47369q(this.f27830b.mo29445c0(j, new SessionStorageRepository$getSessionNamespaces$1(this, j)).mo47566b());
    }

    /* renamed from: q */
    public final /* synthetic */ cy5 mo41514q(es6 es6) {
        vx2.m53591g(es6, "topic");
        return (cy5) this.f27829a.mo41433P(es6.mo42395a(), new SessionStorageRepository$getSessionWithoutMetadataByTopic$1(this)).mo47567c();
    }

    /* renamed from: r */
    public final /* synthetic */ Map mo41515r(long j) {
        List<Pair> b = this.f27834f.mo41477i(j, new SessionStorageRepository$getTempNamespaces$1(this)).mo47566b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(b, 10)), 16));
        for (Pair pair : b) {
            Pair a = wy6.m54142a((String) pair.component1(), (NamespaceVO.Session) pair.component2());
            linkedHashMap.put(a.getFirst(), a.getSecond());
        }
        return linkedHashMap;
    }

    /* renamed from: s */
    public final void mo41516s(Map<String, NamespaceVO.Session> map, long j, long j2) throws SQLiteException {
        map.forEach(new zx5(new SessionStorageRepository$insertNamespace$1(this, j, j2)));
    }

    /* renamed from: u */
    public final void mo41517u(Map<String, NamespaceVO.Proposal> map, long j) throws SQLiteException {
        map.forEach(new ay5(new SessionStorageRepository$insertProposalNamespace$1(this, j)));
    }

    /* renamed from: w */
    public final synchronized /* synthetic */ void mo41518w(cy5 cy5, es6 es6, long j) throws SQLiteException {
        String str;
        String str2;
        synchronized (this) {
            vx2.m53591g(cy5, "session");
            vx2.m53591g(es6, "pairingTopic");
            px5 px5 = this.f27829a;
            String a = cy5.mo41768m().mo42395a();
            String a2 = es6.mo42395a();
            long a3 = cy5.mo41757d().mo46241a();
            String l = cy5.mo41767l();
            String j2 = cy5.mo41765j();
            String c = cy5.mo41756c();
            if (c == null) {
                str = null;
            } else {
                str = c;
            }
            String g = cy5.mo41761g();
            if (g == null) {
                str2 = null;
            } else {
                str2 = g;
            }
            px5.mo41436X(a, a2, a3, j2, cy5.mo41764i(), str, l, str2, cy5.mo41769n());
            long longValue = this.f27829a.mo41430I().mo47567c().longValue();
            mo41516s(cy5.mo41758e(), longValue, j);
            mo41517u(cy5.mo41762h(), longValue);
        }
    }

    /* renamed from: x */
    public final /* synthetic */ boolean mo41519x(es6 es6) {
        boolean z;
        Long d;
        vx2.m53591g(es6, "topic");
        if (this.f27829a.mo41432O(es6.mo42395a()).mo47568d() != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (d = this.f27829a.mo41446y(es6.mo42395a()).mo47568d()) == null) {
            return false;
        }
        return mo41505F(d.longValue(), es6, new SessionStorageRepository$isSessionValid$1$1(this, es6));
    }

    /* renamed from: y */
    public final /* synthetic */ boolean mo41520y(String str, long j) {
        vx2.m53591g(str, "topic");
        Boolean d = this.f27834f.mo41474M(str, j).mo47568d();
        if (d != null) {
            return d.booleanValue();
        }
        return false;
    }

    /* renamed from: z */
    public final /* synthetic */ boolean mo41521z(String str, long j) {
        vx2.m53591g(str, "topic");
        Boolean d = this.f27830b.mo29446s(j, str).mo47568d();
        if (d != null) {
            return d.booleanValue();
        }
        return false;
    }
}
