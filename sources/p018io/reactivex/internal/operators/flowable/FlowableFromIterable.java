package p018io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import p018io.reactivex.internal.subscriptions.BasicQueueSubscription;
import p018io.reactivex.internal.subscriptions.EmptySubscription;
import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFromIterable */
public final class FlowableFromIterable<T> extends g52<T> {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFromIterable$BaseRangeSubscription */
    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        public volatile boolean cancelled;

        /* renamed from: it */
        public Iterator<? extends T> f30026it;
        public boolean once;

        public BaseRangeSubscription(Iterator<? extends T> it) {
            this.f30026it = it;
        }

        public final void cancel() {
            this.cancelled = true;
        }

        public final void clear() {
            this.f30026it = null;
        }

        public abstract void fastPath();

        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f30026it;
            if (it == null || !it.hasNext()) {
                return true;
            }
            return false;
        }

        public final T poll() {
            Iterator<? extends T> it = this.f30026it;
            if (it == null) {
                return null;
            }
            if (!this.once) {
                this.once = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return af4.m31828d(this.f30026it.next(), "Iterator.next() returned a null value");
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && C3866ax.m32276a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j);
                }
            }
        }

        public final int requestFusion(int i) {
            return i & 1;
        }

        public abstract void slowPath(long j);
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFromIterable$IteratorConditionalSubscription */
    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        public final mo0<? super T> downstream;

        public IteratorConditionalSubscription(mo0<? super T> mo0, Iterator<? extends T> it) {
            super(it);
            this.downstream = mo0;
        }

        public void fastPath() {
            Iterator<? extends T> it = this.f30026it;
            mo0<? super T> mo0 = this.downstream;
            while (!this.cancelled) {
                try {
                    Object next = it.next();
                    if (!this.cancelled) {
                        if (next == null) {
                            mo0.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        mo0.mo43464b(next);
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.cancelled) {
                                        mo0.onComplete();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                ou1.m49570a(th);
                                mo0.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    ou1.m49570a(th2);
                    mo0.onError(th2);
                    return;
                }
            }
        }

        public void slowPath(long j) {
            Iterator<? extends T> it = this.f30026it;
            mo0<? super T> mo0 = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    } else if (!this.cancelled) {
                        try {
                            Object next = it.next();
                            if (!this.cancelled) {
                                if (next == null) {
                                    mo0.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                boolean b = mo0.mo43464b(next);
                                if (!this.cancelled) {
                                    try {
                                        if (!it.hasNext()) {
                                            if (!this.cancelled) {
                                                mo0.onComplete();
                                                return;
                                            }
                                            return;
                                        } else if (b) {
                                            j2++;
                                        }
                                    } catch (Throwable th) {
                                        ou1.m49570a(th);
                                        mo0.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            ou1.m49570a(th2);
                            mo0.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFromIterable$IteratorSubscription */
    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {
        private static final long serialVersionUID = -6022804456014692607L;
        public final nc6<? super T> downstream;

        public IteratorSubscription(nc6<? super T> nc6, Iterator<? extends T> it) {
            super(it);
            this.downstream = nc6;
        }

        public void fastPath() {
            Iterator<? extends T> it = this.f30026it;
            nc6<? super T> nc6 = this.downstream;
            while (!this.cancelled) {
                try {
                    Object next = it.next();
                    if (!this.cancelled) {
                        if (next == null) {
                            nc6.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        nc6.onNext(next);
                        if (!this.cancelled) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.cancelled) {
                                        nc6.onComplete();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                ou1.m49570a(th);
                                nc6.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    ou1.m49570a(th2);
                    nc6.onError(th2);
                    return;
                }
            }
        }

        public void slowPath(long j) {
            Iterator<? extends T> it = this.f30026it;
            nc6<? super T> nc6 = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    } else if (!this.cancelled) {
                        try {
                            Object next = it.next();
                            if (!this.cancelled) {
                                if (next == null) {
                                    nc6.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                nc6.onNext(next);
                                if (!this.cancelled) {
                                    try {
                                        if (it.hasNext()) {
                                            j2++;
                                        } else if (!this.cancelled) {
                                            nc6.onComplete();
                                            return;
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        ou1.m49570a(th);
                                        nc6.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            ou1.m49570a(th2);
                            nc6.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: R */
    public static <T> void m45847R(nc6<? super T> nc6, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.complete(nc6);
            } else if (nc6 instanceof mo0) {
                nc6.onSubscribe(new IteratorConditionalSubscription((mo0) nc6, it));
            } else {
                nc6.onSubscribe(new IteratorSubscription(nc6, it));
            }
        } catch (Throwable th) {
            ou1.m49570a(th);
            EmptySubscription.error(th, nc6);
        }
    }
}
