package p000;

import java.util.ListIterator;

/* renamed from: v89 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class v89 implements ListIterator<String> {

    /* renamed from: a */
    public ListIterator<String> f34873a;

    /* renamed from: d */
    public final /* synthetic */ int f34874d;

    /* renamed from: e */
    public final /* synthetic */ x89 f34875e;

    public v89(x89 x89, int i) {
        this.f34875e = x89;
        this.f34874d = i;
        this.f34873a = x89.f35554a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f34873a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f34873a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f34873a.next();
    }

    public final int nextIndex() {
        return this.f34873a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f34873a.previous();
    }

    public final int previousIndex() {
        return this.f34873a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
