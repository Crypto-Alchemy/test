package p000;

import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.C0956b;
import androidx.media3.exoplayer.source.C0971h;
import androidx.media3.exoplayer.source.C0973i;

/* renamed from: mr3 */
/* compiled from: MediaPeriodHolder */
public final class mr3 {

    /* renamed from: a */
    public final C0971h f15225a;

    /* renamed from: b */
    public final Object f15226b;

    /* renamed from: c */
    public final yk5[] f15227c;

    /* renamed from: d */
    public boolean f15228d;

    /* renamed from: e */
    public boolean f15229e;

    /* renamed from: f */
    public or3 f15230f;

    /* renamed from: g */
    public boolean f15231g;

    /* renamed from: h */
    public final boolean[] f15232h;

    /* renamed from: i */
    public final od5[] f15233i;

    /* renamed from: j */
    public final ft6 f15234j;

    /* renamed from: k */
    public final fs3 f15235k;

    /* renamed from: l */
    public mr3 f15236l;

    /* renamed from: m */
    public ws6 f15237m = ws6.f19232g;

    /* renamed from: n */
    public gt6 f15238n;

    /* renamed from: o */
    public long f15239o;

    public mr3(od5[] od5Arr, long j, ft6 ft6, C2891nf nfVar, fs3 fs3, or3 or3, gt6 gt6) {
        this.f15233i = od5Arr;
        this.f15239o = j;
        this.f15234j = ft6;
        this.f15235k = fs3;
        C0973i.C0975b bVar = or3.f16038a;
        this.f15226b = bVar.f15659a;
        this.f15230f = or3;
        this.f15238n = gt6;
        this.f15227c = new yk5[od5Arr.length];
        this.f15232h = new boolean[od5Arr.length];
        this.f15225a = m22593e(bVar, fs3, nfVar, or3.f16039b, or3.f16041d);
    }

