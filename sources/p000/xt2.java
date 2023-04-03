package p000;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004H\u0002R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lxt2;", "T", "", "Lwt2;", "", "iterator", "Lkotlin/Function0;", "a", "Lpc2;", "iteratorFactory", "<init>", "(Lpc2;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xt2 */
/* compiled from: Iterables.kt */
public final class xt2<T> implements Iterable<wt2<? extends T>>, a93 {

    /* renamed from: a */
    public final pc2<Iterator<T>> f35690a;

    public xt2(pc2<? extends Iterator<? extends T>> pc2) {
        vx2.m53591g(pc2, "iteratorFactory");
        this.f35690a = pc2;
    }

    public Iterator<wt2<T>> iterator() {
        return new yt2(this.f35690a.invoke());
    }
}
