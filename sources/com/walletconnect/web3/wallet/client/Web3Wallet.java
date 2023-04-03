package com.walletconnect.web3.wallet.client;

import com.walletconnect.android.CoreClient;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p000.C5931ht;
import p000.C6197kt;
import p000.a16;
import p000.b16;
import p000.hg7;
import p000.ig7;
import p000.ut0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bJ:\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bJ8\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bJ8\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bJ8\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00132\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u0015J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u0016R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo44877d2 = {"Lcom/walletconnect/web3/wallet/client/Web3Wallet;", "", "Lcom/walletconnect/web3/wallet/client/Web3Wallet$a;", "delegate", "Lr37;", "m", "Lig7$b;", "params", "Lkotlin/Function1;", "Lhg7$c;", "onError", "h", "Lig7$c;", "onSuccess", "i", "Lig7$d;", "a", "Lig7$f;", "k", "Lig7$e;", "c", "Lig7$a;", "", "e", "", "Lhg7$g;", "g", "topic", "f", "Lcom/walletconnect/android/CoreClient;", "b", "Lcom/walletconnect/android/CoreClient;", "coreClient", "<init>", "()V", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Web3Wallet.kt */
public final class Web3Wallet {

    /* renamed from: a */
    public static final Web3Wallet f27840a = new Web3Wallet();

    /* renamed from: b */
    public static CoreClient f27841b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&¨\u0006\u001b"}, mo44877d2 = {"Lcom/walletconnect/web3/wallet/client/Web3Wallet$a;", "", "Lhg7$i;", "sessionProposal", "Lr37;", "b", "Lhg7$j;", "sessionRequest", "d", "Lhg7$h;", "sessionDelete", "f", "Lhg7$a;", "authRequest", "i", "Lhg7$l;", "settleSessionResponse", "h", "Lhg7$k;", "sessionUpdateResponse", "g", "Lhg7$b;", "state", "c", "Lhg7$c;", "error", "a", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.web3.wallet.client.Web3Wallet$a */
    /* compiled from: Web3Wallet.kt */
    public interface C5707a {
        /* renamed from: a */
        void mo41557a(hg7.C5900c cVar);

        /* renamed from: b */
        void mo41558b(hg7.C5914i iVar);

        /* renamed from: c */
        void mo41559c(hg7.C5899b bVar);

        /* renamed from: d */
        void mo41560d(hg7.C5915j jVar);

        /* renamed from: f */
        void mo41561f(hg7.C5911h hVar);

        /* renamed from: g */
        void mo41562g(hg7.C5917k kVar);

        /* renamed from: h */
        void mo41563h(hg7.C5920l lVar);

        /* renamed from: i */
        void mo41564i(hg7.C5898a aVar);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000%\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"com/walletconnect/web3/wallet/client/Web3Wallet$b", "", "Lht$a;", "authRequest", "Lr37;", "a", "Lht$b;", "connectionStateChange", "b", "Lht$c;", "error", "c", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.web3.wallet.client.Web3Wallet$b */
    /* compiled from: Web3Wallet.kt */
    public static final class C5708b implements C6324ot {

        /* renamed from: a */
        public final /* synthetic */ C5707a f27842a;

        public C5708b(C5707a aVar) {
            this.f27842a = aVar;
        }

        /* renamed from: a */
        public void mo41565a(C5931ht.C5932a aVar) {
            vx2.m53591g(aVar, "authRequest");
            this.f27842a.mo41564i(vx2.m53591g(aVar, "<this>"));
        }

        /* renamed from: b */
        public void mo41566b(C5931ht.C5933b bVar) {
            vx2.m53591g(bVar, "connectionStateChange");
        }

        /* renamed from: c */
        public void mo41567c(C5931ht.C5934c cVar) {
            vx2.m53591g(cVar, "error");
            this.f27842a.mo41557a(new hg7.C5900c(cVar.mo43386a().mo44577a()));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000E\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u0018"}, mo44877d2 = {"com/walletconnect/web3/wallet/client/Web3Wallet$c", "", "La16$g;", "sessionProposal", "Lr37;", "a", "La16$h;", "sessionRequest", "g", "La16$b;", "deletedSession", "b", "La16$j;", "settleSessionResponse", "f", "La16$i;", "sessionUpdateResponse", "d", "La16$a;", "state", "e", "La16$c;", "error", "c", "wallet_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.web3.wallet.client.Web3Wallet$c */
    /* compiled from: Web3Wallet.kt */
    public static final class C5709c implements o16 {

        /* renamed from: a */
        public final /* synthetic */ C5707a f27843a;

        public C5709c(C5707a aVar) {
            this.f27843a = aVar;
        }

        /* renamed from: a */
        public void mo41568a(a16.C3790g gVar) {
            vx2.m53591g(gVar, "sessionProposal");
            this.f27843a.mo41558b(vx2.m53591g(gVar, "<this>"));
        }

        /* renamed from: b */
        public void mo41569b(a16.C3777b bVar) {
            vx2.m53591g(bVar, "deletedSession");
            this.f27843a.mo41561f(pg0.m49924i(bVar));
        }

        /* renamed from: c */
        public void mo41570c(a16.C3780c cVar) {
            vx2.m53591g(cVar, "error");
            this.f27843a.mo41557a(new hg7.C5900c(cVar.mo28703a()));
        }

        /* renamed from: d */
        public void mo41571d(a16.C3793i iVar) {
            vx2.m53591g(iVar, "sessionUpdateResponse");
            this.f27843a.mo41562g(pg0.m49927l(iVar));
        }

        /* renamed from: e */
        public void mo41572e(a16.C3776a aVar) {
            vx2.m53591g(aVar, "state");
            this.f27843a.mo41559c(new hg7.C5899b(aVar.mo28690a()));
        }

        /* renamed from: f */
        public void mo41573f(a16.C3796j jVar) {
            vx2.m53591g(jVar, "settleSessionResponse");
            this.f27843a.mo41563h(pg0.m49928m(jVar));
        }

        /* renamed from: g */
        public void mo41574g(a16.C3791h hVar) {
            vx2.m53591g(hVar, "sessionRequest");
            this.f27843a.mo41560d(vx2.m53591g(hVar, "<this>"));
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m43028b(Web3Wallet web3Wallet, ig7.C5963d dVar, rc2 rc2, rc2 rc22, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            rc2 = Web3Wallet$approveSession$1.INSTANCE;
        }
        web3Wallet.mo41548a(dVar, rc2, rc22);
    }

    /* renamed from: d */
    public static /* synthetic */ void m43029d(Web3Wallet web3Wallet, ig7.C5964e eVar, rc2 rc2, rc2 rc22, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            rc2 = Web3Wallet$disconnectSession$1.INSTANCE;
        }
        web3Wallet.mo41549c(eVar, rc2, rc22);
    }

    /* renamed from: j */
    public static /* synthetic */ void m43030j(Web3Wallet web3Wallet, ig7.C5962c cVar, rc2 rc2, rc2 rc22, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            rc2 = Web3Wallet$pair$1.INSTANCE;
        }
        if ((i & 4) != 0) {
            rc22 = Web3Wallet$pair$2.INSTANCE;
        }
        web3Wallet.mo41554i(cVar, rc2, rc22);
    }

    /* renamed from: l */
    public static /* synthetic */ void m43031l(Web3Wallet web3Wallet, ig7.C5965f fVar, rc2 rc2, rc2 rc22, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            rc2 = Web3Wallet$respondSessionRequest$1.INSTANCE;
        }
        web3Wallet.mo41555k(fVar, rc2, rc22);
    }

    /* renamed from: a */
    public final void mo41548a(ig7.C5963d dVar, rc2<? super ig7.C5963d, r37> rc2, rc2<? super hg7.C5900c, r37> rc22) throws IllegalStateException {
        vx2.m53591g(dVar, "params");
        vx2.m53591g(rc2, "onSuccess");
        vx2.m53591g(rc22, "onError");
        d16.f28008b.mo41799a(new b16.C3871a(dVar.mo43606b(), pg0.m49920e(dVar.mo43605a()), dVar.mo43607c()), new Web3Wallet$approveSession$2(rc2, dVar), new Web3Wallet$approveSession$3(rc22));
    }

    /* renamed from: c */
    public final void mo41549c(ig7.C5964e eVar, rc2<? super ig7.C5964e, r37> rc2, rc2<? super hg7.C5900c, r37> rc22) throws IllegalStateException {
        vx2.m53591g(eVar, "params");
        vx2.m53591g(rc2, "onSuccess");
        vx2.m53591g(rc22, "onError");
        d16.f28008b.mo41800b(new b16.C3872b(eVar.mo43611a()), new Web3Wallet$disconnectSession$2(rc2, eVar), new Web3Wallet$disconnectSession$3(rc22));
    }

    /* renamed from: e */
    public final String mo41550e(ig7.C5960a aVar) throws IllegalStateException {
        vx2.m53591g(aVar, "params");
        return C6227lt.f31394b.mo45519a(new C6197kt.C6198a(vx2.m53591g(aVar.mo43593b(), "<this>"), aVar.mo43592a()));
    }

    /* renamed from: f */
    public final hg7.C5910g mo41551f(String str) throws IllegalStateException {
        vx2.m53591g(str, "topic");
        a16.C3789f c = d16.f28008b.mo41801c(str);
        if (c != null) {
            return vx2.m53591g(c, "<this>");
        }
        return null;
    }

    /* renamed from: g */
    public final List<hg7.C5910g> mo41552g() throws IllegalStateException {
        List<a16.C3789f> d = d16.f28008b.mo41802d();
        ArrayList arrayList = new ArrayList(dk0.m43495u(d, 10));
        for (a16.C3789f h : d) {
            arrayList.add(vx2.m53591g(h, "<this>"));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final void mo41553h(ig7.C5961b bVar, rc2<? super hg7.C5900c, r37> rc2) throws IllegalStateException {
        vx2.m53591g(bVar, "params");
        vx2.m53591g(rc2, "onError");
        f27841b = bVar.mo43597a();
        d16.f28008b.mo41803e(new b16.C3873c(bVar.mo43597a()), new Web3Wallet$initialize$1(rc2));
        C6227lt.f31394b.mo45520b(new C6197kt.C6199b(bVar.mo43597a()), new Web3Wallet$initialize$2(rc2));
    }

    /* renamed from: i */
    public final void mo41554i(ig7.C5962c cVar, rc2<? super ig7.C5962c, r37> rc2, rc2<? super hg7.C5900c, r37> rc22) throws IllegalStateException {
        vx2.m53591g(cVar, "params");
        vx2.m53591g(rc2, "onSuccess");
        vx2.m53591g(rc22, "onError");
        CoreClient coreClient = f27841b;
        if (coreClient == null) {
            vx2.m53605u("coreClient");
            coreClient = null;
        }
        coreClient.mo40079b().mo40453a(new ut0.C6577b(cVar.mo43601a()), new Web3Wallet$pair$3(rc2, cVar), new Web3Wallet$pair$4(rc22));
    }

    /* renamed from: k */
    public final void mo41555k(ig7.C5965f fVar, rc2<? super ig7.C5965f, r37> rc2, rc2<? super hg7.C5900c, r37> rc22) throws IllegalStateException {
        vx2.m53591g(fVar, "params");
        vx2.m53591g(rc2, "onSuccess");
        vx2.m53591g(rc22, "onError");
        d16.f28008b.mo41804f(new b16.C3874d(fVar.mo43616b(), pg0.m49919d(fVar.mo43615a())), new Web3Wallet$respondSessionRequest$2(rc2, fVar), new Web3Wallet$respondSessionRequest$3(rc22));
    }

    /* renamed from: m */
    public final void mo41556m(C5707a aVar) throws IllegalStateException {
        vx2.m53591g(aVar, "delegate");
        C5709c cVar = new C5709c(aVar);
        C5708b bVar = new C5708b(aVar);
        d16.f28008b.mo41805g(cVar);
        C6227lt.f31394b.mo45521c(bVar);
    }
}
