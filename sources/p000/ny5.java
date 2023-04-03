package p000;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptySet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¨\u0006\f"}, mo44877d2 = {"T", "", "e", "", "elements", "h", "([Ljava/lang/Object;)Ljava/util/Set;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "f", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "g", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/SetsKt")
/* renamed from: ny5 */
/* compiled from: Sets.kt */
public class ny5 extends my5 {
    /* renamed from: e */
    public static final <T> Set<T> m49095e() {
        return EmptySet.INSTANCE;
    }

    /* renamed from: f */
    public static final <T> LinkedHashSet<T> m49096f(T... tArr) {
        vx2.m53591g(tArr, "elements");
        return (LinkedHashSet) ArraysKt___ArraysKt.m47283i0(tArr, new LinkedHashSet(ao3.m31893e(tArr.length)));
    }

    /* renamed from: g */
    public static final <T> Set<T> m49097g(Set<? extends T> set) {
        vx2.m53591g(set, "<this>");
        int size = set.size();
        if (size == 0) {
            return m49095e();
        }
        if (size != 1) {
            return set;
        }
        return my5.m48548d(set.iterator().next());
    }

    /* renamed from: h */
    public static final <T> Set<T> m49098h(T... tArr) {
        vx2.m53591g(tArr, "elements");
        if (tArr.length > 0) {
            return ArraysKt___ArraysKt.m47250D0(tArr);
        }
        return m49095e();
    }
}
