package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: mc6 */
/* compiled from: SubripSubtitle */
public final class mc6 implements xc6 {

    /* renamed from: a */
    public final dx0[] f14940a;

    /* renamed from: d */
    public final long[] f14941d;

    public mc6(dx0[] dx0Arr, long[] jArr) {
        this.f14940a = dx0Arr;
        this.f14941d = jArr;
    }

    /* renamed from: a */
    public int mo11948a(long j) {
        int e = w67.m29350e(this.f14941d, j, false, false);
        if (e < this.f14941d.length) {
            return e;
        }
        return -1;
    }

    /* renamed from: d */
    public List<dx0> mo11949d(long j) {
        dx0 dx0;
        int i = w67.m29358i(this.f14941d, j, true, false);
        if (i == -1 || (dx0 = this.f14940a[i]) == dx0.f10933Q) {
            return Collections.emptyList();
        }
        return Collections.singletonList(dx0);
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
        if (i >= this.f14941d.length) {
            z2 = false;
        }
        C2725kr.m20981a(z2);
        return this.f14941d[i];
    }

    /* renamed from: f */
    public int mo11951f() {
        return this.f14941d.length;
    }
}
