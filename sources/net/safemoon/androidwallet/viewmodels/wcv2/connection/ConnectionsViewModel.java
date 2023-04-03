package net.safemoon.androidwallet.viewmodels.wcv2.connection;

import com.walletconnect.web3.wallet.client.Web3Wallet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import net.safemoon.androidwallet.viewmodels.wcv2.WCDelegate;
import p000.hg7;
import p000.i06;
import p000.sp0;
import p000.tt0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R.\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR#\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001fR\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040!8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u001d\u0010'¨\u0006+"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/connection/ConnectionsViewModel;", "Lad7;", "Lr37;", "g", "Ltp0;", "c", "", "f", "Lr04;", "a", "Lr04;", "_refreshFlow", "Lxz5;", "b", "Lxz5;", "refreshFlow", "Lz42;", "Lz42;", "signConnectionsFlow", "", "value", "d", "Ljava/lang/Integer;", "getCurrentConnectionId", "()Ljava/lang/Integer;", "setCurrentConnectionId", "(Ljava/lang/Integer;)V", "currentConnectionId", "Lt86;", "e", "Lt86;", "()Lt86;", "connections", "Lt04;", "Lt04;", "getCurrentConnectionUI", "()Lt04;", "currentConnectionUI", "Ltj7;", "()Lxz5;", "coreEvents", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ConnectionsViewModel.kt */
public final class ConnectionsViewModel extends ad7 {

    /* renamed from: a */
    public r04<r37> f43200a;

    /* renamed from: b */
    public xz5<r37> f43201b;

    /* renamed from: c */
    public final z42<List<tp0>> f43202c;

    /* renamed from: d */
    public Integer f43203d;

    /* renamed from: e */
    public final t86<List<tp0>> f43204e;

    /* renamed from: f */
    public final t04<tp0> f43205f = l56.m21292b(mo62061c(), (h56) null, 2, (Object) null);

    /* renamed from: g */
    public final xz5<tj7> f43206g;

    public ConnectionsViewModel() {
        r04<r37> a = yz5.m74702a(0, 1, BufferOverflow.DROP_OLDEST);
        this.f43200a = a;
        this.f43201b = e52.m57209a(a);
        WCDelegate wCDelegate = WCDelegate.f43174a;
        ConnectionsViewModel$special$$inlined$map$1 connectionsViewModel$special$$inlined$map$1 = new ConnectionsViewModel$special$$inlined$map$1(e52.m57200A(wCDelegate.mo62021o(), this.f43201b), this);
        this.f43202c = connectionsViewModel$special$$inlined$map$1;
        hu0 a2 = cd7.m11843a(this);
        i06.C7198a aVar = i06.f38305a;
        this.f43204e = e52.m57206G(connectionsViewModel$special$$inlined$map$1, a2, aVar.mo52358c(), mo62064f());
        ConnectionsViewModel$special$$inlined$map$2 connectionsViewModel$special$$inlined$map$2 = new ConnectionsViewModel$special$$inlined$map$2(wCDelegate.mo62018l());
        this.f43206g = FlowKt__ShareKt.m63369f(connectionsViewModel$special$$inlined$map$2, cd7.m11843a(this), i06.C7198a.m58757b(aVar, 0, 0, 3, (Object) null), 0, 4, (Object) null);
    }

    /* renamed from: c */
    public final tp0 mo62061c() {
        Object obj;
        boolean z;
        Iterator it = this.f43204e.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int a = ((tp0) obj).mo66110a();
            Integer num = this.f43203d;
            if (num != null && a == num.intValue()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (tp0) obj;
    }

    /* renamed from: d */
    public final t86<List<tp0>> mo62062d() {
        return this.f43204e;
    }

    /* renamed from: e */
    public final xz5<tj7> mo62063e() {
        return this.f43206g;
    }

    /* renamed from: f */
    public final List<tp0> mo62064f() {
        int i;
        String str;
        String str2;
        List<String> b;
        try {
            List<hg7.C5910g> g = Web3Wallet.f27840a.mo41552g();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = g.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((hg7.C5910g) next).mo43243a() != null) {
                    i = 1;
                }
                if (i != 0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (true) {
                int i2 = i;
                if (!it2.hasNext()) {
                    return arrayList2;
                }
                Object next2 = it2.next();
                i = i2 + 1;
                if (i2 < 0) {
                    ck0.m33072t();
                }
                hg7.C5910g gVar = (hg7.C5910g) next2;
                tt0.C6536a a = gVar.mo43243a();
                String str3 = null;
                if (a == null || (b = a.mo48170b()) == null) {
                    str = null;
                } else {
                    str = (String) CollectionsKt___CollectionsKt.m47331b0(b);
                }
                tt0.C6536a a2 = gVar.mo43243a();
                vx2.m53588d(a2);
                String c = a2.mo48171c();
                if (!(!yb6.m74325B(c))) {
                    c = null;
                }
                if (c == null) {
                    c = "Dapp";
                }
                String str4 = c;
                tt0.C6536a a3 = gVar.mo43243a();
                vx2.m53588d(a3);
                String e = a3.mo48173e();
                if (!yb6.m74325B(e)) {
                    str3 = e;
                }
                if (str3 == null) {
                    str2 = "Not provided";
                } else {
                    str2 = str3;
                }
                arrayList2.add(new tp0(i2, new sp0.C9312a(gVar.mo43246d(), gVar.mo43244b()), str4, str2, str));
            }
        } catch (Exception unused) {
            return ck0.m33062j();
        }
    }

    /* renamed from: g */
    public final void mo62065g() {
        boolean b = this.f43200a.mo55645b(r37.f33317a);
        StringBuilder sb = new StringBuilder();
        sb.append("refreshConnections ");
        sb.append(b);
    }
}
