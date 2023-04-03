package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: n46 */
/* compiled from: SlidingPercentile */
public class n46 {

    /* renamed from: h */
    public static final Comparator<C2866b> f15341h = new l46();

    /* renamed from: i */
    public static final Comparator<C2866b> f15342i = new m46();

    /* renamed from: a */
    public final int f15343a;

    /* renamed from: b */
    public final ArrayList<C2866b> f15344b = new ArrayList<>();

    /* renamed from: c */
    public final C2866b[] f15345c = new C2866b[5];

    /* renamed from: d */
    public int f15346d = -1;

    /* renamed from: e */
    public int f15347e;

    /* renamed from: f */
    public int f15348f;

    /* renamed from: g */
    public int f15349g;

    /* renamed from: n46$b */
    /* compiled from: SlidingPercentile */
    public static class C2866b {

        /* renamed from: a */
        public int f15350a;

        /* renamed from: b */
        public int f15351b;

        /* renamed from: c */
        public float f15352c;

        public C2866b() {
        }
    }

    public n46(int i) {
        this.f15343a = i;
    }

    /* renamed from: g */
    public static /* synthetic */ int m22794g(C2866b bVar, C2866b bVar2) {
        return bVar.f15350a - bVar2.f15350a;
    }

    /* renamed from: c */
    public void mo23506c(int i, float f) {
        C2866b bVar;
        mo23507d();
        int i2 = this.f15349g;
        if (i2 > 0) {
            C2866b[] bVarArr = this.f15345c;
            int i3 = i2 - 1;
            this.f15349g = i3;
            bVar = bVarArr[i3];
        } else {
            bVar = new C2866b();
        }
        int i4 = this.f15347e;
        this.f15347e = i4 + 1;
        bVar.f15350a = i4;
        bVar.f15351b = i;
        bVar.f15352c = f;
        this.f15344b.add(bVar);
        this.f15348f += i;
        while (true) {
            int i5 = this.f15348f;
            int i6 = this.f15343a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C2866b bVar2 = this.f15344b.get(0);
                int i8 = bVar2.f15351b;
                if (i8 <= i7) {
                    this.f15348f -= i8;
                    this.f15344b.remove(0);
                    int i9 = this.f15349g;
                    if (i9 < 5) {
                        C2866b[] bVarArr2 = this.f15345c;
                        this.f15349g = i9 + 1;
                        bVarArr2[i9] = bVar2;
                    }
                } else {
                    bVar2.f15351b = i8 - i7;
                    this.f15348f -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo23507d() {
        if (this.f15346d != 1) {
            Collections.sort(this.f15344b, f15341h);
            this.f15346d = 1;
        }
    }

    /* renamed from: e */
    public final void mo23508e() {
        if (this.f15346d != 0) {
            Collections.sort(this.f15344b, f15342i);
            this.f15346d = 0;
        }
    }

    /* renamed from: f */
    public float mo23509f(float f) {
        mo23508e();
        float f2 = f * ((float) this.f15348f);
        int i = 0;
        for (int i2 = 0; i2 < this.f15344b.size(); i2++) {
            C2866b bVar = this.f15344b.get(i2);
            i += bVar.f15351b;
            if (((float) i) >= f2) {
                return bVar.f15352c;
            }
        }
        if (this.f15344b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<C2866b> arrayList = this.f15344b;
        return arrayList.get(arrayList.size() - 1).f15352c;
    }

    /* renamed from: i */
    public void mo23510i() {
        this.f15344b.clear();
        this.f15346d = -1;
        this.f15347e = 0;
        this.f15348f = 0;
    }
}
