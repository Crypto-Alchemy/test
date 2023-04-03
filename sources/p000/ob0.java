package p000;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: ob0 */
/* compiled from: typeParameterUtils.kt */
public final class ob0 implements a17 {

    /* renamed from: a */
    public final a17 f43598a;

    /* renamed from: d */
    public final d31 f43599d;

    /* renamed from: e */
    public final int f43600e;

    public ob0(a17 a17, d31 d31, int i) {
        vx2.m53591g(a17, "originalDescriptor");
        vx2.m53591g(d31, "declarationDescriptor");
        this.f43598a = a17;
        this.f43599d = d31;
        this.f43600e = i;
    }

    /* renamed from: H */
    public da6 mo50043H() {
        return this.f43598a.mo50043H();
    }

    /* renamed from: L */
    public boolean mo50044L() {
        return true;
    }

    /* renamed from: b */
    public d31 mo51119b() {
        return this.f43599d;
    }

    /* renamed from: g */
    public yz6 mo50046g() {
        return this.f43598a.mo50046g();
    }

    public C6983dm getAnnotations() {
        return this.f43598a.getAnnotations();
    }

    public int getIndex() {
        return this.f43600e + this.f43598a.getIndex();
    }

    public r24 getName() {
        return this.f43598a.getName();
    }

    public a66 getSource() {
        return this.f43598a.getSource();
    }

    public List<xc3> getUpperBounds() {
        return this.f43598a.getUpperBounds();
    }

    /* renamed from: j */
    public Variance mo50049j() {
        return this.f43598a.mo50049j();
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        return this.f43598a.mo51120j0(h31, d);
    }

    /* renamed from: n */
    public d36 mo51464n() {
        return this.f43598a.mo51464n();
    }

    public String toString() {
        return this.f43598a + "[inner-copy]";
    }

    /* renamed from: u */
    public boolean mo50050u() {
        return this.f43598a.mo50050u();
    }

    /* renamed from: a */
    public a17 m70189a() {
        a17 a = this.f43598a.mo50045a();
        vx2.m53590f(a, "originalDescriptor.original");
        return a;
    }
}
