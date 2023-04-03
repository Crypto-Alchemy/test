package zendesk.messaging.p026ui;

import android.view.View;
import zendesk.messaging.p026ui.Updatable;

/* renamed from: zendesk.messaging.ui.MessagingCell */
class MessagingCell<T, V extends View & Updatable<T>> {

    /* renamed from: id */
    private final String f46815id;
    private final int layoutRes;
    private final T state;
    private final Class<V> viewClassType;

    public MessagingCell(String str, T t, int i, Class<V> cls) {
        this.f46815id = str;
        this.state = t;
        this.layoutRes = i;
        this.viewClassType = cls;
    }

    public boolean areContentsTheSame(MessagingCell messagingCell) {
        if (!getId().equals(messagingCell.getId()) || !messagingCell.state.equals(this.state)) {
            return false;
        }
        return true;
    }

    public void bind(V v) {
        ((Updatable) v).update(this.state);
    }

    public String getId() {
        return this.f46815id;
    }

    public int getLayoutRes() {
        return this.layoutRes;
    }

    public Class<V> getViewClassType() {
        return this.viewClassType;
    }
}
