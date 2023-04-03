package p000;

import p000.av0;

/* renamed from: ku */
/* compiled from: AutoValue_CrashlyticsReport_Session_Application */
public final class C6200ku extends av0.C3834e.C3835a {

    /* renamed from: a */
    public final String f31058a;

    /* renamed from: b */
    public final String f31059b;

    /* renamed from: c */
    public final String f31060c;

    /* renamed from: d */
    public final av0.C3834e.C3835a.C3837b f31061d;

    /* renamed from: e */
    public final String f31062e;

    /* renamed from: f */
    public final String f31063f;

    /* renamed from: g */
    public final String f31064g;

    /* renamed from: ku$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Application */
    public static final class C6202b extends av0.C3834e.C3835a.C3836a {

        /* renamed from: a */
        public String f31065a;

        /* renamed from: b */
        public String f31066b;

        /* renamed from: c */
        public String f31067c;

        /* renamed from: d */
        public av0.C3834e.C3835a.C3837b f31068d;

        /* renamed from: e */
        public String f31069e;

        /* renamed from: f */
        public String f31070f;

        /* renamed from: g */
        public String f31071g;

        /* renamed from: a */
        public av0.C3834e.C3835a mo29216a() {
            String str = "";
            if (this.f31065a == null) {
                str = str + " identifier";
            }
            if (this.f31066b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C6200ku(this.f31065a, this.f31066b, this.f31067c, this.f31068d, this.f31069e, this.f31070f, this.f31071g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3834e.C3835a.C3836a mo29217b(String str) {
            this.f31070f = str;
            return this;
        }

        /* renamed from: c */
        public av0.C3834e.C3835a.C3836a mo29218c(String str) {
            this.f31071g = str;
            return this;
        }

        /* renamed from: d */
        public av0.C3834e.C3835a.C3836a mo29219d(String str) {
            this.f31067c = str;
            return this;
        }

        /* renamed from: e */
        public av0.C3834e.C3835a.C3836a mo29220e(String str) {
            if (str != null) {
                this.f31065a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        /* renamed from: f */
        public av0.C3834e.C3835a.C3836a mo29221f(String str) {
            this.f31069e = str;
            return this;
        }

        /* renamed from: g */
        public av0.C3834e.C3835a.C3836a mo29222g(String str) {
            if (str != null) {
                this.f31066b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    /* renamed from: b */
    public String mo29209b() {
        return this.f31063f;
    }

    /* renamed from: c */
    public String mo29210c() {
        return this.f31064g;
    }

    /* renamed from: d */
    public String mo29211d() {
        return this.f31060c;
    }

    /* renamed from: e */
    public String mo29212e() {
        return this.f31058a;
    }

    public boolean equals(Object obj) {
        String str;
        av0.C3834e.C3835a.C3837b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3834e.C3835a)) {
            return false;
        }
        av0.C3834e.C3835a aVar = (av0.C3834e.C3835a) obj;
        if (this.f31058a.equals(aVar.mo29212e()) && this.f31059b.equals(aVar.mo29215h()) && ((str = this.f31060c) != null ? str.equals(aVar.mo29211d()) : aVar.mo29211d() == null) && ((bVar = this.f31061d) != null ? bVar.equals(aVar.mo29214g()) : aVar.mo29214g() == null) && ((str2 = this.f31062e) != null ? str2.equals(aVar.mo29213f()) : aVar.mo29213f() == null) && ((str3 = this.f31063f) != null ? str3.equals(aVar.mo29209b()) : aVar.mo29209b() == null)) {
            String str4 = this.f31064g;
            if (str4 == null) {
                if (aVar.mo29210c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.mo29210c())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo29213f() {
        return this.f31062e;
    }

    /* renamed from: g */
    public av0.C3834e.C3835a.C3837b mo29214g() {
        return this.f31061d;
    }

    /* renamed from: h */
    public String mo29215h() {
        return this.f31059b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (((this.f31058a.hashCode() ^ 1000003) * 1000003) ^ this.f31059b.hashCode()) * 1000003;
        String str = this.f31060c;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        av0.C3834e.C3835a.C3837b bVar = this.f31061d;
        if (bVar == null) {
            i2 = 0;
        } else {
            i2 = bVar.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str2 = this.f31062e;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        String str3 = this.f31063f;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        String str4 = this.f31064g;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 ^ i5;
    }

    public String toString() {
        return "Application{identifier=" + this.f31058a + ", version=" + this.f31059b + ", displayVersion=" + this.f31060c + ", organization=" + this.f31061d + ", installationUuid=" + this.f31062e + ", developmentPlatform=" + this.f31063f + ", developmentPlatformVersion=" + this.f31064g + "}";
    }

    public C6200ku(String str, String str2, String str3, av0.C3834e.C3835a.C3837b bVar, String str4, String str5, String str6) {
        this.f31058a = str;
        this.f31059b = str2;
        this.f31060c = str3;
        this.f31061d = bVar;
        this.f31062e = str4;
        this.f31063f = str5;
        this.f31064g = str6;
    }
}
