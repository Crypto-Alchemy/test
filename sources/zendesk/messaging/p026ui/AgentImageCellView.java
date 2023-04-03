package zendesk.messaging.p026ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import zendesk.messaging.Attachment;
import zendesk.messaging.R$dimen;
import zendesk.messaging.R$drawable;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;

/* renamed from: zendesk.messaging.ui.AgentImageCellView */
public class AgentImageCellView extends LinearLayout implements Updatable<State> {
    private AvatarView avatarView;
    private View botLabel;
    private int cornerRadius;
    private ImageView imageView;
    private View labelContainer;
    private TextView labelField;
    private final Drawable placeholder = zr0.m31442e(getContext(), R$drawable.zui_background_agent_cell);

    /* renamed from: zendesk.messaging.ui.AgentImageCellView$State */
    public static class State {
        private final AvatarState avatarState;
        private final AvatarStateRenderer avatarStateRenderer;
        private final boolean isBot;
        private final String label;
        private final Picasso picasso;
        private final MessagingCellProps props;

        public State(Picasso picasso2, MessagingCellProps messagingCellProps, Attachment attachment, String str, boolean z, AvatarState avatarState2, AvatarStateRenderer avatarStateRenderer2) {
            this.picasso = picasso2;
            this.props = messagingCellProps;
            this.label = str;
            this.isBot = z;
            this.avatarState = avatarState2;
            this.avatarStateRenderer = avatarStateRenderer2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            State state = (State) obj;
            if (isBot() != state.isBot()) {
                return false;
            }
            if (getPicasso() == null ? state.getPicasso() != null : !getPicasso().equals(state.getPicasso())) {
                return false;
            }
            if (getProps() == null ? state.getProps() != null : !getProps().equals(state.getProps())) {
                return false;
            }
            if (getLabel() == null ? state.getLabel() != null : !getLabel().equals(state.getLabel())) {
                return false;
            }
            getAttachment();
            state.getAttachment();
            if (getAvatarState() != null) {
                return getAvatarState().equals(state.getAvatarState());
            }
            if (state.getAvatarState() == null) {
                return true;
            }
            return false;
        }

        public Attachment getAttachment() {
            return null;
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

        public Picasso getPicasso() {
            return this.picasso;
        }

        public MessagingCellProps getProps() {
            return this.props;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getPicasso() != null) {
                i = getPicasso().hashCode();
            } else {
                i = 0;
            }
            int i5 = i * 31;
            if (getProps() != null) {
                i2 = getProps().hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 31;
            if (getLabel() != null) {
                i3 = getLabel().hashCode();
            } else {
                i3 = 0;
            }
            getAttachment();
            int i7 = (((((i6 + i3) * 31) + (isBot() ? 1 : 0)) * 31) + 0) * 31;
            if (getAvatarState() != null) {
                i4 = getAvatarState().hashCode();
            }
            return i7 + i4;
        }

        public boolean isBot() {
            return this.isBot;
        }
    }

    public AgentImageCellView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setOrientation(0);
        View.inflate(getContext(), R$layout.zui_view_agent_image_cell_content, this);
        this.cornerRadius = getResources().getDimensionPixelSize(R$dimen.zui_cell_bubble_corner_radius);
    }

    private void loadImageIntoImageView(State state) {
        state.getPicasso();
        state.getAttachment();
        throw null;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.avatarView = (AvatarView) findViewById(R$id.zui_agent_message_avatar);
        this.imageView = (ImageView) findViewById(R$id.zui_image_cell_image);
        this.labelContainer = findViewById(R$id.zui_cell_status_view);
        this.labelField = (TextView) findViewById(R$id.zui_cell_label_text_field);
        this.botLabel = findViewById(R$id.zui_cell_label_supplementary_label);
    }

    public void update(final State state) {
        loadImageIntoImageView(state);
        this.labelField.setText(state.getLabel());
        this.botLabel.setVisibility(state.isBot() ? 0 : 8);
        this.imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                state.getAttachment();
                throw null;
            }
        });
        state.getAvatarStateRenderer().render(state.getAvatarState(), this.avatarView);
        state.getProps().apply(this, this.labelContainer, this.avatarView);
    }

    public AgentImageCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public AgentImageCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
