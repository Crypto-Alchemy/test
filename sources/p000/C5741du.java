package p000;

import p000.av0;

/* renamed from: du */
/* compiled from: AutoValue_CrashlyticsReport */
public final class C5741du extends av0 {

    /* renamed from: b */
    public final String f28298b;

    /* renamed from: c */
    public final String f28299c;

    /* renamed from: d */
    public final int f28300d;

    /* renamed from: e */
    public final String f28301e;

    /* renamed from: f */
    public final String f28302f;

    /* renamed from: g */
    public final String f28303g;

    /* renamed from: h */
    public final av0.C3834e f28304h;

    /* renamed from: i */
    public final av0.C3830d f28305i;

    /* renamed from: du$b */
    /* compiled from: AutoValue_CrashlyticsReport */
    public static final class C5743b extends av0.C3827b {

        /* renamed from: a */
        public String f28306a;

        /* renamed from: b */
        public String f28307b;

        /* renamed from: c */
        public Integer f28308c;

        /* renamed from: d */
        public String f28309d;

        /* renamed from: e */
        public String f28310e;

        /* renamed from: f */
        public String f28311f;

        /* renamed from: g */
        public av0.C3834e f28312g;

        /* renamed from: h */
        public av0.C3830d f28313h;

        /* renamed from: a */
        public av0 mo29170a() {
            String str = "";
            if (this.f28306a == null) {
                str = str + " sdkVersion";
            }
            if (this.f28307b == null) {
                str = str + " gmpAppId";
            }
            if (this.f28308c == null) {
                str = str + " platform";
            }
            if (this.f28309d == null) {
                str = str + " installationUuid";
            }
            if (this.f28310e == null) {
                str = str + " buildVersion";
            }
            if (this.f28311f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C5741du(this.f28306a, this.f28307b, this.f28308c.intValue(), this.f28309d, this.f28310e, this.f28311f, this.f28312g, this.f28313h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3827b mo29171b(String str) {
            if (str != null) {
                this.f28310e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        /* renamed from: c */
        public av0.C3827b mo29172c(String str) {
            if (str != null) {
                this.f28311f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        /* renamed from: d */
        public av0.C3827b mo29173d(String str) {
            if (str != null) {
                this.f28307b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        /* renamed from: e */
        public av0.C3827b mo29174e(String str) {
            if (str != null) {
                this.f28309d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        /* renamed from: f */
        public av0.C3827b mo29175f(av0.C3830d dVar) {
            this.f28313h = dVar;
            return this;
        }

        /* renamed from: g */
        public av0.C3827b mo29176g(int i) {
            this.f28308c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public av0.C3827b mo29177h(String str) {
            if (str != null) {
                this.f28306a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        /* renamed from: i */
        public av0.C3827b mo29178i(av0.C3834e eVar) {
            this.f28312g = eVar;
            return this;
        }

        public C5743b() {
        }

        public C5743b(av0 av0) {
            this.f28306a = av0.mo29147i();
            this.f28307b = av0.mo29143e();
            this.f28308c = Integer.valueOf(av0.mo29146h());
            this.f28309d = av0.mo29144f();
            this.f28310e = av0.mo29141c();
            this.f28311f = av0.mo29142d();
            this.f28312g = av0.mo29148j();
            this.f28313h = av0.mo29145g();
        }
    }

    /* renamed from: c */
    public String mo29141c() {
        return this.f28302f;
    }

    /* renamed from: d */
    public String mo29142d() {
        return this.f28303g;
    }

    /* renamed from: e */
    public String mo29143e() {
        return this.f28299c;
    }

    public boolean equals(Object obj) {
        av0.C3834e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0)) {
            return false;
        }
        av0 av0 = (av0) obj;
        if (this.f28298b.equals(av0.mo29147i()) && this.f28299c.equals(av0.mo29143e()) && this.f28300d == av0.mo29146h() && this.f28301e.equals(av0.mo29144f()) && this.f28302f.equals(av0.mo29141c()) && this.f28303g.equals(av0.mo29142d()) && ((eVar = this.f28304h) != null ? eVar.equals(av0.mo29148j()) : av0.mo29148j() == null)) {
            av0.C3830d dVar = this.f28305i;
            if (dVar == null) {
                if (av0.mo29145g() == null) {
                    return true;
                }
            } else if (dVar.equals(av0.mo29145g())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo29144f() {
        return this.f28301e;
    }

    /* renamed from: g */
    public av0.C3830d mo29145g() {
        return this.f28305i;
    }

    /* renamed from: h */
    public int mo29146h() {
        return this.f28300d;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((((((((this.f28298b.hashCode() ^ 1000003) * 1000003) ^ this.f28299c.hashCode()) * 1000003) ^ this.f28300d) * 1000003) ^ this.f28301e.hashCode()) * 1000003) ^ this.f28302f.hashCode()) * 1000003) ^ this.f28303g.hashCode()) * 1000003;
        av0.C3834e eVar = this.f28304h;
        int i2 = 0;
        if (eVar == null) {
            i = 0;
        } else {
            i = eVar.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        av0.C3830d dVar = this.f28305i;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return i3 ^ i2;
    }

    /* renamed from: i */
    public String mo29147i() {
        return this.f28298b;
    }

    /* renamed from: j */
    public av0.C3834e mo29148j() {
        return this.f28304h;
    }

    /* renamed from: k */
    public av0.C3827b mo29149k() {
        return new C5743b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f28298b + ", gmpAppId=" + this.f28299c + ", platform=" + this.f28300d + ", installationUuid=" + this.f28301e + ", buildVersion=" + this.f28302f + ", displayVersion=" + this.f28303g + ", session=" + this.f28304h + ", ndkPayload=" + this.f28305i + "}";
    }

    public C5741du(String str, String str2, int i, String str3, String str4, String str5, av0.C3834e eVar, av0.C3830d dVar) {
        this.f28298b = str;
        this.f28299c = str2;
        this.f28300d = i;
        this.f28301e = str3;
        this.f28302f = str4;
        this.f28303g = str5;
        this.f28304h = eVar;
        this.f28305i = dVar;
    }
}
