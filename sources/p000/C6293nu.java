package p000;

import p000.av0;

/* renamed from: nu */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event */
public final class C6293nu extends av0.C3834e.C3841d {

    /* renamed from: a */
    public final long f32187a;

    /* renamed from: b */
    public final String f32188b;

    /* renamed from: c */
    public final av0.C3834e.C3841d.C3842a f32189c;

    /* renamed from: d */
    public final av0.C3834e.C3841d.C3857c f32190d;

    /* renamed from: e */
    public final av0.C3834e.C3841d.C3859d f32191e;

    /* renamed from: nu$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event */
    public static final class C6295b extends av0.C3834e.C3841d.C3856b {

        /* renamed from: a */
        public Long f32192a;

        /* renamed from: b */
        public String f32193b;

        /* renamed from: c */
        public av0.C3834e.C3841d.C3842a f32194c;

        /* renamed from: d */
        public av0.C3834e.C3841d.C3857c f32195d;

        /* renamed from: e */
        public av0.C3834e.C3841d.C3859d f32196e;

        /* renamed from: a */
        public av0.C3834e.C3841d mo29332a() {
            String str = "";
            if (this.f32192a == null) {
                str = str + " timestamp";
            }
            if (this.f32193b == null) {
                str = str + " type";
            }
            if (this.f32194c == null) {
                str = str + " app";
            }
            if (this.f32195d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C6293nu(this.f32192a.longValue(), this.f32193b, this.f32194c, this.f32195d, this.f32196e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3841d.C3856b mo29333b(av0.C3834e.C3841d.C3842a aVar) {
            if (aVar != null) {
                this.f32194c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: c */
        public av0.C3834e.C3841d.C3856b mo29334c(av0.C3834e.C3841d.C3857c cVar) {
            if (cVar != null) {
                this.f32195d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        /* renamed from: d */
        public av0.C3834e.C3841d.C3856b mo29335d(av0.C3834e.C3841d.C3859d dVar) {
            this.f32196e = dVar;
            return this;
        }

        /* renamed from: e */
        public av0.C3834e.C3841d.C3856b mo29336e(long j) {
            this.f32192a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public av0.C3834e.C3841d.C3856b mo29337f(String str) {
            if (str != null) {
                this.f32193b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public C6295b() {
        }

        public C6295b(av0.C3834e.C3841d dVar) {
            this.f32192a = Long.valueOf(dVar.mo29259e());
            this.f32193b = dVar.mo29260f();
            this.f32194c = dVar.mo29256b();
            this.f32195d = dVar.mo29257c();
            this.f32196e = dVar.mo29258d();
        }
    }

    /* renamed from: b */
    public av0.C3834e.C3841d.C3842a mo29256b() {
        return this.f32189c;
    }

    /* renamed from: c */
    public av0.C3834e.C3841d.C3857c mo29257c() {
        return this.f32190d;
    }

    /* renamed from: d */
    public av0.C3834e.C3841d.C3859d mo29258d() {
        return this.f32191e;
    }

    /* renamed from: e */
    public long mo29259e() {
        return this.f32187a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e.C3841d)) {
            return false;
        }
        av0.C3834e.C3841d dVar = (av0.C3834e.C3841d) obj;
        if (this.f32187a == dVar.mo29259e() && this.f32188b.equals(dVar.mo29260f()) && this.f32189c.equals(dVar.mo29256b()) && this.f32190d.equals(dVar.mo29257c())) {
            av0.C3834e.C3841d.C3859d dVar2 = this.f32191e;
            if (dVar2 == null) {
                if (dVar.mo29258d() == null) {
                    return true;
                }
            } else if (dVar2.equals(dVar.mo29258d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo29260f() {
        return this.f32188b;
    }

    /* renamed from: g */
    public av0.C3834e.C3841d.C3856b mo29261g() {
        return new C6295b(this);
    }

    public int hashCode() {
        int i;
        long j = this.f32187a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f32188b.hashCode()) * 1000003) ^ this.f32189c.hashCode()) * 1000003) ^ this.f32190d.hashCode()) * 1000003;
        av0.C3834e.C3841d.C3859d dVar = this.f32191e;
        if (dVar == null) {
            i = 0;
        } else {
            i = dVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Event{timestamp=" + this.f32187a + ", type=" + this.f32188b + ", app=" + this.f32189c + ", device=" + this.f32190d + ", log=" + this.f32191e + "}";
    }

    public C6293nu(long j, String str, av0.C3834e.C3841d.C3842a aVar, av0.C3834e.C3841d.C3857c cVar, av0.C3834e.C3841d.C3859d dVar) {
        this.f32187a = j;
        this.f32188b = str;
        this.f32189c = aVar;
        this.f32190d = cVar;
        this.f32191e = dVar;
    }
}
