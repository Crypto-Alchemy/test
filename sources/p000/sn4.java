package p000;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u001b\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\nH\u0002J\u001c\u0010\r\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lsn4;", "K", "V", "Lj6;", "", "element", "", "q", "Lr37;", "clear", "", "iterator", "", "n", "j", "Lqn4;", "a", "Lqn4;", "builder", "", "getSize", "()I", "size", "<init>", "(Lqn4;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sn4 */
/* compiled from: PersistentHashMapBuilderContentViews.kt */
public final class sn4<K, V> extends C2582j6<Map.Entry<K, V>, K, V> {

    /* renamed from: a */
    public final qn4<K, V> f17753a;

    public sn4(qn4<K, V> qn4) {
        vx2.m53591g(qn4, "builder");
        this.f17753a = qn4;
    }

    public void clear() {
        this.f17753a.clear();
    }

    public int getSize() {
        return this.f17753a.size();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new tn4(this.f17753a);
    }

    /* renamed from: j */
    public boolean mo21733j(Map.Entry<? extends K, ? extends V> entry) {
        vx2.m53591g(entry, "element");
        V v = this.f17753a.get(entry.getKey());
        if (v != null) {
            return vx2.m53586b(v, entry.getValue());
        }
        if (entry.getValue() != null || !this.f17753a.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo21735n(Map.Entry<? extends K, ? extends V> entry) {
        vx2.m53591g(entry, "element");
        return this.f17753a.remove(entry.getKey(), entry.getValue());
    }

    /* renamed from: q */
    public boolean add(Map.Entry<K, V> entry) {
        vx2.m53591g(entry, "element");
        throw new UnsupportedOperationException();
    }
}
