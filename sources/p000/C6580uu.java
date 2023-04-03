package p000;

import p000.av0;

/* renamed from: uu */
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
public final class C6580uu extends av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b {

    /* renamed from: a */
    public final long f34709a;

    /* renamed from: b */
    public final String f34710b;

    /* renamed from: c */
    public final String f34711c;

    /* renamed from: d */
    public final long f34712d;

    /* renamed from: e */
    public final int f34713e;

    /* renamed from: uu$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
    public static final class C6582b extends av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b.C3855a {

        /* renamed from: a */
        public Long f34714a;

        /* renamed from: b */
        public String f34715b;

        /* renamed from: c */
        public String f34716c;

        /* renamed from: d */
        public Long f34717d;

        /* renamed from: e */
        public Integer f34718e;

        /* renamed from: a */
        public av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b mo29326a() {
            String str = "";
            if (this.f34714a == null) {
                str = str + " pc";
            }
            if (this.f34715b == null) {
                str = str + " symbol";
            }
            if (this.f34717d == null) {
                str = str + " offset";
            }
            if (this.f34718e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C6580uu(this.f34714a.longValue(), this.f34715b, this.f34716c, this.f34717d.longValue(), this.f34718e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b.C3855a mo29327b(String str) {
            this.f34716c = str;
            return this;
        }

        /* renamed from: c */
        public av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b.C3855a mo29328c(int i) {
            this.f34718e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b.C3855a mo29329d(long j) {
            this.f34717d = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b.C3855a mo29330e(long j) {
            this.f34714a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b.C3855a mo29331f(String str) {
            if (str != null) {
                this.f34715b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    /* renamed from: b */
    public String mo29321b() {
        return this.f34711c;
    }

    /* renamed from: c */
    public int mo29322c() {
        return this.f34713e;
    }

    /* renamed from: d */
    public long mo29323d() {
        return this.f34712d;
    }

    /* renamed from: e */
    public long mo29324e() {
        return this.f34709a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b)) {
            return false;
        }
        av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b bVar = (av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b) obj;
        if (this.f34709a == bVar.mo29324e() && this.f34710b.equals(bVar.mo29325f()) && ((str = this.f34711c) != null ? str.equals(bVar.mo29321b()) : bVar.mo29321b() == null) && this.f34712d == bVar.mo29323d() && this.f34713e == bVar.mo29322c()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo29325f() {
        return this.f34710b;
    }

    public int hashCode() {
        int i;
        long j = this.f34709a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f34710b.hashCode()) * 1000003;
        String str = this.f34711c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j2 = this.f34712d;
        return ((((hashCode ^ i) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f34713e;
    }

    public String toString() {
        return "Frame{pc=" + this.f34709a + ", symbol=" + this.f34710b + ", file=" + this.f34711c + ", offset=" + this.f34712d + ", importance=" + this.f34713e + "}";
    }

    public C6580uu(long j, String str, String str2, long j2, int i) {
        this.f34709a = j;
        this.f34710b = str;
        this.f34711c = str2;
        this.f34712d = j2;
        this.f34713e = i;
    }
}
