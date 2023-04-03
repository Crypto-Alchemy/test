package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: s76 */
/* compiled from: SsaSubtitle */
public final class s76 implements xc6 {

    /* renamed from: a */
    public final List<List<dx0>> f17517a;

    /* renamed from: d */
    public final List<Long> f17518d;

    public s76(List<List<dx0>> list, List<Long> list2) {
        this.f17517a = list;
        this.f17518d = list2;
    }

    /* renamed from: a */
    public int mo11948a(long j) {
        int d = w67.m29348d(this.f17518d, Long.valueOf(j), false, false);
        if (d < this.f17518d.size()) {
            return d;
        }
        return -1;
    }

    /* renamed from: d */
    public List<dx0> mo11949d(long j) {
        int g = w67.m29354g(this.f17518d, Long.valueOf(j), true, false);
        if (g == -1) {
            return Collections.emptyList();
        }
        return this.f17517a.get(g);
    }

    /* renamed from: e */
    public long mo11950e(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        if (i >= this.f17518d.size()) {
            z2 = false;
        }
        C2725kr.m20981a(z2);
        return this.f17518d.get(i).longValue();
    }

    /* renamed from: f */
    public int mo11951f() {
        return this.f17518d.size();
    }
}
