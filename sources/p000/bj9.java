package p000;

import java.util.List;

/* renamed from: bj9 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class bj9 extends j78 {

    /* renamed from: e */
    public final pk9 f21352e;

    public bj9(pk9 pk9) {
        super("internal.registerCallback");
        this.f21352e = pk9;
    }

    /* renamed from: a */
    public final r88 mo29623a(ps8 ps8, List<r88> list) {
        int i;
        gv8.m44946a(this.f30236a, 3, list);
        String zzc = ps8.mo46865a(list.get(0)).zzc();
        r88 a = ps8.mo46865a(list.get(1));
        if (a instanceof l88) {
            r88 a2 = ps8.mo46865a(list.get(2));
            if (a2 instanceof d88) {
                d88 d88 = (d88) a2;
                if (d88.mo41864q("type")) {
                    String zzc2 = d88.mo41862j("type").zzc();
                    if (d88.mo41864q("priority")) {
                        i = gv8.m44952g(d88.mo41862j("priority").mo29499b().doubleValue());
                    } else {
                        i = 1000;
                    }
                    this.f21352e.mo46769a(zzc, i, (l88) a, zzc2);
                    return r88.f33330g1;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
