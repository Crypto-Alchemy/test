package p000;

import com.google.android.datatransport.Priority;

/* renamed from: av */
/* compiled from: AutoValue_Event */
public final class C3824av<T> extends gt1<T> {

    /* renamed from: a */
    public final Integer f21045a;

    /* renamed from: b */
    public final T f21046b;

    /* renamed from: c */
    public final Priority f21047c;

    public C3824av(Integer num, T t, Priority priority) {
        this.f21045a = num;
        if (t != null) {
            this.f21046b = t;
            if (priority != null) {
                this.f21047c = priority;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    /* renamed from: a */
    public Integer mo29135a() {
        return this.f21045a;
    }

    /* renamed from: b */
    public T mo29136b() {
        return this.f21046b;
    }

    /* renamed from: c */
    public Priority mo29137c() {
        return this.f21047c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gt1)) {
            return false;
        }
        gt1 gt1 = (gt1) obj;
        Integer num = this.f21045a;
        if (num != null ? num.equals(gt1.mo29135a()) : gt1.mo29135a() == null) {
            if (this.f21046b.equals(gt1.mo29136b()) && this.f21047c.equals(gt1.mo29137c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        Integer num = this.f21045a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return ((((i ^ 1000003) * 1000003) ^ this.f21046b.hashCode()) * 1000003) ^ this.f21047c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f21045a + ", payload=" + this.f21046b + ", priority=" + this.f21047c + "}";
    }
}
