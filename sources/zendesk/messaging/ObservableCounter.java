package zendesk.messaging;

import java.util.concurrent.atomic.AtomicInteger;

class ObservableCounter {
    private final AtomicInteger counter = new AtomicInteger();
    private final OnCountCompletedListener onCountCompletedListener;

    public interface OnCountCompletedListener {
    }

    public ObservableCounter(OnCountCompletedListener onCountCompletedListener2) {
        this.onCountCompletedListener = onCountCompletedListener2;
    }

    public void increment(int i) {
        this.counter.addAndGet(i);
    }
}
