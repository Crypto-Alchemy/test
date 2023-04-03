package p000;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* renamed from: ac8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class ac8 extends l98 {
    public ac8() {
        this.f31222a.add(zzbl.ADD);
        this.f31222a.add(zzbl.DIVIDE);
        this.f31222a.add(zzbl.MODULUS);
        this.f31222a.add(zzbl.MULTIPLY);
        this.f31222a.add(zzbl.NEGATE);
        this.f31222a.add(zzbl.POST_DECREMENT);
        this.f31222a.add(zzbl.POST_INCREMENT);
        this.f31222a.add(zzbl.PRE_DECREMENT);
        this.f31222a.add(zzbl.PRE_INCREMENT);
        this.f31222a.add(zzbl.SUBTRACT);
    }

    /* renamed from: a */
    public final r88 mo28916a(String str, ps8 ps8, List<r88> list) {
        String str2;
        zzbl zzbl = zzbl.ADD;
        int ordinal = gv8.m44950e(str).ordinal();
        if (ordinal == 0) {
            gv8.m44946a(zzbl.ADD.name(), 2, list);
            r88 a = ps8.mo46865a(list.get(0));
            r88 a2 = ps8.mo46865a(list.get(1));
            if (!(a instanceof y78) && !(a instanceof b98) && !(a2 instanceof y78) && !(a2 instanceof b98)) {
                return new e78(Double.valueOf(a.mo29499b().doubleValue() + a2.mo29499b().doubleValue()));
            }
            String valueOf = String.valueOf(a.zzc());
            String valueOf2 = String.valueOf(a2.zzc());
            if (valueOf2.length() != 0) {
                str2 = valueOf.concat(valueOf2);
            } else {
                str2 = new String(valueOf);
            }
            return new b98(str2);
        } else if (ordinal == 21) {
            gv8.m44946a(zzbl.DIVIDE.name(), 2, list);
            return new e78(Double.valueOf(ps8.mo46865a(list.get(0)).mo29499b().doubleValue() / ps8.mo46865a(list.get(1)).mo29499b().doubleValue()));
        } else if (ordinal == 59) {
            gv8.m44946a(zzbl.SUBTRACT.name(), 2, list);
            return new e78(Double.valueOf(ps8.mo46865a(list.get(0)).mo29499b().doubleValue() + new e78(Double.valueOf(-ps8.mo46865a(list.get(1)).mo29499b().doubleValue())).mo29499b().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            gv8.m44946a(str, 2, list);
            r88 a3 = ps8.mo46865a(list.get(0));
            ps8.mo46865a(list.get(1));
            return a3;
        } else if (ordinal == 55 || ordinal == 56) {
            gv8.m44946a(str, 1, list);
            return ps8.mo46865a(list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    gv8.m44946a(zzbl.MODULUS.name(), 2, list);
                    return new e78(Double.valueOf(ps8.mo46865a(list.get(0)).mo29499b().doubleValue() % ps8.mo46865a(list.get(1)).mo29499b().doubleValue()));
                case 45:
                    gv8.m44946a(zzbl.MULTIPLY.name(), 2, list);
                    return new e78(Double.valueOf(ps8.mo46865a(list.get(0)).mo29499b().doubleValue() * ps8.mo46865a(list.get(1)).mo29499b().doubleValue()));
                case 46:
                    gv8.m44946a(zzbl.NEGATE.name(), 1, list);
                    return new e78(Double.valueOf(-ps8.mo46865a(list.get(0)).mo29499b().doubleValue()));
                default:
                    return super.mo45390b(str);
            }
        }
    }
}
