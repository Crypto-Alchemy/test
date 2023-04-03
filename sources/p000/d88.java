package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: d88 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public class d88 implements r88, y78 {

    /* renamed from: a */
    public final Map<String, r88> f28048a = new HashMap();

    /* renamed from: a */
    public final List<String> mo41859a() {
        return new ArrayList(this.f28048a.keySet());
    }

    /* renamed from: b */
    public final Double mo29499b() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: c */
    public final Boolean mo29500c() {
        return Boolean.TRUE;
    }

    /* renamed from: e */
    public final Iterator<r88> mo29501e() {
        return o78.m49185b(this.f28048a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d88)) {
            return false;
        }
        return this.f28048a.equals(((d88) obj).f28048a);
    }

    public final int hashCode() {
        return this.f28048a.hashCode();
    }

    /* renamed from: j */
    public final r88 mo41862j(String str) {
        if (this.f28048a.containsKey(str)) {
            return this.f28048a.get(str);
        }
        return r88.f33330g1;
    }

    /* renamed from: k */
    public final void mo41863k(String str, r88 r88) {
        if (r88 == null) {
            this.f28048a.remove(str);
        } else {
            this.f28048a.put(str, r88);
        }
    }

    /* renamed from: n */
    public final r88 mo29505n() {
        d88 d88 = new d88();
        for (Map.Entry next : this.f28048a.entrySet()) {
            if (next.getValue() instanceof y78) {
                d88.f28048a.put((String) next.getKey(), (r88) next.getValue());
            } else {
                d88.f28048a.put((String) next.getKey(), ((r88) next.getValue()).mo29505n());
            }
        }
        return d88;
    }

    /* renamed from: o */
    public r88 mo29506o(String str, ps8 ps8, List<r88> list) {
        if ("toString".equals(str)) {
            return new b98(toString());
        }
        return o78.m49184a(this, new b98(str), ps8, list);
    }

    /* renamed from: q */
    public final boolean mo41864q(String str) {
        return this.f28048a.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f28048a.isEmpty()) {
            for (String next : this.f28048a.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{next, this.f28048a.get(next)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    public final String zzc() {
        return "[object Object]";
    }
}
