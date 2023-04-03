package p000;

import java.util.NoSuchElementException;

/* renamed from: qi4 */
/* compiled from: Optional */
public final class qi4<T> {

    /* renamed from: b */
    public static final qi4<?> f33140b = new qi4<>();

    /* renamed from: a */
    public final T f33141a;

    public qi4() {
        this.f33141a = null;
    }

    /* renamed from: a */
    public static <T> qi4<T> m50601a() {
        return f33140b;
    }

    /* renamed from: d */
    public static <T> qi4<T> m50602d(T t) {
        return new qi4<>(t);
    }

    /* renamed from: e */
    public static <T> qi4<T> m50603e(T t) {
        if (t == null) {
            return m50601a();
        }
        return m50602d(t);
    }

    /* renamed from: b */
    public T mo47119b() {
        return mo47122f();
    }

    /* renamed from: c */
    public boolean mo47120c() {
        if (this.f33141a != null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi4)) {
            return false;
        }
        return kf4.m47054b(this.f33141a, ((qi4) obj).f33141a);
    }

    /* renamed from: f */
    public T mo47122f() {
        T t = this.f33141a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return kf4.m47055c(this.f33141a);
    }

    public String toString() {
        T t = this.f33141a;
        if (t == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{t});
    }

    public qi4(T t) {
        this.f33141a = kf4.m47057e(t);
    }
}
