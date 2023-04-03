package zendesk.support.guide;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class AggregatedCallback<T> extends op7<T> {
    private final Set<sk5<T>> callbackSet = Collections.synchronizedSet(new HashSet());

    public boolean add(op7<T> op7) {
        boolean isEmpty = this.callbackSet.isEmpty();
        this.callbackSet.add(sk5.m51823a(op7));
        return isEmpty;
    }

    public void cancel() {
        for (sk5<T> cancel : this.callbackSet) {
            cancel.cancel();
        }
        this.callbackSet.clear();
    }

    public void onError(hr1 hr1) {
        for (sk5<T> onError : this.callbackSet) {
            onError.onError(hr1);
        }
        this.callbackSet.clear();
    }

    public void onSuccess(T t) {
        for (sk5<T> onSuccess : this.callbackSet) {
            onSuccess.onSuccess(t);
        }
        this.callbackSet.clear();
    }
}
