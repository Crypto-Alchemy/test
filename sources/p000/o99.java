package p000;

import java.util.Iterator;

/* renamed from: o99 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class o99 implements Iterator<String> {

    /* renamed from: a */
    public Iterator<String> f32340a;

    /* renamed from: d */
    public final /* synthetic */ x89 f32341d;

    public o99(x89 x89) {
        this.f32341d = x89;
        this.f32340a = x89.f35554a.iterator();
    }

    public final boolean hasNext() {
        return this.f32340a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f32340a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
