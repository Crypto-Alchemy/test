package p000;

import build.IgnoreJava8API;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

@IgnoreJava8API
/* renamed from: wb1 */
/* compiled from: DelegatingSpliterator */
public final class wb1<T> implements z66<T> {

    /* renamed from: a */
    public final Spliterator<T> f35283a;

    /* renamed from: wb1$a */
    /* compiled from: DelegatingSpliterator */
    public static final class C6653a<T> implements Consumer<T> {

        /* renamed from: a */
        public final xq0<T> f35284a;

        /* renamed from: wb1$a$a */
        /* compiled from: DelegatingSpliterator */
        public class C6654a implements xq0<T> {

            /* renamed from: a */
            public final /* synthetic */ Consumer f35285a;

            public C6654a(Consumer consumer) {
                this.f35285a = consumer;
            }

            public void accept(T t) {
                this.f35285a.accept(t);
            }
        }

        public C6653a(xq0<T> xq0) {
            kf4.m47057e(xq0);
            this.f35284a = xq0;
        }

        public void accept(T t) {
            this.f35284a.accept(t);
        }

        @IgnoreJava8API
        public Consumer<T> andThen(Consumer<? super T> consumer) {
            kf4.m47057e(consumer);
            return new C6653a(ar0.m31909a(this.f35284a, new C6654a(consumer)));
        }
    }

    public wb1(Spliterator<T> spliterator) {
        kf4.m47057e(spliterator);
        this.f35283a = spliterator;
    }

    /* renamed from: a */
    public void mo29473a(xq0<? super T> xq0) {
        this.f35283a.forEachRemaining(new C6653a(xq0));
    }

    /* renamed from: c */
    public boolean mo29474c(xq0<? super T> xq0) {
        return this.f35283a.tryAdvance(new C6653a(xq0));
    }

    public int characteristics() {
        return this.f35283a.characteristics();
    }

    public long estimateSize() {
        return this.f35283a.estimateSize();
    }

    public Comparator<? super T> getComparator() {
        return this.f35283a.getComparator();
    }

    public long getExactSizeIfKnown() {
        return this.f35283a.getExactSizeIfKnown();
    }

    public boolean hasCharacteristics(int i) {
        return this.f35283a.hasCharacteristics(i);
    }

    public z66<T> trySplit() {
        Spliterator<T> trySplit = this.f35283a.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new wb1(trySplit);
    }
}
