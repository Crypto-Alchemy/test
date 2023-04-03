package java8.util.stream;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java8.util.concurrent.C6042a;
import java8.util.concurrent.CountedCompleter;
import java8.util.stream.C6068d;

public final class ForEachOps {

    /* renamed from: java8.util.stream.ForEachOps$a */
    public static abstract class C6056a<T> implements ym6<T, Void>, C6095h, sd6 {

        /* renamed from: a */
        public final boolean f30388a;

        /* renamed from: java8.util.stream.ForEachOps$a$a */
        public static final class C6057a<T> extends C6056a<T> {

            /* renamed from: b */
            public final xq0<? super T> f30389b;

            public C6057a(xq0<? super T> xq0, boolean z) {
                super(z);
                this.f30389b = xq0;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo44323a(C6087f fVar, z66 z66) {
                return super.mo44323a(fVar, z66);
            }

            public void accept(T t) {
                this.f30389b.accept(t);
            }

            /* renamed from: d */
            public /* bridge */ /* synthetic */ Object mo44325d(C6087f fVar, z66 z66) {
                return super.mo44325d(fVar, z66);
            }

            public /* bridge */ /* synthetic */ Object get() {
                return super.get();
            }
        }

        public C6056a(boolean z) {
            this.f30388a = z;
        }

        /* renamed from: c */
        public int mo44324c() {
            if (this.f30388a) {
                return 0;
            }
            return StreamOpFlag.NOT_ORDERED;
        }

        /* renamed from: e */
        public void mo44326e(long j) {
        }

        public void end() {
        }

        /* renamed from: f */
        public boolean mo44328f() {
            return false;
        }

        /* renamed from: g */
        public <S> Void mo44325d(C6087f<T> fVar, z66<S> z66) {
            if (this.f30388a) {
                new ForEachOrderedTask(fVar, z66, this).invoke();
                return null;
            }
            new ForEachTask(fVar, z66, fVar.mo44355i(this)).invoke();
            return null;
        }

        /* renamed from: h */
        public <S> Void mo44323a(C6087f<T> fVar, z66<S> z66) {
            return ((C6056a) fVar.mo44354h(this, z66)).get();
        }

        /* renamed from: i */
        public Void get() {
            return null;
        }
    }

    /* renamed from: a */
    public static <T> ym6<T, Void> m46310a(xq0<? super T> xq0, boolean z) {
        kf4.m47057e(xq0);
        return new C6056a.C6057a(xq0, z);
    }

    public static final class ForEachTask<S, T> extends CountedCompleter<Void> {
        private final C6087f<T> helper;
        private final C6095h<S> sink;
        private z66<S> spliterator;
        private long targetSize;

        public ForEachTask(C6087f<T> fVar, z66<S> z66, C6095h<S> hVar) {
            super((CountedCompleter<?>) null);
            this.sink = hVar;
            this.helper = fVar;
            this.spliterator = z66;
            this.targetSize = 0;
        }

        public void compute() {
            z66<S> trySplit;
            z66<S> z66 = this.spliterator;
            long estimateSize = z66.estimateSize();
            long j = this.targetSize;
            if (j == 0) {
                j = AbstractTask.suggestTargetSize(estimateSize);
                this.targetSize = j;
            }
            boolean isKnown = StreamOpFlag.SHORT_CIRCUIT.isKnown(this.helper.mo44353f());
            boolean z = false;
            C6095h<S> hVar = this.sink;
            ForEachTask forEachTask = this;
            while (true) {
                if (isKnown && hVar.mo44328f()) {
                    break;
                } else if (estimateSize <= j || (trySplit = z66.trySplit()) == null) {
                    forEachTask.helper.mo44351d(hVar, z66);
                } else {
                    ForEachTask forEachTask2 = new ForEachTask(forEachTask, trySplit);
                    forEachTask.addToPendingCount(1);
                    if (z) {
                        z66 = trySplit;
                    } else {
                        ForEachTask forEachTask3 = forEachTask;
                        forEachTask = forEachTask2;
                        forEachTask2 = forEachTask3;
                    }
                    z = !z;
                    forEachTask.fork();
                    forEachTask = forEachTask2;
                    estimateSize = z66.estimateSize();
                }
            }
            forEachTask.helper.mo44351d(hVar, z66);
            forEachTask.spliterator = null;
            forEachTask.propagateCompletion();
        }

        public ForEachTask(ForEachTask<S, T> forEachTask, z66<S> z66) {
            super(forEachTask);
            this.spliterator = z66;
            this.sink = forEachTask.sink;
            this.targetSize = forEachTask.targetSize;
            this.helper = forEachTask.helper;
        }
    }

