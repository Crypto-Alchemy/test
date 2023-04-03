package p000;

/* renamed from: dg0 */
/* compiled from: ClassifierBasedTypeConstructor.kt */
public abstract class dg0 implements yz6 {

    /* renamed from: a */
    public int f37276a;

    /* renamed from: d */
    public abstract eg0 mo51180d();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz6) || obj.hashCode() != hashCode()) {
            return false;
        }
        yz6 yz6 = (yz6) obj;
        if (yz6.getParameters().size() != getParameters().size()) {
            return false;
        }
        eg0 d = mo51180d();
        eg0 d2 = yz6.mo51180d();
        if (d2 != null && mo51183h(d) && mo51183h(d2)) {
            return mo51185i(d2);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo51182f(eg0 eg0, eg0 eg02) {
        vx2.m53591g(eg0, "first");
        vx2.m53591g(eg02, "second");
        if (!vx2.m53586b(eg0.getName(), eg02.getName())) {
            return false;
        }
        d31 b = eg0.mo51119b();
        d31 b2 = eg02.mo51119b();
        while (b != null && b2 != null) {
            if (b instanceof mx3) {
                return b2 instanceof mx3;
            }
            if (b2 instanceof mx3) {
                return false;
            }
            if (b instanceof fk4) {
                if (!(b2 instanceof fk4) || !vx2.m53586b(((fk4) b).mo51711e(), ((fk4) b2).mo51711e())) {
                    return false;
                }
                return true;
            } else if ((b2 instanceof fk4) || !vx2.m53586b(b.getName(), b2.getName())) {
                return false;
            } else {
                b = b.mo51119b();
                b2 = b2.mo51119b();
            }
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo51183h(eg0 eg0) {
        if (nr1.m70034m(eg0) || dd1.m56800E(eg0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = this.f37276a;
        if (i2 != 0) {
            return i2;
        }
        eg0 d = mo51180d();
        if (mo51183h(d)) {
            i = dd1.m56821m(d).hashCode();
        } else {
            i = System.identityHashCode(this);
        }
        this.f37276a = i;
        return i;
    }

    /* renamed from: i */
    public abstract boolean mo51185i(eg0 eg0);
}
