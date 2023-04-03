package zendesk.messaging.p026ui;

import java.util.List;
import zendesk.messaging.AgentDetails;
import zendesk.messaging.AttachmentSettings;
import zendesk.messaging.ConnectionState;
import zendesk.messaging.MessagingItem;

/* renamed from: zendesk.messaging.ui.MessagingState */
public class MessagingState {
    public final AttachmentSettings attachmentSettings;
    public final ConnectionState connectionState;
    public final boolean enabled;
    public final String hint;
    public final int keyboardInputType;
    public final List<MessagingItem> messagingItems;
    public final boolean progressBarVisible;
    public final TypingState typingState;

    /* renamed from: zendesk.messaging.ui.MessagingState$TypingState */
    public static class TypingState {
        private final AgentDetails agentDetails;
        private final boolean isTyping;

        public TypingState(boolean z) {
            this(z, (AgentDetails) null);
        }

        public AgentDetails getAgentDetails() {
            return this.agentDetails;
        }

        public boolean isTyping() {
            return this.isTyping;
        }

        public TypingState(boolean z, AgentDetails agentDetails2) {
            this.isTyping = z;
            this.agentDetails = agentDetails2;
        }
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    private MessagingState(List<MessagingItem> list, boolean z, boolean z2, TypingState typingState2, ConnectionState connectionState2, String str, AttachmentSettings attachmentSettings2, int i) {
        this.messagingItems = list;
        this.progressBarVisible = z;
        this.enabled = z2;
        this.typingState = typingState2;
        this.connectionState = connectionState2;
        this.hint = str;
        this.attachmentSettings = attachmentSettings2;
        this.keyboardInputType = i;
    }

    /* renamed from: zendesk.messaging.ui.MessagingState$Builder */
    public static class Builder {
        private AttachmentSettings attachmentSettings;
        private ConnectionState connectionState = ConnectionState.DISCONNECTED;
        private boolean enabled;
        private String hint;
        private int keyboardInputType = 131073;
        private List<MessagingItem> messagingItems;
        private boolean progressBarVisible;
        private TypingState typingState = new TypingState(false);

        public Builder() {
        }

        public MessagingState build() {
            return new MessagingState(kj0.m47114e(this.messagingItems), this.progressBarVisible, this.enabled, this.typingState, this.connectionState, this.hint, this.attachmentSettings, this.keyboardInputType);
        }

        public Builder withAttachmentSettings(AttachmentSettings attachmentSettings2) {
            this.attachmentSettings = attachmentSettings2;
            return this;
        }

        public Builder withComposerHint(String str) {
            this.hint = str;
            return this;
        }

        public Builder withConnectionState(ConnectionState connectionState2) {
            this.connectionState = connectionState2;
            return this;
        }

        public Builder withEnabled(boolean z) {
            this.enabled = z;
            return this;
        }

        public Builder withKeyboardInputType(int i) {
            this.keyboardInputType = i;
            return this;
        }

        public Builder withMessagingItems(List<MessagingItem> list) {
            this.messagingItems = list;
            return this;
        }

        public Builder withTypingIndicatorState(TypingState typingState2) {
            this.typingState = typingState2;
            return this;
        }

        public Builder(MessagingState messagingState) {
            this.messagingItems = messagingState.messagingItems;
            this.enabled = messagingState.enabled;
            this.typingState = messagingState.typingState;
            this.connectionState = messagingState.connectionState;
            this.hint = messagingState.hint;
            this.attachmentSettings = messagingState.attachmentSettings;
            this.keyboardInputType = messagingState.keyboardInputType;
        }
    }
}
