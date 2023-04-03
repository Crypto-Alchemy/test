package java8.util.stream;

import java8.util.concurrent.C6042a;
import java8.util.concurrent.C6052b;
import java8.util.concurrent.CountedCompleter;
import java8.util.stream.AbstractTask;

abstract class AbstractTask<P_IN, P_OUT, R, K extends AbstractTask<P_IN, P_OUT, R, K>> extends CountedCompleter<R> {

    /* renamed from: x */
    public static final int f30386x = (C6042a.m46246n() << 2);
    public final C6087f<P_OUT> helper;
    public K leftChild;
    private R localResult;
    public K rightChild;
    public z66<P_IN> spliterator;
    public long targetSize;

    public AbstractTask(C6087f<P_OUT> fVar, z66<P_IN> z66) {
        super((CountedCompleter<?>) null);
        this.helper = fVar;
        this.spliterator = z66;
        this.targetSize = 0;
    }

    public static int getLeafTarget() {
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C6052b) {
            return ((C6052b) currentThread).mo44301b().mo44264o() << 2;
        }
        return f30386x;
    }

    public static long suggestTargetSize(long j) {
        long leafTarget = j / ((long) getLeafTarget());
        if (leafTarget > 0) {
            return leafTarget;
        }
        return 1;
    }

    public void compute() {
        z66<P_IN> trySplit;
        z66<P_IN> z66 = this.spliterator;
        long estimateSize = z66.estimateSize();
        long targetSize2 = getTargetSize(estimateSize);
        boolean z = false;
        K k = this;
        while (estimateSize > targetSize2 && (trySplit = z66.trySplit()) != null) {
            K makeChild = k.makeChild(trySplit);
            k.leftChild = makeChild;
            K makeChild2 = k.makeChild(z66);
            k.rightChild = makeChild2;
            k.setPendingCount(1);
            if (z) {
                z66 = trySplit;
                k = makeChild;
                makeChild = makeChild2;
            } else {
                k = makeChild2;
            }
            z = !z;
            makeChild.fork();
            estimateSize = z66.estimateSize();
        }
        k.setLocalResult(k.doLeaf());
        k.tryComplete();
    }

    public abstract R doLeaf();

    public R getLocalResult() {
        return this.localResult;
    }

    public K getParent() {
        return (AbstractTask) getCompleter();
    }

    public R getRawResult() {
        return this.localResult;
    }

    public final long getTargetSize(long j) {
        long j2 = this.targetSize;
        if (j2 != 0) {
            return j2;
        }
        long suggestTargetSize = suggestTargetSize(j);
        this.targetSize = suggestTargetSize;
        return suggestTargetSize;
    }

    public boolean isLeaf() {
        if (this.leftChild == null) {
            return true;
        }
        return false;
    }

    public boolean isLeftmostNode() {
        AbstractTask abstractTask = this;
        while (abstractTask != null) {
            AbstractTask parent = abstractTask.getParent();
            if (parent != null && parent.leftChild != abstractTask) {
                return false;
            }
            abstractTask = parent;
        }
        return true;
    }

    public boolean isRoot() {
        if (getParent() == null) {
            return true;
        }
        return false;
    }

    public abstract K makeChild(z66<P_IN> z66);

    public void onCompletion(CountedCompleter<?> countedCompleter) {
        this.spliterator = null;
        this.rightChild = null;
        this.leftChild = null;
    }

    public void setLocalResult(R r) {
        this.localResult = r;
    }

    public void setRawResult(R r) {
        if (r != null) {
            throw new IllegalStateException();
        }
    }

    public AbstractTask(K k, z66<P_IN> z66) {
        super(k);
        this.spliterator = z66;
        this.helper = k.helper;
        this.targetSize = k.targetSize;
    }
}
