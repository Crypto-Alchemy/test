package p000;

/* renamed from: iv */
/* compiled from: AutoValue_PersistedEvent */
public final class C6008iv extends nn4 {

    /* renamed from: a */
    public final long f30133a;

    /* renamed from: b */
    public final hx6 f30134b;

    /* renamed from: c */
    public final mt1 f30135c;

    public C6008iv(long j, hx6 hx6, mt1 mt1) {
        this.f30133a = j;
        if (hx6 != null) {
            this.f30134b = hx6;
            if (mt1 != null) {
                this.f30135c = mt1;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    /* renamed from: b */
    public mt1 mo43943b() {
        return this.f30135c;
    }

    /* renamed from: c */
    public long mo43944c() {
        return this.f30133a;
    }

    /* renamed from: d */
    public hx6 mo43945d() {
        return this.f30134b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nn4)) {
            return false;
        }
        nn4 nn4 = (nn4) obj;
        if (this.f30133a != nn4.mo43944c() || !this.f30134b.equals(nn4.mo43945d()) || !this.f30135c.equals(nn4.mo43943b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f30133a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f30134b.hashCode()) * 1000003) ^ this.f30135c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f30133a + ", transportContext=" + this.f30134b + ", event=" + this.f30135c + "}";
    }
}