    public static final class ForEachOrderedTask<S, T> extends CountedCompleter<Void> {
        private final C6095h<T> action;
        private final ConcurrentMap<ForEachOrderedTask<S, T>, ForEachOrderedTask<S, T>> completionMap;
        private final C6087f<T> helper;
        private final ForEachOrderedTask<S, T> leftPredecessor;
        private C6068d<T> node;
        private z66<S> spliterator;
        private final long targetSize;

        public ForEachOrderedTask(C6087f<T> fVar, z66<S> z66, C6095h<T> hVar) {
            super((CountedCompleter<?>) null);
            this.helper = fVar;
            this.spliterator = z66;
            this.targetSize = AbstractTask.suggestTargetSize(z66.estimateSize());
            this.completionMap = new ConcurrentHashMap(Math.max(16, AbstractTask.getLeafTarget() << 1), 0.75f, C6042a.m46246n() + 1);
            this.action = hVar;
            this.leftPredecessor = null;
        }

        /* renamed from: k */
        public static <S, T> void m46311k(ForEachOrderedTask<S, T> forEachOrderedTask) {
            z66<S> trySplit;
            z66<S> z66 = forEachOrderedTask.spliterator;
            long j = forEachOrderedTask.targetSize;
            boolean z = false;
            while (z66.estimateSize() > j && (trySplit = z66.trySplit()) != null) {
                ForEachOrderedTask<S, T> forEachOrderedTask2 = new ForEachOrderedTask<>(forEachOrderedTask, trySplit, forEachOrderedTask.leftPredecessor);
                ForEachOrderedTask<S, T> forEachOrderedTask3 = new ForEachOrderedTask<>(forEachOrderedTask, z66, forEachOrderedTask2);
                forEachOrderedTask.addToPendingCount(1);
                forEachOrderedTask3.addToPendingCount(1);
                forEachOrderedTask.completionMap.put(forEachOrderedTask2, forEachOrderedTask3);
                if (forEachOrderedTask.leftPredecessor != null) {
                    forEachOrderedTask2.addToPendingCount(1);
                    if (forEachOrderedTask.completionMap.replace(forEachOrderedTask.leftPredecessor, forEachOrderedTask, forEachOrderedTask2)) {
                        forEachOrderedTask.addToPendingCount(-1);
                    } else {
                        forEachOrderedTask2.addToPendingCount(-1);
                    }
                }
                if (z) {
                    z66 = trySplit;
                    forEachOrderedTask = forEachOrderedTask2;
                    forEachOrderedTask2 = forEachOrderedTask3;
                } else {
                    forEachOrderedTask = forEachOrderedTask3;
                }
                z = !z;
                forEachOrderedTask2.fork();
            }
            if (forEachOrderedTask.getPendingCount() > 0) {
                kw2 a = C6067c.m46366a();
                C6087f<T> fVar = forEachOrderedTask.helper;
                forEachOrderedTask.node = ((C6068d.C6069a) forEachOrderedTask.helper.mo44354h(fVar.mo44377g(fVar.mo44352e(z66), a), z66)).build();
                forEachOrderedTask.spliterator = null;
            }
            forEachOrderedTask.tryComplete();
        }

        public static /* synthetic */ Object[] lambda$doCompute$80(int i) {
            return new Object[i];
        }

        public final void compute() {
            m46311k(this);
        }

        public void onCompletion(CountedCompleter<?> countedCompleter) {
            C6068d<T> dVar = this.node;
            if (dVar != null) {
                dVar.mo44368c(this.action);
                this.node = null;
            } else {
                z66<S> z66 = this.spliterator;
                if (z66 != null) {
                    this.helper.mo44354h(this.action, z66);
                    this.spliterator = null;
                }
            }
            ForEachOrderedTask remove = this.completionMap.remove(this);
            if (remove != null) {
                remove.tryComplete();
            }
        }

        public ForEachOrderedTask(ForEachOrderedTask<S, T> forEachOrderedTask, z66<S> z66, ForEachOrderedTask<S, T> forEachOrderedTask2) {
            super(forEachOrderedTask);
            this.helper = forEachOrderedTask.helper;
            this.spliterator = z66;
            this.targetSize = forEachOrderedTask.targetSize;
            this.completionMap = forEachOrderedTask.completionMap;
            this.action = forEachOrderedTask.action;
            this.leftPredecessor = forEachOrderedTask2;
        }
    }
}
