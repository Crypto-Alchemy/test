package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: lq6 */
/* compiled from: Timed */
public final class lq6<T> {

    /* renamed from: a */
    public final T f31377a;

    /* renamed from: b */
    public final long f31378b;

    /* renamed from: c */
    public final TimeUnit f31379c;

    public lq6(T t, long j, TimeUnit timeUnit) {
        this.f31377a = t;
        this.f31378b = j;
        this.f31379c = (TimeUnit) af4.m31828d(timeUnit, "unit is null");
    }

    /* renamed from: a */
    public long mo45487a() {
        return this.f31378b;
    }

    /* renamed from: b */
    public T mo45488b() {
        return this.f31377a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof lq6)) {
            return false;
        }
        lq6 lq6 = (lq6) obj;
        if (!af4.m31827c(this.f31377a, lq6.f31377a) || this.f31378b != lq6.f31378b || !af4.m31827c(this.f31379c, lq6.f31379c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        T t = this.f31377a;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        long j = this.f31378b;
        return (((i * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.f31379c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f31378b + ", unit=" + this.f31379c + ", value=" + this.f31377a + "]";
    }
}
