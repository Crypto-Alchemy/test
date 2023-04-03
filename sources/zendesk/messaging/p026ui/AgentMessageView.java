package zendesk.messaging.p026ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import zendesk.messaging.R$color;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;

/* renamed from: zendesk.messaging.ui.AgentMessageView */
public class AgentMessageView extends LinearLayout implements Updatable<State> {
    private AvatarView avatarView;
    private View botLabel;
    private View labelContainer;
    private TextView labelField;
    private TextView textField;

    /* renamed from: zendesk.messaging.ui.AgentMessageView$State */
    public static class State {
        private final AvatarState avatarState;
        private final AvatarStateRenderer avatarStateRenderer;
        private final boolean isBot;
        private final String label;
        private final String message;
        private final MessagingCellProps props;

        public State(MessagingCellProps messagingCellProps, String str, String str2, boolean z, AvatarState avatarState2, AvatarStateRenderer avatarStateRenderer2) {
            this.props = messagingCellProps;
            this.message = str;
            this.label = str2;
            this.isBot = z;
            this.avatarState = avatarState2;
            this.avatarStateRenderer = avatarStateRenderer2;
        }

        public AvatarState getAvatarState() {
            return this.avatarState;
        }

        public AvatarStateRenderer getAvatarStateRenderer() {
            return this.avatarStateRenderer;
        }

        public String getLabel() {
            return this.label;
        }

        public String getMessage() {
            return this.message;
        }

        public MessagingCellProps getProps() {
            return this.props;
        }

        public boolean isBot() {
            return this.isBot;
        }
    }

    public AgentMessageView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setOrientation(0);
        View.inflate(getContext(), R$layout.zui_view_text_response_content, this);
        setClickable(false);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.avatarView = (AvatarView) findViewById(R$id.zui_agent_message_avatar);
        this.textField = (TextView) findViewById(R$id.zui_agent_message_cell_text_field);
        this.labelContainer = findViewById(R$id.zui_cell_status_view);
        this.labelField = (TextView) findViewById(R$id.zui_cell_label_text_field);
        this.botLabel = findViewById(R$id.zui_cell_label_supplementary_label);
        this.labelField.setTextColor(k37.m75278b(R$color.zui_text_color_dark_secondary, getContext()));
        this.textField.setTextColor(k37.m75278b(R$color.zui_text_color_dark_primary, getContext()));
    }

    public void update(State state) {
        this.textField.setText(state.getMessage());
        this.textField.requestLayout();
        this.labelField.setText(state.getLabel());
        this.botLabel.setVisibility(state.isBot() ? 0 : 8);
        state.getAvatarStateRenderer().render(state.getAvatarState(), this.avatarView);
        state.getProps().apply(this, this.labelContainer, this.avatarView);
    }

    public AgentMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public AgentMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
