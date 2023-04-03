package p000;

/* renamed from: aw2 */
/* compiled from: InstanceFactory */
public final class aw2<T> implements sy1<T> {

    /* renamed from: b */
    public static final aw2<Object> f21057b = new aw2<>((Object) null);

    /* renamed from: a */
    public final T f21058a;

    public aw2(T t) {
        this.f21058a = t;
    }

    /* renamed from: a */
    public static <T> sy1<T> m32272a(T t) {
        return new aw2(bu4.m32727c(t, "instance cannot be null"));
    }

    public T get() {
        return this.f21058a;
    }
}
