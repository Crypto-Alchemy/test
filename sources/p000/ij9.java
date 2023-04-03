package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ij9 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class ij9 extends j78 {

    /* renamed from: e */
    public final c19 f29948e;

    /* renamed from: g */
    public final Map<String, j78> f29949g = new HashMap();

    public ij9(c19 c19) {
        super("require");
        this.f29948e = c19;
    }

    /* renamed from: a */
    public final r88 mo29623a(ps8 ps8, List<r88> list) {
        r88 r88;
        String str;
        gv8.m44946a("require", 1, list);
        String zzc = ps8.mo46865a(list.get(0)).zzc();
        if (this.f29949g.containsKey(zzc)) {
            return this.f29949g.get(zzc);
        }
        c19 c19 = this.f29948e;
        if (c19.f21575a.containsKey(zzc)) {
            try {
                r88 = (r88) c19.f21575a.get(zzc).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(zzc);
                if (valueOf.length() != 0) {
                    str = "Failed to create API implementation: ".concat(valueOf);
                } else {
                    str = new String("Failed to create API implementation: ");
                }
                throw new IllegalStateException(str);
            }
        } else {
            r88 = r88.f33330g1;
        }
        if (r88 instanceof j78) {
            this.f29949g.put(zzc, (j78) r88);
        }
        return r88;
    }
}
