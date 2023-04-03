package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0002R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\nR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Lgo4;", "E", "", "", "hasNext", "next", "()Ljava/lang/Object;", "Lr37;", "a", "", "Ljava/lang/Object;", "nextElement", "", "Luh3;", "d", "Ljava/util/Map;", "getMap$runtime_release", "()Ljava/util/Map;", "map", "", "e", "I", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "index", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: go4 */
/* compiled from: PersistentOrderedSetIterator.kt */
public class go4<E> implements Iterator<E>, a93 {

    /* renamed from: a */
    public Object f12516a;

    /* renamed from: d */
    public final Map<E, uh3> f12517d;

    /* renamed from: e */
    public int f12518e;

    public go4(Object obj, Map<E, uh3> map) {
        vx2.m53591g(map, "map");
        this.f12516a = obj;
        this.f12517d = map;
    }

    /* renamed from: a */
    public final void mo20721a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        if (this.f12518e < this.f12517d.size()) {
            return true;
        }
        return false;
    }

    public E next() {
        mo20721a();
        E e = this.f12516a;
        this.f12518e++;
        uh3 uh3 = this.f12517d.get(e);
        if (uh3 != null) {
            this.f12516a = uh3.mo26791c();
            return e;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
