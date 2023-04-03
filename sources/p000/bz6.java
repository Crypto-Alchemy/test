package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: bz6 */
/* compiled from: Tx3gSubtitle */
public final class bz6 implements xc6 {

    /* renamed from: d */
    public static final bz6 f8312d = new bz6();

    /* renamed from: a */
    public final List<dx0> f8313a;

    public bz6(dx0 dx0) {
        this.f8313a = Collections.singletonList(dx0);
    }

    /* renamed from: a */
    public int mo11948a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: d */
    public List<dx0> mo11949d(long j) {
        if (j >= 0) {
            return this.f8313a;
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

    public bz6() {
        this.f8313a = Collections.emptyList();
    }
}
