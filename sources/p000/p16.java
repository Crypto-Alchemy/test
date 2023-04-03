package p000;

import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0010\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u001c\u0010\t\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u001c\u0010\n\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u001c\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J0\u0010\u000f\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u001c\u0010\u0010\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0002H\u0002J\u001c\u0010\u0011\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0002H\u0002J.\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0002H\u0002J.\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J0\u0010\u0015\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J.\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0002H\u0002J.\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J0\u0010\u0018\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J0\u0010\u0019\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u001c\u0010\u001a\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0002H\u0002J\u001c\u0010\u001b\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0002H\u0002J\u001c\u0010\u001c\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0002H\u0002J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo44877d2 = {"Lp16;", "", "", "", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Proposal;", "namespaces", "", "G", "D", "B", "C", "F", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session;", "sessionNamespaces", "proposalNamespaces", "A", "w", "u", "", "r", "t", "z", "q", "s", "y", "x", "v", "E", "H", "accountId", "I", "(Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: p16 */
/* compiled from: SignValidator.kt */
public final class p16 {

    /* renamed from: a */
    public static final p16 f32536a = new p16();

    /* renamed from: A */
    public final boolean mo46588A(Map<String, NamespaceVO.Session> map, Map<String, NamespaceVO.Proposal> map2) {
        return map.keySet().containsAll(map2.keySet());
    }

    /* renamed from: B */
    public final boolean mo46589B(Map<String, NamespaceVO.Proposal> map) {
        Collection<NamespaceVO.Proposal> values = map.values();
        ArrayList<String> arrayList = new ArrayList<>();
        for (NamespaceVO.Proposal e : values) {
            hk0.m45275z(arrayList, e.mo40989e());
        }
        if (!arrayList.isEmpty()) {
            for (String b : arrayList) {
                if (!zt0.f36235a.mo49917b(b)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055 A[SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46590C(java.util.Map<java.lang.String, com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO.Proposal> r6) {
        /*
            r5 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0009
            goto L_0x0054
        L_0x0009:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0011:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.getValue()
            com.walletconnect.sign.common.model.vo.clientsync.common.NamespaceVO$Proposal r0 = (com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO.Proposal) r0
            java.util.List r0 = r0.mo40989e()
            boolean r4 = r0 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0038
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0038
            goto L_0x0050
        L_0x0038:
            java.util.Iterator r0 = r0.iterator()
        L_0x003c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.StringsKt__StringsKt.m63077P(r4, r3, r2)
            if (r4 != 0) goto L_0x003c
            r0 = r1
            goto L_0x0051
        L_0x0050:
            r0 = r2
        L_0x0051:
            if (r0 != 0) goto L_0x0011
            goto L_0x0055
        L_0x0054:
            r1 = r2
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p16.mo46590C(java.util.Map):boolean");
    }

    /* renamed from: D */
    public final boolean mo46591D(Map<String, NamespaceVO.Proposal> map) {
        Collection<NamespaceVO.Proposal> values = map.values();
        ArrayList<List> arrayList = new ArrayList<>(dk0.m43495u(values, 10));
        for (NamespaceVO.Proposal e : values) {
            arrayList.add(e.mo40989e());
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (List isEmpty : arrayList) {
            if (!(!isEmpty.isEmpty())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E */
    public final boolean mo46592E(Map<String, NamespaceVO.Session> map) {
        Collection<NamespaceVO.Session> values = map.values();
        ArrayList<NamespaceVO.Session> arrayList = new ArrayList<>();
        Iterator<T> it = values.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((NamespaceVO.Session) next).mo41011g() != null) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList<List> arrayList2 = new ArrayList<>();
        for (NamespaceVO.Session g : arrayList) {
            List<NamespaceVO.Session.Extension> g2 = g.mo41011g();
            vx2.m53588d(g2);
            ArrayList arrayList3 = new ArrayList(dk0.m43495u(g2, 10));
            for (NamespaceVO.Session.Extension a : g2) {
                arrayList3.add(a.mo41015a());
            }
            hk0.m45275z(arrayList2, arrayList3);
        }
        if (!arrayList2.isEmpty()) {
            for (List isEmpty : arrayList2) {
                if (!(!isEmpty.isEmpty())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: F */
    public final boolean mo46593F(Map<String, NamespaceVO.Proposal> map) {
        Collection<NamespaceVO.Proposal> values = map.values();
        ArrayList<NamespaceVO.Proposal> arrayList = new ArrayList<>();
        Iterator<T> it = values.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((NamespaceVO.Proposal) next).mo40992g() != null) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList<List> arrayList2 = new ArrayList<>();
        for (NamespaceVO.Proposal g : arrayList) {
            List<NamespaceVO.Proposal.Extension> g2 = g.mo40992g();
            vx2.m53588d(g2);
            ArrayList arrayList3 = new ArrayList(dk0.m43495u(g2, 10));
            for (NamespaceVO.Proposal.Extension a : g2) {
                arrayList3.add(a.mo40996a());
            }
            hk0.m45275z(arrayList2, arrayList3);
        }
        if (!arrayList2.isEmpty()) {
            for (List isEmpty : arrayList2) {
                if (!(!isEmpty.isEmpty())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: G */
    public final boolean mo46594G(Map<String, NamespaceVO.Proposal> map) {
        Set<String> keySet = map.keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            for (String matches : keySet) {
                if (!new Regex("^[-a-z0-9]{3,8}$").matches(matches)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: H */
    public final boolean mo46595H(Map<String, NamespaceVO.Session> map) {
        Set<String> keySet = map.keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            for (String matches : keySet) {
                if (!new Regex("^[-a-z0-9]{3,8}$").matches(matches)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: I */
    public final /* synthetic */ String mo46596I(String str) {
        vx2.m53591g(str, "accountId");
        List B0 = StringsKt__StringsKt.m63061B0(str, new String[]{":"}, false, 0, 6, (Object) null);
        if (B0.isEmpty() || B0.size() != 3) {
            return str;
        }
        return ((String) B0.get(0)) + ":" + ((String) B0.get(1));
    }

    /* renamed from: q */
    public final Map<String, List<String>> mo46597q(Map<String, NamespaceVO.Session> map) {
        List list;
        Collection<NamespaceVO.Session> values = map.values();
        ArrayList arrayList = new ArrayList();
        for (NamespaceVO.Session next : values) {
            List<String> f = next.mo41010f();
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(f, 10));
            for (String next2 : f) {
                List<String> e = next.mo41008e();
                ArrayList arrayList3 = new ArrayList(dk0.m43495u(e, 10));
                for (String I : e) {
                    arrayList3.add(f32536a.mo46596I(I));
                }
                arrayList2.add(wy6.m54142a(next2, arrayList3));
            }
            List<NamespaceVO.Session.Extension> g = next.mo41011g();
            if (g != null) {
                list = new ArrayList();
                for (NamespaceVO.Session.Extension b : g) {
                    List<String> b2 = b.mo41016b();
                    ArrayList arrayList4 = new ArrayList(dk0.m43495u(b2, 10));
                    for (String next3 : b2) {
                        List<String> e2 = next.mo41008e();
                        ArrayList arrayList5 = new ArrayList(dk0.m43495u(e2, 10));
                        for (String I2 : e2) {
                            arrayList5.add(f32536a.mo46596I(I2));
                        }
                        arrayList4.add(wy6.m54142a(next3, arrayList5));
                    }
                    hk0.m45275z(list, arrayList4);
                }
            } else {
                list = ck0.m33062j();
            }
            hk0.m45275z(arrayList, CollectionsKt___CollectionsKt.m47350u0(arrayList2, list));
        }
        return C6177b.m47369q(arrayList);
    }

    /* renamed from: r */
    public final Map<String, List<String>> mo46598r(Map<String, NamespaceVO.Session> map) {
        Collection<NamespaceVO.Session> values = map.values();
        ArrayList arrayList = new ArrayList();
        for (NamespaceVO.Session session : values) {
            List<String> h = session.mo41012h();
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(h, 10));
            for (String str : h) {
                List<String> e = session.mo41008e();
                ArrayList arrayList3 = new ArrayList(dk0.m43495u(e, 10));
                for (String I : e) {
                    arrayList3.add(f32536a.mo46596I(I));
                }
                arrayList2.add(wy6.m54142a(str, arrayList3));
            }
            List M0 = CollectionsKt___CollectionsKt.m47313M0(arrayList2);
            if (session.mo41011g() != null) {
                List<NamespaceVO.Session.Extension> g = session.mo41011g();
                ArrayList arrayList4 = new ArrayList();
                for (NamespaceVO.Session.Extension c : g) {
                    List<String> c2 = c.mo41017c();
                    ArrayList arrayList5 = new ArrayList(dk0.m43495u(c2, 10));
                    for (String str2 : c2) {
                        List<String> e2 = session.mo41008e();
                        ArrayList arrayList6 = new ArrayList(dk0.m43495u(e2, 10));
                        for (String I2 : e2) {
                            arrayList6.add(f32536a.mo46596I(I2));
                        }
                        arrayList5.add(wy6.m54142a(str2, arrayList6));
                    }
                    hk0.m45275z(arrayList4, arrayList5);
                }
                M0.addAll(arrayList4);
            }
            hk0.m45275z(arrayList, M0);
        }
        return C6177b.m47369q(arrayList);
    }

    /* renamed from: s */
    public final Map<String, List<String>> mo46599s(Map<String, NamespaceVO.Proposal> map) {
        List list;
        Collection<NamespaceVO.Proposal> values = map.values();
        ArrayList arrayList = new ArrayList();
        for (NamespaceVO.Proposal next : values) {
            List<String> f = next.mo40991f();
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(f, 10));
            for (String a : f) {
                arrayList2.add(wy6.m54142a(a, next.mo40989e()));
            }
            List<NamespaceVO.Proposal.Extension> g = next.mo40992g();
            if (g != null) {
                list = new ArrayList();
                for (NamespaceVO.Proposal.Extension b : g) {
                    List<String> b2 = b.mo40997b();
                    ArrayList arrayList3 = new ArrayList(dk0.m43495u(b2, 10));
                    for (String a2 : b2) {
                        arrayList3.add(wy6.m54142a(a2, next.mo40989e()));
                    }
                    hk0.m45275z(list, arrayList3);
                }
            } else {
                list = ck0.m33062j();
            }
            hk0.m45275z(arrayList, CollectionsKt___CollectionsKt.m47350u0(arrayList2, list));
        }
        return C6177b.m47369q(arrayList);
    }

    /* renamed from: t */
    public final Map<String, List<String>> mo46600t(Map<String, NamespaceVO.Proposal> map) {
        Collection<NamespaceVO.Proposal> values = map.values();
        ArrayList arrayList = new ArrayList();
        for (NamespaceVO.Proposal proposal : values) {
            List<String> h = proposal.mo40993h();
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(h, 10));
            for (String a : h) {
                arrayList2.add(wy6.m54142a(a, proposal.mo40989e()));
            }
            List M0 = CollectionsKt___CollectionsKt.m47313M0(arrayList2);
            if (proposal.mo40992g() != null) {
                List<NamespaceVO.Proposal.Extension> g = proposal.mo40992g();
                ArrayList arrayList3 = new ArrayList();
                for (NamespaceVO.Proposal.Extension c : g) {
                    List<String> c2 = c.mo40998c();
                    ArrayList arrayList4 = new ArrayList(dk0.m43495u(c2, 10));
                    for (String a2 : c2) {
                        arrayList4.add(wy6.m54142a(a2, proposal.mo40989e()));
                    }
                    hk0.m45275z(arrayList3, arrayList4);
                }
                M0.addAll(arrayList3);
            }
            hk0.m45275z(arrayList, M0);
        }
        return C6177b.m47369q(arrayList);
    }

    /* renamed from: u */
    public final boolean mo46601u(Map<String, NamespaceVO.Session> map) {
        Collection<NamespaceVO.Session> values = map.values();
        ArrayList<String> arrayList = new ArrayList<>();
        for (NamespaceVO.Session e : values) {
            hk0.m45275z(arrayList, e.mo41008e());
        }
        if (!arrayList.isEmpty()) {
            for (String a : arrayList) {
                if (!zt0.f36235a.mo49916a(a)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055 A[SYNTHETIC] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46602v(java.util.Map<java.lang.String, com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO.Session> r8) {
        /*
            r7 = this;
            boolean r0 = r8.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0009
            goto L_0x0056
        L_0x0009:
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0011:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.getValue()
            com.walletconnect.sign.common.model.vo.clientsync.common.NamespaceVO$Session r0 = (com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO.Session) r0
            java.util.List r0 = r0.mo41008e()
            boolean r4 = r0 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0038
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0038
            goto L_0x0052
        L_0x0038:
            java.util.Iterator r0 = r0.iterator()
        L_0x003c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0052
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = 2
            r6 = 0
            boolean r4 = kotlin.text.StringsKt__StringsKt.m63081R(r4, r3, r2, r5, r6)
            if (r4 != 0) goto L_0x003c
            r0 = r2
            goto L_0x0053
        L_0x0052:
            r0 = r1
        L_0x0053:
            if (r0 != 0) goto L_0x0011
            r1 = r2
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p16.mo46602v(java.util.Map):boolean");
    }

    /* renamed from: w */
    public final boolean mo46603w(Map<String, NamespaceVO.Session> map) {
        Collection<NamespaceVO.Session> values = map.values();
        ArrayList<List> arrayList = new ArrayList<>(dk0.m43495u(values, 10));
        for (NamespaceVO.Session e : values) {
            arrayList.add(e.mo41008e());
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (List isEmpty : arrayList) {
            if (!(!isEmpty.isEmpty())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    public final boolean mo46604x(Map<String, NamespaceVO.Session> map, Map<String, NamespaceVO.Proposal> map2) {
        Collection<NamespaceVO.Session> values = map.values();
        ArrayList arrayList = new ArrayList();
        for (NamespaceVO.Session e : values) {
            List<String> e2 = e.mo41008e();
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(e2, 10));
            for (String U0 : e2) {
                arrayList2.add(StringsKt__StringsKt.m63088U0(U0, ":", (String) null, 2, (Object) null));
            }
            hk0.m45275z(arrayList, arrayList2);
        }
        Collection<NamespaceVO.Proposal> values2 = map2.values();
        ArrayList arrayList3 = new ArrayList();
        for (NamespaceVO.Proposal e3 : values2) {
            hk0.m45275z(arrayList3, e3.mo40989e());
        }
        return arrayList.containsAll(arrayList3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0016  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46605y(java.util.Map<java.lang.String, com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO.Session> r4, java.util.Map<java.lang.String, com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO.Proposal> r5) {
        /*
            r3 = this;
            java.util.Map r4 = r3.mo46597q(r4)
            java.util.Map r5 = r3.mo46599s(r5)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0010:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r4.get(r1)
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 != 0) goto L_0x0032
            return r2
        L_0x0032:
            boolean r0 = r1.containsAll(r0)
            if (r0 != 0) goto L_0x0010
            return r2
        L_0x0039:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p16.mo46605y(java.util.Map, java.util.Map):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0016  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46606z(java.util.Map<java.lang.String, com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO.Session> r4, java.util.Map<java.lang.String, com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO.Proposal> r5) {
        /*
            r3 = this;
            java.util.Map r4 = r3.mo46598r(r4)
            java.util.Map r5 = r3.mo46600t(r5)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0010:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r4.get(r1)
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            if (r1 != 0) goto L_0x0032
            return r2
        L_0x0032:
            boolean r0 = r1.containsAll(r0)
            if (r0 != 0) goto L_0x0010
            return r2
        L_0x0039:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p16.mo46606z(java.util.Map, java.util.Map):boolean");
    }
}
