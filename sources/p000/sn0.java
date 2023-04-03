package p000;

import androidx.media3.exoplayer.source.C1002q;

/* renamed from: sn0 */
/* compiled from: CompositeSequenceableLoader */
public class sn0 implements C1002q {

    /* renamed from: a */
    public final C1002q[] f17750a;

    public sn0(C1002q[] qVarArr) {
        this.f17750a = qVarArr;
    }

    /* renamed from: a */
    public final long mo7241a() {
        long j = Long.MAX_VALUE;
        for (C1002q a : this.f17750a) {
            long a2 = a.mo7241a();
            if (a2 != Long.MIN_VALUE) {
                j = Math.min(j, a2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: d */
    public boolean mo7244d() {
        for (C1002q d : this.f17750a) {
            if (d.mo7244d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo7245e(long j) {
        boolean z;
        long j2 = j;
        boolean z2 = false;
        while (true) {
            long a = mo7241a();
            if (a != Long.MIN_VALUE) {
                boolean z3 = false;
                for (C1002q qVar : this.f17750a) {
                    long a2 = qVar.mo7241a();
                    if (a2 == Long.MIN_VALUE || a2 > j2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (a2 == a || z) {
                        z3 |= qVar.mo7245e(j2);
                    }
                }
                z2 |= z3;
                if (!z3) {
                    break;
                }
            } else {
                break;
            }
        }
        return z2;
    }

    /* renamed from: h */
    public final long mo7247h() {
        long j = Long.MAX_VALUE;
        for (C1002q h : this.f17750a) {
            long h2 = h.mo7247h();
            if (h2 != Long.MIN_VALUE) {
                j = Math.min(j, h2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: i */
    public final void mo7248i(long j) {
        for (C1002q i : this.f17750a) {
            i.mo7248i(j);
        }
    }
}
