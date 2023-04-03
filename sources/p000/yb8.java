package p000;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.Iterator;
import java.util.List;

/* renamed from: yb8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class yb8 extends l98 {
    public yb8() {
        this.f31222a.add(zzbl.FOR_IN);
        this.f31222a.add(zzbl.FOR_IN_CONST);
        this.f31222a.add(zzbl.FOR_IN_LET);
        this.f31222a.add(zzbl.FOR_LET);
        this.f31222a.add(zzbl.FOR_OF);
        this.f31222a.add(zzbl.FOR_OF_CONST);
        this.f31222a.add(zzbl.FOR_OF_LET);
        this.f31222a.add(zzbl.WHILE);
    }

    /* renamed from: c */
    public static r88 m54692c(sb8 sb8, r88 r88, r88 r882) {
        return m54694e(sb8, r88.mo29501e(), r882);
    }

    /* renamed from: d */
    public static r88 m54693d(sb8 sb8, r88 r88, r88 r882) {
        if (r88 instanceof Iterable) {
            return m54694e(sb8, ((Iterable) r88).iterator(), r882);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: e */
    public static r88 m54694e(sb8 sb8, Iterator<r88> it, r88 r88) {
        if (it != null) {
            while (it.hasNext()) {
                r88 b = sb8.mo45738a(it.next()).mo46866b((k68) r88);
                if (b instanceof y68) {
                    y68 y68 = (y68) b;
                    if ("break".equals(y68.mo49603d())) {
                        return r88.f33330g1;
                    }
                    if ("return".equals(y68.mo49603d())) {
                        return y68;
                    }
                }
            }
        }
        return r88.f33330g1;
    }

    /* renamed from: a */
    public final r88 mo28916a(String str, ps8 ps8, List<r88> list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = gv8.m44950e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    gv8.m44946a(zzbl.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof b98) {
                        return m54692c(new wb8(ps8, list.get(0).zzc()), ps8.mo46865a(list.get(1)), ps8.mo46865a(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    gv8.m44946a(zzbl.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof b98) {
                        return m54692c(new mb8(ps8, list.get(0).zzc()), ps8.mo46865a(list.get(1)), ps8.mo46865a(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    gv8.m44946a(zzbl.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof b98) {
                        return m54692c(new rb8(ps8, list.get(0).zzc()), ps8.mo46865a(list.get(1)), ps8.mo46865a(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    gv8.m44946a(zzbl.FOR_LET.name(), 4, list);
                    r88 a = ps8.mo46865a(list.get(0));
                    if (a instanceof k68) {
                        k68 k68 = (k68) a;
                        r88 r88 = list.get(1);
                        r88 r882 = list.get(2);
                        r88 a2 = ps8.mo46865a(list.get(3));
                        ps8 c = ps8.mo46867c();
                        for (int i = 0; i < k68.mo44682t(); i++) {
                            String zzc = k68.mo44685w(i).zzc();
                            c.mo46869e(zzc, ps8.mo46872h(zzc));
                        }
                        while (ps8.mo46865a(r88).mo29500c().booleanValue()) {
                            r88 b = ps8.mo46866b((k68) a2);
                            if (b instanceof y68) {
                                y68 y68 = (y68) b;
                                if ("break".equals(y68.mo49603d())) {
                                    return r88.f33330g1;
                                }
                                if ("return".equals(y68.mo49603d())) {
                                    return y68;
                                }
                            }
                            ps8 c2 = ps8.mo46867c();
                            for (int i2 = 0; i2 < k68.mo44682t(); i2++) {
                                String zzc2 = k68.mo44685w(i2).zzc();
                                c2.mo46869e(zzc2, c.mo46872h(zzc2));
                            }
                            c2.mo46865a(r882);
                            c = c2;
                        }
                        return r88.f33330g1;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    gv8.m44946a(zzbl.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof b98) {
                        return m54693d(new wb8(ps8, list.get(0).zzc()), ps8.mo46865a(list.get(1)), ps8.mo46865a(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    gv8.m44946a(zzbl.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof b98) {
                        return m54693d(new mb8(ps8, list.get(0).zzc()), ps8.mo46865a(list.get(1)), ps8.mo46865a(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    gv8.m44946a(zzbl.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof b98) {
                        return m54693d(new rb8(ps8, list.get(0).zzc()), ps8.mo46865a(list.get(1)), ps8.mo46865a(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.mo45390b(str);
            }
        } else {
            gv8.m44946a(zzbl.WHILE.name(), 4, list);
            r88 r883 = list.get(0);
            r88 r884 = list.get(1);
            r88 a3 = ps8.mo46865a(list.get(3));
            if (ps8.mo46865a(list.get(2)).mo29500c().booleanValue()) {
                r88 b2 = ps8.mo46866b((k68) a3);
                if (b2 instanceof y68) {
                    y68 y682 = (y68) b2;
                    if ("break".equals(y682.mo49603d())) {
                        return r88.f33330g1;
                    }
                    if ("return".equals(y682.mo49603d())) {
                        return y682;
                    }
                }
            }
            while (ps8.mo46865a(r883).mo29500c().booleanValue()) {
                r88 b3 = ps8.mo46866b((k68) a3);
                if (b3 instanceof y68) {
                    y68 y683 = (y68) b3;
                    if ("break".equals(y683.mo49603d())) {
                        return r88.f33330g1;
                    }
                    if ("return".equals(y683.mo49603d())) {
                        return y683;
                    }
                }
                ps8.mo46865a(r884);
            }
            return r88.f33330g1;
        }
    }
}
