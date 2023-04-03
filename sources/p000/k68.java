package p000;

import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: k68 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class k68 implements Iterable<r88>, r88, y78 {

    /* renamed from: a */
    public final SortedMap<Integer, r88> f30725a;

    /* renamed from: d */
    public final Map<String, r88> f30726d;

    public k68() {
        this.f30725a = new TreeMap();
        this.f30726d = new TreeMap();
    }

    @RequiresNonNull({"elements"})
    /* renamed from: A */
    public final void mo44671A(int i, r88 r88) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (r88 == null) {
            this.f30725a.remove(Integer.valueOf(i));
        } else {
            this.f30725a.put(Integer.valueOf(i), r88);
        }
    }

    /* renamed from: B */
    public final boolean mo44672B(int i) {
        if (i >= 0 && i <= this.f30725a.lastKey().intValue()) {
            return this.f30725a.containsKey(Integer.valueOf(i));
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: D */
    public final void mo44673D() {
        this.f30725a.clear();
    }

    /* renamed from: E */
    public final void mo44674E(int i, r88 r88) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid value index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= mo44682t()) {
            mo44671A(i, r88);
        } else {
            for (int intValue = this.f30725a.lastKey().intValue(); intValue >= i; intValue--) {
                SortedMap<Integer, r88> sortedMap = this.f30725a;
                Integer valueOf = Integer.valueOf(intValue);
                r88 r882 = sortedMap.get(valueOf);
                if (r882 != null) {
                    mo44671A(intValue + 1, r882);
                    this.f30725a.remove(valueOf);
                }
            }
            mo44671A(i, r88);
        }
    }

    /* renamed from: F */
    public final void mo44675F(int i) {
        int intValue = this.f30725a.lastKey().intValue();
        if (i <= intValue && i >= 0) {
            this.f30725a.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap<Integer, r88> sortedMap = this.f30725a;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f30725a.put(valueOf, r88.f33330g1);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= this.f30725a.lastKey().intValue()) {
                    SortedMap<Integer, r88> sortedMap2 = this.f30725a;
                    Integer valueOf2 = Integer.valueOf(i);
                    r88 r88 = sortedMap2.get(valueOf2);
                    if (r88 != null) {
                        this.f30725a.put(Integer.valueOf(i - 1), r88);
                        this.f30725a.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: H */
    public final String mo44676H(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f30725a.isEmpty()) {
            for (int i = 0; i < mo44682t(); i++) {
                r88 w = mo44685w(i);
                sb.append(str);
                if (!(w instanceof f98) && !(w instanceof i88)) {
                    sb.append(w.zzc());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final Double mo29499b() {
        if (this.f30725a.size() == 1) {
            return mo44685w(0).mo29499b();
        }
        if (this.f30725a.size() <= 0) {
            return Double.valueOf(Utils.DOUBLE_EPSILON);
        }
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: c */
    public final Boolean mo29500c() {
        return Boolean.TRUE;
    }

    /* renamed from: e */
    public final Iterator<r88> mo29501e() {
        return new u58(this, this.f30725a.keySet().iterator(), this.f30726d.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k68)) {
            return false;
        }
        k68 k68 = (k68) obj;
        if (mo44682t() != k68.mo44682t()) {
            return false;
        }
        if (this.f30725a.isEmpty()) {
            return k68.f30725a.isEmpty();
        }
        for (int intValue = this.f30725a.firstKey().intValue(); intValue <= this.f30725a.lastKey().intValue(); intValue++) {
            if (!mo44685w(intValue).equals(k68.mo44685w(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f30725a.hashCode() * 31;
    }

    public final Iterator<r88> iterator() {
        return new d68(this);
    }

    /* renamed from: j */
    public final r88 mo41862j(String str) {
        r88 r88;
        if ("length".equals(str)) {
            return new e78(Double.valueOf((double) mo44682t()));
        }
        if (!mo41864q(str) || (r88 = this.f30726d.get(str)) == null) {
            return r88.f33330g1;
        }
        return r88;
    }

    /* renamed from: k */
    public final void mo41863k(String str, r88 r88) {
        if (r88 == null) {
            this.f30726d.remove(str);
        } else {
            this.f30726d.put(str, r88);
        }
    }

    /* renamed from: n */
    public final r88 mo29505n() {
        k68 k68 = new k68();
        for (Map.Entry next : this.f30725a.entrySet()) {
            if (next.getValue() instanceof y78) {
                k68.f30725a.put((Integer) next.getKey(), (r88) next.getValue());
            } else {
                k68.f30725a.put((Integer) next.getKey(), ((r88) next.getValue()).mo29505n());
            }
        }
        return k68;
    }

    /* renamed from: o */
    public final r88 mo29506o(String str, ps8 ps8, List<r88> list) {
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            return hb8.m45101a(str, this, ps8, list);
        }
        return o78.m49184a(this, new b98(str), ps8, list);
    }

    /* renamed from: q */
    public final boolean mo41864q(String str) {
        if ("length".equals(str) || this.f30726d.containsKey(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final List<r88> mo44680r() {
        ArrayList arrayList = new ArrayList(mo44682t());
        for (int i = 0; i < mo44682t(); i++) {
            arrayList.add(mo44685w(i));
        }
        return arrayList;
    }

    /* renamed from: s */
    public final Iterator<Integer> mo44681s() {
        return this.f30725a.keySet().iterator();
    }

    /* renamed from: t */
    public final int mo44682t() {
        if (this.f30725a.isEmpty()) {
            return 0;
        }
        return this.f30725a.lastKey().intValue() + 1;
    }

    public final String toString() {
        return mo44676H(",");
    }

    /* renamed from: u */
    public final int mo44684u() {
        return this.f30725a.size();
    }

    /* renamed from: w */
    public final r88 mo44685w(int i) {
        r88 r88;
        if (i >= mo44682t()) {
            throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
        } else if (!mo44672B(i) || (r88 = this.f30725a.get(Integer.valueOf(i))) == null) {
            return r88.f33330g1;
        } else {
            return r88;
        }
    }

    public final String zzc() {
        return mo44676H(",");
    }

    public k68(List<r88> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo44671A(i, list.get(i));
            }
        }
    }
}
