package p000;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* renamed from: ib8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class ib8 extends l98 {
    public ib8() {
        this.f31222a.add(zzbl.AND);
        this.f31222a.add(zzbl.NOT);
        this.f31222a.add(zzbl.OR);
    }

    /* renamed from: a */
    public final r88 mo28916a(String str, ps8 ps8, List<r88> list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = gv8.m44950e(str).ordinal();
        if (ordinal == 1) {
            gv8.m44946a(zzbl.AND.name(), 2, list);
            r88 a = ps8.mo46865a(list.get(0));
            if (!a.mo29500c().booleanValue()) {
                return a;
            }
            return ps8.mo46865a(list.get(1));
        } else if (ordinal == 47) {
            gv8.m44946a(zzbl.NOT.name(), 1, list);
            return new s68(Boolean.valueOf(!ps8.mo46865a(list.get(0)).mo29500c().booleanValue()));
        } else if (ordinal != 50) {
            return super.mo45390b(str);
        } else {
            gv8.m44946a(zzbl.OR.name(), 2, list);
            r88 a2 = ps8.mo46865a(list.get(0));
            if (a2.mo29500c().booleanValue()) {
                return a2;
            }
            return ps8.mo46865a(list.get(1));
        }
    }
}
