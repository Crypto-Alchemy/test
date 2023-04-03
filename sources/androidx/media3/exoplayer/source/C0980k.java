package androidx.media3.exoplayer.source;

import androidx.media3.common.C0792h;
import androidx.media3.common.C0836t;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.C0971h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.source.k */
/* compiled from: MergingMediaPeriod */
public final class C0980k implements C0971h, C0971h.C0972a {

    /* renamed from: a */
    public final C0971h[] f5266a;

    /* renamed from: d */
    public final IdentityHashMap<yk5, Integer> f5267d;

    /* renamed from: e */
    public final tn0 f5268e;

    /* renamed from: g */
    public final ArrayList<C0971h> f5269g = new ArrayList<>();

    /* renamed from: k */
    public final HashMap<C0836t, C0836t> f5270k = new HashMap<>();

    /* renamed from: r */
    public C0971h.C0972a f5271r;

    /* renamed from: s */
    public ws6 f5272s;

    /* renamed from: x */
    public C0971h[] f5273x;

    /* renamed from: y */
    public C1002q f5274y;

    /* renamed from: androidx.media3.exoplayer.source.k$a */
    /* compiled from: MergingMediaPeriod */
    public static final class C0981a implements dx1 {

        /* renamed from: a */
        public final dx1 f5275a;

        /* renamed from: b */
        public final C0836t f5276b;

        public C0981a(dx1 dx1, C0836t tVar) {
            this.f5275a = dx1;
            this.f5276b = tVar;
        }

        /* renamed from: a */
        public int mo7662a(C0792h hVar) {
            return this.f5275a.mo7662a(hVar);
        }

        /* renamed from: b */
        public C0792h mo7663b(int i) {
            return this.f5275a.mo7663b(i);
        }

        /* renamed from: c */
        public void mo7664c() {
            this.f5275a.mo7664c();
        }

        /* renamed from: d */
        public int mo7665d() {
            return this.f5275a.mo7665d();
        }

