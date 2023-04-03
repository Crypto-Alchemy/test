package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\u0006\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0001\u001a\"\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001¨\u0006\t"}, mo44877d2 = {"T", "", "", "v", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "default", "u", "", "w", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/CollectionsKt")
/* renamed from: dk0 */
/* compiled from: Iterables.kt */
public class dk0 extends ck0 {
    /* renamed from: u */
    public static final <T> int m43495u(Iterable<? extends T> iterable, int i) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    /* renamed from: v */
    public static final <T> Integer m43496v(Iterable<? extends T> iterable) {
        vx2.m53591g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* renamed from: w */
    public static final <T> List<T> m43497w(Iterable<? extends Iterable<? extends T>> iterable) {
        vx2.m53591g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable z : iterable) {
            hk0.m45275z(arrayList, z);
        }
        return arrayList;
    }
}
