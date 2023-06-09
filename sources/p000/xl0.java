package p000;

import java.util.Comparator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0002\u001a\u00020\u0004\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a&\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000¨\u0006\b"}, mo44877d2 = {"", "T", "a", "b", "", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/comparisons/ComparisonsKt")
/* renamed from: xl0 */
/* compiled from: Comparisons.kt */
public class xl0 {
    /* renamed from: a */
    public static final <T extends Comparable<?>> int m54426a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* renamed from: b */
    public static final <T extends Comparable<? super T>> Comparator<T> m54427b() {
        b44 b44 = b44.f21130a;
        vx2.m53589e(b44, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return b44;
    }
}
