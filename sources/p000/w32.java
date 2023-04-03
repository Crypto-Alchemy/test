package p000;

import p000.x32;
import p000.xs5;

/* renamed from: w32 */
/* compiled from: FlacSeekTableSeekMap */
public final class w32 implements xs5 {

    /* renamed from: a */
    public final x32 f18978a;

    /* renamed from: b */
    public final long f18979b;

    public w32(x32 x32, long j) {
        this.f18978a = x32;
        this.f18979b = j;
    }

    /* renamed from: a */
    public final zs5 mo27417a(long j, long j2) {
        return new zs5((j * 1000000) / ((long) this.f18978a.f19301e), this.f18979b + j2);
    }

    /* renamed from: f */
    public xs5.C3641a mo11155f(long j) {
        long j2;
        C2725kr.m20989i(this.f18978a.f19307k);
        x32 x32 = this.f18978a;
        x32.C3567a aVar = x32.f19307k;
        long[] jArr = aVar.f19309a;
        long[] jArr2 = aVar.f19310b;
        int i = w67.m29358i(jArr, x32.mo27669i(j), true, false);
        long j3 = 0;
        if (i == -1) {
            j2 = 0;
        } else {
            j2 = jArr[i];
        }
        if (i != -1) {
            j3 = jArr2[i];
        }
        zs5 a = mo27417a(j2, j3);
        if (a.f20675a == j || i == jArr.length - 1) {
            return new xs5.C3641a(a);
        }
        int i2 = i + 1;
        return new xs5.C3641a(a, mo27417a(jArr[i2], jArr2[i2]));
    }

    /* renamed from: h */
    public boolean mo11156h() {
        return true;
    }

    /* renamed from: i */
    public long mo11157i() {
        return this.f18978a.mo27666f();
    }
}
