package p000;

import p000.av0;

/* renamed from: fu */
/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo */
public final class C5847fu extends av0.C3825a {

    /* renamed from: a */
    public final int f28973a;

    /* renamed from: b */
    public final String f28974b;

    /* renamed from: c */
    public final int f28975c;

    /* renamed from: d */
    public final int f28976d;

    /* renamed from: e */
    public final long f28977e;

    /* renamed from: f */
    public final long f28978f;

    /* renamed from: g */
    public final long f28979g;

    /* renamed from: h */
    public final String f28980h;

    /* renamed from: fu$b */
    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo */
    public static final class C5849b extends av0.C3825a.C3826a {

        /* renamed from: a */
        public Integer f28981a;

        /* renamed from: b */
        public String f28982b;

        /* renamed from: c */
        public Integer f28983c;

        /* renamed from: d */
        public Integer f28984d;

        /* renamed from: e */
        public Long f28985e;

        /* renamed from: f */
        public Long f28986f;

        /* renamed from: g */
        public Long f28987g;

        /* renamed from: h */
        public String f28988h;

        /* renamed from: a */
        public av0.C3825a mo29161a() {
            String str = "";
            if (this.f28981a == null) {
                str = str + " pid";
            }
            if (this.f28982b == null) {
                str = str + " processName";
            }
            if (this.f28983c == null) {
                str = str + " reasonCode";
            }
            if (this.f28984d == null) {
                str = str + " importance";
            }
            if (this.f28985e == null) {
                str = str + " pss";
            }
            if (this.f28986f == null) {
                str = str + " rss";
            }
            if (this.f28987g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C5847fu(this.f28981a.intValue(), this.f28982b, this.f28983c.intValue(), this.f28984d.intValue(), this.f28985e.longValue(), this.f28986f.longValue(), this.f28987g.longValue(), this.f28988h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3825a.C3826a mo29162b(int i) {
            this.f28984d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public av0.C3825a.C3826a mo29163c(int i) {
            this.f28981a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public av0.C3825a.C3826a mo29164d(String str) {
            if (str != null) {
                this.f28982b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        /* renamed from: e */
        public av0.C3825a.C3826a mo29165e(long j) {
            this.f28985e = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public av0.C3825a.C3826a mo29166f(int i) {
            this.f28983c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: g */
        public av0.C3825a.C3826a mo29167g(long j) {
            this.f28986f = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public av0.C3825a.C3826a mo29168h(long j) {
            this.f28987g = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public av0.C3825a.C3826a mo29169i(String str) {
            this.f28988h = str;
            return this;
        }
    }

    /* renamed from: b */
    public int mo29153b() {
        return this.f28976d;
    }

    /* renamed from: c */
    public int mo29154c() {
        return this.f28973a;
    }

    /* renamed from: d */
    public String mo29155d() {
        return this.f28974b;
    }

    /* renamed from: e */
    public long mo29156e() {
        return this.f28977e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3825a)) {
            return false;
        }
        av0.C3825a aVar = (av0.C3825a) obj;
        if (this.f28973a == aVar.mo29154c() && this.f28974b.equals(aVar.mo29155d()) && this.f28975c == aVar.mo29157f() && this.f28976d == aVar.mo29153b() && this.f28977e == aVar.mo29156e() && this.f28978f == aVar.mo29158g() && this.f28979g == aVar.mo29159h()) {
            String str = this.f28980h;
            if (str == null) {
                if (aVar.mo29160i() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo29160i())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public int mo29157f() {
        return this.f28975c;
    }

    /* renamed from: g */
    public long mo29158g() {
        return this.f28978f;
    }

    /* renamed from: h */
    public long mo29159h() {
        return this.f28979g;
    }

    public int hashCode() {
        int i;
        long j = this.f28977e;
        long j2 = this.f28978f;
        long j3 = this.f28979g;
        int hashCode = (((((((((((((this.f28973a ^ 1000003) * 1000003) ^ this.f28974b.hashCode()) * 1000003) ^ this.f28975c) * 1000003) ^ this.f28976d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f28980h;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public String mo29160i() {
        return this.f28980h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f28973a + ", processName=" + this.f28974b + ", reasonCode=" + this.f28975c + ", importance=" + this.f28976d + ", pss=" + this.f28977e + ", rss=" + this.f28978f + ", timestamp=" + this.f28979g + ", traceFile=" + this.f28980h + "}";
    }

    public C5847fu(int i, String str, int i2, int i3, long j, long j2, long j3, String str2) {
        this.f28973a = i;
        this.f28974b = str;
        this.f28975c = i2;
        this.f28976d = i3;
        this.f28977e = j;
        this.f28978f = j2;
        this.f28979g = j3;
        this.f28980h = str2;
    }
}
