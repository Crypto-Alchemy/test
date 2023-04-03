package p000;

import java.util.Iterator;

/* renamed from: t78 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class t78 implements Iterator<r88> {

    /* renamed from: a */
    public final /* synthetic */ Iterator f34139a;

    public t78(Iterator it) {
        this.f34139a = it;
    }

    public final boolean hasNext() {
        return this.f34139a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new b98((String) this.f34139a.next());
    }
}
