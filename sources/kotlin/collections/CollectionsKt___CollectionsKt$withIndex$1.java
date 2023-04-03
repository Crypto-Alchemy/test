package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "", "T", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: _Collections.kt */
public final class CollectionsKt___CollectionsKt$withIndex$1 extends Lambda implements pc2<Iterator<? extends T>> {
    public final /* synthetic */ Iterable<T> $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionsKt___CollectionsKt$withIndex$1(Iterable<? extends T> iterable) {
        super(0);
        this.$this_withIndex = iterable;
    }

    public final Iterator<T> invoke() {
        return this.$this_withIndex.iterator();
    }
}
