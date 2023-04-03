package p000;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* renamed from: i98 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class i98 extends l98 {
    public i98() {
        this.f31222a.add(zzbl.BITWISE_AND);
        this.f31222a.add(zzbl.BITWISE_LEFT_SHIFT);
        this.f31222a.add(zzbl.BITWISE_NOT);
        this.f31222a.add(zzbl.BITWISE_OR);
        this.f31222a.add(zzbl.BITWISE_RIGHT_SHIFT);
        this.f31222a.add(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f31222a.add(zzbl.BITWISE_XOR);
    }

    /* renamed from: a */
    public final r88 mo28916a(String str, ps8 ps8, List<r88> list) {
        zzbl zzbl = zzbl.ADD;
        switch (gv8.m44950e(str).ordinal()) {
            case 4:
                gv8.m44946a(zzbl.BITWISE_AND.name(), 2, list);
                return new e78(Double.valueOf((double) (gv8.m44952g(ps8.mo46865a(list.get(0)).mo29499b().doubleValue()) & gv8.m44952g(ps8.mo46865a(list.get(1)).mo29499b().doubleValue()))));
            case 5:
                gv8.m44946a(zzbl.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new e78(Double.valueOf((double) (gv8.m44952g(ps8.mo46865a(list.get(0)).mo29499b().doubleValue()) << ((int) (gv8.m44953h(ps8.mo46865a(list.get(1)).mo29499b().doubleValue()) & 31)))));
            case 6:
                gv8.m44946a(zzbl.BITWISE_NOT.name(), 1, list);
                return new e78(Double.valueOf((double) (~gv8.m44952g(ps8.mo46865a(list.get(0)).mo29499b().doubleValue()))));
            case 7:
                gv8.m44946a(zzbl.BITWISE_OR.name(), 2, list);
                return new e78(Double.valueOf((double) (gv8.m44952g(ps8.mo46865a(list.get(0)).mo29499b().doubleValue()) | gv8.m44952g(ps8.mo46865a(list.get(1)).mo29499b().doubleValue()))));
            case 8:
                gv8.m44946a(zzbl.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new e78(Double.valueOf((double) (gv8.m44952g(ps8.mo46865a(list.get(0)).mo29499b().doubleValue()) >> ((int) (gv8.m44953h(ps8.mo46865a(list.get(1)).mo29499b().doubleValue()) & 31)))));
            case 9:
                gv8.m44946a(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new e78(Double.valueOf((double) (gv8.m44953h(ps8.mo46865a(list.get(0)).mo29499b().doubleValue()) >>> ((int) (gv8.m44953h(ps8.mo46865a(list.get(1)).mo29499b().doubleValue()) & 31)))));
            case 10:
                gv8.m44946a(zzbl.BITWISE_XOR.name(), 2, list);
                return new e78(Double.valueOf((double) (gv8.m44952g(ps8.mo46865a(list.get(0)).mo29499b().doubleValue()) ^ gv8.m44952g(ps8.mo46865a(list.get(1)).mo29499b().doubleValue()))));
            default:
                return super.mo45390b(str);
        }
    }
}
