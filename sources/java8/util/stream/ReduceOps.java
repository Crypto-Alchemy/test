package java8.util.stream;

import java8.util.concurrent.CountedCompleter;
import java8.util.stream.Collector;

public final class ReduceOps {

    public static final class ReduceTask<P_IN, P_OUT, R, S extends C6060c<P_OUT, R, S>> extends AbstractTask<P_IN, P_OUT, S, ReduceTask<P_IN, P_OUT, R, S>> {

        /* renamed from: op */
        private final C6062e<P_OUT, R, S> f30390op;

        public ReduceTask(C6062e<P_OUT, R, S> eVar, C6087f<P_OUT> fVar, z66<P_IN> z66) {
            super(fVar, z66);
            this.f30390op = eVar;
        }

        public void onCompletion(CountedCompleter<?> countedCompleter) {
            if (!isLeaf()) {
                C6060c cVar = (C6060c) ((ReduceTask) this.leftChild).getLocalResult();
                cVar.mo44337b((C6060c) ((ReduceTask) this.rightChild).getLocalResult());
                setLocalResult(cVar);
            }
            super.onCompletion(countedCompleter);
        }

        public S doLeaf() {
            return (C6060c) this.helper.mo44354h(this.f30390op.mo44334b(), this.spliterator);
        }

        public ReduceTask<P_IN, P_OUT, R, S> makeChild(z66<P_IN> z66) {
            return new ReduceTask<>(this, z66);
        }

        public ReduceTask(ReduceTask<P_IN, P_OUT, R, S> reduceTask, z66<P_IN> z66) {
            super(reduceTask, z66);
            this.f30390op = reduceTask.f30390op;
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$a */
    public static class C6058a extends C6062e<T, I, C6059b> {

        /* renamed from: b */
        public final /* synthetic */ k10 f30391b;

        /* renamed from: c */
        public final /* synthetic */ b10 f30392c;

        /* renamed from: d */
        public final /* synthetic */ sd6 f30393d;

        /* renamed from: e */
        public final /* synthetic */ Collector f30394e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6058a(StreamShape streamShape, k10 k10, b10 b10, sd6 sd6, Collector collector) {
            super(streamShape);
            this.f30391b = k10;
            this.f30392c = b10;
            this.f30393d = sd6;
            this.f30394e = collector;
        }

        /* renamed from: c */
        public int mo44324c() {
            if (this.f30394e.characteristics().contains(Collector.Characteristics.UNORDERED)) {
                return StreamOpFlag.NOT_ORDERED;
            }
            return 0;
        }

        /* renamed from: e */
        public C6059b mo44334b() {
            return new C6059b(this.f30393d, this.f30392c, this.f30391b);
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$b */
    public class C6059b extends C6061d<I> implements C6060c<T, I, C6059b> {

        /* renamed from: b */
        public final /* synthetic */ sd6 f30395b;

        /* renamed from: c */
        public final /* synthetic */ b10 f30396c;

        /* renamed from: d */
        public final /* synthetic */ k10 f30397d;

        public C6059b(sd6 sd6, b10 b10, k10 k10) {
            this.f30395b = sd6;
            this.f30396c = b10;
            this.f30397d = k10;
        }

        /* renamed from: a */
        public void mo44337b(C6059b bVar) {
            this.f30398a = this.f30397d.apply(this.f30398a, bVar.f30398a);
        }

        public void accept(T t) {
            this.f30396c.accept(this.f30398a, t);
        }

        /* renamed from: e */
        public void mo44326e(long j) {
            this.f30398a = this.f30395b.get();
        }

        public void end() {
        }

        /* renamed from: f */
        public boolean mo44328f() {
            return false;
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$c */
    public interface C6060c<T, R, K extends C6060c<T, R, K>> extends C6095h, sd6 {
        /* renamed from: b */
        void mo44337b(K k);
    }

    /* renamed from: java8.util.stream.ReduceOps$d */
    public static abstract class C6061d<U> {

        /* renamed from: a */
        public U f30398a;

        public U get() {
            return this.f30398a;
        }
    }

    /* renamed from: java8.util.stream.ReduceOps$e */
    public static abstract class C6062e<T, R, S extends C6060c<T, R, S>> implements ym6<T, R> {

        /* renamed from: a */
        public final StreamShape f30399a;

        public C6062e(StreamShape streamShape) {
            this.f30399a = streamShape;
        }

        /* renamed from: a */
        public <P_IN> R mo44323a(C6087f<T> fVar, z66<P_IN> z66) {
            return ((C6060c) fVar.mo44354h(mo44334b(), z66)).get();
        }

        /* renamed from: b */
        public abstract S mo44334b();

        /* renamed from: d */
        public <P_IN> R mo44325d(C6087f<T> fVar, z66<P_IN> z66) {
            return ((C6060c) new ReduceTask(this, fVar, z66).invoke()).get();
        }
    }

    /* renamed from: a */
    public static <T, I> ym6<T, I> m46322a(Collector<? super T, I, ?> collector) {
        sd6 supplier = ((Collector) kf4.m47057e(collector)).supplier();
        b10<I, ? super T> accumulator = collector.accumulator();
        return new C6058a(StreamShape.REFERENCE, collector.combiner(), accumulator, supplier, collector);
    }
}
