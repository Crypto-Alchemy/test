package p000;

import java8.util.stream.Collector;

/* renamed from: ha6 */
/* compiled from: Stream */
public interface ha6<T> {
    /* renamed from: a */
    ha6<T> mo43114a(ju4<? super T> ju4);

    /* renamed from: b */
    <R> ha6<R> mo43115b(ld2<? super T, ? extends R> ld2);

    /* renamed from: c */
    <R, A> R mo43116c(Collector<? super T, A, R> collector);
}
