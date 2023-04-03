package p000;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0002R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lwn4;", "K", "V", "", "Lo6;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "Lr37;", "clear", "", "iterator", "Lqn4;", "a", "Lqn4;", "builder", "", "e", "()I", "size", "<init>", "(Lqn4;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: wn4 */
/* compiled from: PersistentHashMapBuilderContentViews.kt */
public final class wn4<K, V> extends C6305o6<V> {

    /* renamed from: a */
    public final qn4<K, V> f19192a;

    public wn4(qn4<K, V> qn4) {
        vx2.m53591g(qn4, "builder");
        this.f19192a = qn4;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f19192a.clear();
    }

    public boolean contains(Object obj) {
        return this.f19192a.containsValue(obj);
    }

    /* renamed from: e */
    public int mo27578e() {
        return this.f19192a.size();
    }

    public Iterator<V> iterator() {
        return new xn4(this.f19192a);
    }
}
