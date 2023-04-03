package p000;

/* renamed from: m88 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class m88 {

    /* renamed from: a */
    public final String f31538a;

    /* renamed from: b */
    public final String f31539b;

    /* renamed from: c */
    public final long f31540c;

    /* renamed from: d */
    public final long f31541d;

    /* renamed from: e */
    public final long f31542e;

    /* renamed from: f */
    public final long f31543f;

    /* renamed from: g */
    public final long f31544g;

    /* renamed from: h */
    public final Long f31545h;

    /* renamed from: i */
    public final Long f31546i;

    /* renamed from: j */
    public final Long f31547j;

    /* renamed from: k */
    public final Boolean f31548k;

    public m88(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        cu4.m43217g(str);
        cu4.m43217g(str2);
        boolean z4 = true;
        if (j6 >= 0) {
            z = true;
        } else {
            z = false;
        }
        cu4.m43211a(z);
        if (j7 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        cu4.m43211a(z2);
        if (j8 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        cu4.m43211a(z3);
        cu4.m43211a(j9 < 0 ? false : z4);
        this.f31538a = str;
        this.f31539b = str2;
        this.f31540c = j6;
        this.f31541d = j7;
        this.f31542e = j8;
        this.f31543f = j4;
        this.f31544g = j9;
        this.f31545h = l;
        this.f31546i = l2;
        this.f31547j = l3;
        this.f31548k = bool;
    }

    /* renamed from: a */
    public final m88 mo45700a(long j) {
        return new m88(this.f31538a, this.f31539b, this.f31540c, this.f31541d, this.f31542e, j, this.f31544g, this.f31545h, this.f31546i, this.f31547j, this.f31548k);
    }

    /* renamed from: b */
    public final m88 mo45701b(long j, long j2) {
        return new m88(this.f31538a, this.f31539b, this.f31540c, this.f31541d, this.f31542e, this.f31543f, j, Long.valueOf(j2), this.f31546i, this.f31547j, this.f31548k);
    }

    /* renamed from: c */
    public final m88 mo45702c(Long l, Long l2, Boolean bool) {
        Boolean bool2;
        if (bool == null || bool.booleanValue()) {
            bool2 = bool;
        } else {
            bool2 = null;
        }
        return new m88(this.f31538a, this.f31539b, this.f31540c, this.f31541d, this.f31542e, this.f31543f, this.f31544g, this.f31545h, l, l2, bool2);
    }
}
