package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import androidx.media3.common.C0792h;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.dash.C0884a;
import androidx.media3.exoplayer.dash.C0892d;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.upstream.C1019b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000.qe0;
import p000.x11;

/* renamed from: androidx.media3.exoplayer.dash.c */
/* compiled from: DefaultDashChunkSource */
public class C0888c implements C0884a {

    /* renamed from: a */
    public final cj3 f4886a;

    /* renamed from: b */
    public final C3178qz f4887b;

    /* renamed from: c */
    public final int[] f4888c;

    /* renamed from: d */
    public final int f4889d;

    /* renamed from: e */
    public final x11 f4890e;

    /* renamed from: f */
    public final long f4891f;

    /* renamed from: g */
    public final int f4892g;

    /* renamed from: h */
    public final C0892d.C0895c f4893h;

    /* renamed from: i */
    public final C0890b[] f4894i;

    /* renamed from: j */
    public dx1 f4895j;

    /* renamed from: k */
    public d11 f4896k;

    /* renamed from: l */
    public int f4897l;

    /* renamed from: m */
    public IOException f4898m;

    /* renamed from: n */
    public boolean f4899n;

    /* renamed from: androidx.media3.exoplayer.dash.c$a */
    /* compiled from: DefaultDashChunkSource */
    public static final class C0889a implements C0884a.C0885a {

        /* renamed from: a */
        public final x11.C3565a f4900a;

        /* renamed from: b */
        public final int f4901b;

        /* renamed from: c */
        public final qe0.C3138a f4902c;

        public C0889a(x11.C3565a aVar) {
            this(aVar, 1);
        }

        /* renamed from: a */
        public C0884a mo7233a(cj3 cj3, d11 d11, C3178qz qzVar, int i, int[] iArr, dx1 dx1, int i2, long j, boolean z, List<C0792h> list, C0892d.C0895c cVar, ov6 ov6, br4 br4) {
            ov6 ov62 = ov6;
            x11 a = this.f4900a.mo21778a();
            if (ov62 != null) {
                a.mo7617g(ov62);
            }
            return new C0888c(this.f4902c, cj3, d11, qzVar, i, iArr, dx1, i2, a, j, this.f4901b, z, list, cVar, br4);
        }

        public C0889a(x11.C3565a aVar, int i) {
            this(d60.f10502A, aVar, i);
        }

