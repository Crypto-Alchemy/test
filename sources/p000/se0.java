package p000;

import java.util.Arrays;
import p000.xs5;

/* renamed from: se0 */
/* compiled from: ChunkIndex */
public final class se0 implements xs5 {

    /* renamed from: a */
    public final int f17657a;

    /* renamed from: b */
    public final int[] f17658b;

    /* renamed from: c */
    public final long[] f17659c;

    /* renamed from: d */
    public final long[] f17660d;

    /* renamed from: e */
    public final long[] f17661e;

    /* renamed from: f */
    public final long f17662f;

    public se0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f17658b = iArr;
        this.f17659c = jArr;
        this.f17660d = jArr2;
        this.f17661e = jArr3;
        int length = iArr.length;
        this.f17657a = length;
        if (length > 0) {
            this.f17662f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f17662f = 0;
        }
    }

    /* renamed from: a */
    public int mo25764a(long j) {
        return w67.m29358i(this.f17661e, j, true, true);
    }

    /* renamed from: f */
    public xs5.C3641a mo11155f(long j) {
        int a = mo25764a(j);
        zs5 zs5 = new zs5(this.f17661e[a], this.f17659c[a]);
        if (zs5.f20675a >= j || a == this.f17657a - 1) {
            return new xs5.C3641a(zs5);
        }
        int i = a + 1;
        return new xs5.C3641a(zs5, new zs5(this.f17661e[i], this.f17659c[i]));
    }

    /* renamed from: h */
    public boolean mo11156h() {
        return true;
    }

    /* renamed from: i */
    public long mo11157i() {
        return this.f17662f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f17657a + ", sizes=" + Arrays.toString(this.f17658b) + ", offsets=" + Arrays.toString(this.f17659c) + ", timeUs=" + Arrays.toString(this.f17661e) + ", durationsUs=" + Arrays.toString(this.f17660d) + ")";
    }
}
