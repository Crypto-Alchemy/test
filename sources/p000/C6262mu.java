package p000;

import p000.av0;

/* renamed from: mu */
/* compiled from: AutoValue_CrashlyticsReport_Session_Device */
public final class C6262mu extends av0.C3834e.C3839c {

    /* renamed from: a */
    public final int f31811a;

    /* renamed from: b */
    public final String f31812b;

    /* renamed from: c */
    public final int f31813c;

    /* renamed from: d */
    public final long f31814d;

    /* renamed from: e */
    public final long f31815e;

    /* renamed from: f */
    public final boolean f31816f;

    /* renamed from: g */
    public final int f31817g;

    /* renamed from: h */
    public final String f31818h;

    /* renamed from: i */
    public final String f31819i;

    /* renamed from: mu$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Device */
    public static final class C6264b extends av0.C3834e.C3839c.C3840a {

        /* renamed from: a */
        public Integer f31820a;

        /* renamed from: b */
        public String f31821b;

        /* renamed from: c */
        public Integer f31822c;

        /* renamed from: d */
        public Long f31823d;

        /* renamed from: e */
        public Long f31824e;

        /* renamed from: f */
        public Boolean f31825f;

        /* renamed from: g */
        public Integer f31826g;

        /* renamed from: h */
        public String f31827h;

        /* renamed from: i */
        public String f31828i;

        /* renamed from: a */
        public av0.C3834e.C3839c mo29246a() {
            String str = "";
            if (this.f31820a == null) {
                str = str + " arch";
            }
            if (this.f31821b == null) {
                str = str + " model";
            }
            if (this.f31822c == null) {
                str = str + " cores";
            }
            if (this.f31823d == null) {
                str = str + " ram";
            }
            if (this.f31824e == null) {
                str = str + " diskSpace";
            }
            if (this.f31825f == null) {
                str = str + " simulator";
            }
            if (this.f31826g == null) {
                str = str + " state";
            }
            if (this.f31827h == null) {
                str = str + " manufacturer";
            }
            if (this.f31828i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C6262mu(this.f31820a.intValue(), this.f31821b, this.f31822c.intValue(), this.f31823d.longValue(), this.f31824e.longValue(), this.f31825f.booleanValue(), this.f31826g.intValue(), this.f31827h, this.f31828i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3839c.C3840a mo29247b(int i) {
            this.f31820a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public av0.C3834e.C3839c.C3840a mo29248c(int i) {
            this.f31822c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public av0.C3834e.C3839c.C3840a mo29249d(long j) {
            this.f31824e = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public av0.C3834e.C3839c.C3840a mo29250e(String str) {
            if (str != null) {
                this.f31827h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        /* renamed from: f */
        public av0.C3834e.C3839c.C3840a mo29251f(String str) {
            if (str != null) {
                this.f31821b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        /* renamed from: g */
        public av0.C3834e.C3839c.C3840a mo29252g(String str) {
            if (str != null) {
                this.f31828i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        /* renamed from: h */
        public av0.C3834e.C3839c.C3840a mo29253h(long j) {
            this.f31823d = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public av0.C3834e.C3839c.C3840a mo29254i(boolean z) {
            this.f31825f = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: j */
        public av0.C3834e.C3839c.C3840a mo29255j(int i) {
            this.f31826g = Integer.valueOf(i);
            return this;
        }
    }

    /* renamed from: b */
    public int mo29237b() {
        return this.f31811a;
    }

    /* renamed from: c */
    public int mo29238c() {
        return this.f31813c;
    }

    /* renamed from: d */
    public long mo29239d() {
        return this.f31815e;
    }

    /* renamed from: e */
    public String mo29240e() {
        return this.f31818h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e.C3839c)) {
            return false;
        }
        av0.C3834e.C3839c cVar = (av0.C3834e.C3839c) obj;
        if (this.f31811a == cVar.mo29237b() && this.f31812b.equals(cVar.mo29241f()) && this.f31813c == cVar.mo29238c() && this.f31814d == cVar.mo29243h() && this.f31815e == cVar.mo29239d() && this.f31816f == cVar.mo29245j() && this.f31817g == cVar.mo29244i() && this.f31818h.equals(cVar.mo29240e()) && this.f31819i.equals(cVar.mo29242g())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo29241f() {
        return this.f31812b;
    }

    /* renamed from: g */
    public String mo29242g() {
        return this.f31819i;
    }

    /* renamed from: h */
    public long mo29243h() {
        return this.f31814d;
    }

    public int hashCode() {
        int i;
        long j = this.f31814d;
        long j2 = this.f31815e;
        int hashCode = (((((((((this.f31811a ^ 1000003) * 1000003) ^ this.f31812b.hashCode()) * 1000003) ^ this.f31813c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f31816f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f31817g) * 1000003) ^ this.f31818h.hashCode()) * 1000003) ^ this.f31819i.hashCode();
    }

    /* renamed from: i */
    public int mo29244i() {
        return this.f31817g;
    }

    /* renamed from: j */
    public boolean mo29245j() {
        return this.f31816f;
    }

    public String toString() {
        return "Device{arch=" + this.f31811a + ", model=" + this.f31812b + ", cores=" + this.f31813c + ", ram=" + this.f31814d + ", diskSpace=" + this.f31815e + ", simulator=" + this.f31816f + ", state=" + this.f31817g + ", manufacturer=" + this.f31818h + ", modelClass=" + this.f31819i + "}";
    }

    public C6262mu(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f31811a = i;
        this.f31812b = str;
        this.f31813c = i2;
        this.f31814d = j;
        this.f31815e = j2;
        this.f31816f = z;
        this.f31817g = i3;
        this.f31818h = str2;
        this.f31819i = str3;
    }
}
