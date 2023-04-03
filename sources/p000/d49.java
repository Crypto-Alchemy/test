package p000;

import java.util.HashMap;
import java.util.List;

/* renamed from: d49 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class d49 extends j78 {

    /* renamed from: e */
    public final n58 f28030e;

    public d49(n58 n58) {
        super("internal.eventLogger");
        this.f28030e = n58;
    }

    /* renamed from: a */
    public final r88 mo29623a(ps8 ps8, List<r88> list) {
        gv8.m44946a(this.f30236a, 3, list);
        String zzc = ps8.mo46865a(list.get(0)).zzc();
        long i = (long) gv8.m44954i(ps8.mo46865a(list.get(1)).mo29499b().doubleValue());
        r88 a = ps8.mo46865a(list.get(2));
        HashMap hashMap = new HashMap();
        if (a instanceof d88) {
            d88 d88 = (d88) a;
            for (String next : d88.mo41859a()) {
                Object j = gv8.m44955j(d88.mo41862j(next));
                if (j != null) {
                    hashMap.put(next, j);
                }
            }
        }
        this.f28030e.mo45975e(zzc, i, hashMap);
        return r88.f33330g1;
    }
}
