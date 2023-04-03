package p000;

import p000.av0;

/* renamed from: xu */
/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem */
public final class C6708xu extends av0.C3834e.C3861e {

    /* renamed from: a */
    public final int f35691a;

    /* renamed from: b */
    public final String f35692b;

    /* renamed from: c */
    public final String f35693c;

    /* renamed from: d */
    public final boolean f35694d;

    /* renamed from: xu$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem */
    public static final class C6710b extends av0.C3834e.C3861e.C3862a {

        /* renamed from: a */
        public Integer f35695a;

        /* renamed from: b */
        public String f35696b;

        /* renamed from: c */
        public String f35697c;

        /* renamed from: d */
        public Boolean f35698d;

        /* renamed from: a */
        public av0.C3834e.C3861e mo29358a() {
            String str = "";
            if (this.f35695a == null) {
                str = str + " platform";
            }
            if (this.f35696b == null) {
                str = str + " version";
            }
            if (this.f35697c == null) {
                str = str + " buildVersion";
            }
            if (this.f35698d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C6708xu(this.f35695a.intValue(), this.f35696b, this.f35697c, this.f35698d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3861e.C3862a mo29359b(String str) {
            if (str != null) {
                this.f35697c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        /* renamed from: c */
        public av0.C3834e.C3861e.C3862a mo29360c(boolean z) {
            this.f35698d = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public av0.C3834e.C3861e.C3862a mo29361d(int i) {
            this.f35695a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public av0.C3834e.C3861e.C3862a mo29362e(String str) {
            if (str != null) {
                this.f35696b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    /* renamed from: b */
    public String mo29354b() {
        return this.f35693c;
    }

    /* renamed from: c */
    public int mo29355c() {
        return this.f35691a;
    }

    /* renamed from: d */
    public String mo29356d() {
        return this.f35692b;
    }

    /* renamed from: e */
    public boolean mo29357e() {
        return this.f35694d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e.C3861e)) {
            return false;
        }
        av0.C3834e.C3861e eVar = (av0.C3834e.C3861e) obj;
        if (this.f35691a != eVar.mo29355c() || !this.f35692b.equals(eVar.mo29356d()) || !this.f35693c.equals(eVar.mo29354b()) || this.f35694d != eVar.mo29357e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.f35691a ^ 1000003) * 1000003) ^ this.f35692b.hashCode()) * 1000003) ^ this.f35693c.hashCode()) * 1000003;
        if (this.f35694d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f35691a + ", version=" + this.f35692b + ", buildVersion=" + this.f35693c + ", jailbroken=" + this.f35694d + "}";
    }

    public C6708xu(int i, String str, String str2, boolean z) {
        this.f35691a = i;
        this.f35692b = str;
        this.f35693c = str2;
        this.f35694d = z;
    }
}
