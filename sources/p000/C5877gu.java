package p000;

import p000.av0;

/* renamed from: gu */
/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute */
public final class C5877gu extends av0.C3828c {

    /* renamed from: a */
    public final String f29353a;

    /* renamed from: b */
    public final String f29354b;

    /* renamed from: gu$b */
    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute */
    public static final class C5879b extends av0.C3828c.C3829a {

        /* renamed from: a */
        public String f29355a;

        /* renamed from: b */
        public String f29356b;

        /* renamed from: a */
        public av0.C3828c mo29181a() {
            String str = "";
            if (this.f29355a == null) {
                str = str + " key";
            }
            if (this.f29356b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C5877gu(this.f29355a, this.f29356b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3828c.C3829a mo29182b(String str) {
            if (str != null) {
                this.f29355a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        /* renamed from: c */
        public av0.C3828c.C3829a mo29183c(String str) {
            if (str != null) {
                this.f29356b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    /* renamed from: b */
    public String mo29179b() {
        return this.f29353a;
    }

    /* renamed from: c */
    public String mo29180c() {
        return this.f29354b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3828c)) {
            return false;
        }
        av0.C3828c cVar = (av0.C3828c) obj;
        if (!this.f29353a.equals(cVar.mo29179b()) || !this.f29354b.equals(cVar.mo29180c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f29353a.hashCode() ^ 1000003) * 1000003) ^ this.f29354b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f29353a + ", value=" + this.f29354b + "}";
    }

    public C5877gu(String str, String str2) {
        this.f29353a = str;
        this.f29354b = str2;
    }
}
