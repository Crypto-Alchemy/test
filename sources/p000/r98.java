package p000;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* renamed from: r98 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class r98 extends l98 {
    public r98() {
        this.f31222a.add(zzbl.EQUALS);
        this.f31222a.add(zzbl.GREATER_THAN);
        this.f31222a.add(zzbl.GREATER_THAN_EQUALS);
        this.f31222a.add(zzbl.IDENTITY_EQUALS);
        this.f31222a.add(zzbl.IDENTITY_NOT_EQUALS);
        this.f31222a.add(zzbl.LESS_THAN);
        this.f31222a.add(zzbl.LESS_THAN_EQUALS);
        this.f31222a.add(zzbl.NOT_EQUALS);
    }

    /* renamed from: c */
    public static boolean m51001c(r88 r88, r88 r882) {
        if (r88 instanceof y78) {
            r88 = new b98(r88.zzc());
        }
        if (r882 instanceof y78) {
            r882 = new b98(r882.zzc());
        }
        if (!(r88 instanceof b98) || !(r882 instanceof b98)) {
            double doubleValue = r88.mo29499b().doubleValue();
            double doubleValue2 = r882.mo29499b().doubleValue();
            if (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || Double.compare(doubleValue, doubleValue2) >= 0) {
                return false;
            }
            return true;
        } else if (r88.zzc().compareTo(r882.zzc()) < 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m51002d(r88 r88, r88 r882) {
        if (r88.getClass().equals(r882.getClass())) {
            if ((r88 instanceof f98) || (r88 instanceof i88)) {
                return true;
            }
            if (r88 instanceof e78) {
                if (Double.isNaN(r88.mo29499b().doubleValue()) || Double.isNaN(r882.mo29499b().doubleValue())) {
                    return false;
                }
                return r88.mo29499b().equals(r882.mo29499b());
            } else if (r88 instanceof b98) {
                return r88.zzc().equals(r882.zzc());
            } else {
                if (r88 instanceof s68) {
                    return r88.mo29500c().equals(r882.mo29500c());
                }
                if (r88 == r882) {
                    return true;
                }
                return false;
            }
        } else if (((r88 instanceof f98) || (r88 instanceof i88)) && ((r882 instanceof f98) || (r882 instanceof i88))) {
            return true;
        } else {
            boolean z = r88 instanceof e78;
            if (z && (r882 instanceof b98)) {
                return m51002d(r88, new e78(r882.mo29499b()));
            }
            boolean z2 = r88 instanceof b98;
            if (z2 && (r882 instanceof e78)) {
                return m51002d(new e78(r88.mo29499b()), r882);
            }
            if (r88 instanceof s68) {
                return m51002d(new e78(r88.mo29499b()), r882);
            }
            if (r882 instanceof s68) {
                return m51002d(r88, new e78(r882.mo29499b()));
            }
            if ((z2 || z) && (r882 instanceof y78)) {
                return m51002d(r88, new b98(r882.zzc()));
            }
            if (!(r88 instanceof y78) || (!(r882 instanceof b98) && !(r882 instanceof e78))) {
                return false;
            }
            return m51002d(new b98(r88.zzc()), r882);
        }
    }

    /* renamed from: e */
    public static boolean m51003e(r88 r88, r88 r882) {
        if (r88 instanceof y78) {
            r88 = new b98(r88.zzc());
        }
        if (r882 instanceof y78) {
            r882 = new b98(r882.zzc());
        }
        if (((!(r88 instanceof b98) || !(r882 instanceof b98)) && (Double.isNaN(r88.mo29499b().doubleValue()) || Double.isNaN(r882.mo29499b().doubleValue()))) || m51001c(r882, r88)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final r88 mo28916a(String str, ps8 ps8, List<r88> list) {
        boolean z;
        boolean d;
        gv8.m44946a(gv8.m44950e(str).name(), 2, list);
        r88 a = ps8.mo46865a(list.get(0));
        r88 a2 = ps8.mo46865a(list.get(1));
        int ordinal = gv8.m44950e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                d = m51002d(a, a2);
            } else if (ordinal == 42) {
                z = m51001c(a, a2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m51001c(a2, a);
                        break;
                    case 38:
                        z = m51003e(a2, a);
                        break;
                    case 39:
                        z = gv8.m44951f(a, a2);
                        break;
                    case 40:
                        d = gv8.m44951f(a, a2);
                        break;
                    default:
                        return super.mo45390b(str);
                }
            } else {
                z = m51003e(a, a2);
            }
            z = !d;
        } else {
            z = m51002d(a, a2);
        }
        if (z) {
            return r88.f33335l1;
        }
        return r88.f33336m1;
    }
}
