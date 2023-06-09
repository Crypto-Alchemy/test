package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a7\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00102\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\t\u001a\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000\u001aG\u0010\u001a\u001a\u00020\u0017\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\b\u0010\u0011\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\b\u0010 \u001a\u00020\u001dH\u0001\u001a\b\u0010!\u001a\u00020\u001dH\u0001\"\u0019\u0010%\u001a\u00020\"*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010$\"!\u0010(\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, mo44877d2 = {"T", "", "", "g", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "j", "elements", "m", "([Ljava/lang/Object;)Ljava/util/List;", "", "p", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "f", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "n", "(Ljava/lang/Object;)Ljava/util/List;", "o", "q", "", "", "fromIndex", "toIndex", "h", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "size", "Lr37;", "r", "(III)V", "t", "s", "Lrw2;", "k", "(Ljava/util/Collection;)Lrw2;", "indices", "l", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/CollectionsKt")
/* renamed from: ck0 */
/* compiled from: Collections.kt */
public class ck0 extends bk0 {
    /* renamed from: f */
    public static final <T> ArrayList<T> m33058f(T... tArr) {
        vx2.m53591g(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C3906bq(tArr, true));
    }

    /* renamed from: g */
    public static final <T> Collection<T> m33059g(T[] tArr) {
        vx2.m53591g(tArr, "<this>");
        return new C3906bq(tArr, false);
    }

    /* renamed from: h */
    public static final <T extends Comparable<? super T>> int m33060h(List<? extends T> list, T t, int i, int i2) {
        vx2.m53591g(list, "<this>");
        m33070r(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int a = xl0.m54426a((Comparable) list.get(i4), t);
            if (a < 0) {
                i = i4 + 1;
            } else if (a <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: i */
    public static /* synthetic */ int m33061i(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m33060h(list, comparable, i, i2);
    }

    /* renamed from: j */
    public static final <T> List<T> m33062j() {
        return EmptyList.INSTANCE;
    }

    /* renamed from: k */
    public static final rw2 m33063k(Collection<?> collection) {
        vx2.m53591g(collection, "<this>");
        return new rw2(0, collection.size() - 1);
    }

    /* renamed from: l */
    public static final <T> int m33064l(List<? extends T> list) {
        vx2.m53591g(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: m */
    public static final <T> List<T> m33065m(T... tArr) {
        vx2.m53591g(tArr, "elements");
        if (tArr.length > 0) {
            return C6706xq.m54490d(tArr);
        }
        return m33062j();
    }

    /* renamed from: n */
    public static final <T> List<T> m33066n(T t) {
        if (t != null) {
            return bk0.m32598e(t);
        }
        return m33062j();
    }

    /* renamed from: o */
    public static final <T> List<T> m33067o(T... tArr) {
        vx2.m53591g(tArr, "elements");
        return ArraysKt___ArraysKt.m47253F(tArr);
    }

    /* renamed from: p */
    public static final <T> List<T> m33068p(T... tArr) {
        vx2.m53591g(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C3906bq(tArr, true));
    }

    /* renamed from: q */
    public static final <T> List<T> m33069q(List<? extends T> list) {
        vx2.m53591g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return m33062j();
        }
        if (size != 1) {
            return list;
        }
        return bk0.m32598e(list.get(0));
    }

    /* renamed from: r */
    public static final void m33070r(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    /* renamed from: s */
    public static final void m33071s() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: t */
    public static final void m33072t() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
