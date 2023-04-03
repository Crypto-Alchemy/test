package java8.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java8.util.stream.Collector;

/* renamed from: java8.util.stream.b */
/* compiled from: Collectors */
public final class C6065b {

    /* renamed from: a */
    public static final Set<Collector.Characteristics> f30419a;

    /* renamed from: b */
    public static final Set<Collector.Characteristics> f30420b;

    /* renamed from: c */
    public static final Set<Collector.Characteristics> f30421c;

    /* renamed from: d */
    public static final Set<Collector.Characteristics> f30422d;

    /* renamed from: e */
    public static final Set<Collector.Characteristics> f30423e = Collections.emptySet();

    /* renamed from: f */
    public static final Set<Collector.Characteristics> f30424f;

    /* renamed from: g */
    public static final sd6<oi1> f30425g = mk0.m48332a();

    /* renamed from: h */
    public static final sd6<ww2> f30426h = nk0.m48813a();

    /* renamed from: i */
    public static final sd6<il3> f30427i = ok0.m49340a();

    /* renamed from: j */
    public static final ld2<Map<?, ?>, Map<?, ?>> f30428j = pk0.m49978a();

    /* renamed from: k */
    public static final b10<List<Object>, ?> f30429k = qk0.m50612a();

    /* renamed from: l */
    public static final b10<Set<Object>, ?> f30430l = rk0.m51111a();

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        f30419a = Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        f30420b = Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        f30421c = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        f30422d = Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        f30424f = Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    /* renamed from: a */
    public static <T> sd6<List<T>> m46360a() {
        return lk0.m47830a();
    }

    /* renamed from: d */
    public static final <T> b10<List<T>, T> m46363d() {
        return f30429k;
    }

    /* renamed from: e */
    public static <T> Collector<T, ?, List<T>> m46364e() {
        return new C6066a(m46360a(), m46363d(), sk0.m51815a(), f30421c);
    }

    /* renamed from: java8.util.stream.b$a */
    /* compiled from: Collectors */
    public static class C6066a<T, A, R> implements Collector<T, A, R> {

        /* renamed from: a */
        public final sd6<A> f30431a;

        /* renamed from: b */
        public final b10<A, T> f30432b;

        /* renamed from: c */
        public final k10<A> f30433c;

        /* renamed from: d */
        public final ld2<A, R> f30434d;

        /* renamed from: e */
        public final Set<Collector.Characteristics> f30435e;

        public C6066a(sd6<A> sd6, b10<A, T> b10, k10<A> k10, ld2<A, R> ld2, Set<Collector.Characteristics> set) {
            this.f30431a = sd6;
            this.f30432b = b10;
            this.f30433c = k10;
            this.f30434d = ld2;
            this.f30435e = set;
        }

        /* renamed from: a */
        public static /* synthetic */ Object m46365a(Object obj) {
            return obj;
        }

        public b10<A, T> accumulator() {
            return this.f30432b;
        }

        public Set<Collector.Characteristics> characteristics() {
            return this.f30435e;
        }

        public k10<A> combiner() {
            return this.f30433c;
        }

        public ld2<A, R> finisher() {
            return this.f30434d;
        }

        public sd6<A> supplier() {
            return this.f30431a;
        }

        public C6066a(sd6<A> sd6, b10<A, T> b10, k10<A> k10, Set<Collector.Characteristics> set) {
            this(sd6, b10, k10, tk0.m52342a(), set);
        }
    }
}
