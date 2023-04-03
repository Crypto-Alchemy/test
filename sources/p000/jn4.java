package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: jn4 */
/* compiled from: Period */
public class jn4 {

    /* renamed from: a */
    public final String f13722a;

    /* renamed from: b */
    public final long f13723b;

    /* renamed from: c */
    public final List<C2751lb> f13724c;

    /* renamed from: d */
    public final List<ju1> f13725d;

    /* renamed from: e */
    public final sc1 f13726e;

    public jn4(String str, long j, List<C2751lb> list, List<ju1> list2) {
        this(str, j, list, list2, (sc1) null);
    }

    /* renamed from: a */
    public int mo21985a(int i) {
        int size = this.f13724c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f13724c.get(i2).f14464b == i) {
                return i2;
            }
        }
        return -1;
    }

    public jn4(String str, long j, List<C2751lb> list, List<ju1> list2, sc1 sc1) {
        this.f13722a = str;
        this.f13723b = j;
        this.f13724c = Collections.unmodifiableList(list);
        this.f13725d = Collections.unmodifiableList(list2);
        this.f13726e = sc1;
    }
}
