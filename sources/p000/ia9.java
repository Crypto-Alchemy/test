package p000;

import java.util.Iterator;

/* renamed from: ia9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class ia9 implements Iterator<String> {

    /* renamed from: a */
    public final Iterator<String> f29869a;

    /* renamed from: d */
    public final /* synthetic */ ka9 f29870d;

    public ia9(ka9 ka9) {
        this.f29870d = ka9;
        this.f29869a = ka9.f30779a.iterator();
    }

    public final boolean hasNext() {
        return this.f29869a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f29869a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
