package net.safemoon.androidwallet.viewmodels.wcv2;

import com.walletconnect.android.CoreClient;
import com.walletconnect.web3.wallet.client.Web3Wallet;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.hg7;
import p000.tt0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0006\u0010\u0019\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0005J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016R\u0014\u0010#\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020%0(8\u0006¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0$8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020-0(8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b/\u0010+R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u00101\u001a\u0004\u0018\u00010\u00108\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\b3\u00104R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u00101\u001a\u0004\u0018\u00010\u00138\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010<¨\u0006?"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/WCDelegate;", "Lcom/walletconnect/web3/wallet/client/Web3Wallet$a;", "Lcom/walletconnect/android/CoreClient$a;", "Lhg7$a;", "authRequest", "Lr37;", "i", "Lhg7$b;", "connectionStateChange", "c", "Lhg7$c;", "error", "a", "Lhg7$h;", "deletedSession", "f", "Lhg7$i;", "sessionProposal", "b", "Lhg7$j;", "sessionRequest", "d", "Lhg7$l;", "settleSessionResponse", "h", "p", "q", "Lhg7$k;", "sessionUpdateResponse", "g", "Ltt0$b;", "deletedPairing", "e", "Lhu0;", "Lhu0;", "scope", "Lr04;", "Ltt0;", "Lr04;", "_coreEvents", "Lxz5;", "Lxz5;", "l", "()Lxz5;", "coreEvents", "Lhg7;", "_walletEvents", "o", "walletEvents", "<set-?>", "Lhg7$i;", "m", "()Lhg7$i;", "Lhg7$a;", "getAuthRequest", "()Lhg7$a;", "setAuthRequest", "(Lhg7$a;)V", "Lhg7$j;", "n", "()Lhg7$j;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WCDelegate.kt */
public final class WCDelegate implements Web3Wallet.C5707a, CoreClient.C5506a {

    /* renamed from: a */
    public static final WCDelegate f43174a;

    /* renamed from: b */
    public static final hu0 f43175b = iu0.m59111a(qd6.m71250b((y23) null, 1, (Object) null).plus(qh1.m71265b()));

    /* renamed from: c */
    public static final r04<tt0> f43176c;

    /* renamed from: d */
    public static final xz5<tt0> f43177d;

    /* renamed from: e */
    public static final r04<hg7> f43178e;

    /* renamed from: f */
    public static final xz5<hg7> f43179f;

    /* renamed from: g */
    public static hg7.C5914i f43180g;

    /* renamed from: h */
    public static hg7.C5898a f43181h;

    /* renamed from: i */
    public static hg7.C5915j f43182i;

    static {
        WCDelegate wCDelegate = new WCDelegate();
        f43174a = wCDelegate;
        r04<tt0> b = yz5.m74703b(0, 0, (BufferOverflow) null, 7, (Object) null);
        f43176c = b;
        f43177d = e52.m57209a(b);
        r04<hg7> b2 = yz5.m74703b(0, 0, (BufferOverflow) null, 7, (Object) null);
        f43178e = b2;
        f43179f = e52.m57209a(b2);
        CoreClient.f27008a.mo40082f(wCDelegate);
        Web3Wallet.f27840a.mo41556m(wCDelegate);
    }

    /* renamed from: a */
    public void mo41557a(hg7.C5900c cVar) {
        vx2.m53591g(cVar, "error");
        y23 unused = d50.m56748b(f43175b, (CoroutineContext) null, (CoroutineStart) null, new WCDelegate$onError$1(cVar, (ns0<? super WCDelegate$onError$1>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public void mo41558b(hg7.C5914i iVar) {
        vx2.m53591g(iVar, "sessionProposal");
        f43180g = iVar;
        y23 unused = d50.m56748b(f43175b, (CoroutineContext) null, (CoroutineStart) null, new WCDelegate$onSessionProposal$1(iVar, (ns0<? super WCDelegate$onSessionProposal$1>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public void mo41559c(hg7.C5899b bVar) {
        vx2.m53591g(bVar, "connectionStateChange");
        y23 unused = d50.m56748b(f43175b, (CoroutineContext) null, (CoroutineStart) null, new WCDelegate$onConnectionStateChange$1(bVar, (ns0<? super WCDelegate$onConnectionStateChange$1>) null), 3, (Object) null);
    }

    /* renamed from: d */
    public void mo41560d(hg7.C5915j jVar) {
        vx2.m53591g(jVar, "sessionRequest");
        f43182i = jVar;
        y23 unused = d50.m56748b(f43175b, (CoroutineContext) null, (CoroutineStart) null, new WCDelegate$onSessionRequest$1(jVar, (ns0<? super WCDelegate$onSessionRequest$1>) null), 3, (Object) null);
    }

    /* renamed from: e */
    public void mo45446e(tt0.C6537b bVar) {
        vx2.m53591g(bVar, "deletedPairing");
        y23 unused = d50.m56748b(f43175b, (CoroutineContext) null, (CoroutineStart) null, new WCDelegate$onPairingDelete$1(bVar, (ns0<? super WCDelegate$onPairingDelete$1>) null), 3, (Object) null);
    }

    /* renamed from: f */
    public void mo41561f(hg7.C5911h hVar) {
        vx2.m53591g(hVar, "deletedSession");
        y23 unused = d50.m56748b(f43175b, (CoroutineContext) null, (CoroutineStart) null, new WCDelegate$onSessionDelete$1(hVar, (ns0<? super WCDelegate$onSessionDelete$1>) null), 3, (Object) null);
    }

    /* renamed from: g */
    public void mo41562g(hg7.C5917k kVar) {
        vx2.m53591g(kVar, "sessionUpdateResponse");
        y23 unused = d50.m56748b(f43175b, (CoroutineContext) null, (CoroutineStart) null, new WCDelegate$onSessionUpdateResponse$1(kVar, (ns0<? super WCDelegate$onSessionUpdateResponse$1>) null), 3, (Object) null);
    }

    /* renamed from: h */
    public void mo41563h(hg7.C5920l lVar) {
        vx2.m53591g(lVar, "settleSessionResponse");
        y23 unused = d50.m56748b(f43175b, (CoroutineContext) null, (CoroutineStart) null, new WCDelegate$onSessionSettleResponse$1(lVar, (ns0<? super WCDelegate$onSessionSettleResponse$1>) null), 3, (Object) null);
    }

    /* renamed from: i */
    public void mo41564i(hg7.C5898a aVar) {
        vx2.m53591g(aVar, "authRequest");
        f43181h = aVar;
        y23 unused = d50.m56748b(f43175b, (CoroutineContext) null, (CoroutineStart) null, new WCDelegate$onAuthRequest$1(aVar, (ns0<? super WCDelegate$onAuthRequest$1>) null), 3, (Object) null);
    }

    /* renamed from: l */
    public final xz5<tt0> mo62018l() {
        return f43177d;
    }

    /* renamed from: m */
    public final hg7.C5914i mo62019m() {
        return f43180g;
    }

    /* renamed from: n */
    public final hg7.C5915j mo62020n() {
        return f43182i;
    }

    /* renamed from: o */
    public final xz5<hg7> mo62021o() {
        return f43179f;
    }

    /* renamed from: p */
    public final void mo62022p() {
        f43180g = null;
    }

    /* renamed from: q */
    public final void mo62023q() {
        f43182i = null;
    }
}
