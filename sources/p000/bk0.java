package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0006\u0010\t\u001a\u00020\bH\u0001\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001\u001a3\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\r\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo44877d2 = {"T", "element", "", "e", "(Ljava/lang/Object;)Ljava/util/List;", "E", "", "c", "", "capacity", "d", "builder", "a", "", "", "isVarargs", "", "b", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/CollectionsKt")
/* renamed from: bk0 */
/* compiled from: CollectionsJVM.kt */
public class bk0 {
    /* renamed from: a */
    public static final <E> List<E> m32594a(List<E> list) {
        vx2.m53591g(list, "builder");
        return ((ListBuilder) list).build();
    }

    /* renamed from: b */
    public static final <T> Object[] m32595b(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        vx2.m53591g(tArr, "<this>");
        if (z && vx2.m53586b(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        vx2.m53590f(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: c */
    public static final <E> List<E> m32596c() {
        return new ListBuilder();
    }

    /* renamed from: d */
    public static final <E> List<E> m32597d(int i) {
        return new ListBuilder(i);
    }

    /* renamed from: e */
    public static final <T> List<T> m32598e(T t) {
        List<T> singletonList = Collections.singletonList(t);
        vx2.m53590f(singletonList, "singletonList(element)");
        return singletonList;
    }
}
