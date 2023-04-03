package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: j78 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public abstract class j78 implements r88, y78 {

    /* renamed from: a */
    public final String f30236a;

    /* renamed from: d */
    public final Map<String, r88> f30237d = new HashMap();

    public j78(String str) {
        this.f30236a = str;
    }

    /* renamed from: a */
    public abstract r88 mo29623a(ps8 ps8, List<r88> list);

    /* renamed from: b */
    public final Double mo29499b() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: c */
    public final Boolean mo29500c() {
        return Boolean.TRUE;
    }

    /* renamed from: d */
    public final String mo44059d() {
        return this.f30236a;
    }

    /* renamed from: e */
    public final Iterator<r88> mo29501e() {
        return o78.m49185b(this.f30237d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j78)) {
            return false;
        }
        j78 j78 = (j78) obj;
        String str = this.f30236a;
        if (str != null) {
            return str.equals(j78.f30236a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f30236a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: j */
    public final r88 mo41862j(String str) {
        if (this.f30237d.containsKey(str)) {
            return this.f30237d.get(str);
        }
        return r88.f33330g1;
    }

    /* renamed from: k */
    public final void mo41863k(String str, r88 r88) {
        if (r88 == null) {
            this.f30237d.remove(str);
        } else {
            this.f30237d.put(str, r88);
        }
    }

    /* renamed from: n */
    public r88 mo29505n() {
        return this;
    }

    /* renamed from: o */
    public final r88 mo29506o(String str, ps8 ps8, List<r88> list) {
        if ("toString".equals(str)) {
            return new b98(this.f30236a);
        }
        return o78.m49184a(this, new b98(str), ps8, list);
    }

    /* renamed from: q */
    public final boolean mo41864q(String str) {
        return this.f30237d.containsKey(str);
    }

    public final String zzc() {
        return this.f30236a;
    }
}
