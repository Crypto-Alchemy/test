package p000;

import p000.vv2;

/* renamed from: dv */
/* compiled from: AutoValue_InstallationTokenResult */
public final class C5744dv extends vv2 {

    /* renamed from: a */
    public final String f28316a;

    /* renamed from: b */
    public final long f28317b;

    /* renamed from: c */
    public final long f28318c;

    /* renamed from: dv$b */
    /* compiled from: AutoValue_InstallationTokenResult */
    public static final class C5746b extends vv2.C6638a {

        /* renamed from: a */
        public String f28319a;

        /* renamed from: b */
        public Long f28320b;

        /* renamed from: c */
        public Long f28321c;

        /* renamed from: a */
        public vv2 mo42071a() {
            String str = "";
            if (this.f28319a == null) {
                str = str + " token";
            }
            if (this.f28320b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f28321c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C5744dv(this.f28319a, this.f28320b.longValue(), this.f28321c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public vv2.C6638a mo42072b(String str) {
            if (str != null) {
                this.f28319a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        /* renamed from: c */
        public vv2.C6638a mo42073c(long j) {
            this.f28321c = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public vv2.C6638a mo42074d(long j) {
            this.f28320b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public String mo42065b() {
        return this.f28316a;
    }

    /* renamed from: c */
    public long mo42066c() {
        return this.f28318c;
    }

    /* renamed from: d */
    public long mo42067d() {
        return this.f28317b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vv2)) {
            return false;
        }
        vv2 vv2 = (vv2) obj;
        if (this.f28316a.equals(vv2.mo42065b()) && this.f28317b == vv2.mo42067d() && this.f28318c == vv2.mo42066c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f28317b;
        long j2 = this.f28318c;
        return ((((this.f28316a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f28316a + ", tokenExpirationTimestamp=" + this.f28317b + ", tokenCreationTimestamp=" + this.f28318c + "}";
    }

    public C5744dv(String str, long j, long j2) {
        this.f28316a = str;
        this.f28317b = j;
        this.f28318c = j2;
    }
}
