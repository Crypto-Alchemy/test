package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002R.\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0006*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, mo44877d2 = {"Lhq0;", "T", "Lhw5;", "", "iterator", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "sequenceRef", "sequence", "<init>", "(Lhw5;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: hq0 */
/* compiled from: SequencesJVM.kt */
public final class hq0<T> implements hw5<T> {

    /* renamed from: a */
    public final AtomicReference<hw5<T>> f38251a;

    public hq0(hw5<? extends T> hw5) {
        vx2.m53591g(hw5, "sequence");
        this.f38251a = new AtomicReference<>(hw5);
    }

    public Iterator<T> iterator() {
        hw5 andSet = this.f38251a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
