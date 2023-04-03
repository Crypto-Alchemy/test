package p000;

import java.util.ListIterator;

/* renamed from: ga9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class ga9 implements ListIterator<String> {

    /* renamed from: a */
    public final ListIterator<String> f29162a;

    /* renamed from: d */
    public final /* synthetic */ int f29163d;

    /* renamed from: e */
    public final /* synthetic */ ka9 f29164e;

    public ga9(ka9 ka9, int i) {
        this.f29164e = ka9;
        this.f29163d = i;
        this.f29162a = ka9.f30779a.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f29162a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f29162a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f29162a.next();
    }

    public final int nextIndex() {
        return this.f29162a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f29162a.previous();
    }

    public final int previousIndex() {
        return this.f29162a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