        public C0889a(qe0.C3138a aVar, x11.C3565a aVar2, int i) {
            this.f4902c = aVar;
            this.f4900a = aVar2;
            this.f4901b = i;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.c$b */
    /* compiled from: DefaultDashChunkSource */
    public static final class C0890b {

        /* renamed from: a */
        public final qe0 f4903a;

        /* renamed from: b */
        public final xd5 f4904b;

        /* renamed from: c */
        public final C3018oz f4905c;

        /* renamed from: d */
        public final h11 f4906d;

        /* renamed from: e */
        public final long f4907e;

        /* renamed from: f */
        public final long f4908f;

        public C0890b(long j, xd5 xd5, C3018oz ozVar, qe0 qe0, long j2, h11 h11) {
            this.f4907e = j;
            this.f4904b = xd5;
            this.f4905c = ozVar;
            this.f4908f = j2;
            this.f4903a = qe0;
            this.f4906d = h11;
        }

        /* renamed from: b */
        public C0890b mo7274b(long j, xd5 xd5) throws BehindLiveWindowException {
            long h;
            long h2;
            long j2 = j;
            h11 b = this.f4904b.mo27725b();
            h11 b2 = xd5.mo27725b();
            if (b == null) {
                return new C0890b(j, xd5, this.f4905c, this.f4903a, this.f4908f, b);
            } else if (!b.mo20923j()) {
                return new C0890b(j, xd5, this.f4905c, this.f4903a, this.f4908f, b2);
            } else {
                long i = b.mo20922i(j2);
                if (i == 0) {
                    return new C0890b(j, xd5, this.f4905c, this.f4903a, this.f4908f, b2);
                }
                long k = b.mo20924k();
                long c = b.mo20916c(k);
                long j3 = (i + k) - 1;
                long k2 = b2.mo20924k();
                h11 h11 = b;
                long c2 = b2.mo20916c(k2);
                long j4 = k;
                long j5 = this.f4908f;
                int i2 = ((b.mo20916c(j3) + b.mo20917d(j3, j2)) > c2 ? 1 : ((b.mo20916c(j3) + b.mo20917d(j3, j2)) == c2 ? 0 : -1));
                if (i2 == 0) {
                    h = j3 + 1;
                } else if (i2 < 0) {
                    throw new BehindLiveWindowException();
                } else if (c2 < c) {
                    h2 = j5 - (b2.mo20921h(c, j2) - j4);
                    return new C0890b(j, xd5, this.f4905c, this.f4903a, h2, b2);
                } else {
                    h = h11.mo20921h(c2, j2);
                }
                h2 = j5 + (h - k2);
                return new C0890b(j, xd5, this.f4905c, this.f4903a, h2, b2);
            }
        }

        /* renamed from: c */
        public C0890b mo7275c(h11 h11) {
            return new C0890b(this.f4907e, this.f4904b, this.f4905c, this.f4903a, this.f4908f, h11);
        }

        /* renamed from: d */
        public C0890b mo7276d(C3018oz ozVar) {
            return new C0890b(this.f4907e, this.f4904b, ozVar, this.f4903a, this.f4908f, this.f4906d);
        }

        /* renamed from: e */
        public long mo7277e(long j) {
            return this.f4906d.mo20918e(this.f4907e, j) + this.f4908f;
        }

        /* renamed from: f */
        public long mo7278f() {
            return this.f4906d.mo20924k() + this.f4908f;
        }

        /* renamed from: g */
        public long mo7279g(long j) {
            return (mo7277e(j) + this.f4906d.mo20925l(this.f4907e, j)) - 1;
        }

        /* renamed from: h */
        public long mo7280h() {
            return this.f4906d.mo20922i(this.f4907e);
        }

        /* renamed from: i */
        public long mo7281i(long j) {
            return mo7283k(j) + this.f4906d.mo20917d(j - this.f4908f, this.f4907e);
        }

        /* renamed from: j */
        public long mo7282j(long j) {
            return this.f4906d.mo20921h(j, this.f4907e) + this.f4908f;
        }

        /* renamed from: k */
        public long mo7283k(long j) {
            return this.f4906d.mo20916c(j - this.f4908f);
        }

        /* renamed from: l */
        public b75 mo7284l(long j) {
            return this.f4906d.mo20920g(j - this.f4908f);
        }

        /* renamed from: m */
        public boolean mo7285m(long j, long j2) {
            if (!this.f4906d.mo20923j() && j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && mo7281i(j) > j2) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.c$c */
    /* compiled from: DefaultDashChunkSource */
    public static final class C0891c extends C3562wy {

        /* renamed from: e */
        public final C0890b f4909e;

        /* renamed from: f */
        public final long f4910f;

        public C0891c(C0890b bVar, long j, long j2, long j3) {
            super(j, j2);
            this.f4909e = bVar;
            this.f4910f = j3;
        }

        /* renamed from: a */
        public long mo7286a() {
            mo27617c();
            return this.f4909e.mo7283k(mo27618d());
        }

        /* renamed from: b */
        public long mo7287b() {
            mo27617c();
            return this.f4909e.mo7281i(mo27618d());
        }
    }

    public C0888c(qe0.C3138a aVar, cj3 cj3, d11 d11, C3178qz qzVar, int i, int[] iArr, dx1 dx1, int i2, x11 x11, long j, int i3, boolean z, List<C0792h> list, C0892d.C0895c cVar, br4 br4) {
        d11 d112 = d11;
        C3178qz qzVar2 = qzVar;
        int i4 = i;
        dx1 dx12 = dx1;
        this.f4886a = cj3;
        this.f4896k = d112;
        this.f4887b = qzVar2;
        this.f4888c = iArr;
        this.f4895j = dx12;
        this.f4889d = i2;
        this.f4890e = x11;
        this.f4897l = i4;
        this.f4891f = j;
        this.f4892g = i3;
        this.f4893h = cVar;
        long g = d112.mo18395g(i4);
        ArrayList<xd5> n = mo7269n();
        this.f4894i = new C0890b[dx1.length()];
        int i5 = 0;
        while (i5 < this.f4894i.length) {
            xd5 xd5 = n.get(dx12.mo7670h(i5));
            C3018oz j2 = qzVar2.mo25286j(xd5.f19811c);
            C0890b[] bVarArr = this.f4894i;
            if (j2 == null) {
                j2 = xd5.f19811c.get(0);
            }
            int i6 = i5;
            bVarArr[i6] = new C0890b(g, xd5, j2, aVar.mo11986a(i2, xd5.f19810b, z, list, cVar, br4), 0, xd5.mo27725b());
            i5 = i6 + 1;
        }
    }

    /* renamed from: a */
    public void mo7258a() {
        for (C0890b bVar : this.f4894i) {
            qe0 qe0 = bVar.f4903a;
            if (qe0 != null) {
                qe0.mo18524a();
            }
        }
    }

    /* renamed from: b */
    public void mo7259b() throws IOException {
        IOException iOException = this.f4898m;
        if (iOException == null) {
            this.f4886a.mo7226b();
            return;
        }
        throw iOException;
    }

    /* renamed from: c */
    public long mo7260c(long j, ys5 ys5) {
        long j2;
        long j3 = j;
        for (C0890b bVar : this.f4894i) {
            if (bVar.f4906d != null) {
                long j4 = bVar.mo7282j(j3);
                long k = bVar.mo7283k(j4);
                long h = bVar.mo7280h();
                if (k >= j3 || (h != -1 && j4 >= (bVar.mo7278f() + h) - 1)) {
                    j2 = k;
                } else {
                    j2 = bVar.mo7283k(j4 + 1);
                }
                return ys5.mo28203a(j, k, j2);
            }
        }
        return j3;
    }

    /* renamed from: d */
    public void mo7261d(pe0 pe0) {
        se0 d;
        if (pe0 instanceof du2) {
            int a = this.f4895j.mo7662a(((du2) pe0).f16395d);
            C0890b bVar = this.f4894i[a];
            if (bVar.f4906d == null && (d = bVar.f4903a.mo18527d()) != null) {
                this.f4894i[a] = bVar.mo7275c(new j11(d, bVar.f4904b.f19812d));
            }
        }
        C0892d.C0895c cVar = this.f4893h;
        if (cVar != null) {
            cVar.mo7308i(pe0);
        }
    }

    /* renamed from: e */
    public boolean mo7262e(long j, pe0 pe0, List<? extends qq3> list) {
        if (this.f4898m != null) {
            return false;
        }
        return this.f4895j.mo7666e(j, pe0, list);
    }

    /* renamed from: f */
    public void mo7231f(d11 d11, int i) {
        try {
            this.f4896k = d11;
            this.f4897l = i;
            long g = d11.mo18395g(i);
            ArrayList<xd5> n = mo7269n();
            for (int i2 = 0; i2 < this.f4894i.length; i2++) {
                C0890b[] bVarArr = this.f4894i;
                bVarArr[i2] = bVarArr[i2].mo7274b(g, n.get(this.f4895j.mo7670h(i2)));
            }
        } catch (BehindLiveWindowException e) {
            this.f4898m = e;
        }
    }

    /* renamed from: g */
    public void mo7263g(long j, long j2, List<? extends qq3> list, re0 re0) {
        qq3 qq3;
        boolean z;
        b75 b75;
        b75 b752;
        long j3;
        int i;
        rq3[] rq3Arr;
        int i2;
        long j4;
        long j5 = j;
        re0 re02 = re0;
        if (this.f4898m == null) {
            long j6 = j2 - j5;
            long y0 = w67.m29391y0(this.f4896k.f10419a) + w67.m29391y0(this.f4896k.mo18392d(this.f4897l).f13723b) + j2;
            C0892d.C0895c cVar = this.f4893h;
            if (cVar == null || !cVar.mo7307h(y0)) {
                long y02 = w67.m29391y0(w67.m29339X(this.f4891f));
                long m = mo7268m(y02);
                if (list.isEmpty()) {
                    List<? extends qq3> list2 = list;
                    qq3 = null;
                } else {
                    qq3 = (qq3) list.get(list.size() - 1);
                }
                int length = this.f4895j.length();
                rq3[] rq3Arr2 = new rq3[length];
                int i3 = 0;
                while (i3 < length) {
                    C0890b bVar = this.f4894i[i3];
                    if (bVar.f4906d == null) {
                        rq3Arr2[i3] = rq3.f17335a;
                        i2 = i3;
                        i = length;
                        rq3Arr = rq3Arr2;
                        j3 = j6;
                        j4 = y02;
                    } else {
                        long e = bVar.mo7277e(y02);
                        long g = bVar.mo7279g(y02);
                        i2 = i3;
                        i = length;
                        rq3Arr = rq3Arr2;
                        j3 = j6;
                        j4 = y02;
                        long o = mo7270o(bVar, qq3, j2, e, g);
                        if (o < e) {
                            rq3Arr[i2] = rq3.f17335a;
                        } else {
                            rq3Arr[i2] = new C0891c(mo7273r(i2), o, g, m);
                        }
                    }
                    i3 = i2 + 1;
                    List<? extends qq3> list3 = list;
                    y02 = j4;
                    rq3Arr2 = rq3Arr;
                    length = i;
                    j6 = j3;
                }
                long j7 = j6;
                long j8 = y02;
                this.f4895j.mo7677m(j, j7, mo7267l(j8, j5), list, rq3Arr2);
                C0890b r = mo7273r(this.f4895j.mo7665d());
                qe0 qe0 = r.f4903a;
                if (qe0 != null) {
                    xd5 xd5 = r.f4904b;
                    if (qe0.mo18528e() == null) {
                        b75 = xd5.mo27727n();
                    } else {
                        b75 = null;
                    }
                    if (r.f4906d == null) {
                        b752 = xd5.mo27726m();
                    } else {
                        b752 = null;
                    }
                    if (!(b75 == null && b752 == null)) {
                        re02.f17225a = mo7271p(r, this.f4890e, this.f4895j.mo7682r(), this.f4895j.mo7683s(), this.f4895j.mo7673j(), b75, b752);
                        return;
                    }
                }
                long a = r.f4907e;
                long j9 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                int i4 = (a > CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED ? 1 : (a == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED ? 0 : -1));
                if (i4 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (r.mo7280h() == 0) {
                    re02.f17226b = z;
                    return;
                }
                long e2 = r.mo7277e(j8);
                long g2 = r.mo7279g(j8);
                long o2 = mo7270o(r, qq3, j2, e2, g2);
                if (o2 < e2) {
                    this.f4898m = new BehindLiveWindowException();
                    return;
                }
                int i5 = (o2 > g2 ? 1 : (o2 == g2 ? 0 : -1));
                if (i5 > 0 || (this.f4899n && i5 >= 0)) {
                    re02.f17226b = z;
                } else if (!z || r.mo7283k(o2) < a) {
                    int min = (int) Math.min((long) this.f4892g, (g2 - o2) + 1);
                    if (i4 != 0) {
                        while (min > 1 && r.mo7283k((((long) min) + o2) - 1) >= a) {
                            min--;
                        }
                    }
                    int i6 = min;
                    if (list.isEmpty()) {
                        j9 = j2;
                    }
                    re02.f17225a = mo7272q(r, this.f4890e, this.f4889d, this.f4895j.mo7682r(), this.f4895j.mo7683s(), this.f4895j.mo7673j(), o2, i6, j9, m);
                } else {
                    re02.f17226b = true;
                }
            }
        }
    }

    /* renamed from: h */
    public boolean mo7264h(pe0 pe0, boolean z, C1019b.C1022c cVar, C1019b bVar) {
        C1019b.C1021b d;
        if (!z) {
            return false;
        }
        C0892d.C0895c cVar2 = this.f4893h;
        if (cVar2 != null && cVar2.mo7309j(pe0)) {
            return true;
        }
        if (!this.f4896k.f10422d && (pe0 instanceof qq3)) {
            IOException iOException = cVar.f5476c;
            if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode == 404) {
                C0890b bVar2 = this.f4894i[this.f4895j.mo7662a(pe0.f16395d)];
                long h = bVar2.mo7280h();
                if (!(h == -1 || h == 0)) {
                    if (((qq3) pe0).mo24759f() > (bVar2.mo7278f() + h) - 1) {
                        this.f4899n = true;
                        return true;
                    }
                }
            }
        }
        C0890b bVar3 = this.f4894i[this.f4895j.mo7662a(pe0.f16395d)];
        C3018oz j = this.f4887b.mo25286j(bVar3.f4904b.f19811c);
        if (j != null && !bVar3.f4905c.equals(j)) {
            return true;
        }
        C1019b.C1020a k = mo7266k(this.f4895j, bVar3.f4904b.f19811c);
        if ((!k.mo7829a(2) && !k.mo7829a(1)) || (d = bVar.mo7827d(k, cVar)) == null || !k.mo7829a(d.f5472a)) {
            return false;
        }
        int i = d.f5472a;
        if (i == 2) {
            dx1 dx1 = this.f4895j;
            return dx1.mo7668f(dx1.mo7662a(pe0.f16395d), d.f5473b);
        } else if (i != 1) {
            return false;
        } else {
            this.f4887b.mo25283e(bVar3.f4905c, d.f5473b);
            return true;
        }
    }

    /* renamed from: i */
    public void mo7232i(dx1 dx1) {
        this.f4895j = dx1;
    }

    /* renamed from: j */
    public int mo7265j(long j, List<? extends qq3> list) {
        if (this.f4898m != null || this.f4895j.length() < 2) {
            return list.size();
        }
        return this.f4895j.mo7681q(j, list);
    }

    /* renamed from: k */
    public final C1019b.C1020a mo7266k(dx1 dx1, List<C3018oz> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = dx1.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (dx1.mo7669g(i2, elapsedRealtime)) {
                i++;
            }
        }
        int f = C3178qz.m25963f(list);
        return new C1019b.C1020a(f, f - this.f4887b.mo25284g(list), length, i);
    }

    /* renamed from: l */
    public final long mo7267l(long j, long j2) {
        if (!this.f4896k.f10422d) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        return Math.max(0, Math.min(mo7268m(j), this.f4894i[0].mo7281i(this.f4894i[0].mo7279g(j))) - j2);
    }

    /* renamed from: m */
    public final long mo7268m(long j) {
        d11 d11 = this.f4896k;
        long j2 = d11.f10419a;
        if (j2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        return j - w67.m29391y0(j2 + d11.mo18392d(this.f4897l).f13723b);
    }

    /* renamed from: n */
    public final ArrayList<xd5> mo7269n() {
        List<C2751lb> list = this.f4896k.mo18392d(this.f4897l).f13724c;
        ArrayList<xd5> arrayList = new ArrayList<>();
        for (int i : this.f4888c) {
            arrayList.addAll(list.get(i).f14465c);
        }
        return arrayList;
    }

    /* renamed from: o */
    public final long mo7270o(C0890b bVar, qq3 qq3, long j, long j2, long j3) {
        if (qq3 != null) {
            return qq3.mo24759f();
        }
        return w67.m29376r(bVar.mo7282j(j), j2, j3);
    }

    /* renamed from: p */
    public pe0 mo7271p(C0890b bVar, x11 x11, C0792h hVar, int i, Object obj, b75 b75, b75 b752) {
        C0890b bVar2 = bVar;
        b75 b753 = b75;
        xd5 xd5 = bVar2.f4904b;
        if (b753 != null) {
            b75 a = b753.mo11423a(b752, bVar2.f4905c.f16254a);
            if (a != null) {
                b753 = a;
            }
        } else {
            b753 = b752;
        }
        return new du2(x11, i11.m19343a(xd5, bVar2.f4905c.f16254a, b753, 0), hVar, i, obj, bVar2.f4903a);
    }

    /* renamed from: q */
    public pe0 mo7272q(C0890b bVar, x11 x11, int i, C0792h hVar, int i2, Object obj, long j, int i3, long j2, long j3) {
        long j4;
        C0890b bVar2 = bVar;
        long j5 = j;
        long j6 = j3;
        xd5 xd5 = bVar2.f4904b;
        long k = bVar2.mo7283k(j5);
        b75 l = bVar2.mo7284l(j5);
        int i4 = 0;
        if (bVar2.f4903a == null) {
            long i5 = bVar2.mo7281i(j5);
            if (!bVar2.mo7285m(j5, j6)) {
                i4 = 8;
            }
            return new n36(x11, i11.m19343a(xd5, bVar2.f4905c.f16254a, l, i4), hVar, i2, obj, k, i5, j, i, hVar);
        }
        int i6 = 1;
        int i7 = i3;
        int i8 = 1;
        while (i6 < i7) {
            b75 a = l.mo11423a(bVar2.mo7284l(((long) i6) + j5), bVar2.f4905c.f16254a);
            if (a == null) {
                break;
            }
            i8++;
            i6++;
            l = a;
        }
        long j7 = (((long) i8) + j5) - 1;
        long i9 = bVar2.mo7281i(j7);
        long a2 = bVar.f4907e;
        if (a2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || a2 > i9) {
            j4 = -9223372036854775807L;
        } else {
            j4 = a2;
        }
        if (!bVar2.mo7285m(j7, j6)) {
            i4 = 8;
        }
        qe0 qe0 = bVar2.f4903a;
        return new pr0(x11, i11.m19343a(xd5, bVar2.f4905c.f16254a, l, i4), hVar, i2, obj, k, i9, j2, j4, j, i8, -xd5.f19812d, qe0);
    }

    /* renamed from: r */
    public final C0890b mo7273r(int i) {
        C0890b bVar = this.f4894i[i];
        C3018oz j = this.f4887b.mo25286j(bVar.f4904b.f19811c);
        if (j == null || j.equals(bVar.f4905c)) {
            return bVar;
        }
        C0890b d = bVar.mo7276d(j);
        this.f4894i[i] = d;
        return d;
    }
}
