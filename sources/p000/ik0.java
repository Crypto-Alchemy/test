package p000;

import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a%\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo44877d2 = {"", "", "index", "M", "(Ljava/util/List;I)I", "N", "T", "", "L", "(Ljava/util/List;)Ljava/util/List;", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/CollectionsKt")
/* renamed from: ik0 */
/* compiled from: ReversedViews.kt */
public class ik0 extends hk0 {
    /* renamed from: L */
    public static final <T> List<T> m45742L(List<T> list) {
        vx2.m53591g(list, "<this>");
        return new wg5(list);
    }

    /* renamed from: M */
    public static final int m45743M(List<?> list, int i) {
        if (new rw2(0, ck0.m33064l(list)).mo47514u(i)) {
            return ck0.m33064l(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new rw2(0, ck0.m33064l(list)) + "].");
    }

    /* renamed from: N */
    public static final int m45744N(List<?> list, int i) {
        if (new rw2(0, list.size()).mo47514u(i)) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new rw2(0, list.size()) + "].");
    }
}
