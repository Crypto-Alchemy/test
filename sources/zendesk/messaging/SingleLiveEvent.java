package zendesk.messaging;

import com.zendesk.logger.Logger;
import java.util.concurrent.atomic.AtomicBoolean;

class SingleLiveEvent<T> extends k04<T> {
    /* access modifiers changed from: private */
    public final AtomicBoolean pending = new AtomicBoolean(false);

    public void observe(ug3 ug3, final pf4<? super T> pf4) {
        if (hasActiveObservers()) {
            Logger.m43087k("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.", new Object[0]);
        }
        super.observe(ug3, new pf4<T>() {
            public void onChanged(T t) {
                if (SingleLiveEvent.this.pending.compareAndSet(true, false)) {
                    pf4.onChanged(t);
                }
            }
        });
    }

    public void setValue(T t) {
        this.pending.set(true);
        super.setValue(t);
    }
}
