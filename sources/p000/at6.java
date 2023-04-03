package p000;

/* renamed from: at6 */
/* compiled from: TrackSampleTable */
public final class at6 {

    /* renamed from: a */
    public final qs6 f7753a;

    /* renamed from: b */
    public final int f7754b;

    /* renamed from: c */
    public final long[] f7755c;

    /* renamed from: d */
    public final int[] f7756d;

    /* renamed from: e */
    public final int f7757e;

    /* renamed from: f */
    public final long[] f7758f;

    /* renamed from: g */
    public final int[] f7759g;

    /* renamed from: h */
    public final long f7760h;

    public at6(qs6 qs6, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (iArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        if (jArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2725kr.m20981a(z2);
        C2725kr.m20981a(iArr2.length == jArr2.length ? true : z3);
        this.f7753a = qs6;
        this.f7755c = jArr;
        this.f7756d = iArr;
        this.f7757e = i;
        this.f7758f = jArr2;
        this.f7759g = iArr2;
        this.f7760h = j;
        this.f7754b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int mo11143a(long j) {
        for (int i = w67.m29358i(this.f7758f, j, true, false); i >= 0; i--) {
            if ((this.f7759g[i] & 1) != 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int mo11144b(long j) {
        for (int e = w67.m29350e(this.f7758f, j, true, false); e < this.f7758f.length; e++) {
            if ((this.f7759g[e] & 1) != 0) {
                return e;
            }
        }
        return -1;
    }
}