    /* renamed from: e */
    public static C0971h m22593e(C0973i.C0975b bVar, fs3 fs3, C2891nf nfVar, long j, long j2) {
        C0971h h = fs3.mo20145h(bVar, nfVar, j);
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return new C0956b(h, true, 0, j2);
        }
        return h;
    }

    /* renamed from: u */
    public static void m22594u(fs3 fs3, C0971h hVar) {
        try {
            if (hVar instanceof C0956b) {
                fs3.mo20157z(((C0956b) hVar).f5195a);
            } else {
                fs3.mo20157z(hVar);
            }
        } catch (RuntimeException e) {
            gk3.m18127d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: A */
    public void mo23354A() {
        C0971h hVar = this.f15225a;
        if (hVar instanceof C0956b) {
            long j = this.f15230f.f16041d;
            if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                j = Long.MIN_VALUE;
            }
            ((C0956b) hVar).mo7591u(0, j);
        }
    }

    /* renamed from: a */
    public long mo23355a(gt6 gt6, long j, boolean z) {
        return mo23356b(gt6, j, z, new boolean[this.f15233i.length]);
    }

    /* renamed from: b */
    public long mo23356b(gt6 gt6, long j, boolean z, boolean[] zArr) {
        boolean z2;
        gt6 gt62 = gt6;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= gt62.f12609a) {
                break;
            }
            boolean[] zArr2 = this.f15232h;
            if (z || !gt6.mo20846b(this.f15238n, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        mo23360g(this.f15227c);
        mo23359f();
        this.f15238n = gt62;
        mo23361h();
        long j2 = this.f15225a.mo7249j(gt62.f12611c, this.f15232h, this.f15227c, zArr, j);
        mo23357c(this.f15227c);
        this.f15229e = false;
        int i2 = 0;
        while (true) {
            yk5[] yk5Arr = this.f15227c;
            if (i2 >= yk5Arr.length) {
                return j2;
            }
            if (yk5Arr[i2] != null) {
                C2725kr.m20987g(gt6.mo20847c(i2));
                if (this.f15233i[i2].mo21684f() != -2) {
                    this.f15229e = true;
                }
            } else {
                if (gt62.f12611c[i2] == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C2725kr.m20987g(z2);
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo23357c(yk5[] yk5Arr) {
        int i = 0;
        while (true) {
            od5[] od5Arr = this.f15233i;
            if (i < od5Arr.length) {
                if (od5Arr[i].mo21684f() == -2 && this.f15238n.mo20847c(i)) {
                    yk5Arr[i] = new xo1();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public void mo23358d(long j) {
        C2725kr.m20987g(mo23371r());
        this.f15225a.mo7245e(mo23377y(j));
    }

    /* renamed from: f */
    public final void mo23359f() {
        if (mo23371r()) {
            int i = 0;
            while (true) {
                gt6 gt6 = this.f15238n;
                if (i < gt6.f12609a) {
                    boolean c = gt6.mo20847c(i);
                    dx1 dx1 = this.f15238n.f12611c[i];
                    if (c && dx1 != null) {
                        dx1.mo7664c();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo23360g(yk5[] yk5Arr) {
        int i = 0;
        while (true) {
            od5[] od5Arr = this.f15233i;
            if (i < od5Arr.length) {
                if (od5Arr[i].mo21684f() == -2) {
                    yk5Arr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public final void mo23361h() {
        if (mo23371r()) {
            int i = 0;
            while (true) {
                gt6 gt6 = this.f15238n;
                if (i < gt6.f12609a) {
                    boolean c = gt6.mo20847c(i);
                    dx1 dx1 = this.f15238n.f12611c[i];
                    if (c && dx1 != null) {
                        dx1.mo7680p();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public long mo23362i() {
        long j;
        if (!this.f15228d) {
            return this.f15230f.f16039b;
        }
        if (this.f15229e) {
            j = this.f15225a.mo7247h();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.f15230f.f16042e;
        }
        return j;
    }

    /* renamed from: j */
    public mr3 mo23363j() {
        return this.f15236l;
    }

    /* renamed from: k */
    public long mo23364k() {
        if (!this.f15228d) {
            return 0;
        }
        return this.f15225a.mo7241a();
    }

    /* renamed from: l */
    public long mo23365l() {
        return this.f15239o;
    }

    /* renamed from: m */
    public long mo23366m() {
        return this.f15230f.f16039b + this.f15239o;
    }

    /* renamed from: n */
    public ws6 mo23367n() {
        return this.f15237m;
    }

    /* renamed from: o */
    public gt6 mo23368o() {
        return this.f15238n;
    }

    /* renamed from: p */
    public void mo23369p(float f, C0831s sVar) throws ExoPlaybackException {
        this.f15228d = true;
        this.f15237m = this.f15225a.mo7255r();
        gt6 v = mo23374v(f, sVar);
        or3 or3 = this.f15230f;
        long j = or3.f16039b;
        long j2 = or3.f16042e;
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        long a = mo23355a(v, j, false);
        long j3 = this.f15239o;
        or3 or32 = this.f15230f;
        this.f15239o = j3 + (or32.f16039b - a);
        this.f15230f = or32.mo24083b(a);
    }

    /* renamed from: q */
    public boolean mo23370q() {
        if (!this.f15228d || (this.f15229e && this.f15225a.mo7247h() != Long.MIN_VALUE)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo23371r() {
        if (this.f15236l == null) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public void mo23372s(long j) {
        C2725kr.m20987g(mo23371r());
        if (this.f15228d) {
            this.f15225a.mo7248i(mo23377y(j));
        }
    }

    /* renamed from: t */
    public void mo23373t() {
        mo23359f();
        m22594u(this.f15235k, this.f15225a);
    }

    /* renamed from: v */
    public gt6 mo23374v(float f, C0831s sVar) throws ExoPlaybackException {
        gt6 h = this.f15234j.mo20186h(this.f15233i, mo23367n(), this.f15230f.f16038a, sVar);
        for (dx1 dx1 : h.f12611c) {
            if (dx1 != null) {
                dx1.mo7672i(f);
            }
        }
        return h;
    }

    /* renamed from: w */
    public void mo23375w(mr3 mr3) {
        if (mr3 != this.f15236l) {
            mo23359f();
            this.f15236l = mr3;
            mo23361h();
        }
    }

    /* renamed from: x */
    public void mo23376x(long j) {
        this.f15239o = j;
    }

    /* renamed from: y */
    public long mo23377y(long j) {
        return j - mo23365l();
    }

    /* renamed from: z */
    public long mo23378z(long j) {
        return j + mo23365l();
    }
}
