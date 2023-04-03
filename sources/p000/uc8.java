package p000;

import com.google.android.gms.internal.clearcut.C4056e;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: uc8 */
public final class uc8 implements dr8 {

    /* renamed from: a */
    public final zzbn f34579a;

    public uc8(zzbn zzbn) {
        zzbn zzbn2 = (zzbn) vf8.m53379e(zzbn, "output");
        this.f34579a = zzbn2;
        zzbn2.f22483a = this;
    }

    /* renamed from: d */
    public static uc8 m52744d(zzbn zzbn) {
        uc8 uc8 = zzbn.f22483a;
        return uc8 != null ? uc8 : new uc8(zzbn);
    }

    /* renamed from: A */
    public final void mo41995A(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33984p0(list.get(i4).longValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30831c0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30826U(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo41996B(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33978h0(list.get(i4).longValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30823L(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30839l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo41997C(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33992w(list.get(i4).doubleValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30834h(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30837j(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: D */
    public final void mo41998D(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33994x(list.get(i4).floatValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30835i(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30838k(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo41999E(int i, boolean z) throws IOException {
        this.f34579a.mo30822K(i, z);
    }

    /* renamed from: F */
    public final void mo42000F(int i) throws IOException {
        this.f34579a.mo30818G(i, 4);
    }

    /* renamed from: G */
    public final void mo42001G(int i, zzbb zzbb) throws IOException {
        this.f34579a.mo30840m(i, zzbb);
    }

    /* renamed from: H */
    public final int mo42002H() {
        return C4056e.C4061e.f22465l;
    }

    /* renamed from: I */
    public final void mo42003I(int i, long j) throws IOException {
        this.f34579a.mo30826U(i, j);
    }

    /* renamed from: J */
    public final void mo42004J(int i, List<?> list, hm8 hm8) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo42009O(i, list.get(i2), hm8);
        }
    }

    /* renamed from: K */
    public final <K, V> void mo42005K(int i, dj8<K, V> dj8, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.f34579a.mo30818G(i, 2);
            this.f34579a.mo30851y0(bj8.m32591a(dj8, next.getKey(), next.getValue()));
            bj8.m32592b(this.f34579a, dj8, next.getKey(), next.getValue());
        }
    }

    /* renamed from: L */
    public final void mo42006L(int i, List<?> list, hm8 hm8) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo42007M(i, list.get(i2), hm8);
        }
    }

    /* renamed from: M */
    public final void mo42007M(int i, Object obj, hm8 hm8) throws IOException {
        zzbn zzbn = this.f34579a;
        zzbn.mo30818G(i, 3);
        hm8.mo41963i((tj8) obj, zzbn.f22483a);
        zzbn.mo30818G(i, 4);
    }

    /* renamed from: N */
    public final void mo42008N(int i, long j) throws IOException {
        this.f34579a.mo30839l(i, j);
    }

    /* renamed from: O */
    public final void mo42009O(int i, Object obj, hm8 hm8) throws IOException {
        this.f34579a.mo30844p(i, (tj8) obj, hm8);
    }

    /* renamed from: P */
    public final void mo42010P(int i, int i2) throws IOException {
        this.f34579a.mo30825T(i, i2);
    }

    /* renamed from: Q */
    public final void mo42011Q(int i) throws IOException {
        this.f34579a.mo30818G(i, 3);
    }

    /* renamed from: R */
    public final void mo42012R(int i, int i2) throws IOException {
        this.f34579a.mo30836i0(i, i2);
    }

    /* renamed from: a */
    public final void mo42013a(int i, long j) throws IOException {
        this.f34579a.mo30819H(i, j);
    }

    /* renamed from: b */
    public final void mo42014b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33950C0(list.get(i4).intValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30850x0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30825T(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo42015c(int i, int i2) throws IOException {
        this.f34579a.mo30825T(i, i2);
    }

    /* renamed from: e */
    public final void mo42016e(int i, long j) throws IOException {
        this.f34579a.mo30826U(i, j);
    }

    /* renamed from: f */
    public final void mo42017f(int i, Object obj) throws IOException {
        if (obj instanceof zzbb) {
            this.f34579a.mo30820I(i, (zzbb) obj);
        } else {
            this.f34579a.mo30821J(i, (tj8) obj);
        }
    }

    /* renamed from: g */
    public final void mo42018g(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33975e0(list.get(i4).longValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30823L(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30839l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo42019i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33956F0(list.get(i4).intValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30817A0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30836i0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo42020k(int i, long j) throws IOException {
        this.f34579a.mo30839l(i, j);
    }

    /* renamed from: l */
    public final void mo42021l(int i, double d) throws IOException {
        this.f34579a.mo30837j(i, d);
    }

    /* renamed from: m */
    public final void mo42022m(int i, float f) throws IOException {
        this.f34579a.mo30838k(i, f);
    }

    /* renamed from: n */
    public final void mo42023n(int i, int i2) throws IOException {
        this.f34579a.mo30836i0(i, i2);
    }

    /* renamed from: o */
    public final void mo42024o(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33981l0(list.get(i4).longValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30827V(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30819H(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo42025p(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33954E0(list.get(i4).intValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30852z0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30832f0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: q */
    public final void mo42026q(int i, List<zzbb> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f34579a.mo30840m(i, list.get(i2));
        }
    }

    /* renamed from: r */
    public final void mo42027r(int i, int i2) throws IOException {
        this.f34579a.mo30829b0(i, i2);
    }

    /* renamed from: s */
    public final void mo42028s(int i, int i2) throws IOException {
        this.f34579a.mo30832f0(i, i2);
    }

    /* renamed from: t */
    public final void mo42029t(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof ch8) {
            ch8 ch8 = (ch8) list;
            while (i2 < list.size()) {
                Object m = ch8.mo30011m(i2);
                if (m instanceof String) {
                    this.f34579a.mo30842n(i, (String) m);
                } else {
                    this.f34579a.mo30840m(i, (zzbb) m);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30842n(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: u */
    public final void mo42030u(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33955F(list.get(i4).booleanValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30848t(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30822K(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo42031v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33958H0(list.get(i4).intValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30850x0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30825T(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: w */
    public final void mo42032w(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33987s0(list.get(i4).longValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30831c0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30826U(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo42033x(int i, String str) throws IOException {
        this.f34579a.mo30842n(i, str);
    }

    /* renamed from: y */
    public final void mo42034y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33952D0(list.get(i4).intValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30851y0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30829b0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo42035z(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f34579a.mo30818G(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.m33957G0(list.get(i4).intValue());
            }
            this.f34579a.mo30851y0(i3);
            while (i2 < list.size()) {
                this.f34579a.mo30817A0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f34579a.mo30836i0(i, list.get(i2).intValue());
            i2++;
        }
    }
}
