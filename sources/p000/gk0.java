package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a2\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u0007\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0006¨\u0006\t"}, mo44877d2 = {"", "T", "", "Lr37;", "x", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "y", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/CollectionsKt")
/* renamed from: gk0 */
/* compiled from: MutableCollectionsJVM.kt */
public class gk0 extends fk0 {
    /* renamed from: x */
    public static final <T extends Comparable<? super T>> void m44737x(List<T> list) {
        vx2.m53591g(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: y */
    public static final <T> void m44738y(List<T> list, Comparator<? super T> comparator) {
        vx2.m53591g(list, "<this>");
        vx2.m53591g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
