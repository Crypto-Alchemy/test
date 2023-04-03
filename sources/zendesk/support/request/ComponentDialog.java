package zendesk.support.request;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import java.util.List;
import zendesk.support.UiUtils;
import zendesk.support.request.RetryDialog;
import zendesk.support.request.StateUi;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Listener;

class ComponentDialog implements Listener<StateUi> {
    private final Activity activity;

    /* renamed from: af */
    private final ActionFactory f46854af;
    private Dialog dialog;
    private final Dispatcher dispatcher;

    public static class OnDismissedListener implements DialogInterface.OnDismissListener {

        /* renamed from: af */
        private final ActionFactory f46855af;
        private final Dispatcher dispatcher;

        public OnDismissedListener(ActionFactory actionFactory, Dispatcher dispatcher2) {
            this.f46855af = actionFactory;
            this.dispatcher = dispatcher2;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.dispatcher.dispatch(this.f46855af.onDialogDismissed());
        }
    }

    public static class RetryDialogListener implements RetryDialog.Listener {

        /* renamed from: af */
        private final ActionFactory f46856af;
        private final Dispatcher dispatcher;

        public RetryDialogListener(ActionFactory actionFactory, Dispatcher dispatcher2) {
            this.f46856af = actionFactory;
            this.dispatcher = dispatcher2;
        }

        public void onDeleteMessage(List<StateMessage> list) {
            for (StateMessage deleteMessage : list) {
                this.dispatcher.dispatch(this.f46856af.deleteMessage(deleteMessage));
            }
        }

        public void onRetryMessage(List<StateMessage> list) {
            onDeleteMessage(list);
            for (StateMessage resendCommentAsync : list) {
                this.dispatcher.dispatch(this.f46856af.resendCommentAsync(resendCommentAsync));
                this.dispatcher.dispatch(this.f46856af.updateCommentsAsync());
            }
        }
    }

    public ComponentDialog(Activity activity2, ActionFactory actionFactory, Dispatcher dispatcher2) {
        this.activity = activity2;
        this.f46854af = actionFactory;
        this.dispatcher = dispatcher2;
    }

    private Dialog getDialogForState(StateUi.DialogState dialogState) {
        if (!(dialogState instanceof StateRetryDialog)) {
            return null;
        }
        RetryDialog retryDialog = new RetryDialog(this.activity, ((StateRetryDialog) dialogState).getMessage());
        retryDialog.setListener(new RetryDialogListener(this.f46854af, this.dispatcher));
        return retryDialog;
    }

    public void update(StateUi stateUi) {
        StateUi.DialogState dialogState = stateUi.getDialogState();
        if (dialogState != null) {
            Dialog dialog2 = this.dialog;
            if (dialog2 == null || !dialog2.isShowing()) {
                UiUtils.dismissKeyboard(this.activity);
                Dialog dialogForState = getDialogForState(dialogState);
                this.dialog = dialogForState;
                dialogForState.setOnDismissListener(new OnDismissedListener(this.f46854af, this.dispatcher));
                this.dialog.show();
            }
        }
    }
}
