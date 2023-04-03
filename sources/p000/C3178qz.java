package p000;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: qz */
/* compiled from: BaseUrlExclusionList */
public final class C3178qz {

    /* renamed from: a */
    public final Map<String, Long> f17098a;

    /* renamed from: b */
    public final Map<Integer, Long> f17099b;

    /* renamed from: c */
    public final Map<List<Pair<String, Integer>>, C3018oz> f17100c;

    /* renamed from: d */
    public final Random f17101d;

    public C3178qz() {
        this(new Random());
    }

    /* renamed from: b */
    public static <T> void m25961b(T t, long j, Map<T, Long> map) {
        if (map.containsKey(t)) {
            j = Math.max(j, ((Long) w67.m29360j(map.get(t))).longValue());
        }
        map.put(t, Long.valueOf(j));
    }

    /* renamed from: d */
    public static int m25962d(C3018oz ozVar, C3018oz ozVar2) {
        int compare = Integer.compare(ozVar.f16256c, ozVar2.f16256c);
        if (compare != 0) {
            return compare;
        }
        return ozVar.f16255b.compareTo(ozVar2.f16255b);
    }

    /* renamed from: f */
    public static int m25963f(List<C3018oz> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(list.get(i).f16256c));
        }
        return hashSet.size();
    }

    /* renamed from: h */
    public static <T> void m25964h(long j, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            if (((Long) next.getValue()).longValue() <= j) {
                arrayList.add(next.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    /* renamed from: c */
    public final List<C3018oz> mo25282c(List<C3018oz> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m25964h(elapsedRealtime, this.f17098a);
        m25964h(elapsedRealtime, this.f17099b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C3018oz ozVar = list.get(i);
            if (!this.f17098a.containsKey(ozVar.f16255b) && !this.f17099b.containsKey(Integer.valueOf(ozVar.f16256c))) {
                arrayList.add(ozVar);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public void mo25283e(C3018oz ozVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        m25961b(ozVar.f16255b, elapsedRealtime, this.f17098a);
        int i = ozVar.f16256c;
        if (i != Integer.MIN_VALUE) {
            m25961b(Integer.valueOf(i), elapsedRealtime, this.f17099b);
        }
    }

    /* renamed from: g */
    public int mo25284g(List<C3018oz> list) {
        HashSet hashSet = new HashSet();
        List<C3018oz> c = mo25282c(list);
        for (int i = 0; i < c.size(); i++) {
            hashSet.add(Integer.valueOf(c.get(i).f16256c));
        }
        return hashSet.size();
    }

    /* renamed from: i */
    public void mo25285i() {
        this.f17098a.clear();
        this.f17099b.clear();
        this.f17100c.clear();
    }

    /* renamed from: j */
    public C3018oz mo25286j(List<C3018oz> list) {
        List<C3018oz> c = mo25282c(list);
        if (c.size() < 2) {
            return (C3018oz) qz2.m50912c(c, null);
        }
        Collections.sort(c, new C3104pz());
        ArrayList arrayList = new ArrayList();
        int i = c.get(0).f16256c;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C3018oz ozVar = c.get(i2);
            if (i == ozVar.f16256c) {
                arrayList.add(new Pair(ozVar.f16255b, Integer.valueOf(ozVar.f16257d)));
                i2++;
            } else if (arrayList.size() == 1) {
                return c.get(0);
            }
        }
        C3018oz ozVar2 = this.f17100c.get(arrayList);
        if (ozVar2 != null) {
            return ozVar2;
        }
        C3018oz k = mo25287k(c.subList(0, arrayList.size()));
        this.f17100c.put(arrayList, k);
        return k;
    }

    /* renamed from: k */
    public final C3018oz mo25287k(List<C3018oz> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += list.get(i2).f16257d;
        }
        int nextInt = this.f17101d.nextInt(i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            C3018oz ozVar = list.get(i4);
            i3 += ozVar.f16257d;
            if (nextInt < i3) {
                return ozVar;
            }
        }
        return (C3018oz) qz2.m50913d(list);
    }

    public C3178qz(Random random) {
        this.f17100c = new HashMap();
        this.f17101d = random;
        this.f17098a = new HashMap();
        this.f17099b = new HashMap();
    }
}
