package p000;

/* renamed from: th3 */
/* compiled from: LinkedNode */
public final class th3<T> {

    /* renamed from: a */
    public final T f18152a;

    /* renamed from: b */
    public th3<T> f18153b;

    public th3(T t, th3<T> th3) {
        this.f18152a = t;
        this.f18153b = th3;
    }

    /* renamed from: a */
    public static <ST> boolean m27749a(th3<ST> th3, ST st) {
        while (th3 != null) {
            if (th3.mo26449d() == st) {
                return true;
            }
            th3 = th3.mo26448c();
        }
        return false;
    }

    /* renamed from: b */
    public void mo26447b(th3<T> th3) {
        if (this.f18153b == null) {
            this.f18153b = th3;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public th3<T> mo26448c() {
        return this.f18153b;
    }

    /* renamed from: d */
    public T mo26449d() {
        return this.f18152a;
    }
}
