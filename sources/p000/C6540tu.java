package p000;

import p000.av0;

/* renamed from: tu */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
public final class C6540tu extends av0.C3834e.C3841d.C3842a.C3844b.C3852e {

    /* renamed from: a */
    public final String f34343a;

    /* renamed from: b */
    public final int f34344b;

    /* renamed from: c */
    public final ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b> f34345c;

    /* renamed from: tu$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
    public static final class C6542b extends av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3853a {

        /* renamed from: a */
        public String f34346a;

        /* renamed from: b */
        public Integer f34347b;

        /* renamed from: c */
        public ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b> f34348c;

        /* renamed from: a */
        public av0.C3834e.C3841d.C3842a.C3844b.C3852e mo29317a() {
            String str = "";
            if (this.f34346a == null) {
                str = str + " name";
            }
            if (this.f34347b == null) {
                str = str + " importance";
            }
            if (this.f34348c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C6540tu(this.f34346a, this.f34347b.intValue(), this.f34348c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3853a mo29318b(ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b> ms2) {
            if (ms2 != null) {
                this.f34348c = ms2;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        /* renamed from: c */
        public av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3853a mo29319c(int i) {
            this.f34347b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3853a mo29320d(String str) {
            if (str != null) {
                this.f34346a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    /* renamed from: b */
    public ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b> mo29314b() {
        return this.f34345c;
    }

    /* renamed from: c */
    public int mo29315c() {
        return this.f34344b;
    }

    /* renamed from: d */
    public String mo29316d() {
        return this.f34343a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e.C3841d.C3842a.C3844b.C3852e)) {
            return false;
        }
        av0.C3834e.C3841d.C3842a.C3844b.C3852e eVar = (av0.C3834e.C3841d.C3842a.C3844b.C3852e) obj;
        if (!this.f34343a.equals(eVar.mo29316d()) || this.f34344b != eVar.mo29315c() || !this.f34345c.equals(eVar.mo29314b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f34343a.hashCode() ^ 1000003) * 1000003) ^ this.f34344b) * 1000003) ^ this.f34345c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f34343a + ", importance=" + this.f34344b + ", frames=" + this.f34345c + "}";
    }

    public C6540tu(String str, int i, ms2<av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b> ms2) {
        this.f34343a = str;
        this.f34344b = i;
        this.f34345c = ms2;
    }
}
