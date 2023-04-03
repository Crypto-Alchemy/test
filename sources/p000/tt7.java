package p000;

/* renamed from: tt7 */
public final class tt7<T> implements xt7<T> {

    /* renamed from: a */
    public xt7<T> f34341a;

    /* renamed from: b */
    public static <T> void m52444b(xt7<T> xt7, xt7<T> xt72) {
        ns7.m49003j(xt72);
        tt7 tt7 = (tt7) xt7;
        if (tt7.f34341a == null) {
            tt7.f34341a = xt72;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final T mo42984a() {
        xt7<T> xt7 = this.f34341a;
        if (xt7 != null) {
            return xt7.mo42984a();
        }
        throw new IllegalStateException();
    }
}
