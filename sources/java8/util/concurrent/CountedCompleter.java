package java8.util.concurrent;

import sun.misc.Unsafe;

public abstract class CountedCompleter<T> extends ForkJoinTask<T> {

    /* renamed from: r */
    public static final Unsafe f30325r;

    /* renamed from: s */
    public static final long f30326s;
    private static final long serialVersionUID = 5232453752276485070L;
    public final CountedCompleter<?> completer;
    public volatile int pending;

    static {
        Unsafe unsafe = n47.f31967a;
        f30325r = unsafe;
        try {
            f30326s = unsafe.objectFieldOffset(CountedCompleter.class.getDeclaredField("pending"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public CountedCompleter(CountedCompleter<?> countedCompleter, int i) {
        this.completer = countedCompleter;
        this.pending = i;
    }

    public final void addToPendingCount(int i) {
        Unsafe unsafe;
        long j;
        int i2;
        do {
            unsafe = f30325r;
            j = f30326s;
            i2 = this.pending;
        } while (!unsafe.compareAndSwapInt(this, j, i2, i2 + i));
    }

    public final boolean compareAndSetPendingCount(int i, int i2) {
        return f30325r.compareAndSwapInt(this, f30326s, i, i2);
    }

    public void complete(T t) {
        setRawResult(t);
        onCompletion(this);
        quietlyComplete();
        CountedCompleter<?> countedCompleter = this.completer;
        if (countedCompleter != null) {
            countedCompleter.tryComplete();
        }
    }

    public abstract void compute();

    public final int decrementPendingCountUnlessZero() {
        int i;
        do {
            i = this.pending;
            if (i == 0) {
                break;
            }
        } while (!f30325r.compareAndSwapInt(this, f30326s, i, i - 1));
        return i;
    }

    public final boolean exec() {
        compute();
        return false;
    }

    public final CountedCompleter<?> firstComplete() {
        int i;
        do {
            i = this.pending;
            if (i == 0) {
                return this;
            }
        } while (!f30325r.compareAndSwapInt(this, f30326s, i, i - 1));
        return null;
    }

    public final CountedCompleter<?> getCompleter() {
        return this.completer;
    }

    public final int getPendingCount() {
        return this.pending;
    }

    public T getRawResult() {
        return null;
    }

    public final CountedCompleter<?> getRoot() {
        CountedCompleter<?> countedCompleter = this;
        while (true) {
            CountedCompleter<?> countedCompleter2 = countedCompleter.completer;
            if (countedCompleter2 == null) {
                return countedCompleter;
            }
            countedCompleter = countedCompleter2;
        }
    }

    public final void helpComplete(int i) {
        if (i > 0 && this.status >= 0) {
            Thread currentThread = Thread.currentThread();
            if (currentThread instanceof C6052b) {
                C6052b bVar = (C6052b) currentThread;
                bVar.f30382a.mo44265r(bVar.f30383d, this, i);
                return;
            }
            C6042a.f30338I.mo44256i(this, i);
        }
    }

    public void internalPropagateException(Throwable th) {
        CountedCompleter<?> countedCompleter;
        CountedCompleter<?> countedCompleter2 = this;
        CountedCompleter countedCompleter3 = countedCompleter2;
        while (countedCompleter2.onExceptionalCompletion(th, countedCompleter3) && (countedCompleter = countedCompleter2.completer) != null && countedCompleter.status >= 0 && countedCompleter.recordExceptionalCompletion(th) == Integer.MIN_VALUE) {
            CountedCompleter<?> countedCompleter4 = countedCompleter;
            countedCompleter3 = countedCompleter2;
            countedCompleter2 = countedCompleter4;
        }
    }

    public final CountedCompleter<?> nextComplete() {
        CountedCompleter<?> countedCompleter = this.completer;
        if (countedCompleter != null) {
            return countedCompleter.firstComplete();
        }
        quietlyComplete();
        return null;
    }

    public void onCompletion(CountedCompleter<?> countedCompleter) {
    }

    public boolean onExceptionalCompletion(Throwable th, CountedCompleter<?> countedCompleter) {
        return true;
    }

    public final void propagateCompletion() {
        CountedCompleter<?> countedCompleter = this;
        while (true) {
            int i = countedCompleter.pending;
            if (i == 0) {
                CountedCompleter<?> countedCompleter2 = countedCompleter.completer;
                if (countedCompleter2 == null) {
                    countedCompleter.quietlyComplete();
                    return;
                }
                countedCompleter = countedCompleter2;
            } else {
                if (f30325r.compareAndSwapInt(countedCompleter, f30326s, i, i - 1)) {
                    return;
                }
            }
        }
    }

    public final void quietlyCompleteRoot() {
        CountedCompleter<?> countedCompleter = this;
        while (true) {
            CountedCompleter<?> countedCompleter2 = countedCompleter.completer;
            if (countedCompleter2 == null) {
                countedCompleter.quietlyComplete();
                return;
            }
            countedCompleter = countedCompleter2;
        }
    }

    public final void setPendingCount(int i) {
        this.pending = i;
    }

    public void setRawResult(T t) {
    }

    public final void tryComplete() {
        CountedCompleter<?> countedCompleter = this;
        CountedCompleter countedCompleter2 = countedCompleter;
        while (true) {
            int i = countedCompleter.pending;
            if (i == 0) {
                countedCompleter.onCompletion(countedCompleter2);
                CountedCompleter<?> countedCompleter3 = countedCompleter.completer;
                if (countedCompleter3 == null) {
                    countedCompleter.quietlyComplete();
                    return;
                } else {
                    countedCompleter2 = countedCompleter;
                    countedCompleter = countedCompleter3;
                }
            } else {
                if (f30325r.compareAndSwapInt(countedCompleter, f30326s, i, i - 1)) {
                    return;
                }
            }
        }
    }

    public CountedCompleter(CountedCompleter<?> countedCompleter) {
        this.completer = countedCompleter;
    }

    public CountedCompleter() {
        this.completer = null;
    }
}
