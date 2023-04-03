package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: wi9 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class wi9 {

    /* renamed from: a */
    public String f35338a;

    /* renamed from: b */
    public boolean f35339b;

    /* renamed from: c */
    public at8 f35340c;

    /* renamed from: d */
    public BitSet f35341d;

    /* renamed from: e */
    public BitSet f35342e;

    /* renamed from: f */
    public Map<Integer, Long> f35343f;

    /* renamed from: g */
    public Map<Integer, List<Long>> f35344g;

    /* renamed from: h */
    public final /* synthetic */ kk9 f35345h;

    public /* synthetic */ wi9(kk9 kk9, String str, ki9 ki9) {
        this.f35345h = kk9;
        this.f35338a = str;
        this.f35339b = true;
        this.f35341d = new BitSet();
        this.f35342e = new BitSet();
        this.f35343f = new C2781lq();
        this.f35344g = new C2781lq();
    }

    /* renamed from: a */
    public final void mo49200a(tj9 tj9) {
        int a = tj9.mo30028a();
        Boolean bool = tj9.f34292c;
        if (bool != null) {
            this.f35342e.set(a, bool.booleanValue());
        }
        Boolean bool2 = tj9.f34293d;
        if (bool2 != null) {
            this.f35341d.set(a, bool2.booleanValue());
        }
        if (tj9.f34294e != null) {
            Map<Integer, Long> map = this.f35343f;
            Integer valueOf = Integer.valueOf(a);
            Long l = map.get(valueOf);
            long longValue = tj9.f34294e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f35343f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (tj9.f34295f != null) {
            Map<Integer, List<Long>> map2 = this.f35344g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f35344g.put(valueOf2, list);
            }
            if (tj9.mo30029b()) {
                list.clear();
            }
            nd9.m48739a();
            n68 y = this.f35345h.f34342a.mo45274y();
            String str = this.f35338a;
            uk8<Boolean> uk8 = rl8.f33487b0;
            if (y.mo45997v(str, uk8) && tj9.mo30030c()) {
                list.clear();
            }
            nd9.m48739a();
            if (this.f35345h.f34342a.mo45274y().mo45997v(this.f35338a, uk8)) {
                Long valueOf3 = Long.valueOf(tj9.f34295f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(tj9.f34295f.longValue() / 1000));
        }
    }

    /* renamed from: b */
    public final mq8 mo49201b(int i) {
        ArrayList arrayList;
        List list;
        lq8 F = mq8.m48422F();
        F.mo45492w(i);
        F.mo45495z(this.f35339b);
        at8 at8 = this.f35340c;
        if (at8 != null) {
            F.mo45494y(at8);
        }
        ys8 I = at8.m31926I();
        I.mo49742y(w59.m53711E(this.f35341d));
        I.mo49740w(w59.m53711E(this.f35342e));
        Map<Integer, Long> map = this.f35343f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f35343f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = this.f35343f.get(Integer.valueOf(intValue2));
                if (l != null) {
                    rq8 C = tq8.m52412C();
                    C.mo47472w(intValue2);
                    C.mo47473x(l.longValue());
                    arrayList2.add((tq8) C.mo48885o());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            I.mo49736B(arrayList);
        }
        Map<Integer, List<Long>> map2 = this.f35344g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer next : this.f35344g.keySet()) {
                ct8 D = et8.m44059D();
                D.mo41715w(next.intValue());
                List list2 = this.f35344g.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    D.mo41716x(list2);
                }
                arrayList3.add((et8) D.mo48885o());
            }
            list = arrayList3;
        }
        I.mo49738D(list);
        F.mo45493x(I);
        return (mq8) F.mo48885o();
    }

    public /* synthetic */ wi9(kk9 kk9, String str, at8 at8, BitSet bitSet, BitSet bitSet2, Map map, Map map2, ki9 ki9) {
        this.f35345h = kk9;
        this.f35338a = str;
        this.f35341d = bitSet;
        this.f35342e = bitSet2;
        this.f35343f = map;
        this.f35344g = new C2781lq();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f35344g.put(num, arrayList);
        }
        this.f35339b = false;
        this.f35340c = at8;
    }
}
