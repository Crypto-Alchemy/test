package java8.util.stream;

import java.util.Set;

public interface Collector<T, A, R> {

    public enum Characteristics {
        CONCURRENT,
        UNORDERED,
        IDENTITY_FINISH
    }

    b10<A, T> accumulator();

    Set<Characteristics> characteristics();

    k10<A> combiner();

    ld2<A, R> finisher();

    sd6<A> supplier();
}
