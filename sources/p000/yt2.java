package p000;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lyt2;", "T", "", "Lwt2;", "", "hasNext", "a", "Ljava/util/Iterator;", "iterator", "", "d", "I", "index", "<init>", "(Ljava/util/Iterator;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: yt2 */
/* compiled from: Iterators.kt */
public final class yt2<T> implements Iterator<wt2<? extends T>>, a93 {

    /* renamed from: a */
    public final Iterator<T> f35920a;

    /* renamed from: d */
    public int f35921d;

    public yt2(Iterator<? extends T> it) {
        vx2.m53591g(it, "iterator");
        this.f35920a = it;
    }

    /* renamed from: a */
    public final wt2<T> next() {
        int i = this.f35921d;
        this.f35921d = i + 1;
        if (i < 0) {
            ck0.m33072t();
        }
        return new wt2<>(i, this.f35920a.next());
    }

    public final boolean hasNext() {
        return this.f35920a.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
