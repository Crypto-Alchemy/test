package net.safemoon.androidwallet.viewmodels.wcv2.sessionproposal;

import com.walletconnect.web3.wallet.client.Web3Wallet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.viewmodels.wcv2.WCDelegate;
import net.safemoon.androidwallet.viewmodels.wcv2.common.Chains;
import p000.hg7;
import p000.ig7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/sessionproposal/SessionProposalViewModel;", "Lad7;", "Lr37;", "b", "Lhg7$i;", "sessionProposal", "Lqx5;", "c", "d", "()Lqx5;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SessionProposalViewModel.kt */
public final class SessionProposalViewModel extends ad7 {
    /* renamed from: b */
    public final void mo62066b() {
        List<String> list;
        List<String> list2;
        WCDelegate wCDelegate = WCDelegate.f43174a;
        if (wCDelegate.mo62019m() != null) {
            hg7.C5914i m = wCDelegate.mo62019m();
            if (m != null) {
                List<String> a = rx5.m71718a();
                ArrayList arrayList = new ArrayList(dk0.m43495u(a, 10));
                Iterator<T> it = a.iterator();
                while (true) {
                    T t = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    Iterator<T> it2 = C9670z8.m74815a().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next = it2.next();
                        Pair pair = (Pair) next;
                        String str2 = (String) pair.component2();
                        if (vx2.m53586b(((Chains) pair.component1()).getChainWcId(), str)) {
                            t = next;
                            break;
                        }
                    }
                    arrayList.add((Pair) t);
                }
                Map q = C6177b.m47369q(CollectionsKt___CollectionsKt.m47326W(arrayList));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : q.entrySet()) {
                    Chains chains = (Chains) entry.getKey();
                    Collection<hg7.C5904e.C5905a> values = m.mo43262f().values();
                    ArrayList arrayList2 = new ArrayList();
                    for (hg7.C5904e.C5905a a2 : values) {
                        hk0.m45275z(arrayList2, a2.mo43206a());
                    }
                    String chainNamespace = chains.getChainNamespace();
                    String chainReference = chains.getChainReference();
                    if (arrayList2.contains(chainNamespace + ":" + chainReference)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                List w = co3.m33134w(linkedHashMap);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object next2 : w) {
                    String chainNamespace2 = ((Chains) ((Pair) next2).component1()).getChainNamespace();
                    Object obj = linkedHashMap2.get(chainNamespace2);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap2.put(chainNamespace2, obj);
                    }
                    ((List) obj).add(next2);
                }
                ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    ArrayList<Pair> arrayList4 = new ArrayList<>();
                    for (Object next3 : (List) entry2.getValue()) {
                        if (vx2.m53586b(((Chains) ((Pair) next3).component1()).getChainNamespace(), str3)) {
                            arrayList4.add(next3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(dk0.m43495u(arrayList4, 10));
                    for (Pair pair2 : arrayList4) {
                        Chains chains2 = (Chains) pair2.component1();
                        String chainNamespace3 = chains2.getChainNamespace();
                        String chainReference2 = chains2.getChainReference();
                        arrayList5.add(chainNamespace3 + ":" + chainReference2 + ":" + ((String) pair2.component2()));
                    }
                    hg7.C5904e.C5905a aVar = m.mo43262f().get(str3);
                    if (aVar == null || (list = aVar.mo43208c()) == null) {
                        list = ck0.m33062j();
                    }
                    hg7.C5904e.C5905a aVar2 = m.mo43262f().get(str3);
                    if (aVar2 == null || (list2 = aVar2.mo43207b()) == null) {
                        list2 = ck0.m33062j();
                    }
                    arrayList3.add(wy6.m54142a(str3, new hg7.C5904e.C5907b(arrayList5, list, list2, (List<hg7.C5904e.C5907b.C5908a>) null)));
                }
                Web3Wallet.m43028b(Web3Wallet.f27840a, new ig7.C5963d(m.mo43260e(), C6177b.m47369q(arrayList3), (String) null, 4, (DefaultConstructorMarker) null), (rc2) null, SessionProposalViewModel$approve$1.INSTANCE, 2, (Object) null);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: c */
    public final qx5 mo62067c(hg7.C5914i iVar) {
        if (iVar == null) {
            return null;
        }
        return new qx5(new dn4(String.valueOf(CollectionsKt___CollectionsKt.m47331b0(iVar.mo43257b())), iVar.mo43258c(), iVar.mo43263g(), iVar.mo43256a()), iVar.mo43262f());
    }

    /* renamed from: d */
    public final qx5 mo62068d() {
        return mo62067c(WCDelegate.f43174a.mo62019m());
    }
}
