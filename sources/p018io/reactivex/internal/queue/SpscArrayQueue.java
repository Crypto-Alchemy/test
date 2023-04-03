package p018io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: io.reactivex.internal.queue.SpscArrayQueue */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements r26<E> {

    /* renamed from: a */
    public static final Integer f30046a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    public final AtomicLong consumerIndex = new AtomicLong();
    public final int lookAheadStep;
    public final int mask = (length() - 1);
    public final AtomicLong producerIndex = new AtomicLong();
    public long producerLookAhead;

    public SpscArrayQueue(int i) {
        super(tt4.m52441a(i));
        this.lookAheadStep = Math.min(i / 4, f30046a.intValue());
    }

    public int calcElementOffset(long j) {
        return ((int) j) & this.mask;
    }

    public int calcElementOffset(long j, int i) {
        return ((int) j) & i;
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        if (this.producerIndex.get() == this.consumerIndex.get()) {
            return true;
        }
        return false;
    }

    public E lvElement(int i) {
        return get(i);
    }

    public boolean offer(E e) {
        if (e != null) {
            int i = this.mask;
            long j = this.producerIndex.get();
            int calcElementOffset = calcElementOffset(j, i);
            if (j >= this.producerLookAhead) {
                long j2 = ((long) this.lookAheadStep) + j;
                if (lvElement(calcElementOffset(j2, i)) == null) {
                    this.producerLookAhead = j2;
                } else if (lvElement(calcElementOffset) != null) {
                    return false;
                }
            }
            soElement(calcElementOffset, e);
            soProducerIndex(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E poll() {
        long j = this.consumerIndex.get();
        int calcElementOffset = calcElementOffset(j);
        E lvElement = lvElement(calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soConsumerIndex(j + 1);
        soElement(calcElementOffset, (Object) null);
        return lvElement;
    }

    public void soConsumerIndex(long j) {
        this.consumerIndex.lazySet(j);
    }

    public void soElement(int i, E e) {
        lazySet(i, e);
    }

    public void soProducerIndex(long j) {
        this.producerIndex.lazySet(j);
    }

    public boolean offer(E e, E e2) {
        return offer(e) && offer(e2);
    }
}
