package p000;

import p000.xs5;

/* renamed from: dq0 */
/* compiled from: ConstantBitrateSeekMap */
public class dq0 implements xs5 {

    /* renamed from: a */
    public final long f10807a;

    /* renamed from: b */
    public final long f10808b;

    /* renamed from: c */
    public final int f10809c;

    /* renamed from: d */
    public final long f10810d;

    /* renamed from: e */
    public final int f10811e;

    /* renamed from: f */
    public final long f10812f;

    /* renamed from: g */
    public final boolean f10813g;

    public dq0(long j, long j2, int i, int i2, boolean z) {
        this.f10807a = j;
        this.f10808b = j2;
        this.f10809c = i2 == -1 ? 1 : i2;
        this.f10811e = i;
        this.f10813g = z;
        if (j == -1) {
            this.f10810d = -1;
            this.f10812f = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            return;
        }
        this.f10810d = j - j2;
        this.f10812f = m15270d(j, j2, i);
    }

    /* renamed from: d */
    public static long m15270d(long j, long j2, int i) {
        return ((Math.max(0, j - j2) * 8) * 1000000) / ((long) i);
    }

    /* renamed from: a */
    public final long mo18874a(long j) {
        int i = this.f10809c;
        long j2 = (((j * ((long) this.f10811e)) / 8000000) / ((long) i)) * ((long) i);
        long j3 = this.f10810d;
        if (j3 != -1) {
            j2 = Math.min(j2, j3 - ((long) i));
        }
        return this.f10808b + Math.max(j2, 0);
    }

    /* renamed from: b */
    public long mo18875b(long j) {
        return m15270d(j, this.f10808b, this.f10811e);
    }

    /* renamed from: f */
    public xs5.C3641a mo11155f(long j) {
        if (this.f10810d == -1 && !this.f10813g) {
            return new xs5.C3641a(new zs5(0, this.f10808b));
        }
        long a = mo18874a(j);
        long b = mo18875b(a);
        zs5 zs5 = new zs5(b, a);
        if (this.f10810d != -1 && b < j) {
            int i = this.f10809c;
            if (((long) i) + a < this.f10807a) {
                long j2 = a + ((long) i);
                return new xs5.C3641a(zs5, new zs5(mo18875b(j2), j2));
            }
        }
        return new xs5.C3641a(zs5);
    }

    /* renamed from: h */
    public boolean mo11156h() {
        if (this.f10810d != -1 || this.f10813g) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public long mo11157i() {
        return this.f10812f;
    }
}
