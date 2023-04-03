package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: u58 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class u58 implements Iterator<r88> {

    /* renamed from: a */
    public final /* synthetic */ Iterator f34466a;

    /* renamed from: d */
    public final /* synthetic */ Iterator f34467d;

    public u58(k68 k68, Iterator it, Iterator it2) {
        this.f34466a = it;
        this.f34467d = it2;
    }

    public final boolean hasNext() {
        if (this.f34466a.hasNext()) {
            return true;
        }
        return this.f34467d.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f34466a.hasNext()) {
            return new b98(((Integer) this.f34466a.next()).toString());
        }
        if (this.f34467d.hasNext()) {
            return new b98((String) this.f34467d.next());
        }
        throw new NoSuchElementException();
    }
}
