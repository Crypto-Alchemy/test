package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: sk7 */
/* compiled from: WebvttSubtitle */
public final class sk7 implements xc6 {

    /* renamed from: a */
    public final List<mk7> f17698a;

    /* renamed from: d */
    public final long[] f17699d;

    /* renamed from: e */
    public final long[] f17700e;

    public sk7(List<mk7> list) {
        this.f17698a = Collections.unmodifiableList(new ArrayList(list));
        this.f17699d = new long[(list.size() * 2)];
        for (int i = 0; i < list.size(); i++) {
            mk7 mk7 = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f17699d;
            jArr[i2] = mk7.f15000b;
            jArr[i2 + 1] = mk7.f15001c;
        }
        long[] jArr2 = this.f17699d;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f17700e = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: a */
    public int mo11948a(long j) {
        int e = w67.m29350e(this.f17700e, j, false, false);
        if (e < this.f17700e.length) {
            return e;
        }
        return -1;
    }

    /* renamed from: d */
    public List<dx0> mo11949d(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f17698a.size(); i++) {
            long[] jArr = this.f17699d;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                mk7 mk7 = this.f17698a.get(i);
                dx0 dx0 = mk7.f14999a;
                if (dx0.f10947k == -3.4028235E38f) {
                    arrayList2.add(mk7);
                } else {
                    arrayList.add(dx0);
                }
            }
        }
        Collections.sort(arrayList2, new rk7());
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((mk7) arrayList2.get(i3)).f14999a.mo18976b().mo18986h((float) (-1 - i3), 1).mo18979a());
        }
        return arrayList;
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
        if (i >= this.f17700e.length) {
            z2 = false;
        }
        C2725kr.m20981a(z2);
        return this.f17700e[i];
    }

    /* renamed from: f */
    public int mo11951f() {
        return this.f17700e.length;
    }
}
