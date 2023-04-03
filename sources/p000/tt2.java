package p000;

import p000.xs5;

/* renamed from: tt2 */
/* compiled from: IndexSeekMap */
public final class tt2 implements xs5 {

    /* renamed from: a */
    public final long[] f18256a;

    /* renamed from: b */
    public final long[] f18257b;

    /* renamed from: c */
    public final long f18258c;

    /* renamed from: d */
    public final boolean f18259d;

    public tt2(long[] jArr, long[] jArr2, long j) {
        boolean z;
        boolean z2;
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        int length = jArr2.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f18259d = z2;
        if (!z2 || jArr2[0] <= 0) {
            this.f18256a = jArr;
            this.f18257b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f18256a = jArr3;
            long[] jArr4 = new long[i];
            this.f18257b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f18258c = j;
    }

    /* renamed from: f */
    public xs5.C3641a mo11155f(long j) {
        if (!this.f18259d) {
            return new xs5.C3641a(zs5.f20674c);
        }
        int i = w67.m29358i(this.f18257b, j, true, true);
        zs5 zs5 = new zs5(this.f18257b[i], this.f18256a[i]);
        if (zs5.f20675a == j || i == this.f18257b.length - 1) {
            return new xs5.C3641a(zs5);
        }
        int i2 = i + 1;
        return new xs5.C3641a(zs5, new zs5(this.f18257b[i2], this.f18256a[i2]));
    }

    /* renamed from: h */
    public boolean mo11156h() {
        return this.f18259d;
    }

    /* renamed from: i */
    public long mo11157i() {
        return this.f18258c;
    }
}
