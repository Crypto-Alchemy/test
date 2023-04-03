package p000;

/* renamed from: cw */
/* compiled from: AviStreamHeaderChunk */
public final class C2125cw implements C3763zv {

    /* renamed from: a */
    public final int f10391a;

    /* renamed from: b */
    public final int f10392b;

    /* renamed from: c */
    public final int f10393c;

    /* renamed from: d */
    public final int f10394d;

    /* renamed from: e */
    public final int f10395e;

    /* renamed from: f */
    public final int f10396f;

    public C2125cw(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f10391a = i;
        this.f10392b = i2;
        this.f10393c = i3;
        this.f10394d = i4;
        this.f10395e = i5;
        this.f10396f = i6;
    }

    /* renamed from: c */
    public static C2125cw m14586c(gm4 gm4) {
        int q = gm4.mo20692q();
        gm4.mo20675Q(12);
        int q2 = gm4.mo20692q();
        int q3 = gm4.mo20692q();
        int q4 = gm4.mo20692q();
        gm4.mo20675Q(4);
        int q5 = gm4.mo20692q();
        int q6 = gm4.mo20692q();
        gm4.mo20675Q(8);
        return new C2125cw(q, q2, q3, q4, q5, q6);
    }

    /* renamed from: a */
    public long mo18363a() {
        return w67.m29313J0((long) this.f10395e, ((long) this.f10393c) * 1000000, (long) this.f10394d);
    }

    /* renamed from: b */
    public int mo18364b() {
        int i = this.f10391a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        gk3.m18132i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f10391a));
        return -1;
    }

    public int getType() {
        return 1752331379;
    }
}
