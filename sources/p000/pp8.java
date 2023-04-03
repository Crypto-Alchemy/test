package p000;

import java.util.Iterator;

/* renamed from: pp8 */
public final class pp8 implements Iterator<String> {

    /* renamed from: a */
    public Iterator<String> f32782a;

    /* renamed from: d */
    public final /* synthetic */ jp8 f32783d;

    public pp8(jp8 jp8) {
        this.f32783d = jp8;
        this.f32782a = jp8.f30559a.iterator();
    }

    public final boolean hasNext() {
        return this.f32782a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f32782a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
