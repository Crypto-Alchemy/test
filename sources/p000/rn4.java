package p000;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\u0012\u001e\u0010&\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020%0$¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0006\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016J\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00102\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006)"}, mo44877d2 = {"Lrn4;", "K", "V", "T", "", "Lpn4;", "next", "()Ljava/lang/Object;", "Lr37;", "remove", "key", "newValue", "k", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "keyHash", "Lux6;", "node", "pathIndex", "j", "(ILux6;Ljava/lang/Object;I)V", "i", "h", "Lqn4;", "g", "Lqn4;", "builder", "Ljava/lang/Object;", "lastIteratedKey", "", "r", "Z", "nextWasInvoked", "s", "I", "expectedModCount", "", "Lvx6;", "path", "<init>", "(Lqn4;[Lvx6;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rn4 */
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
public class rn4<K, V, T> extends pn4<K, V, T> {

    /* renamed from: g */
    public final qn4<K, V> f17297g;

    /* renamed from: k */
    public K f17298k;

    /* renamed from: r */
    public boolean f17299r;

    /* renamed from: s */
    public int f17300s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rn4(qn4<K, V> qn4, vx6<K, V, T>[] vx6Arr) {
        super(qn4.mo25168g(), vx6Arr);
        vx2.m53591g(qn4, "builder");
        vx2.m53591g(vx6Arr, "path");
        this.f17297g = qn4;
        this.f17300s = qn4.mo25167f();
    }

    /* renamed from: h */
    public final void mo25458h() {
        if (this.f17297g.mo25167f() != this.f17300s) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: i */
    public final void mo25459i() {
        if (!this.f17299r) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    public final void mo25460j(int i, ux6<?, ?> ux6, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            mo24725d()[i2].mo27371k(ux6.mo26923p(), ux6.mo26923p().length, 0);
            while (!vx2.m53586b(mo24725d()[i2].mo27361a(), k)) {
                mo24725d()[i2].mo27367h();
            }
            mo24727g(i2);
            return;
        }
        int f = 1 << yx6.m30861f(i, i3);
        if (ux6.mo26924q(f)) {
            mo24725d()[i2].mo27371k(ux6.mo26923p(), ux6.mo26920m() * 2, ux6.mo26921n(f));
            mo24727g(i2);
            return;
        }
        int O = ux6.mo26900O(f);
        ux6<?, ?> N = ux6.mo26899N(O);
        mo24725d()[i2].mo27371k(ux6.mo26923p(), ux6.mo26920m() * 2, O);
        mo25460j(i, N, k, i2 + 1);
    }

    /* renamed from: k */
    public final void mo25461k(K k, V v) {
        int i;
        if (this.f17297g.containsKey(k)) {
            if (hasNext()) {
                Object b = mo24723b();
                this.f17297g.put(k, v);
                if (b != null) {
                    i = b.hashCode();
                } else {
                    i = 0;
                }
                mo25460j(i, this.f17297g.mo25168g(), b, 0);
            } else {
                this.f17297g.put(k, v);
            }
            this.f17300s = this.f17297g.mo25167f();
        }
    }

    public T next() {
        mo25458h();
        this.f17298k = mo24723b();
        this.f17299r = true;
        return super.next();
    }

    public void remove() {
        int i;
        mo25459i();
        if (hasNext()) {
            Object b = mo24723b();
            t07.m52025d(this.f17297g).remove(this.f17298k);
            if (b != null) {
                i = b.hashCode();
            } else {
                i = 0;
            }
            mo25460j(i, this.f17297g.mo25168g(), b, 0);
        } else {
            t07.m52025d(this.f17297g).remove(this.f17298k);
        }
        this.f17298k = null;
        this.f17299r = false;
        this.f17300s = this.f17297g.mo25167f();
    }
}
