package zendesk.core;

abstract class PassThroughErrorZendeskCallback<E> extends op7<E> {
    private final op7 callback;

    public PassThroughErrorZendeskCallback(op7 op7) {
        this.callback = op7;
    }

    public void onError(hr1 hr1) {
        op7 op7 = this.callback;
        if (op7 != null) {
            op7.onError(hr1);
        }
    }

    public abstract void onSuccess(E e);
}
