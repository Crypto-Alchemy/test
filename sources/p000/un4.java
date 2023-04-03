package p000;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\bR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lun4;", "K", "V", "", "Lr6;", "element", "", "add", "(Ljava/lang/Object;)Z", "Lr37;", "clear", "", "iterator", "remove", "contains", "Lqn4;", "a", "Lqn4;", "builder", "", "getSize", "()I", "size", "<init>", "(Lqn4;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: un4 */
/* compiled from: PersistentHashMapBuilderContentViews.kt */
public final class un4<K, V> extends C6430r6<K> {

    /* renamed from: a */
    public final qn4<K, V> f18541a;

    public un4(qn4<K, V> qn4) {
        vx2.m53591g(qn4, "builder");
        this.f18541a = qn4;
    }

    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f18541a.clear();
    }

    public boolean contains(Object obj) {
        return this.f18541a.containsKey(obj);
    }

    public int getSize() {
        return this.f18541a.size();
    }

    public Iterator<K> iterator() {
        return new vn4(this.f18541a);
    }

    public boolean remove(Object obj) {
        if (!this.f18541a.containsKey(obj)) {
            return false;
        }
        this.f18541a.remove(obj);
        return true;
    }
}
