package p000;

import p000.av0;

/* renamed from: vu */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device */
public final class C6628vu extends av0.C3834e.C3841d.C3857c {

    /* renamed from: a */
    public final Double f35126a;

    /* renamed from: b */
    public final int f35127b;

    /* renamed from: c */
    public final boolean f35128c;

    /* renamed from: d */
    public final int f35129d;

    /* renamed from: e */
    public final long f35130e;

    /* renamed from: f */
    public final long f35131f;

    /* renamed from: vu$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device */
    public static final class C6630b extends av0.C3834e.C3841d.C3857c.C3858a {

        /* renamed from: a */
        public Double f35132a;

        /* renamed from: b */
        public Integer f35133b;

        /* renamed from: c */
        public Boolean f35134c;

        /* renamed from: d */
        public Integer f35135d;

        /* renamed from: e */
        public Long f35136e;

        /* renamed from: f */
        public Long f35137f;

        /* renamed from: a */
        public av0.C3834e.C3841d.C3857c mo29344a() {
            String str = "";
            if (this.f35133b == null) {
                str = str + " batteryVelocity";
            }
            if (this.f35134c == null) {
                str = str + " proximityOn";
            }
            if (this.f35135d == null) {
                str = str + " orientation";
            }
            if (this.f35136e == null) {
                str = str + " ramUsed";
            }
            if (this.f35137f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C6628vu(this.f35132a, this.f35133b.intValue(), this.f35134c.booleanValue(), this.f35135d.intValue(), this.f35136e.longValue(), this.f35137f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3841d.C3857c.C3858a mo29345b(Double d) {
            this.f35132a = d;
            return this;
        }

        /* renamed from: c */
        public av0.C3834e.C3841d.C3857c.C3858a mo29346c(int i) {
            this.f35133b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public av0.C3834e.C3841d.C3857c.C3858a mo29347d(long j) {
            this.f35137f = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public av0.C3834e.C3841d.C3857c.C3858a mo29348e(int i) {
            this.f35135d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public av0.C3834e.C3841d.C3857c.C3858a mo29349f(boolean z) {
            this.f35134c = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: g */
        public av0.C3834e.C3841d.C3857c.C3858a mo29350g(long j) {
            this.f35136e = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public Double mo29338b() {
        return this.f35126a;
    }

    /* renamed from: c */
    public int mo29339c() {
        return this.f35127b;
    }

    /* renamed from: d */
    public long mo29340d() {
        return this.f35131f;
    }

    /* renamed from: e */
    public int mo29341e() {
        return this.f35129d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e.C3841d.C3857c)) {
            return false;
        }
        av0.C3834e.C3841d.C3857c cVar = (av0.C3834e.C3841d.C3857c) obj;
        Double d = this.f35126a;
        if (d != null ? d.equals(cVar.mo29338b()) : cVar.mo29338b() == null) {
            if (this.f35127b == cVar.mo29339c() && this.f35128c == cVar.mo29343g() && this.f35129d == cVar.mo29341e() && this.f35130e == cVar.mo29342f() && this.f35131f == cVar.mo29340d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public long mo29342f() {
        return this.f35130e;
    }

    /* renamed from: g */
    public boolean mo29343g() {
        return this.f35128c;
    }

    public int hashCode() {
        int i;
        int i2;
        Double d = this.f35126a;
        if (d == null) {
            i = 0;
        } else {
            i = d.hashCode();
        }
        int i3 = (((i ^ 1000003) * 1000003) ^ this.f35127b) * 1000003;
        if (this.f35128c) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        long j = this.f35130e;
        long j2 = this.f35131f;
        return ((((((i3 ^ i2) * 1000003) ^ this.f35129d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f35126a + ", batteryVelocity=" + this.f35127b + ", proximityOn=" + this.f35128c + ", orientation=" + this.f35129d + ", ramUsed=" + this.f35130e + ", diskUsed=" + this.f35131f + "}";
    }

    public C6628vu(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f35126a = d;
        this.f35127b = i;
        this.f35128c = z;
        this.f35129d = i2;
        this.f35130e = j;
        this.f35131f = j2;
    }
}
