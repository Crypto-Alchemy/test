package p000;

import p000.eu1;

/* renamed from: cv */
/* compiled from: AutoValue_EventStoreConfig */
public final class C5716cv extends eu1 {

    /* renamed from: b */
    public final long f27957b;

    /* renamed from: c */
    public final int f27958c;

    /* renamed from: d */
    public final int f27959d;

    /* renamed from: e */
    public final long f27960e;

    /* renamed from: f */
    public final int f27961f;

    /* renamed from: cv$b */
    /* compiled from: AutoValue_EventStoreConfig */
    public static final class C5718b extends eu1.C5819a {

        /* renamed from: a */
        public Long f27962a;

        /* renamed from: b */
        public Integer f27963b;

        /* renamed from: c */
        public Integer f27964c;

        /* renamed from: d */
        public Long f27965d;

        /* renamed from: e */
        public Integer f27966e;

        /* renamed from: a */
        public eu1 mo41729a() {
            String str = "";
            if (this.f27962a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f27963b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f27964c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f27965d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f27966e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C5716cv(this.f27962a.longValue(), this.f27963b.intValue(), this.f27964c.intValue(), this.f27965d.longValue(), this.f27966e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public eu1.C5819a mo41730b(int i) {
            this.f27964c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public eu1.C5819a mo41731c(long j) {
            this.f27965d = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public eu1.C5819a mo41732d(int i) {
            this.f27963b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public eu1.C5819a mo41733e(int i) {
            this.f27966e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public eu1.C5819a mo41734f(long j) {
            this.f27962a = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public int mo41721b() {
        return this.f27959d;
    }

    /* renamed from: c */
    public long mo41722c() {
        return this.f27960e;
    }

    /* renamed from: d */
    public int mo41723d() {
        return this.f27958c;
    }

    /* renamed from: e */
    public int mo41724e() {
        return this.f27961f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eu1)) {
            return false;
        }
        eu1 eu1 = (eu1) obj;
        if (this.f27957b == eu1.mo41726f() && this.f27958c == eu1.mo41723d() && this.f27959d == eu1.mo41721b() && this.f27960e == eu1.mo41722c() && this.f27961f == eu1.mo41724e()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long mo41726f() {
        return this.f27957b;
    }

    public int hashCode() {
        long j = this.f27957b;
        long j2 = this.f27960e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f27958c) * 1000003) ^ this.f27959d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f27961f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f27957b + ", loadBatchSize=" + this.f27958c + ", criticalSectionEnterTimeoutMs=" + this.f27959d + ", eventCleanUpAge=" + this.f27960e + ", maxBlobByteSizePerRow=" + this.f27961f + "}";
    }

    public C5716cv(long j, int i, int i2, long j2, int i3) {
        this.f27957b = j;
        this.f27958c = i;
        this.f27959d = i2;
        this.f27960e = j2;
        this.f27961f = i3;
    }
}
