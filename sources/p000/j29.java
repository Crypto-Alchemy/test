package p000;

import com.google.android.gms.internal.measurement.C4085b;
import com.google.android.gms.internal.measurement.C4086c;
import com.google.android.gms.internal.measurement.C4087d;
import com.google.android.gms.internal.measurement.zzjd;
import java.io.IOException;
import java.util.List;

/* renamed from: j29 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class j29 {

    /* renamed from: a */
    public final C4087d f30211a;

    public j29(C4087d dVar) {
        p59.m49797b(dVar, "output");
        this.f30211a = dVar;
        dVar.f22614a = this;
    }

    /* renamed from: l */
    public static j29 m46108l(C4087d dVar) {
        j29 j29 = dVar.f22614a;
        if (j29 != null) {
            return j29;
        }
        return new j29(dVar);
    }

    /* renamed from: A */
    public final void mo44010A(int i, int i2) throws IOException {
        this.f30211a.mo30887i(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: B */
    public final void mo44011B(int i, long j) throws IOException {
        this.f30211a.mo30889k(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: C */
    public final void mo44012C(int i, Object obj, n89 n89) throws IOException {
        r79 r79 = (r79) obj;
        C4086c cVar = (C4086c) this.f30211a;
        cVar.mo30896r((i << 3) | 2);
        C4085b bVar = (C4085b) r79;
        int e = bVar.mo30881e();
        if (e == -1) {
            e = n89.mo46037d(bVar);
            bVar.mo30882i(e);
        }
        cVar.mo30896r(e);
        n89.mo46035b(r79, cVar.f22614a);
    }

    /* renamed from: D */
    public final void mo44013D(int i, Object obj, n89 n89) throws IOException {
        C4087d dVar = this.f30211a;
        dVar.mo30885g(i, 3);
        n89.mo46035b((r79) obj, dVar.f22614a);
        dVar.mo30885g(i, 4);
    }

    /* renamed from: E */
    public final void mo44014E(int i) throws IOException {
        this.f30211a.mo30885g(i, 3);
    }

    /* renamed from: F */
    public final void mo44015F(int i) throws IOException {
        this.f30211a.mo30885g(i, 4);
    }

    /* renamed from: G */
    public final void mo44016G(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4087d.m34159z(list.get(i4).intValue());
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                this.f30211a.mo30895q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30886h(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo44017H(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                this.f30211a.mo30897s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30888j(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: I */
    public final void mo44018I(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4087d.m34150B(list.get(i4).longValue());
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                this.f30211a.mo30898t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30889k(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo44019J(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4087d.m34150B(list.get(i4).longValue());
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                this.f30211a.mo30898t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30889k(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: K */
    public final void mo44020K(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                this.f30211a.mo30899u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30890l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo44021a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                this.f30211a.mo30897s(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30888j(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo44022b(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                this.f30211a.mo30899u(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30890l(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo44023c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4087d.m34159z(list.get(i4).intValue());
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                this.f30211a.mo30895q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30886h(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo44024d(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                this.f30211a.mo30894p(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30891m(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo44025e(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof b69) {
            b69 b69 = (b69) list;
            while (i2 < list.size()) {
                Object s0 = b69.mo29469s0(i2);
                if (s0 instanceof String) {
                    this.f30211a.mo30892n(i, (String) s0);
                } else {
                    this.f30211a.mo30893o(i, (zzjd) s0);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30892n(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo44026f(int i, List<zzjd> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f30211a.mo30893o(i, list.get(i2));
        }
    }

    /* renamed from: g */
    public final void mo44027g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4087d.m34149A(list.get(i4).intValue());
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                this.f30211a.mo30896r(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30887i(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo44028h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                this.f30211a.mo30897s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30888j(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo44029i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                this.f30211a.mo30899u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f30211a.mo30890l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo44030j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += C4087d.m34149A((intValue >> 31) ^ (intValue + intValue));
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                C4087d dVar = this.f30211a;
                int intValue2 = list.get(i2).intValue();
                dVar.mo30896r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C4087d dVar2 = this.f30211a;
            int intValue3 = list.get(i2).intValue();
            dVar2.mo30887i(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo44031k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f30211a.mo30885g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += C4087d.m34150B((longValue >> 63) ^ (longValue + longValue));
            }
            this.f30211a.mo30896r(i3);
            while (i2 < list.size()) {
                C4087d dVar = this.f30211a;
                long longValue2 = list.get(i2).longValue();
                dVar.mo30898t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C4087d dVar2 = this.f30211a;
            long longValue3 = list.get(i2).longValue();
            dVar2.mo30889k(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo44032m(int i, int i2) throws IOException {
        this.f30211a.mo30888j(i, i2);
    }

    /* renamed from: n */
    public final void mo44033n(int i, long j) throws IOException {
        this.f30211a.mo30889k(i, j);
    }

    /* renamed from: o */
    public final void mo44034o(int i, long j) throws IOException {
        this.f30211a.mo30890l(i, j);
    }

    /* renamed from: p */
    public final void mo44035p(int i, float f) throws IOException {
        this.f30211a.mo30888j(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: q */
    public final void mo44036q(int i, double d) throws IOException {
        this.f30211a.mo30890l(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo44037r(int i, int i2) throws IOException {
        this.f30211a.mo30886h(i, i2);
    }

    /* renamed from: s */
    public final void mo44038s(int i, long j) throws IOException {
        this.f30211a.mo30889k(i, j);
    }

    /* renamed from: t */
    public final void mo44039t(int i, int i2) throws IOException {
        this.f30211a.mo30886h(i, i2);
    }

    /* renamed from: u */
    public final void mo44040u(int i, long j) throws IOException {
        this.f30211a.mo30890l(i, j);
    }

    /* renamed from: v */
    public final void mo44041v(int i, int i2) throws IOException {
        this.f30211a.mo30888j(i, i2);
    }

    /* renamed from: w */
    public final void mo44042w(int i, boolean z) throws IOException {
        this.f30211a.mo30891m(i, z);
    }

    /* renamed from: x */
    public final void mo44043x(int i, String str) throws IOException {
        this.f30211a.mo30892n(i, str);
    }

    /* renamed from: y */
    public final void mo44044y(int i, zzjd zzjd) throws IOException {
        this.f30211a.mo30893o(i, zzjd);
    }

    /* renamed from: z */
    public final void mo44045z(int i, int i2) throws IOException {
        this.f30211a.mo30887i(i, i2);
    }
}
