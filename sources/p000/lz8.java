package p000;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: lz8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class lz8 implements sa9 {

    /* renamed from: a */
    public final zzii f31464a;

    public lz8(zzii zzii) {
        zzii zzii2 = (zzii) t19.m52049f(zzii, "output");
        this.f31464a = zzii2;
        zzii2.f22985a = this;
    }

    /* renamed from: O */
    public static lz8 m47981O(zzii zzii) {
        lz8 lz8 = zzii.f22985a;
        if (lz8 != null) {
            return lz8;
        }
        return new lz8(zzii);
    }

    /* renamed from: A */
    public final void mo45553A(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34414r0(list.get(i4).longValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31281Z(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31280Y(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo45554B(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34406i0(list.get(i4).longValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31299t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31293n(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo45555C(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34422z(list.get(i4).doubleValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31286h(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31290k(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: D */
    public final void mo45556D(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34375A(list.get(i4).floatValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31287i(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31291l(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo45557E(int i, boolean z) throws IOException {
        this.f31464a.mo31298s(i, z);
    }

    /* renamed from: F */
    public final void mo45558F(int i, int i2) throws IOException {
        this.f31464a.mo31274P(i, i2);
    }

    /* renamed from: G */
    public final void mo45559G(int i, List<?> list, g79 g79) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo45561I(i, list.get(i2), g79);
        }
    }

    /* renamed from: H */
    public final void mo45560H(int i, Object obj, g79 g79) throws IOException {
        zzii zzii = this.f31464a;
        zzii.mo31292m(i, 3);
        g79.mo31212h((k59) obj, zzii.f22985a);
        zzii.mo31292m(i, 4);
    }

    /* renamed from: I */
    public final void mo45561I(int i, Object obj, g79 g79) throws IOException {
        this.f31464a.mo31297r(i, (k59) obj, g79);
    }

    /* renamed from: J */
    public final void mo45562J(int i, List<?> list, g79 g79) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo45560H(i, list.get(i2), g79);
        }
    }

    /* renamed from: K */
    public final void mo45563K(int i, long j) throws IOException {
        this.f31464a.mo31280Y(i, j);
    }

    /* renamed from: L */
    public final void mo45564L(int i, long j) throws IOException {
        this.f31464a.mo31275Q(i, j);
    }

    /* renamed from: M */
    public final void mo45565M(int i, zzht zzht) throws IOException {
        this.f31464a.mo31294o(i, zzht);
    }

    /* renamed from: N */
    public final <K, V> void mo45566N(int i, v49<K, V> v49, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.f31464a.mo31292m(i, 2);
            this.f31464a.mo31273O(p49.m49792a(v49, next.getKey(), next.getValue()));
            p49.m49793b(this.f31464a, v49, next.getKey(), next.getValue());
        }
    }

    /* renamed from: a */
    public final void mo45567a(int i, long j) throws IOException {
        this.f31464a.mo31280Y(i, j);
    }

    /* renamed from: b */
    public final void mo45568b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34407k0(list.get(i4).intValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31288j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31274P(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo45569c(int i, int i2) throws IOException {
        this.f31464a.mo31274P(i, i2);
    }

    /* renamed from: d */
    public final void mo45570d(int i) throws IOException {
        this.f31464a.mo31292m(i, 3);
    }

    /* renamed from: e */
    public final void mo45571e(int i, long j) throws IOException {
        this.f31464a.mo31293n(i, j);
    }

    /* renamed from: f */
    public final void mo45572f(int i, Object obj) throws IOException {
        if (obj instanceof zzht) {
            this.f31464a.mo31276R(i, (zzht) obj);
        } else {
            this.f31464a.mo31296q(i, (k59) obj);
        }
    }

    /* renamed from: g */
    public final void mo45573g(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34401d0(list.get(i4).longValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31299t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31293n(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo45574h(int i) throws IOException {
        this.f31464a.mo31292m(i, 4);
    }

    /* renamed from: i */
    public final void mo45575i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34419w0(list.get(i4).intValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31283e0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31289j0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo45576j(int i, int i2) throws IOException {
        this.f31464a.mo31289j0(i, i2);
    }

    /* renamed from: k */
    public final void mo45577k(int i, long j) throws IOException {
        this.f31464a.mo31293n(i, j);
    }

    /* renamed from: l */
    public final void mo45578l(int i, double d) throws IOException {
        this.f31464a.mo31290k(i, d);
    }

    /* renamed from: m */
    public final void mo45579m(int i, float f) throws IOException {
        this.f31464a.mo31291l(i, f);
    }

    /* renamed from: n */
    public final void mo45580n(int i, int i2) throws IOException {
        this.f31464a.mo31284f0(i, i2);
    }

    /* renamed from: o */
    public final void mo45581o(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34410n0(list.get(i4).longValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31277S(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31275Q(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo45582p(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34415s0(list.get(i4).intValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31278W(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31284f0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: q */
    public final void mo45583q(int i, List<zzht> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f31464a.mo31294o(i, list.get(i2));
        }
    }

    /* renamed from: r */
    public final void mo45584r(int i, int i2) throws IOException {
        this.f31464a.mo31289j0(i, i2);
    }

    /* renamed from: s */
    public final void mo45585s(int i, int i2) throws IOException {
        this.f31464a.mo31279X(i, i2);
    }

    /* renamed from: t */
    public final void mo45586t(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof k39) {
            k39 k39 = (k39) list;
            while (i2 < list.size()) {
                Object h = k39.mo28816h(i2);
                if (h instanceof String) {
                    this.f31464a.mo31295p(i, (String) h);
                } else {
                    this.f31464a.mo31294o(i, (zzht) h);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31295p(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: u */
    public final void mo45587u(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34391L(list.get(i4).booleanValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31304y(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31298s(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo45588v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34378B0(list.get(i4).intValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31288j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31274P(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: w */
    public final void mo45589w(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34418v0(list.get(i4).longValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31281Z(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31280Y(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo45590x(int i, String str) throws IOException {
        this.f31464a.mo31295p(i, str);
    }

    /* renamed from: y */
    public final void mo45591y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34411o0(list.get(i4).intValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31273O(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31279X(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo45592z(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f31464a.mo31292m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m34423z0(list.get(i4).intValue());
            }
            this.f31464a.mo31273O(i3);
            while (i2 < list.size()) {
                this.f31464a.mo31283e0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f31464a.mo31289j0(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final int zza() {
        return qa9.f33039a;
    }
}
