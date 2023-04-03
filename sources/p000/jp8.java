package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: jp8 */
public final class jp8 extends AbstractList<String> implements ch8, RandomAccess {

    /* renamed from: a */
    public final ch8 f30559a;

    public jp8(ch8 ch8) {
        this.f30559a = ch8;
    }

    /* renamed from: G0 */
    public final List<?> mo30009G0() {
        return this.f30559a.mo30009G0();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f30559a.get(i);
    }

    /* renamed from: h1 */
    public final ch8 mo30010h1() {
        return this;
    }

    public final Iterator<String> iterator() {
        return new pp8(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new mp8(this, i);
    }

    /* renamed from: m */
    public final Object mo30011m(int i) {
        return this.f30559a.mo30011m(i);
    }

    public final int size() {
        return this.f30559a.size();
    }
}
