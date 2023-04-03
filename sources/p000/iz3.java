package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: iz3 */
/* compiled from: Mp4WebvttSubtitle */
public final class iz3 implements xc6 {

    /* renamed from: a */
    public final List<dx0> f13469a;

    public iz3(List<dx0> list) {
        this.f13469a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public int mo11948a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: d */
    public List<dx0> mo11949d(long j) {
        if (j >= 0) {
            return this.f13469a;
        }
        return Collections.emptyList();
    }

    /* renamed from: e */
    public long mo11950e(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        return 0;
    }

    /* renamed from: f */
    public int mo11951f() {
        return 1;
    }
}
