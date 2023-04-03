package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: qy6 */
/* compiled from: TtmlSubtitle */
public final class qy6 implements xc6 {

    /* renamed from: a */
    public final my6 f17093a;

    /* renamed from: d */
    public final long[] f17094d;

    /* renamed from: e */
    public final Map<String, py6> f17095e;

    /* renamed from: g */
    public final Map<String, ny6> f17096g;

    /* renamed from: k */
    public final Map<String, String> f17097k;

    public qy6(my6 my6, Map<String, py6> map, Map<String, ny6> map2, Map<String, String> map3) {
        Map<String, py6> map4;
        this.f17093a = my6;
        this.f17096g = map2;
        this.f17097k = map3;
        if (map != null) {
            map4 = Collections.unmodifiableMap(map);
        } else {
            map4 = Collections.emptyMap();
        }
        this.f17095e = map4;
        this.f17094d = my6.mo23428j();
    }

    /* renamed from: a */
    public int mo11948a(long j) {
        int e = w67.m29350e(this.f17094d, j, false, false);
        if (e < this.f17094d.length) {
            return e;
        }
        return -1;
    }

    /* renamed from: d */
    public List<dx0> mo11949d(long j) {
        return this.f17093a.mo23426h(j, this.f17095e, this.f17096g, this.f17097k);
    }

    /* renamed from: e */
    public long mo11950e(int i) {
        return this.f17094d[i];
    }

    /* renamed from: f */
    public int mo11951f() {
        return this.f17094d.length;
    }
}
