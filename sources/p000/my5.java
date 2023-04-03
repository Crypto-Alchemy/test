package p000;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.builders.SetBuilder;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0006\u0010\t\u001a\u00020\bH\u0001\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001¨\u0006\r"}, mo44877d2 = {"T", "element", "", "d", "(Ljava/lang/Object;)Ljava/util/Set;", "E", "", "b", "", "capacity", "c", "builder", "a", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/SetsKt")
/* renamed from: my5 */
/* compiled from: SetsJVM.kt */
public class my5 {
    /* renamed from: a */
    public static final <E> Set<E> m48545a(Set<E> set) {
        vx2.m53591g(set, "builder");
        return ((SetBuilder) set).build();
    }

    /* renamed from: b */
    public static final <E> Set<E> m48546b() {
        return new SetBuilder();
    }

    /* renamed from: c */
    public static final <E> Set<E> m48547c(int i) {
        return new SetBuilder(i);
    }

    /* renamed from: d */
    public static final <T> Set<T> m48548d(T t) {
        Set<T> singleton = Collections.singleton(t);
        vx2.m53590f(singleton, "singleton(element)");
        return singleton;
    }
}
