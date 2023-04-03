package p000;

import androidx.recyclerview.widget.RecyclerView;
import com.walletconnect.android.internal.common.model.AppMetaData;
import com.walletconnect.android.internal.common.model.RelayProtocolOptions;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.SessionParticipantVO;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\"\b\b\u0018\u0000 72\u00020\u0001:\u0001\u0017B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0001¢\u0006\u0004\b:\u0010;J°\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u00102\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b)\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b%\u0010(R \u0010\u000b\u001a\u00020\t8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b-\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b+\u00100R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b*\u00103R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u00108\u0006¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b1\u00103R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b,\u00104\u001a\u0004\b5\u00106R\u0017\u00108\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001f\u00104\u001a\u0004\b7\u00106R\u0017\u00109\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b9\u00106\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006<"}, mo44877d2 = {"Lcy5;", "", "Les6;", "topic", "Lnx1;", "expiry", "", "relayProtocol", "relayData", "Lty4;", "controllerKey", "selfPublicKey", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "selfAppMetaData", "peerPublicKey", "peerAppMetaData", "", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session;", "namespaces", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Proposal;", "proposalNamespaces", "", "isAcknowledged", "a", "(Les6;Lnx1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/walletconnect/android/internal/common/model/AppMetaData;Ljava/lang/String;Lcom/walletconnect/android/internal/common/model/AppMetaData;Ljava/util/Map;Ljava/util/Map;Z)Lcy5;", "toString", "", "hashCode", "other", "equals", "Les6;", "m", "()Les6;", "b", "Lnx1;", "d", "()Lnx1;", "c", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "i", "e", "f", "l", "g", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "k", "()Lcom/walletconnect/android/internal/common/model/AppMetaData;", "h", "Ljava/util/Map;", "()Ljava/util/Map;", "Z", "n", "()Z", "o", "isPeerController", "isSelfController", "<init>", "(Les6;Lnx1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/walletconnect/android/internal/common/model/AppMetaData;Ljava/lang/String;Lcom/walletconnect/android/internal/common/model/AppMetaData;Ljava/util/Map;Ljava/util/Map;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: cy5 */
/* compiled from: SessionVO.kt */
public final class cy5 {

    /* renamed from: o */
    public static final C5720a f27978o = new C5720a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final es6 f27979a;

    /* renamed from: b */
    public final nx1 f27980b;

    /* renamed from: c */
    public final String f27981c;

    /* renamed from: d */
    public final String f27982d;

    /* renamed from: e */
    public final String f27983e;

    /* renamed from: f */
    public final String f27984f;

    /* renamed from: g */
    public final AppMetaData f27985g;

    /* renamed from: h */
    public final String f27986h;

    /* renamed from: i */
    public final AppMetaData f27987i;

    /* renamed from: j */
    public final Map<String, NamespaceVO.Session> f27988j;

    /* renamed from: k */
    public final Map<String, NamespaceVO.Proposal> f27989k;

    /* renamed from: l */
    public final boolean f27990l;

    /* renamed from: m */
    public final boolean f27991m;

    /* renamed from: n */
    public final boolean f27992n;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJC\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, mo44877d2 = {"Lcy5$a;", "", "Les6;", "sessionTopic", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionProposeParams;", "proposal", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/SessionParticipantVO;", "selfParticipant", "", "sessionExpiry", "", "", "Lcom/walletconnect/sign/engine/model/EngineDO$b$b;", "namespaces", "Lcy5;", "b", "(Les6;Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionProposeParams;Lcom/walletconnect/sign/common/model/vo/clientsync/common/SessionParticipantVO;JLjava/util/Map;)Lcy5;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionSettleParams;", "settleParams", "Lty4;", "selfPublicKey", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "selfMetadata", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Proposal;", "proposalNamespaces", "a", "(Les6;Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionSettleParams;Ljava/lang/String;Lcom/walletconnect/android/internal/common/model/AppMetaData;Ljava/util/Map;)Lcy5;", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: cy5$a */
    /* compiled from: SessionVO.kt */
    public static final class C5720a {
        public C5720a() {
        }

        public /* synthetic */ C5720a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final /* synthetic */ cy5 mo41772a(es6 es6, SignParams.SessionSettleParams sessionSettleParams, String str, AppMetaData appMetaData, Map map) {
            es6 es62 = es6;
            vx2.m53591g(es62, "sessionTopic");
            vx2.m53591g(sessionSettleParams, "settleParams");
            String str2 = str;
            vx2.m53591g(str2, "selfPublicKey");
            AppMetaData appMetaData2 = appMetaData;
            vx2.m53591g(appMetaData2, "selfMetadata");
            Map map2 = map;
            vx2.m53591g(map2, "proposalNamespaces");
            return new cy5(es62, new nx1(sessionSettleParams.mo41142b()), sessionSettleParams.mo41145d().mo40328b(), sessionSettleParams.mo41145d().mo40327a(), ty4.m52569c(sessionSettleParams.mo41141a().mo41035b()), str2, appMetaData2, ty4.m52569c(sessionSettleParams.mo41141a().mo41035b()), sessionSettleParams.mo41141a().mo41034a(), sessionSettleParams.mo41143c(), map2, true, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final /* synthetic */ cy5 mo41773b(es6 es6, SignParams.SessionProposeParams sessionProposeParams, SessionParticipantVO sessionParticipantVO, long j, Map map) {
            es6 es62 = es6;
            vx2.m53591g(es62, "sessionTopic");
            vx2.m53591g(sessionProposeParams, "proposal");
            vx2.m53591g(sessionParticipantVO, "selfParticipant");
            vx2.m53591g(map, "namespaces");
            nx1 nx1 = new nx1(j);
            String b = ((RelayProtocolOptions) CollectionsKt___CollectionsKt.m47329Z(sessionProposeParams.mo41130c())).mo40328b();
            String a = ((RelayProtocolOptions) CollectionsKt___CollectionsKt.m47329Z(sessionProposeParams.mo41130c())).mo40327a();
            String c = ty4.m52569c(sessionProposeParams.mo41129b().mo40336b());
            AppMetaData a2 = sessionProposeParams.mo41129b().mo40335a();
            String c2 = ty4.m52569c(sessionParticipantVO.mo41035b());
            AppMetaData a3 = sessionParticipantVO.mo41034a();
            return new cy5(es62, nx1, b, a, ty4.m52569c(sessionParticipantVO.mo41035b()), c2, a3, c, a2, gq1.m44830m(map), sessionProposeParams.mo41128a(), false, (DefaultConstructorMarker) null);
        }
    }

    public cy5(es6 es6, nx1 nx1, String str, String str2, String str3, String str4, AppMetaData appMetaData, String str5, AppMetaData appMetaData2, Map<String, NamespaceVO.Session> map, Map<String, NamespaceVO.Proposal> map2, boolean z) {
        this.f27979a = es6;
        this.f27980b = nx1;
        this.f27981c = str;
        this.f27982d = str2;
        this.f27983e = str3;
        this.f27984f = str4;
        this.f27985g = appMetaData;
        this.f27986h = str5;
        this.f27987i = appMetaData2;
        this.f27988j = map;
        this.f27989k = map2;
        this.f27990l = z;
        this.f27991m = vx2.m53586b(str5 == null ? null : str5, str3 == null ? null : str3);
        this.f27992n = vx2.m53586b(str4, str3 == null ? null : str3);
    }

    public /* synthetic */ cy5(es6 es6, nx1 nx1, String str, String str2, String str3, String str4, AppMetaData appMetaData, String str5, AppMetaData appMetaData2, Map map, Map map2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(es6, nx1, str, str2, str3, str4, appMetaData, str5, appMetaData2, map, map2, z);
    }

    /* renamed from: b */
    public static /* synthetic */ cy5 m43274b(cy5 cy5, es6 es6, nx1 nx1, String str, String str2, String str3, String str4, AppMetaData appMetaData, String str5, AppMetaData appMetaData2, Map map, Map map2, boolean z, int i, Object obj) {
        cy5 cy52 = cy5;
        int i2 = i;
        return cy5.mo41755a((i2 & 1) != 0 ? cy5.mo41768m() : es6, (i2 & 2) != 0 ? cy5.mo41757d() : nx1, (i2 & 4) != 0 ? cy52.f27981c : str, (i2 & 8) != 0 ? cy52.f27982d : str2, (i2 & 16) != 0 ? cy52.f27983e : str3, (i2 & 32) != 0 ? cy52.f27984f : str4, (i2 & 64) != 0 ? cy52.f27985g : appMetaData, (i2 & 128) != 0 ? cy52.f27986h : str5, (i2 & 256) != 0 ? cy52.f27987i : appMetaData2, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? cy52.f27988j : map, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? cy52.f27989k : map2, (i2 & 2048) != 0 ? cy52.f27990l : z);
    }

    /* renamed from: a */
    public final cy5 mo41755a(es6 es6, nx1 nx1, String str, String str2, String str3, String str4, AppMetaData appMetaData, String str5, AppMetaData appMetaData2, Map<String, NamespaceVO.Session> map, Map<String, NamespaceVO.Proposal> map2, boolean z) {
        es6 es62 = es6;
        vx2.m53591g(es62, "topic");
        nx1 nx12 = nx1;
        vx2.m53591g(nx12, "expiry");
        String str6 = str;
        vx2.m53591g(str6, "relayProtocol");
        String str7 = str4;
        vx2.m53591g(str7, "selfPublicKey");
        Map<String, NamespaceVO.Session> map3 = map;
        vx2.m53591g(map3, "namespaces");
        Map<String, NamespaceVO.Proposal> map4 = map2;
        vx2.m53591g(map4, "proposalNamespaces");
        return new cy5(es62, nx12, str6, str2, str3, str7, appMetaData, str5, appMetaData2, map3, map4, z, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final String mo41756c() {
        return this.f27983e;
    }

    /* renamed from: d */
    public nx1 mo41757d() {
        return this.f27980b;
    }

    /* renamed from: e */
    public final Map<String, NamespaceVO.Session> mo41758e() {
        return this.f27988j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a8 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p000.cy5
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            cy5 r5 = (p000.cy5) r5
            es6 r1 = r4.mo41768m()
            es6 r3 = r5.mo41768m()
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 != 0) goto L_0x001b
            return r2
        L_0x001b:
            nx1 r1 = r4.mo41757d()
            nx1 r3 = r5.mo41757d()
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 != 0) goto L_0x002a
            return r2
        L_0x002a:
            java.lang.String r1 = r4.f27981c
            java.lang.String r3 = r5.f27981c
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 != 0) goto L_0x0035
            return r2
        L_0x0035:
            java.lang.String r1 = r4.f27982d
            java.lang.String r3 = r5.f27982d
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 != 0) goto L_0x0040
            return r2
        L_0x0040:
            java.lang.String r1 = r4.f27983e
            java.lang.String r3 = r5.f27983e
            if (r1 != 0) goto L_0x004a
            if (r3 != 0) goto L_0x004c
            r1 = r0
            goto L_0x0052
        L_0x004a:
            if (r3 != 0) goto L_0x004e
        L_0x004c:
            r1 = r2
            goto L_0x0052
        L_0x004e:
            boolean r1 = p000.ty4.m52571e(r1, r3)
        L_0x0052:
            if (r1 != 0) goto L_0x0055
            return r2
        L_0x0055:
            java.lang.String r1 = r4.f27984f
            java.lang.String r3 = r5.f27984f
            boolean r1 = p000.ty4.m52571e(r1, r3)
            if (r1 != 0) goto L_0x0060
            return r2
        L_0x0060:
            com.walletconnect.android.internal.common.model.AppMetaData r1 = r4.f27985g
            com.walletconnect.android.internal.common.model.AppMetaData r3 = r5.f27985g
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 != 0) goto L_0x006b
            return r2
        L_0x006b:
            java.lang.String r1 = r4.f27986h
            java.lang.String r3 = r5.f27986h
            if (r1 != 0) goto L_0x0075
            if (r3 != 0) goto L_0x0077
            r1 = r0
            goto L_0x007d
        L_0x0075:
            if (r3 != 0) goto L_0x0079
        L_0x0077:
            r1 = r2
            goto L_0x007d
        L_0x0079:
            boolean r1 = p000.ty4.m52571e(r1, r3)
        L_0x007d:
            if (r1 != 0) goto L_0x0080
            return r2
        L_0x0080:
            com.walletconnect.android.internal.common.model.AppMetaData r1 = r4.f27987i
            com.walletconnect.android.internal.common.model.AppMetaData r3 = r5.f27987i
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 != 0) goto L_0x008b
            return r2
        L_0x008b:
            java.util.Map<java.lang.String, com.walletconnect.sign.common.model.vo.clientsync.common.NamespaceVO$Session> r1 = r4.f27988j
            java.util.Map<java.lang.String, com.walletconnect.sign.common.model.vo.clientsync.common.NamespaceVO$Session> r3 = r5.f27988j
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 != 0) goto L_0x0096
            return r2
        L_0x0096:
            java.util.Map<java.lang.String, com.walletconnect.sign.common.model.vo.clientsync.common.NamespaceVO$Proposal> r1 = r4.f27989k
            java.util.Map<java.lang.String, com.walletconnect.sign.common.model.vo.clientsync.common.NamespaceVO$Proposal> r3 = r5.f27989k
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 != 0) goto L_0x00a1
            return r2
        L_0x00a1:
            boolean r1 = r4.f27990l
            boolean r5 = r5.f27990l
            if (r1 == r5) goto L_0x00a8
            return r2
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cy5.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final AppMetaData mo41760f() {
        return this.f27987i;
    }

    /* renamed from: g */
    public final String mo41761g() {
        return this.f27986h;
    }

    /* renamed from: h */
    public final Map<String, NamespaceVO.Proposal> mo41762h() {
        return this.f27989k;
    }

    public int hashCode() {
        int hashCode = ((((mo41768m().hashCode() * 31) + mo41757d().hashCode()) * 31) + this.f27981c.hashCode()) * 31;
        String str = this.f27982d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27983e;
        int f = (((hashCode2 + (str2 == null ? 0 : ty4.m52572f(str2))) * 31) + ty4.m52572f(this.f27984f)) * 31;
        AppMetaData appMetaData = this.f27985g;
        int hashCode3 = (f + (appMetaData == null ? 0 : appMetaData.hashCode())) * 31;
        String str3 = this.f27986h;
        int f2 = (hashCode3 + (str3 == null ? 0 : ty4.m52572f(str3))) * 31;
        AppMetaData appMetaData2 = this.f27987i;
        if (appMetaData2 != null) {
            i = appMetaData2.hashCode();
        }
        int hashCode4 = (((((f2 + i) * 31) + this.f27988j.hashCode()) * 31) + this.f27989k.hashCode()) * 31;
        boolean z = this.f27990l;
        if (z) {
            z = true;
        }
        return hashCode4 + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo41764i() {
        return this.f27982d;
    }

    /* renamed from: j */
    public final String mo41765j() {
        return this.f27981c;
    }

    /* renamed from: k */
    public final AppMetaData mo41766k() {
        return this.f27985g;
    }

    /* renamed from: l */
    public final String mo41767l() {
        return this.f27984f;
    }

    /* renamed from: m */
    public es6 mo41768m() {
        return this.f27979a;
    }

    /* renamed from: n */
    public final boolean mo41769n() {
        return this.f27990l;
    }

    /* renamed from: o */
    public final boolean mo41770o() {
        return this.f27991m;
    }

    public String toString() {
        es6 m = mo41768m();
        nx1 d = mo41757d();
        String str = this.f27981c;
        String str2 = this.f27982d;
        String str3 = this.f27983e;
        String str4 = "null";
        String g = str3 == null ? str4 : ty4.m52573g(str3);
        String g2 = ty4.m52573g(this.f27984f);
        AppMetaData appMetaData = this.f27985g;
        String str5 = this.f27986h;
        if (str5 != null) {
            str4 = ty4.m52573g(str5);
        }
        AppMetaData appMetaData2 = this.f27987i;
        Map<String, NamespaceVO.Session> map = this.f27988j;
        Map<String, NamespaceVO.Proposal> map2 = this.f27989k;
        boolean z = this.f27990l;
        return "SessionVO(topic=" + m + ", expiry=" + d + ", relayProtocol=" + str + ", relayData=" + str2 + ", controllerKey=" + g + ", selfPublicKey=" + g2 + ", selfAppMetaData=" + appMetaData + ", peerPublicKey=" + str4 + ", peerAppMetaData=" + appMetaData2 + ", namespaces=" + map + ", proposalNamespaces=" + map2 + ", isAcknowledged=" + z + ")";
    }
}
