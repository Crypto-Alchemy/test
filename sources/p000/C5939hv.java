package p000;

/* renamed from: hv */
/* compiled from: AutoValue_LogResponse */
public final class C5939hv extends nk3 {

    /* renamed from: a */
    public final long f29738a;

    public C5939hv(long j) {
        this.f29738a = j;
    }

    /* renamed from: c */
    public long mo43397c() {
        return this.f29738a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nk3)) {
            return false;
        }
        if (this.f29738a == ((nk3) obj).mo43397c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f29738a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f29738a + "}";
    }
}
