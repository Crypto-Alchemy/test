package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¨\u0006\u0007"}, mo44877d2 = {"T", "", "", "b", "", "source", "a", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: f40 */
/* compiled from: BrittleContainsOptimization.kt */
public final class f40 {
    /* renamed from: a */
    public static final <T> Collection<T> m44189a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(iterable2, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (iterable instanceof Collection) {
            if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
                return (Collection) iterable;
            }
            Collection<T> collection = (Collection) iterable;
            if (m44190b(collection)) {
                return CollectionsKt___CollectionsKt.m47309I0(iterable);
            }
            return collection;
        } else if (ij0.f29947b) {
            return CollectionsKt___CollectionsKt.m47309I0(iterable);
        } else {
            return CollectionsKt___CollectionsKt.m47311K0(iterable);
        }
    }

    /* renamed from: b */
    public static final <T> boolean m44190b(Collection<? extends T> collection) {
        if (!ij0.f29947b || collection.size() <= 2 || !(collection instanceof ArrayList)) {
            return false;
        }
        return true;
    }
}
