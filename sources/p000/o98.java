package p000;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o98 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class o98 {

    /* renamed from: a */
    public final Map<String, l98> f32338a = new HashMap();

    /* renamed from: b */
    public final bc8 f32339b = new bc8();

    public o98() {
        mo46364a(new i98());
        mo46364a(new r98());
        mo46364a(new u98());
        mo46364a(new ib8());
        mo46364a(new yb8());
        mo46364a(new ac8());
        mo46364a(new fc8());
    }

    /* renamed from: a */
    public final void mo46364a(l98 l98) {
        for (zzbl zzb : l98.f31222a) {
            this.f32338a.put(zzb.zzb().toString(), l98);
        }
    }

    /* renamed from: b */
    public final r88 mo46365b(ps8 ps8, r88 r88) {
        l98 l98;
        gv8.m44956k(ps8);
        if (!(r88 instanceof u88)) {
            return r88;
        }
        u88 u88 = (u88) r88;
        ArrayList<r88> d = u88.mo48343d();
        String a = u88.mo48342a();
        if (this.f32338a.containsKey(a)) {
            l98 = this.f32338a.get(a);
        } else {
            l98 = this.f32339b;
        }
        return l98.mo28916a(a, ps8, d);
    }
}
