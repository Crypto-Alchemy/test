package p000;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: j40 */
/* compiled from: Bucket */
public class j40<V> {

    /* renamed from: a */
    public final int f13505a;

    /* renamed from: b */
    public final int f13506b;

    /* renamed from: c */
    public final Queue f13507c;

    /* renamed from: d */
    public final boolean f13508d;

    /* renamed from: e */
    public int f13509e;

    public j40(int i, int i2, int i3, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        au4.m10794i(z2);
        if (i2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        au4.m10794i(z3);
        au4.m10794i(i3 < 0 ? false : z4);
        this.f13505a = i;
        this.f13506b = i2;
        this.f13507c = new LinkedList();
        this.f13509e = i3;
        this.f13508d = z;
    }

    /* renamed from: a */
    public void mo21715a(V v) {
        this.f13507c.add(v);
    }

    /* renamed from: b */
    public void mo21716b() {
        boolean z;
        if (this.f13509e > 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10794i(z);
        this.f13509e--;
    }

    @Deprecated
    /* renamed from: c */
    public V mo21717c() {
        V g = mo21721g();
        if (g != null) {
            this.f13509e++;
        }
        return g;
    }

    /* renamed from: d */
    public int mo21718d() {
        return this.f13507c.size();
    }

    /* renamed from: e */
    public void mo21719e() {
        this.f13509e++;
    }

    /* renamed from: f */
    public boolean mo21720f() {
        if (this.f13509e + mo21718d() > this.f13506b) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public V mo21721g() {
        return this.f13507c.poll();
    }

    /* renamed from: h */
    public void mo21722h(V v) {
        au4.m10792g(v);
        boolean z = false;
        if (this.f13508d) {
            if (this.f13509e > 0) {
                z = true;
            }
            au4.m10794i(z);
            this.f13509e--;
            mo21715a(v);
            return;
        }
        int i = this.f13509e;
        if (i > 0) {
            this.f13509e = i - 1;
            mo21715a(v);
            return;
        }
        oy1.m24423j("BUCKET", "Tried to release value %s from an empty bucket!", v);
    }
}
