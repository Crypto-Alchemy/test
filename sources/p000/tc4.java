package p000;

import java.util.LinkedList;

/* renamed from: tc4 */
/* compiled from: OOMSoftReferenceBucket */
public class tc4<V> extends j40<V> {

    /* renamed from: f */
    public LinkedList<sc4<V>> f18112f = new LinkedList<>();

    public tc4(int i, int i2, int i3) {
        super(i, i2, i3, false);
    }

    /* renamed from: a */
    public void mo21715a(V v) {
        sc4 poll = this.f18112f.poll();
        if (poll == null) {
            poll = new sc4();
        }
        poll.mo25742c(v);
        this.f13507c.add(poll);
    }

    /* renamed from: g */
    public V mo21721g() {
        sc4 sc4 = (sc4) this.f13507c.poll();
        au4.m10792g(sc4);
        V b = sc4.mo25741b();
        sc4.mo25740a();
        this.f18112f.add(sc4);
        return b;
    }
}
