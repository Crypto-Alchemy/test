package p000;

/* renamed from: yv2 */
/* compiled from: InstanceFactory */
public final class yv2<T> implements ry1<T> {

    /* renamed from: b */
    public static final yv2<Object> f35934b = new yv2<>((Object) null);

    /* renamed from: a */
    public final T f35935a;

    public yv2(T t) {
        this.f35935a = t;
    }

    /* renamed from: a */
    public static <T> ry1<T> m54878a(T t) {
        return new yv2(fu4.m44412c(t, "instance cannot be null"));
    }

    public T get() {
        return this.f35935a;
    }
}
