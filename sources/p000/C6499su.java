package p000;

import p000.av0;

/* renamed from: su */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
public final class C6499su extends av0.C3834e.C3841d.C3842a.C3844b.C3850d {

    /* renamed from: a */
    public final String f34008a;

    /* renamed from: b */
    public final String f34009b;

    /* renamed from: c */
    public final long f34010c;

    /* renamed from: su$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
    public static final class C6501b extends av0.C3834e.C3841d.C3842a.C3844b.C3850d.C3851a {

        /* renamed from: a */
        public String f34011a;

        /* renamed from: b */
        public String f34012b;

        /* renamed from: c */
        public Long f34013c;

        /* renamed from: a */
        public av0.C3834e.C3841d.C3842a.C3844b.C3850d mo29310a() {
            String str = "";
            if (this.f34011a == null) {
                str = str + " name";
            }
            if (this.f34012b == null) {
                str = str + " code";
            }
            if (this.f34013c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C6499su(this.f34011a, this.f34012b, this.f34013c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3841d.C3842a.C3844b.C3850d.C3851a mo29311b(long j) {
            this.f34013c = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public av0.C3834e.C3841d.C3842a.C3844b.C3850d.C3851a mo29312c(String str) {
            if (str != null) {
                this.f34012b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        /* renamed from: d */
        public av0.C3834e.C3841d.C3842a.C3844b.C3850d.C3851a mo29313d(String str) {
            if (str != null) {
                this.f34011a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    /* renamed from: b */
    public long mo29307b() {
        return this.f34010c;
    }

    /* renamed from: c */
    public String mo29308c() {
        return this.f34009b;
    }

    /* renamed from: d */
    public String mo29309d() {
        return this.f34008a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e.C3841d.C3842a.C3844b.C3850d)) {
            return false;
        }
        av0.C3834e.C3841d.C3842a.C3844b.C3850d dVar = (av0.C3834e.C3841d.C3842a.C3844b.C3850d) obj;
        if (!this.f34008a.equals(dVar.mo29309d()) || !this.f34009b.equals(dVar.mo29308c()) || this.f34010c != dVar.mo29307b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f34010c;
        return ((((this.f34008a.hashCode() ^ 1000003) * 1000003) ^ this.f34009b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f34008a + ", code=" + this.f34009b + ", address=" + this.f34010c + "}";
    }

    public C6499su(String str, String str2, long j) {
        this.f34008a = str;
        this.f34009b = str2;
        this.f34010c = j;
    }
}
