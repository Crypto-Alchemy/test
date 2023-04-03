package p000;

import java.util.Set;

/* renamed from: jx6 */
/* compiled from: TransportFactoryImpl */
public final class jx6 implements ix6 {

    /* renamed from: a */
    public final Set<qp1> f30660a;

    /* renamed from: b */
    public final hx6 f30661b;

    /* renamed from: c */
    public final mx6 f30662c;

    public jx6(Set<qp1> set, hx6 hx6, mx6 mx6) {
        this.f30660a = set;
        this.f30661b = hx6;
        this.f30662c = mx6;
    }

    /* renamed from: a */
    public <T> fx6<T> mo43972a(String str, Class<T> cls, qp1 qp1, tw6<T, byte[]> tw6) {
        if (this.f30660a.contains(qp1)) {
            return new lx6(this.f30661b, str, qp1, tw6, this.f30662c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{qp1, this.f30660a}));
    }
}
