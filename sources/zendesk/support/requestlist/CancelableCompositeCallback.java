package zendesk.support.requestlist;

import java.util.HashSet;
import java.util.Set;

class CancelableCompositeCallback {
    private Set<sk5> zendeskCallbacks = new HashSet();

    public void add(sk5... sk5Arr) {
        for (sk5 add : sk5Arr) {
            add(add);
        }
    }

    public void cancel() {
        for (sk5 cancel : this.zendeskCallbacks) {
            cancel.cancel();
        }
        this.zendeskCallbacks.clear();
    }

    public void add(sk5 sk5) {
        this.zendeskCallbacks.add(sk5);
    }
}
