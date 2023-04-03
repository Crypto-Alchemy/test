package p000;

/* renamed from: yi8 */
public final class yi8 implements rj8 {

    /* renamed from: a */
    public rj8[] f35892a;

    public yi8(rj8... rj8Arr) {
        this.f35892a = rj8Arr;
    }

    /* renamed from: a */
    public final boolean mo46073a(Class<?> cls) {
        for (rj8 a : this.f35892a) {
            if (a.mo46073a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final pj8 mo46074b(Class<?> cls) {
        for (rj8 rj8 : this.f35892a) {
            if (rj8.mo46073a(cls)) {
                return rj8.mo46074b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
