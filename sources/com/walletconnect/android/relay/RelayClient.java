package com.walletconnect.android.relay;

import com.walletconnect.android.internal.common.p013di.AndroidCommonDITags;
import com.walletconnect.android.internal.common.p013di.CoreNetworkModuleKt;
import com.walletconnect.foundation.crypto.data.repository.JwtRepository;
import com.walletconnect.foundation.network.BaseRelayClient;
import kotlin.C6169a;
import kotlin.Metadata;
import p000.ec5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b)\u0010*J3\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R!\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8VX\u0002¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010 ¨\u0006+"}, mo44877d2 = {"Lcom/walletconnect/android/relay/RelayClient;", "Lcom/walletconnect/foundation/network/BaseRelayClient;", "Lfc5;", "", "relayServerUrl", "Lcom/walletconnect/android/relay/ConnectionType;", "connectionType", "Lkotlin/Function1;", "", "Lr37;", "onError", "w", "(Ljava/lang/String;Lcom/walletconnect/android/relay/ConnectionType;Lrc2;)V", "u", "Lec5$b;", "event", "y", "Lop0;", "h", "Lef3;", "getConnectionController", "()Lop0;", "connectionController", "Lyp0;", "i", "v", "()Lyp0;", "networkState", "Lt86;", "", "j", "x", "()Lt86;", "isNetworkAvailable", "Lu04;", "k", "Lu04;", "isWSSConnectionOpened", "l", "a", "isConnectionAvailable", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: RelayClient.kt */
public final class RelayClient extends BaseRelayClient implements fc5 {

    /* renamed from: g */
    public static final RelayClient f27245g = new RelayClient();

    /* renamed from: h */
    public static final ef3 f27246h = C6169a.m47232a(RelayClient$connectionController$2.INSTANCE);

    /* renamed from: i */
    public static final ef3 f27247i = C6169a.m47232a(RelayClient$networkState$2.INSTANCE);

    /* renamed from: j */
    public static final ef3 f27248j = C6169a.m47232a(RelayClient$isNetworkAvailable$2.INSTANCE);

    /* renamed from: k */
    public static final u04<Boolean> f27249k = u86.m72658a(Boolean.FALSE);

    /* renamed from: l */
    public static final ef3 f27250l = C6169a.m47232a(RelayClient$isConnectionAvailable$2.INSTANCE);

    /* renamed from: a */
    public t86<Boolean> mo40533a() {
        return (t86) f27250l.getValue();
    }

    /* renamed from: u */
    public final void mo40534u(rc2<? super Throwable, r37> rc2) {
        e52.m57232x(e52.m57202C(new RelayClient$collectConnectionErrors$$inlined$map$1(new RelayClient$collectConnectionErrors$$inlined$filterIsInstance$1(e52.m57202C(mo40734g(), new RelayClient$collectConnectionErrors$1((ns0<? super RelayClient$collectConnectionErrors$1>) null)))), new RelayClient$collectConnectionErrors$3(rc2, (ns0<? super RelayClient$collectConnectionErrors$3>) null)), bh7.m32535a());
    }

    /* renamed from: v */
    public final yp0 mo40535v() {
        return (yp0) f27247i.getValue();
    }

    /* renamed from: w */
    public final /* synthetic */ void mo40536w(String str, ConnectionType connectionType, rc2 rc2) {
        vx2.m53591g(str, "relayServerUrl");
        vx2.m53591g(connectionType, "connectionType");
        vx2.m53591g(rc2, "onError");
        if (ay1.m32286d(str)) {
            fc3 b = hc3.m45112a().mo51892b();
            mo40741n((sk3) b.mo51636g().mo56284d().mo64988f(ua5.m52727b(sk3.class), pz4.m71134c(AndroidCommonDITags.LOGGER), (pc2<? extends ul4>) null));
            String a = JwtRepository.DefaultImpls.m42468a((JwtRepository) hc3.m45112a().mo51892b().mo51636g().mo56284d().mo64988f(ua5.m52727b(JwtRepository.class), (oz4) null, (pc2<? extends ul4>) null), ay1.m32288f(str), (rc2) null, 2, (Object) null);
            hc3.m45112a().mo51894d(CoreNetworkModuleKt.m42106a(ay1.m32283a(str, "1.9.1"), a, ay1.m32289g(connectionType), "1.9.1"));
            fc3 b2 = hc3.m45112a().mo51892b();
            mo40742o((ic5) b2.mo51636g().mo56284d().mo64988f(ua5.m52727b(ic5.class), pz4.m71134c(AndroidCommonDITags.RELAY_SERVICE), (pc2<? extends ul4>) null));
            mo40534u(rc2);
            return;
        }
        throw new IllegalArgumentException("Check the schema and projectId parameter of the Server Url".toString());
    }

    /* renamed from: x */
    public final t86<Boolean> mo40537x() {
        return (t86) f27248j.getValue();
    }

    /* renamed from: y */
    public final void mo40538y(ec5.C5775b bVar) {
        if (bVar instanceof ec5.C5775b.C5779d) {
            f27249k.mo55657e(Boolean.FALSE, Boolean.TRUE);
        } else if ((bVar instanceof ec5.C5775b.C5776a) || (bVar instanceof ec5.C5775b.C5778c)) {
            f27249k.mo55657e(Boolean.TRUE, Boolean.FALSE);
        }
    }
}