        /* renamed from: e */
        public boolean mo7666e(long j, pe0 pe0, List<? extends qq3> list) {
            return this.f5275a.mo7666e(j, pe0, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0981a)) {
                return false;
            }
            C0981a aVar = (C0981a) obj;
            if (!this.f5275a.equals(aVar.f5275a) || !this.f5276b.equals(aVar.f5276b)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public boolean mo7668f(int i, long j) {
            return this.f5275a.mo7668f(i, j);
        }

        /* renamed from: g */
        public boolean mo7669g(int i, long j) {
            return this.f5275a.mo7669g(i, j);
        }

        /* renamed from: h */
        public int mo7670h(int i) {
            return this.f5275a.mo7670h(i);
        }

        public int hashCode() {
            return ((527 + this.f5276b.hashCode()) * 31) + this.f5275a.hashCode();
        }

        /* renamed from: i */
        public void mo7672i(float f) {
            this.f5275a.mo7672i(f);
        }

        /* renamed from: j */
        public Object mo7673j() {
            return this.f5275a.mo7673j();
        }

        /* renamed from: k */
        public void mo7674k() {
            this.f5275a.mo7674k();
        }

        /* renamed from: l */
        public int mo7675l(int i) {
            return this.f5275a.mo7675l(i);
        }

        public int length() {
            return this.f5275a.length();
        }

        /* renamed from: m */
        public void mo7677m(long j, long j2, long j3, List<? extends qq3> list, rq3[] rq3Arr) {
            this.f5275a.mo7677m(j, j2, j3, list, rq3Arr);
        }

        /* renamed from: n */
        public C0836t mo7678n() {
            return this.f5276b;
        }

        /* renamed from: o */
        public void mo7679o(boolean z) {
            this.f5275a.mo7679o(z);
        }

        /* renamed from: p */
        public void mo7680p() {
            this.f5275a.mo7680p();
        }

        /* renamed from: q */
        public int mo7681q(long j, List<? extends qq3> list) {
            return this.f5275a.mo7681q(j, list);
        }

        /* renamed from: r */
        public C0792h mo7682r() {
            return this.f5275a.mo7682r();
        }

        /* renamed from: s */
        public int mo7683s() {
            return this.f5275a.mo7683s();
        }

        /* renamed from: t */
        public void mo7684t() {
            this.f5275a.mo7684t();
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.k$b */
    /* compiled from: MergingMediaPeriod */
    public static final class C0982b implements C0971h, C0971h.C0972a {

        /* renamed from: a */
        public final C0971h f5277a;

        /* renamed from: d */
        public final long f5278d;

        /* renamed from: e */
        public C0971h.C0972a f5279e;

        public C0982b(C0971h hVar, long j) {
            this.f5277a = hVar;
            this.f5278d = j;
        }

        /* renamed from: a */
        public long mo7241a() {
            long a = this.f5277a.mo7241a();
            if (a == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f5278d + a;
        }

        /* renamed from: c */
        public long mo7243c(long j, ys5 ys5) {
            return this.f5277a.mo7243c(j - this.f5278d, ys5) + this.f5278d;
        }

        /* renamed from: d */
        public boolean mo7244d() {
            return this.f5277a.mo7244d();
        }

        /* renamed from: e */
        public boolean mo7245e(long j) {
            return this.f5277a.mo7245e(j - this.f5278d);
        }

        /* renamed from: f */
        public void mo7587f(C0971h hVar) {
            ((C0971h.C0972a) C2725kr.m20985e(this.f5279e)).mo7587f(this);
        }

        /* renamed from: h */
        public long mo7247h() {
            long h = this.f5277a.mo7247h();
            if (h == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f5278d + h;
        }

        /* renamed from: i */
        public void mo7248i(long j) {
            this.f5277a.mo7248i(j - this.f5278d);
        }

        /* renamed from: j */
        public long mo7249j(dx1[] dx1Arr, boolean[] zArr, yk5[] yk5Arr, boolean[] zArr2, long j) {
            yk5[] yk5Arr2 = yk5Arr;
            yk5[] yk5Arr3 = new yk5[yk5Arr2.length];
            int i = 0;
            while (true) {
                yk5 yk5 = null;
                if (i >= yk5Arr2.length) {
                    break;
                }
                C0983c cVar = (C0983c) yk5Arr2[i];
                if (cVar != null) {
                    yk5 = cVar.mo7686a();
                }
                yk5Arr3[i] = yk5;
                i++;
            }
            long j2 = this.f5277a.mo7249j(dx1Arr, zArr, yk5Arr3, zArr2, j - this.f5278d);
            for (int i2 = 0; i2 < yk5Arr2.length; i2++) {
                yk5 yk52 = yk5Arr3[i2];
                if (yk52 == null) {
                    yk5Arr2[i2] = null;
                } else {
                    yk5 yk53 = yk5Arr2[i2];
                    if (yk53 == null || ((C0983c) yk53).mo7686a() != yk52) {
                        yk5Arr2[i2] = new C0983c(yk52, this.f5278d);
                    }
                }
            }
            return j2 + this.f5278d;
        }

        /* renamed from: k */
        public void mo7246g(C0971h hVar) {
            ((C0971h.C0972a) C2725kr.m20985e(this.f5279e)).mo7246g(this);
        }

        /* renamed from: l */
        public long mo7250l(long j) {
            return this.f5277a.mo7250l(j - this.f5278d) + this.f5278d;
        }

        /* renamed from: m */
        public long mo7251m() {
            long m = this.f5277a.mo7251m();
            if (m == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            }
            return this.f5278d + m;
        }

        /* renamed from: o */
        public void mo7252o() throws IOException {
            this.f5277a.mo7252o();
        }

        /* renamed from: q */
        public void mo7254q(C0971h.C0972a aVar, long j) {
            this.f5279e = aVar;
            this.f5277a.mo7254q(this, j - this.f5278d);
        }

        /* renamed from: r */
        public ws6 mo7255r() {
            return this.f5277a.mo7255r();
        }

        /* renamed from: t */
        public void mo7256t(long j, boolean z) {
            this.f5277a.mo7256t(j - this.f5278d, z);
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.k$c */
    /* compiled from: MergingMediaPeriod */
    public static final class C0983c implements yk5 {

        /* renamed from: a */
        public final yk5 f5280a;

        /* renamed from: d */
        public final long f5281d;

        public C0983c(yk5 yk5, long j) {
            this.f5280a = yk5;
            this.f5281d = j;
        }

        /* renamed from: a */
        public yk5 mo7686a() {
            return this.f5280a;
        }

        /* renamed from: b */
        public void mo7593b() throws IOException {
            this.f5280a.mo7593b();
        }

        /* renamed from: f */
        public int mo7594f(long j) {
            return this.f5280a.mo7594f(j - this.f5281d);
        }

        /* renamed from: g */
        public boolean mo7595g() {
            return this.f5280a.mo7595g();
        }

        /* renamed from: p */
        public int mo7596p(c82 c82, DecoderInputBuffer decoderInputBuffer, int i) {
            int p = this.f5280a.mo7596p(c82, decoderInputBuffer, i);
            if (p == -4) {
                decoderInputBuffer.f4594k = Math.max(0, decoderInputBuffer.f4594k + this.f5281d);
            }
            return p;
        }
    }

    public C0980k(tn0 tn0, long[] jArr, C0971h... hVarArr) {
        this.f5268e = tn0;
        this.f5266a = hVarArr;
        this.f5274y = tn0.mo20411a(new C1002q[0]);
        this.f5267d = new IdentityHashMap<>();
        this.f5273x = new C0971h[0];
        for (int i = 0; i < hVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f5266a[i] = new C0982b(hVarArr[i], j);
            }
        }
    }

    /* renamed from: a */
    public long mo7241a() {
        return this.f5274y.mo7241a();
    }

    /* renamed from: b */
    public C0971h mo7660b(int i) {
        C0971h hVar = this.f5266a[i];
        if (hVar instanceof C0982b) {
            return ((C0982b) hVar).f5277a;
        }
        return hVar;
    }

    /* renamed from: c */
    public long mo7243c(long j, ys5 ys5) {
        C0971h hVar;
        C0971h[] hVarArr = this.f5273x;
        if (hVarArr.length > 0) {
            hVar = hVarArr[0];
        } else {
            hVar = this.f5266a[0];
        }
        return hVar.mo7243c(j, ys5);
    }

    /* renamed from: d */
    public boolean mo7244d() {
        return this.f5274y.mo7244d();
    }

    /* renamed from: e */
    public boolean mo7245e(long j) {
        if (this.f5269g.isEmpty()) {
            return this.f5274y.mo7245e(j);
        }
        int size = this.f5269g.size();
        for (int i = 0; i < size; i++) {
            this.f5269g.get(i).mo7245e(j);
        }
        return false;
    }

    /* renamed from: f */
    public void mo7587f(C0971h hVar) {
        this.f5269g.remove(hVar);
        if (this.f5269g.isEmpty()) {
            int i = 0;
            for (C0971h r : this.f5266a) {
                i += r.mo7255r().f19234a;
            }
            C0836t[] tVarArr = new C0836t[i];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                C0971h[] hVarArr = this.f5266a;
                if (i2 < hVarArr.length) {
                    ws6 r2 = hVarArr[i2].mo7255r();
                    int i4 = r2.f19234a;
                    int i5 = 0;
                    while (i5 < i4) {
                        C0836t b = r2.mo27595b(i5);
                        C0836t b2 = b.mo6917b(i2 + ":" + b.f4470d);
                        this.f5270k.put(b2, b);
                        tVarArr[i3] = b2;
                        i5++;
                        i3++;
                    }
                    i2++;
                } else {
                    this.f5272s = new ws6(tVarArr);
                    ((C0971h.C0972a) C2725kr.m20985e(this.f5271r)).mo7587f(this);
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public long mo7247h() {
        return this.f5274y.mo7247h();
    }

    /* renamed from: i */
    public void mo7248i(long j) {
        this.f5274y.mo7248i(j);
    }

    /* renamed from: j */
    public long mo7249j(dx1[] dx1Arr, boolean[] zArr, yk5[] yk5Arr, boolean[] zArr2, long j) {
        Integer num;
        Integer num2;
        int i;
        dx1[] dx1Arr2 = dx1Arr;
        yk5[] yk5Arr2 = yk5Arr;
        int[] iArr = new int[dx1Arr2.length];
        int[] iArr2 = new int[dx1Arr2.length];
        int i2 = 0;
        while (true) {
            num = 0;
            if (i2 >= dx1Arr2.length) {
                break;
            }
            yk5 yk5 = yk5Arr2[i2];
            if (yk5 != null) {
                num = this.f5267d.get(yk5);
            }
            if (num == null) {
                i = -1;
            } else {
                i = num.intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            dx1 dx1 = dx1Arr2[i2];
            if (dx1 != null) {
                C0836t tVar = (C0836t) C2725kr.m20985e(this.f5270k.get(dx1.mo7678n()));
                int i3 = 0;
                while (true) {
                    C0971h[] hVarArr = this.f5266a;
                    if (i3 >= hVarArr.length) {
                        break;
                    } else if (hVarArr[i3].mo7255r().mo27596c(tVar) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.f5267d.clear();
        int length = dx1Arr2.length;
        yk5[] yk5Arr3 = new yk5[length];
        yk5[] yk5Arr4 = new yk5[dx1Arr2.length];
        dx1[] dx1Arr3 = new dx1[dx1Arr2.length];
        ArrayList arrayList = new ArrayList(this.f5266a.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f5266a.length) {
            for (int i5 = 0; i5 < dx1Arr2.length; i5++) {
                if (iArr[i5] == i4) {
                    num2 = yk5Arr2[i5];
                } else {
                    num2 = num;
                }
                yk5Arr4[i5] = num2;
                if (iArr2[i5] == i4) {
                    dx1 dx12 = (dx1) C2725kr.m20985e(dx1Arr2[i5]);
                    dx1Arr3[i5] = new C0981a(dx12, (C0836t) C2725kr.m20985e(this.f5270k.get(dx12.mo7678n())));
                } else {
                    dx1Arr3[i5] = num;
                }
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            dx1[] dx1Arr4 = dx1Arr3;
            long j3 = this.f5266a[i4].mo7249j(dx1Arr3, zArr, yk5Arr4, zArr2, j2);
            if (i6 == 0) {
                j2 = j3;
            } else if (j3 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i7 = 0; i7 < dx1Arr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    yk5Arr3[i7] = yk5Arr4[i7];
                    this.f5267d.put((yk5) C2725kr.m20985e(yk5Arr4[i7]), Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (yk5Arr4[i7] != null) {
                        z2 = false;
                    }
                    C2725kr.m20987g(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f5266a[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            dx1Arr3 = dx1Arr4;
            num = null;
        }
        System.arraycopy(yk5Arr3, 0, yk5Arr2, 0, length);
        C0971h[] hVarArr2 = (C0971h[]) arrayList.toArray(new C0971h[0]);
        this.f5273x = hVarArr2;
        this.f5274y = this.f5268e.mo20411a(hVarArr2);
        return j2;
    }

    /* renamed from: k */
    public void mo7246g(C0971h hVar) {
        ((C0971h.C0972a) C2725kr.m20985e(this.f5271r)).mo7246g(this);
    }

    /* renamed from: l */
    public long mo7250l(long j) {
        long l = this.f5273x[0].mo7250l(j);
        int i = 1;
        while (true) {
            C0971h[] hVarArr = this.f5273x;
            if (i >= hVarArr.length) {
                return l;
            }
            if (hVarArr[i].mo7250l(l) == l) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    /* renamed from: m */
    public long mo7251m() {
        long j = -9223372036854775807L;
        for (C0971h hVar : this.f5273x) {
            long m = hVar.mo7251m();
            if (m != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    C0971h[] hVarArr = this.f5273x;
                    int length = hVarArr.length;
                    int i = 0;
                    while (i < length) {
                        C0971h hVar2 = hVarArr[i];
                        if (hVar2 == hVar) {
                            break;
                        } else if (hVar2.mo7250l(m) == m) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = m;
                } else if (m != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || hVar.mo7250l(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    /* renamed from: o */
    public void mo7252o() throws IOException {
        for (C0971h o : this.f5266a) {
            o.mo7252o();
        }
    }

    /* renamed from: q */
    public void mo7254q(C0971h.C0972a aVar, long j) {
        this.f5271r = aVar;
        Collections.addAll(this.f5269g, this.f5266a);
        for (C0971h q : this.f5266a) {
            q.mo7254q(this, j);
        }
    }

    /* renamed from: r */
    public ws6 mo7255r() {
        return (ws6) C2725kr.m20985e(this.f5272s);
    }

    /* renamed from: t */
    public void mo7256t(long j, boolean z) {
        for (C0971h t : this.f5273x) {
            t.mo7256t(j, z);
        }
    }
}
