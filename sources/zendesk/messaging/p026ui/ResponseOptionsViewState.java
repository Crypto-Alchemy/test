package zendesk.messaging.p026ui;

import java.util.List;
import zendesk.messaging.MessagingItem;

/* renamed from: zendesk.messaging.ui.ResponseOptionsViewState */
class ResponseOptionsViewState {
    private final ResponseOptionHandler listener;
    private final List<MessagingItem.Option> options;
    private final MessagingCellProps props;

    public ResponseOptionsViewState(List<MessagingItem.Option> list, ResponseOptionHandler responseOptionHandler, MessagingCellProps messagingCellProps) {
        this.options = list;
        this.listener = responseOptionHandler;
        this.props = messagingCellProps;
    }

    public ResponseOptionHandler getListener() {
        return this.listener;
    }

    public List<MessagingItem.Option> getOptions() {
        return this.options;
    }

    public MessagingCellProps getProps() {
        return this.props;
    }
}
