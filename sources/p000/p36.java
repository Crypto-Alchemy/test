package p000;

/* renamed from: p36 */
/* compiled from: SingleThreadValue */
public class p36<T> {

    /* renamed from: a */
    public final T f43978a;

    /* renamed from: b */
    public final Thread f43979b = Thread.currentThread();

    public p36(T t) {
        this.f43978a = t;
    }

    /* renamed from: a */
    public T mo65215a() {
        if (mo65216b()) {
            return this.f43978a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    /* renamed from: b */
    public boolean mo65216b() {
        if (this.f43979b == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
