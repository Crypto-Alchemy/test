package zendesk.messaging.p026ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;

/* renamed from: zendesk.messaging.ui.SystemMessageView */
public class SystemMessageView extends LinearLayout implements Updatable<State> {
    private TextView systemMessage;

    /* renamed from: zendesk.messaging.ui.SystemMessageView$State */
    public static class State {
        /* access modifiers changed from: private */
        public final MessagingCellProps props;
        private final String text;

        public State(MessagingCellProps messagingCellProps, String str) {
            this.props = messagingCellProps;
            this.text = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            State state = (State) obj;
            String str = this.text;
            if (str == null ? state.text != null : !str.equals(state.text)) {
                return false;
            }
            MessagingCellProps messagingCellProps = this.props;
            MessagingCellProps messagingCellProps2 = state.props;
            if (messagingCellProps != null) {
                return messagingCellProps.equals(messagingCellProps2);
            }
            if (messagingCellProps2 == null) {
                return true;
            }
            return false;
        }

        public String getText() {
            return this.text;
        }

        public int hashCode() {
            int i;
            String str = this.text;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            MessagingCellProps messagingCellProps = this.props;
            if (messagingCellProps != null) {
                i2 = messagingCellProps.hashCode();
            }
            return i3 + i2;
        }
    }

    public SystemMessageView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setOrientation(1);
        View.inflate(getContext(), R$layout.zui_view_system_message, this);
        this.systemMessage = (TextView) findViewById(R$id.zui_system_message_text);
    }

    public void update(State state) {
        state.props.apply(this);
        this.systemMessage.setText(state.getText());
    }

    public SystemMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SystemMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
