package com.google.firebase.installations.local;

import com.google.firebase.installations.local.C4788b;
import com.google.firebase.installations.local.PersistedInstallation;

/* renamed from: com.google.firebase.installations.local.a */
/* compiled from: AutoValue_PersistedInstallationEntry */
public final class C4785a extends C4788b {

    /* renamed from: b */
    public final String f25349b;

    /* renamed from: c */
    public final PersistedInstallation.RegistrationStatus f25350c;

    /* renamed from: d */
    public final String f25351d;

    /* renamed from: e */
    public final String f25352e;

    /* renamed from: f */
    public final long f25353f;

    /* renamed from: g */
    public final long f25354g;

    /* renamed from: h */
    public final String f25355h;

    /* renamed from: com.google.firebase.installations.local.a$b */
    /* compiled from: AutoValue_PersistedInstallationEntry */
    public static final class C4787b extends C4788b.C4789a {

        /* renamed from: a */
        public String f25356a;

        /* renamed from: b */
        public PersistedInstallation.RegistrationStatus f25357b;

        /* renamed from: c */
        public String f25358c;

        /* renamed from: d */
        public String f25359d;

        /* renamed from: e */
        public Long f25360e;

        /* renamed from: f */
        public Long f25361f;

        /* renamed from: g */
        public String f25362g;

        /* renamed from: a */
        public C4788b mo36144a() {
            String str = "";
            if (this.f25357b == null) {
                str = str + " registrationStatus";
            }
            if (this.f25360e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f25361f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C4785a(this.f25356a, this.f25357b, this.f25358c, this.f25359d, this.f25360e.longValue(), this.f25361f.longValue(), this.f25362g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4788b.C4789a mo36145b(String str) {
            this.f25358c = str;
            return this;
        }

        /* renamed from: c */
        public C4788b.C4789a mo36146c(long j) {
            this.f25360e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C4788b.C4789a mo36147d(String str) {
            this.f25356a = str;
            return this;
        }

        /* renamed from: e */
        public C4788b.C4789a mo36148e(String str) {
            this.f25362g = str;
            return this;
        }

        /* renamed from: f */
        public C4788b.C4789a mo36149f(String str) {
            this.f25359d = str;
            return this;
        }

        /* renamed from: g */
        public C4788b.C4789a mo36150g(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.f25357b = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        /* renamed from: h */
        public C4788b.C4789a mo36151h(long j) {
            this.f25361f = Long.valueOf(j);
            return this;
        }

        public C4787b() {
        }

        public C4787b(C4788b bVar) {
            this.f25356a = bVar.mo36135d();
            this.f25357b = bVar.mo36139g();
            this.f25358c = bVar.mo36133b();
            this.f25359d = bVar.mo36138f();
            this.f25360e = Long.valueOf(bVar.mo36134c());
            this.f25361f = Long.valueOf(bVar.mo36140h());
            this.f25362g = bVar.mo36136e();
        }
    }

    /* renamed from: b */
    public String mo36133b() {
        return this.f25351d;
    }

    /* renamed from: c */
    public long mo36134c() {
        return this.f25353f;
    }

    /* renamed from: d */
    public String mo36135d() {
        return this.f25349b;
    }

    /* renamed from: e */
    public String mo36136e() {
        return this.f25355h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4788b)) {
            return false;
        }
        C4788b bVar = (C4788b) obj;
        String str3 = this.f25349b;
        if (str3 != null ? str3.equals(bVar.mo36135d()) : bVar.mo36135d() == null) {
            if (this.f25350c.equals(bVar.mo36139g()) && ((str = this.f25351d) != null ? str.equals(bVar.mo36133b()) : bVar.mo36133b() == null) && ((str2 = this.f25352e) != null ? str2.equals(bVar.mo36138f()) : bVar.mo36138f() == null) && this.f25353f == bVar.mo36134c() && this.f25354g == bVar.mo36140h()) {
                String str4 = this.f25355h;
                if (str4 == null) {
                    if (bVar.mo36136e() == null) {
                        return true;
                    }
                } else if (str4.equals(bVar.mo36136e())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo36138f() {
        return this.f25352e;
    }

    /* renamed from: g */
    public PersistedInstallation.RegistrationStatus mo36139g() {
        return this.f25350c;
    }

    /* renamed from: h */
    public long mo36140h() {
        return this.f25354g;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f25349b;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (((i ^ 1000003) * 1000003) ^ this.f25350c.hashCode()) * 1000003;
        String str2 = this.f25351d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (hashCode ^ i2) * 1000003;
        String str3 = this.f25352e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        long j = this.f25353f;
        long j2 = this.f25354g;
        int i6 = (((((i5 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f25355h;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i6 ^ i4;
    }

    /* renamed from: n */
    public C4788b.C4789a mo36142n() {
        return new C4787b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f25349b + ", registrationStatus=" + this.f25350c + ", authToken=" + this.f25351d + ", refreshToken=" + this.f25352e + ", expiresInSecs=" + this.f25353f + ", tokenCreationEpochInSecs=" + this.f25354g + ", fisError=" + this.f25355h + "}";
    }

    public C4785a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.f25349b = str;
        this.f25350c = registrationStatus;
        this.f25351d = str2;
        this.f25352e = str3;
        this.f25353f = j;
        this.f25354g = j2;
        this.f25355h = str4;
    }
}
